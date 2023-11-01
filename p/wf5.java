package p.wf5;
import p.w51;
import p.nv;
import p.ds1;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class wf5 extends w51	// class@002b28 from classes.dex
{
    public final nv D;

    public void wf5(nv p0){
       super();
       this.D = p0;
    }
    public final Object E(ds1 p0,ds1 p1,ds1 p2,ds1 p3,ds1 p4,ds1 p5){
       return p3.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof wf5) {
          return false;
       }
       return p0.D.equals(this.D);
    }
    public final int hashCode(){
       return (this.D.hashCode() + 0);
    }
    public final String toString(){
       return "SkipToPrevTrackWithCommand{command="+this.D+'}';
    }
}
