package p.xt1;
import java.lang.String;
import p.h80;
import java.lang.Iterable;
import java.lang.Object;
import p.co5;
import p.tp2;
import p.i80;
import java.lang.StringBuilder;

public final class xt1	// class@002ce1 from classes.dex
{
    public final long a;
    public final String b;
    public final i80 c;
    public final long d;
    public final Iterable e;

    public void xt1(long p0,String p1,h80 p2,long p3,Iterable p4){
       co5.o(p1, "eventName");
       co5.o(p4, "fragments");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof xt1) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (this.d - p0.d) {
          return false;
       }
       if (!co5.c(this.e, p0.e)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       xt1 ta = this.a;
       xt1 td = this.d;
       return (this.e.hashCode() + ((((this.c.hashCode() + tp2.g(this.b, ((int)(ta ^ (ta >> 32)) * 31), 31)) * 31) + (int)(td ^ (td >> 32))) * 31));
    }
    public final String toString(){
       return "Event\(internalId="+this.a+", eventName="+this.b+", sequenceId="+this.c+", sequenceNumber="+this.d+", fragments="+this.e+')';
    }
}
