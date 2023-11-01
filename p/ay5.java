package p.ay5;
import io.reactivex.rxjava3.core.SingleObserver;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;

public final class ay5 implements SingleObserver	// class@001019 from classes.dex
{
    public final int a;
    public final SingleObserver b;
    public final AtomicReference c;

    public void ay5(SingleObserver p0,AtomicReference p1){
       this.a = 1;
       super();
       this.b = p0;
       this.c = p1;
    }
    public void ay5(AtomicReference p0,SingleObserver p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final void onError(Throwable p0){
       ay5 tb = this.b;
       switch (this.a){
           case 0:
             tb.onError(p0);
             return;
           case 1:
             tb.onError(p0);
             return;
           default:
             tb.onError(p0);
             return;
       }
    }
    public final void onSubscribe(Disposable p0){
       ay5 tc = this.c;
       switch (this.a){
           case 0:
             cd1.c(tc, p0);
             return;
           case 1:
             cd1.e(tc, p0);
             return;
           default:
             cd1.c(tc, p0);
             return;
       }
    }
    public final void onSuccess(Object p0){
       ay5 tb = this.b;
       switch (this.a){
           case 0:
             tb.onSuccess(p0);
             return;
           case 1:
             tb.onSuccess(p0);
             return;
           default:
             tb.onSuccess(p0);
             return;
       }
    }
}
