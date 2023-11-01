package p.te7;
import java.util.concurrent.ThreadFactory;
import java.lang.String;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Thread;
import p.co5;

public final class te7 implements ThreadFactory	// class@002758 from classes.dex
{
    public final String a;
    public final boolean b;

    public void te7(String p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Thread newThread(Runnable p0){
       te7 ta = this.a;
       co5.o(ta, "$name");
       Thread thread = new Thread(p0, ta);
       thread.setDaemon(this.b);
       return thread;
    }
}
