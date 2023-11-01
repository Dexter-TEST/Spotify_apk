package p.va2;
import p.kv6;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import p.iv6;
import p.mv6;
import p.cd1;
import java.lang.Object;
import p.jl1;
import java.lang.Long;
import p.ya4;
import java.lang.String;
import java.lang.Throwable;

public final class va2 extends AtomicReference implements kv6, Runnable	// class@0029b2 from classes.dex
{
    public final iv6 a;
    public boolean b;

    public void va2(iv6 p0){
       super();
       this.a = p0;
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          this.b = true;
       }
       return;
    }
    public final void cancel(){
       cd1.a(this);
    }
    public final void run(){
       if (this.get() != cd1.a) {
          jl1 a = jl1.a;
          if (this.b != null) {
             this.a.onNext(Long.valueOf(0));
             this.lazySet(a);
             this.a.onComplete();
          }else {
             this.lazySet(a);
             this.a.onError(new ya4("Can\'t deliver value due to lack of requests"));
          }
       }
       return;
    }
}
