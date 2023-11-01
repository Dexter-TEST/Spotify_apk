package p.wn0;
import java.util.concurrent.ThreadFactory;
import java.lang.String;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Thread;

public final class wn0 implements ThreadFactory	// class@002b6b from classes.dex
{
    public final String a;

    public void wn0(String p0){
       this.a = p0;
    }
    public final Thread newThread(Runnable p0){
       Thread thread = new Thread(p0, this.a);
       thread.setPriority(10);
       return thread;
    }
}
