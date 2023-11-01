package p.ba2;
import p.yo0;
import p.mh2;
import p.x92;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.atomic.AtomicReference;
import p.zv6;
import p.iv6;
import p.bn5;
import java.lang.Object;
import p.y92;

public final class ba2 extends yo0	// class@001085 from classes.dex
{
    public final Flowable b;
    public final AtomicReference c;
    public final zv6 t;
    public final bn5 v;

    static {
       mh2 omh2 = new mh2(1);
    }
    public void ba2(x92 p0,Flowable p1,AtomicReference p2,zv6 p3){
       super();
       this.v = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void u(iv6 p0){
       this.v.subscribe(p0);
    }
    public final void z(){
       y92 oy92;
       ba2 tc = this.c;
       if ((oy92 = tc.get()) != null && oy92.isDisposed()) {
          do {
          } while (tc.compareAndSet(oy92, null) || tc.get() != oy92);
       }
       return;
    }
}
