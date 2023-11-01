package p.wf7;
import p.kd3;
import java.util.LinkedHashMap;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class wf7 extends kd3	// class@002b2a from classes.dex
{
    public final Map d;

    public void wf7(LinkedHashMap p0){
       super(5);
       this.d = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof wf7) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.d.hashCode();
    }
    public final String toString(){
       return "InvalidDimensions\(invalidDimensions="+this.d+')';
    }
}
