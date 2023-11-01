package p.bh1;
import p.eo5;
import p.aq6;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class bh1 extends eo5	// class@0010c2 from classes.dex
{
    public final aq6 D;
    public final String E;

    public void bh1(aq6 p0,String p1){
       super();
       p0.getClass();
       this.D = p0;
       p1.getClass();
       this.E = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof bh1) {
          return false;
       }
       if (!p0.D.equals(this.D) || !p0.E.equals(this.E)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.E.hashCode() + ((this.D.hashCode() + 0) * 31));
    }
    public final String toString(){
       return hr7.a("LoadPlayerContext{contextUri="+this.D+", clientId=", this.E, '}');
    }
}
