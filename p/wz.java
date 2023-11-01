package p.wz;
import p.zn0;
import p.wn5;
import java.lang.Object;
import p.kv6;
import p.yh6;
import p.vn5;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import p.iv6;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.mv6;
import io.reactivex.rxjava3.core.FlowableSubscriber;

public abstract class wz implements zn0, wn5	// class@002bdc from classes.dex
{
    public final zn0 a;
    public kv6 b;
    public wn5 c;
    public boolean t;
    public int v;

    public void wz(zn0 p0){
       super();
       this.a = p0;
    }
    public final void a(long p0){
       this.b.a(p0);
    }
    public final void cancel(){
       this.b.cancel();
    }
    public final void clear(){
       this.c.clear();
    }
    public final int d(int p0){
       wz tc;
       if ((tc = this.c) == null || ((p0 & 0x04))) {
          return 0;
       }
       if (p0 = tc.b(p0)) {
          this.v = p0;
       }
       return p0;
    }
    public final boolean isEmpty(){
       return this.c.isEmpty();
    }
    public final boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public final void onComplete(){
       if (this.t != null) {
          return;
       }
       this.t = true;
       this.a.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       if (this.t != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.t = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.b, p0)) {
          this.b = p0;
          if (p0 instanceof wn5) {
             this.c = p0;
          }
          this.a.onSubscribe(this);
       }
       return;
    }
}
