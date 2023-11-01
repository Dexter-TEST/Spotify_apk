package p.na5;
import p.sa5;
import p.h;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.qg2;
import p.xc5;
import p.tp2;
import java.lang.Integer;
import java.lang.StringBuilder;

public final class na5 extends sa5	// class@001f9d from classes.dex
{
    public final h a;
    public final String b;
    public final int c;
    public final int d;

    public void na5(h p0,String p1,int p2,int p3){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final Object a(qg2 p0,qg2 p1,xc5 p2,xc5 p3,xc5 p4){
       return p0.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof na5) {
          return false;
       }
       if (p0.c != this.c || (p0.d != this.d || (!p0.a.equals(this.a) || !p0.b.equals(this.b)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (Integer.valueOf(this.d).hashCode() + ((Integer.valueOf(this.c).hashCode() + tp2.g(this.b, ((this.a.hashCode() + 0) * 31), 31)) * 31));
    }
    public final String toString(){
       return tp2.n("Challenge{context="+this.a+", canonicalPhoneNumber="+this.b+", ttlS="+this.c+", codeLength=", this.d, '}');
    }
}
