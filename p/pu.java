package p.pu;
import p.r45;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class pu	// class@0022d6 from classes.dex
{
    public final r45 a;
    public final r45 b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    public void pu(r45 p0,r45 p1,String p2,Integer p3,boolean p4,boolean p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final boolean equals(Object p0){
       pu tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof pu) {
          return false;
       }
       if (this.a.equals(p0.a) && this.b.equals(p0.b)) {
          pu c = p0.c;
          if ((tc = this.c) == null) {
             if (c != null) {
             label_004a :
                b = false;
             label_004b :
                return b;
             }
          }else if(tc.equals(c)){
          }
          c = p0.d;
          if ((tc = this.d) == null) {
             if (c != null) {
             }
          }else if(tc.equals(c)){
          }
          if (this.e == p0.e && this.f == p0.f) {
             goto label_004b ;
          }else {
             goto label_004a ;
          }
       }else {
          goto label_004a ;
       }
    }
    public final int hashCode(){
       pu tc;
       int i = 0xf4243;
       int i1 = (((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i;
       int i2 = 0;
       int i3 = ((tc = this.c) == null)? 0: tc.hashCode();
       i1 = (i1 ^ i3) * i;
       if ((tc = this.d) != null) {
          i2 = tc.hashCode();
       }
       i1 = (i1 ^ i2) * i;
       i3 = 1231;
       i2 = (this.e != null)? 1231: 1237;
       i1 = (i1 ^ i2) * i;
       if (this.f == null) {
          i3 = 1237;
       }
       return (i1 ^ i3);
    }
    public final String toString(){
       return en6.q("PlayCommand{contextUri="+this.a+", context="+this.b+", uid="+this.c+", index="+this.d+", mobileOnDemand="+this.e+", shuffle=", this.f, "}");
    }
}
