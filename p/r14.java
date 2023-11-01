package p.r14;
import android.view.ViewGroup$MarginLayoutParams;

public abstract class r14	// class@002458 from classes.dex
{

    public static int a(ViewGroup$MarginLayoutParams p0){
       return p0.getLayoutDirection();
    }
    public static int b(ViewGroup$MarginLayoutParams p0){
       return p0.getMarginEnd();
    }
    public static int c(ViewGroup$MarginLayoutParams p0){
       return p0.getMarginStart();
    }
    public static boolean d(ViewGroup$MarginLayoutParams p0){
       return p0.isMarginRelative();
    }
    public static void e(ViewGroup$MarginLayoutParams p0,int p1){
       p0.resolveLayoutDirection(p1);
    }
    public static void f(ViewGroup$MarginLayoutParams p0,int p1){
       p0.setLayoutDirection(p1);
    }
    public static void g(ViewGroup$MarginLayoutParams p0,int p1){
       p0.setMarginEnd(p1);
    }
    public static void h(ViewGroup$MarginLayoutParams p0,int p1){
       p0.setMarginStart(p1);
    }
}
