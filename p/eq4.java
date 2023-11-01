package p.eq4;
import p.rh2;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.ObservableSource;
import p.zv6;
import p.u00;
import io.reactivex.rxjava3.core.Observable;
import p.tp4;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.String;
import java.util.Objects;
import p.dq4;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Throwable;
import p.co5;
import p.jl1;
import io.reactivex.rxjava3.disposables.Disposable;

public final class eq4 extends Single implements rh2	// class@0014da from classes.dex
{
    public final ObservableSource a;
    public final zv6 b;
    public final u00 c;

    public void eq4(ObservableSource p0,zv6 p1,u00 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Observable a(){
       tp4 v6 = new tp4(this.a, this.b, this.c, 1, 0);
       return v6;
    }
    public final void subscribeActual(SingleObserver p0){
       Object obj = this.b.get();
       Objects.requireNonNull(obj, "The initialSupplier returned a null value");
       this.a.subscribe(new dq4(p0, obj, this.c));
    }
}
