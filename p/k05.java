package p.k05;
import p.n05;
import p.c05;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class k05 extends n05	// class@001b7f from classes.dex
{
    public final c05 a;

    public void k05(c05 p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof k05) {
          return false;
       }
       if (p0.a != this.a) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "Error{error="+this.a+'}';
    }
}
