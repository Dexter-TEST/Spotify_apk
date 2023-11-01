package p.y92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.t92;
import p.v92;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import p.kv6;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Math;
import java.lang.System;
import p.mv6;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class y92 extends AtomicReference implements FlowableSubscriber, Disposable	// class@002d71 from classes.dex
{
    public final v92 a;
    public boolean b;
    public final AtomicReference c;
    public final AtomicBoolean t;
    public final AtomicInteger v;
    public long w;
    public final AtomicReference x;
    public static final t92[] y;
    public static final t92[] z;

    static {
       t92[] ot92Array = new t92[0];
       y92.y = ot92Array;
       t92[] ot92Array1 = new t92[0];
       y92.z = ot92Array1;
    }
    public void y92(v92 p0,AtomicReference p1){
       super();
       this.a = p0;
       this.x = p1;
       this.v = new AtomicInteger();
       this.c = new AtomicReference(y92.y);
       this.t = new AtomicBoolean();
    }
    public final void a(){
       kv6 okv6;
       y92 tv = this.v;
       if (tv.getAndIncrement()) {
          return;
       }
       int i = 1;
       while (true) {
          if (this.isDisposed()) {
             return;
          }
          if ((okv6 = this.get()) != null) {
             y92 tw = this.w;
             t92[] ot92Array = this.c.get();
             int len = ot92Array.length;
             y92 oy92 = tw;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                oy92 = Math.max(oy92, ot92Array[i1].t.get());
             }
             long l = oy92 - tw;
             if (l) {
                this.w = oy92;
                okv6.a(l);
             }
          }
          if (!(i = - i)) {
             break ;
          }
       }
       return;
    }
    public final void b(t92 p0){
       int len;
       t92[] y;
       while (true) {
          y92 tc = this.c;
          t92[] ot92Array = tc.get();
          if (!(len = ot92Array.length)) {
          }else {
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (ot92Array[i1].equals(p0)) {
                   label_001d :
                      if (i1 < 0) {
                         return;
                      }
                      int i2 = 1;
                      if (len == i2) {
                         y = y92.y;
                      }else {
                         int i3 = len - 1;
                         t92[] ot92Array1 = new t92[i3];
                         System.arraycopy(ot92Array, i, ot92Array1, i, i1);
                         int i4 = i1 + 1;
                         len = len - i1;
                         len = len - i2;
                         System.arraycopy(ot92Array, i4, ot92Array1, i1, len);
                         y = ot92Array1;
                      }
                      while (true) {
                         if (tc.compareAndSet(ot92Array, y)) {
                            i = 1;
                         }else {
                            if (tc.get() == ot92Array) {
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
                   goto label_001d ;
                }
             }
          }
       }
       return;
    }
    public void dispose(){
       y92 tx;
       this.c.set(y92.z);
       do {
          tx = this.x;
       } while (tx.compareAndSet(this, null) || tx.get() != this);
       mv6.b(this);
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.c.get() == y92.z)? true: false;
       return b;
    }
    public final void onComplete(){
       if (this.b == null) {
          this.b = true;
          y92 ta = this.a;
          ta.a();
          t92[] andSet = this.c.getAndSet(y92.z);
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             ta.g(andSet[i]);
          }
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.b == null) {
          this.b = true;
          y92 ta = this.a;
          ta.d(p0);
          t92[] andSet = this.c.getAndSet(y92.z);
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             ta.g(andSet[i]);
          }
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.b == null) {
          y92 ta = this.a;
          ta.c(p0);
          p0 = this.c.get();
          int len = p0.length;
          for (int i = 0; i < len; i = i + 1) {
             ta.g(p0[i]);
          }
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.e(this, p0)) {
          this.a();
          t92[] ot92Array = this.c.get();
          int len = ot92Array.length;
          for (int i = 0; i < len; i = i + 1) {
             this.a.g(ot92Array[i]);
          }
       }
       return;
    }
}
