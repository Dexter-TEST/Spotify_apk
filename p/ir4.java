package p.ir4;
import p.rh2;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observable;
import p.gr4;
import io.reactivex.rxjava3.core.SingleObserver;
import p.hr4;
import io.reactivex.rxjava3.core.Observer;

public final class ir4 extends Single implements rh2	// class@0019ee from classes.dex
{
    public final ObservableSource a;

    public void ir4(ObservableSource p0){
       super();
       this.a = p0;
    }
    public final Observable a(){
       return new gr4(this.a, 0);
    }
    public final void subscribeActual(SingleObserver p0){
       this.a.subscribe(new hr4(p0));
    }
}
