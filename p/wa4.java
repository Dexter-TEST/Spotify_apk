package p.wa4;
import android.graphics.PointF;
import java.lang.Math;

public abstract class wa4	// class@002afa from classes.dex
{
    public static final PointF a;

    static {
       wa4.a = new PointF();
    }
    public static PointF a(PointF p0,PointF p1){
       return new PointF((p0.x + p1.x), (p0.y + p1.y));
    }
    public static float b(float p0,float p1,float p2){
       return Math.max(p1, Math.min(p2, p0));
    }
    public static int c(float p0,float p1){
       int i = (int)p0;
       int i1 = (int)p1;
       int i2 = i / i1;
       int i3 = (((i ^ i1)) >= 0)? 1: 0;
       int i4 = i % i1;
       if (!i3 && i4) {
          i2 = i2 - 1;
       }
       return (i - (i1 * i2));
    }
}
