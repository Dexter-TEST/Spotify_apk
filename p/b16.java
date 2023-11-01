package p.b16;
import io.reactivex.rxjava3.core.ObservableTransformer;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import java.lang.Class;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import com.spotify.mobius.rx3.a;
import p.ir0;

public final class b16 implements ObservableTransformer	// class@001035 from classes.dex
{
    public final RxMobius$SubtypeEffectHandlerBuilder a;
    public final Class b;
    public final ObservableTransformer c;

    public void b16(RxMobius$SubtypeEffectHandlerBuilder p0,Class p1,ObservableTransformer p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final ObservableSource apply(Observable p0){
       b16 ta = this.a;
       ta.getClass();
       b16 tc = this.c;
       return p0.ofType(this.b).compose(tc).doOnError(ta.b.apply(tc));
    }
}
