package p.ev1;
import p.vm6;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class ev1	// class@001503 from classes.dex
{
    public final zf2 a;

    public void ev1(vm6 p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ev1) {
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
       return "SaveTotalCountFunction\(addListCountsTotal="+this.a+')';
    }
}
