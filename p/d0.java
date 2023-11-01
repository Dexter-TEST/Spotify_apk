package p.d0;
import p.uw0;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.Float;
import java.util.Arrays;

public final class d0 implements uw0	// class@0012b7 from classes.dex
{
    public final float a;

    public void d0(float p0){
       super();
       this.a = p0;
    }
    public final float a(RectF p0){
       return this.a;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof d0) {
          return false;
       }
       if (p0.a - this.a) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{Float.valueOf(this.a)};
       return Arrays.hashCode(objArray);
    }
}
