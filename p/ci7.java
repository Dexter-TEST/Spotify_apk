package p.ci7;
import android.view.ViewGroup;

public abstract class ci7	// class@001215 from classes.dex
{

    public static int a(ViewGroup p0){
       return p0.getNestedScrollAxes();
    }
    public static boolean b(ViewGroup p0){
       return p0.isTransitionGroup();
    }
    public static void c(ViewGroup p0,boolean p1){
       p0.setTransitionGroup(p1);
    }
}
