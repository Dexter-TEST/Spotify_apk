package p.ln;
import java.lang.Runnable;
import p.mc4;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import p.mn;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import p.nc4;
import p.oc4;
import java.util.concurrent.CountDownLatch;
import p.qc4;
import p.pc4;
import android.os.Message;
import android.os.Handler;

public final class ln implements Runnable	// class@001d8c from classes.dex
{
    public final nc4 a;
    public final oc4 b;
    public int c;
    public final AtomicBoolean t;
    public final AtomicBoolean v;
    public final CountDownLatch w;
    public final mn x;
    public static final ThreadPoolExecutor y;
    public static qc4 z;

    static {
       ThreadPoolExecutor v8 = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(10), new mc4(0));
       ln.y = v8;
    }
    public void ln(mn p0){
       this.x = p0;
       super();
       this.c = 1;
       this.t = new AtomicBoolean();
       this.v = new AtomicBoolean();
       nc4 onc4 = new nc4(this);
       this.a = onc4;
       this.b = new oc4(this, onc4);
       this.w = new CountDownLatch(1);
    }
    public final void a(Object p0){
       ln oln = ln.class;
       _monitor_enter(oln);
       if (ln.z == null) {
          ln.z = new qc4();
       }
       _monitor_exit(oln);
       Object[] objArray = new Object[]{p0};
       ln.z.obtainMessage(1, new pc4(this, objArray)).sendToTarget();
       return;
    }
    public final void run(){
       this.x.b();
    }
}
