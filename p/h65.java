package p.h65;
import p.ir0;
import p.t67;
import java.lang.Object;
import java.lang.Throwable;
import p.t00;
import p.l51;
import p.do5;
import java.lang.Class;
import p.z4;
import p.i65;
import java.lang.String;
import p.r45;
import java.util.List;
import java.util.Collection;
import com.google.common.collect.c;
import io.reactivex.rxjava3.disposables.Disposable;
import p.j65;
import io.reactivex.rxjava3.core.Single;

public final class h65 implements ir0	// class@0017ef from classes.dex
{
    public final int a;
    public final t67 b;

    public void h65(t67 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       h65 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             z4 b = p0.b;
             l51 c = p0.c;
             if (b != null) {
                tb.w.onNext(do5.s(b));
                tb.x.onNext(do5.s(b));
             }else if(c != null){
                tb.y = c.next();
                p0 = c.a();
                if (p0.c()) {
                   tb.b.addAll(p0.b());
                   tb.w.onNext(do5.u0(c.o(tb.b)));
                }
                p0 = c.e();
                if (p0.c()) {
                   tb.x.onNext(do5.u0(p0.b()));
                }
             }else if(p0.a != null){
                tb.w.onNext(new l51(true, null, null));
                tb.x.onNext(new l51(true, null, null));
             }
             return;
             break;
           case 1:
           default:
             if (tb.b.isEmpty()) {
                tb.c(tb.t.first());
             }
             return;
       }
       tb.w.onNext(do5.s(p0));
       tb.x.onNext(do5.s(p0));
       return;
    }
}
