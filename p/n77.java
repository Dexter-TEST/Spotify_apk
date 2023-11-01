package p.n77;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.m77;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import p.jl1;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class n77 extends Scheduler	// class@001f83 from classes.dex
{
    public static final n77 c;

    static {
       n77.c = new n77();
    }
    public void n77(){
       super();
    }
    public final Scheduler$Worker b(){
       return new m77();
    }
    public final Disposable c(Runnable p0){
       Objects.requireNonNull(p0, "run is null");
       p0.run();
       return jl1.a;
    }
    public final Disposable d(Runnable p0,long p1,TimeUnit p2){
       try{
          p2.sleep(p1);
          Objects.requireNonNull(p0, "run is null");
          p0.run();
       }catch(java.lang.InterruptedException e1){
          Thread.currentThread().interrupt();
          RxJavaPlugins.c(e1);
       }
       return jl1.a;
    }
}
