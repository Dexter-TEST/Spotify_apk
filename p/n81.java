package p.n81;
import p.xe7;
import java.lang.Object;
import p.m81;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import android.os.Looper;
import android.os.Handler;
import android.os.Build$VERSION;
import p.q3;
import java.lang.Class;
import android.os.Handler$Callback;
import java.lang.Boolean;
import java.lang.reflect.Constructor;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import java.lang.Thread;

public final class n81 extends xe7	// class@001f86 from classes.dex
{
    public final Object F;
    public final ExecutorService G;
    public Handler H;

    public void n81(){
       super();
       this.F = new Object();
       this.G = Executors.newFixedThreadPool(4, new m81(this));
    }
    public static Handler n0(Looper p0){
       if (Build$VERSION.SDK_INT >= 28) {
          return q3.h(p0);
       }
       try{
          Class[] uClassArray = new Class[]{Looper.class,Handler$Callback.class,Boolean.TYPE};
          Object[] objArray = new Object[]{p0,null,Boolean.TRUE};
          return Handler.class.getDeclaredConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.IllegalAccessException e0){
          return new Handler(p0);
       }catch(java.lang.InstantiationException e0){
       }catch(java.lang.NoSuchMethodException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
          return new Handler(p0);
       }
    }
    public final void o0(Runnable p0){
       this.G.execute(p0);
    }
    public final boolean p0(){
       boolean b = (Looper.getMainLooper().getThread() == Thread.currentThread())? true: false;
       return b;
    }
    public final void q0(Runnable p0){
       if (this.H == null) {
          n81 tF = this.F;
          _monitor_enter(tF);
          if (this.H == null) {
             this.H = n81.n0(Looper.getMainLooper());
          }
          _monitor_exit(tF);
       }
       this.H.post(p0);
       return;
    }
}
