package p.ws5;
import java.io.Serializable;
import p.no5;
import p.qb1;
import java.lang.Object;
import com.google.common.collect.f;

public final class ws5 implements Serializable	// class@002b9a from classes.dex
{
    public final no5 a;
    public final qb1 b;

    public void ws5(no5 p0,qb1 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    private Object readResolve(){
       return new f(this.a, this.b);
    }
}
