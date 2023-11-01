package p.se6;
import p.re6;
import p.tb6;
import p.tw0;
import p.zn5;
import java.lang.Object;
import p.yt5;
import java.lang.String;
import p.co5;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import p.rw0;
import com.spotify.clientfoundations.concurrency.asyncimpl.NativeTimerManagerThreadImpl;
import com.spotify.clientfoundations.cosmos.cosmosimpl.Scheduler;
import p.ao5;
import com.spotify.base.java.logging.Logger;
import java.lang.IllegalStateException;
import com.spotify.clientfoundations.cosmos.cosmos.Router;
import com.spotify.clientfoundations.cosmos.cosmos.Lifetime;
import p.g54;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class se6 implements re6, tb6	// class@002613 from classes.dex
{
    public final yt5 a;
    public final zn5 b;
    public final NativeRouter c;

    public void se6(tw0 p0,zn5 p1){
       super();
       this.a = p1;
       this.b = p1;
       yt5 a = p1.a;
       co5.j(a, "null cannot be cast to non-null type com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter");
       this.c = a;
       a.initializeScheduling(new rw0(p0.a));
    }
    public final void a(){
       se6 ta = this.a;
       if (!ta instanceof zn5) {
          return;
       }
       _monitor_enter(ta);
       if (ta.b != null) {
          throw new IllegalStateException("\(Router Destroyed\) Unable to perform onCoreSessionInitialized");
       }
       ta.f = true;
       ta.d.a();
       Object[] objArray = new Object[0];
       Logger.e("onCoreSessionInitialized", objArray);
       _monitor_exit(ta);
       return;
    }
    public final Object getApi(){
       return this;
    }
    public final void shutdown(){
       this.c.deinitializeScheduling();
       se6 ta = this.a;
       _monitor_enter(ta);
       if (ta.b != null) {
          throw new IllegalStateException("Router already destroyed");
       }
       ta.b = true;
       ta.a.destroy();
       _monitor_exit(ta);
       ta.f = false;
       ta.e.release();
       zn5 d = ta.d;
       d.c = false;
       d.b.a.clear();
       return;
    }
}
