package p.m16;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Runnable;
import java.lang.Object;
import p.pc6;
import androidx.work.rxjava3.RxWorker;
import java.util.concurrent.Executor;
import p.x0;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.q0;

public final class m16 implements SingleObserver, Runnable	// class@001e08 from classes.dex
{
    public final pc6 a;
    public Disposable b;

    public void m16(){
       super();
       pc6 opc6 = new pc6();
       this.a = opc6;
       opc6.a(this, RxWorker.w);
    }
    public final void onError(Throwable p0){
       this.a.j(p0);
    }
    public final void onSubscribe(Disposable p0){
       this.b = p0;
    }
    public final void onSuccess(Object p0){
       this.a.i(p0);
    }
    public final void run(){
       m16 tb;
       if (this.a.a instanceof q0 && (tb = this.b) != null) {
          tb.dispose();
       }
       return;
    }
}
