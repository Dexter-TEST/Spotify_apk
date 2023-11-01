package p.dh7;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.ViewParent;
import android.os.Bundle;
import java.lang.Runnable;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.graphics.drawable.Drawable;

public abstract class dh7	// class@00134c from classes.dex
{

    public static AccessibilityNodeProvider a(View p0){
       return p0.getAccessibilityNodeProvider();
    }
    public static boolean b(View p0){
       return p0.getFitsSystemWindows();
    }
    public static int c(View p0){
       return p0.getImportantForAccessibility();
    }
    public static int d(View p0){
       return p0.getMinimumHeight();
    }
    public static int e(View p0){
       return p0.getMinimumWidth();
    }
    public static ViewParent f(View p0){
       return p0.getParentForAccessibility();
    }
    public static int g(View p0){
       return p0.getWindowSystemUiVisibility();
    }
    public static boolean h(View p0){
       return p0.hasOverlappingRendering();
    }
    public static boolean i(View p0){
       return p0.hasTransientState();
    }
    public static boolean j(View p0,int p1,Bundle p2){
       return p0.performAccessibilityAction(p1, p2);
    }
    public static void k(View p0){
       p0.postInvalidateOnAnimation();
    }
    public static void l(View p0,int p1,int p2,int p3,int p4){
       p0.postInvalidateOnAnimation(p1, p2, p3, p4);
    }
    public static void m(View p0,Runnable p1){
       p0.postOnAnimation(p1);
    }
    public static void n(View p0,Runnable p1,long p2){
       p0.postOnAnimationDelayed(p1, p2);
    }
    public static void o(ViewTreeObserver p0,ViewTreeObserver$OnGlobalLayoutListener p1){
       p0.removeOnGlobalLayoutListener(p1);
    }
    public static void p(View p0){
       p0.requestFitSystemWindows();
    }
    public static void q(View p0,Drawable p1){
       p0.setBackground(p1);
    }
    public static void r(View p0,boolean p1){
       p0.setHasTransientState(p1);
    }
    public static void s(View p0,int p1){
       p0.setImportantForAccessibility(p1);
    }
}
