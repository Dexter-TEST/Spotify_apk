package p.vr;
import p.jz0;
import java.lang.String;
import p.iz0;
import p.sy0;
import java.lang.Object;
import java.lang.StringBuilder;

public final class vr extends jz0	// class@002a52 from classes.dex
{
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final iz0 h;
    public final sy0 i;

    public void vr(String p0,String p1,int p2,String p3,String p4,String p5,iz0 p6,sy0 p7){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public final boolean equals(Object p0){
       vr th;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof jz0) {
          return false;
       }
       if (this.b.equals(p0.b) && (this.c.equals(p0.c) && (this.d == p0.d && (this.e.equals(p0.e) && (this.f.equals(p0.f) && this.g.equals(p0.g)))))) {
          vr h = p0.h;
          if ((th = this.h) == null) {
             if (h != null) {
             label_0064 :
                b = false;
             label_0065 :
                return b;
             }
          }else if(th.equals(h)){
          }
          p0 = p0.i;
          if ((h = this.i) == null) {
             if (p0 == null) {
                goto label_0065 ;
             }else {
                goto label_0064 ;
             }
          }else if(h.equals(p0)){
             goto label_0065 ;
          }else {
             goto label_0064 ;
          }
       }else {
          goto label_0064 ;
       }
    }
    public final int hashCode(){
       vr th;
       vr ti;
       int i = 0xf4243;
       int i1 = (((((((((((this.b.hashCode() ^ i) * i) ^ this.c.hashCode()) * i) ^ this.d) * i) ^ this.e.hashCode()) * i) ^ this.f.hashCode()) * i) ^ this.g.hashCode()) * i;
       int i2 = 0;
       int i3 = ((th = this.h) == null)? 0: th.hashCode();
       i1 = (i1 ^ i3) * i;
       if ((ti = this.i) != null) {
          i2 = ti.hashCode();
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return "CrashlyticsReport{sdkVersion="+this.b+", gmpAppId="+this.c+", platform="+this.d+", installationUuid="+this.e+", buildVersion="+this.f+", displayVersion="+this.g+", session="+this.h+", ndkPayload="+this.i+"}";
    }
}
