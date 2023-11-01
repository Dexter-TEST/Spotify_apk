package p.fh7;
import android.view.View;
import android.graphics.Rect;

public abstract class fh7	// class@0015cd from classes.dex
{

    public static Rect a(View p0){
       return p0.getClipBounds();
    }
    public static boolean b(View p0){
       return p0.isInLayout();
    }
    public static void c(View p0,Rect p1){
       p0.setClipBounds(p1);
    }
}
