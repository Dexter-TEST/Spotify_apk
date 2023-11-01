package p.r45;
import java.io.Serializable;
import java.lang.Object;
import p.c0;
import p.jj5;
import java.lang.Class;
import p.jg2;

public abstract class r45 implements Serializable	// class@002475 from classes.dex
{

    public void r45(){
       super();
    }
    public static r45 a(Object p0){
       p0 = (p0 == null)? c0.a: new jj5(p0);
       return p0;
    }
    public static jj5 d(Object p0){
       p0.getClass();
       return new jj5(p0);
    }
    public abstract Object b();
    public abstract boolean c();
    public abstract Object e(Object p0);
    public abstract boolean equals(Object p0);
    public abstract Object f();
    public abstract r45 g(jg2 p0);
    public abstract int hashCode();
}
