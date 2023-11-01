package p.af2;
import java.lang.Object;
import android.view.View;
import java.util.List;
import p.wh7;
import java.lang.String;
import p.jh7;
import android.view.ViewGroup;
import android.graphics.Rect;
import p.gh7;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.view.ViewParent;
import java.lang.Math;
import java.util.ArrayList;
import p.ac0;
import p.ka0;

public abstract class af2	// class@000f6e from classes.dex
{

    public void af2(){
       super();
    }
    public static void d(View p0,List p1){
       View view;
       int i = p1.size();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             if (p1.get(i1) == p0) {
                i1 = 1;
             label_0015 :
                if (i1) {
                   break ;
                }else if(jh7.k(p0) != null){
                   p1.add(p0);
                }
                int i2 = i;
                while (i2 < p1.size()) {
                   view = p1.get(i2);
                   if (view instanceof ViewGroup) {
                      int childCount = view.getChildCount();
                      int i3 = 0;
                      while (i3 < childCount) {
                         View childAt = view.getChildAt(i3);
                         int i4 = 0;
                         while (true) {
                            if (i4 < i) {
                               if (p1.get(i4) == childAt) {
                                  i4 = 1;
                               label_0050 :
                                  if (!i4 && jh7.k(childAt) != null) {
                                     p1.add(childAt);
                                  }
                                  i3 = i3 + 1;
                               }else {
                                  i4 = i4 + 1;
                               }
                            }else {
                               i4 = 0;
                               goto label_0050 ;
                            }
                         }
                      }
                   }
                   i2++;
                }
                return;
             }else {
                i1 = i1 + 1;
             }
          }else {
             view = 0;
             goto label_0015 ;
          }
       }
       return;
    }
    public static void g(View p0,Rect p1){
       if (!gh7.b(p0)) {
          return;
       }
       RectF rectF = new RectF();
       rectF.set(0, 0, (float)p0.getWidth(), (float)p0.getHeight());
       p0.getMatrix().mapRect(rectF);
       rectF.offset((float)p0.getLeft(), (float)p0.getTop());
       ViewParent parent = p0.getParent();
       while (parent instanceof View) {
          int i = - parent.getScrollX();
          int i1 = - parent.getScrollY();
          rectF.offset((float)i, (float)i1);
          parent.getMatrix().mapRect(rectF);
          rectF.offset((float)parent.getLeft(), (float)parent.getTop());
          parent = parent.getParent();
       }
       int[] ointArray = new int[2];
       p0.getRootView().getLocationOnScreen(ointArray);
       rectF.offset((float)ointArray[0], (float)ointArray[1]);
       p1.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
       return;
    }
    public static boolean h(List p0){
       boolean b = (p0 != null && !p0.isEmpty())? false: true;
       return b;
    }
    public abstract void a(View p0,Object p1);
    public abstract void b(Object p0,ArrayList p1);
    public abstract void c(ViewGroup p0,Object p1);
    public abstract boolean e(Object p0);
    public abstract Object f(Object p0);
    public abstract Object i(Object p0,Object p1,Object p2);
    public abstract Object j(Object p0,Object p1);
    public abstract void k(Object p0,View p1,ArrayList p2);
    public abstract void l(Object p0,Object p1,ArrayList p2,Object p3,ArrayList p4);
    public abstract void m(View p0,Object p1);
    public abstract void n(Object p0,Rect p1);
    public abstract void o(Object p0,ac0 p1,ka0 p2);
    public abstract void p(Object p0,View p1,ArrayList p2);
    public abstract void q(Object p0,ArrayList p1,ArrayList p2);
    public abstract Object r(Object p0);
}
