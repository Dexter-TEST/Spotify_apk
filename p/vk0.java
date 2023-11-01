package p.vk0;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.mj6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class vk0 implements SingleObserver	// class@002a0d from classes.dex
{
    public final int a;
    public final Object b;

    public void vk0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onError(Throwable p0){
       vk0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.a.onError(p0);
             return;
       }
       tb.onError(p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       vk0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             cd1.e(tb, p0);
             return;
       }
       tb.onSubscribe(p0);
       return;
    }
    public final void onSuccess(Object p0){
       vk0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.a.onSuccess(p0);
             return;
       }
       tb.onComplete();
       return;
    }
}
