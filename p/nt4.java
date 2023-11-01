package p.nt4;
import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observer;
import p.w00;
import p.ir0;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.lang.NullPointerException;
import p.iw1;
import java.lang.IllegalStateException;

public final class nt4 implements Emitter, Disposable	// class@002046 from classes.dex
{
    public final Observer a;
    public final ir0 b;
    public Object c;
    public boolean t;
    public boolean v;
    public boolean w;

    public void nt4(Observer p0,w00 p1,ir0 p2,Object p3){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p3;
    }
    public final void a(Object p0){
       this.b.accept(p0);
       return;
    }
    public void dispose(){
       this.t = true;
    }
    public boolean isDisposed(){
       return this.t;
    }
    public final void onComplete(){
       if (this.v == null) {
          this.v = true;
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       NullPointerException nullPointerE;
       if (this.v != null) {
          RxJavaPlugins.c(p0);
       }else if(p0 == null){
          nullPointerE = iw1.b("onError called with a null Throwable.");
       }
       this.v = true;
       this.a.onError(nullPointerE);
       return;
    }
    public void onNext(Object p0){
       if (this.v == null) {
          if (this.w != null) {
             this.onError(new IllegalStateException("onNext already called in this generate turn"));
          }else if(p0 == null){
             this.onError(iw1.b("onNext called with a null value."));
          }else {
             this.w = true;
             this.a.onNext(p0);
          }
       }
       return;
    }
}
