package p.m34;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import p.zz;
import io.reactivex.rxjava3.core.Observer;
import p.yf2;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.util.Iterator;
import java.lang.Throwable;
import p.co5;
import java.lang.AutoCloseable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import java.lang.String;
import java.util.Objects;
import java.util.stream.Stream;
import p.k11;

public final class m34 extends zz implements MaybeObserver, SingleObserver	// class@001e19 from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public Disposable c;
    public Iterator t;
    public AutoCloseable v;
    public boolean w;
    public boolean x;
    public boolean y;

    public void m34(Observer p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       if (this.getAndIncrement()) {
          return;
       }
       m34 ta = this.a;
       m34 tt = this.t;
       int i = 1;
       do {
          if (this.x != null) {
             this.clear();
          }else if(this.y != null){
             ta.onNext(null);
             ta.onComplete();
          }else {
             Object obj = tt.next();
             if (this.x != null) {
                continue ;
             }else {
                ta.onNext(obj);
                if (this.x != null) {
                   continue ;
                }else {
                   boolean b = tt.hasNext();
                   if (this.x != null || b) {
                      continue ;
                   }else {
                      ta.onComplete();
                      this.x = true;
                   }
                }
             }
          }
       } while (!(i = - i));
       return;
    }
    public final int b(int p0){
       if (!((p0 & 2))) {
          return 0;
       }
       this.y = true;
       return 2;
    }
    public final void clear(){
       this.t = null;
       m34 tv = this.v;
       this.v = null;
       if (tv != null) {
          tv.close();
       }
       return;
    }
    public void dispose(){
       this.x = true;
       this.c.dispose();
       if (this.y == null) {
          this.a();
       }
       return;
    }
    public boolean isDisposed(){
       return this.x;
    }
    public final boolean isEmpty(){
       m34 tt;
       if ((tt = this.t) != null) {
          if (this.w == null) {
             return false;
          }else if(tt.hasNext()){
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
       if (cd1.g(this.c, p0)) {
          this.c = p0;
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
          this.t = iterator;
          this.v = p0;
          this.a();
          return;
       }
    }
    public final Object poll(){
       m34 tt = this.t;
       Object obj = null;
       if (tt == null) {
          return obj;
       }
       if (this.w != null) {
          if (!tt.hasNext()) {
             this.clear();
             return obj;
          }
       }else {
          this.w = true;
       }
       return tt.next();
    }
}
