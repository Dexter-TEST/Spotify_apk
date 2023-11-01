package com.spotify.liteoffline.offline.OfflineNotificationWorker;
import com.spotify.androidx.workmanager.DaggerRxWorker;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.of5;
import p.be5;
import p.ay6;
import p.wf2;
import io.reactivex.rxjava3.core.Single;
import p.m05;
import io.reactivex.rxjava3.core.Observable;
import p.ew0;
import p.ir2;
import p.bi5;
import p.hs0;
import p.ir0;
import p.mf1;
import p.yf2;
import p.gk4;
import android.app.PendingIntent;
import p.lo;
import p.sj4;
import java.lang.CharSequence;
import android.content.res.Resources;
import java.lang.Integer;
import android.app.Notification;

public final class OfflineNotificationWorker extends DaggerRxWorker	// class@000957 from classes.dex
{
    public final ay6 A;
    public ew0 x;
    public final of5 y;
    public final ay6 z;

    public void OfflineNotificationWorker(Context p0,WorkerParameters p1){
       co5.o(p0, "context");
       co5.o(p1, "parameters");
       super(p0, p1);
       this.y = new of5(p0, 1);
       this.z = new ay6(new be5(p0, 2));
       this.A = new ay6(new be5(p0, 1));
    }
    public final Single i(){
       OfflineNotificationWorker tx;
       this.j(new m05(0, 0, 0));
       if ((tx = this.x) != null) {
          Single single = tx.c().takeUntil(ir2.e0).doOnNext(new hs0(8, this)).lastOrError().map(new mf1(5, this));
          co5.l(single, "override fun doCreateWor…    }\n            }\n    }");
          return single;
       }else {
          co5.N("offlineManager");
          throw null;
       }
    }
    public final void j(m05 p0){
       Resources value = this.z.getValue();
       co5.l(value, "<get-pendingIntent>\(...\)");
       int i = (int)p0.a;
       OfflineNotificationWorker ty = this.y;
       lo.b(ty.a, "channel_id_offline", 2, R.string.offline_notification_channel, 0x7f12026c, false);
       of5 b = ty.b;
       b.f(2, true);
       b.g = value;
       of5 a = ty.a;
       b.e(a.getString(R.string.offline_notification_title));
       value = a.getResources();
       Object[] objArray = new Object[3];
       objArray[0] = Integer.valueOf(p0.c);
       p0 = p0.b;
       objArray[1] = Integer.valueOf(p0);
       objArray[2] = Integer.valueOf(i);
       b.d(value.getQuantityString(R.plurals.offline_notification_body, p0, objArray));
       b.m = 100;
       b.n = i;
       b.o = false;
       this.A.getValue().a(R.id.offline_notification, b.b());
    }
}
