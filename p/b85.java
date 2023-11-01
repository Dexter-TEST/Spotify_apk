package p.b85;
import p.c85;
import p.uf7;
import java.lang.Class;
import java.lang.Object;
import p.d85;
import java.lang.String;
import java.lang.StringBuilder;

public final class b85 extends c85	// class@001075 from classes.dex
{
    public final uf7 a;

    public void b85(uf7 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(d85 p0,d85 p1,d85 p2){
       return p2.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof b85) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "PasswordStrengthValidationReceived{response="+this.a+'}';
    }
}
