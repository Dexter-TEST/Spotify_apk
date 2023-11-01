package com.spotify.litelyrics.lyrics.widget.LyricsWidgetPresenter;
import p.dk3;
import p.hy3;
import p.b7;
import p.kz6;
import io.reactivex.rxjava3.core.Scheduler;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import io.reactivex.rxjava3.core.Flowable;
import p.cy3;
import p.px3;
import p.al5;
import p.ac;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.fn0;
import p.e63;
import p.t00;
import java.lang.Boolean;
import java.util.concurrent.TimeUnit;
import p.o82;
import p.mz3;
import p.yf2;
import p.i72;
import android.animation.AnimatorSet;
import android.animation.Animator;
import p.ad6;
import android.widget.TextView;
import android.view.View;
import android.animation.ObjectAnimator;
import p.tu6;
import p.xw3;
import p.wf2;
import p.vv7;
import android.widget.LinearLayout;
import p.yw3;
import p.dg1;
import android.animation.TimeInterpolator;
import p.jz3;
import com.spotify.litelyrics.lyrics.widget.BackgroundTinter;
import com.spotify.litelyrics.lyrics.widget.a;
import android.animation.ArgbEvaluator;
import java.lang.Integer;
import android.animation.TypeEvaluator;
import java.util.Arrays;
import android.widget.Button;
import p.g54;
import com.spotify.litelyrics.lyrics.views.LyricsNotTimesyncedIndicatorView;
import p.yn6;
import p.uw3;
import p.ww3;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import io.reactivex.rxjava3.core.Observable;
import p.kz3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ry7;
import com.spotify.litelyrics.lyrics.views.TouchBlockingFrameLayout;
import java.lang.Class;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import p.hs0;
import java.util.Objects;
import p.k72;
import p.fv1;
import p.b5;
import p.v67;
import p.lz3;
import java.util.HashSet;
import p.sb4;
import p.cu;
import p.k8;
import android.view.View$OnClickListener;

public final class LyricsWidgetPresenter implements dk3	// class@00093f from classes.dex
{
    public final al5 A;
    public final ac B;
    public final fn0 C;
    public final fn0 D;
    public AnimatorSet E;
    public AnimatorSet F;
    public AnimatorSet G;
    public gi3 H;
    public final t00 I;
    public wu J;
    public boolean K;
    public ad6 L;
    public vk7 M;
    public final t00 N;
    public final t00 O;
    public final t00 P;
    public final t00 Q;
    public final i72 R;
    public final hy3 a;
    public final b7 b;
    public final Observable c;
    public final Scheduler t;
    public final xx3 v;
    public final on4 w;
    public final Flowable x;
    public final cy3 y;
    public final px3 z;

    public void LyricsWidgetPresenter(hy3 p0,b7 p1,kz6 p2,Scheduler p3,NowPlayingActivity p4,NowPlayingActivity p5,Flowable p6,cy3 p7,px3 p8,al5 p9,ac p10){
       co5.o(p4, "lyricsLoaderOwner");
       co5.o(p5, "mobiusOwner");
       co5.o(p9, "productState");
       co5.o(p10, "eventSender");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
       this.z = p8;
       this.A = p9;
       this.B = p10;
       this.C = new fn0();
       this.D = new fn0();
       this.H = e63.v;
       this.I = t00.a();
       Boolean fALSE = Boolean.FALSE;
       this.N = t00.b(fALSE);
       this.O = t00.b(fALSE);
       this.P = t00.b(fALSE);
       this.Q = t00.b(fALSE);
       this.R = Flowable.n(3, TimeUnit.SECONDS).w(new mz3(this, 0)).g();
    }
    public static final void b(LyricsWidgetPresenter p0){
       LyricsWidgetPresenter g;
       LyricsWidgetPresenter l;
       LyricsWidgetPresenter l2;
       LyricsWidgetPresenter lyricsWidget = p0;
       if (p0.g()) {
          if ((g = lyricsWidget.G) != null) {
             g.cancel();
          }
          AnimatorSet uAnimatorSet = new AnimatorSet();
          int i = 4;
          Animator[] uAnimatorArr = new Animator[i];
          if ((l = lyricsWidget.L) != null) {
             ad6 l1 = l.l;
             String str = "views.lyricsWidgetHeader";
             co5.l(l1, str);
             int i1 = 2;
             ObjectAnimator objectAnimat = tu6.n(l1, i, i1);
             uAnimatorArr[0] = objectAnimat;
             if ((l2 = lyricsWidget.L) != null) {
                ad6 uoad6 = l2.l;
                co5.l(uoad6, str);
                float[] uofloatArray = new float[i1];
                uofloatArray[0] = uoad6.getTranslationY();
                uofloatArray[1] = (float)uoad6.getHeight();
                objectAnimat = ObjectAnimator.ofFloat(uoad6, "translationY", uofloatArray);
                objectAnimat.setDuration(500);
                String str1 = "views";
                long l3 = 500;
                xw3 str2 = new xw3(objectAnimat, 500, uoad6, 4);
                vv7.D(objectAnimat, str);
                uAnimatorArr[1] = objectAnimat;
                if ((l2 = lyricsWidget.L) != null) {
                   ad6 k = l2.k;
                   str = "views.lyricsWidgetContainer";
                   co5.l(k, str);
                   uAnimatorArr[i1] = tu6.n(k, 8, i1);
                   if ((l2 = lyricsWidget.L) != null) {
                      k = l2.k;
                      co5.l(k, str);
                      k.setPivotY(0);
                      float[] uofloatArray1 = new float[i1];
                      uofloatArray1[0] = k.getScaleY();
                      uofloatArray1[1] = 0;
                      ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(k, "scaleY", uofloatArray1);
                      objectAnimat1.setDuration(l3);
                      vv7.D(objectAnimat1, new yw3(k.getPivotY(), 8, k));
                      uAnimatorArr[3] = objectAnimat1;
                      uAnimatorSet.playTogether(uAnimatorArr);
                      uAnimatorSet.setInterpolator(dg1.b);
                      uAnimatorSet.setDuration(l3);
                      vv7.E(uAnimatorSet, new jz3(lyricsWidget, 0));
                      uAnimatorSet.start();
                      lyricsWidget.G = uAnimatorSet;
                   }else {
                      co5.N(str1);
                      throw null;
                   }
                }else {
                   co5.N(str1);
                   throw null;
                }
             }else {
                co5.N("views");
                throw null;
             }
          }else {
             co5.N("views");
             throw null;
          }
       }
       lyricsWidget.H = e63.y;
       return;
    }
    public static ObjectAnimator c(View p0,int p1){
       BackgroundTinter uBackgroundT = a.a(p0);
       Object[] objArray = new Object[]{Integer.valueOf(uBackgroundT.b),Integer.valueOf(p1)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofObject(uBackgroundT, "tint", new ArgbEvaluator(), objArray);
       co5.l(objectAnimat, "ofObject\(\n            ba…           tint\n        \)");
       return objectAnimat;
    }
    public static ObjectAnimator d(TextView p0,int p1){
       Object[] objArray = new Object[]{Integer.valueOf(p0.getCurrentTextColor()),Integer.valueOf(p1)};
       return ObjectAnimator.ofObject(p0, "textColor", new ArgbEvaluator(), objArray);
    }
    public final void e(Animator[] p0){
       LyricsWidgetPresenter tF;
       if ((tF = this.F) != null) {
          tF.cancel();
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.playTogether(Arrays.copyOf(p0, p0.length));
       uAnimatorSet.start();
       this.F = uAnimatorSet;
       return;
    }
    public final void f(int p0,int p1){
       LyricsWidgetPresenter tE;
       LyricsWidgetPresenter tL;
       LyricsWidgetPresenter tL1;
       g54 a;
       LyricsWidgetPresenter tL2;
       LyricsWidgetPresenter tL3;
       String str = "views.lyricsWidgetHeader";
       String str1 = "views.lyricsWidgetButton";
       if (this.g()) {
          if ((tE = this.E) != null) {
             tE.cancel();
          }
          AnimatorSet uAnimatorSet = new AnimatorSet();
          uAnimatorSet.setDuration(1000);
          Animator[] uAnimatorArr = new Animator[5];
          if ((tL = this.L) != null) {
             ad6 j = tL.j;
             co5.l(j, str1);
             ObjectAnimator objectAnimat = LyricsWidgetPresenter.d(j, p1);
             uAnimatorArr[0] = objectAnimat;
             if ((tL1 = this.L) != null) {
                ad6 l = tL1.l;
                co5.l(l, str);
                uAnimatorArr[1] = LyricsWidgetPresenter.d(l, p1);
                if ((tL1 = this.L) != null) {
                   a = tL1.g.a;
                   co5.l(a, "views.lyricsNotTimesyncedIndicator.root");
                   ObjectAnimator objectAnimat1 = LyricsWidgetPresenter.d(a, p1);
                   uAnimatorArr[2] = objectAnimat1;
                   if ((tL2 = this.L) != null) {
                      ad6 l1 = tL2.l;
                      co5.l(l1, str);
                      uAnimatorArr[3] = LyricsWidgetPresenter.c(l1, p0);
                      if ((tL2 = this.L) != null) {
                         l1 = tL2.k;
                         co5.l(l1, "views.lyricsWidgetContainer");
                         ObjectAnimator objectAnimat2 = LyricsWidgetPresenter.c(l1, p0);
                         uAnimatorArr[4] = objectAnimat2;
                         uAnimatorSet.playTogether(uAnimatorArr);
                         uAnimatorSet.start();
                         this.E = uAnimatorSet;
                      }else {
                         co5.N("views");
                         throw null;
                      }
                   }else {
                      co5.N("views");
                      throw null;
                   }
                }else {
                   co5.N("views");
                   throw null;
                }
             }else {
                co5.N("views");
                throw null;
             }
          }else {
             co5.N("views");
             throw null;
          }
       }else if((tE = this.L) != null){
          ad6 k = tE.k;
          co5.l(k, "views.lyricsWidgetContainer");
          a.a(k).setTint(p0);
          if ((tE = this.L) != null) {
             k = tE.l;
             co5.l(k, str);
             a.a(k).setTint(p0);
             if ((tE = this.L) != null) {
                k = tE.j;
                co5.l(k, str1);
                a.a(k).setTint(p0);
                if ((tL3 = this.L) != null) {
                   tL3.l.setTextColor(p1);
                   if ((tL3 = this.L) != null) {
                      tL3.j.setTextColor(p1);
                      if ((tL3 = this.L) != null) {
                         tL3.g.a.setTextColor(p1);
                      }else {
                         co5.N("views");
                         throw null;
                      }
                   }else {
                      co5.N("views");
                      throw null;
                   }
                }else {
                   co5.N("views");
                   throw null;
                }
             }else {
                co5.N("views");
                throw null;
             }
          }else {
             co5.N("views");
             throw null;
          }
       }else {
          co5.N("views");
          throw null;
       }
       return;
    }
    public final boolean g(){
       LyricsWidgetPresenter tL;
       if ((tL = this.L) != null) {
          ad6 k = tL.k;
          co5.l(k, "views.lyricsWidgetContainer");
          boolean b = (!k.getVisibility())? true: false;
          return b;
       }else {
          co5.N("views");
          throw false;
       }
    }
    public final void h(){
       LyricsWidgetPresenter tG;
       if (!this.g()) {
          if ((tG = this.G) != null) {
             tG.cancel();
          }
          AnimatorSet uAnimatorSet = new AnimatorSet();
          Animator[] uAnimatorArr = new Animator[4];
          LyricsWidgetPresenter tL = this.L;
          void ovoid = null;
          String str = "views";
          if (tL != null) {
             ad6 l = tL.l;
             String str1 = "views.lyricsWidgetHeader";
             co5.l(l, str1);
             uAnimatorArr[0] = tu6.e(l);
             if ((tL = this.L) != null) {
                l = tL.l;
                co5.l(l, str1);
                int i = 2;
                float[] uofloatArray = new float[i];
                int i1 = (!l.getVisibility())? 1: 0;
                float translationY = (i1)? l.getTranslationY(): (float)l.getHeight();
                uofloatArray[0] = translationY;
                i1 = 0;
                uofloatArray[1] = i1;
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(l, "translationY", uofloatArray);
                co5.l(objectAnimat, "slideInUp$lambda$11$lambda$10");
                vv7.E(objectAnimat, new yn6(objectAnimat, 500, l));
                uAnimatorArr[1] = objectAnimat;
                if ((tL = this.L) != null) {
                   l = tL.k;
                   co5.l(l, "views.lyricsWidgetContainer");
                   uAnimatorArr[i] = tu6.e(l);
                   if ((tL = this.L) != null) {
                      l = tL.k;
                      co5.l(l, "views.lyricsWidgetContainer");
                      float pivotY = l.getPivotY();
                      l.setPivotY(i1);
                      float[] uofloatArray1 = new float[i];
                      i = (!l.getVisibility())? 1: 0;
                      if (i) {
                         translationY = l.getScaleY();
                      }
                      uofloatArray1[0] = translationY;
                      uofloatArray1[1] = 0x3f800000;
                      ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(l, "scaleY", uofloatArray1);
                      objectAnimat1.setDuration(500);
                      vv7.E(objectAnimat1, new uw3(l, 1));
                      vv7.D(objectAnimat1, new ww3(l, pivotY));
                      uAnimatorArr[3] = objectAnimat1;
                      uAnimatorSet.playTogether(uAnimatorArr);
                      uAnimatorSet.setInterpolator(dg1.b);
                      uAnimatorSet.setDuration(500);
                      vv7.D(uAnimatorSet, new jz3(this, 1));
                      uAnimatorSet.start();
                      this.G = uAnimatorSet;
                   }else {
                      co5.N(str);
                      throw ovoid;
                   }
                }else {
                   co5.N(str);
                   throw ovoid;
                }
             }else {
                co5.N(str);
                throw ovoid;
             }
          }else {
             co5.N(str);
             throw ovoid;
          }
       }
       return;
    }
    public final void initializeLyricsWidget(){
       LyricsWidgetPresenter tL1;
       LyricsWidgetPresenter tL = this.L;
       void ovoid = null;
       String str = "views";
       if (tL != null) {
          LyricsWidgetPresenter ta = this.a;
          tL.c.p0(ta);
          if ((tL = this.L) != null) {
             ad6 c = tL.c;
             co5.l(c, "views.lyricsContainer");
             ta.e = c;
             if ((tL = this.L) != null) {
                c = tL.c;
                boolean b = true;
                c.setVerticalFadingEdgeEnabled(b);
                c.setFadingEdgeLength(150);
                int i = 0;
                LyricsWidgetPresenter tC = this.C;
                tC.c(this.v.h0.observeOn(this.t).subscribe(new kz3(this, i), new kz3(this, b)));
                int i1 = 3;
                Disposable[] uDisposableA = new Disposable[i1];
                uDisposableA[i] = this.x.subscribe(new kz3(this, 2));
                if ((tL1 = this.L) != null) {
                   ad6 j = tL1.j;
                   co5.l(j, "views.lyricsWidgetButton");
                   uDisposableA[b] = ry7.e(j).subscribe(new kz3(this, i1));
                   if ((tL = this.L) != null) {
                      c = tL.d;
                      c.getClass();
                      Flowable uFlowable = ry7.e(c).toFlowable(BackpressureStrategy.b);
                      uFlowable.getClass();
                      fv1 j1 = co5.j;
                      Objects.requireNonNull(j1, "onRequest is null");
                      lb f = co5.f;
                      Objects.requireNonNull(f, "onCancel is null");
                      k72 ok72 = new k72(uFlowable, new hs0(7, c), j1, f);
                      v67 uFlowable1 = new v67(i, c);
                      mb g = co5.g;
                      Objects.requireNonNull(g, "onSubscribe is null");
                      uDisposableA[2] = new k72(ok72, g, j1, uFlowable1).subscribe();
                      tC.d(uDisposableA);
                      lz3 c1 = new lz3(this);
                      ta = this.w;
                      ta.o0.add(c1);
                      c1.g(ta.i0.c());
                      if ((tL = this.L) != null) {
                         tL.h.setOnClickListener(new k8(11, this));
                         return;
                      }else {
                         co5.N(str);
                         throw ovoid;
                      }
                   }else {
                      co5.N(str);
                      throw ovoid;
                   }
                }else {
                   co5.N(str);
                   throw ovoid;
                }
             }else {
                co5.N(str);
                throw ovoid;
             }
          }else {
             co5.N(str);
             throw ovoid;
          }
       }else {
          co5.N(str);
          throw ovoid;
       }
    }
    public final void onStop(){
       this.C.e();
       this.D.e();
    }
}
