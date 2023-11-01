package p.xz;
import io.reactivex.rxjava3.core.Observer;
import p.on5;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.disposables.Disposable;
import p.vn5;
import p.yh6;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;

public abstract class xz implements Observer, on5	// class@002d1e from classes.dex
{
    public final Observer a;
    public Disposable b;
    public on5 c;
    public boolean t;
    public int v;

    public void xz(Observer p0){
       super();
       this.a = p0;
    }
    public final void a(Throwable p0){
       co5.M(p0);
       this.b.dispose();
       this.onError(p0);
    }
    public final int c(int p0){
       xz tc;
       if ((tc = this.c) == null || ((p0 & 0x04))) {
          return 0;
       }
       if (p0 = tc.b(p0)) {
          this.v = p0;
       }
       return p0;
    }
    public void clear(){
       this.c.clear();
    }
    public void dispose(){
       this.b.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final boolean isEmpty(){
       return this.c.isEmpty();
    }
    public final boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public void onComplete(){
       if (this.t != null) {
          return;
       }
       this.t = true;
       this.a.onComplete();
       return;
    }
    public void onError(Throwable p0){
       if (this.t != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.t = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          if (p0 instanceof on5) {
             this.c = p0;
          }
          this.a.onSubscribe(this);
       }
       return;
    }
}
