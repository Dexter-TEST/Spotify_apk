package p.on0;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.qn0;
import p.jl3;
import p.fn0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import p.jl1;
import java.util.concurrent.TimeUnit;
import p.ad1;
import p.i36;
import p.cj4;

public final class on0 extends Scheduler$Worker	// class@002151 from classes.dex
{
    public final jl3 a;
    public final fn0 b;
    public final jl3 c;
    public final qn0 t;
    public boolean v;

    public void on0(qn0 p0){
       super();
       this.t = p0;
       jl3 ojl3 = new jl3();
       this.a = ojl3;
       fn0 uofn0 = new fn0();
       this.b = uofn0;
       jl3 ojl31 = new jl3();
       this.c = ojl31;
       ojl31.c(ojl3);
       ojl31.c(uofn0);
    }
    public final Disposable a(Runnable p0){
       if (this.v != null) {
          return jl1.a;
       }
       return this.t.d(p0, 0, TimeUnit.MILLISECONDS, this.a);
    }
    public final Disposable b(Runnable p0,long p1,TimeUnit p2){
       if (this.v != null) {
          return jl1.a;
       }
       return this.t.d(p0, p1, p2, this.b);
    }
    public void dispose(){
       if (this.v == null) {
          this.v = true;
          this.c.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.v;
    }
}
