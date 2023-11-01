package p.d93;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class d93	// class@001302 from classes.dex
{
    public final int a;
    public final Object b;

    public void d93(int p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof d93) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       d93 tb;
       int i = this.a * 31;
       int i1 = ((tb = this.b) == null)? 0: tb.hashCode();
       return (i + i1);
    }
    public final String toString(){
       return "IndexedValue\(index="+this.a+", value="+this.b+')';
    }
}
