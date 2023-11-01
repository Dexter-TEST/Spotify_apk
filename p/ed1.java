package p.ed1;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Class;
import java.lang.String;
import java.util.Objects;
import p.ye7;

public abstract class ed1 implements Observer, Disposable	// class@001463 from classes.dex
{
    public final AtomicReference a;

    public void ed1(){
       super();
       this.a = new AtomicReference();
    }
    public final void dispose(){
       cd1.a(this.a);
    }
    public final boolean isDisposed(){
       boolean b = (this.a.get() == cd1.a)? true: false;
       return b;
    }
    public final void onSubscribe(Disposable p0){
       int i;
       ed1 ta = this.a;
       Class class = this.getClass();
       Objects.requireNonNull(p0, "next is null");
       while (true) {
          if (ta.compareAndSet(null, p0)) {
             i = 1;
          }else {
             if (ta.get() != null) {
                i = 0;
             }
          }
          if (!i) {
             p0.dispose();
             if (ta.get() != cd1.a) {
                ye7.Q(class);
                break ;
             }
          }
          break ;
       }
       return;
    }
}
