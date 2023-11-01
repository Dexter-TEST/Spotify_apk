package p.sf5;
import p.w51;
import p.ds1;
import java.lang.Object;
import java.lang.String;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class sf5 extends w51	// class@00261b from classes.dex
{
    public final String D;
    public final boolean E;

    public void sf5(){
       super();
       this.D = "liteplayer-coreplayer";
       this.E = false;
    }
    public final Object E(ds1 p0,ds1 p1,ds1 p2,ds1 p3,ds1 p4,ds1 p5){
       return p1.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof sf5) {
          return false;
       }
       if (p0.E != this.E || !p0.D.equals(this.D)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.E, tp2.g(this.D, 0, 31));
    }
    public final String toString(){
       return kg4.p("Pause{featureIdentifier="+this.D+", systemInitiated=", this.E, '}');
    }
}
