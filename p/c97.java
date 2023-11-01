package p.c97;
import p.eb3;
import java.lang.String;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import p.ys5;
import com.google.common.collect.c;
import java.lang.Class;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;

public final class c97 extends eb3	// class@0011c4 from classes.dex
{
    public final String F;
    public final TriggerType G;
    public final c H;
    public final c I;
    public final c J;

    public void c97(String p0,TriggerType p1,ys5 p2,c p3,c p4){
       super();
       p0.getClass();
       this.F = p0;
       p1.getClass();
       this.G = p1;
       this.H = p2;
       p3.getClass();
       this.I = p3;
       p4.getClass();
       this.J = p4;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof c97) {
          return false;
       }
       if (p0.G != this.G || (!p0.F.equals(this.F) || (!p0.H.equals(this.H) || (!p0.I.equals(this.I) || !p0.J.equals(this.J))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.J.hashCode() + ((this.I.hashCode() + ((this.H.hashCode() + ((this.G.hashCode() + tp2.g(this.F, 0, 31)) * 31)) * 31)) * 31));
    }
    public final String toString(){
       return "RequestMessage{pattern="+this.F+", triggerType="+this.G+", triggers="+this.H+", formatTypes="+this.I+", actionCapabilities="+this.J+'}';
    }
}
