package p.pa2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import p.oa2;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.yf2;
import java.lang.Object;
import p.rn;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.kv6;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.CompletableSource;
import p.co5;
import p.mv6;

public final class pa2 implements FlowableSubscriber, Disposable	// class@002221 from classes.dex
{
    public final CompletableObserver a;
    public final yf2 b;
    public final boolean c;
    public final rn t;
    public final AtomicReference v;
    public boolean w;
    public kv6 x;
    public static final oa2 y;

    static {
       pa2.y = new oa2(null);
    }
    public void pa2(CompletableObserver p0,yf2 p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = new rn();
       this.v = new AtomicReference();
    }
    public final void a(){
       oa2 andSet;
       oa2 y = pa2.y;
       if ((andSet = this.v.getAndSet(y)) != null && andSet != y) {
          cd1.a(andSet);
       }
       return;
    }
    public void dispose(){
       this.x.cancel();
       this.a();
       this.t.b();
    }
    public boolean isDisposed(){
       boolean b = (this.v.get() == pa2.y)? true: false;
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
       pa2 tt = this.t;
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
       oa2 ooa21;
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null CompletableSource");
       oa2 ooa2 = new oa2(this);
       while (true) {
          pa2 tv = this.v;
          if ((ooa21 = tv.get()) == pa2.y) {
             break ;
          }else if(tv.compareAndSet(ooa21, ooa2)){
             tv = 1;
          }else {
             if (tv.get() != ooa21) {
                tv = 0;
             }
          }
          if (tv) {
             if (ooa21 != null) {
                cd1.a(ooa21);
             }
             p0.subscribe(ooa2);
             break ;
          }else {
             continue ;
          }
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.x, p0)) {
          this.x = p0;
          this.a.onSubscribe(this);
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
}
