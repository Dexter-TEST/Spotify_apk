package p.oo6;
import p.id4;
import java.lang.Integer;
import p.x3;
import java.lang.Object;
import p.uv1;
import p.rk2;
import p.fe;
import android.view.View;
import p.dg1;
import android.view.animation.PathInterpolator;

public final class oo6 implements id4	// class@00215f from classes.dex
{
    public final uv1 a;
    public fe b;
    public static final x3 c;
    public static final x3 t;

    static {
       oo6.c = new x3(Integer.valueOf(0));
       oo6.t = new x3(Integer.valueOf(266));
    }
    public void oo6(uv1 p0){
       super();
       this.a = p0;
    }
    public final void a(float p0){
       this.a.b.v.setAlpha(this.b.a(p0));
    }
    public final void b(){
       float f = (float)this.d();
       float f1 = (float)oo6.c.a.intValue() / f;
       float f2 = (float)oo6.t.a.intValue() / f;
       fe v7 = new fe(f1, f2, this.a.b.v.getAlpha(), 0, dg1.c);
       this.b = v7;
    }
    public final int d(){
       return (oo6.t.a.intValue() + oo6.c.a.intValue());
    }
}
