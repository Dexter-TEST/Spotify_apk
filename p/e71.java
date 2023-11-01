package p.e71;
import java.lang.Runnable;
import p.mu1;
import p.nu1;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import java.lang.Long;
import java.lang.Thread;
import java.util.concurrent.RejectedExecutionException;
import p.p37;
import java.lang.Object;
import java.lang.ThreadLocal;
import java.lang.System;
import java.util.concurrent.locks.LockSupport;

public final class e71 extends mu1 implements Runnable	// class@00142f from classes.dex
{
    private static Thread _thread;
    private static int debugStatus;
    public static final e71 x;
    public static final long y;

    static {
       Long longx;
       e71 uoe71 = new e71();
       e71.x = uoe71;
       uoe71.m0(false);
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       try{
          int i = 1000;
          longx = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", i);
       }catch(java.lang.SecurityException e0){
          longx = Long.valueOf(longx);
       }
       e71.y = e0.toNanos(longx.longValue());
    }
    public void e71(){
       super();
    }
    public final Thread l0(){
       Thread _thread;
       if ((_thread = e71._thread) == null) {
          _monitor_enter(this);
          if ((_thread = e71._thread) == null) {
             _thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
             e71._thread = _thread;
             _thread.setDaemon(true);
             _thread.start();
          }
          _monitor_exit(this);
       }
       return _thread;
    }
    public final void o0(Runnable p0){
       int i = (e71.debugStatus == 4)? 1: 0;
       if (!i) {
          super.o0(p0);
          return;
       }else {
          throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown\(\) was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
       }
    }
    public final void run(){
       Object obj = this;
       p37.a.set(obj);
       _monitor_enter(this);
       int debugStatus = ((debugStatus = e71.debugStatus) != 2 && debugStatus != 3)? 0: 1;
       if (debugStatus) {
          _monitor_exit(this);
          debugStatus = 0;
       }else {
          e71.debugStatus = 1;
          this.notifyAll();
          _monitor_exit(this);
          debugStatus = 1;
       }
       if (!debugStatus) {
          e71._thread = null;
          this.t0();
          if (!this.q0()) {
             this.l0();
          }
          return;
       }else {
          long l = Long.MAX_VALUE;
          while (true) {
             Thread.interrupted();
             long l1 = this.r0();
             if (!(l1 - Long.MAX_VALUE)) {
                long l2 = System.nanoTime();
                if (!(l - Long.MAX_VALUE)) {
                   l = e71.y + l2;
                }
                l2 = l - l2;
                if ((l2) <= 0) {
                   e71._thread = null;
                   this.t0();
                   if (!this.q0()) {
                      this.l0();
                      break ;
                   }
                   break ;
                }else if((l1 - l2) > 0){
                   l1 = l2;
                label_006e :
                   if ((l1) > 0) {
                      debugStatus = ((debugStatus = e71.debugStatus) != 2 && debugStatus != 3)? 0: 1;
                      if (debugStatus) {
                         e71._thread = null;
                         this.t0();
                         if (!this.q0()) {
                            this.l0();
                         }
                         return;
                      }else {
                         LockSupport.parkNanos(obj, l1);
                      }
                   }
                }else {
                   goto label_006e ;
                }
             }else {
                l = Long.MAX_VALUE;
                goto label_006e ;
             }
          }
          return;
       }
    }
    public final void shutdown(){
       e71.debugStatus = 4;
       super.shutdown();
    }
    public synchronized final void t0(){
       int debugStatus = ((debugStatus = e71.debugStatus) != 2 && debugStatus != 3)? 0: 1;
       if (!debugStatus) {
          return;
       }else {
          e71.debugStatus = 3;
          this.s0();
          this.notifyAll();
          return;
       }
    }
}
