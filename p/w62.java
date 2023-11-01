package p.w62;
import p.v62;
import p.iv6;
import p.gq6;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import p.vv7;
import java.lang.String;
import java.lang.NullPointerException;
import p.iw1;

public final class w62 extends v62	// class@002ad4 from classes.dex
{
    public final gq6 c;
    public Throwable t;
    public boolean v;
    public final AtomicInteger w;

    public void w62(iv6 p0,int p1){
       super(p0);
       this.c = new gq6(p1);
       this.w = new AtomicInteger();
    }
    public final void e(){
       this.h();
    }
    public final void f(){
       if (!this.w.getAndIncrement()) {
          this.c.clear();
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
       Object obj;
       w62 tt;
       if (this.w.getAndIncrement()) {
          return;
       }
       v62 ta = this.a;
       w62 tc = this.c;
       int i = 1;
    label_000f :
       long l = this.get();
       long l1 = 0;
       while (true) {
          if (v10 = l1 - l) {
             if (this.d()) {
                tc.clear();
                return;
             }else {
                w62 tv = this.v;
                int i1 = ((obj = tc.poll()) == null)? 1: 0;
                if (tv != null && i1) {
                   if ((tt = this.t) != null) {
                      this.c(tt);
                   }else {
                      this.b();
                   }
                   return;
                }else if(i1){
                label_0049 :
                   if (!v10) {
                      if (this.d()) {
                         tc.clear();
                         return;
                      }else {
                         boolean b = tc.isEmpty();
                         if (this.v != null && b) {
                            if ((tt = this.t) != null) {
                               this.c(tt);
                               break ;
                            }else {
                               this.b();
                               break ;
                            }
                         }
                      }
                   }
                   if (l1) {
                      vv7.H(this, l1);
                   }
                   if (!(i = - i)) {
                      return;
                   }else {
                      goto label_000f ;
                   }
                }else {
                   ta.onNext(obj);
                   l1 = l1 + 1;
                }
             }
          }else {
             goto label_0049 ;
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
             this.c.offer(p0);
             this.h();
          }
       }
       return;
    }
}
