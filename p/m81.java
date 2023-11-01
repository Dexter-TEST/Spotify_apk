package p.m81;
import java.util.concurrent.ThreadFactory;
import java.lang.String;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import p.n81;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.util.concurrent.Executors;
import p.xw1;

public final class m81 implements ThreadFactory	// class@001e42 from classes.dex
{
    public final int a;
    public final Serializable b;
    public final Object c;

    public void m81(String p0,AtomicLong p1){
       this.a = 1;
       this.b = p0;
       this.c = p1;
       super();
    }
    public void m81(n81 p0){
       this.a = 0;
       this.c = p0;
       super();
       this.b = new AtomicInteger(0);
    }
    public final Thread newThread(Runnable p0){
       m81 tb = this.b;
       switch (this.a){
           case 0:
           default:
             Thread thread1 = Executors.defaultThreadFactory().newThread(new xw1(p0));
             thread1.setName(tb+this.c.getAndIncrement());
             return thread1;
       }
       Thread thread = new Thread(p0);
       thread.setName("arch_disk_io_"+tb.getAndIncrement());
       return thread;
    }
}
