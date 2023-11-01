package p.rw0;
import com.spotify.clientfoundations.cosmos.cosmosimpl.Scheduler;
import com.spotify.clientfoundations.concurrency.asyncimpl.NativeTimerManagerThreadImpl;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.clientfoundations.concurrency.async.Scheduler;
import java.lang.Runnable;

public final class rw0 implements Scheduler	// class@00256c from classes.dex
{
    public final Scheduler a;

    public void rw0(NativeTimerManagerThreadImpl p0){
       co5.o(p0, "coreThread");
       super();
       this.a = p0;
    }
    public final boolean isOnSchedulerThread(){
       return this.a.isCurrentThread();
    }
    public final void post(Runnable p0){
       co5.o(p0, "callback");
       this.a.post(p0);
    }
}
