package p.px6;
import p.xk5;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

public final class px6 implements xk5	// class@0022ef from classes.dex
{
    public final int a;
    public final Scheduler b;

    public void px6(Scheduler p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       px6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new SchedulerWorkRunner(tb);
       }
       return new SchedulerWorkRunner(tb);
    }
}
