package p.id;
import p.rz1;
import java.lang.Object;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.RuntimeException;
import p.iw1;

public abstract class id	// class@001974 from classes.dex
{
    public static final Scheduler a;

    static {
       Scheduler scheduler;
       if ((scheduler = new rz1(1).call()) != null) {
          id.a = scheduler;
       }
       throw new NullPointerException("Scheduler Callable returned null");
    }
    public static Scheduler a(){
       Scheduler a;
       if ((a = id.a) != null) {
          return a;
       }
       throw new NullPointerException("scheduler == null");
    }
}
