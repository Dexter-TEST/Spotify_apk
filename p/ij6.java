package p.ij6;
import io.reactivex.rxjava3.core.SingleObserver;
import p.a00;
import p.iv6;
import p.yf2;
import java.util.concurrent.atomic.AtomicLong;
import p.mv6;
import p.vv7;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.util.Iterator;
import java.lang.Throwable;
import p.co5;
import java.lang.String;
import java.util.Objects;
import p.kv6;
import java.lang.Iterable;

public final class ij6 extends a00 implements SingleObserver	// class@0019a8 from classes.dex
{
    public final iv6 a;
    public final yf2 b;
    public final AtomicLong c;
    public Disposable t;
    public Iterator v;
    public boolean w;
    public boolean x;

    public void ij6(iv6 p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new AtomicLong();
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this.c, p0);
          this.d();
       }
       return;
    }
    public final int b(int p0){
       if (!((p0 & 2))) {
          return 0;
       }
       this.x = true;
       return 2;
    }
    public final void cancel(){
       this.w = true;
       this.t.dispose();
       this.t = cd1.a;
    }
    public final void clear(){
       this.v = null;
    }
    public final void d(){
       if (this.getAndIncrement()) {
          return;
       }
       ij6 ta = this.a;
       ij6 tv = this.v;
       if (this.x != null && tv != null) {
          ta.onNext(null);
          ta.onComplete();
          return;
       }else {
          int i = 1;
          while (true) {
             if (tv != null) {
                long l = this.c.get();
                if (!(l - Long.MAX_VALUE)) {
                   while (this.w == null) {
                      ta.onNext(tv.next());
                      if (this.w != null) {
                         break ;
                      }else if(!tv.hasNext()){
                         ta.onComplete();
                         break ;
                      }
                   }
                   return;
                }else {
                   int i1 = 0;
                   long l1 = i1;
                   while (true) {
                      if (l1 - l) {
                         if (this.w != null) {
                            return;
                         }
                         Object obj = tv.next();
                         Objects.requireNonNull(obj, "The iterator returned a null value");
                         ta.onNext(obj);
                         if (this.w != null) {
                            return;
                         }
                         l1 = l1 + 1;
                         if (!tv.hasNext()) {
                            ta.onComplete();
                            return;
                         }
                      }else if(l1 - i1){
                         vv7.H(this.c, l1);
                      label_0099 :
                         if (!(i = - i)) {
                            return;
                         }
                         if (tv == null) {
                            tv = this.v;
                         }else {
                            continue ;
                         }
                      }else {
                         goto label_0099 ;
                      }
                   }
                }
             }else {
                goto label_0099 ;
             }
          }
       }
    }
    public final boolean isEmpty(){
       boolean b = (this.v == null)? true: false;
       return b;
    }
    public final void onError(Throwable p0){
       this.t = cd1.a;
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       p0 = this.b.apply(p0).iterator();
       if (!p0.hasNext()) {
          this.a.onComplete();
          return;
       }else {
          this.v = p0;
          this.d();
          return;
       }
    }
    public final Object poll(){
       ij6 tv;
       if ((tv = this.v) == null) {
          return null;
       }
       Object obj = tv.next();
       Objects.requireNonNull(obj, "The iterator returned a null value");
       if (!tv.hasNext()) {
          this.v = null;
       }
       return obj;
    }
}
