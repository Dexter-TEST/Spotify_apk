package p.ns;
import p.zy0;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class ns extends zy0	// class@002041 from classes.dex
{
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public void ns(long p0,String p1,String p2,long p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       ns tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof zy0) {
          return false;
       }
       if (!(this.a - p0.a) && this.b.equals(p0.b)) {
          ns c = p0.c;
          if ((tc = this.c) == null) {
             if (c != null) {
             label_0040 :
                b = false;
             label_0041 :
                return b;
             }
          }else if(tc.equals(c)){
          }
          if (!(this.d - p0.d) && this.e == p0.e) {
             goto label_0041 ;
          }else {
             goto label_0040 ;
          }
       }else {
          goto label_0040 ;
       }
    }
    public final int hashCode(){
       ns tc;
       ns ta = this.a;
       long l = 32;
       int i = 0xf4243;
       int i1 = ((((int)(ta ^ (ta >> l)) ^ i) * i) ^ this.b.hashCode()) * i;
       int i2 = ((tc = this.c) == null)? 0: tc.hashCode();
       tc = this.d;
       return (this.e ^ ((((i1 ^ i2) * i) ^ (int)((tc >> l) ^ tc)) * i));
    }
    public final String toString(){
       return en6.o("Frame{pc="+this.a+", symbol="+this.b+", file="+this.c+", offset="+this.d+", importance=", this.e, "}");
    }
}
