package p.fz4;
import p.ed1;
import p.gz4;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.rn;
import java.lang.Object;

public final class fz4 extends ed1	// class@00166a from classes.dex
{
    public final gz4 b;
    public boolean c;

    public void fz4(gz4 p0){
       super();
       this.b = p0;
    }
    public final void onComplete(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       fz4 tb = this.b;
       cd1.a(tb.t);
       tb.z = true;
       tb.a();
       return;
    }
    public final void onError(Throwable p0){
       if (this.c != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.c = true;
          fz4 tb = this.b;
          cd1.a(tb.t);
          if (tb.x.a(p0)) {
             tb.z = true;
             tb.a();
          }
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.c != null) {
          return;
       }
       this.b.b();
       return;
    }
}
