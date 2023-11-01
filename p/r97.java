package p.r97;
import p.qg2;
import p.gw;
import java.lang.Object;
import p.n97;
import p.a97;
import com.google.common.collect.c;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.xt;
import p.m97;
import p.u97;
import java.lang.Class;
import p.o11;
import p.d97;
import p.k97;
import p.ju;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import java.lang.String;
import p.xe7;
import java.util.Collection;
import p.co5;

public final class r97 implements qg2	// class@0024a4 from classes.dex
{
    public final int a;
    public final gw b;

    public void r97(gw p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       gw e;
       int i = 0;
       r97 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             p0 = new o11(tb, i);
             p0.b = new u97(p0.a);
             p0 = p0.m();
             HashSet hashSet = new HashSet();
             hashSet.add(new d97());
             if ((e = p0.e) != null) {
                hashSet.addAll(xe7.P(p0, new k97(e.b, e.a)).b);
             }
             o11 oo11 = new o11(p0, i);
             oo11.w = null;
             return new xt(oo11.m(), co5.B(hashSet));
             break;
           case 1:
           default:
             return xe7.P(tb, p0);
       }
       p0 = new Object[]{new a97(tb.b, tb.d)};
       return xt.a(vv7.p(p0));
    }
}
