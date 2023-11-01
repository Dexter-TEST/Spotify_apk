package p.mv3;
import p.kv3;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class mv3 extends kv3	// class@001f11 from classes.dex
{

    static {
       mv3 omv3 = new mv3(1, 0);
    }
    public void mv3(long p0,long p1){
       super(p0, p1);
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof mv3) {
          kv3 ta = this.a;
          kv3 tb = this.b;
          int i = ((ta - tb) > 0)? 1: 0;
          if (i) {
             kv3 okv3 = (((okv3 = p0)) > 0)? 1: 0;
             if (okv3) {
             label_0031 :
                b = true;
             }
          }
          if (!(ta - p0.a) && !(tb - p0.b)) {
             goto label_0031 ;
          }
       }
       return b;
    }
    public final int hashCode(){
       kv3 ta = this.a;
       kv3 tb = this.b;
       int i = ((ta - tb) > 0)? 1: 0;
       int i1 = (i)? -1: (int)(((long)31 * (ta ^ (ta >> 32))) + ((tb >> 32) ^ tb));
       return i1;
    }
    public final String toString(){
       return this.a+".."+this.b;
    }
}
