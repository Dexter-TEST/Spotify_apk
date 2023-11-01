package p.j85;
import p.k85;
import p.i85;
import p.m85;
import p.pp;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class j85 extends k85	// class@001a88 from classes.dex
{
    public final k85 a;

    public void j85(i85 p0){
       super();
       this.a = p0;
    }
    public final void a(m85 p0,m85 p1,pp p2,m85 p3,pp p4,m85 p5){
       p4.accept(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof j85) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "WaitingForRemoteValidation{otherwise="+this.a+'}';
    }
}
