package p.u65;
import java.lang.Object;
import p.yo4;
import java.lang.String;
import java.lang.StringBuilder;

public final class u65	// class@002851 from classes.dex
{
    public final Object a;
    public final Object b;

    public void u65(Object p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof u65) {
          return b;
       }
       if (yo4.a(p0.a, this.a) && yo4.a(p0.b, this.b)) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       u65 ta;
       u65 tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (i ^ i1);
    }
    public final String toString(){
       return "Pair{"+this.a+" "+this.b+"}";
    }
}
