package p.sy3;
import p.ty3;
import p.vu5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class sy3 implements ty3	// class@0026c2 from classes.dex
{
    public final vu5 a;

    public void sy3(vu5 p0){
       co5.o(p0, "reportType");
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof sy3) {
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
       return "OnReportOptionSelectedEvent\(reportType="+this.a+')';
    }
}
