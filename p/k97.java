package p.k97;
import p.o97;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.r97;
import p.xc5;
import p.s97;
import p.tp2;
import java.lang.StringBuilder;

public final class k97 extends o97	// class@001bd0 from classes.dex
{
    public final String a;
    public final TriggerType b;

    public void k97(TriggerType p0,String p1){
       super();
       p1.getClass();
       this.a = p1;
       p0.getClass();
       this.b = p0;
    }
    public final Object a(r97 p0,xc5 p1,r97 p2,r97 p3,xc5 p4,s97 p5){
       return p3.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof k97) {
          return false;
       }
       if (p0.b != this.b || !p0.a.equals(this.a)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + tp2.g(this.a, 0, 31));
    }
    public final String toString(){
       return "TriggerEvent{pattern="+this.a+", triggerType="+this.b+'}';
    }
}
