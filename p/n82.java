package p.n82;
import p.kv6;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicLong;
import p.iv6;
import java.util.concurrent.atomic.AtomicReference;
import p.mv6;
import p.vv7;
import p.cd1;
import java.lang.Object;
import java.lang.Long;
import p.ya4;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;

public final class n82 extends AtomicLong implements kv6, Runnable	// class@001f87 from classes.dex
{
    public final iv6 a;
    public long b;
    public final AtomicReference c;

    public void n82(iv6 p0){
       super();
       this.c = new AtomicReference();
       this.a = p0;
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this, p0);
       }
       return;
    }
    public final void cancel(){
       cd1.a(this.c);
    }
    public final void run(){
       n82 tc = this.c;
       if (tc.get() != cd1.a) {
          n82 ta = this.a;
          if (this.get()) {
             tc = this.b;
             this.b = tc + 1;
             ta.onNext(Long.valueOf(tc));
             vv7.H(this, 1);
          }else {
             ta.onError(new ya4("Can\'t deliver value "+this.b+" due to lack of requests"));
             cd1.a(tc);
          }
       }
       return;
    }
}
