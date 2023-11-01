package p.a82;
import p.zv6;
import io.reactivex.rxjava3.core.Flowable;
import p.jc2;
import java.lang.Object;
import java.util.concurrent.Callable;
import java.lang.String;
import java.util.Objects;
import p.iv6;
import p.x81;
import p.kv6;
import java.lang.Throwable;
import p.co5;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class a82 extends Flowable implements zv6	// class@000f30 from classes.dex
{
    public final Callable b;

    public void a82(jc2 p0){
       super();
       this.b = p0;
    }
    public final Object get(){
       Object obj = this.b.call();
       Objects.requireNonNull(obj, "The callable returned a null value");
       return obj;
    }
    public final void u(iv6 p0){
       x81 ox81 = new x81(p0);
       p0.onSubscribe(ox81);
       Object obj = this.b.call();
       Objects.requireNonNull(obj, "The callable returned a null value");
       ox81.d(obj);
    }
}
