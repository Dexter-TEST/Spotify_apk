package p.tz4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicReference;
import p.sz4;
import java.util.concurrent.atomic.AtomicInteger;
import p.rn;
import p.xe7;
import java.lang.Class;
import java.lang.Object;
import java.lang.Throwable;
import p.cd1;
import java.util.concurrent.atomic.AtomicReferenceArray;
import io.reactivex.rxjava3.disposables.Disposable;

public final class tz4 extends AtomicReference implements Observer	// class@002811 from classes.dex
{
    public final sz4 a;
    public final int b;
    public boolean c;

    public void tz4(sz4 p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onComplete(){
       tz4 ta = this.a;
       tz4 tb = this.b;
       if (this.c == null) {
          ta.x = true;
          ta.a(tb);
          xe7.K(ta.a, ta, ta.w);
       }else {
          ta.getClass();
       }
       return;
    }
    public final void onError(Throwable p0){
       tz4 ta = this.a;
       ta.x = true;
       cd1.a(ta.v);
       ta.a(this.b);
       xe7.L(ta.a, p0, ta, ta.w);
    }
    public final void onNext(Object p0){
       if (this.c == null) {
          this.c = true;
       }
       this.a.t.set(this.b, p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
