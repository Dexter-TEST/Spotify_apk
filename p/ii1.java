package p.ii1;
import p.ji1;
import p.uf7;
import java.lang.Class;
import java.lang.Object;
import p.ni1;
import java.lang.String;
import java.lang.StringBuilder;

public final class ii1 extends ji1	// class@00199a from classes.dex
{
    public final uf7 a;

    public void ii1(uf7 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(ni1 p0,ni1 p1,ni1 p2){
       return p2.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ii1) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "EmailValidationReceived{response="+this.a+'}';
    }
}
