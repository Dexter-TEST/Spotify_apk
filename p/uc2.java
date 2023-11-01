package p.uc2;
import android.view.View$OnTouchListener;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import java.lang.Object;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.Runnable;
import p.if6;
import android.view.MotionEvent;
import p.ue1;
import android.view.ViewParent;
import p.tc2;
import android.os.SystemClock;

public abstract class uc2 implements View$OnTouchListener, View$OnAttachStateChangeListener	// class@002882 from classes.dex
{
    public final float a;
    public final int b;
    public final int c;
    public final View t;
    public tc2 v;
    public tc2 w;
    public boolean x;
    public int y;
    public final int[] z;

    public void uc2(View p0){
       super();
       int[] ointArray = new int[2];
       this.z = ointArray;
       this.t = p0;
       p0.setLongClickable(true);
       p0.addOnAttachStateChangeListener(this);
       this.a = (float)ViewConfiguration.get(p0.getContext()).getScaledTouchSlop();
       int tapTimeout = ViewConfiguration.getTapTimeout();
       this.b = tapTimeout;
       this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }
    public final void a(){
       uc2 tw = this.w;
       uc2 tt = this.t;
       if (tw != null) {
          tt.removeCallbacks(tw);
       }
       if ((tw = this.v) != null) {
          tt.removeCallbacks(tw);
       }
       return;
    }
    public abstract if6 b();
    public abstract boolean c();
    public boolean d(){
       if6 oif6;
       if ((oif6 = this.b()) != null && oif6.a()) {
          oif6.dismiss();
       }
       return true;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       if6 oif6;
       boolean i1;
       ue1 oue1;
       int actionMasked;
       uc2 tx = this.x;
       int i = 3;
       uc2 tt = this.t;
       boolean b = false;
       if (tx != null) {
          if ((oif6 = this.b()) != null && (oif6.a() && ((oue1 = oif6.e()) != null && oue1.isShown()))) {
             MotionEvent motionEvent = MotionEvent.obtainNoHistory(p1);
             uc2 tz = this.z;
             tt.getLocationOnScreen(tz);
             motionEvent.offsetLocation((float)tz[b], (float)tz[1]);
             oue1.getLocationOnScreen(tz);
             motionEvent.offsetLocation((float)(- tz[b]), (float)(- tz[1]));
             boolean b1 = oue1.b(motionEvent, this.y);
             motionEvent.recycle();
             i1 = ((i1 = p1.getActionMasked()) != 1 && i1 != i)? 1: 0;
             if (b1 && i1) {
                i1 = 1;
             label_005e :
                if (!i1 && this.d()) {
                   i1 = false;
                }else {
                   i1 = true;
                }
             }
          }
          i1 = 0;
          goto label_005e ;
       }else if(!tt.isEnabled()){
          if (actionMasked = p1.getActionMasked()) {
             if (actionMasked != 1) {
                if (actionMasked != 2) {
                   if (actionMasked == i) {
                   label_00ce :
                      this.a();
                   }
                }else if((i = p1.findPointerIndex(this.y)) >= 0){
                   float x = p1.getX(i);
                   float y = p1.getY(i);
                   uc2 ta = this.a;
                   float f = - ta;
                   y = ((f - x) >= 0 && ((f - y) >= 0 && ((x - ((float)(tt.getRight() - tt.getLeft()) + ta)) < 0 && (y - ((float)(tt.getBottom() - tt.getTop()) + ta)) < 0)))? 1: 0;
                   if (!y) {
                      this.a();
                      tt.getParent().requestDisallowInterceptTouchEvent(1);
                      y = 1;
                   label_00ff :
                      i1 = (i1 && this.c())? true: false;
                      if (i1) {
                         long l = SystemClock.uptimeMillis();
                         MotionEvent motionEvent1 = MotionEvent.obtain(l, l, 3, 0, 0, 0);
                         tt.onTouchEvent(motionEvent1);
                         motionEvent1.recycle();
                      }
                   }
                }
             }else {
                goto label_00ce ;
             }
          }else {
             this.y = p1.getPointerId(b);
             if (this.v == null) {
                this.v = new tc2(this, b);
             }
             tt.postDelayed(this.v, (long)this.b);
             if (this.w == null) {
                this.w = new tc2(this, 1);
             }
             tt.postDelayed(this.w, (long)this.c);
          }
       }
       i1 = 0;
       goto label_00ff ;
       this.x = i1;
       if (i1 || tx != null) {
          b = true;
       }
       return b;
    }
    public final void onViewAttachedToWindow(View p0){
    }
    public final void onViewDetachedFromWindow(View p0){
       uc2 tv;
       this.x = false;
       this.y = -1;
       if ((tv = this.v) != null) {
          this.t.removeCallbacks(tv);
       }
       return;
    }
}
