package p.fe;
import android.view.animation.PathInterpolator;
import java.lang.Object;
import p.ap5;
import java.lang.Boolean;
import p.tu6;
import android.animation.TimeInterpolator;

public final class fe	// class@0015b3 from classes.dex
{
    public final float a;
    public final float b;
    public final Interpolator c;
    public final float d;
    public final float e;

    public void fe(float p0,float p1,float p2,float p3,PathInterpolator p4){
       super();
       boolean b = false;
       int i = 0x3f800000;
       boolean i1 = 0;
       boolean b1 = ((i1 - p0) >= 0 && (p0 - i) < 0)? true: false;
       ap5.e(b1);
       i1 = ((i1 - p1) > 0)? true: false;
       ap5.e(i1);
       p1 = p1 + p0;
       if ((p1 - i) <= 0) {
          b = true;
       }
       ap5.e(b);
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.e = p3;
       this.c = p4;
       return;
    }
    public final float a(float p0){
       boolean b = false;
       boolean b1 = ((0 - p0) >= 0)? true: false;
       float f = 0x3f800000;
       if ((p0 - f) <= 0) {
          b = true;
       }
       ap5.d(Boolean.valueOf(b), b1);
       fe tb = this.b;
       fe ta = this.a;
       float f1 = tb - ta;
       if (!(0 - f1)) {
          f1 = f / tb;
       }
       p0 = this.c.getInterpolation(tu6.k(0, f, ((p0 - ta) / f1)));
       return ((this.e * p0) + ((f - p0) * this.d));
    }
}
