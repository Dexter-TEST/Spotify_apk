package p.wv4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import p.ra6;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Throwable;
import p.co5;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class wv4 extends AtomicInteger implements Observer	// class@002bb4 from classes.dex
{
    public final Observer a;
    public final ra6 b;
    public final ObservableSource c;

    public void wv4(Observer p0,ra6 p1,ObservableSource p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onComplete(){
       throw null;
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       wv4 tb = this.b;
       tb.getClass();
       cd1.c(tb, p0);
    }
}
