package p.nv4;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import p.mv4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Integer;
import java.lang.Object;

public final class nv4 extends Observable	// class@002058 from classes.dex
{
    public final int a;
    public final long b;

    public void nv4(int p0,int p1){
       super();
       this.a = p0;
       this.b = (long)p0 + (long)p1;
    }
    public final void subscribeActual(Observer p0){
       mv4 v6 = new mv4(p0, (long)this.a, this.b);
       p0.onSubscribe(v6);
       if (v6.t != null) {
       }else {
          v6 = v6.c;
          while (true) {
             mv4 a = v6.a;
             if ((v6 - v6.b) && !v6.get()) {
                a.onNext(Integer.valueOf((int)v6));
                long l = v6 + 1;
             }else if(!v6.get()){
                v6.lazySet(1);
                a.onComplete();
             }
          }
       }
       return;
    }
}
