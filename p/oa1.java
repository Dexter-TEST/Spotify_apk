package p.oa1;
import p.ys6;
import p.wh2;
import io.reactivex.rxjava3.core.Scheduler;
import p.ra1;
import java.lang.Object;
import p.fn0;

public final class oa1 implements ys6	// class@0020dd from classes.dex
{
    public final wh2 a;
    public final Scheduler b;
    public final ra1 c;
    public final fn0 d;

    public void oa1(wh2 p0,Scheduler p1,ra1 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new fn0();
    }
    public synchronized final void a(){
       this.a.b = false;
    }
}
