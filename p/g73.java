package p.g73;
import java.io.Serializable;
import java.lang.Object;
import p.ys5;
import com.google.common.collect.c;

public final class g73 implements Serializable	// class@0016b3 from classes.dex
{
    public final Object[] a;

    public void g73(Object[] p0){
       super();
       this.a = p0;
    }
    public Object readResolve(){
       return c.p(this.a);
    }
}
