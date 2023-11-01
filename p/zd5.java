package p.zd5;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.PriorityBlockingQueue;
import p.gf7;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.lang.Runnable;
import java.util.concurrent.Future;
import p.yd5;
import p.e20;

public final class zd5 extends ThreadPoolExecutor	// class@002ed6 from classes.dex
{

    public void zd5(){
       super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new gf7());
    }
    public final void a(int p0){
       this.setCorePoolSize(p0);
       this.setMaximumPoolSize(p0);
    }
    public final Future submit(Runnable p0){
       yd5 oyd5 = new yd5(p0);
       this.execute(oyd5);
       return oyd5;
    }
}
