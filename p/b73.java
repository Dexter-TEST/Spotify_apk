package p.b73;
import java.io.Serializable;
import p.r1;
import java.lang.Object;
import p.q1;
import java.lang.UnsupportedOperationException;

public final class b73 extends r1 implements Serializable	// class@00106a from classes.dex
{
    public final Object a;
    public final Object b;

    public void b73(Object p0,q1 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object getKey(){
       return this.a;
    }
    public final Object getValue(){
       return this.b;
    }
    public final Object setValue(Object p0){
       throw new UnsupportedOperationException();
    }
}
