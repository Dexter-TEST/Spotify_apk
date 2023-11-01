package p.s63;
import android.widget.ImageView;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public abstract class s63	// class@0025c9 from classes.dex
{

    public static ColorStateList a(ImageView p0){
       return p0.getImageTintList();
    }
    public static PorterDuff$Mode b(ImageView p0){
       return p0.getImageTintMode();
    }
    public static void c(ImageView p0,ColorStateList p1){
       p0.setImageTintList(p1);
    }
    public static void d(ImageView p0,PorterDuff$Mode p1){
       p0.setImageTintMode(p1);
    }
}
