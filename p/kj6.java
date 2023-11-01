package p.kj6;
import io.reactivex.rxjava3.core.SingleObserver;
import p.zz;
import io.reactivex.rxjava3.core.Observer;
import p.yf2;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Iterable;
import java.util.Iterator;
import p.co5;
import java.lang.String;
import java.util.Objects;

public final class kj6 extends zz implements SingleObserver	// class@001c27 from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public Disposable c;
    public Iterator t;
    public boolean v;
    public boolean w;

    public void kj6(Observer p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int b(int p0){
       if (!((p0 & 2))) {
          return 0;
       }
       this.w = true;
       return 2;
    }
    public final void clear(){
       this.t = null;
    }
    public void dispose(){
       this.v = true;
       this.c.dispose();
       this.c = cd1.a;
    }
    public boolean isDisposed(){
       return this.v;
    }
    public final boolean isEmpty(){
       boolean b = (this.t == null)? true: false;
       return b;
    }
    public final void onError(Throwable p0){
       this.c = cd1.a;
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
       kj6 ta = this.a;
       p0 = this.b.apply(p0).iterator();
       if (!p0.hasNext()) {
          ta.onComplete();
          return;
       }else if(this.w != null){
          this.t = p0;
          ta.onNext(null);
          ta.onComplete();
          return;
       }else {
          while (true) {
             if (this.v != null) {
                return;
             }
             ta.onNext(p0.next());
             if (this.v != null) {
                return;
             }
             if (!p0.hasNext()) {
                break ;
             }
          }
          ta.onComplete();
          return;
       }
    }
    public final Object poll(){
       kj6 tt;
       if ((tt = this.t) == null) {
          return null;
       }
       Object obj = tt.next();
       Objects.requireNonNull(obj, "The iterator returned a null value");
       if (!tt.hasNext()) {
          this.t = null;
       }
       return obj;
    }
}
