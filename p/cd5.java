package p.cd5;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.hd5;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ab0;
import p.yf2;
import java.util.Objects;
import p.tb4;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.bh6;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.l10;
import java.lang.Class;
import p.ir0;
import p.vc5;

public final class cd5 implements ObservableTransformer	// class@0011e7 from classes.dex
{
    public final int a;
    public final hd5 b;

    public void cd5(hd5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       cd5 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return p0.switchMapMaybe(new vc5(0, tb)).map(new ab0(10));
       }
       Objects.requireNonNull(tb);
       RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
       subtypeEffec.d(l10.class, new bh6(3, new tb4(2, tb)), id.a());
       return p0.map(new ab0(8)).compose(subtypeEffec.h()).map(new ab0(9));
    }
}
