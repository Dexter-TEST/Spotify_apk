package p.ri1;
import p.vi1;
import java.lang.String;
import p.yi1;
import p.pp;
import java.lang.Object;
import p.xe7;
import java.lang.StringBuilder;
import p.hr7;

public final class ri1 extends vi1	// class@0024f0 from classes.dex
{
    public final String a;

    public void ri1(String p0){
       super();
       this.a = p0;
    }
    public final void a(yi1 p0,yi1 p1,pp p2,yi1 p3,pp p4,yi1 p5){
       p5.accept(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ri1) {
          return false;
       }
       return xe7.u(p0.a, this.a);
    }
    public final int hashCode(){
       ri1 ta;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return hr7.a("InvalidRemote{error=", this.a, '}');
    }
}
