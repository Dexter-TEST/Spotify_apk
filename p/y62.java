package p.y62;
import p.v62;
import p.iv6;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicLong;
import p.vv7;
import java.lang.String;
import java.lang.NullPointerException;
import p.iw1;

public final class y62 extends v62	// class@002d58 from classes.dex
{
    public final AtomicReference c;
    public Throwable t;
    public boolean v;
    public final AtomicInteger w;

    public void y62(iv6 p0){
       super(p0);
       this.c = new AtomicReference();
       this.w = new AtomicInteger();
    }
    public final void e(){
       this.h();
    }
    public final void f(){
       if (!this.w.getAndIncrement()) {
          this.c.lazySet(null);
       }
       return;
    }
    public final boolean g(Throwable p0){
       if (this.v != null || this.d()) {
          return false;
       }
       this.t = p0;
       this.v = true;
       this.h();
       return true;
    }
    public final void h(){
       Object andSet;
       y62 t;
       y62 oy62 = this;
       if (oy62.w.getAndIncrement()) {
          return;
       }
       v62 a = oy62.a;
       y62 c = oy62.c;
       int i = 1;
    label_0011 :
       long l = this.get();
       long l1 = 0;
       while (true) {
          int i1 = 0;
          if (v13 = l1 - l) {
             if (this.d()) {
                c.lazySet(null);
                return;
             }else {
                y62 v = oy62.v;
                int i2 = ((andSet = c.getAndSet(null)) == null)? 1: 0;
                if (v != null && i2) {
                   if ((t = oy62.t) != null) {
                      oy62.c(t);
                   }else {
                      this.b();
                   }
                   return;
                }else if(i2){
                label_004f :
                   if (!v13) {
                      if (this.d()) {
                         c.lazySet(null);
                         return;
                      }else {
                         y62 v1 = oy62.v;
                         if (c.get() == null) {
                            i1 = 1;
                         }
                         if (v1 != null && i1) {
                            if ((t = oy62.t) != null) {
                               oy62.c(t);
                               break ;
                            }else {
                               this.b();
                               break ;
                            }
                         }
                      }
                   }
                   if (l1) {
                      vv7.H(oy62, l1);
                   }
                   if (!(i = - i)) {
                      return;
                   }else {
                      goto label_0011 ;
                   }
                }else {
                   a.onNext(andSet);
                   l1 = l1 + 1;
                }
             }
          }else {
             goto label_004f ;
          }
       }
       return;
    }
    public final void onComplete(){
       this.v = true;
       this.h();
    }
    public void onNext(Object p0){
       if (this.v == null && !this.d()) {
          if (p0 == null) {
             this.onError(iw1.b("onNext called with a null value."));
             return;
          }else {
             this.c.set(p0);
             this.h();
          }
       }
       return;
    }
}
