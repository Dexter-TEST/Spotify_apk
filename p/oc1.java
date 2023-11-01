package p.oc1;
import android.graphics.Rect;
import java.util.List;
import android.view.DisplayCutout;
import p.q3;

public abstract class oc1	// class@0020ef from classes.dex
{

    public static DisplayCutout a(Rect p0,List p1){
       return new DisplayCutout(p0, p1);
    }
    public static List b(DisplayCutout p0){
       return q3.o(p0);
    }
    public static int c(DisplayCutout p0){
       return q3.y(p0);
    }
    public static int d(DisplayCutout p0){
       return q3.B(p0);
    }
    public static int e(DisplayCutout p0){
       return q3.D(p0);
    }
    public static int f(DisplayCutout p0){
       return q3.C(p0);
    }
}
