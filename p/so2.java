package p.so2;
import p.ij7;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.view.MotionEvent;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.Math;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import p.ef;
import java.lang.Object;
import java.lang.ref.Reference;
import android.view.VelocityTracker;
import android.widget.OverScroller;
import java.lang.Runnable;
import p.ka0;
import p.wh7;
import p.dh7;

public abstract class so2 extends ij7	// class@002669 from classes.dex
{
    public ka0 c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;

    public void so2(){
       super();
       this.f = -1;
       this.h = -1;
    }
    public void so2(int p0){
       super(0);
       this.f = -1;
       this.h = -1;
    }
    public final boolean g(CoordinatorLayout p0,View p1,MotionEvent p2){
       so2 tf;
       int i1;
       AppBarLayout$BaseBehavior n;
       View n1;
       so2 td;
       if (this.h < null) {
          this.h = ViewConfiguration.get(p0.getContext()).getScaledTouchSlop();
       }
       int i = -1;
       if (p2.getActionMasked() == 2 && this.e != null) {
          if ((tf = this.f) == i) {
             return false;
          }else if((i1 = p2.findPointerIndex(tf)) == i){
             return false;
          }else {
             i1 = (int)p2.getY(i1);
             if (Math.abs((i1 - this.g)) > this.h) {
                this.g = i1;
                return true;
             }
          }
       }
       if (!p2.getActionMasked()) {
          this.f = i;
          i1 = (int)p2.getX();
          int i2 = (int)p2.getY();
          i = ((n = this.n) != null && ((n1 = n.get()) == null && (n1.isShown() && !n1.canScrollVertically(i))))? 0: 1;
          boolean b = (i && p0.r(p1, i1, i2))? true: false;
          this.e = b;
          if (b) {
             this.g = i2;
             this.f = p2.getPointerId(false);
             if (this.i == null) {
                this.i = VelocityTracker.obtain();
             }
             if ((td = this.d) != null && !td.isFinished()) {
                this.d.abortAnimation();
                return true;
             }
          }
       }
       if ((td = this.i) != null) {
          td.addMovement(p2);
       }
       return false;
    }
    public final boolean t(CoordinatorLayout p0,View p1,MotionEvent p2){
       so2 i2;
       so2 c;
       ka0 oka0;
       so2 oso2 = this;
       so2 obj = p0;
       View view = p1;
       MotionEvent motionEvent = p2;
       int actionMasked = p2.getActionMasked();
       VelocityTracker velocityTrac = null;
       int i = -1;
       boolean b = true;
       if (actionMasked != b) {
          if (actionMasked != 2) {
             if (actionMasked != 3) {
                if (actionMasked == 6) {
                   actionMasked = (!p2.getActionIndex())? 1: 0;
                   oso2.f = motionEvent.getPointerId(actionMasked);
                   oso2.g = (int)(motionEvent.getY(actionMasked) + 0x3f000000);
                }
             }else {
             label_00df :
                actionMasked = 0;
             label_00e0 :
                oso2.e = false;
                oso2.f = i;
                if ((obj = oso2.i) != null) {
                   obj.recycle();
                   oso2.i = velocityTrac;
                }
             }
          }else if((actionMasked = motionEvent.findPointerIndex(oso2.f)) == i){
             return false;
          }else {
             actionMasked = (int)motionEvent.getY(actionMasked);
             int i1 = oso2.g - actionMasked;
             oso2.g = actionMasked;
             this.x(p0, p1, (this.w() - i1), (- view.getDownNestedScrollRange()), 0);
          }
          actionMasked = 0;
       }else if((i2 = oso2.i) != null){
          i2.addMovement(motionEvent);
          oso2.i.computeCurrentVelocity(1000);
          float yVelocity = oso2.i.getYVelocity(oso2.f);
          ef uoef = view;
          int i3 = - uoef.getTotalScrollRange();
          if ((c = oso2.c) != null) {
             view.removeCallbacks(c);
             oso2.c = velocityTrac;
          }
          if (oso2.d == null) {
             oso2.d = new OverScroller(p1.getContext());
          }
          oso2.d.fling(0, this.u(), 0, Math.round(yVelocity), 0, 0, i3, 0);
          if (oso2.d.computeScrollOffset()) {
             oka0 = new ka0(oso2, obj, view, 9);
             oso2.c = oka0;
             dh7.m(view, oka0);
          }else {
             oso2.C(obj, uoef);
             if (uoef.C != null) {
                uoef.e(uoef.f(AppBarLayout$BaseBehavior.A(p0)));
             }
          }
          oka0 = 1;
          goto label_00e0 ;
       }else {
          goto label_00df ;
       }
       if ((obj = oso2.i) != null) {
          obj.addMovement(motionEvent);
       }
       if (oso2.e == null && !actionMasked) {
          b = false;
       }
       return b;
    }
    public abstract int w();
    public abstract int x(CoordinatorLayout p0,View p1,int p2,int p3,int p4);
    public final void y(CoordinatorLayout p0,View p1,int p2){
       this.x(p0, p1, p2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
