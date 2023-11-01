package p.ji6;
import io.reactivex.rxjava3.core.SingleObserver;
import p.ki6;
import p.ra6;
import java.lang.Object;
import java.lang.Throwable;
import p.iz7;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class ji6 implements SingleObserver	// class@001ae3 from classes.dex
{
    public final ra6 a;
    public final SingleObserver b;
    public final ki6 c;

    public void ji6(ki6 p0,ra6 p1,SingleObserver p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public final void onError(Throwable p0){
       ji6 tc = this.c;
       ki6 t = tc.t;
       iz7 oiz7 = new iz7(this, p0, 23);
       ki6 b = (tc.v != null)? tc.b: 0;
       tc = this.a;
       tc.getClass();
       cd1.c(tc, t.d(oiz7, b, tc.c));
       return;
    }
    public final void onSubscribe(Disposable p0){
       ji6 ta = this.a;
       ta.getClass();
       cd1.c(ta, p0);
    }
    public final void onSuccess(Object p0){
       ji6 tc = this.c;
       tc = this.a;
       tc.getClass();
       cd1.c(tc, tc.t.d(new iz7(this, p0, 24), tc.b, tc.c));
    }
}
