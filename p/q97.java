package p.q97;
import p.cy5;
import p.tu1;
import io.reactivex.rxjava3.core.Single;
import java.lang.Object;
import com.spotify.messaging.inappmessagingsdk.networking.a;
import com.spotify.messaging.inappmessagingsdk.networking.c;
import p.cr0;
import com.spotify.messaging.inappmessagingsdk.networking.b;
import p.p97;
import p.n74;
import p.lc4;
import p.l83;
import p.tj5;
import p.li5;
import p.qj5;
import java.lang.Class;
import p.bm;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.s81;
import p.uj5;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.f97;
import p.vj5;
import p.ir0;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import p.mi;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ab0;
import p.bi5;
import io.reactivex.rxjava3.core.Observable;
import p.l94;
import p.yf2;
import p.nv1;
import com.spotify.mobius.rx3.RxEventSources;
import p.xk5;
import p.o16;
import java.lang.String;
import p.qb4;
import p.bv;
import p.xz3;
import p.sb4;
import p.j93;
import p.er7;

public final class q97	// class@00235c from classes.dex
{
    public rb4 a;
    public final a b;
    public final a c;
    public final p97 d;
    public final n74 e;
    public final lc4 f;
    public final tj5 g;
    public final l83 h;
    public final Single i;

    public void q97(cy5 p0,tu1 p1,Single p2){
       super();
       this.b = new a(a.b(p0), new cr0(15));
       this.c = new a(a.a(p0), new cr0(14));
       p97 op97 = new p97();
       this.d = op97;
       this.e = new n74();
       n74 on74 = new n74();
       this.f = new lc4();
       this.h = new l83(p1);
       RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
       subtypeEffec.g(uj5.class, new s81(15, new li5(p0.b(qj5.class), 12, new cr0(16))));
       subtypeEffec.c(vj5.class, new f97(on74, 1));
       ObservableSource[] observableSo = new ObservableSource[]{op97.a.filter(new ab0(29)).map(new l94(19))};
       this.g = new tj5(new sb4(mi.A(new bm(12), RxConnectables.a(subtypeEffec.h())).c(RxEventSources.a(observableSo)).a(new bm(0)).b(new bm(1)).e(new o16("InAppMessagingPreviewTool")), bv.e, null, new xz3()), on74);
       this.i = p2;
    }
}
