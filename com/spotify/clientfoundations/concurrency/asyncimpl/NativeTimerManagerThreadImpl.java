package com.spotify.clientfoundations.concurrency.asyncimpl.NativeTimerManagerThreadImpl;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.clientfoundations.concurrency.async.Scheduler;
import com.spotify.clientfoundations.concurrency.asyncimpl.NativeTimerManagerThreadImpl$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Exception;
import java.util.concurrent.CyclicBarrier;
import java.lang.String;
import p.co5;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import p.jj1;
import java.lang.RuntimeException;

public final class NativeTimerManagerThreadImpl implements NativeTimerManagerThread, Scheduler	// class@00054f from classes.dex
{
    private final boolean isCurrentThread;
    private long nThis;
    public static final NativeTimerManagerThreadImpl$Companion Companion;

    static {
       NativeTimerManagerThreadImpl.Companion = new NativeTimerManagerThreadImpl$Companion(null);
    }
    private void NativeTimerManagerThreadImpl(){
       super();
    }
    public static void a(Runnable p0,Exception[] p1,CyclicBarrier p2){
       NativeTimerManagerThreadImpl.runBlocking$lambda-0(p0, p1, p2);
    }
    public static native final NativeTimerManagerThreadImpl create(String p0);
    private static final void runBlocking$lambda-0(Runnable p0,Exception[] p1,CyclicBarrier p2){
       co5.o(p0, "$callback");
       co5.o(p1, "$exceptions");
       try{
          co5.o(p2, "$barrier");
          p0.run();
       }catch(java.lang.Exception e1){
          p1[0] = e1;
       }
       try{
          p2.await();
          return;
       }catch(java.lang.InterruptedException e1){
          throw new IllegalStateException("Interrupted exception awaiting barrier \(on core thread\)", e1);
       }catch(java.util.concurrent.BrokenBarrierException e1){
          throw new IllegalStateException("Broken barrier exception awaiting barrier \(on core thread\)", e1);
       }
    }
    public native void destroy();
    public long getNThis(){
       return this.nThis;
    }
    public native boolean isCurrentThread();
    public native void post(Runnable p0);
    public void runBlocking(Runnable p0){
       co5.o(p0, "callback");
       CyclicBarrier uCyclicBarri = new CyclicBarrier(2);
       if (this.isCurrentThread()) {
          throw new RuntimeException("Not allowed to run blocking task on core thread from the core thread.");
       }
       Exception[] uExceptionAr = new Exception[1];
       jj1 ojj1 = new jj1(p0, uExceptionAr, uCyclicBarri, 4);
       try{
          this.post(ojj1);
          uCyclicBarri.await();
          int i = 0;
          if (uExceptionAr[i] == null) {
             return;
          }
          throw new IllegalStateException("Callback to NativeTimerManagerThreadImpl.run\(...\) threw", uExceptionAr[i]);
       }catch(java.lang.InterruptedException e5){
          throw new IllegalStateException("Interrupted exception awaiting barrier", e5);
       }catch(java.util.concurrent.BrokenBarrierException e5){
          throw new IllegalStateException("Broken barrier exception awaiting barrier", e5);
       }
    }
    public native final void start();
    public native final void stop();
}
