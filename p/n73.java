package p.n73;
import java.io.Serializable;
import java.lang.Object;
import com.google.common.collect.d;

public final class n73 implements Serializable	// class@001f7f from classes.dex
{
    public final Object[] a;

    public void n73(Object[] p0){
       super();
       this.a = p0;
    }
    public Object readResolve(){
       return d.p(this.a);
    }
}
