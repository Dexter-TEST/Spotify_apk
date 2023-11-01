package p.h97;
import p.yf2;
import com.spotify.messaging.inappmessagingsdk.networking.a;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import p.c97;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import com.google.common.collect.c;
import p.l94;

public final class h97 implements yf2	// class@00180b from classes.dex
{
    public final int a;
    public final a b;
    public final String c;
    public final boolean t;
    public final Object v;

    public void h97(a p0,String p1,Boolean p2,boolean p3){
       this.a = 1;
       super();
       this.b = p0;
       this.c = p1;
       this.v = p2;
       this.t = p3;
    }
    public void h97(Observable p0,a p1,String p2,boolean p3){
       this.a = 0;
       super();
       this.v = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final Object apply(Object p0){
       h97 tv = this.v;
       switch (this.a){
           case 0:
           default:
             return this.b.c(p0.F, this.c, p0.G, tv.booleanValue(), p0.H, p0.J, p0.I, this.t).map(new l94(23)).onErrorReturn(new l94(24));
       }
       return tv.flatMap(new h97(this.b, this.c, p0, this.t));
    }
}
