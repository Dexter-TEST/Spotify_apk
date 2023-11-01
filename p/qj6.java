package p.qj6;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Object;
import p.yf2;
import p.iv6;
import io.reactivex.rxjava3.core.Single;
import p.l34;
import io.reactivex.rxjava3.core.SingleObserver;
import p.rl1;
import java.lang.String;
import java.util.Objects;
import p.bn5;
import p.zv6;
import p.kv6;
import p.b36;
import java.lang.Throwable;
import p.co5;

public final class qj6 extends Flowable	// class@0023b5 from classes.dex
{
    public final int b;
    public final yf2 c;
    public final Object t;

    public void qj6(Object p0,yf2 p1,int p2){
       this.b = p2;
       super();
       this.t = p0;
       this.c = p1;
    }
    public final void u(iv6 p0){
       qj6 tc = this.c;
       qj6 tt = this.t;
       switch (this.b){
           case 0:
             tt.subscribe(new l34(p0, tc));
             return;
           default:
             rl1 a = rl1.a;
             Object obj = tc.apply(tt);
             Objects.requireNonNull(obj, "The mapper returned a null Publisher");
             if (obj instanceof zv6) {
                if ((obj = obj.get()) == null) {
                   p0.onSubscribe(a);
                   p0.onComplete();
                }else {
                   p0.onSubscribe(new b36(obj, p0));
                }
             }else {
                obj.subscribe(p0);
             }
             return;
       }
    }
}
