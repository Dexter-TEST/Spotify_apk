package p.bk5;
import p.ek5;
import p.w87;
import p.u73;
import p.fk5;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class bk5 extends ek5	// class@0010e1 from classes.dex
{
    public final w87 a;
    public final u73 b;

    public void bk5(w87 p0,u73 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object a(fk5 p0,fk5 p1,fk5 p2,fk5 p3,fk5 p4,fk5 p5,fk5 p6){
       return p3.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof bk5) {
          return false;
       }
       if (!p0.a.equals(this.a) || !p0.b.equals(this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + ((this.a.hashCode() + 0) * 31));
    }
    public final String toString(){
       return "MessageReceived{trigger="+this.a+", message="+this.b+'}';
    }
}
