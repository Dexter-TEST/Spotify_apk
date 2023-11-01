package p.tf5;
import p.w51;
import p.ds1;
import java.lang.Object;
import java.lang.String;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class tf5 extends w51	// class@00275f from classes.dex
{
    public final String D;
    public final boolean E;

    public void tf5(){
       super();
       this.D = "liteplayer-coreplayer";
       this.E = false;
    }
    public final Object E(ds1 p0,ds1 p1,ds1 p2,ds1 p3,ds1 p4,ds1 p5){
       return p0.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof tf5) {
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
       return kg4.p("Resume{featureIdentifier="+this.D+", systemInitiated=", this.E, '}');
    }
}
