package p.w81;
import p.zz;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;

public class w81 extends zz	// class@002ae5 from classes.dex
{
    public final Observer a;
    public Object b;

    public void w81(Observer p0){
       super();
       this.a = p0;
    }
    public final void a(Object p0){
       int i = this.get();
       if ((i & 0x36)) {
          return;
       }
       w81 ta = this.a;
       if (i == 8) {
          this.b = p0;
          this.lazySet(16);
          ta.onNext(null);
       }else {
          this.lazySet(2);
          ta.onNext(p0);
       }
       if (this.get() != 4) {
          ta.onComplete();
       }
       return;
    }
    public final int b(int p0){
       if (!((p0 & 2))) {
          return 0;
       }
       this.lazySet(8);
       return 2;
    }
    public final void clear(){
       this.lazySet(32);
       this.b = null;
    }
    public void dispose(){
       this.set(4);
       this.b = null;
    }
    public final boolean isDisposed(){
       boolean b = (this.get() == 4)? true: false;
       return b;
    }
    public final boolean isEmpty(){
       boolean b = (this.get() != 16)? true: false;
       return b;
    }
    public final Object poll(){
       if (this.get() != 16) {
          return null;
       }
       w81 tb = this.b;
       this.b = null;
       this.lazySet(32);
       return tb;
    }
}
