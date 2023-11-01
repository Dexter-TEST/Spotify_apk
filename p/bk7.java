package p.bk7;
import android.view.ViewParent;
import android.view.View;

public abstract class bk7	// class@0010e3 from classes.dex
{

    public static boolean a(ViewParent p0,View p1,float p2,float p3,boolean p4){
       return p0.onNestedFling(p1, p2, p3, p4);
    }
    public static boolean b(ViewParent p0,View p1,float p2,float p3){
       return p0.onNestedPreFling(p1, p2, p3);
    }
    public static void c(ViewParent p0,View p1,int p2,int p3,int[] p4){
       p0.onNestedPreScroll(p1, p2, p3, p4);
    }
    public static void d(ViewParent p0,View p1,int p2,int p3,int p4,int p5){
       p0.onNestedScroll(p1, p2, p3, p4, p5);
    }
    public static void e(ViewParent p0,View p1,View p2,int p3){
       p0.onNestedScrollAccepted(p1, p2, p3);
    }
    public static boolean f(ViewParent p0,View p1,View p2,int p3){
       return p0.onStartNestedScroll(p1, p2, p3);
    }
    public static void g(ViewParent p0,View p1){
       p0.onStopNestedScroll(p1);
    }
}
