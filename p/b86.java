package p.b86;
import p.nr0;
import java.lang.String;
import p.kg4;
import java.lang.Object;
import p.co5;
import p.en6;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class b86	// class@001076 from classes.dex
{
    public final int a;
    public final nr0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public void b86(int p0,nr0 p1,String p2,String p3,String p4,String p5,String p6){
       kg4.t(p0, "type");
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
       if (!p0 instanceof b86) {
          return false;
       }
       if (this.a != p0.a) {
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
       if (!co5.c(this.f, p0.f)) {
          return false;
       }
       if (!co5.c(this.g, p0.g)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.g.hashCode() + tp2.g(this.f, tp2.g(this.e, tp2.g(this.d, tp2.g(this.c, ((this.b.hashCode() + (en6.A(this.a) * 31)) * 31), 31), 31), 31), 31));
    }
    public final String toString(){
       return hr7.a("SearchResult\(type="+kg4.C(this.a)+", content="+this.b+", uri="+this.c+", title="+this.d+", subtitle="+this.e+", imageUrl="+this.f+", section=", this.g, ')');
    }
}
