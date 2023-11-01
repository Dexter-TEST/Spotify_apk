package com.spotify.liteplayer.player.PlayerService;
import android.app.Service;
import p.fn0;
import android.content.Intent;
import android.os.IBinder;
import p.eo5;
import p.gk4;
import android.content.Context;
import p.of5;
import java.lang.String;
import p.lo;
import java.lang.CharSequence;
import p.sj4;
import android.content.pm.PackageManager;
import p.vv7;
import android.app.PendingIntent;
import android.app.Notification;
import p.p54;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.vs3;
import java.lang.Object;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import android.os.Build$VERSION;

public class PlayerService extends Service	// class@000958 from classes.dex
{
    public final fn0 a;
    public rf5 b;
    public of5 c;
    public gk4 t;

    public void PlayerService(){
       super();
       this.a = new fn0();
    }
    public final IBinder onBind(Intent p0){
       return null;
    }
    public final void onCreate(){
       eo5.r(this);
       super.onCreate();
       this.t = new gk4(this);
       of5 oof5 = new of5(this, 0);
       this.c = oof5;
       lo.b(oof5.a, "channel_id_playback_v2", 2, R.string.player_notification_channel, 0x7f1202af, false);
       of5 a = oof5.a;
       oof5 = oof5.c;
       oof5.d(a.getText(R.string.player_notification_waiting_to_connect));
       oof5.g = PendingIntent.getActivity(a, 0, a.getPackageManager().getLaunchIntentForPackage(a.getPackageName()), vv7.d(0));
       this.startForeground(R.id.player_notification, oof5.b());
       this.a.c(Observable.merge(this.b.e(), this.b.f()).throttleLatest(100, TimeUnit.MILLISECONDS, s36.b, true).subscribe(new vs3(23, this)));
    }
    public final void onDestroy(){
       this.a.dispose();
       if (Build$VERSION.SDK_INT >= 24) {
          this.stopForeground(1);
       }else {
          this.stopForeground(1);
       }
       super.onDestroy();
       return;
    }
    public final int onStartCommand(Intent p0,int p1,int p2){
       return 2;
    }
    public final boolean onUnbind(Intent p0){
       return super.onUnbind(p0);
    }
}
