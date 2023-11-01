package p.fg1;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import p.rr0;

public abstract class fg1	// class@0015be from classes.dex
{

    public static EdgeEffect a(Context p0,AttributeSet p1){
       return new EdgeEffect(p0, p1);
    }
    public static float b(EdgeEffect p0){
       return rr0.a(p0);
    }
    public static float c(EdgeEffect p0,float p1,float p2){
       return rr0.b(p0, p1, p2);
    }
}
