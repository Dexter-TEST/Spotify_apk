package p.en;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import p.gn;
import android.graphics.Bitmap;
import java.lang.String;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.lang.Class;
import p.fn;
import p.r45;
import p.hv5;
import p.wd5;
import p.av5;
import java.lang.IllegalStateException;
import p.e07;
import p.es5;
import p.hi6;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;

public final class en implements SingleOnSubscribe	// class@0014c3 from classes.dex
{
    public final gn a;
    public final Bitmap b;
    public final String c;
    public final int t;

    public void en(gn p0,Bitmap p1,String p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void subscribe(SingleEmitter p0){
       en tt;
       en ta = this.a;
       ta.getClass();
       fn uofn = new fn(p0, r45.a(this.b));
       hv5 ohv5 = ta.a.g(this.c);
       if ((tt = this.t) > null) {
          hv5 b = ohv5.b;
          b.b(tt, 0);
          if (b.d == null && b.c == null) {
             throw new IllegalStateException("onlyScaleDown can not be applied without resize");
          }else {
             b.e = true;
          }
       }
       ohv5.f(uofn);
       p0.getClass();
       cd1.d(p0, new es5(ta, uofn));
       return;
    }
}
