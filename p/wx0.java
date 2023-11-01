package p.wx0;
import java.util.concurrent.ExecutorService;
import java.lang.Object;
import p.a28;
import p.vv7;
import java.lang.ThreadLocal;
import p.em0;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import p.zk;
import java.util.concurrent.Executor;
import p.bu0;
import p.u44;
import java.lang.Class;
import p.qy7;
import p.p18;
import p.l18;

public final class wx0	// class@002bc2 from classes.dex
{
    public final ExecutorService a;
    public a28 b;
    public final Object c;
    public final ThreadLocal d;

    public void wx0(ExecutorService p0){
       super();
       this.b = vv7.t(null);
       this.c = new Object();
       this.d = new ThreadLocal();
       this.a = p0;
       p0.submit(new em0(20, this));
    }
    public final a28 a(Callable p0){
       wx0 tc = this.c;
       _monitor_enter(tc);
       a28 uoa28 = this.b.h(this.a, new zk(this, p0, 0));
       this.b = uoa28.h(this.a, new u44(19, this));
       _monitor_exit(tc);
       return uoa28;
    }
    public final a28 b(Callable p0){
       wx0 tc = this.c;
       _monitor_enter(tc);
       wx0 tb = this.b;
       tb.getClass();
       a28 uoa28 = new a28();
       tb.b.c(new qy7(this.a, new zk(this, p0, 0), uoa28, 0));
       tb.m();
       this.b = uoa28.h(this.a, new u44(19, this));
       _monitor_exit(tc);
       return uoa28;
    }
}
