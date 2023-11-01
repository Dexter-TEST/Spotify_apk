package p.pw5;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;

public abstract class pw5	// class@0022e5 from classes.dex
{

    public static Drawable a(Resources p0,int p1,Resources$Theme p2){
       return p0.getDrawable(p1, p2);
    }
    public static Drawable b(Resources p0,int p1,int p2,Resources$Theme p3){
       return p0.getDrawableForDensity(p1, p2, p3);
    }
}
