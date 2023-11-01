package com.spotify.litenavigation.deeplink.DeepLinkActivity;
import androidx.appcompat.app.a;
import p.fn0;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.Context;
import java.lang.String;
import android.os.Parcelable;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import android.os.Bundle;
import android.app.Activity;
import p.eo5;
import androidx.fragment.app.k;
import p.en3;
import p.km3;
import java.lang.Object;
import java.util.Objects;
import p.ao3;
import p.mp;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Boolean;
import p.ws3;
import p.yf2;
import p.id;
import p.mx6;
import p.f61;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fp6;
import java.lang.Class;
import p.ap6;
import p.wo6;
import p.ep6;
import p.wf2;

public class DeepLinkActivity extends a	// class@000941 from classes.dex
{
    public g61 Q;
    public ap3 R;
    public e60 S;
    public final fn0 T;
    public static final int U;

    public void DeepLinkActivity(){
       super();
       this.T = new fn0();
    }
    public final void C(Intent p0){
       Intent launchIntent;
       if ((launchIntent = this.getPackageManager().getLaunchIntentForPackage(this.getPackageName())) == null) {
          throw new IllegalStateException("No launcher activity found for "+this.getPackageName());
       }
       this.startActivity(launchIntent.putExtra("android.intent.extra.INTENT", p0).addFlags(0x8000));
       return;
    }
    public final void onCreate(Bundle p0){
       eo5.q(this);
       super.onCreate(p0);
    }
    public final void onDestroy(){
       this.T.dispose();
       super.onDestroy();
    }
    public final void onStart(){
       super.onStart();
       DeepLinkActivity tQ = this.Q;
       km3 a = tQ.b.a;
       Objects.requireNonNull(a);
       this.T.c(Single.fromCallable(new ao3(a, 2)).subscribeOn(s36.c).subscribeOn(tQ.c).onErrorReturnItem(Boolean.FALSE).observeOn(tQ.d).map(new ws3(tQ, this.getIntent(), this, 3)).observeOn(id.a()).onErrorResumeNext(new mx6(21, this)).subscribe(new f61(this, 0), new f61(this, 1)));
       tQ = this.S;
       tQ.getClass();
       fp6 a1 = tQ.a;
       a1.getClass();
       a1.a(new wo6(a1, this, null, this.getIntent()));
    }
}
