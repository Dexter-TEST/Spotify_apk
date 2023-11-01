package p.b72;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import p.iv6;
import java.lang.Enum;
import p.w62;
import p.y62;
import p.x62;
import p.z62;
import p.kv6;
import io.reactivex.rxjava3.core.FlowableEmitter;
import java.lang.Throwable;
import p.co5;
import p.v62;

public final class b72 extends Flowable	// class@001069 from classes.dex
{
    public final FlowableOnSubscribe b;
    public final BackpressureStrategy c;

    public void b72(FlowableOnSubscribe p0){
       super();
       this.b = p0;
       this.c = BackpressureStrategy.c;
    }
    public final void u(iv6 p0){
       int i;
       w62 ow62;
       if (i = this.c.ordinal()) {
          int i1 = 1;
          if (i != i1) {
             if (i != 3) {
                ow62 = (i != 4)? new w62(p0, Flowable.a): new y62(p0);
             }else {
                ow62 = new x62(p0, 0);
             }
          }else {
             ow62 = new x62(p0, i1);
          }
       }else {
          ow62 = new z62(p0);
       }
       p0.onSubscribe(ow62);
       this.b.subscribe(ow62);
       return;
    }
}
