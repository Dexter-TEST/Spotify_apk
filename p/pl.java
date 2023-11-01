package p.pl;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;

public final class pl	// class@002289 from classes.dex
{
    public final String a;
    public final String b;
    public final Boolean c;
    public final Integer d;
    public final String e;
    public final long f;
    public final long g;

    public void pl(String p0,String p1,Boolean p2,Integer p3,String p4,long p5,long p6){
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
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof pl) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (!co5.c(this.e, p0.e)) {
          return false;
       }
       if (this.f - p0.f) {
          return false;
       }
       if (this.g - p0.g) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       pl tc;
       int i = tp2.g(this.b, (this.a.hashCode() * 31), 31);
       int i1 = 0;
       int i2 = ((tc = this.c) == null)? 0: tc.hashCode();
       i = (i + i2) * 31;
       i2 = ((tc = this.d) == null)? 0: tc.hashCode();
       i = (i + i2) * 31;
       if ((tc = this.e) != null) {
          i1 = tc.hashCode();
       }
       pl tf = this.f;
       tf = this.g;
       return (((((i + i1) * 31) + (int)(tf ^ (tf >> 32))) * 31) + (int)(tf ^ (tf >> 32)));
    }
    public final String toString(){
       return tp2.o("AssignedPropertyValue\(name="+this.a+", scope="+this.b+", boolValue="+this.c+", intValue="+this.d+", enumValue="+this.e+", groupId="+this.f+", policyId=", this.g, ')');
    }
}
