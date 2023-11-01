package p.m92;
import io.reactivex.rxjava3.core.Flowable;
import p.yo0;
import java.util.concurrent.TimeUnit;
import p.k92;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import p.iv6;
import p.l92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.ba2;
import p.y92;
import p.zv6;
import p.v92;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Throwable;
import p.co5;
import java.lang.RuntimeException;
import p.iw1;
import java.lang.Class;

public final class m92 extends Flowable	// class@001e4c from classes.dex
{
    public final yo0 b;
    public final int c;
    public k92 t;

    public void m92(yo0 p0){
       super();
       this.b = p0;
       this.c = 1;
    }
    public final void A(k92 p0){
       _monitor_enter(this);
       if (!(p0.b) && p0 == this.t) {
          this.t = null;
          cd1.a(p0);
          if (p0.get() == null) {
             p0.t = true;
          }else {
             this.b.z();
          }
       }
       _monitor_exit(this);
       return;
    }
    public final void u(iv6 p0){
       m92 tt;
       ba2 c;
       y92 oy92;
       _monitor_enter(this);
       if ((tt = this.t) == null) {
          tt = new k92(0, this);
          this.t = tt;
       }
       long l = tt.b + 1;
       tt.b = l;
       if (tt.c == null && !(l - (long)this.c)) {
          tt.c = true;
          l = 1;
       }else {
          c = 0;
       }
       _monitor_exit(this);
       this.b.subscribe(new l92(p0, this, tt));
       if (l) {
          m92 tb = this.b;
          while (true) {
             c = tb.c;
             if ((oy92 = c.get()) != null && !oy92.isDisposed()) {
                break ;
             }else {
                y92 oy921 = new y92(tb.t.get(), c);
                while (true) {
                   if (c.compareAndSet(oy92, oy921)) {
                      c = 1;
                   }else {
                      if (c.get() != oy92) {
                         c = 0;
                      }
                   }
                   if (!c) {
                   }else {
                      oy92 = oy921;
                   }
                }
             }
          }
          y92 t = oy92.t;
          c = (!oy92.t.get() && t.compareAndSet(0, true))? 1: 0;
          tt.accept(oy92);
          if (c) {
             tb.b.subscribe(oy92);
          }
       }
       return;
    }
    public final void z(k92 p0){
       _monitor_enter(this);
       if (this.t == p0) {
          p0.getClass();
          long l = p0.b - 1;
          if (!((p0.b = l))) {
             this.t = null;
             this.b.z();
          }
       }
       _monitor_exit(this);
       return;
    }
}
