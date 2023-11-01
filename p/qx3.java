package p.qx3;
import p.vx3;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class qx3 extends vx3	// class@002432 from classes.dex
{
    public final Throwable a;

    public void qx3(Throwable p0){
       co5.o(p0, "error");
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof qx3) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return "Error\(error="+this.a+')';
    }
}
