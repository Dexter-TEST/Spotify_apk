package com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;
import p.hj7;
import p.ce7;
import java.lang.Object;
import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import p.mj2;
import p.jj7;
import java.lang.Math;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.View$MeasureSpec;
import p.y2;
import p.wh7;
import p.ph4;
import android.os.Parcelable;
import p.to2;
import android.view.AbsSavedState;
import android.view.View$BaseSavedState;
import p.tu6;
import p.nq5;
import android.widget.Scroller;
import p.do5;
import android.view.animation.Interpolator;
import p.ep2;
import java.lang.Runnable;
import p.dh7;
import java.lang.ref.WeakReference;
import p.c56;
import p.a56;
import p.oi;

public abstract class HeaderBehavior extends hj7	// class@0008f7 from classes.dex
{
    public boolean c;
    public int d;
    public int e;
    public int f;
    public VelocityTracker g;
    public final ce7 h;
    public int i;
    public float j;
    public int k;
    public boolean l;

    public void HeaderBehavior(){
       super();
       this.d = -1;
       this.f = -1;
       this.h = new ce7(null);
       this.j = 0xcf000000;
    }
    public void HeaderBehavior(Context p0,AttributeSet p1){
       super(0);
       this.d = -1;
       this.f = -1;
       this.h = new ce7(null);
       this.j = 0xcf000000;
    }
    public final void A(){
       HeaderBehavior tg;
       this.c = false;
       this.d = -1;
       if ((tg = this.g) != null) {
          tg.recycle();
          this.g = null;
       }
       return;
    }
    public final int B(View p0,CoordinatorLayout p1){
       if (p1.T != null) {
          return 0;
       }
       return ((- p0.getTotalScrollRange()) - this.i);
    }
    public void C(View p0,CoordinatorLayout p1){
       hj7 ta;
       if ((ta = this.a) == null) {
          return;
       }
       ta.e = - p0.getTotalScrollRange();
       ta.f = 0;
       ta.g = true;
       return;
    }
    public boolean D(){
       boolean b = (this.w() <= ((- this.k) - this.i))? true: false;
       return b;
    }
    public final int E(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       boolean b;
       p3 = Math.max(p3, Math.min(p2, p4));
       int i = 1;
       if (p0.T != null) {
          b = (p3 > 0)? true: false;
          this.l = b;
       }
       b = this.B(p1, p0);
       this.C(p1, p0);
       int i1 = this.w();
       p2 = Math.max(b, Math.min(p2, 0));
       if (i1 >= b && (i1 <= 0 && i1 != p2)) {
          i = 0;
       }
       if (i) {
          return 0;
       }else {
          this.x(p3);
          this.y(p0, p1, p3);
          p0.j(p1);
          return (this.w() - p3);
       }
    }
    public void F(CoordinatorLayout p0,float p1){
    }
    public final boolean g(CoordinatorLayout p0,View p1,MotionEvent p2){
       int actionMasked;
       HeaderBehavior tg;
       int i2;
       if (!p2.getAction()) {
          this.h.n();
       }
       if (this.f < null) {
          this.f = ViewConfiguration.get(p0.getContext()).getScaledTouchSlop();
       }
       int i = 2;
       int b = true;
       if (p2.getAction() != i || this.c == null) {
          if (actionMasked = p2.getActionMasked()) {
             if (actionMasked != b) {
                if (actionMasked != i) {
                   if (actionMasked == 3) {
                   }
                }else {
                   tg = this.d;
                   int i1 = -1;
                   if (tg != i1 && (i2 = p2.findPointerIndex(tg)) != i1) {
                      i2 = (int)p2.getY(i2);
                      if (Math.abs((i2 - this.e)) > this.f) {
                         this.c = b;
                         this.e = i2;
                      }
                   }
                }
             }else {
             }
          }else {
             this.c = false;
             i = (int)p2.getX();
             b = (int)p2.getY();
             if (this.z(p1, p0) && p0.r(p1, i, b)) {
                this.e = b;
                this.d = p2.getPointerId(false);
                if (this.g == null) {
                   this.g = VelocityTracker.obtain();
                }
             }
          }
          if ((tg = this.g) != null) {
             tg.addMovement(p2);
          }
          b = this.c;
       }
       return b;
    }
    public boolean h(CoordinatorLayout p0,View p1,int p2){
       super.h(p0, p1, p2);
       hj7 ta = this.a;
       mj2 omj2 = p1;
       ta.e = - omj2.getTotalScrollRange();
       ta.f = 0;
       if ((ta.g = true)) {
          ta = this.a;
          int i = (int)((float)((- omj2.getTotalScrollRange()) - this.i) * this.j);
          if (ta.d != i) {
             ta.d = i;
             ta.a();
          }
       }
       this.y(p0, p1, this.w());
       this.k = omj2.getTotalScrollRange();
       return true;
    }
    public boolean i(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       View view;
       if ((view = p0.C()) != null) {
          p0.u(view, p2, p3, View$MeasureSpec.makeMeasureSpec(0, 0));
          int i = view.getMeasuredHeight() / 2;
          if (p1 instanceof y2) {
             p1.setCoordinatorAccessoryOffset(i);
          }
       }
       if (view != null) {
          this.i = view.getMeasuredHeight() / 2;
       }else if(p1 instanceof y2){
          p1.setCoordinatorAccessoryOffset(0);
       }
       this.i = 0;
       return 0;
    }
    public final void l(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
       if (p4 < 0 && this.D()) {
          return;
       }
       this.C(p1, p0);
       p5[1] = this.E(p0, p1, (this.w() - p4), this.B(p1, p0), 0);
       return;
    }
    public final void m(CoordinatorLayout p0,View p1,View p2,int p3){
       if (p3 < 0) {
          this.C(p1, p0);
          this.E(p0, p1, (this.w() - p3), this.B(p1, p0), 0);
       }
       int i = 0;
       int i1 = (p3 < 0)? 1: 0;
       int i2 = (p3 > 0)? 1: 0;
       int i3 = this.B(p1, p0);
       this.C(p1, p0);
       int i4 = this.w();
       int i5 = Math.max(i3, Math.min((this.w() - p3), i));
       i4 = (i4 >= i3 && (i4 <= 0 && i4 != i5))? 0: 1;
       if (i1 && (i4 || (i2 && p2 instanceof ph4))) {
          p2.d(1);
       }
       if (p0.T != null) {
          if (p3 >= 0) {
             i = true;
          }
          this.l = i;
       }
       return;
    }
    public final void p(View p0,Parcelable p1){
       if (p1 instanceof to2) {
          p1.getSuperState();
          to2 b = p1.b;
          this.l = b;
          float f = (b != null)? 0x3f800000: p1.a;
          this.j = f;
       }else {
          this.j = 0xcf000000;
       }
       return;
    }
    public final Parcelable q(View p0,CoordinatorLayout p1){
       if (p1.T == null) {
          this.l = this.D();
       }
       to2 oto2 = new to2(View$BaseSavedState.EMPTY_STATE);
       oto2.a = tu6.k(0, 0x3f800000, Math.abs(((float)this.w() / (float)p0.getTotalScrollRange())));
       oto2.b = this.l;
       return oto2;
    }
    public final boolean r(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       this.j = 0xcf000000;
       boolean b = ((p4 & 0x02))? true: false;
       return b;
    }
    public final boolean t(CoordinatorLayout p0,View p1,MotionEvent p2){
       HeaderBehavior g;
       HeaderBehavior headerBehavi = this;
       CoordinatorLayout uCoordinator = p0;
       View view = p1;
       MotionEvent motionEvent = p2;
       if (headerBehavi.f < null) {
          headerBehavi.f = ViewConfiguration.get(p0.getContext()).getScaledTouchSlop();
       }
       int actionMasked = p2.getActionMasked();
       boolean b = true;
       int i = 0;
       if (actionMasked) {
          if (actionMasked != b) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                   this.A();
                }
             }else if((actionMasked = motionEvent.findPointerIndex(headerBehavi.d)) == -1){
             label_0133 :
                b = false;
             label_0134 :
                return b;
             }else {
                actionMasked = (int)motionEvent.getY(actionMasked);
                i = headerBehavi.e - actionMasked;
                if (headerBehavi.c == null) {
                   HeaderBehavior f = headerBehavi.f;
                   if (Math.abs(i) > f) {
                      headerBehavi.c = b;
                      i = (i > 0)? i - f: i + f;
                   }
                }
                if (headerBehavi.c != null) {
                   headerBehavi.e = actionMasked;
                   headerBehavi.C(view, uCoordinator);
                   this.E(p0, p1, (this.w() - i), headerBehavi.B(view, uCoordinator), 0);
                }
             }
          }else if((g = headerBehavi.g) != null){
             g.addMovement(motionEvent);
             headerBehavi.g.computeCurrentVelocity(1000);
             float yVelocity = headerBehavi.g.getYVelocity(headerBehavi.d);
             i = (uCoordinator.T != null)? p1.getMeasuredHeight() - p0.getMeasuredHeight(): view.getTotalScrollRange() + headerBehavi.i;
             i = - i;
             int i1 = this.w();
             nq5 onq5 = new nq5(headerBehavi, uCoordinator, view);
             HeaderBehavior h = headerBehavi.h;
             h.n();
             if (h.b == null) {
                h.b = new Scroller(p1.getContext(), do5.b);
             }
             h.b.fling(0, i1, 0, Math.round(yVelocity), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
             if (h.b.computeScrollOffset()) {
                ep2 yVelocity1 = new ep2(h, view, i, onq5);
                h.a = yVelocity1;
                dh7.m(view, yVelocity1);
                h.c = new WeakReference(view);
             }else {
                h.a = null;
             }
          }
          this.A();
       }else {
          int i2 = (int)p2.getY();
          if (uCoordinator.r(view, (int)p2.getX(), i2) && headerBehavi.z(view, uCoordinator)) {
             headerBehavi.e = i2;
             headerBehavi.d = motionEvent.getPointerId(i);
             if (headerBehavi.g == null) {
                headerBehavi.g = VelocityTracker.obtain();
             }
          }else {
             goto label_0133 ;
          }
       }
       if ((g = headerBehavi.g) != null) {
          g.addMovement(motionEvent);
          goto label_0134 ;
       }else {
          goto label_0134 ;
       }
    }
    public final void y(CoordinatorLayout p0,View p1,int p2){
       p1.setAlpha(0x3f800000);
       mj2 omj2 = p1;
       p2 = Math.min((- p2), omj2.getTotalScrollRange());
       float f = (float)p2 / (float)omj2.getTotalScrollRange();
       if (p0.T == null) {
          this.F(p0, f);
          p1.a(f, p2);
       }
       return;
    }
    public boolean z(View p0,CoordinatorLayout p1){
       boolean b = (!this.D() && oi.g(p1).e())? true: false;
       return b;
    }
}
