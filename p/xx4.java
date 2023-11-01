package p.xx4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.wx4;
import p.yf2;
import p.rn;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.co5;

public final class xx4 extends AtomicInteger implements Observer, Disposable	// class@002d08 from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public final boolean c;
    public final rn t;
    public final AtomicReference v;
    public Disposable w;
    public boolean x;
    public boolean y;
    public static final wx4 z;

    static {
       xx4.z = new wx4(null);
    }
    public void xx4(Observer p0,yf2 p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = new rn();
       this.v = new AtomicReference();
    }
    public final void a(){
       wx4 andSet;
       wx4 z = xx4.z;
       if ((andSet = this.v.getAndSet(z)) != null && andSet != z) {
          cd1.a(andSet);
       }
       return;
    }
    public final void b(){
       wx4 owx4;
       if (this.getAndIncrement()) {
          return;
       }
       xx4 ta = this.a;
       xx4 tt = this.t;
       xx4 tv = this.v;
       int i = 1;
       while (true) {
          if (this.y != null) {
             return;
          }
          if (tt.get() != null && this.c == null) {
             tt.d(ta);
             return;
          }else {
             xx4 tx = this.x;
             int i1 = ((owx4 = tv.get()) == null)? 1: 0;
             if (tx != null && i1) {
                tt.d(ta);
                return;
             }else if(!i1 && owx4.b != null){
                do {
                } while (tv.compareAndSet(owx4, null) || tv.get() != owx4);
                ta.onNext(owx4.b);
             }else if(!(i = - i)){
                break ;
             }
          }
       }
       return;
    }
    public void dispose(){
       this.y = true;
       this.w.dispose();
       this.a();
       this.t.b();
    }
    public boolean isDisposed(){
       return this.y;
    }
    public final void onComplete(){
       this.x = true;
       this.b();
    }
    public final void onError(Throwable p0){
       if (this.t.a(p0)) {
          if (this.c == null) {
             this.a();
          }
          this.x = true;
          this.b();
       }
       return;
    }
    public final void onNext(Object p0){
       wx4 owx4;
       wx4 owx41;
       wx4 z = xx4.z;
       xx4 tv = this.v;
       if ((owx4 = tv.get()) != null) {
          cd1.a(owx4);
       }
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null MaybeSource");
       owx4 = new wx4(this);
       while ((owx41 = tv.get()) != z) {
          while (true) {
             if (tv.compareAndSet(owx41, owx4)) {
                owx41 = 1;
             }else {
                if (tv.get() != owx41) {
                   owx41 = 0;
                }
             }
             if (owx41) {
                p0.subscribe(owx4);
                break ;
             }else {
                continue ;
             }
          }
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.w, p0)) {
          this.w = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
