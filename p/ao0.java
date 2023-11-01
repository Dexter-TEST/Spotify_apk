package p.ao0;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;

public final class ao0 implements ThreadFactory	// class@000fbd from classes.dex
{
    public final AtomicInteger a;
    public final boolean b;

    public void ao0(boolean p0){
       this.b = p0;
       super();
       this.a = new AtomicInteger(0);
    }
    public final Thread newThread(Runnable p0){
       String str = (this.b != null)? "WM.task-": "androidx.work-";
       return new Thread(p0, en6.r(str)+this.a.incrementAndGet());
    }
}
