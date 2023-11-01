package p.w20;
import p.ed1;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import io.reactivex.rxjava3.core.Notification;

public final class w20 extends ed1	// class@002aae from classes.dex
{
    public final ArrayBlockingQueue b;
    public final AtomicInteger c;

    public void w20(){
       super();
       this.b = new ArrayBlockingQueue(1);
       this.c = new AtomicInteger();
    }
    public final void onComplete(){
    }
    public final void onError(Throwable p0){
       RxJavaPlugins.c(p0);
    }
    public final void onNext(Object p0){
       Notification notification;
       if (this.c.getAndSet(0) == 1 || !p0.c()) {
          while (true) {
             w20 tb = this.b;
             if (!tb.offer(p0)) {
                if ((notification = tb.poll()) != null && !notification.c()) {
                   p0 = notification;
                }
             }
          }
       }
       return;
    }
}
