package p.s92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.lv6;
import p.eb6;
import p.g92;
import p.r92;
import p.kv6;
import java.lang.Object;
import p.rl1;
import p.iv6;

public abstract class s92 extends lv6 implements FlowableSubscriber	// class@0025e2 from classes.dex
{
    public final g92 A;
    public final kv6 B;
    public long C;
    public final iv6 z;

    public void s92(eb6 p0,g92 p1,r92 p2){
       super();
       this.z = p0;
       this.A = p1;
       this.B = p2;
    }
    public final void cancel(){
       super.cancel();
       this.B.cancel();
    }
    public final void f(Object p0){
       this.e(rl1.a);
       s92 tC = this.C;
       if (tC) {
          this.C = 0;
          this.d(tC);
       }
       this.B.a(1);
       this.A.onNext(p0);
       return;
    }
    public final void onNext(Object p0){
       this.C = this.C + 1;
       this.z.onNext(p0);
    }
    public final void onSubscribe(kv6 p0){
       this.e(p0);
    }
}
