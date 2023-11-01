package p.kp4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.zv6;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Collection;
import java.lang.Throwable;
import p.co5;
import p.jl1;
import p.cd1;

public final class kp4 implements Observer, Disposable	// class@001c5b from classes.dex
{
    public final Observer a;
    public final int b;
    public final zv6 c;
    public Collection t;
    public int v;
    public Disposable w;

    public void kp4(Observer p0,int p1,zv6 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean a(){
       Object obj = this.c.get();
       Objects.requireNonNull(obj, "Empty buffer supplied");
       this.t = obj;
       return true;
    }
    public void dispose(){
       this.w.dispose();
    }
    public boolean isDisposed(){
       return this.w.isDisposed();
    }
    public final void onComplete(){
       kp4 tt;
       if ((tt = this.t) != null) {
          this.t = null;
          kp4 ta = this.a;
          if (!tt.isEmpty()) {
             ta.onNext(tt);
          }
          ta.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       this.t = null;
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       kp4 tt;
       if ((tt = this.t) != null) {
          tt.add(p0);
          int i = this.v + 1;
          this.v = i;
          if (i >= this.b) {
             this.a.onNext(tt);
             this.v = 0;
             this.a();
          }
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
}
