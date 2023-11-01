package p.t92;
import p.kv6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicLong;
import p.y92;
import p.iv6;
import p.mv6;
import p.vv7;
import p.v92;

public final class t92 extends AtomicLong implements kv6, Disposable	// class@002725 from classes.dex
{
    public final y92 a;
    public final iv6 b;
    public Serializable c;
    public final AtomicLong t;
    public boolean v;
    public boolean w;

    public void t92(y92 p0,iv6 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.t = new AtomicLong();
    }
    public final void a(long p0){
       if (mv6.f(p0) && (vv7.b(this, p0) - Long.MIN_VALUE)) {
          vv7.a(this.t, p0);
          t92 ta = this.a;
          ta.a();
          ta.a.g(this);
       }
       return;
    }
    public final void cancel(){
       this.dispose();
    }
    public void dispose(){
       long l = Long.MIN_VALUE;
       if (this.getAndSet(l) - l) {
          t92 ta = this.a;
          ta.b(this);
          ta.a();
          this.c = null;
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (!(this.get() - Long.MIN_VALUE))? true: false;
       return b;
    }
}
