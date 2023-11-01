package p.iv1;
import p.tm6;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class iv1	// class@001a0d from classes.dex
{
    public final wf2 a;

    public void iv1(tm6 p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof iv1) {
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
       return "getCountFunction\(listCountsTotalList="+this.a+')';
    }
}
