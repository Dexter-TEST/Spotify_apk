package p.r00;
import p.gt5;
import java.lang.Object;
import p.q00;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.System;
import p.yj;
import java.lang.NullPointerException;
import java.lang.String;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public final class r00 extends gt5	// class@00244a from classes.dex
{
    public final AtomicReference a;
    public final AtomicReference b;
    public final Lock c;
    public final Lock t;
    public long v;
    public static final Object[] w;
    public static final q00[] x;

    static {
       Object[] objArray = new Object[0];
       r00.w = objArray;
       q00[] oq00Array = new q00[0];
       r00.x = oq00Array;
    }
    public void r00(){
       super();
       ReentrantReadWriteLock reentrantRea = new ReentrantReadWriteLock();
       this.c = reentrantRea.readLock();
       this.t = reentrantRea.writeLock();
       this.b = new AtomicReference(r00.x);
       this.a = new AtomicReference();
    }
    public final void a(q00 p0){
       int len;
       q00[] x;
       while (true) {
          r00 tb = this.b;
          q00[] oq00Array = tb.get();
          if (!(len = oq00Array.length)) {
          }else {
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (oq00Array[i1] == p0) {
                   label_0019 :
                      if (i1 < 0) {
                         return;
                      }
                      int i2 = 1;
                      if (len == i2) {
                         x = r00.x;
                      }else {
                         int i3 = len - 1;
                         q00[] oq00Array1 = new q00[i3];
                         System.arraycopy(oq00Array, i, oq00Array1, i, i1);
                         int i4 = i1 + 1;
                         len = len - i1;
                         len = len - i2;
                         System.arraycopy(oq00Array, i4, oq00Array1, i1, len);
                         x = oq00Array1;
                      }
                      while (true) {
                         if (tb.compareAndSet(oq00Array, x)) {
                            i = 1;
                         }else {
                            if (tb.get() == oq00Array) {
                               continue ;
                            }
                         }
                         if (i) {
                         }
                      }
                      return;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   i1 = -1;
                   goto label_0019 ;
                }
             }
          }
       }
       return;
    }
    public final void accept(Object p0){
       q00 v;
       if (p0 == null) {
          throw new NullPointerException("value == null");
       }
       r00 tt = this.t;
       tt.lock();
       this.v = this.v + 1;
       this.a.lazySet(p0);
       tt.unlock();
       q00[] oq00Array = this.b.get();
       int len = oq00Array.length;
       int i = 0;
       while (i < len) {
          object oobject = oq00Array[i];
          r00 tv = this.v;
          if (oobject.x == null) {
             if (oobject.w == null) {
                _monitor_enter(oobject);
                if (oobject.x != null) {
                   _monitor_exit(oobject);
                }else if(!(oobject.y - tv)){
                   _monitor_exit(oobject);
                }else if(oobject.t != null){
                   if ((v = oobject.v) == null) {
                      v = new yj();
                      oobject.v = v;
                   }
                   yj c = v.c;
                   int i1 = 4;
                   if (c == i1) {
                      Object[] objArray = new Object[5];
                      v.b[i1] = objArray;
                      v.b = objArray;
                      c = 0;
                   }
                   v.b[c] = p0;
                   int i2 = c + 1;
                   v.c = i2;
                   _monitor_exit(oobject);
                }else {
                   boolean b = true;
                   oobject.c = b;
                   _monitor_exit(oobject);
                   oobject.w = b;
                }
             }
             oobject.test(p0);
          }
          i = i + 1;
       }
       return;
    }
    public final void subscribeActual(Observer p0){
       int i1;
       q00 b;
       q00 oq00 = new q00(p0, this);
       p0.onSubscribe(oq00);
       do {
          r00 tb = this.b;
          q00[] oq00Array = tb.get();
          int len = oq00Array.length;
          int i = len + 1;
          q00[] oq00Array1 = new q00[i];
          i1 = 0;
          System.arraycopy(oq00Array, i1, oq00Array1, i1, len);
          oq00Array1[len] = oq00;
          while (true) {
             if (tb.compareAndSet(oq00Array, oq00Array1)) {
                tb = 1;
             }else {
                if (tb.get() != oq00Array) {
                   b = 0;
                }
             }
             if (tb) {
             }else {
                continue ;
             }
          }
       } while (tb);
       if (oq00.x != null) {
          this.a(oq00);
       }else if(oq00.x != null){
          _monitor_enter(oq00);
          if (oq00.x != null) {
             _monitor_exit(oq00);
          }else if(oq00.c != null){
             _monitor_exit(oq00);
          }else {
             b = oq00.b;
             r00 c = b.c;
             c.lock();
             oq00.y = b.v;
             b = b.a.get();
             c.unlock();
             if (b != null) {
                i1 = true;
             }
             oq00.t = i1;
             oq00.c = true;
             _monitor_exit(oq00);
             if (b != null) {
                oq00.test(b);
                oq00.a();
             }
          }
       }
       return;
    }
}
