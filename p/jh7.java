package p.jh7;
import android.view.WindowInsets;
import android.view.View;
import java.lang.Object;
import android.view.View$OnApplyWindowInsetsListener;
import p.xp7;
import android.graphics.Rect;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import p.lp7;
import java.lang.reflect.Field;
import p.uv1;
import p.aa3;
import p.pp7;
import p.vp7;
import java.lang.String;
import java.lang.Throwable;
import p.j15;
import android.os.Build$VERSION;
import p.ih7;

public abstract class jh7	// class@001adb from classes.dex
{

    public static void a(WindowInsets p0,View p1){
       View$OnApplyWindowInsetsListener tag;
       if ((tag = p1.getTag(R.id.tag_window_insets_animation_callback)) != null) {
          tag.onApplyWindowInsets(p1, p0);
       }
       return;
    }
    public static xp7 b(View p0,xp7 p1,Rect p2){
       WindowInsets windowInsets;
       if ((windowInsets = p1.f()) != null) {
          return xp7.g(p0.computeSystemWindowInsets(windowInsets, p2), p0);
       }
       p2.setEmpty();
       return p1;
    }
    public static boolean c(View p0,float p1,float p2,boolean p3){
       return p0.dispatchNestedFling(p1, p2, p3);
    }
    public static boolean d(View p0,float p1,float p2){
       return p0.dispatchNestedPreFling(p1, p2);
    }
    public static boolean e(View p0,int p1,int p2,int[] p3,int[] p4){
       return p0.dispatchNestedPreScroll(p1, p2, p3, p4);
    }
    public static boolean f(View p0,int p1,int p2,int p3,int p4,int[] p5){
       return p0.dispatchNestedScroll(p1, p2, p3, p4, p5);
    }
    public static ColorStateList g(View p0){
       return p0.getBackgroundTintList();
    }
    public static PorterDuff$Mode h(View p0){
       return p0.getBackgroundTintMode();
    }
    public static float i(View p0){
       return p0.getElevation();
    }
    public static xp7 j(View p0){
       xp7 oxp7;
       Rect obj;
       if (lp7.d && p0.isAttachedToWindow()) {
          View rootView = p0.getRootView();
          try{
             if ((obj = lp7.a.get(rootView)) != null) {
                Rect rect = lp7.b.get(obj);
                obj = lp7.c.get(obj);
                if (rect != null && obj != null) {
                   uv1 ouv1 = new uv1(6);
                   ouv1.b.c(aa3.a(rect.left, rect.top, rect.right, rect.bottom));
                   ouv1.b.d(aa3.a(obj.left, obj.top, obj.right, obj.bottom));
                   oxp7 = ouv1.b.b();
                   oxp7.a.p(oxp7);
                   oxp7.a.d(p0.getRootView());
                label_0073 :
                   return oxp7;
                }
             }
          }catch(java.lang.IllegalAccessException e6){
             e6.getMessage();
          }
       }
       oxp7 = null;
       goto label_0073 ;
    }
    public static String k(View p0){
       return p0.getTransitionName();
    }
    public static float l(View p0){
       return p0.getTranslationZ();
    }
    public static float m(View p0){
       return p0.getZ();
    }
    public static boolean n(View p0){
       return p0.hasNestedScrollingParent();
    }
    public static boolean o(View p0){
       return p0.isImportantForAccessibility();
    }
    public static boolean p(View p0){
       return p0.isNestedScrollingEnabled();
    }
    public static void q(View p0,ColorStateList p1){
       p0.setBackgroundTintList(p1);
    }
    public static void r(View p0,PorterDuff$Mode p1){
       p0.setBackgroundTintMode(p1);
    }
    public static void s(View p0,float p1){
       p0.setElevation(p1);
    }
    public static void t(View p0,boolean p1){
       p0.setNestedScrollingEnabled(p1);
    }
    public static void u(View p0,j15 p1){
       if (Build$VERSION.SDK_INT < 30) {
          p0.setTag(R.id.tag_on_apply_window_listener, p1);
       }
       if (p1 == null) {
          p0.setOnApplyWindowInsetsListener(p0.getTag(R.id.tag_window_insets_animation_callback));
          return;
       }else {
          p0.setOnApplyWindowInsetsListener(new ih7(p0, p1));
          return;
       }
    }
    public static void v(View p0,String p1){
       p0.setTransitionName(p1);
    }
    public static void w(View p0,float p1){
       p0.setTranslationZ(p1);
    }
    public static void x(View p0,float p1){
       p0.setZ(p1);
    }
    public static boolean y(View p0,int p1){
       return p0.startNestedScroll(p1);
    }
    public static void z(View p0){
       p0.stopNestedScroll();
    }
}
