package p.qp7;
import p.vp7;
import p.xp7;
import android.view.WindowInsets;
import p.aa3;
import java.lang.Math;
import android.view.View;
import android.os.Build$VERSION;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import android.graphics.Rect;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import android.util.Log;
import java.lang.UnsupportedOperationException;
import java.lang.Class;
import java.lang.reflect.AccessibleObject;
import java.util.Objects;
import p.uv1;
import p.pp7;
import p.pc1;
import android.view.DisplayCutout;
import p.oc1;

public abstract class qp7 extends vp7	// class@0023ef from classes.dex
{
    public final WindowInsets c;
    public aa3[] d;
    public aa3 e;
    public xp7 f;
    public aa3 g;
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;

    public void qp7(xp7 p0,WindowInsets p1){
       super(p0);
       this.e = null;
       this.c = p1;
    }
    private aa3 r(int p0,boolean p1){
       int i1;
       aa3 e = aa3.e;
       int i = 1;
       while (i <= 256) {
          if (i1 = p0 & i) {
             aa3 uoaa3 = this.s(i, p1);
             e = aa3.a(Math.max(e.a, uoaa3.a), Math.max(e.b, uoaa3.b), Math.max(e.c, uoaa3.c), Math.max(e.d, uoaa3.d));
          }
          i = i << 1;
       }
       return e;
    }
    private aa3 t(){
       qp7 tf;
       if ((tf = this.f) != null) {
          return tf.a.h();
       }
       return aa3.e;
    }
    private aa3 u(View p0){
       Rect rect;
       if (Build$VERSION.SDK_INT >= 30) {
          throw new UnsupportedOperationException("getVisibleInsets\(\) should not be called on API >= 30. Use WindowInsets.isVisible\(\) instead.");
       }
       if (!qp7.h) {
          qp7.v();
       }
       Method i = qp7.i;
       aa3 uoaa3 = null;
       if (i != null && (qp7.j != null && qp7.k != null)) {
          int i1 = 0;
          try{
             Object[] objArray = new Object[i1];
             if ((p0 = i.invoke(p0, objArray)) == null) {
                return uoaa3;
             }else if((rect = qp7.k.get(qp7.l.get(p0))) != null){
                uoaa3 = aa3.a(rect.left, rect.top, rect.right, rect.bottom);
             }
             return uoaa3;
          }catch(java.lang.ReflectiveOperationException e5){
             Log.e("WindowInsetsCompat", "Failed to get visible insets. \(Reflection error\). "+e5.getMessage(), e5);
          }
       label_005a :
          return uoaa3;
       }else {
          goto label_005a ;
       }
    }
    private static void v(){
       boolean b = true;
       try{
          Class[] uClassArray = new Class[0];
          qp7.i = View.class.getDeclaredMethod("getViewRootImpl", uClassArray);
          Class uClass = Class.forName("android.view.View$AttachInfo");
          qp7.j = uClass;
          qp7.k = uClass.getDeclaredField("mVisibleInsets");
          qp7.l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
          qp7.k.setAccessible(b);
          qp7.l.setAccessible(b);
       }catch(java.lang.ReflectiveOperationException e1){
          Log.e("WindowInsetsCompat", "Failed to get visible insets. \(Reflection error\). "+e1.getMessage(), e1);
       }
       qp7.h = b;
       return;
    }
    public void d(View p0){
       aa3 uoaa3;
       if ((uoaa3 = this.u(p0)) == null) {
          uoaa3 = aa3.e;
       }
       this.w(uoaa3);
       return;
    }
    public boolean equals(Object p0){
       if (!super.equals(p0)) {
          return false;
       }
       return Objects.equals(this.g, p0.g);
    }
    public aa3 f(int p0){
       return this.r(p0, false);
    }
    public final aa3 j(){
       if (this.e == null) {
          qp7 tc = this.c;
          int systemWindow = tc.getSystemWindowInsetLeft();
          int systemWindow1 = tc.getSystemWindowInsetTop();
          int systemWindow2 = tc.getSystemWindowInsetRight();
          this.e = aa3.a(systemWindow, systemWindow1, systemWindow2, tc.getSystemWindowInsetBottom());
       }
       return this.e;
    }
    public xp7 l(int p0,int p1,int p2,int p3){
       uv1 ouv1 = new uv1(xp7.g(this.c, null));
       ouv1.b.d(xp7.e(this.j(), p0, p1, p2, p3));
       ouv1.b.c(xp7.e(this.h(), p0, p1, p2, p3));
       return ouv1.b.b();
    }
    public boolean n(){
       return this.c.isRound();
    }
    public void o(aa3[] p0){
       this.d = p0;
    }
    public void p(xp7 p0){
       this.f = p0;
    }
    public aa3 s(int p0,boolean p1){
       aa3 e;
       qp7 tf;
       pc1 opc1;
       int sDK_INT;
       aa3 d;
       qp7 tf1;
       int i = 0;
       if (p0 != 1) {
          aa3 uoaa3 = null;
          if (p0 != 2) {
             e = aa3.e;
             if (p0 != 8) {
                if (p0 != 16) {
                   if (p0 != 32) {
                      if (p0 != 64) {
                         if (p0 != 128) {
                            return e;
                         }else if((tf = this.f) != null){
                            opc1 = tf.a.e();
                         }else {
                            opc1 = this.e();
                         }
                         if (opc1 != null) {
                            sDK_INT = Build$VERSION.SDK_INT;
                            opc1 = opc1.a;
                            int i1 = (sDK_INT >= 28)? oc1.d(opc1): 0;
                            int i2 = (sDK_INT >= 28)? oc1.f(opc1): 0;
                            int i3 = (sDK_INT >= 28)? oc1.e(opc1): 0;
                            if (sDK_INT >= 28) {
                               i = oc1.c(opc1);
                            }
                            return aa3.a(i1, i2, i3, i);
                         }else {
                            return e;
                         }
                      }else {
                         return this.k();
                      }
                   }else {
                      return this.g();
                   }
                }else {
                   return this.i();
                }
             }else if((tf = this.d) != null){
                uoaa3 = tf[3];
             }
             if (uoaa3 != null) {
                return uoaa3;
             }else {
                aa3 uoaa31 = this.t();
                if ((d = this.j().d) > uoaa31.d) {
                   return aa3.a(i, i, i, d);
                }else if((tf = this.g) != null && (!tf.equals(e) && (d = this.g.d) > uoaa31.d)){
                   return aa3.a(i, i, i, d);
                }else {
                   return e;
                }
             }
          }else if(p1){
             d = this.t();
             e = this.h();
             return aa3.a(Math.max(d.a, e.a), i, Math.max(d.c, e.c), Math.max(d.d, e.d));
          }else {
             d = this.j();
             if ((tf1 = this.f) != null) {
                uoaa3 = tf1.a.h();
             }
             e = d.d;
             if (uoaa3 != null) {
                sDK_INT = Math.min(e, uoaa3.d);
             }
             return aa3.a(d.a, i, d.c, sDK_INT);
          }
       }else if(p1){
          return aa3.a(i, Math.max(this.t().b, this.j().b), i, i);
       }else {
          return aa3.a(i, this.j().b, i, i);
       }
    }
    public void w(aa3 p0){
       this.g = p0;
    }
}
