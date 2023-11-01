package p.dl4;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.al5;
import p.rp3;
import p.c16;
import p.yf2;
import p.x15;
import p.hd5;
import p.bb0;
import p.ab0;
import java.util.Objects;
import p.up0;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.mg1;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.pa0;
import java.lang.Class;
import p.ir0;
import p.i76;
import p.ha5;
import p.ra0;
import p.b5;
import p.na0;
import p.qa0;
import p.qf6;
import io.reactivex.rxjava3.core.Single;
import p.jl4;
import androidx.fragment.app.k;
import io.reactivex.rxjava3.core.Completable;
import p.jk0;
import com.spotify.liteui.login.LoginActivity;
import p.vc5;

public final class dl4 implements ObservableTransformer	// class@00136c from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void dl4(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final ObservableSource apply(Observable p0){
       int i = 15;
       dl4 tc = this.c;
       dl4 tb = this.b;
       switch (this.a){
           case 0:
             return p0.flatMapCompletable(new c16(tb.d, 12, tc)).m().s();
           case 1:
             return p0.flatMap(new c16(tb, i, tc));
           case 2:
             Objects.requireNonNull(tb);
             RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
             subtypeEffec.d(pa0.class, new mg1(9, new up0(3, tb)), id.a());
             subtypeEffec.f(new i76(29), id.a());
             Objects.requireNonNull(tc);
             subtypeEffec.b(ra0.class, new ha5(23, tc), id.a());
             subtypeEffec.e(na0.class, new ab0(0));
             subtypeEffec.d(qa0.class, new mg1(10, tc), id.a());
             return p0.map(new ab0(11)).compose(subtypeEffec.h());
           case 3:
             return p0.switchMap(new c16(tb, 18, tc));
           case 4:
             return p0.switchMap(new c16(tb, 19, tc));
           default:
             tb.getClass();
             return Observable.merge(tc, p0.observeOn(id.a()).flatMapCompletable(new vc5(i, tb)).s());
       }
    }
}
