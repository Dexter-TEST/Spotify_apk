package p.fu4;
import p.zv6;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import p.zo0;

public final class fu4 implements zv6	// class@00163d from classes.dex
{
    public final Observable a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;
    public final boolean v;

    public void fu4(Observable p0,long p1,TimeUnit p2,Scheduler p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final Object get(){
       return this.a.replay(this.b, this.c, this.t, this.v);
    }
}
