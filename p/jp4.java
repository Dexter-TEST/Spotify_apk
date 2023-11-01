package p.jp4;
import io.reactivex.rxjava3.core.ObservableSource;
import p.o20;
import p.ii3;
import p.co5;
import p.ir0;
import p.b5;
import p.mb;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.CountDownLatch;
import java.lang.Throwable;
import java.lang.RuntimeException;
import p.iw1;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Thread;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.concurrent.LinkedBlockingQueue;
import p.x20;
import java.lang.Object;
import p.ak4;
import java.util.Objects;

public abstract class jp4	// class@001b1e from classes.dex
{

    public static void subscribe(ObservableSource p0){
       o20 oo20;
       o20 a;
       try{
          oo20 = new o20();
          p0.subscribe(new ii3(co5.g, oo20, oo20, co5.g));
          if (!(oo20.getCount())) {
          }else {
             oo20.await();
          }
          if ((a = oo20.a) == null) {
             return;
          }else {
             throw iw1.f(a);
          }
       }catch(java.lang.InterruptedException e6){
          new ii3(co5.g, oo20, oo20, co5.g).dispose();
          Thread.currentThread().interrupt();
          throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e6);
       }
    }
    public static void subscribe(ObservableSource p0,Observer p1){
       LinkedBlockingQueue linkedBlocki = new LinkedBlockingQueue();
       x20 ox20 = new x20(linkedBlocki);
       p1.onSubscribe(ox20);
       p0.subscribe(ox20);
       while (!ox20.isDisposed()) {
          if ((p0 = linkedBlocki.poll()) == null) {
             try{
                p0 = linkedBlocki.take();
             }catch(java.lang.InterruptedException e3){
                ox20.dispose();
                p1.onError(e3);
                return;
             }
          }
          if (!ox20.isDisposed() && (p0 != x20.b && !ak4.b(p1, p0))) {
          }else {
             break ;
          }
       }
       return;
    }
    public static void subscribe(ObservableSource p0,ir0 p1,ir0 p2,b5 p3){
       Objects.requireNonNull(p1, "onNext is null");
       Objects.requireNonNull(p2, "onError is null");
       Objects.requireNonNull(p3, "onComplete is null");
       jp4.subscribe(p0, new ii3(p1, p2, p3, co5.g));
    }
}
