package p.lv6;
import p.kv6;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import p.mv6;
import p.vv7;
import java.lang.Object;
import p.qf1;
import java.lang.String;
import p.kg4;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

public class lv6 extends AtomicInteger implements kv6	// class@001dd1 from classes.dex
{
    public kv6 a;
    public long b;
    public final AtomicReference c;
    public final AtomicLong t;
    public final AtomicLong v;
    public final boolean w;
    public boolean x;
    public boolean y;

    public void lv6(){
       super();
       this.w = false;
       this.c = new AtomicReference();
       this.t = new AtomicLong();
       this.v = new AtomicLong();
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          if (this.y != null) {
             return;
          }else if(!this.get()){
             int i = 1;
             if (this.compareAndSet(0, i)) {
                lv6 tb = this.b;
                if (tb - Long.MAX_VALUE) {
                   long l = vv7.c(tb, p0);
                   this.b = l;
                   if (!(l - Long.MAX_VALUE)) {
                      this.y = i;
                   }
                }
                lv6 ta = this.a;
                if (this.decrementAndGet()) {
                   this.b();
                }
                if (ta != null) {
                   ta.a(p0);
                }
                return;
             }
          }
          vv7.a(this.t, p0);
          if (!this.getAndIncrement()) {
             this.b();
          }
       }
       return;
    }
    final void b(){
       kv6 okv61;
       lv6 olv6 = this;
       int i = 1;
       Object obj = null;
       long l = 0;
       kv6 okv6 = obj;
       while ((okv61 = olv6.c.get()) != null) {
          okv61 = olv6.c.getAndSet(obj);
          break ;
          obj = null;
       }
       long l1 = olv6.t.get();
       if (l1) {
          l1 = olv6.t.getAndSet(0);
       }
       long l2 = olv6.v.get();
       if (l2) {
          l2 = olv6.v.getAndSet(0);
       }
       lv6 a = olv6.a;
       if (olv6.x != null) {
          if (a != null) {
             a.cancel();
             olv6.a = obj;
          }
          if (okv61 != null) {
             okv61.cancel();
          }
       }else {
          lv6 b = olv6.b;
          if (b - Long.MAX_VALUE) {
             b = vv7.c(b, l1);
             if (b - Long.MAX_VALUE) {
                b = b - l2;
                if ((b) < 0) {
                   RxJavaPlugins.c(new qf1(kg4.k("More produced than requested: ", b)));
                   b = 0;
                }
             }
             olv6.b = b;
          }
          if (okv61 != null) {
             if (a != null && olv6.w != null) {
                a.cancel();
             }
             olv6.a = okv61;
             if (b) {
                l = vv7.c(l, b);
                okv6 = okv61;
             }
          }else if(a != null && (l1)){
             l = vv7.c(l, l1);
             okv6 = a;
          }
       }
       if (!(i = - i)) {
          if (l) {
             okv6.a(l);
          }
          return;
       }else {
       }
    }
    public void cancel(){
       if (this.x == null) {
          this.x = true;
          if (!this.getAndIncrement()) {
             this.b();
          }
       }
       return;
    }
    public final void d(long p0){
       if (this.y != null) {
          return;
       }
       if (!this.get() && this.compareAndSet(0, 1)) {
          lv6 tb = this.b;
          if (tb - Long.MAX_VALUE) {
             long l = tb - p0;
             int i = 0;
             if ((l - i) < 0) {
                RxJavaPlugins.c(new qf1(kg4.k("More produced than requested: ", l)));
                l = i;
             }
             this.b = l;
          }
          if (!this.decrementAndGet()) {
             return;
          }else {
             this.b();
             return;
          }
       }else {
          vv7.a(this.v, p0);
          if (!this.getAndIncrement()) {
             this.b();
          }
          return;
       }
    }
    public final void e(kv6 p0){
       lv6 ta;
       if (this.x != null) {
          p0.cancel();
          return;
       }else {
          Objects.requireNonNull(p0, "s is null");
          if (!this.get() && this.compareAndSet(0, 1)) {
             if ((ta = this.a) != null && this.w != null) {
                ta.cancel();
             }
             this.a = p0;
             ta = this.b;
             if (this.decrementAndGet()) {
                this.b();
             }
             if (ta) {
                p0.a(ta);
             }
             return;
          }else if((p0 = this.c.getAndSet(p0)) != null && this.w != null){
             p0.cancel();
          }
          if (!this.getAndIncrement()) {
             this.b();
          }
          return;
       }
    }
}
