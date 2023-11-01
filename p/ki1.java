package p.ki1;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.qf7;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.a05;
import p.yf2;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.x75;
import java.lang.Class;
import java.util.concurrent.TimeUnit;
import p.li1;
import p.ei1;
import p.jh6;

public final class ki1 implements ObservableTransformer	// class@001c19 from classes.dex
{
    public final int a;
    public final qf7 b;

    public void ki1(qf7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       RxMobius$SubtypeEffectHandlerBuilder subtypeEffec;
       int i = 1;
       int i1 = 0;
       long l = 1200;
       ki1 tb = this.b;
       switch (this.a){
           case 0:
             return p0.debounce(l, TimeUnit.MILLISECONDS).flatMapSingle(new li1(tb, i1));
           case 1:
             return p0.debounce(l, TimeUnit.MILLISECONDS).flatMapSingle(new li1(tb, i));
           case 2:
             subtypeEffec = RxMobius.a();
             subtypeEffec.g(x75.class, new ki1(tb, i));
             return p0.map(new a05(27)).compose(subtypeEffec.h()).map(new a05(28));
           default:
             subtypeEffec = RxMobius.a();
             subtypeEffec.g(ei1.class, new ki1(tb, i1));
             return p0.map(new a05(29)).compose(subtypeEffec.h()).map(new jh6(i1));
       }
    }
}
