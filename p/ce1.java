package p.ce1;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.graphics.ColorFilter;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public abstract class ce1	// class@0011ec from classes.dex
{

    public static void a(Drawable p0,Resources$Theme p1){
       p0.applyTheme(p1);
    }
    public static boolean b(Drawable p0){
       return p0.canApplyTheme();
    }
    public static ColorFilter c(Drawable p0){
       return p0.getColorFilter();
    }
    public static void d(Drawable p0,Resources p1,XmlPullParser p2,AttributeSet p3,Resources$Theme p4){
       p0.inflate(p1, p2, p3, p4);
    }
    public static void e(Drawable p0,float p1,float p2){
       p0.setHotspot(p1, p2);
    }
    public static void f(Drawable p0,int p1,int p2,int p3,int p4){
       p0.setHotspotBounds(p1, p2, p3, p4);
    }
    public static void g(Drawable p0,int p1){
       p0.setTint(p1);
    }
    public static void h(Drawable p0,ColorStateList p1){
       p0.setTintList(p1);
    }
    public static void i(Drawable p0,PorterDuff$Mode p1){
       p0.setTintMode(p1);
    }
}
