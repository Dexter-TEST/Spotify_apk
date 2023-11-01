package p.xs4;
import p.rh2;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yf2;
import io.reactivex.rxjava3.core.Observable;
import p.us4;
import java.lang.Object;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.ws4;
import io.reactivex.rxjava3.core.Observer;

public final class xs4 extends Completable implements rh2	// class@002cdb from classes.dex
{
    public final ObservableSource a;
    public final yf2 b;
    public final boolean c;

    public void xs4(ObservableSource p0,yf2 p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Observable a(){
       return new us4(this.a, this.b, this.c, 0);
    }
    public final void o(CompletableObserver p0){
       this.a.subscribe(new ws4(p0, this.b, this.c));
    }
}
