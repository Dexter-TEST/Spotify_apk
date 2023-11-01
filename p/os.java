package p.os;
import p.dz0;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class os extends dz0	// class@002183 from classes.dex
{
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public void os(Double p0,int p1,boolean p2,int p3,long p4,long p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final boolean equals(Object p0){
       os ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof dz0) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_0022 :
             if (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && (!(this.e - p0.e) && !(this.f - p0.f))))) {
             label_004b :
                return b;
             }
          }
       }else if(ta.equals(p0.a)){
          goto label_0022 ;
       }
       b = false;
       goto label_004b ;
    }
    public final int hashCode(){
       os ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       int i1 = 0xf4243;
       i = (((i ^ i1) * i1) ^ this.b) * i1;
       int i2 = (this.c != null)? 1231: 1237;
       os te = this.e;
       os tf = this.f;
       return (((((((i ^ i2) * i1) ^ this.d) * i1) ^ (int)(te ^ (te >> 32))) * i1) ^ (int)(tf ^ (tf >> 32)));
    }
    public final String toString(){
       return "Device{batteryLevel="+this.a+", batteryVelocity="+this.b+", proximityOn="+this.c+", orientation="+this.d+", ramUsed="+this.e+", diskUsed="+this.f+"}";
    }
}
