package p.si6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;

public final class si6 implements SingleObserver, Disposable	// class@002637 from classes.dex
{
    public SingleObserver a;
    public Disposable b;

    public void si6(SingleObserver p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.a = null;
       this.b.dispose();
       this.b = cd1.a;
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onError(Throwable p0){
       si6 ta;
       this.b = cd1.a;
       if ((ta = this.a) != null) {
          this.a = null;
          ta.onError(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       si6 ta;
       this.b = cd1.a;
       if ((ta = this.a) != null) {
          this.a = null;
          ta.onSuccess(p0);
       }
       return;
    }
}
