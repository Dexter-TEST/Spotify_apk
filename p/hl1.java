package p.hl1;
import java.io.Serializable;
import p.qb1;
import java.lang.Object;
import com.google.common.collect.a;

public final class hl1 implements Serializable	// class@001872 from classes.dex
{
    public final qb1 a;

    public void hl1(qb1 p0){
       super();
       this.a = p0;
    }
    private Object readResolve(){
       return new a(this.a);
    }
}
