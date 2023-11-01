package p.l34;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import p.a00;
import p.iv6;
import p.yf2;
import java.util.concurrent.atomic.AtomicLong;
import p.mv6;
import p.vv7;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.AutoCloseable;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.util.Iterator;
import p.cd1;
import p.kv6;
import java.lang.String;
import java.util.Objects;
import java.util.stream.Stream;
import p.k11;

public final class l34 extends a00 implements MaybeObserver, SingleObserver	// class@001cd7 from classes.dex
{
    public long A;
    public final iv6 a;
    public final yf2 b;
    public final AtomicLong c;
    public Disposable t;
    public Iterator v;
    public AutoCloseable w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void l34(iv6 p0,yf2 p1){
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
       this.z = true;
       return 2;
    }
    public final void cancel(){
       this.y = true;
       this.t.dispose();
       if (this.z == null) {
          this.d();
       }
       return;
    }
    public final void clear(){
       this.v = null;
       l34 tw = this.w;
       this.w = null;
       if (tw != null) {
          tw.close();
       }
       return;
    }
    public final void d(){
       if (this.getAndIncrement()) {
          return;
       }
       l34 ta = this.a;
       l34 tA = this.A;
       long l = this.c.get();
       l34 tv = this.v;
       int i = 1;
       while (true) {
          if (this.y != null) {
             this.clear();
          label_006a :
             this.A = tA;
             int i1 = - i;
             if (!this.addAndGet(i1)) {
                break ;
             }else {
                l = this.c.get();
                if (tv == null) {
                   tv = this.v;
                }
             }
          }else if(this.z != null){
             if (tv != null) {
                ta.onNext(null);
                ta.onComplete();
                goto label_006a ;
             }else {
                goto label_006a ;
             }
          }else if(tv != null && (tA - l)){
             Object obj = tv.next();
             if (this.y != null) {
                continue ;
             }else {
                ta.onNext(obj);
                tA = tA + 1;
                if (this.y != null) {
                   continue ;
                }else {
                   boolean b = tv.hasNext();
                   if (this.y != null || b) {
                      continue ;
                   }else {
                      ta.onComplete();
                      this.y = true;
                   }
                }
             }
          }else {
             goto label_006a ;
          }
       }
       return;
    }
    public final boolean isEmpty(){
       l34 tv;
       if ((tv = this.v) != null) {
          if (this.x == null) {
             return false;
          }else if(tv.hasNext()){
             return false;
          }else {
             this.clear();
          }
       }
       return true;
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
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
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null Stream");
       Iterator iterator = k11.p(p0);
       if (!iterator.hasNext()) {
          this.a.onComplete();
          p0.close();
          return;
       }else {
          this.v = iterator;
          this.w = p0;
          this.d();
          return;
       }
    }
    public final Object poll(){
       l34 tv = this.v;
       Object obj = null;
       if (tv == null) {
          return obj;
       }
       if (this.x != null) {
          if (!tv.hasNext()) {
             this.clear();
             return obj;
          }
       }else {
          this.x = true;
       }
       return tv.next();
    }
}
