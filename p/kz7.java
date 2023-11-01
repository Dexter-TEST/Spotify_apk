package p.kz7;
import p.g18;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.StringBuilder;

public final class kz7 extends g18	// class@001cb4 from classes.dex
{
    public final List a;

    public void kz7(ArrayList p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof g18) {
          return this.a.equals(p0.a);
       }
       return false;
    }
    public final int hashCode(){
       return (this.a.hashCode() ^ 0xf4243);
    }
    public final String toString(){
       return "BatchedLogRequest{logRequests="+this.a+"}";
    }
}
