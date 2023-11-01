package p.kv4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.tp4;
import p.rz4;
import p.an5;
import java.lang.Throwable;
import p.cd1;
import io.reactivex.rxjava3.disposables.Disposable;

public final class kv4 implements Observer	// class@001c8f from classes.dex
{
    public final int a;
    public final Object b;
    public final Observer c;

    public void kv4(Observer p0,AtomicReference p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public void kv4(tp4 p0,rz4 p1){
       this.a = 2;
       this.b = p0;
       super();
       this.c = p1;
    }
    public final void onComplete(){
       kv4 tc = this.c;
       switch (this.a){
           case 0:
             tc.onComplete();
             return;
           case 1:
             tc.onComplete();
             return;
           default:
             return;
       }
    }
    public final void onError(Throwable p0){
       kv4 tc = this.c;
       switch (this.a){
           case 0:
             tc.onError(p0);
             return;
           case 1:
             tc.onError(p0);
             return;
           default:
             cd1.a(tc.c);
             tc.a.onError(p0);
             return;
       }
    }
    public final void onNext(Object p0){
       kv4 tc = this.c;
       switch (this.a){
           case 0:
             tc.onNext(p0);
             return;
           case 1:
             tc.onNext(p0);
             return;
           default:
             tc.lazySet(p0);
             return;
       }
    }
    public final void onSubscribe(Disposable p0){
       kv4 tb = this.b;
       switch (this.a){
           case 0:
             cd1.e(tb, p0);
             return;
           case 1:
             cd1.c(tb, p0);
             return;
           default:
             cd1.e(this.c.t, p0);
             return;
       }
    }
}
