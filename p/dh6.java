package p.dh6;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.s01;
import p.hh6;
import p.yf2;
import p.px3;
import p.a05;
import java.util.Objects;
import p.fh6;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.bh6;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.l10;
import java.lang.Class;
import p.ir0;

public final class dh6 implements ObservableTransformer	// class@00134b from classes.dex
{
    public final int a;
    public final Object b;

    public void dh6(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final ObservableSource apply(Observable p0){
       dh6 tb = this.b;
       switch (this.a){
           case 0:
             return p0.flatMap(new hh6(tb, 0));
           case 1:
             return p0.flatMap(new hh6(tb, 1));
           default:
             Objects.requireNonNull(tb);
             RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
             subtypeEffec.d(l10.class, new bh6(3, new fh6(tb)), id.a());
             return p0.map(new a05(25)).compose(subtypeEffec.h()).map(new a05(26));
       }
    }
}
