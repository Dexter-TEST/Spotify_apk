package p.ev4;
import io.reactivex.rxjava3.core.Observer;
import p.yf2;
import java.lang.Object;
import p.ra6;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.NullPointerException;
import java.lang.String;
import p.co5;
import p.hn0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class ev4 implements Observer	// class@001506 from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public final ra6 c;
    public boolean t;
    public boolean v;

    public void ev4(Observer p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new ra6();
    }
    public final void onComplete(){
       if (this.v != null) {
          return;
       }
       this.v = true;
       this.t = true;
       this.a.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       ObservableSource observableSo;
       ev4 ta = this.a;
       if (this.t != null) {
          if (this.v != null) {
             RxJavaPlugins.c(p0);
             return;
          }else {
             ta.onError(p0);
             return;
          }
       }else {
          this.t = true;
          if ((observableSo = this.b.apply(p0)) == null) {
             NullPointerException nullPointerE = new NullPointerException("Observable is null");
             nullPointerE.initCause(p0);
             ta.onError(nullPointerE);
             return;
          }else {
             observableSo.subscribe(this);
             return;
          }
       }
    }
    public final void onNext(Object p0){
       if (this.v != null) {
          return;
       }
       this.a.onNext(p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       ev4 tc = this.c;
       tc.getClass();
       cd1.c(tc, p0);
    }
}
