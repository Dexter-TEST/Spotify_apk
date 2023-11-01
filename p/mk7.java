package p.mk7;
import java.lang.String;
import java.util.List;
import p.ll1;
import java.lang.Object;
import p.co5;
import p.kg4;
import java.lang.StringBuilder;

public final class mk7	// class@001eb5 from classes.dex
{
    public final String a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public void mk7(String p0,List p1,boolean p2,boolean p3,boolean p4,int p5){
       ll1 a;
       if ((p5 & 0x01)) {
          p0 = "";
       }
       String str = p0;
       if ((p5 & 0x02)) {
          a = ll1.a;
       }
       ll1 oll1 = a;
       boolean b = ((p5 & 0x04))? false: p2;
       boolean b1 = ((p5 & 0x10))? false: p3;
       boolean b2 = ((p5 & 0x20))? true: p4;
       super(str, oll1, b, false, b1, b2);
       return;
    }
    public void mk7(String p0,List p1,boolean p2,boolean p3,boolean p4,boolean p5){
       co5.o(p0, "query");
       co5.o(p1, "searchResults");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public static mk7 a(mk7 p0,String p1,ll1 p2,boolean p3,int p4){
       mk7 a;
       mk7 b;
       mk7 d;
       mk7 "searchResults";
       if ((p4 & 0x01)) {
          a = p0.a;
       }
       mk7 omk7 = a;
       if ((p4 & 0x02)) {
          b = p0.b;
       }
       mk7 omk71 = b;
       mk7 omk72 = ((p4 & 0x04))? p0.c: false;
       if ((p4 & 0x08)) {
          d = p0.d;
       }
       mk7 omk73 = d;
       mk7 omk74 = ((p4 & 0x10))? p0.e: false;
       mk7 omk75 = ((p4 & 0x20))? p0.f: false;
       co5.o(omk7, "query");
       co5.o(omk71, "searchResults");
       "searchResults" = new mk7(omk7, omk71, omk72, omk73, omk74, omk75);
       return "searchResults";
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof mk7) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       if (this.f != p0.f) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       mk7 tc;
       int i2;
       int i = kg4.j(this.b, (this.a.hashCode() * 31), 31);
       int i1 = 1;
       if ((tc = this.c) != null) {
          tc = 1;
       }
       i = (i + tc) * 31;
       if ((tc = this.d) != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       if ((tc = this.e) != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       if ((tc = this.f) == null) {
          i1 = tc;
       }
       return (i + i1);
    }
    public final String toString(){
       return kg4.p("ViewState\(query="+this.a+", searchResults="+this.b+", searching="+this.c+", loading="+this.d+", error="+this.e+", moreAvailable=", this.f, ')');
    }
}
