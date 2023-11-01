package p.no6;
import p.id4;
import java.lang.Integer;
import p.x3;
import java.lang.Object;
import java.lang.Float;
import p.dg1;
import p.uv1;
import p.fe;
import android.view.animation.PathInterpolator;
import p.rk2;
import android.view.View;

public final class no6 implements id4	// class@00201c from classes.dex
{
    public final fe a;
    public final uv1 b;
    public static final x3 c;
    public static final x3 t;
    public static final x3 v;
    public static final x3 w;
    public static final PathInterpolator x;

    static {
       no6.c = new x3(Integer.valueOf(0));
       no6.t = new x3(Integer.valueOf(266));
       no6.v = new x3(Float.valueOf(0));
       no6.w = new x3(Float.valueOf(0x3f800000));
       no6.x = dg1.d;
    }
    public void no6(uv1 p0){
       super();
       this.b = p0;
       float f = (float)this.d();
       float f1 = (float)no6.c.a.intValue() / f;
       float f2 = (float)no6.t.a.intValue() / f;
       fe v6 = new fe(f1, f2, no6.v.a.floatValue(), no6.w.a.floatValue(), no6.x);
       this.a = v6;
    }
    public final void a(float p0){
       this.b.b.v.setAlpha(this.a.a(p0));
    }
    public final void b(){
    }
    public final int d(){
       return (no6.t.a.intValue() + no6.c.a.intValue());
    }
}
