package p.xm6;
import java.lang.Runnable;
import p.ym6;
import p.zf2;
import p.rv;
import java.lang.StackTraceElement;
import java.lang.Object;
import java.lang.Integer;
import android.view.View;
import java.lang.String;
import p.co5;
import android.content.Context;
import p.tm6;
import p.um6;
import p.r45;
import java.lang.CharSequence;
import p.mm6;
import android.view.View$OnClickListener;
import p.rz;
import p.qz;
import p.ye7;
import android.content.res.ColorStateList;
import p.n6;
import p.i70;
import p.wh7;
import p.j15;
import p.jh7;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import p.av0;
import java.lang.StringBuilder;
import p.jl;
import p.wm6;
import java.util.ArrayList;
import p.o60;
import p.sm6;
import java.util.List;
import p.dj0;
import android.app.Activity;
import p.av6;
import java.util.Iterator;
import java.lang.Iterable;
import p.aj0;
import p.vv7;
import java.lang.Comparable;
import p.cs3;
import p.tp2;
import java.lang.IllegalArgumentException;
import java.lang.Appendable;
import java.lang.Throwable;

public final class xm6 implements Runnable	// class@002ca9 from classes.dex
{
    public final ym6 a;
    public final zf2 b;
    public final rv c;
    public final StackTraceElement[] t;

    public void xm6(ym6 p0,zf2 p1,rv p2,StackTraceElement[] p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       super();
    }
    public final void run(){
       String str1;
       Activity uActivity;
       String obj;
       int i2;
       int i4;
       int i5;
       Integer integer;
       xm6 ta = this.a;
       void ovoid = null;
       xm6 tb = this.b;
       View view = (ta.a != null)? tb.invoke(Integer.valueOf(R.id.snackbarContainer)): ovoid;
       if (view == null) {
          view = tb.invoke(Integer.valueOf(R.id.content));
       }
       int i = 1;
       int i1 = 0;
       xm6 tt = this.t;
       xm6 tc = this.c;
       if (view != null) {
          rv b = tc.b;
          co5.l(b, "infoTextRes\(\)");
          Context context = view.getContext();
          co5.l(context, "snackbarContainer.context");
          String str = ym6.b(b, context, new tm6(i, tc), new um6(ta, tc, tt, i));
          rv d = tc.d;
          co5.l(d, "actionTextRes\(\)");
          Context context1 = view.getContext();
          co5.l(context1, "snackbarContainer.context");
          if ((str1 = ym6.b(d, context1, new tm6(i1, tc), new um6(ta, tc, tt, i1))) != null) {
             tt = (str1.length() > 0)? 1: 0;
             if (tt == i) {
             label_0078 :
                i = (i)? 5000: 3000;
                mm6 omm6 = mm6.f(i, view, str);
                omm6.g(str1, tc.e);
                rz c = omm6.c;
                c.setAnimationMode(ta.b);
                i1 = 0x7f05053e;
                rz b1 = omm6.b;
                if (ta.a != null) {
                   c.setBackgroundResource(R.drawable.bg_floating_snackbar_view);
                   ye7.d(omm6);
                   ye7.b(omm6);
                   omm6.h(n6.c(b1, i1));
                   jh7.u(c, i70.D);
                   ViewGroup$LayoutParams layoutParams = c.getLayoutParams();
                   i1 = 0x800053;
                   if (layoutParams instanceof FrameLayout$LayoutParams) {
                      layoutParams.gravity = i1;
                   }else if(layoutParams instanceof av0){
                      layoutParams.c = i1;
                   }else {
                      jl.d("This "+layoutParams+" does not yet have support for applying gravity.");
                   }
                }else {
                   c.setBackgroundColor(n6.b(b1, R.color.white));
                   ye7.d(omm6);
                   ye7.b(omm6);
                   omm6.h(n6.c(b1, i1));
                }
                omm6.i();
                ta.f = omm6;
                wm6 owm6 = new wm6(ta, tc, omm6);
                if (omm6.l == null) {
                   omm6.l = new ArrayList();
                }
                omm6.l.add(owm6);
             }
          }
          i = 0;
          goto label_0078 ;
       }else {
          ta.c.a(tc);
          str1 = "\n                        SnackbarManager couldn\'t find a CoordinatorLayout in\n                        Activity:";
          String localClassNa = ((uActivity = dj0.l0(ta.g)) != null)? uActivity.getLocalClassName(): ovoid;
          localClassNa = str1+localClassNa+" with the id set as `content` or\n                        `snackbarContainer`. This view is required to anchor the snackbar view at the proper position.\n                        This might be happening because:\n                        - The `show` method was called from a screen that doesn\'t contain the required view.\n                        - A RX Observable that was not disposed properly emitted a value when the screen with the\n                          required view was destroyed. For example, your feature calls show and navigate to another\n                          screen that doesn\'t have that container.\n                        - A background service called the `show` method inside a screen that doesn\'t contain the\n                          required view.\n                        If you are facing this issue, please make sure to call `show` or `showInView` from a screen that\n                        contains the required view. If you need further support, please reach out to #encore and we\n                        can try to help you identify the culprit.\n                    ";
          co5.o(localClassNa, "<this>");
          List list = av6.s0(localClassNa);
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             if (i2 = av6.p0(obj) ^ i) {
                uArrayList.add(obj);
             }
          }
          ArrayList uArrayList1 = new ArrayList(aj0.b0(uArrayList));
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             obj = iterator1.next();
             i2 = obj.length();
             int i3 = 0;
             while (true) {
                i4 = -1;
                if (i3 < i2) {
                   if (i5 = vv7.z(obj.charAt(i3)) ^ i) {
                   label_019a :
                      if (i3 == i4) {
                         i3 = obj.length();
                      }
                      uArrayList1.add(Integer.valueOf(i3));
                   }else {
                      i3 = i3 + 1;
                   }
                }else {
                   i3 = -1;
                   goto label_019a ;
                }
             }
          }
          Iterator iterator2 = uArrayList1.iterator();
          if (!iterator2.hasNext()) {
             integer = ovoid;
          }else {
             integer = iterator2.next();
             while (iterator2.hasNext()) {
                Comparable uComparable = iterator2.next();
                if (integer.compareTo(uComparable) > 0) {
                   integer = uComparable;
                }
             }
          }
          i = (integer != null)? integer.intValue(): 0;
          int i6 = (list.size() * 0) + localClassNa.length();
          cs3 t = cs3.t;
          int i7 = ye7.B(list);
          ArrayList uArrayList2 = new ArrayList();
          Iterator iterator3 = list.iterator();
          i2 = 0;
          while (true) {
             if (iterator3.hasNext()) {
                Object obj1 = iterator3.next();
                i4 = i2 + 1;
                if (i2 >= 0) {
                   if (i2 && (i2 != i7 || !av6.p0(obj1))) {
                      co5.o(obj1, "<this>");
                      i2 = (i >= 0)? 1: 0;
                      if (i2) {
                         i2 = obj1.length();
                         if (i <= i2) {
                            i2 = i;
                         }
                         String str2 = obj1.substring(i2);
                         co5.l(str2, "this as java.lang.String\).substring\(startIndex\)");
                         if ((str2 = t.invoke(str2)) != null) {
                            obj1 = str2;
                         }
                      }else {
                         throw new IllegalArgumentException(tp2.l("Requested character count ", i, " is less than zero.").toString());
                      }
                   }else {
                      obj1 = ovoid;
                   }
                   if (obj1 != null) {
                      uArrayList2.add(obj1);
                   }
                   i2 = i4;
                }else {
                   ye7.W();
                   throw ovoid;
                }
             }else {
                localClassNa = new StringBuilder(i6);
                dj0.p0(uArrayList2, localClassNa);
                localClassNa = localClassNa;
                co5.l(localClassNa, "mapIndexedNotNull { inde…"\\n\"\)\n        .toString\(\)");
                sm6 osm6 = new sm6(localClassNa, ovoid, tt);
                jl.f(osm6.a, osm6);
                break ;
             }
          }
       }
       return;
    }
}
