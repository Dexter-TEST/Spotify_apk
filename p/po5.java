package p.po5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.tp2;

public final class po5	// class@00229f from classes.dex
{
    public final String a;
    public final int b;
    public final long c;

    public void po5(int p0,long p1,String p2){
       co5.o(p2, "eventName");
       super();
       this.a = p2;
       this.b = p0;
       this.c = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof po5) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c - p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       po5 tc = this.c;
       return ((((this.a.hashCode() * 31) + this.b) * 31) + (int)(tc ^ (tc >> 32)));
    }
    public final String toString(){
       return tp2.o("RateLimitedEventEntity\(eventName="+this.a+", count="+this.b+", timestamp=", this.c, ')');
    }
}
