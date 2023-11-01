package p.ww1;
import p.er7;
import java.lang.Class;
import p.is3;
import p.ls3;
import java.util.concurrent.ExecutorService;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import java.util.List;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import java.lang.Exception;
import java.lang.Runnable;
import java.util.concurrent.Future;

public final class ww1 implements er7	// class@002bba from classes.dex
{
    public final ExecutorService a;
    public final ReentrantLock b;
    public static final is3 c;

    static {
       ww1.c = ls3.d(ww1.class);
    }
    public void ww1(ExecutorService p0){
       super();
       this.b = new ReentrantLock();
       this.a = p0;
    }
    public final void dispose(){
       ww1 ta = this.a;
       is3 c = ww1.c;
       ww1 tb = this.b;
       try{
          tb.lock();
          List list = ta.shutdownNow();
          if (!list.isEmpty()) {
             c.f(Integer.valueOf(list.size()));
          label_0021 :
             tb.unlock();
             if (!ta.awaitTermination(100, TimeUnit.MILLISECONDS)) {
                c.a();
             }
          }else {
             goto label_0021 ;
          }
       }catch(java.lang.InterruptedException e0){
          c.e("Timeout when disposing work runner", e0);
       }
       return;
    }
    public final void post(Runnable p0){
       ww1 ta = this.a;
       ww1 tb = this.b;
       tb.lock();
       if (!ta.isTerminated() && !ta.isShutdown()) {
          ta.submit(p0);
       }
       tb.unlock();
       return;
    }
}
