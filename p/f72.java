package p.f72;
import io.reactivex.rxjava3.core.Flowable;
import p.zv6;
import p.iv6;
import p.rl1;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import p.bn5;
import java.lang.Throwable;
import p.co5;
import p.kv6;
import p.iw1;

public final class f72 extends Flowable	// class@001571 from classes.dex
{
    public final int b;
    public final zv6 c;

    public void f72(int p0,zv6 p1){
       this.b = p0;
       this.c = p1;
    }
    public final void u(iv6 p0){
       Object obj;
       rl1 a = rl1.a;
       f72 tc = this.c;
       switch (this.b){
           case 0:
             break;
           default:
             obj = tc.get();
             iw1.c(obj, "Callable returned a null Throwable.");
             p0.onSubscribe(a);
             p0.onError(obj);
             return;
       }
       obj = tc.get();
       Objects.requireNonNull(obj, "The publisher supplied is null");
       obj.subscribe(p0);
       return;
    }
}
