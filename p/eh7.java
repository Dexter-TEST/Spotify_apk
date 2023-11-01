package p.eh7;
import android.view.View;
import android.view.Display;
import android.graphics.Paint;

public abstract class eh7	// class@00148c from classes.dex
{

    public static int a(){
       return View.generateViewId();
    }
    public static Display b(View p0){
       return p0.getDisplay();
    }
    public static int c(View p0){
       return p0.getLabelFor();
    }
    public static int d(View p0){
       return p0.getLayoutDirection();
    }
    public static int e(View p0){
       return p0.getPaddingEnd();
    }
    public static int f(View p0){
       return p0.getPaddingStart();
    }
    public static boolean g(View p0){
       return p0.isPaddingRelative();
    }
    public static void h(View p0,int p1){
       p0.setLabelFor(p1);
    }
    public static void i(View p0,Paint p1){
       p0.setLayerPaint(p1);
    }
    public static void j(View p0,int p1){
       p0.setLayoutDirection(p1);
    }
    public static void k(View p0,int p1,int p2,int p3,int p4){
       p0.setPaddingRelative(p1, p2, p3, p4);
    }
}
