package p.ym2;
import android.graphics.Rect;
import android.view.Gravity;

public abstract class ym2	// class@002de6 from classes.dex
{

    public static void a(int p0,int p1,int p2,Rect p3,int p4,int p5,Rect p6,int p7){
       Gravity.apply(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public static void b(int p0,int p1,int p2,Rect p3,Rect p4,int p5){
       Gravity.apply(p0, p1, p2, p3, p4, p5);
    }
    public static void c(int p0,Rect p1,Rect p2,int p3){
       Gravity.applyDisplay(p0, p1, p2, p3);
    }
}
