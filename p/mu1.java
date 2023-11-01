package p.mu1;
import p.b91;
import p.nu1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.xw0;
import java.lang.Runnable;
import p.ir3;
import p.xe7;
import java.lang.Thread;
import java.util.concurrent.locks.LockSupport;
import p.e71;
import p.vy;
import p.lu1;
import p.lv1;
import java.lang.System;
import p.p37;
import java.lang.ThreadLocal;

public abstract class mu1 extends nu1 implements b91	// class@001f06 from classes.dex
{
    private Object _delayed;
    private int _isCompleted;
    private Object _queue;
    public static final AtomicReferenceFieldUpdater w;

    static {
       mu1.w = AtomicReferenceFieldUpdater.newUpdater(mu1.class, Object.class, "_queue");
       AtomicReferenceFieldUpdater.newUpdater(mu1.class, Object.class, "_delayed");
    }
    public void mu1(){
       super();
       this._queue = null;
       this._delayed = null;
       this._isCompleted = 0;
    }
    public final void g0(xw0 p0,Runnable p1){
       this.o0(p1);
    }
    public void o0(Runnable p0){
       int i1;
       AtomicReferenceFieldUpdater w1;
       ir3 oir3;
       while (true) {
          mu1 t_queue = this._queue;
          int i = 0;
          if (this._isCompleted != null) {
             break ;
          }else {
             boolean b = true;
             if (t_queue == null) {
                AtomicReferenceFieldUpdater w = mu1.w;
                while (true) {
                   if (w.compareAndSet(this, null, p0)) {
                      i = 1;
                   }else {
                      if (w.get(this) == null) {
                         continue ;
                      }
                   }
                   if (!i) {
                   }
                }
             }else if(t_queue instanceof ir3){
                mu1 omu1 = t_queue;
                if (i1 = omu1.a(p0)) {
                   if (i1 != b) {
                      if (i1 != 2) {
                      }else if(i){
                         Thread thread = this.l0();
                         if (Thread.currentThread() != thread) {
                            LockSupport.unpark(thread);
                         }
                      }else {
                         e71.x.o0(p0);
                      }
                      return;
                   }else {
                      w1 = mu1.w;
                      oir3 = omu1.e();
                      do {
                      } while (w1.compareAndSet(this, t_queue, oir3) || w1.get(this) != t_queue);
                   }
                }
             }else if(t_queue == xe7.t){
             }else {
                oir3 = new ir3(8, b);
                oir3.a(t_queue);
                oir3.a(p0);
                AtomicReferenceFieldUpdater w2 = mu1.w;
                while (true) {
                   if (w2.compareAndSet(this, t_queue, oir3)) {
                      w1 = 1;
                   }else {
                      if (w2.get(this) == t_queue) {
                         continue ;
                      }
                   }
                   if (!w1) {
                   }
                }
             }
             i = 1;
          }
       }
    }
    public final long p0(){
       nu1 tv;
       int i;
       mu1 t_queue;
       if ((tv = this.v) == null) {
       }else if(tv.b == tv.c){
          t_queue = 1;
       }else {
          t_queue = 0;
       }
       if (!t_queue) {
          i = 0;
       label_001a :
          if (!(i)) {
             return 0;
          }else if((t_queue = this._queue) != null){
             if (t_queue instanceof ir3) {
                if (!t_queue.d()) {
                   return 0;
                }
             }else if(t_queue == xe7.t){
                return Long.MAX_VALUE;
             }else {
                return 0;
             }
          }
          if ((t_queue = this._delayed) != null) {
             _monitor_enter(t_queue);
             _monitor_exit(t_queue);
          }
          return Long.MAX_VALUE;
       }
       i = Long.MAX_VALUE;
       goto label_001a ;
    }
    public final boolean q0(){
       nu1 tv = this.v;
       boolean b = false;
       mu1 t_delayed = (tv != null && tv.b != tv.c)? 0: 1;
       if (!tv) {
          return b;
       }else if((t_delayed = this._delayed) != null && !t_delayed.y()){
          return b;
       }else if((t_delayed = this._queue) == null){
       label_0034 :
          b = true;
       }else if(t_delayed instanceof ir3){
          b = t_delayed.d();
       }else if(t_delayed == xe7.t){
          goto label_0034 ;
       }
       return b;
    }
    public final long r0(){
       mu1 t_delayed;
       Runnable runnable;
       mu1 omu1;
       AtomicReferenceFieldUpdater obj;
       if (this.n0()) {
          return 0;
       }
       if ((t_delayed = this._delayed) != null && !t_delayed.y()) {
          System.nanoTime();
          _monitor_enter(t_delayed);
          _monitor_exit(t_delayed);
       }
       while (true) {
          t_delayed = this._queue;
          runnable = null;
          if (t_delayed == null) {
             break ;
          }else if(t_delayed instanceof ir3){
             omu1 = t_delayed;
             if ((obj = omu1.f()) != ir3.g) {
                runnable = obj;
             }else {
                obj = mu1.w;
                ir3 oir3 = omu1.e();
                do {
                } while (obj.compareAndSet(this, t_delayed, oir3) || obj.get(this) != t_delayed);
             }
          }else if(t_delayed == xe7.t){
          }else {
             obj = mu1.w;
             while (true) {
                if (obj.compareAndSet(this, t_delayed, runnable)) {
                   omu1 = 1;
                }else {
                   if (obj.get(this) != t_delayed) {
                      omu1 = 0;
                   }
                }
                if (omu1) {
                   omu1 = t_delayed;
                }else {
                   continue ;
                }
             }
             runnable.run();
             return 0;
          }
       }
       if (runnable != null) {
       }else {
          return this.p0();
       }
    }
    public final void s0(){
       this._queue = null;
       this._delayed = null;
    }
    public void shutdown(){
       AtomicReferenceFieldUpdater w;
       mu1 t_delayed;
       p37.a.set(null);
       int i = 1;
       this._isCompleted = i;
       while (true) {
          mu1 t_queue = this._queue;
          bx6 t = xe7.t;
          int i1 = 0;
          if (t_queue == null) {
             w = mu1.w;
             while (true) {
                if (w.compareAndSet(this, null, t)) {
                   i1 = 1;
                }else {
                   if (w.get(this) == null) {
                      continue ;
                   }
                }
                if (!i1) {
                   continue ;
                }
             }
          }else if(t_queue instanceof ir3){
             t_queue.b();
          }else if(t_queue == t){
             ir3 oir3 = new ir3(8, i);
             oir3.a(t_queue);
             w = mu1.w;
             while (true) {
                if (w.compareAndSet(this, t_queue, oir3)) {
                   i1 = 1;
                }else {
                   if (w.get(this) == t_queue) {
                      continue ;
                   }
                }
                if (!i1) {
                }
             }
          }
          do {
          } while ((this.r0()) > 0);
          System.nanoTime();
          if ((t_delayed = this._delayed) != null) {
             t_delayed.G();
          }
          return;
       }
    }
}
