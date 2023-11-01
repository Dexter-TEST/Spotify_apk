package p.gw4;
import p.aw4;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import p.dw4;
import p.hw4;

public final class gw4 implements aw4	// class@001791 from classes.dex
{
    public final int a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;
    public final boolean v;

    public void gw4(int p0,long p1,TimeUnit p2,Scheduler p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final dw4 call(){
       hw4 v7 = new hw4(this.a, this.b, this.c, this.t, this.v);
       return v7;
    }
}
