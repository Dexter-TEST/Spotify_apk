package p.b36;
import p.wn5;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import p.iv6;
import p.mv6;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class b36 extends AtomicInteger implements wn5	// class@001049 from classes.dex
{
    public final Object a;
    public final iv6 b;

    public void b36(Object p0,iv6 p1){
       super();
       this.b = p1;
       this.a = p0;
    }
    public final void a(long p0){
       if (!mv6.f(p0)) {
          return;
       }
       if (this.compareAndSet(0, 1)) {
          b36 tb = this.b;
          tb.onNext(this.a);
          if (this.get() != 2) {
             tb.onComplete();
          }
       }
       return;
    }
    public final int b(int p0){
       return (p0 & 0x01);
    }
    public final void cancel(){
       this.lazySet(2);
    }
    public final void clear(){
       this.lazySet(1);
    }
    public final boolean isEmpty(){
       boolean b = (this.get())? true: false;
       return b;
    }
    public final boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public final Object poll(){
       if (this.get()) {
          return null;
       }
       this.lazySet(1);
       return this.a;
    }
}
