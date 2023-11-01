package p.n20;
import p.k20;
import java.lang.Throwable;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;

public final class n20 extends k20	// class@001f4f from classes.dex
{
    public final int v;

    public void n20(int p0){
       this.v = p0;
       super();
    }
    public final void onError(Throwable p0){
       switch (this.v){
           case 0:
             break;
           default:
             this.a = null;
             this.b = p0;
             this.countDown();
             return;
       }
       if (this.a == null) {
          this.b = p0;
       }
       this.countDown();
       return;
    }
    public final void onNext(Object p0){
       switch (this.v){
           case 0:
             break;
           default:
             this.a = p0;
             return;
       }
       if (this.a == null) {
          this.a = p0;
          this.c.dispose();
          this.countDown();
       }
       return;
    }
}
