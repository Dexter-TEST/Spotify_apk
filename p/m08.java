package p.m08;
import p.o18;
import java.lang.Integer;
import java.lang.String;
import p.z18;
import java.lang.Object;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class m08 extends o18	// class@001e00 from classes.dex
{
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final z18 g;

    public void m08(long p0,Integer p1,long p2,byte[] p3,String p4,long p5,z18 p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final boolean equals(Object p0){
       m08 tb;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof o18) {
          return false;
       }
       if (!(this.a - p0.a)) {
          if ((tb = this.b) == null) {
             if (p0.b != null) {
             label_0081 :
                b = false;
             label_0082 :
                return b;
             }
          }else if(tb.equals(p0.b)){
          }
          tb = p0;
          if (!(this.c - tb.c)) {
             m08 d = (p0 instanceof m08)? p0.d: tb.d;
             if (Arrays.equals(this.d, d)) {
                if ((d = this.e) == null) {
                   if (p0.e != null) {
                   }
                }else if(d.equals(p0.e)){
                }
                if (!(this.f - tb.f)) {
                   if ((tb = this.g) == null) {
                      if (p0.g == null) {
                         goto label_0082 ;
                      }else {
                         goto label_0081 ;
                      }
                   }else if(tb.equals(p0.g)){
                      goto label_0082 ;
                   }else {
                      goto label_0081 ;
                   }
                }else {
                   goto label_0081 ;
                }
             }else {
                goto label_0081 ;
             }
          }else {
             goto label_0081 ;
          }
       }else {
          goto label_0081 ;
       }
    }
    public final int hashCode(){
       m08 tb;
       m08 ta = this.a;
       long l = 32;
       int i = 0xf4243;
       int i1 = ((int)(ta ^ (ta >> l)) ^ i) * i;
       int i2 = 0;
       int i3 = ((tb = this.b) == null)? 0: tb.hashCode();
       tb = this.c;
       i1 = (((((i1 ^ i3) * i) ^ (int)(tb ^ (tb >> l))) * i) ^ Arrays.hashCode(this.d)) * i;
       i3 = ((tb = this.e) == null)? 0: tb.hashCode();
       tb = this.f;
       i1 = (((i1 ^ i3) * i) ^ (int)(tb ^ (tb >> l))) * i;
       if ((ta = this.g) != null) {
          i2 = ta.hashCode();
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return "LogEvent{eventTimeMs="+this.a+", eventCode="+this.b+", eventUptimeMs="+this.c+", sourceExtension="+Arrays.toString(this.d)+", sourceExtensionJsonProto3="+this.e+", timezoneOffsetSeconds="+this.f+", networkConnectionInfo="+this.g+"}";
    }
}
