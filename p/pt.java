package p.pt;
import java.lang.String;
import p.wv;
import p.qa3;
import java.lang.Object;
import java.lang.StringBuilder;

public final class pt	// class@0022ce from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final wv d;
    public final qa3 e;

    public void pt(String p0,String p1,String p2,wv p3,qa3 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       pt ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof pt) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if ((ta = this.b) == null) {
                if (p0.b != null) {
                label_0061 :
                   b = false;
                label_0062 :
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
                if (p0.e == null) {
                   goto label_0062 ;
                }else {
                   goto label_0061 ;
                }
             }else if(ta.equals(p0.e)){
                goto label_0062 ;
             }else {
                goto label_0061 ;
             }
          }else {
             goto label_0061 ;
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }else {
          goto label_0061 ;
       }
    }
    public final int hashCode(){
       pt ta;
       pt tb;
       pt te;
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
       if ((te = this.e) != null) {
          i = te.hashCode();
       }
       return (i ^ i1);
    }
    public final String toString(){
       return "InstallationResponse{uri="+this.a+", fid="+this.b+", refreshToken="+this.c+", authToken="+this.d+", responseCode="+this.e+"}";
    }
}
