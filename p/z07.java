package p.z07;
import p.a17;
import java.lang.Exception;
import p.j33;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class z07 extends a17	// class@002e64 from classes.dex
{
    public final Throwable a;

    public void z07(Exception p0){
       super();
       this.a = p0;
    }
    public final Object a(j33 p0,j33 p1){
       return p1.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof z07) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "TerminalError{cause="+this.a+'}';
    }
}
