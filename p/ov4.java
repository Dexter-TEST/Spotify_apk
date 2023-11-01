package p.ov4;
import p.zz;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.Long;

public final class ov4 extends zz	// class@00219a from classes.dex
{
    public final Observer a;
    public final long b;
    public long c;
    public boolean t;

    public void ov4(Observer p0,long p1,long p2){
       super();
       this.a = p0;
       this.c = p1;
       this.b = p2;
    }
    public final int b(int p0){
       if (!((p0 & 1))) {
          return 0;
       }
       this.t = true;
       return 1;
    }
    public final void clear(){
       this.c = this.b;
       this.lazySet(1);
    }
    public void dispose(){
       this.set(1);
    }
    public boolean isDisposed(){
       boolean b = (this.get())? true: false;
       return b;
    }
    public final boolean isEmpty(){
       boolean b = (!(this.c - this.b))? true: false;
       return b;
    }
    public final Object poll(){
       Long longx;
       ov4 tc = this.c;
       if (tc - this.b) {
          this.c = 1 + tc;
          longx = Long.valueOf(tc);
       }else {
          this.lazySet(1);
          longx = null;
       }
       return longx;
    }
}
