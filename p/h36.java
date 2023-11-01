package p.h36;
import java.util.concurrent.Callable;
import p.l0;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class h36 extends l0 implements Callable	// class@0017d5 from classes.dex
{

    public void h36(Runnable p0,boolean p1){
       super(p0, p1);
    }
    public final Object call(){
       this.c = Thread.currentThread();
       this.a.run();
       this.lazySet(l0.t);
       this.c = null;
       return null;
    }
}
