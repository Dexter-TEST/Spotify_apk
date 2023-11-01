package p.dz5;
import android.graphics.drawable.Drawable;
import java.lang.Math;

public abstract class dz5 extends Drawable	// class@0013e9 from classes.dex
{
    public static final double a;
    public static final int b;

    static {
       dz5.a = Math.cos(Math.toRadians(45.00f));
    }
    public static float a(float p0,float p1,boolean p2){
       float f = 0x3fc00000;
       if (p2) {
          return (float)(((0x3ff0000000000000 - dz5.a) * (double)p1) + (double)(p0 * f));
       }
       return (p0 * f);
    }
}
