package p.au4;
import p.rh2;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observable;
import p.gr4;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.zt4;
import io.reactivex.rxjava3.core.Observer;

public final class au4 extends Completable implements rh2	// class@000ff4 from classes.dex
{
    public final ObservableSource a;

    public void au4(ObservableSource p0){
       super();
       this.a = p0;
    }
    public final Observable a(){
       return new gr4(this.a, 3);
    }
    public final void o(CompletableObserver p0){
       this.a.subscribe(new zt4(p0));
    }
}
