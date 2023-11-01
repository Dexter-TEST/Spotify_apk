package p.t62;
import p.kv6;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import p.iv6;
import p.yf2;
import p.ro1;
import p.rn;
import java.util.concurrent.atomic.AtomicLong;
import p.s62;
import java.lang.Object;
import p.vv7;
import p.yh6;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Throwable;
import p.co5;
import p.cd1;
import p.ya4;
import p.mv6;
import p.wn5;
import p.vn5;
import p.fq6;

public final class t62 extends AtomicInteger implements kv6, FlowableSubscriber	// class@00270a from classes.dex
{
    public final yf2 A;
    public final AtomicLong B;
    public final s62 C;
    public long D;
    public int E;
    public Object F;
    public int G;
    public final rn a;
    public final int b;
    public final ro1 c;
    public yh6 t;
    public kv6 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final iv6 z;

    public void t62(iv6 p0,yf2 p1,int p2,ro1 p3){
       super();
       this.c = p3;
       this.a = new rn();
       this.b = p2;
       this.z = p0;
       this.A = p1;
       this.B = new AtomicLong();
       this.C = new s62(0, this);
    }
    public final void a(long p0){
       vv7.a(this.B, p0);
       this.b();
    }
    public final void b(){
       int i4;
       t62 ot62 = this;
       if (this.getAndIncrement()) {
          return;
       }
       t62 z = ot62.z;
       t62 c = ot62.c;
       t62 t = ot62.t;
       t62 a = ot62.a;
       t62 b = ot62.B;
       t62 b1 = ot62.b;
       int i = b1 - (b1 >> 1);
       t62 y = ot62.y;
       int i1 = 1;
       do {
          Object obj = null;
          if (ot62.x != null) {
             t.clear();
             ot62.F = obj;
          }else {
             t62 g = ot62.G;
             if (a.get() != null && (c == ro1.a && (c != ro1.b && g == null))) {
                t.clear();
                ot62.F = obj;
                a.e(z);
                return;
             }else {
                int i2 = 0;
                if (g == null) {
                   g = ot62.w;
                   int i3 = ((obj = t.poll()) == null)? 1: 0;
                   if (g != null && i3) {
                      a.e(z);
                      return;
                   }else if(i3){
                      if (y == null) {
                         if ((i4 = ot62.E + 1) == i) {
                            ot62.E = i2;
                            ot62.v.a((long)i);
                         }else {
                            ot62.E = i4;
                         }
                      }
                      Object obj1 = ot62.A.apply(obj);
                      Objects.requireNonNull(obj1, "The mapper returned a null SingleSource");
                      ot62.G = 1;
                      obj1.subscribe(ot62.C);
                   }
                }else if(g == 2){
                   t62 d = ot62.D;
                   if (d - b.get()) {
                      g = ot62.F;
                      ot62.F = obj;
                      z.onNext(g);
                      long l = d + 1;
                      ot62.D = l;
                      ot62.G = i2;
                   }
                }
             }
          }
       } while (!(i1 = - i1));
       return;
    }
    public final void cancel(){
       this.x = true;
       this.v.cancel();
       t62 tC = this.C;
       switch (tC.a){
           case 0:
             cd1.a(tC);
             break;
           default:
             cd1.a(tC);
       }
       this.a.b();
       if (!this.getAndIncrement()) {
          this.t.clear();
          this.F = null;
       }
       return;
    }
    public final void onComplete(){
       this.w = true;
       this.b();
    }
    public final void onError(Throwable p0){
       if (this.a.a(p0)) {
          if (this.c == ro1.a) {
             t62 tC = this.C;
             switch (tC.a){
                 case 0:
                   cd1.a(tC);
                   break;
                 default:
                   cd1.a(tC);
             }
          }
          this.w = true;
          this.b();
       }
       return;
    }
    public final void onNext(Object p0){
       if (p0 != null && !this.t.offer(p0)) {
          this.v.cancel();
          this.onError(new ya4("queue full?!"));
       }else {
          this.b();
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.v, p0)) {
          this.v = p0;
          if (p0 instanceof wn5) {
             int i = p0.b(7);
             boolean b = true;
             if (i == b) {
                this.t = p0;
                this.y = b;
                this.w = b;
                this.z.onSubscribe(this);
                this.b();
             }else if(i == 2){
                this.t = p0;
                this.z.onSubscribe(this);
                this.v.a((long)this.b);
             }
          }
          this.t = new fq6(this.b);
          this.z.onSubscribe(this);
          this.v.a((long)this.b);
       }
       return;
    }
}
