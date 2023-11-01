package p.js4;
import p.rh2;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observable;
import p.hs4;
import java.lang.Object;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.is4;
import io.reactivex.rxjava3.core.Observer;

public final class js4 extends Maybe implements rh2	// class@001b37 from classes.dex
{
    public final ObservableSource a;
    public final long b;

    public void js4(ObservableSource p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Observable a(){
       hs4 v6 = new hs4(this.a, this.b, null, false);
       return v6;
    }
    public final void d(MaybeObserver p0){
       this.a.subscribe(new is4(p0, this.b));
    }
}
