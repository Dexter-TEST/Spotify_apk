package com.spotify.litenavigation.launcher.LauncherActivity;
import androidx.appcompat.app.a;
import p.fn0;
import android.content.Intent;
import android.app.Activity;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import android.os.Parcelable;
import p.aq6;
import p.td7;
import p.jl;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import p.io2;
import java.lang.StringBuilder;
import android.os.Bundle;
import p.eo5;
import androidx.fragment.app.k;
import p.mi3;
import p.ej7;
import p.vi7;
import p.g54;
import p.co3;
import p.ou4;
import p.ko1;
import p.tn6;
import p.zv6;
import io.reactivex.rxjava3.core.Single;
import p.fx6;
import p.yf2;
import io.reactivex.rxjava3.core.Maybe;
import p.mx6;
import p.jk0;
import p.km3;
import java.util.Objects;
import p.ao3;
import p.mp;
import java.util.concurrent.Callable;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.a44;
import io.reactivex.rxjava3.core.Completable;
import p.ki3;
import io.reactivex.rxjava3.disposables.Disposable;

public class LauncherActivity extends a	// class@000942 from classes.dex
{
    public g54 Q;
    public final fn0 R;
    public mi3 S;
    public static final int T;

    public void LauncherActivity(){
       super();
       this.R = new fn0();
    }
    public final Intent C(){
       Intent intent;
       Intent intent1;
       ResolveInfo resolveInfo;
       if ((intent = this.getIntent()) == null) {
          intent1 = null;
       }else {
          String str = "android.intent.extra.INTENT";
          intent1 = (Build$VERSION.SDK_INT >= 33)? intent.getParcelableExtra(str, Intent.class): intent.getParcelableExtra(str);
       }
       if (intent1 != null) {
          aq6 uoaq6 = td7.d(intent1.getDataString());
          int i = 1;
          boolean b = (uoaq6 != null)? true: false;
          Object[] objArray = new Object[]{intent1.getDataString(),intent1,intent};
          jl.i(b, "Invalid deep-link URI, %s \(%s from %s\)", objArray);
          if (uoaq6 != null) {
             if ((resolveInfo = this.getPackageManager().resolveActivity(intent1, 0)) != null && ((resolveInfo = resolveInfo.activityInfo) != null && io2.j(resolveInfo.packageName, this.getPackageName()))) {
                return intent1;
             }else {
                jl.d("Intent resolved to invalid package, \""+intent1+'"');
             }
          }
       }
       return null;
    }
    public final void onCreate(Bundle p0){
       eo5.q(this);
       super.onCreate(p0);
       this.S = this.Q.r(this, mi3.class);
    }
    public final void onStart(){
       super.onStart();
       LauncherActivity tS = this.S;
       mi3 w = tS.w;
       co3 h = w.h;
       h.getClass();
       Maybe maybe = Single.fromSupplier(new ou4(h, w.i, 1)).flatMapMaybe(new fx6(23));
       maybe.getClass();
       jk0 ojk0 = new jk0(maybe, 5, new mx6(22, tS));
       km3 a = tS.t.a;
       Objects.requireNonNull(a);
       this.R.c(ojk0.d(Single.fromCallable(new ao3(a, 2)).subscribeOn(s36.c)).flatMapCompletable(new ki3(this, 0)).subscribe());
    }
    public final void onStop(){
       this.R.e();
       super.onStop();
    }
}
