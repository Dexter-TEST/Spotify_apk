package p.z7;
import p.uw0;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.Math;
import java.lang.Float;
import java.util.Arrays;

public final class z7 implements uw0	// class@002ea5 from classes.dex
{
    public final uw0 a;
    public final float b;

    public void z7(float p0,uw0 p1){
       super();
       while (p1 instanceof z7) {
          z7 a = p1.a;
          p0 = p0 + a.b;
       }
       this.a = p1;
       this.b = p0;
       return;
    }
    public final float a(RectF p0){
       return Math.max(0, (this.a.a(p0) + this.b));
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof z7) {
          return false;
       }
       if (!this.a.equals(p0.a) || (p0.b - this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,Float.valueOf(this.b)};
       return Arrays.hashCode(objArray);
    }
}
