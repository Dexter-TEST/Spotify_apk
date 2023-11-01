package p.k62;
import p.j62;
import p.yf2;
import p.iv6;
import p.lv6;
import java.lang.Throwable;
import p.rn;
import p.kv6;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.yh6;
import java.lang.String;
import java.util.Objects;
import p.bn5;
import p.zv6;
import p.co5;
import p.o62;
import p.m62;

public final class k62 extends j62	// class@001bb2 from classes.dex
{
    public final iv6 D;
    public final boolean E;

    public void k62(int p0,yf2 p1,iv6 p2,boolean p3){
       super(p1, p0);
       this.D = p2;
       this.E = p3;
    }
    public final void a(long p0){
       this.a.a(p0);
    }
    public final void b(Throwable p0){
       if (this.A.a(p0)) {
          if (this.E == null) {
             this.v.cancel();
             this.y = true;
          }
          this.B = false;
          this.e();
       }
       return;
    }
    public final void cancel(){
       if (this.z == null) {
          this.z = true;
          this.a.cancel();
          this.v.cancel();
          this.A.b();
       }
       return;
    }
    public final void d(Object p0){
       this.D.onNext(p0);
    }
    public final void e(){
       j62 ty;
       int i3;
       if (!this.getAndIncrement()) {
          while (true) {
             if (this.z != null) {
                return;
             }
             if (this.B == null) {
                if ((ty = this.y) != null && (this.E == null && this.A.get() != null)) {
                   this.A.e(this.D);
                   return;
                }else {
                   Object obj = this.x.poll();
                   int i = 1;
                   int i1 = 0;
                   int i2 = (obj == null)? 1: 0;
                   if (ty != null && i2) {
                      this.A.e(this.D);
                      return;
                   }else if(!i2){
                      Object obj1 = this.b.apply(obj);
                      Objects.requireNonNull(obj1, "The mapper returned a null Publisher");
                      if (this.C != i) {
                         if ((i3 = this.w + i) == this.t) {
                            this.w = i1;
                            this.v.a((long)i3);
                         }else {
                            this.w = i3;
                         }
                      }
                      if (obj1 instanceof zv6) {
                         obj1 = obj1.get();
                         if (obj1 == null) {
                            continue ;
                         }else if(this.a.y != null){
                            this.D.onNext(obj1);
                         }else {
                            this.B = i;
                            this.a.e(new o62(obj1, this.a));
                         }
                      }else {
                         this.B = i;
                         obj1.subscribe(this.a);
                      }
                   }
                }
             }
             if (this.decrementAndGet()) {
             }
          }
       }
       return;
    }
    public final void f(){
       this.D.onSubscribe(this);
    }
    public final void onError(Throwable p0){
       if (this.A.a(p0)) {
          this.y = true;
          this.e();
       }
       return;
    }
}
