package p.js;
import p.wy0;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class js extends wy0	// class@001b3b from classes.dex
{
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public void js(long p0,long p1,String p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       js td;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof wy0) {
          return false;
       }
       if (!(this.a - p0.a) && (!(this.b - p0.b) && this.c.equals(p0.c))) {
          p0 = p0.d;
          if ((td = this.d) == null) {
             if (p0 == null) {
             label_003b :
                return b;
             }
          }else if(td.equals(p0)){
             goto label_003b ;
          }
       }
       b = false;
       goto label_003b ;
    }
    public final int hashCode(){
       js ta = this.a;
       js tb = this.b;
       int i = ((((((int)(ta ^ (ta >> 32)) ^ 0xf4243) * 0xf4243) ^ (int)((tb >> 32) ^ tb)) * 0xf4243) ^ this.c.hashCode()) * 0xf4243;
       int i1 = ((ta = this.d) == null)? 0: ta.hashCode();
       return (i1 ^ i);
    }
    public final String toString(){
       return en6.p("BinaryImage{baseAddress="+this.a+", size="+this.b+", name="+this.c+", uuid=", this.d, "}");
    }
}
