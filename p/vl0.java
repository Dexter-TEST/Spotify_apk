package p.vl0;
import java.lang.Object;
import p.zf2;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class vl0	// class@002a16 from classes.dex
{
    public final Object a;
    public final zf2 b;

    public void vl0(Object p0,zf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof vl0) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       vl0 ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       return (this.b.hashCode() + (i * 31));
    }
    public final String toString(){
       return "CompletedWithCancellation\(result="+this.a+", onCancellation="+this.b+')';
    }
}
