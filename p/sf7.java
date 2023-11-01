package p.sf7;
import p.uf7;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.qg2;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class sf7 extends uf7	// class@00261d from classes.dex
{
    public final String a;
    public final String b;

    public void sf7(String p0,String p1){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final Object a(qg2 p0,qg2 p1,qg2 p2){
       return p1.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof sf7) {
          return false;
       }
       if (!p0.a.equals(this.a) || !p0.b.equals(this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + tp2.g(this.a, 0, 31));
    }
    public final String toString(){
       return hr7.a("Invalid{input="+this.a+", message=", this.b, '}');
    }
}
