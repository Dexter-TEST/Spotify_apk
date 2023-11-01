package p.uf5;
import p.w51;
import p.ds1;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class uf5 extends w51	// class@00289e from classes.dex
{
    public final long D;

    public void uf5(long p0){
       super();
       this.D = p0;
    }
    public final Object E(ds1 p0,ds1 p1,ds1 p2,ds1 p3,ds1 p4,ds1 p5){
       return p4.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof uf5) {
          return false;
       }
       if (p0.D - this.D) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (Long.valueOf(this.D).hashCode() + 0);
    }
    public final String toString(){
       return tp2.o("SeekTo{ms=", this.D, '}');
    }
}
