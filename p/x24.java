package p.x24;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;

public final class x24 implements MaybeObserver	// class@002bf5 from classes.dex
{
    public final int a;
    public final AtomicReference b;
    public final MaybeObserver c;

    public void x24(AtomicReference p0,MaybeObserver p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onComplete(){
       x24 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tc.onComplete();
             return;
       }
       tc.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       x24 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tc.onError(p0);
             return;
       }
       tc.onError(p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       x24 tb = this.b;
       switch (this.a){
           case 0:
           default:
             cd1.c(tb, p0);
             return;
       }
       cd1.c(tb, p0);
       return;
    }
    public final void onSuccess(Object p0){
       x24 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tc.onSuccess(p0);
             return;
       }
       tc.onSuccess(p0);
       return;
    }
}
