package p.ju;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import java.lang.String;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.StringBuilder;

public final class ju	// class@001b4d from classes.dex
{
    public final String a;
    public final TriggerType b;

    public void ju(TriggerType p0,String p1){
       super();
       if (p1 == null) {
          throw new NullPointerException("Null pattern");
       }
       this.a = p1;
       if (p0 == null) {
          throw new NullPointerException("Null type");
       }
       this.b = p0;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ju) {
          return false;
       }
       if (!this.a.equals(p0.a) || !this.b.equals(p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode());
    }
    public final String toString(){
       return "PendingTrigger{pattern="+this.a+", type="+this.b+"}";
    }
}
