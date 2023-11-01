package p.bm7;
import p.ir0;
import io.reactivex.rxjava3.core.SingleEmitter;
import p.fn0;
import p.yf2;
import java.lang.Object;
import com.google.common.collect.c;
import p.d73;
import java.lang.Iterable;
import java.lang.String;
import p.ys5;
import p.hi6;
import io.reactivex.rxjava3.core.Single;
import java.util.Objects;
import p.am7;
import io.reactivex.rxjava3.disposables.Disposable;

public final class bm7 implements ir0	// class@0010f5 from classes.dex
{
    public final SingleEmitter a;
    public final fn0 b;
    public final yf2 c;
    public final yf2 t;
    public final yf2 v;
    public final d73 w;

    public void bm7(SingleEmitter p0,fn0 p1,yf2 p2,yf2 p3,yf2 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = new d73();
    }
    public final void accept(Object p0){
       bm7 tw = this.w;
       tw.G0(this.t.apply(p0));
       p0 = this.c.apply(p0);
       bm7 ta = this.a;
       if (p0 == null) {
          ta.onSuccess(tw.I0());
       }else {
          Objects.requireNonNull(ta);
          this.b.c(this.v.apply(p0).subscribe(this, new am7(ta, 1)));
       }
       return;
    }
}
