package p.ts4;
import io.reactivex.rxjava3.core.Observer;
import p.zz;
import p.yf2;
import p.rn;
import p.fn0;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.CompletableSource;
import p.ss4;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.co5;
import p.cd1;

public final class ts4 extends zz implements Observer	// class@0027d2 from classes.dex
{
    public final Observer a;
    public final rn b;
    public final yf2 c;
    public final boolean t;
    public final fn0 v;
    public Disposable w;
    public boolean x;

    public void ts4(Observer p0,yf2 p1,boolean p2){
       super();
       this.a = p0;
       this.c = p1;
       this.t = p2;
       this.b = new rn();
       this.v = new fn0();
       this.lazySet(1);
    }
    public final int b(int p0){
       return (p0 & 0x02);
    }
    public final void clear(){
    }
    public void dispose(){
       this.x = true;
       this.w.dispose();
       this.v.dispose();
       this.b.b();
    }
    public boolean isDisposed(){
       return this.w.isDisposed();
    }
    public final boolean isEmpty(){
       return true;
    }
    public final void onComplete(){
       if (!this.decrementAndGet()) {
          this.b.d(this.a);
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.b.a(p0)) {
          if (this.t != null) {
             if (!this.decrementAndGet()) {
                this.b.d(this.a);
             }
          }else {
             this.x = true;
             this.w.dispose();
             this.v.dispose();
             this.b.d(this.a);
          }
       }
       return;
    }
    public final void onNext(Object p0){
       p0 = this.c.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null CompletableSource");
       this.getAndIncrement();
       ss4 oss4 = new ss4(this);
       if (this.x == null && this.v.c(oss4)) {
          p0.subscribe(oss4);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.w, p0)) {
          this.w = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final Object poll(){
       return null;
    }
}
