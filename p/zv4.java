package p.zv4;
import p.dw4;
import java.util.concurrent.atomic.AtomicReference;
import p.cw4;
import java.lang.Object;
import p.ak4;
import java.lang.Throwable;
import p.yj4;
import p.bw4;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.Observer;

public abstract class zv4 extends AtomicReference implements dw4	// class@002f73 from classes.dex
{
    public cw4 a;
    public int b;
    public final boolean c;

    public void zv4(boolean p0){
       super();
       this.c = p0;
       cw4 uocw4 = new cw4(null);
       this.a = uocw4;
       this.set(uocw4);
    }
    public final void a(){
       cw4 uocw4 = new cw4(this.b(ak4.a));
       this.a.set(uocw4);
       this.a = uocw4;
       this.b = this.b + 1;
       this.j();
    }
    public Object b(Object p0){
       return p0;
    }
    public final void c(Object p0){
       cw4 uocw4 = new cw4(this.b(p0));
       this.a.set(uocw4);
       this.a = uocw4;
       this.b = this.b + 1;
       this.i();
    }
    public final void d(Throwable p0){
       cw4 uocw4 = new cw4(this.b(new yj4(p0)));
       this.a.set(uocw4);
       this.a = uocw4;
       this.b = this.b + 1;
       this.j();
    }
    public cw4 e(){
       return this.get();
    }
    public Object f(Object p0){
       return p0;
    }
    public final void g(bw4 p0){
       bw4 c;
       cw4 uocw4;
       if (p0.getAndIncrement()) {
          return;
       }
       int i = 1;
       do {
          if ((c = p0.c) == null) {
             c = this.e();
             p0.c = c;
          }
          while (true) {
             if (p0.isDisposed()) {
                p0.c = null;
                return;
             }else if((uocw4 = c.get()) != null){
                if (ak4.a(p0.b, this.f(uocw4.a))) {
                   p0.c = null;
                   return;
                }else {
                   c = uocw4;
                }
             }else {
                p0.c = c;
                if (!(i = - i)) {
                   break ;
                }else {
                   continue ;
                }
             }
          }
          return;
       } while (!(i = - i));
    }
    public final void h(cw4 p0){
       if (this.c != null) {
          cw4 uocw4 = new cw4(null);
          uocw4.lazySet(p0.get());
          p0 = uocw4;
       }
       this.set(p0);
       return;
    }
    public abstract void i();
    public void j(){
       cw4 uocw4 = this.get();
       if (uocw4.a != null) {
          cw4 uocw41 = new cw4(null);
          uocw41.lazySet(uocw4.get());
          this.set(uocw41);
       }
       return;
    }
}
