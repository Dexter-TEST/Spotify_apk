package p.vz4;
import io.reactivex.rxjava3.core.Observer;
import p.uz4;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.gq6;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;

public final class vz4 implements Observer	// class@002a96 from classes.dex
{
    public final uz4 a;
    public final gq6 b;
    public boolean c;
    public Throwable t;
    public final AtomicReference v;

    public void vz4(uz4 p0,int p1){
       super();
       this.v = new AtomicReference();
       this.a = p0;
       this.b = new gq6(p1);
    }
    public final void onComplete(){
       this.c = true;
       this.a.b();
    }
    public final void onError(Throwable p0){
       this.t = p0;
       this.c = true;
       this.a.b();
    }
    public final void onNext(Object p0){
       this.b.offer(p0);
       this.a.b();
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.v, p0);
    }
}
