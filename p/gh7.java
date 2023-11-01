package p.gh7;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public abstract class gh7	// class@00170e from classes.dex
{

    public static int a(View p0){
       return p0.getAccessibilityLiveRegion();
    }
    public static boolean b(View p0){
       return p0.isAttachedToWindow();
    }
    public static boolean c(View p0){
       return p0.isLaidOut();
    }
    public static boolean d(View p0){
       return p0.isLayoutDirectionResolved();
    }
    public static void e(ViewParent p0,View p1,View p2,int p3){
       p0.notifySubtreeAccessibilityStateChanged(p1, p2, p3);
    }
    public static void f(View p0,int p1){
       p0.setAccessibilityLiveRegion(p1);
    }
    public static void g(AccessibilityEvent p0,int p1){
       p0.setContentChangeTypes(p1);
    }
}
