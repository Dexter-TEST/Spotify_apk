package p.hz4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.gz4;
import io.reactivex.rxjava3.disposables.Disposable;

public final class hz4 extends z1	// class@0018f1 from classes.dex
{
    public final ObservableSource b;
    public final int c;

    public void hz4(ObservableSource p0,ObservableSource p1,int p2){
       super(p0);
       this.b = p1;
       this.c = p2;
    }
    public final void subscribeActual(Observer p0){
       gz4 ogz4 = new gz4(p0, this.c);
       p0.onSubscribe(ogz4);
       this.b.subscribe(ogz4.c);
       this.a.subscribe(ogz4);
    }
}
