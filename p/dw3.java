package p.dw3;
import java.lang.Exception;
import java.lang.Object;
import p.sv3;
import java.lang.String;
import java.lang.Throwable;
import java.util.Arrays;

public final class dw3	// class@0013cc from classes.dex
{
    public final Object a;
    public final Throwable b;

    public void dw3(Exception p0){
       super();
       this.b = p0;
       this.a = null;
    }
    public void dw3(sv3 p0){
       super();
       this.a = p0;
       this.b = null;
    }
    public final boolean equals(Object p0){
       dw3 ta;
       dw3 tb;
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof dw3) {
          return false;
       }
       if ((ta = this.a) != null && ta.equals(p0.a)) {
          return b;
       }
       if ((tb = this.b) != null && p0.b != null) {
          return tb.toString().equals(tb.toString());
       }
       return false;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b};
       return Arrays.hashCode(objArray);
    }
}
