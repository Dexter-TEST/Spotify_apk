package p.v27;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Locale;

public abstract class v27	// class@00296e from classes.dex
{

    public static Drawable[] a(TextView p0){
       return p0.getCompoundDrawablesRelative();
    }
    public static int b(View p0){
       return p0.getLayoutDirection();
    }
    public static int c(View p0){
       return p0.getTextDirection();
    }
    public static Locale d(TextView p0){
       return p0.getTextLocale();
    }
    public static void e(TextView p0,Drawable p1,Drawable p2,Drawable p3,Drawable p4){
       p0.setCompoundDrawablesRelative(p1, p2, p3, p4);
    }
    public static void f(TextView p0,int p1,int p2,int p3,int p4){
       p0.setCompoundDrawablesRelativeWithIntrinsicBounds(p1, p2, p3, p4);
    }
    public static void g(TextView p0,Drawable p1,Drawable p2,Drawable p3,Drawable p4){
       p0.setCompoundDrawablesRelativeWithIntrinsicBounds(p1, p2, p3, p4);
    }
    public static void h(View p0,int p1){
       p0.setTextDirection(p1);
    }
}
