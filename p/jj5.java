package p.jj5;
import p.r45;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import p.jg2;
import p.ap5;
import java.lang.StringBuilder;

public final class jj5 extends r45	// class@001aeb from classes.dex
{
    public final Object a;

    public void jj5(Object p0){
       super();
       this.a = p0;
    }
    public final Object b(){
       return this.a;
    }
    public final boolean c(){
       return true;
    }
    public final Object e(Object p0){
       if (p0 != null) {
          return this.a;
       }
       throw new NullPointerException("use Optional.orNull\(\) instead of Optional.or\(null\)");
    }
    public final boolean equals(Object p0){
       if (p0 instanceof jj5) {
          return this.a.equals(p0.a);
       }
       return false;
    }
    public final Object f(){
       return this.a;
    }
    public final r45 g(jg2 p0){
       p0 = p0.apply(this.a);
       ap5.g(p0, "the Function passed to Optional.transform\(\) must not return null.");
       return new jj5(p0);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0x598df91c);
    }
    public final String toString(){
       return "Optional.of\("+this.a+"\)";
    }
}
