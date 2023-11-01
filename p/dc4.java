package p.dc4;
import p.ec4;
import p.b43;
import java.lang.Class;
import java.lang.Object;
import p.xd1;
import java.lang.String;
import java.lang.StringBuilder;

public final class dc4 extends ec4	// class@00131f from classes.dex
{
    public final b43 a;

    public void dc4(b43 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final void a(xd1 p0,xd1 p1){
       p0.accept(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof dc4) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "View{view="+this.a+'}';
    }
}
