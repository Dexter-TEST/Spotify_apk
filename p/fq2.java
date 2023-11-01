package p.fq2;
import p.gq2;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class fq2 extends gq2	// class@001618 from classes.dex
{
    public final String a;

    public void fq2(String p0){
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof fq2) {
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
       return hr7.a("Selected\(identifier=", this.a, ')');
    }
}
