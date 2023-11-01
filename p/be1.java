package p.be1;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.drawable.InsetDrawable;

public abstract class be1	// class@0010a7 from classes.dex
{

    public static int a(Drawable p0){
       return p0.getAlpha();
    }
    public static Drawable b(DrawableContainer$DrawableContainerState p0,int p1){
       return p0.getChild(p1);
    }
    public static Drawable c(InsetDrawable p0){
       return p0.getDrawable();
    }
    public static boolean d(Drawable p0){
       return p0.isAutoMirrored();
    }
    public static void e(Drawable p0,boolean p1){
       p0.setAutoMirrored(p1);
    }
}
