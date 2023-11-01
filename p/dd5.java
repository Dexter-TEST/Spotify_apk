package p.dd5;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.rd5;
import p.mg1;
import p.ha5;
import p.zg0;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ab0;
import p.yf2;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.s02;
import p.b35;
import java.lang.Class;
import p.s81;
import p.c35;
import java.util.Objects;
import p.s35;
import p.t35;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.a35;
import p.b5;
import p.u25;
import p.w25;
import p.y25;
import p.x25;
import p.up0;
import p.z25;
import p.t25;
import p.v25;
import p.ir0;

public final class dd5 implements ObservableTransformer	// class@001327 from classes.dex
{
    public final t35 a;
    public final ir0 b;
    public final b5 c;
    public final zg0 d;

    public void dd5(rd5 p0,mg1 p1,ha5 p2,zg0 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final ObservableSource apply(Observable p0){
       RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
       subtypeEffec.g(b35.class, new s02(14));
       dd5 ta = this.a;
       subtypeEffec.g(c35.class, new s81(8, ta));
       Objects.requireNonNull(ta);
       subtypeEffec.b(a35.class, new s35(ta, 0), id.a());
       s35 os35 = new s35(ta, 1);
       subtypeEffec.b(u25.class, os35, id.a());
       subtypeEffec.b(w25.class, this.c, id.a());
       subtypeEffec.e(y25.class, new ab0(1));
       subtypeEffec.e(x25.class, new ab0(2));
       subtypeEffec.e(z25.class, new up0(28, this.d));
       subtypeEffec.e(t25.class, new ab0(3));
       subtypeEffec.d(v25.class, new mg1(11, this.b), id.a());
       return p0.map(new ab0(7)).compose(subtypeEffec.h());
    }
}
