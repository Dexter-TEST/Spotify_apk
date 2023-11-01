package p.f85;
import p.k85;
import java.lang.String;
import p.m85;
import p.pp;
import java.lang.Object;
import p.xe7;
import java.lang.StringBuilder;
import p.hr7;

public final class f85 extends k85	// class@00157c from classes.dex
{
    public final String a;

    public void f85(String p0){
       super();
       this.a = p0;
    }
    public final void a(m85 p0,m85 p1,pp p2,m85 p3,pp p4,m85 p5){
       p5.accept(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof f85) {
          return false;
       }
       return xe7.u(p0.a, this.a);
    }
    public final int hashCode(){
       f85 ta;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return hr7.a("InvalidRemote{error=", this.a, '}');
    }
}
