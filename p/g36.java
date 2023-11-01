package p.g36;
import java.lang.Runnable;
import p.l0;
import java.lang.Thread;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class g36 extends l0 implements Runnable	// class@001693 from classes.dex
{

    public void g36(Runnable p0,boolean p1){
       super(p0, p1);
    }
    public final void run(){
       this.c = Thread.currentThread();
       this.a.run();
       this.c = null;
    }
}
