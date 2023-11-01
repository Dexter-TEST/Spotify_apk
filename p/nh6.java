package p.nh6;
import java.lang.Object;
import p.ks6;
import p.ys5;
import p.mv;
import com.google.common.collect.c;
import p.w51;

public abstract class nh6	// class@001fdd from classes.dex
{

    public void nh6(){
       super();
    }
    public final ks6 a(){
       return this.b().get(this.e);
    }
    public final ys5 b(){
       ys5 oys5;
       mv omv = this;
       mv b = omv.b;
       mv a = omv.a;
       mv c = omv.c;
       if (omv.j != null) {
          Object[] objArray = new Object[]{c,a,b};
          w51.e(3, objArray);
          oys5 = c.m(3, objArray);
       }else {
          oys5 = c.s(c, omv.d, a, b);
       }
       return oys5;
    }
}
