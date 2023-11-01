package p.bi7;
import p.ai7;
import android.content.Context;
import android.view.ViewGroup;
import p.ap5;
import java.lang.Object;
import p.em0;
import android.view.ViewConfiguration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.OverScroller;
import android.view.animation.Interpolator;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Arrays;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import java.lang.StringBuilder;
import java.lang.Math;
import java.lang.Class;
import p.wh7;
import java.lang.Runnable;
import android.util.Log;
import android.view.MotionEvent;
import java.lang.System;
import java.lang.IllegalStateException;

public final class bi7	// class@0010d1 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public final float n;
    public final int o;
    public final OverScroller p;
    public final ap5 q;
    public View r;
    public boolean s;
    public final ViewGroup t;
    public final em0 u;
    public static final ai7 v;

    static {
       bi7.v = new ai7(0);
    }
    public void bi7(Context p0,ViewGroup p1,ap5 p2){
       super();
       this.c = -1;
       this.u = new em0(6, this);
       if (p1 == null) {
          throw new IllegalArgumentException("Parent view may not be null");
       }
       if (p2 == null) {
          throw new IllegalArgumentException("Callback may not be null");
       }
       this.t = p1;
       this.q = p2;
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       this.o = (int)((p0.getResources().getDisplayMetrics().density * 20.00f) + 0x3f000000);
       this.b = viewConfigur.getScaledTouchSlop();
       this.m = (float)viewConfigur.getScaledMaximumFlingVelocity();
       this.n = (float)viewConfigur.getScaledMinimumFlingVelocity();
       this.p = new OverScroller(p0, bi7.v);
       return;
    }
    public final void a(){
       bi7 td;
       this.c = -1;
       if ((td = this.d) == null) {
       }else {
          Arrays.fill(td, 0);
          Arrays.fill(this.e, 0);
          Arrays.fill(this.f, 0);
          Arrays.fill(this.g, 0);
          Arrays.fill(this.h, 0);
          Arrays.fill(this.i, 0);
          Arrays.fill(this.j, 0);
          this.k = 0;
       }
       if ((td = this.l) != null) {
          td.recycle();
          this.l = null;
       }
       return;
    }
    public final void b(View p0,int p1){
       bi7 tt = this.t;
       if (p0.getParent() != tt) {
          throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view \("+tt+"\)");
       }
       this.r = p0;
       this.c = p1;
       this.q.w(p0, p1);
       this.p(1);
       return;
    }
    public final boolean c(float p0,float p1,int p2,int p3){
       p0 = Math.abs(p0);
       p1 = Math.abs(p1);
       int i = 0;
       if (((this.h[p2] & p3)) == p3 && (((i & p3)) && (((this.j[p2] & p3)) != p3 && ((this.i[p2] & p3)) != p3))) {
          bi7 tb = this.b;
          if ((p0 - (float)tb) > 0 || (p1 - (float)tb) > 0) {
             if ((p0 - (p1 * 0x3f000000)) < 0) {
                this.q.getClass();
             }
             if (!((this.i[p2] & p3)) && ((float)this.b - p0) > 0) {
                i = true;
             }
          }
       }
       return i;
    }
    public final boolean d(View p0,float p1,float p2){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       bi7 tq = this.q;
       int i = (tq.q(p0) > 0)? 1: 0;
       tq = (tq.r() > 0)? 1: 0;
       if (i && tq) {
          if (((float)(this.b * this.b) - ((p2 * p2) + (p1 * p1))) > 0) {
             b = true;
          }
          return b;
       }else if(i){
          if (((float)this.b - Math.abs(p1)) > 0) {
             b = true;
          }
          return b;
       }else if(tq && ((float)this.b - Math.abs(p2)) > 0){
          b = true;
       }
       return b;
    }
    public final void e(int p0){
       bi7 td;
       if ((td = this.d) != null) {
          bi7 tk = this.k;
          int i = 1;
          int i1 = i << p0;
          if (!((i1 & tk))) {
             i = 0;
          }
          if (i) {
             td[p0] = 0;
             this.e[p0] = 0;
             this.f[p0] = 0;
             this.g[p0] = 0;
             this.h[p0] = 0;
             this.i[p0] = 0;
             this.j[p0] = 0;
             this.k = (~ i1) & tk;
          }
       }
       return;
    }
    public final int f(int p0,int p1,int p2){
       if (!p0) {
          return 0;
       }
       int width = this.t.getWidth();
       int i = width / 2;
       float f = (float)i;
       float f1 = ((float)Math.sin((double)((Math.min(0x3f800000, ((float)Math.abs(p0) / (float)width)) - 0x3f000000) * 0x3ef1463b)) * f) + f;
       p0 = ((p1 = Math.abs(p1)) > 0)? Math.round((Math.abs((f1 / (float)p1)) * 1000.00f)) * 4: (int)((((float)Math.abs(p0) / (float)p2) + 0x3f800000) * 256.00f);
       return Math.min(p0, 600);
    }
    public final boolean g(){
       boolean b = false;
       if (this.a == 2) {
          bi7 tp = this.p;
          boolean b1 = tp.computeScrollOffset();
          int currX = tp.getCurrX();
          int currY = tp.getCurrY();
          int i = currX - this.r.getLeft();
          int i1 = currY - this.r.getTop();
          if (i) {
             wh7.h(this.r, i);
          }
          if (i1) {
             wh7.i(this.r, i1);
          }
          if (i || i1) {
             this.q.y(this.r, currX, currY);
          }
          if (b1 && (currX == tp.getFinalX() && currY == tp.getFinalY())) {
             tp.abortAnimation();
             b1 = false;
          }
          if (!b1) {
             this.t.post(this.u);
          }
       }
       if (this.a == 2) {
          b = true;
       }
       return b;
    }
    public final View h(int p0,int p1){
       View childAt;
       bi7 tt = this.t;
       int i = tt.getChildCount() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          this.q.getClass();
          childAt = tt.getChildAt(i);
          if (p0 >= childAt.getLeft() && (p0 < childAt.getRight() && (p1 >= childAt.getTop() && p1 < childAt.getBottom()))) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return childAt;
    }
    public final boolean i(int p0,int p1,int p2,int p3){
       int i4;
       float f;
       float f1;
       float f2;
       int left = this.r.getLeft();
       int top = this.r.getTop();
       int i = p0 - left;
       int i1 = p1 - top;
       bi7 tp = this.p;
       p0 = 0;
       if (!i && !i1) {
          tp.abortAnimation();
          this.p(p0);
          return p0;
       }else {
          bi7 tr = this.r;
          int i2 = (int)this.n;
          int i3 = (int)this.m;
          if ((i4 = Math.abs(p2)) < i2) {
             p2 = 0;
          }else if(i4 > i3){
             p2 = (p2 > 0)? i3: - i3;
          }
          if ((i4 = Math.abs(p3)) < i2) {
             p3 = 0;
          }else if(i4 > i3){
             p3 = (p3 > 0)? i3: - i3;
          }
          p0 = Math.abs(i);
          i2 = Math.abs(i1);
          i3 = Math.abs(p2);
          i4 = Math.abs(p3);
          int i5 = i3 + i4;
          int i6 = p0 + i2;
          if (p2) {
             f = (float)i3;
             f1 = (float)i5;
          }else {
             f = (float)p0;
             f1 = (float)i6;
          }
          f = f / f1;
          if (p3) {
             f2 = (float)i4;
             f1 = (float)i5;
          }else {
             f2 = (float)i2;
             f1 = (float)i6;
          }
          bi7 tq = this.q;
          tp.startScroll(left, top, i, i1, (int)(((float)this.f(i1, p3, tq.r()) * (f2 / f1)) + ((float)this.f(i, p2, tq.q(tr)) * f)));
          this.p(2);
          return true;
       }
    }
    public final boolean j(int p0){
       int i = 1;
       int i1 = ((this.k & (i << p0)))? 1: 0;
       if (!i1) {
          Log.e("ViewDragHelper", "Ignoring pointerId="+p0+" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
          return false;
       }else {
          return i;
       }
    }
    public final void k(MotionEvent p0){
       bi7 tc;
       float x;
       int i1;
       float x1;
       int actionMasked = p0.getActionMasked();
       int actionIndex = p0.getActionIndex();
       if (!actionMasked) {
          this.a();
       }
       if (this.l == null) {
          this.l = VelocityTracker.obtain();
       }
       this.l.addMovement(p0);
       int i = 0;
       bi7 tq = this.q;
       if (actionMasked) {
          int b = true;
          if (actionMasked != b) {
             if (actionMasked != 2) {
                if (actionMasked != 3) {
                   if (actionMasked != 5) {
                      if (actionMasked == 6) {
                         actionMasked = p0.getPointerId(actionIndex);
                         if (this.a == b && actionMasked == this.c) {
                            actionIndex = p0.getPointerCount();
                            while (true) {
                               if (i < actionIndex) {
                                  if ((b = p0.getPointerId(i)) != this.c) {
                                     bi7 tr = this.r;
                                     if (this.h((int)p0.getX(i), (int)p0.getY(i)) == tr && this.s(tr, b)) {
                                        tc = this.c;
                                     label_006d :
                                        if (tc == -1) {
                                           this.l();
                                        }
                                     }
                                  }
                                  i = i + 1;
                               }else {
                                  tc = -1;
                                  goto label_006d ;
                               }
                            }
                         }
                         this.e(actionMasked);
                      }
                   }else {
                      actionMasked = p0.getPointerId(actionIndex);
                      x = p0.getX(actionIndex);
                      float y = p0.getY(actionIndex);
                      this.n(x, y, actionMasked);
                      if (this.a == null) {
                         this.s(this.h((int)x, (int)y), actionMasked);
                         if ((this.h[actionMasked] & i)) {
                            tq.getClass();
                         }
                      }else {
                         actionIndex = (int)x;
                         i1 = (int)y;
                         if ((tq = this.r) != null && (actionIndex >= tq.getLeft() && (actionIndex < tq.getRight() && (i1 >= tq.getTop() && i1 < tq.getBottom())))) {
                            i = 1;
                         }
                         if (i) {
                            this.s(this.r, actionMasked);
                         }
                      }
                   }
                }else if(this.a == b){
                   this.s = b;
                   tq.z(this.r, 0, 0);
                   this.s = i;
                   if (this.a == b) {
                      this.p(i);
                   }
                }
                this.a();
             }else if(this.a == b){
                if (this.j(this.c)) {
                   actionMasked = p0.findPointerIndex(this.c);
                   x1 = p0.getX(actionMasked);
                   bi7 tc1 = this.c;
                   actionIndex = (int)(x1 - this.f[tc1]);
                   actionMasked = (int)(p0.getY(actionMasked) - this.g[tc1]);
                   i = this.r.getLeft() + actionIndex;
                   b = this.r.getTop() + actionMasked;
                   int left = this.r.getLeft();
                   int top = this.r.getTop();
                   if (actionIndex) {
                      i = tq.k(this.r, i);
                      wh7.h(this.r, (i - left));
                   }
                   if (actionMasked) {
                      b = tq.l(this.r, b);
                      wh7.i(this.r, (b - top));
                   }
                   if (actionIndex || actionMasked) {
                      tq.y(this.r, i, b);
                   }
                   this.o(p0);
                }
             }else {
                actionMasked = p0.getPointerCount();
                while (i < actionMasked) {
                   actionIndex = p0.getPointerId(i);
                   if (this.j(actionIndex)) {
                      float x2 = p0.getX(i);
                      x = p0.getY(i);
                      float f = x2 - this.d[actionIndex];
                      float f1 = x - this.e[actionIndex];
                      this.m(f, f1, actionIndex);
                      if (this.a == b) {
                         break ;
                      }else {
                         View view = this.h((int)x2, (int)x);
                         if (this.d(view, f, f1) && this.s(view, actionIndex)) {
                            break ;
                         }
                      }
                   }
                   i = i + 1;
                }
                this.o(p0);
             }
          }else if(this.a == b){
             this.l();
          }
          this.a();
       }else {
          float x3 = p0.getX();
          x1 = p0.getY();
          i1 = p0.getPointerId(i);
          this.n(x3, x1, i1);
          this.s(this.h((int)x3, (int)x1), i1);
          if ((this.h[i1] & i)) {
             tq.getClass();
          }
       }
       return;
    }
    public final void l(){
       bi7 tm = this.m;
       this.l.computeCurrentVelocity(1000, tm);
       float xVelocity = this.l.getXVelocity(this.c);
       float f = Math.abs(xVelocity);
       float f1 = 0;
       bi7 tn = this.n;
       if ((f - tn) < 0) {
          xVelocity = 0;
       }else if((tm - f) > 0){
          xVelocity = ((f1 - xVelocity) > 0)? tm: - tm;
       }
       f = this.l.getYVelocity(this.c);
       float f2 = Math.abs(f);
       if ((f2 - tn) >= 0) {
          if ((tm - f2) > 0) {
             if ((f1 - f) <= 0) {
                tm = - tm;
             }
             f1 = tm;
          }else {
             f1 = f;
          }
       }
       this.s = true;
       this.q.z(this.r, xVelocity, f1);
       this.s = false;
       if (this.a == true) {
          this.p(false);
       }
       return;
    }
    public final void m(float p0,float p1,int p2){
       boolean b = this.c(p0, p1, p2, 1);
       if (this.c(p1, p0, p2, 4)) {
          b = b | 0x04;
       }
       if (this.c(p0, p1, p2, 2)) {
          b = b | 0x02;
       }
       if (this.c(p1, p0, p2, 8)) {
          b = b | 0x08;
       }
       if (b) {
          bi7 ti = this.i;
          ti[p2] = ti[p2] | b;
          this.q.getClass();
       }
       return;
    }
    public final void n(float p0,float p1,int p2){
       bi7 td = this.d;
       int i = 0;
       if (td == null || td.length <= p2) {
          int i1 = p2 + 1;
          float[] uofloatArray = new float[i1];
          float[] uofloatArray1 = new float[i1];
          float[] uofloatArray2 = new float[i1];
          float[] uofloatArray3 = new float[i1];
          int[] ointArray = new int[i1];
          int[] ointArray1 = new int[i1];
          int[] ointArray2 = new int[i1];
          if (td != null) {
             System.arraycopy(td, i, uofloatArray, i, td.length);
             td = this.e;
             System.arraycopy(td, i, uofloatArray1, i, td.length);
             td = this.f;
             System.arraycopy(td, i, uofloatArray2, i, td.length);
             td = this.g;
             System.arraycopy(td, i, uofloatArray3, i, td.length);
             td = this.h;
             System.arraycopy(td, i, ointArray, i, td.length);
             td = this.i;
             System.arraycopy(td, i, ointArray1, i, td.length);
             td = this.j;
             System.arraycopy(td, i, ointArray2, i, td.length);
          }
          this.d = uofloatArray;
          this.e = uofloatArray1;
          this.f = uofloatArray2;
          this.g = uofloatArray3;
          this.h = ointArray;
          this.i = ointArray1;
          this.j = ointArray2;
       }
       this.f[p2] = p0;
       this.d[p2] = p0;
       this.g[p2] = p1;
       this.e[p2] = p1;
       td = this.h;
       int i2 = (int)p0;
       int i3 = (int)p1;
       bi7 tt = this.t;
       bi7 to = this.o;
       if (i2 < (tt.getLeft() + to)) {
          i = 1;
       }
       if (i3 < (tt.getTop() + to)) {
          i = i | 0x04;
       }
       if (i2 > (tt.getRight() - to)) {
          i = i | 0x02;
       }
       if (i3 > (tt.getBottom() - to)) {
          i = i | 0x08;
       }
       td[p2] = i;
       this.k = this.k | (1 << p2);
       return;
    }
    public final void o(MotionEvent p0){
       int pointerCount = p0.getPointerCount();
       int i = 0;
       while (i < pointerCount) {
          int pointerId = p0.getPointerId(i);
          if (this.j(pointerId)) {
             this.f[pointerId] = p0.getX(i);
             this.g[pointerId] = p0.getY(i);
          }
          i = i + 1;
       }
       return;
    }
    public final void p(int p0){
       this.t.removeCallbacks(this.u);
       if (this.a != p0) {
          this.a = p0;
          this.q.x(p0);
          if (this.a == null) {
             this.r = null;
          }
       }
       return;
    }
    public final boolean q(int p0,int p1){
       if (this.s != null) {
          return this.i(p0, p1, (int)this.l.getXVelocity(this.c), (int)this.l.getYVelocity(this.c));
       }
       throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
    public final boolean r(MotionEvent p0){
       float x;
       bi7 a;
       View view;
       View view1;
       View view2;
       bi7 uobi7 = this;
       MotionEvent motionEvent = p0;
       int actionMasked = p0.getActionMasked();
       int actionIndex = p0.getActionIndex();
       if (!actionMasked) {
          this.a();
       }
       if (uobi7.l == null) {
          uobi7.l = VelocityTracker.obtain();
       }
       uobi7.l.addMovement(motionEvent);
       boolean b = true;
       int i = 2;
       bi7 q = uobi7.q;
       if (actionMasked) {
          if (actionMasked != b) {
             if (actionMasked != i) {
                if (actionMasked != 3) {
                   if (actionMasked != 5) {
                      if (actionMasked == 6) {
                         uobi7.e(motionEvent.getPointerId(actionIndex));
                      }
                   }else {
                      actionMasked = motionEvent.getPointerId(actionIndex);
                      x = motionEvent.getX(actionIndex);
                      float y = motionEvent.getY(actionIndex);
                      uobi7.n(x, y, actionMasked);
                      if ((a = uobi7.a) == null) {
                         if ((uobi7.h[actionMasked] & 0)) {
                            q.getClass();
                         }
                      }else if(a == i && (view = uobi7.h((int)x, (int)y)) == uobi7.r){
                         uobi7.s(view, actionMasked);
                      }
                   }
                }
             }else if(uobi7.d != null && uobi7.e != null){
                actionMasked = p0.getPointerCount();
                actionIndex = 0;
                while (actionIndex < actionMasked) {
                   i = motionEvent.getPointerId(actionIndex);
                   if (uobi7.j(i)) {
                      x = motionEvent.getX(actionIndex);
                      float y1 = motionEvent.getY(actionIndex);
                      float f = x - uobi7.d[i];
                      float f1 = y1 - uobi7.e[i];
                      y1 = ((view1 = uobi7.h((int)x, (int)y1)) != null && uobi7.d(view1, f, f1))? 1: 0;
                      if (y1) {
                         int left = view1.getLeft();
                         int i1 = (int)f + left;
                         i1 = q.k(view1, i1);
                         int top = view1.getTop();
                         int i2 = (int)f1 + top;
                         i2 = q.l(view1, i2);
                         int i3 = q.q(view1);
                         int i4 = q.r();
                         if (!i3 || (i3 > 0 || (i1 != left && (!i4 || (i4 > 0 || i2 != top))))) {
                            break ;
                         }
                      }
                      uobi7.m(f, f1, i);
                      if (uobi7.a == b || (y1 && uobi7.s(view1, i))) {
                         break ;
                      }
                   }
                   actionIndex = actionIndex + 1;
                }
                this.o(p0);
             }
          }
          this.a();
       }else {
          float x1 = p0.getX();
          float y2 = p0.getY();
          int pointerId = motionEvent.getPointerId(0);
          uobi7.n(x1, y2, pointerId);
          if ((view2 = uobi7.h((int)x1, (int)y2)) == uobi7.r && uobi7.a == i) {
             uobi7.s(view2, pointerId);
          }
          if ((uobi7.h[pointerId] & 0)) {
             q.getClass();
          }
       }
       if (uobi7.a != b) {
          b = false;
       }
       return b;
    }
    public final boolean s(View p0,int p1){
       if (p0 == this.r && this.c == p1) {
          return true;
       }
       if (p0 == null || !this.q.D(p0, p1)) {
          return false;
       }
       this.c = p1;
       this.b(p0, p1);
       return true;
    }
}
