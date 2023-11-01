package p.ri6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.yf2;
import java.lang.Object;
import java.lang.Throwable;
import p.cd1;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.Notification;
import p.yj4;
import p.co5;

public final class ri6 implements SingleObserver, Disposable	// class@0024f5 from classes.dex
{
    public final MaybeObserver a;
    public final yf2 b;
    public Disposable c;

    public void ri6(MaybeObserver p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onError(Throwable p0){
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
       Notification a;
       int i;
       ri6 ta = this.a;
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The selector returned a null Notification");
       a = p0.a;
       if (p0.c()) {
          if (a == null || a instanceof yj4) {
             a = null;
          }
          ta.onSuccess(a);
       }else if(a == null){
          i = 1;
       }else {
          i = 0;
       }
       if (i) {
          ta.onComplete();
       }else {
          ta.onError(p0.b());
       }
       return;
    }
}
