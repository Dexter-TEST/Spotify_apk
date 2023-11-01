package p.ef1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import p.tp2;

public final class ef1	// class@001474 from classes.dex
{
    private long a;
    private long b;

    public void ef1(long p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final long a(){
       return this.b;
    }
    public final long b(){
       return this.a;
    }
    public final void c(ef1 p0){
       co5.o(p0, "other");
       this.a = this.a + p0.a;
       this.b = this.b + p0.b;
    }
    public final void d(long p0){
       this.b = p0;
    }
    public final void e(long p0){
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ef1) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ef1 ta = this.a;
       ef1 tb = this.b;
       return (((int)(ta ^ (ta >> 32)) * 31) + (int)(tb ^ (tb >> 32)));
    }
    public final String toString(){
       return tp2.o("DroppedCounts\(totalCount="+this.a+", reportedCount=", this.b, ')');
    }
}
