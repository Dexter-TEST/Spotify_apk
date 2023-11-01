package p.dt;
import java.lang.String;
import java.lang.Integer;
import p.tl1;
import java.util.Map;
import java.lang.Object;
import p.i77;
import java.lang.Long;
import java.util.HashMap;
import java.lang.NullPointerException;
import java.lang.StringBuilder;

public final class dt	// class@0013b6 from classes.dex
{
    public final String a;
    public final Integer b;
    public final tl1 c;
    public final long d;
    public final long e;
    public final Map f;

    public void dt(String p0,Integer p1,tl1 p2,long p3,long p4,Map p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final String a(String p0){
       if ((p0 = this.f.get(p0)) == null) {
          p0 = "";
       }
       return p0;
    }
    public final int b(String p0){
       int i = ((p0 = this.f.get(p0)) == null)? 0: Integer.valueOf(p0).intValue();
       return i;
    }
    public final i77 c(){
       dt ta;
       i77 oi77 = new i77(4);
       if ((ta = this.a) == null) {
          throw new NullPointerException("Null transportName");
       }
       oi77.a = ta;
       oi77.b = this.b;
       oi77.z(this.c);
       oi77.d = Long.valueOf(this.d);
       oi77.e = Long.valueOf(this.e);
       oi77.f = new HashMap(this.f);
       return oi77;
    }
    public final boolean equals(Object p0){
       dt tb;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof dt) {
          return false;
       }
       if (this.a.equals(p0.a)) {
          dt b1 = p0.b;
          if ((tb = this.b) == null) {
             if (b1 != null) {
             label_0049 :
                b = false;
             label_004a :
                return b;
             }
          }else if(tb.equals(b1)){
          }
          if (this.c.equals(p0.c) && (!(this.d - p0.d) && (!(this.e - p0.e) && this.f.equals(p0.f)))) {
             goto label_004a ;
          }else {
             goto label_0049 ;
          }
       }else {
          goto label_0049 ;
       }
    }
    public final int hashCode(){
       dt tb;
       int i = 0xf4243;
       int i1 = (this.a.hashCode() ^ i) * i;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       tb = this.d;
       tb = this.e;
       return (((((((((i1 ^ i2) * i) ^ this.c.hashCode()) * i) ^ (int)(tb ^ (tb >> 32))) * i) ^ (int)(tb ^ (tb >> 32))) * i) ^ this.f.hashCode());
    }
    public final String toString(){
       return "EventInternal{transportName="+this.a+", code="+this.b+", encodedPayload="+this.c+", eventMillis="+this.d+", uptimeMillis="+this.e+", autoMetadata="+this.f+"}";
    }
}
