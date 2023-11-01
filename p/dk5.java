package p.dk5;
import p.ek5;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.fk5;
import p.xe7;
import java.lang.StringBuilder;
import p.hr7;

public final class dk5 extends ek5	// class@001364 from classes.dex
{
    public final TriggerType a;
    public final String b;

    public void dk5(TriggerType p0,String p1){
       super();
       p0.getClass();
       this.a = p0;
       this.b = p1;
    }
    public final Object a(fk5 p0,fk5 p1,fk5 p2,fk5 p3,fk5 p4,fk5 p5,fk5 p6){
       return p2.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof dk5) {
          return false;
       }
       if (p0.a != this.a || !xe7.u(p0.b, this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       dk5 tb;
       int i = 0;
       int i1 = (this.a.hashCode() + i) * 31;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return hr7.a("PreviewRequested{triggerType="+this.a+", creativeId=", this.b, '}');
    }
}
