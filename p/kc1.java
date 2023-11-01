package p.kc1;
import java.lang.Object;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import p.we7;
import java.lang.String;
import p.co5;
import p.te7;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.lang.AssertionError;
import p.ip5;
import java.util.concurrent.atomic.AtomicInteger;
import p.lp5;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Class;
import p.g15;
import java.lang.Runnable;
import java.io.InterruptedIOException;
import java.lang.Throwable;
import java.io.IOException;
import p.t90;
import p.da0;

public final class kc1	// class@001be6 from classes.dex
{
    public ThreadPoolExecutor a;
    public final ArrayDeque b;
    public final ArrayDeque c;
    public final ArrayDeque d;

    public void kc1(){
       super();
       this.b = new ArrayDeque();
       this.c = new ArrayDeque();
       this.d = new ArrayDeque();
    }
    public synchronized final ExecutorService a(){
       if (this.a == null) {
          String str = co5.K(" Dispatcher", we7.g);
          co5.o(str, "name");
          te7 ote7 = new te7(str, false);
          ThreadPoolExecutor v0 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), ote7);
          this.a = v0;
       }
       kc1 ta = this.a;
       co5.i(ta);
       return ta;
    }
    public final void b(ArrayDeque p0,Object p1){
       _monitor_enter(this);
       if (!p0.remove(p1)) {
          throw new AssertionError("Call wasn\'t in-flight!");
       }
       this.e();
       _monitor_exit(this);
       this.h();
       return;
    }
    public final void c(ip5 p0){
       co5.o(p0, "call");
       p0.b.decrementAndGet();
       this.b(this.c, p0);
    }
    public final void d(lp5 p0){
       co5.o(p0, "call");
       _monitor_enter(this);
       if (!this.d.remove(p0)) {
          throw new AssertionError("Call wasn\'t in-flight!");
       }
       this.e();
       _monitor_exit(this);
       this.h();
       return;
    }
    public synchronized final void e(){
    }
    public synchronized final void f(){
    }
    public synchronized final void g(){
    }
    public final void h(){
       ip5 oip5;
       ArrayList uArrayList = new ArrayList();
       _monitor_enter(this);
       Iterator iterator = this.b.iterator();
       co5.l(iterator, "readyAsyncCalls.iterator\(\)");
       while (iterator.hasNext()) {
          oip5 = iterator.next();
          this.f();
          if (this.c.size() >= 64) {
             break ;
          }else {
             this.g();
             if (oip5.b.get() >= 5) {
                continue ;
             }else {
                iterator.remove();
                oip5.b.incrementAndGet();
                uArrayList.add(oip5);
                this.c.add(oip5);
             }
          }
       }
       this.i();
       _monitor_exit(this);
       int i = uArrayList.size();
       int i1 = 0;
       while (i1 < i) {
          int i2 = i1 + 1;
          oip5 = uArrayList.get(i1);
          ExecutorService uExecutorSer = this.a();
          oip5.getClass();
          try{
             byte[] a = we7.a;
             uExecutorSer.execute(oip5);
          }catch(java.util.concurrent.RejectedExecutionException e4){
             InterruptedIOException interruptedI = new InterruptedIOException("executor rejected");
             interruptedI.initCause(e4);
             oip5.c.j(interruptedI);
             oip5.a.onFailure(oip5.c, interruptedI);
             oip5.c.a.a.c(oip5);
          }
          i1 = i2;
       }
       return;
    }
    public synchronized final int i(){
       return (this.c.size() + this.d.size());
    }
}
