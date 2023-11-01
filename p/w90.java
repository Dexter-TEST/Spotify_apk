package p.w90;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ca0;
import p.s90;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import p.hn0;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.bx5;

public final class w90 implements Disposable, ca0	// class@00039e from classes2.dex
{
    public final s90 a;
    public final Observer b;
    public boolean c;
    public boolean t;

    public void w90(s90 p0,Observer p1){
       super();
       this.t = false;
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c = true;
       this.a.cancel();
    }
    public final void g(s90 p0,Throwable p1){
       if (p0.J()) {
          return;
       }
       this.b.onError(p1);
       return;
    }
    public boolean isDisposed(){
       return this.c;
    }
    public final void j(s90 p0,bx5 p1){
       if (this.c != null) {
          return;
       }
       this.b.onNext(p1);
       if (this.c == null) {
          this.t = true;
          this.b.onComplete();
       }
       return;
    }
}
