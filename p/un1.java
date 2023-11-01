package p.un1;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.ew0;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.zo0;
import java.lang.Class;
import p.tv4;
import p.sd5;
import p.yf2;
import p.ab0;
import p.bi5;
import java.util.Objects;
import p.sn1;
import p.pp;
import p.pg2;

public final class un1 implements ObservableTransformer	// class@0028e1 from classes.dex
{
    public final ew0 a;

    public void un1(ew0 p0){
       super();
       this.a = p0;
    }
    public final ObservableSource apply(Observable p0){
       zo0 ozo0 = p0.replay(1);
       ozo0.getClass();
       tv4 otv4 = new tv4(ozo0);
       ozo0 = otv4.map(new sd5(16)).filter(new ab0(19)).map(new sd5(17)).distinctUntilChanged();
       un1 ta = this.a;
       Objects.requireNonNull(ta);
       return Observable.combineLatest(otv4, ozo0.switchMap(new sn1(ta, 0)).distinctUntilChanged().onErrorResumeNext(new sd5(18)), ozo0.switchMap(new sn1(ta, 1)).distinctUntilChanged().onErrorResumeNext(new sd5(19)), new pp(3)).distinctUntilChanged();
    }
}
