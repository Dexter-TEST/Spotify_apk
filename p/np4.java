package p.np4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.op4;
import p.cd1;
import java.lang.Object;
import p.fn0;
import java.lang.Throwable;
import java.lang.Class;
import p.zv6;
import java.lang.String;
import java.util.Objects;
import java.util.Collection;
import p.yf2;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Long;
import java.util.Map;
import p.pp4;
import p.co5;

public final class np4 extends AtomicReference implements Observer, Disposable	// class@002023 from classes.dex
{
    public final op4 a;

    public void np4(op4 p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void onComplete(){
       this.lazySet(cd1.a);
       np4 ta = this.a;
       ta.v.b(this);
       if (!ta.v.g()) {
          cd1.a(ta.w);
          ta.y = true;
          ta.b();
       }
       return;
    }
    public final void onError(Throwable p0){
       this.lazySet(cd1.a);
       np4 ta = this.a;
       cd1.a(ta.w);
       ta.v.b(this);
       ta.onError(p0);
    }
    public final void onNext(Object p0){
       op4 c;
       np4 ta = this.a;
       ta.getClass();
       pp4 obj = ta.b.get();
       Objects.requireNonNull(obj, "The bufferSupplier returned a null Collection");
       p0 = ta.t.apply(p0);
       Objects.requireNonNull(p0, "The bufferClose returned a null ObservableSource");
       op4 b = ta.B;
       ta.B = 1 + b;
       _monitor_enter(ta);
       if ((c = ta.C) == null) {
          _monitor_exit(ta);
       }else {
          c.put(Long.valueOf(b), obj);
          _monitor_exit(ta);
          obj = new pp4(ta, b);
          ta.v.c(obj);
          p0.subscribe(obj);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
