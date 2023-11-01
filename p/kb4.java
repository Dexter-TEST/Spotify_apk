package p.kb4;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Thread;
import java.util.concurrent.Executors;
import java.lang.Class;
import java.util.Locale;
import java.lang.Long;
import java.lang.String;

public final class kb4 implements ThreadFactory	// class@001be0 from classes.dex
{
    public static final AtomicLong a;

    static {
       kb4.a = new AtomicLong(0);
    }
    public void kb4(){
       super();
    }
    public final Thread newThread(Runnable p0){
       p0.getClass();
       Thread thread = Executors.defaultThreadFactory().newThread(p0);
       Object[] objArray = new Object[]{Long.valueOf(kb4.a.incrementAndGet())};
       thread.setName(String.format(Locale.ENGLISH, "mobius-thread-%d", objArray));
       return thread;
    }
}
