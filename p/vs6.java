package p.vs6;
import p.ss6;
import p.ts6;
import java.util.Date;
import java.lang.String;
import p.kg4;
import java.lang.Object;
import p.co5;
import p.en6;
import java.lang.StringBuilder;

public final class vs6	// class@002a59 from classes.dex
{
    public final int a;
    public final ts6 b;
    public final int c;
    public final Date d;
    public final long e;
    public final ss6 f;
    public final long g;

    public void vs6(int p0,int p1,long p2,ss6 p3){
       super(p0, ts6.x, p1, new Date(), p2, p3);
    }
    public void vs6(int p0,ts6 p1,int p2,Date p3,long p4,ss6 p5){
       kg4.t(p0, "kind");
       co5.o(p3, "date");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p3.getTime() / (long)1000;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof vs6) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (this.e - p0.e) {
          return false;
       }
       if (!co5.c(this.f, p0.f)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       vs6 te = this.e;
       int i = (((this.d.hashCode() + ((((this.b.hashCode() + (en6.A(this.a) * 31)) * 31) + this.c) * 31)) * 31) + (int)(te ^ (te >> 32))) * 31;
       int i1 = ((te = this.f) == null)? 0: te.hashCode();
       return (i + i1);
    }
    public final String toString(){
       return "StorageEvent\(kind="+kg4.F(this.a)+", type="+this.b+", dataSize="+this.c+", date="+this.d+", durationMs="+this.e+", error="+this.f+')';
    }
}
