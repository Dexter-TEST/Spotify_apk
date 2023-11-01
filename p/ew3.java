package p.ew3;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.SecurityManager;
import java.lang.System;
import java.lang.Thread;
import java.lang.ThreadGroup;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Runnable;

public final class ew3 implements ThreadFactory	// class@00150e from classes.dex
{
    public final ThreadGroup a;
    public final AtomicInteger b;
    public final String c;
    public static final AtomicInteger t;

    static {
       ew3.t = new AtomicInteger(1);
    }
    public void ew3(){
       SecurityManager securityMana;
       super();
       this.b = new AtomicInteger(1);
       ThreadGroup threadGroup = ((securityMana = System.getSecurityManager()) == null)? Thread.currentThread().getThreadGroup(): securityMana.getThreadGroup();
       this.a = threadGroup;
       this.c = "lottie-"+ew3.t.getAndIncrement()+"-thread-";
       return;
    }
    public final Thread newThread(Runnable p0){
       Thread v6 = new Thread(this.a, p0, this.c+this.b.getAndIncrement(), 0);
       v6.setDaemon(false);
       v6.setPriority(10);
       return v6;
    }
}
