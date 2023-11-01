package com.spotify.lite.welcome.WelcomeActivity;
import p.qo7;
import p.ro7;
import p.jj4;
import androidx.appcompat.app.a;
import p.fn0;
import p.f7;
import p.fn7;
import p.c7;
import p.z6;
import p.h7;
import androidx.activity.a;
import p.i7;
import p.e7;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.View;
import p.jn7;
import android.animation.Animator$AnimatorListener;
import android.content.Intent;
import android.app.Activity;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import android.os.Parcelable;
import android.content.Context;
import p.xj0;
import android.os.Bundle;
import p.eo5;
import androidx.fragment.app.k;
import android.view.LayoutInflater;
import p.ry7;
import android.widget.Button;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.constraintlayout.widget.Guideline;
import android.widget.ImageView;
import com.spotify.legacyglue.widgetstate.ViewPagerIndicator;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import p.p25;
import p.xo7;
import p.ej7;
import p.vi7;
import p.g54;
import p.zo7;
import p.yq5;
import p.am0;
import java.lang.Runnable;
import p.bm;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.oo7;
import p.nn7;
import p.so7;
import p.b5;
import io.reactivex.rxjava3.core.Scheduler;
import p.on7;
import p.qn7;
import p.pn7;
import p.rn7;
import p.sn7;
import p.yn7;
import p.ao7;
import p.po7;
import p.ln7;
import p.ir0;
import p.un7;
import p.xn7;
import p.zn7;
import p.vo7;
import p.kn7;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.mn7;
import p.wn7;
import p.tn7;
import p.vs3;
import p.s81;
import p.vn7;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import p.mi;
import io.reactivex.rxjava3.core.ObservableSource;
import p.nv1;
import com.spotify.mobius.rx3.RxEventSources;
import p.ms3;
import p.qb4;
import p.ej5;
import p.zq6;
import p.v14;
import com.google.common.collect.h;
import p.vp;
import p.br6;
import p.lw;
import p.sb4;
import p.j;
import p.dn7;
import android.content.res.Resources;
import java.lang.NullPointerException;
import p.kz6;
import p.en7;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import p.s36;
import p.id;
import p.j8;
import p.ia3;
import p.rn6;
import p.tn6;
import com.android.installreferrer.api.InstallReferrerClient;
import p.ui3;
import p.na3;
import com.android.installreferrer.api.InstallReferrerStateListener;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.an5;
import p.ym6;
import p.rz;

public class WelcomeActivity extends a implements qo7, ro7, jj4	// class@000921 from classes.dex
{
    public g54 Q;
    public so7 R;
    public s01 S;
    public pm6 T;
    public gg1 U;
    public j8 V;
    public xo7 W;
    public sb4 X;
    public final fn0 Y;
    public p25 Z;
    public mm6 a0;
    public final i7 b0;
    public final i7 c0;
    public final i7 d0;
    public static final int e0;

    public void WelcomeActivity(){
       super();
       this.Y = new fn0();
       this.b0 = this.registerForActivityResult(new f7(), new fn7(this, 0));
       this.c0 = this.registerForActivityResult(new e7(2), new fn7(this, 1));
       this.d0 = this.registerForActivityResult(new f7(), new fn7(this, 2));
    }
    public static void C(ViewGroup p0){
       p0.animate().alpha(0x3f800000).setDuration(200).setListener(new jn7(p0, 0)).start();
    }
    public static void D(ViewGroup p0){
       p0.animate().alpha(0).setDuration(200).setListener(new jn7(p0, 1)).start();
    }
    public final void E(){
       Intent intent;
       if ((intent = this.getIntent()) == null) {
          intent = null;
       }else if(Build$VERSION.SDK_INT >= 33){
          intent = intent.getParcelableExtra("android.intent.extra.INTENT", Intent.class);
       }else {
          intent = intent.getParcelableExtra("android.intent.extra.INTENT");
       }
       if (intent == null) {
          intent = xj0.q(this);
       }
       this.startActivity(intent);
       this.finish();
       return;
    }
    public final void onCreate(Bundle p0){
       View view1;
       View view2;
       View view4;
       View view5;
       View view6;
       View view7;
       View view8;
       View view9;
       View view10;
       View view11;
       View view12;
       lw olw;
       a uoa = this;
       Bundle uBundle = p0;
       eo5.q(this);
       super.onCreate(p0);
       View view = this.getLayoutInflater().inflate(R.layout.welcome_activity, null, false);
       int i = 0x7f0a00bd;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a00c5;
          if ((view2 = ry7.q(view, i)) != null) {
             View view3 = view;
             i = 0x7f0a01fd;
             if ((view4 = ry7.q(view, i)) != null) {
                i = 0x7f0a01fe;
                if ((view5 = ry7.q(view, i)) != null) {
                   i = 0x7f0a0449;
                   if ((view6 = ry7.q(view, i)) != null) {
                      i = 0x7f0a04e9;
                      if ((view7 = ry7.q(view, i)) != null) {
                         i = 0x7f0a051d;
                         if ((view8 = ry7.q(view, i)) != null) {
                            i = 0x7f0a0523;
                            if ((view9 = ry7.q(view, i)) != null) {
                               i = 0x7f0a0525;
                               if ((view10 = ry7.q(view, i)) != null) {
                                  i = 0x7f0a055f;
                                  if ((view11 = ry7.q(view, i)) != null) {
                                     i = 0x7f0a0661;
                                     if ((view12 = ry7.q(view, i)) != null) {
                                        p25 view13 = new p25(view3, view1, view2, view3, view4, view5, view6, view7, view8, view9, view10, view11, view12);
                                        uoa.Z = view;
                                        uoa.setContentView(view.a);
                                        uoa.W = uoa.Q.r(uoa, xo7.class);
                                        i = 3;
                                        uoa.Z.m.setOffscreenPageLimit(i);
                                        uoa.Z.m.setAdapter(new zo7());
                                        WelcomeActivity z = uoa.Z;
                                        z.h.setupWithViewPager(z.m);
                                        if (!uBundle) {
                                           uoa.Z.l.post(new am0(20, uoa));
                                        }
                                        z = uoa.W;
                                        WelcomeActivity r = uoa.R;
                                        r.getClass();
                                        RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
                                        so7 a = r.a;
                                        subtypeEffec.b(nn7.class, new oo7(uoa, false), a);
                                        subtypeEffec.b(on7.class, new oo7(uoa, 1), a);
                                        subtypeEffec.b(qn7.class, new oo7(uoa, 2), a);
                                        subtypeEffec.b(pn7.class, new oo7(uoa, i), a);
                                        subtypeEffec.a(rn7.class, new oo7(uoa, 4));
                                        subtypeEffec.a(sn7.class, new oo7(uoa, 5));
                                        subtypeEffec.b(yn7.class, new oo7(uoa, 6), a);
                                        subtypeEffec.b(ao7.class, new oo7(uoa, 7), a);
                                        subtypeEffec.d(ln7.class, new po7(uoa, 2), a);
                                        subtypeEffec.d(un7.class, new po7(uoa, i), a);
                                        subtypeEffec.d(xn7.class, new po7(uoa, false), a);
                                        subtypeEffec.d(zn7.class, new po7(uoa, 1), a);
                                        z.getClass();
                                        subtypeEffec.g(kn7.class, new vo7(z, 1));
                                        subtypeEffec.g(mn7.class, new vo7(z, false));
                                        subtypeEffec.g(wn7.class, new vo7(z, 2));
                                        subtypeEffec.g(tn7.class, new vo7(z, i));
                                        subtypeEffec.g(vn7.class, new s81(5, new vs3(6, z)));
                                        ObservableSource[] observableSo = new ObservableSource[]{z.A};
                                        lb4 olb4 = mi.A(new bm(1), RxConnectables.a(subtypeEffec.h())).c(RxEventSources.a(observableSo)).e(ms3.h("Welcome"));
                                        ej5 uoej5 = new ej5();
                                        uoej5.r(new zq6());
                                        uoej5.g(false);
                                        uoej5.h(false);
                                        uoej5.n(false);
                                        uoej5.q(false);
                                        uoej5.p(false);
                                        uoej5.o(false);
                                        uoej5.m(false);
                                        xo7 y = z.y;
                                        uoej5.g(view7.a.contains(y));
                                        uoej5.h(xo7.e(y));
                                        if (z.t.c()) {
                                           uoej5.r(new br6(false));
                                           olw = uoej5.d();
                                        }else {
                                           uoej5.r(new zq6());
                                           uoej5.q(1);
                                           uoej5.p(1);
                                           uoej5.n(1);
                                           uoej5.o(1);
                                           olw = uoej5.d();
                                        }
                                        uoa.X = mi.g(olb4.d(new bm(1)), olw);
                                        if (uBundle) {
                                           j parcelable = (Build$VERSION.SDK_INT >= 33)? uBundle.getParcelable("WELCOME_MODEL", j.class): uBundle.getParcelable("WELCOME_MODEL");
                                           if (parcelable != null) {
                                              uoa.X.e(parcelable);
                                           }
                                        }
                                        uoa.X.a(new dn7(uoa, false));
                                        return;
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroy(){
       if (this.X.d()) {
          this.X.g();
       }
       this.X.b();
       super.onDestroy();
       return;
    }
    public final void onSaveInstanceState(Bundle p0){
       super.onSaveInstanceState(p0);
       p0.putParcelable("WELCOME_MODEL", this.X.c());
    }
    public final void onStart(){
       super.onStart();
       this.X.f();
       int i = 0;
       WelcomeActivity tY = this.Y;
       tY.c(ry7.e(this.Z.b).subscribe(new en7(this, i)));
       tY.c(ry7.e(this.Z.c).subscribe(new en7(this, 1)));
       tY.c(Observable.interval(5, TimeUnit.SECONDS, s36.b).observeOn(id.a()).subscribe(new en7(this, 2)));
       WelcomeActivity tV = this.V;
       if (tV.c.a.d(ia3.f, i)) {
       }else {
          try{
             tV.b.startConnection(tV.v.getValue());
          }catch(java.lang.SecurityException e0){
             Object[] objArray = new Object[i];
             Logger.c(e0, "Unable to start connection", objArray);
          }
       }
       tY.c(this.V.t.observeOn(id.a()).subscribe(new en7(this, 3)));
       return;
    }
    public final void onStop(){
       WelcomeActivity ta0;
       this.Y.e();
       this.X.g();
       ym6 f = this.T.f;
       int i = 3;
       if (f != null) {
          f.a(i);
       }
       if ((ta0 = this.a0) != null) {
          ta0.a(i);
       }
       ta0 = this.V;
       if (ta0.b.isReady()) {
          ta0.b.endConnection();
       }
       super.onStop();
       return;
    }
}
