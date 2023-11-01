package p.k77;
import java.lang.Runnable;
import p.m77;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import java.lang.Class;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Thread;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class k77 implements Runnable	// class@001bbf from classes.dex
{
    public final Runnable a;
    public final m77 b;
    public final long c;

    public void k77(Runnable p0,m77 p1,long p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void run(){
       if (this.b.t == null) {
          this.b.getClass();
          long l = Scheduler.a(TimeUnit.MILLISECONDS);
          k77 tc = this.c;
          if ((tc - l) > 0) {
             long l1 = tc - l;
             try{
                Thread.sleep(l1);
             }catch(java.lang.InterruptedException e0){
                Thread.currentThread().interrupt();
                RxJavaPlugins.c(e0);
                return;
             }
          }
          if (this.b.t == null) {
             this.a.run();
          }
       }
       return;
    }
}
