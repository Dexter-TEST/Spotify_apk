package p.l62;
import p.j62;
import p.iv6;
import p.yf2;
import java.util.concurrent.atomic.AtomicInteger;
import p.lv6;
import java.lang.Throwable;
import p.kv6;
import p.rn;
import p.xe7;
import java.lang.Object;
import p.yh6;
import java.lang.String;
import java.util.Objects;
import p.bn5;
import p.zv6;
import p.o62;
import p.m62;
import p.co5;

public final class l62 extends j62	// class@001cef from classes.dex
{
    public final iv6 D;
    public final AtomicInteger E;

    public void l62(iv6 p0,yf2 p1,int p2){
       super(p1, p2);
       this.D = p0;
       this.E = new AtomicInteger();
    }
    public final void a(long p0){
       this.a.a(p0);
    }
    public final void b(Throwable p0){
       this.v.cancel();
       xe7.M(this.D, p0, this, this.A);
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
       xe7.O(this.D, p0, this, this.A);
    }
    public final void e(){
       int i3;
       if (!this.E.getAndIncrement()) {
          while (true) {
             if (this.z != null) {
                return;
             }
             if (this.B == null) {
                j62 ty = this.y;
                Object obj = this.x.poll();
                int i = 1;
                int i1 = 0;
                int i2 = (obj == null)? 1: 0;
                if (ty != null && i2) {
                   this.D.onComplete();
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
                      if ((obj1 = obj1.get()) == null) {
                         continue ;
                      }else if(this.a.y != null){
                         if (!xe7.O(this.D, obj1, this, this.A)) {
                            return;
                         }
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
             if (this.E.decrementAndGet()) {
             }
          }
       }
       return;
    }
    public final void f(){
       this.D.onSubscribe(this);
    }
    public final void onError(Throwable p0){
       this.a.cancel();
       xe7.M(this.D, p0, this, this.A);
    }
}
