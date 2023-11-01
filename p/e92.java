package p.e92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.lv6;
import p.iv6;
import p.yf2;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import p.bn5;
import p.co5;
import p.hn0;
import p.kv6;

public final class e92 extends lv6 implements FlowableSubscriber	// class@001440 from classes.dex
{
    public final yf2 A;
    public boolean B;
    public boolean C;
    public long D;
    public final iv6 z;

    public void e92(iv6 p0,yf2 p1){
       super();
       this.z = p0;
       this.A = p1;
    }
    public final void onComplete(){
       if (this.C != null) {
          return;
       }
       this.C = true;
       this.B = true;
       this.z.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       e92 tz = this.z;
       if (this.B != null) {
          if (this.C != null) {
             RxJavaPlugins.c(p0);
             return;
          }else {
             tz.onError(p0);
             return;
          }
       }else {
          this.B = true;
          Object obj = this.A.apply(p0);
          Objects.requireNonNull(obj, "The nextSupplier returned a null Publisher");
          e92 tD = this.D;
          if (tD) {
             this.d(tD);
          }
          obj.subscribe(this);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.C != null) {
          return;
       }
       if (this.B == null) {
          this.D = this.D + 1;
       }
       this.z.onNext(p0);
       return;
    }
    public final void onSubscribe(kv6 p0){
       this.e(p0);
    }
}
