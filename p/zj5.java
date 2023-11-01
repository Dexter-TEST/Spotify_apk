package p.zj5;
import p.ek5;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.fk5;
import java.lang.StringBuilder;
import p.hr7;

public final class zj5 extends ek5	// class@002f0c from classes.dex
{
    public final TriggerType a;
    public final String b;

    public void zj5(TriggerType p0,String p1){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final Object a(fk5 p0,fk5 p1,fk5 p2,fk5 p3,fk5 p4,fk5 p5,fk5 p6){
       return p6.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof zj5) {
          return false;
       }
       if (p0.a != this.a || !p0.b.equals(this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + ((this.a.hashCode() + 0) * 31));
    }
    public final String toString(){
       return hr7.a("EventReceived{triggerType="+this.a+", pattern=", this.b, '}');
    }
}
