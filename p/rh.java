package p.rh;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import java.util.Locale;

public abstract class rh	// class@0024ee from classes.dex
{

    public static Drawable[] a(TextView p0){
       return p0.getCompoundDrawablesRelative();
    }
    public static void b(TextView p0,Drawable p1,Drawable p2,Drawable p3,Drawable p4){
       p0.setCompoundDrawablesRelativeWithIntrinsicBounds(p1, p2, p3, p4);
    }
    public static void c(TextView p0,Locale p1){
       p0.setTextLocale(p1);
    }
}
