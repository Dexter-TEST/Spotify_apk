package p.q82;
import p.yz;
import p.iv6;
import p.yf2;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Throwable;
import p.co5;
import p.kv6;
import p.yh6;

public final class q82 extends yz	// class@00234e from classes.dex
{
    public final yf2 w;

    public void q82(iv6 p0,yf2 p1){
       super(p0);
       this.w = p1;
    }
    public final int b(int p0){
       return this.d(p0);
    }
    public final void onNext(Object p0){
       if (this.t != null) {
          return;
       }
       yz ta = this.a;
       if (this.v != null) {
          ta.onNext(null);
          return;
       }else {
          p0 = this.w.apply(p0);
          Objects.requireNonNull(p0, "The mapper function returned a null value.");
          ta.onNext(p0);
          return;
       }
    }
    public final Object poll(){
       Object obj;
       if ((obj = this.c.poll()) != null) {
          obj = this.w.apply(obj);
          Objects.requireNonNull(obj, "The mapper function returned a null value.");
       }else {
          obj = null;
       }
       return obj;
    }
}
