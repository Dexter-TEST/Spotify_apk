package p.yc1;
import io.reactivex.rxjava3.core.Observer;
import p.m0;
import p.ir0;
import p.b5;
import p.ad1;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.disposables.Disposable;

public final class yc1 extends m0 implements Observer	// class@002d8c from classes.dex
{
    public final ir0 t;

    public void yc1(ir0 p0,ir0 p1,b5 p2,ad1 p3){
       super(p2, p1, p3);
       this.t = p0;
    }
    public final void onNext(Object p0){
       if (this.get() != cd1.a) {
          this.t.accept(p0);
       }
       return;
    }
}
