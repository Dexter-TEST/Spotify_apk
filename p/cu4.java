package p.cu4;
import p.zv6;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import p.zo0;

public final class cu4 implements zv6	// class@00127c from classes.dex
{
    public final Observable a;
    public final int b;
    public final long c;
    public final TimeUnit t;
    public final Scheduler v;
    public final boolean w;

    public void cu4(Observable p0,int p1,long p2,TimeUnit p3,Scheduler p4,boolean p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
    }
    public final Object get(){
       return this.a.replay(this.b, this.c, this.t, this.v, this.w);
    }
}
