package p.uj5;
import p.xe7;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class uj5 extends xe7	// class@0028c1 from classes.dex
{
    public final TriggerType F;
    public final String G;
    public final String H;
    public final boolean I;

    public void uj5(TriggerType p0,String p1,String p2,boolean p3){
       super();
       p0.getClass();
       this.F = p0;
       this.G = p1;
       p2.getClass();
       this.H = p2;
       this.I = p3;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof uj5) {
          return false;
       }
       if (p0.F != this.F || (p0.I != this.I || (!xe7.u(p0.G, this.G) || !p0.H.equals(this.H)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       uj5 tG;
       int i = 0;
       int i1 = (this.F.hashCode() + i) * 31;
       if ((tG = this.G) != null) {
          i = tG.hashCode();
       }
       return tp2.h(this.I, tp2.g(this.H, ((i1 + i) * 31), 31));
    }
    public final String toString(){
       return kg4.p("FetchMessage{triggerType="+this.F+", uri="+this.G+", creativeId="+this.H+", devEnabled=", this.I, '}');
    }
}
