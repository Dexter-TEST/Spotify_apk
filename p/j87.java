package p.j87;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewGroup;
import p.h87;
import java.lang.Object;
import android.view.ViewTreeObserver;
import android.view.View;
import p.k87;
import java.util.ArrayList;
import p.pk;
import p.wh6;
import java.util.Collection;
import p.b02;
import p.g87;
import java.util.Iterator;
import p.oy6;
import p.qv3;
import java.lang.Long;
import p.o87;
import android.util.SparseArray;
import p.al7;
import android.view.WindowId;
import android.animation.Animator;
import p.e87;
import p.jp7;

public final class j87 implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener	// class@001a8a from classes.dex
{
    public final h87 a;
    public final ViewGroup b;

    public void j87(ViewGroup p0,h87 p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public final boolean onPreDraw(){
       ArrayList orDefault;
       ArrayList uArrayList;
       int i1;
       j87 oj871;
       View view;
       View view1;
       o87 orDefault1;
       e87 obj;
       oy6 c;
       oy6 c1;
       View view2;
       View view3;
       Object obj1;
       o87 orDefault2;
       o87 orDefault3;
       int i5;
       View view4;
       Animator uAnimator;
       e87 orDefault4;
       e87 a2;
       j87 oj87 = this;
       j87 b = oj87.b;
       b.getViewTreeObserver().removeOnPreDrawListener(oj87);
       b.removeOnAttachStateChangeListener(oj87);
       boolean b1 = true;
       if (!k87.c.remove(b)) {
          return b1;
       }
       pk opk = k87.b();
       Long longx = null;
       if ((orDefault = opk.getOrDefault(b, longx)) == null) {
          orDefault = new ArrayList();
          opk.put(b, orDefault);
       }else if(orDefault.size() > 0){
          uArrayList = new ArrayList(orDefault);
       label_003b :
          j87 a = oj87.a;
          orDefault.add(a);
          a.a(new b02(oj87, b1, opk));
          a.i(b, false);
          if (uArrayList != null) {
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                iterator.next().A(b);
             }
          }
          a.B = new ArrayList();
          a.C = new ArrayList();
          h87 x = a.x;
          h87 y = a.y;
          pk opk1 = new pk(x.b);
          pk opk2 = new pk(y.b);
          int i = 0;
          while (true) {
             h87 a1 = a.A;
             if (i < a1.length) {
                if ((i1 = a1[i]) != b1) {
                   if (i1 != 2) {
                      if (i1 != 3) {
                         if (i1 == 4) {
                            oy6 t = x.t;
                            oy6 t1 = y.t;
                            int i2 = t.j();
                            int i3 = 0;
                            while (i3 < i2) {
                               if ((view = t.k(i3)) != null && a.t(view)) {
                                  oj871 = b;
                                  if ((view1 = t1.f(t.g(i3), longx)) != null && a.t(view1)) {
                                     orDefault1 = opk1.getOrDefault(view, longx);
                                     obj = opk2.getOrDefault(view1, longx);
                                     if (orDefault1 != null && obj != null) {
                                        a.B.add(orDefault1);
                                        a.C.add(obj);
                                        opk1.remove(view);
                                        opk2.remove(view1);
                                     }
                                  }
                               }else {
                                  oj871 = b;
                               }
                               i3 = i3 + 1;
                               b = oj871;
                               longx = null;
                               obj = 1;
                            }
                         }
                         oj871 = b;
                      }else {
                         oj871 = b;
                         c = x.c;
                         c1 = y.c;
                         int i4 = c.size();
                         b1 = 0;
                         while (b1 < i4) {
                            if ((view2 = c.valueAt(b1)) != null && (a.t(view2) && ((view3 = c1.get(c.keyAt(b1))) != null && a.t(view3)))) {
                               obj1 = null;
                               orDefault2 = opk1.getOrDefault(view2, obj1);
                               orDefault3 = opk2.getOrDefault(view3, obj1);
                               if (orDefault2 != null && orDefault3 != null) {
                                  a.B.add(orDefault2);
                                  a.C.add(orDefault3);
                                  opk1.remove(view2);
                                  opk2.remove(view3);
                               }
                            }
                            b1 = b1 + 1;
                         }
                      }
                   }else {
                      oj871 = b;
                      c = x.v;
                      c1 = y.v;
                      wh6 c2 = c.c;
                      b1 = 0;
                      while (b1 < c2) {
                         if ((view2 = c.j(b1)) != null && a.t(view2)) {
                            obj1 = null;
                            if ((view3 = c1.getOrDefault(c.h(b1), obj1)) != null && a.t(view3)) {
                               orDefault2 = opk1.getOrDefault(view2, obj1);
                               orDefault3 = opk2.getOrDefault(view3, obj1);
                               if (orDefault2 != null && orDefault3 != null) {
                                  a.B.add(orDefault2);
                                  a.C.add(orDefault3);
                                  opk1.remove(view2);
                                  opk2.remove(view3);
                               }
                            }
                         }
                         b1 = b1 + 1;
                      }
                   }
                }else {
                   oj871 = b;
                   wh6 c3 = opk1.c;
                   while ((i5 = c3 - 1) >= 0) {
                      if ((view4 = opk1.h(i5)) != null && (a.t(view4) && ((orDefault1 = opk2.remove(view4)) != null && a.t(orDefault1.b)))) {
                         a.B.add(opk1.i(i5));
                         a.C.add(orDefault1);
                      }
                   }
                }
                i = i + 1;
                b = oj871;
                longx = null;
                b1 = true;
             }else {
                break ;
             }
          }
          oj871 = b;
          i5 = 0;
          while (i5 < opk1.c) {
             orDefault1 = opk1.j(i5);
             if (a.t(orDefault1.b)) {
                a.B.add(orDefault1);
                a.C.add(null);
             }
             i5 = i5 + 1;
          }
          i5 = 0;
          while (i5 < opk2.c) {
             orDefault1 = opk2.j(i5);
             if (a.t(orDefault1.b)) {
                a.C.add(orDefault1);
                a.B.add(null);
             }
             i5 = i5 + 1;
          }
          opk = h87.p();
          WindowId windowId = oj871.getWindowId();
          int i6 = opk.c - 1;
          while (i6 >= 0) {
             if ((uAnimator = opk.h(i6)) != null && ((orDefault4 = opk.getOrDefault(uAnimator, null)) != null && (a2 = orDefault4.a) != null)) {
                obj = orDefault4.d;
                obj = (obj instanceof jp7 && obj.a.equals(windowId))? 1: 0;
                if (obj) {
                   b1 = true;
                   o87 oo87 = a.r(a2, b1);
                   o87 oo871 = a.o(a2, b1);
                   if (oo87 == null && oo871 == null) {
                      oo871 = a.y.b.getOrDefault(a2, null);
                   }else {
                      view2 = 0;
                   }
                   a2 = (oo87 == null && (oo871 == null || !orDefault4.e.s(orDefault4.c, oo871)))? 0: 1;
                   if (a2) {
                      if (!uAnimator.isRunning() && !uAnimator.isStarted()) {
                         opk.remove(uAnimator);
                      }else {
                         uAnimator.cancel();
                      }
                   }
                }else {
                label_02a6 :
                   view2 = 0;
                }
             }else {
                goto label_02a6 ;
             }
             i6 = i6 - 1;
          }
          a.m(oj871, a.x, a.y, a.B, a.C);
          a.B();
          return true;
       }
       uArrayList = longx;
       goto label_003b ;
    }
    public final void onViewAttachedToWindow(View p0){
    }
    public final void onViewDetachedFromWindow(View p0){
       ArrayList orDefault;
       j87 tb = this.b;
       tb.getViewTreeObserver().removeOnPreDrawListener(this);
       tb.removeOnAttachStateChangeListener(this);
       k87.c.remove(tb);
       if ((orDefault = k87.b().getOrDefault(tb, null)) != null && orDefault.size() > 0) {
          Iterator iterator = orDefault.iterator();
          while (iterator.hasNext()) {
             iterator.next().A(tb);
          }
       }
       this.a.j(true);
       return;
    }
}
