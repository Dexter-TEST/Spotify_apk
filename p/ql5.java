package p.ql5;
import java.lang.Runnable;
import android.content.Context;
import java.lang.Object;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import p.bk;
import p.do5;
import p.pl5;

public final class ql5 implements Runnable	// class@0023c6 from classes.dex
{
    public final int a;
    public final Context b;

    public void ql5(Context p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       ql5 tb = this.b;
       switch (this.a){
           case 0:
           default:
             do5.B0(tb, new bk(5), do5.y, false);
             return;
       }
       ThreadPoolExecutor v0 = new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
       v0.execute(new ql5(tb, 1));
       return;
    }
}
