package p.p53;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import p.p3;

public abstract class p53	// class@0021f4 from classes.dex
{

    public static Drawable a(Drawable p0,Drawable p1){
       return new AdaptiveIconDrawable(p0, p1);
    }
    public static Icon b(Bitmap p0){
       return p3.j(p0);
    }
}
