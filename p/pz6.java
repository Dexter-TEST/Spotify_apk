package p.pz6;
import java.lang.String;
import java.lang.Object;
import java.util.Locale;
import p.co5;
import java.lang.CharSequence;
import p.av6;
import p.ir2;
import java.lang.StringBuilder;
import p.en6;

public final class pz6	// class@002301 from classes.dex
{
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public void pz6(String p0,String p1,boolean p2,int p3,String p4,int p5){
       int i;
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       Locale uS = Locale.US;
       co5.l(uS, "US");
       uS = p1.toUpperCase(uS);
       co5.l(uS, "this as java.lang.String\).toUpperCase\(locale\)");
       if (av6.f0(uS, "INT")) {
          i = 3;
       }else if(!av6.f0(uS, "CHAR") && (!av6.f0(uS, "CLOB") && !av6.f0(uS, "TEXT"))){
          if (av6.f0(uS, "BLOB")) {
             i = 5;
          }else if(!av6.f0(uS, "REAL") && (!av6.f0(uS, "FLOA") && !av6.f0(uS, "DOUB"))){
             i = 1;
          }else {
             i = 4;
          }
       }else {
          i = 2;
       }
       this.g = i;
       return;
    }
    public final boolean equals(Object p0){
       pz6 tf;
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof pz6) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       pz6 f = p0.f;
       pz6 e = p0.e;
       int i = 2;
       pz6 te = this.e;
       if ((tf = this.f) == b && (f == i && (te != null && !ir2.s(te, e)))) {
          return false;
       }
       if (tf == i && (f == b && (e != null && !ir2.s(e, te)))) {
          return false;
       }
       if (tf != null && tf == f) {
          if (te != null) {
             if (!ir2.s(te, e)) {
             label_0057 :
                f = 1;
             label_005a :
                if (f) {
                   return false;
                }
             }
          }else if(e != null){
             goto label_0057 ;
          }
          f = 0;
          goto label_005a ;
       }
       if (this.g != p0.g) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = ((this.a.hashCode() * 31) + this.g) * 31;
       int i1 = (this.c != null)? 1231: 1237;
       return (((i + i1) * 31) + this.d);
    }
    public final String toString(){
       pz6 te;
       StringBuilder str = "Column{name=\'"+this.a+"\', type=\'"+this.b+"\', affinity=\'"+this.g+"\', notNull="+this.c+", primaryKeyPosition="+this.d+", defaultValue=\'";
       if ((te = this.e) == null) {
          te = "undefined";
       }
       return en6.p(str, te, "\'}");
    }
}
