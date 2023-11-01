package p.k16;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.String;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.StringBuilder;
import p.j16;
import p.en6;

public final class k16 extends AtomicLong implements ThreadFactory	// class@001b8a from classes.dex
{
    public final String a;
    public final int b;
    public final boolean c;

    public void k16(int p0,String p1,boolean p2){
       super();
       this.a = p1;
       this.b = p0;
       this.c = p2;
    }
    public void k16(String p0){
       super(5, p0, false);
    }
    public final Thread newThread(Runnable p0){
       String str = this.a+'-'+this.incrementAndGet();
       j16 oj16 = (this.c != null)? new j16(p0, str): new Thread(p0, str);
       oj16.setPriority(this.b);
       oj16.setDaemon(true);
       return oj16;
    }
    public final String toString(){
       return en6.p("RxThreadFactory[", this.a, "]");
    }
}
