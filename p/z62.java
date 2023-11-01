package p.z62;
import p.v62;
import p.iv6;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.String;
import java.lang.NullPointerException;
import p.iw1;
import java.lang.Throwable;

public final class z62 extends v62	// class@002e96 from classes.dex
{

    public void z62(iv6 p0){
       super(p0);
    }
    public void onNext(Object p0){
       if (this.d()) {
          return;
       }
       if (p0 != null) {
          this.a.onNext(p0);
          while (true) {
             long l = this.get();
             if (l) {
                long l1 = l - 1;
                if (this.compareAndSet(l, l1)) {
                   break ;
                }
             }else {
                break ;
             }
          }
          return;
       }else {
          this.onError(iw1.b("onNext called with a null value."));
          return;
       }
    }
}
