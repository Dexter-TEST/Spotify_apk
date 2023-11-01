package p.ca;
import p.ma;
import p.h9;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class ca extends ma	// class@0011cf from classes.dex
{
    public final h9 a;

    public void ca(h9 p0){
       co5.o(p0, "failedEffect");
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ca) {
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
       return "DataLoadFailed\(failedEffect="+this.a+')';
    }
}
