package p.c0;
import p.r45;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.NullPointerException;
import p.jg2;

public final class c0 extends r45	// class@001173 from classes.dex
{
    public static final c0 a;

    static {
       c0.a = new c0();
    }
    public void c0(){
       super();
    }
    private Object readResolve(){
       return c0.a;
    }
    public final Object b(){
       throw new IllegalStateException("Optional.get\(\) cannot be called on an absent value");
    }
    public final boolean c(){
       return false;
    }
    public final Object e(Object p0){
       if (p0 != null) {
          return p0;
       }
       throw new NullPointerException("use Optional.orNull\(\) instead of Optional.or\(null\)");
    }
    public final boolean equals(Object p0){
       boolean b = (p0 == this)? true: false;
       return b;
    }
    public final Object f(){
       return null;
    }
    public final r45 g(jg2 p0){
       return c0.a;
    }
    public final int hashCode(){
       return 0x79a31aac;
    }
    public final String toString(){
       return "Optional.absent\(\)";
    }
}
