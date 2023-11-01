package p.rp4;
import p.ed1;
import p.sp4;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import p.zv6;
import java.lang.String;
import java.util.Objects;
import java.util.Collection;
import io.reactivex.rxjava3.disposables.Disposable;
import p.pn5;
import p.co5;
import io.reactivex.rxjava3.core.Observer;

public final class rp4 extends ed1	// class@002532 from classes.dex
{
    public final sp4 b;

    public void rp4(sp4 p0){
       super();
       this.b = p0;
    }
    public final void onComplete(){
       this.b.onComplete();
    }
    public final void onError(Throwable p0){
       this.b.onError(p0);
    }
    public final void onNext(Object p0){
       sp4 b;
       p0 = this.b;
       p0.getClass();
       Object obj = p0.x.get();
       Objects.requireNonNull(obj, "The buffer supplied is null");
       _monitor_enter(p0);
       if ((b = p0.B) == null) {
          _monitor_exit(p0);
       }else {
          p0.B = obj;
          _monitor_exit(p0);
          p0.l(b, p0);
       }
       return;
    }
}
