package p.g82;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Iterable;
import p.iv6;
import java.util.Iterator;
import p.rl1;
import p.kv6;
import p.zn0;
import p.f82;
import java.lang.Throwable;
import p.co5;

public final class g82 extends Flowable	// class@0016ba from classes.dex
{
    public final Iterable b;

    public void g82(Iterable p0){
       super();
       this.b = p0;
    }
    public static void subscribe(iv6 p0,Iterator p1){
       rl1 a = rl1.a;
       if (!p1.hasNext()) {
          p0.onSubscribe(a);
          p0.onComplete();
          return;
       }else if(p0 instanceof zn0){
          p0.onSubscribe(new f82(p0, p1, 0));
       }else {
          p0.onSubscribe(new f82(p0, p1, 1));
       }
       return;
    }
    public final void u(iv6 p0){
       g82.subscribe(p0, this.b.iterator());
    }
}
