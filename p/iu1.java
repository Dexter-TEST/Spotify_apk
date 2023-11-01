package p.iu1;
import p.ju1;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class iu1	// class@001a04 from classes.dex
{
    public final ju1 a;
    public final String b;
    public final ju1 c;
    public final Integer d;
    public final String e;
    public final ju1 f;
    public final Integer g;
    public final String h;

    public void iu1(ju1 p0,String p1,ju1 p2,Integer p3,String p4,ju1 p5,Integer p6,String p7){
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
    public void iu1(ju1 p0,String p1,ju1 p2,String p3,int p4){
       ju1 oju1 = ((p4 & 0x01))? null: p0;
       String str = ((p4 & 0x02))? null: p1;
       ju1 oju11 = ((p4 & 0x04))? null: p2;
       String str1 = ((p4 & 0x10))? null: p3;
       super(oju1, str, oju11, null, str1, null, null, null);
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof iu1) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (!co5.c(this.e, p0.e)) {
          return false;
       }
       if (this.f != p0.f) {
          return false;
       }
       if (!co5.c(this.g, p0.g)) {
          return false;
       }
       if (!co5.c(this.h, p0.h)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       iu1 ta;
       iu1 tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = i1 * 31;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.c) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.d) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.e) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.f) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.g) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       if ((tb = this.h) != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return hr7.a("Error\(wrapperErrorReason="+this.a+", wrapperErrorMessage="+this.b+", resolveErrorReason="+this.c+", resolveErrorCode="+this.d+", resolveErrorMessage="+this.e+", attributesErrorReason="+this.f+", attributesErrorCode="+this.g+", attributesErrorMessage=", this.h, ')');
    }
}
