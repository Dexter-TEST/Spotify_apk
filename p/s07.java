package p.s07;
import p.te7;
import java.lang.Object;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

public final class s07	// class@000328 from classes2.dex
{
    public final ThreadPoolExecutor a;

    public void s07(te7 p0){
       super();
       ThreadPoolExecutor v8 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), p0);
       this.a = v8;
    }
}
