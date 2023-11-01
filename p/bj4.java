package p.bj4;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.String;
import java.lang.Integer;
import java.lang.Math;
import p.k16;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.cj4;
import java.util.concurrent.ThreadFactory;

public final class bj4 extends Scheduler	// class@0010d7 from classes.dex
{
    public final ThreadFactory c;
    public static final k16 d;

    static {
       bj4.d = new k16(Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), "RxNewThreadScheduler", false);
    }
    public void bj4(){
       super();
       this.c = bj4.d;
    }
    public final Scheduler$Worker b(){
       return new cj4(this.c);
    }
}
