package p.z52;
import p.qh3;
import java.util.List;
import p.ph3;
import java.lang.Float;
import p.wa4;
import p.et0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Object;
import p.qy;

public final class z52 extends qh3	// class@002e8d from classes.dex
{

    public void z52(List p0){
       super(p0);
    }
    public static float j(ph3 p0,float p1){
       ph3 b;
       if ((b = p0.b) == null || p0.c == null) {
          throw new IllegalStateException("Missing values for keyframe.");
       }
       if (!(-898407689 - p0.i)) {
          p0.i = b.floatValue();
       }
       b = p0.i;
       if (!(-898407689 - p0.j)) {
          p0.j = p0.c.floatValue();
       }
       return et0.l(p0.j, b, p1, b);
    }
    public final Object f(ph3 p0,float p1){
       return Float.valueOf(z52.j(p0, p1));
    }
    public final float i(){
       return z52.j(this.b(), this.c());
    }
}
