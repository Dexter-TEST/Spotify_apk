package p.vx4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ux4;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.yf2;
import java.lang.Object;
import p.rn;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.CompletableSource;
import p.co5;

public final class vx4 implements Observer, Disposable	// class@002a84 from classes.dex
{
    public final CompletableObserver a;
    public final yf2 b;
    public final boolean c;
    public final rn t;
    public final AtomicReference v;
    public boolean w;
    public Disposable x;
    public static final ux4 y;

    static {
       vx4.y = new ux4(null);
    }
    public void vx4(CompletableObserver p0,yf2 p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = new rn();
       this.v = new AtomicReference();
    }
    public final void a(){
       ux4 andSet;
       ux4 y = vx4.y;
       if ((andSet = this.v.getAndSet(y)) != null && andSet != y) {
          cd1.a(andSet);
       }
       return;
    }
    public void dispose(){
       this.x.dispose();
       this.a();
       this.t.b();
    }
    public boolean isDisposed(){
       boolean b = (this.v.get() == vx4.y)? true: false;
       return b;
    }
    public final void onComplete(){
       this.w = true;
       if (this.v.get() == null) {
          this.t.c(this.a);
       }
       return;
    }
    public final void onError(Throwable p0){
       vx4 tt = this.t;
       if (tt.a(p0)) {
          if (this.c != null) {
             this.onComplete();
          }else {
             this.a();
             tt.c(this.a);
          }
       }
       return;
    }
    public final void onNext(Object p0){
       ux4 oux41;
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null CompletableSource");
       ux4 oux4 = new ux4(this);
       while (true) {
          vx4 tv = this.v;
          if ((oux41 = tv.get()) == vx4.y) {
             break ;
          }else if(tv.compareAndSet(oux41, oux4)){
             tv = 1;
          }else {
             if (tv.get() != oux41) {
                tv = 0;
             }
          }
          if (tv) {
             if (oux41 != null) {
                cd1.a(oux41);
             }
             p0.subscribe(oux4);
             break ;
          }else {
             continue ;
          }
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.x, p0)) {
          this.x = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
