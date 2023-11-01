package p.b44;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.x81;
import p.iv6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Throwable;
import p.cd1;
import p.kv6;
import java.lang.Object;

public final class b44 extends x81 implements MaybeObserver	// class@001050 from classes.dex
{
    public Disposable c;

    public void b44(iv6 p0){
       super(p0);
    }
    public final void cancel(){
       super.cancel();
       this.c.dispose();
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       this.d(p0);
    }
}
