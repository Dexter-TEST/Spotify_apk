package p.m62;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.lv6;
import p.n62;
import p.j62;
import java.lang.Throwable;
import java.lang.Object;
import p.kv6;

public final class m62 extends lv6 implements FlowableSubscriber	// class@001e32 from classes.dex
{
    public long A;
    public final n62 z;

    public void m62(n62 p0){
       super();
       this.z = p0;
    }
    public final void onComplete(){
       m62 tA = this.A;
       if (tA) {
          this.A = 0;
          this.d(tA);
       }
       tA = this.z;
       tA.B = false;
       tA.e();
       return;
    }
    public final void onError(Throwable p0){
       m62 tA = this.A;
       if (tA) {
          this.A = 0;
          this.d(tA);
       }
       this.z.b(p0);
       return;
    }
    public final void onNext(Object p0){
       this.A = this.A + 1;
       this.z.d(p0);
    }
    public final void onSubscribe(kv6 p0){
       this.e(p0);
    }
}
