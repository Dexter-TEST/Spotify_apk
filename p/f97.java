package p.f97;
import p.ir0;
import p.n74;
import java.lang.Object;
import p.z87;
import java.lang.Class;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment$Builder;
import p.u65;
import p.w87;
import p.u73;
import p.an5;
import p.vj5;

public final class f97 implements ir0	// class@001586 from classes.dex
{
    public final int a;
    public final n74 b;

    public void f97(n74 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       f97 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             tb.a.onNext(new InAppMessagingDisplayFragment$Builder(p0.F, p0.G));
             return;
       }
       p0 = p0.F;
       tb.getClass();
       tb.a.onNext(new InAppMessagingDisplayFragment$Builder(p0.a, p0.b));
       return;
    }
}
