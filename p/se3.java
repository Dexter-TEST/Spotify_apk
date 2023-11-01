package p.se3;
import p.re3;
import p.ve3;
import p.te3;
import p.ve0;
import java.lang.Object;
import java.lang.Throwable;
import p.jc7;
import java.lang.Class;
import kotlinx.coroutines.internal.a;

public final class se3 extends re3	// class@002611 from classes.dex
{
    public final ve3 v;
    public final te3 w;
    public final ve0 x;
    public final Object y;

    public void se3(ve3 p0,te3 p1,ve0 p2,Object p3){
       super();
       this.v = p0;
       this.w = p1;
       this.x = p2;
       this.y = p3;
    }
    public final Object invoke(Object p0){
       this.l(p0);
       return jc7.a;
    }
    public final void l(Throwable p0){
       se3 tv = this.v;
       tv.getClass();
       ve0 ove0 = ve3.D(this.x);
       se3 tw = this.w;
       se3 ty = this.y;
       if (ove0 == null || !tv.L(tw, ove0, ty)) {
          tv.g(tv.n(tw, ty));
       }
       return;
    }
}
