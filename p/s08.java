package p.s08;
import p.q18;
import p.k18;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import p.d28;
import java.lang.Object;
import java.lang.Enum;
import java.lang.StringBuilder;

public final class s08 extends q18	// class@002596 from classes.dex
{
    public final long a;
    public final long b;
    public final k18 c;
    public final Integer d;
    public final String e;
    public final List f;
    public final d28 g;

    public void s08(long p0,long p1,k18 p2,Integer p3,String p4,List p5,d28 p6){
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
       s08 tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof q18) {
          return false;
       }
       if (!(this.a - p0.a) && !(this.b - p0.b)) {
          if ((tc = this.c) == null) {
             if (p0.c != null) {
             label_0093 :
                b = false;
             label_0094 :
                return b;
             }
          }else if(tc.equals(p0.c)){
          }
          if ((tc = this.d) == null) {
             if (p0.d != null) {
             }
          }else if(tc.equals(p0.d)){
          }
          if ((tc = this.e) == null) {
             if (p0.e != null) {
             }
          }else if(tc.equals(p0.e)){
          }
          if ((tc = this.f) == null) {
             if (p0.f != null) {
             }
          }else if(tc.equals(p0.f)){
          }
          if ((tc = this.g) == null) {
             if (p0.g == null) {
                goto label_0094 ;
             }else {
                goto label_0093 ;
             }
          }else if(tc.equals(p0.g)){
             goto label_0094 ;
          }else {
             goto label_0093 ;
          }
       }else {
          goto label_0093 ;
       }
    }
    public final int hashCode(){
       s08 ta = this.a;
       int i = 0xf4243;
       s08 tb = this.b;
       int i1 = ((((int)(ta ^ (ta >> 32)) ^ i) * i) ^ (int)((tb >> 32) ^ tb)) * i;
       int i2 = 0;
       int i3 = ((tb = this.c) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i;
       i3 = ((tb = this.d) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i;
       i3 = ((tb = this.e) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i;
       i3 = ((tb = this.f) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i;
       if ((ta = this.g) != null) {
          i2 = ta.hashCode();
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return "LogRequest{requestTimeMs="+this.a+", requestUptimeMs="+this.b+", clientInfo="+this.c+", logSource="+this.d+", logSourceName="+this.e+", logEvents="+this.f+", qosTier="+this.g+"}";
    }
}
