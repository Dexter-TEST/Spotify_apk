package p.bw4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.ew4;
import io.reactivex.rxjava3.core.Observer;

public final class bw4 extends AtomicInteger implements Disposable	// class@00114b from classes.dex
{
    public final ew4 a;
    public final Observer b;
    public Serializable c;
    public boolean t;

    public void bw4(ew4 p0,Observer p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       if (this.t == null) {
          this.t = true;
          this.a.a(this);
          this.c = null;
       }
       return;
    }
    public boolean isDisposed(){
       return this.t;
    }
}
