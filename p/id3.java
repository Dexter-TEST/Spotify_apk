package p.id3;
import p.lr5;
import p.md3;
import java.lang.Object;
import android.view.MotionEvent;
import p.b7;
import p.vi2;
import p.g54;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import java.lang.Class;
import p.zr5;
import java.lang.Runnable;
import android.view.View;
import p.l02;
import java.util.ArrayList;
import p.jd3;
import p.kd3;

public final class id3 implements lr5	// class@001970 from classes.dex
{
    public final md3 a;

    public void id3(md3 p0){
       this.a = p0;
       super();
    }
    public final void b(MotionEvent p0){
       md3 s;
       int i1;
       md3 c;
       md3 s1;
       id3 ta = this.a;
       ta.x.b.a.onTouchEvent(p0);
       if ((s = ta.s) != null) {
          s.addMovement(p0);
       }
       int i = -1;
       if (ta.l == i) {
          return;
       }else {
          int actionMasked = p0.getActionMasked();
          if ((i1 = p0.findPointerIndex(ta.l)) >= 0 && (ta.c == null && (actionMasked == 2 && ta.n != 2))) {
             ta.m.getClass();
          }
          if ((c = ta.c) == null) {
             return;
          }else {
             int i2 = 1;
             if (actionMasked != i2) {
                if (actionMasked != 2) {
                   if (actionMasked != 3) {
                      if (actionMasked == 6) {
                         actionMasked = p0.getActionIndex();
                         if (p0.getPointerId(actionMasked) == ta.l) {
                            if (actionMasked) {
                               i2 = 0;
                            }
                            ta.l = p0.getPointerId(i2);
                            ta.r(ta.o, actionMasked, p0);
                         }
                      }
                   }else if((s1 = ta.s) != null){
                      s1.clear();
                   label_008a :
                      ta.q(null, 0);
                      ta.l = i;
                   }else {
                      goto label_008a ;
                   }
                }else if(i1 >= 0){
                   ta.r(ta.o, i1, p0);
                   ta.o(c);
                   s = ta.r;
                   ta.q.removeCallbacks(s);
                   s.run();
                   ta.q.invalidate();
                }
             }else {
                goto label_008a ;
             }
             return;
          }
       }
    }
    public final boolean c(MotionEvent p0){
       md3 s;
       md3 l;
       id3 ta = this.a;
       ta.x.b.a.onTouchEvent(p0);
       int actionMasked = p0.getActionMasked();
       int i = 0;
       int i1 = -1;
       md3 m = ta.m;
       jd3 ojd3 = null;
       if (!actionMasked) {
          ta.l = p0.getPointerId(i);
          ta.d = p0.getX();
          ta.e = p0.getY();
          if ((s = ta.s) != null) {
             s.recycle();
          }
          ta.s = VelocityTracker.obtain();
          if (ta.c == null) {
             s = ta.p;
             if (!s.isEmpty()) {
                View view = ta.l(p0);
                int i2 = s.size() + i1;
                while (i2 >= 0) {
                   jd3 ojd31 = s.get(i2);
                   if (ojd31.e.a == view) {
                      ojd3 = ojd31;
                      break ;
                   }
                   i2 = i2 - 1;
                }
             }
             if (ojd3 != null) {
                ta.d = ta.d - ojd3.i;
                ta.e = ta.e - ojd3.j;
                jd3 e = ojd3.e;
                ta.k(e, true);
                if (ta.a.remove(e.a)) {
                   m.a(e);
                }
                ta.q(e, ojd3.f);
                ta.r(ta.o, i, p0);
             }
          }
       }else if(actionMasked != 3 && actionMasked != 1){
          if ((l = ta.l) != i1 && (p0.findPointerIndex(l) >= 0 && (ta.c == null && (actionMasked == 2 && ta.n != 2)))) {
             m.getClass();
          }
       }else {
          ta.l = i1;
          ta.q(ojd3, i);
       }
       if ((s = ta.s) != null) {
          s.addMovement(p0);
       }
       if (ta.c != null) {
          i = true;
       }
       return i;
    }
    public final void e(boolean p0){
       if (!p0) {
          return;
       }
       this.a.q(null, 0);
       return;
    }
}
