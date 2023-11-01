package p.bf5;
import p.gf5;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import p.pp;
import p.mn1;
import java.lang.String;
import java.lang.StringBuilder;

public final class bf5 extends gf5	// class@0010b4 from classes.dex
{
    public final Throwable a;

    public void bf5(Throwable p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final void a(pp p0,mn1 p1,mn1 p2,mn1 p3,pp p4){
       p4.accept(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof bf5) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "Failure{cause="+this.a+'}';
    }
}
