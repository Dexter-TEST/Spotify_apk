package p.zb5;
import p.tc5;
import p.na5;
import java.lang.Class;
import java.lang.Object;
import p.kd5;
import p.ld5;
import p.xc5;
import java.lang.String;
import java.lang.StringBuilder;

public final class zb5 extends tc5	// class@002ec4 from classes.dex
{
    public final na5 a;

    public void zb5(na5 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(kd5 p0,kd5 p1,kd5 p2,kd5 p3,ld5 p4,ld5 p5,ld5 p6,ld5 p7,ld5 p8,ld5 p9,ld5 p10,xc5 p11,xc5 p12,xc5 p13,ld5 p14,ld5 p15,xc5 p16,xc5 p17,ld5 p18,xc5 p19,ld5 p20,ld5 p21,ld5 p22,xc5 p23){
       return p10.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof zb5) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "ChallengeTimedOut{challenge="+this.a+'}';
    }
}