package p.z92;
import p.v92;
import java.util.concurrent.atomic.AtomicReference;
import p.u92;
import java.lang.Object;
import p.ak4;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Throwable;
import p.yj4;
import p.t92;
import java.util.concurrent.atomic.AtomicLong;
import p.vv7;
import p.iv6;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class z92 extends AtomicReference implements v92	// class@002eaf from classes.dex
{
    public final boolean a;
    public u92 b;
    public int c;
    public long t;
    public final int v;

    public void z92(int p0,boolean p1){
       super();
       this.a = p1;
       u92 ou92 = new u92(0, null);
       this.b = ou92;
       this.set(ou92);
       this.v = p0;
    }
    public final void a(){
       long l = this.t + 1;
       this.t = l;
       u92 ou92 = new u92(l, ak4.a);
       this.b.set(ou92);
       this.b = ou92;
       this.c = this.c + 1;
       this.b();
    }
    public final void b(){
       u92 ou92 = this.get();
       if (ou92.a != null) {
          u92 ou921 = new u92(0, null);
          ou921.lazySet(ou92.get());
          this.set(ou921);
       }
       return;
    }
    public final void c(Object p0){
       long l = this.t + 1;
       this.t = l;
       u92 ou92 = new u92(l, p0);
       this.b.set(ou92);
       this.b = ou92;
       int i = this.c + 1;
       this.c = i;
       if (i > this.v) {
          if ((i = this.get().get()) != null) {
             this.c = this.c - 1;
             if (this.a != null) {
                ou92 = new u92(i.b, null);
                ou92.lazySet(i.get());
                i = ou92;
             }
             this.set(i);
          }else {
             throw new IllegalStateException("Empty list!");
          }
       }
       return;
    }
    public final void d(Throwable p0){
       long l = this.t + 1;
       this.t = l;
       u92 ou92 = new u92(l, new yj4(p0));
       this.b.set(ou92);
       this.b = ou92;
       this.c = this.c + 1;
       this.b();
    }
    public final void g(t92 p0){
       int i;
       t92 c;
       u92 ou92;
       _monitor_enter(p0);
       if (p0.v != null) {
          p0.w = true;
          _monitor_exit(p0);
       }else {
          p0.v = true;
          _monitor_exit(p0);
          while (true) {
             long l = p0.get();
             if (!(l - Long.MAX_VALUE)) {
                i = 1;
             label_001f :
                if ((c = p0.c) == null) {
                   c = this.get();
                   p0.c = c;
                   vv7.a(p0.t, c.b);
                }
                int i1 = 0;
                long l1 = i1;
                while (true) {
                   Serializable serializable = null;
                   if (v11 = l - i1) {
                      if (p0.isDisposed()) {
                         p0.c = serializable;
                         break ;
                      }else if((ou92 = c.get()) != null){
                         u92 a = ou92.a;
                         t92 b = p0.b;
                         if (a == ak4.a) {
                            b.onComplete();
                         }else if(a instanceof yj4){
                            b.onError(a.a);
                         }else {
                            b.onNext(a);
                            b = 0;
                         label_006c :
                            if (b) {
                               p0.c = serializable;
                               break ;
                            }else {
                               long l2 = 1;
                               l1 = l1 + l2;
                               l = l - l2;
                               a = ou92;
                            }
                         }
                         b = 1;
                         goto label_006c ;
                      }else if(!v11 && p0.isDisposed()){
                         p0.c = serializable;
                         break ;
                      }else if(l1 - i1){
                         p0.c = c;
                         if (!i) {
                            vv7.I(p0, l1);
                         }
                      }
                      _monitor_enter(p0);
                      if (p0.w == null) {
                         p0.v = false;
                         _monitor_exit(p0);
                         break ;
                      }else {
                         p0.w = false;
                         _monitor_exit(p0);
                      }
                   }else {
                   }
                }
             }else {
                i = 0;
                goto label_001f ;
             }
          }
       }
       return;
    }
}
