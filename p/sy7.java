package p.sy7;
import p.zv7;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class sy7 extends zv7	// class@0026c6 from classes.dex
{
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public void sy7(Integer p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public final boolean equals(Object p0){
       sy7 ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof zv7) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_0020 :
             if ((ta = this.b) == null) {
                if (p0.b != null) {
                label_00c0 :
                   b = false;
                label_00c1 :
                   return b;
                }
             }else if(ta.equals(p0.b)){
             }
             if ((ta = this.c) == null) {
                if (p0.c != null) {
                }
             }else if(ta.equals(p0.c)){
             }
             if ((ta = this.d) == null) {
                if (p0.d != null) {
                }
             }else if(ta.equals(p0.d)){
             }
             if ((ta = this.e) == null) {
                if (p0.e != null) {
                }
             }else if(ta.equals(p0.e)){
             }
             if ((ta = this.f) == null) {
                if (p0.f != null) {
                }
             }else if(ta.equals(p0.f)){
             }
             if ((ta = this.g) == null) {
                if (p0.g != null) {
                }
             }else if(ta.equals(p0.g)){
             }
             if ((ta = this.h) == null) {
                if (p0.h == null) {
                   goto label_00c1 ;
                }else {
                   goto label_00c0 ;
                }
             }else if(ta.equals(p0.h)){
                goto label_00c1 ;
             }else {
                goto label_00c0 ;
             }
          }else {
             goto label_00c0 ;
          }
       }else if(ta.equals(p0.a)){
          goto label_0020 ;
       }else {
          goto label_00c0 ;
       }
    }
    public final int hashCode(){
       sy7 ta;
       sy7 tb;
       sy7 th;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       int i2 = 0xf4243;
       i1 = (i1 ^ i2) * i2;
       int i3 = ((tb = this.b) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i2;
       i3 = ((tb = this.c) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i2;
       i3 = ((tb = this.d) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i2;
       i3 = ((tb = this.e) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i2;
       i3 = ((tb = this.f) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i2;
       i3 = ((tb = this.g) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i2;
       if ((th = this.h) != null) {
          i = th.hashCode();
       }
       return (i ^ i1);
    }
    public final String toString(){
       return en6.p("AndroidClientInfo{sdkVersion="+this.a+", model="+this.b+", hardware="+this.c+", device="+this.d+", product="+this.e+", osBuild="+this.f+", manufacturer="+this.g+", fingerprint=", this.h, "}");
    }
}
