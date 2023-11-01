package p.rv3;
import android.view.animation.Interpolator;
import java.lang.Object;
import java.lang.Math;
import p.et0;

public abstract class rv3 implements Interpolator	// class@002566 from classes.dex
{
    public final float[] a;
    public final float b;

    public void rv3(float[] p0){
       super();
       this.a = p0;
       this.b = 0x3f800000 / (float)(p0.length - 1);
    }
    public final float getInterpolation(float p0){
       float f = 0x3f800000;
       if ((f - p0) >= 0) {
          return f;
       }
       f = 0;
       if ((p0 - f) <= 0) {
          return f;
       }
       rv3 ta = this.a;
       int i = Math.min((int)((float)(ta.length - 1) * p0), (ta.length - 2));
       rv3 tb = this.b;
       return et0.l(ta[(i + 1)], ta[i], ((p0 - ((float)i * tb)) / tb), ta[i]);
    }
}
