package p.sb;
import p.xk5;
import p.ub;
import java.lang.Object;
import p.er7;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

public final class sb implements xk5	// class@0025fb from classes.dex
{
    public final int a;
    public final ub b;

    public void sb(ub p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final er7 a(){
       sb tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new SchedulerWorkRunner(tb.f);
       }
       return new SchedulerWorkRunner(tb.e);
    }
    public final Object get(){
       switch (this.a){
           case 0:
           default:
             return this.a();
       }
       return this.a();
    }
}
