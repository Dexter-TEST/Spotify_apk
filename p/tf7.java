package p.tf7;
import p.uf7;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.qg2;
import java.lang.StringBuilder;
import p.hr7;

public final class tf7 extends uf7	// class@002761 from classes.dex
{
    public final String a;

    public void tf7(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(qg2 p0,qg2 p1,qg2 p2){
       return p0.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof tf7) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("Valid{input=", this.a, '}');
    }
}
