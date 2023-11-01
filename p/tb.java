package p.tb;
import p.sg2;
import p.ub;
import java.lang.Object;
import p.hr0;
import p.rb;
import p.i70;
import java.lang.String;
import p.co5;
import p.v9;
import java.lang.Class;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.n9;
import p.x8;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.d9;
import p.k9;
import p.v8;
import p.ir0;
import p.y8;
import p.m9;
import p.c9;
import p.o9;
import p.w8;
import p.p9;
import p.g9;
import p.f9;
import p.b9;
import p.z8;
import p.a9;
import p.e9;
import p.t8;
import p.u8;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import p.mi;
import p.ms3;
import p.qb4;
import p.sb;
import p.xk5;

public final class tb implements sg2	// class@00273e from classes.dex
{
    public final ub a;

    public void tb(ub p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       tb ta = this.a;
       co5.l(p0, "consumer");
       ub d = ta.d;
       d.getClass();
       RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
       subtypeEffec.g(x8.class, new n9(d, 1));
       subtypeEffec.g(d9.class, new n9(d, 2));
       subtypeEffec.c(v8.class, new k9(d, 3));
       subtypeEffec.g(y8.class, new n9(d, 3));
       subtypeEffec.c(c9.class, new m9(d, p0, 2));
       subtypeEffec.g(w8.class, o9.a);
       subtypeEffec.c(g9.class, new p9(p0, 0));
       subtypeEffec.c(f9.class, new p9(p0, 1));
       subtypeEffec.c(b9.class, new k9(d, 4));
       subtypeEffec.c(z8.class, new k9(d, 1));
       subtypeEffec.c(a9.class, new k9(d, 2));
       subtypeEffec.c(e9.class, new m9(d, p0, 0));
       subtypeEffec.c(t8.class, new m9(p0, d));
       p0 = new n9(d, 0);
       subtypeEffec.g(u8.class, p0);
       return mi.A(new rb(ta.g), RxConnectables.a(subtypeEffec.h())).e(ms3.i("allboarding-mobius")).b(new sb(ta, 0)).a(new sb(ta, 1));
    }
}
