package p.ao5;
import com.spotify.clientfoundations.cosmos.cosmos.ResolveCallback;
import com.spotify.clientfoundations.cosmos.cosmos.Router;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.g54;
import java.lang.Class;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import p.jx0;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import com.spotify.clientfoundations.cosmos.cosmos.Lifetime;
import java.lang.Throwable;
import p.jl;
import com.spotify.clientfoundations.cosmos.cosmos.Response;

public final class ao5 implements ResolveCallback	// class@000fc2 from classes.dex
{
    public final Router a;
    public final g54 b;
    public boolean c;

    public void ao5(Router p0){
       co5.o(p0, "router");
       super();
       this.a = p0;
       this.b = new g54(20);
    }
    public final void a(){
       if (this.c != null) {
          ao5 tb = this.b;
          tb.getClass();
          ao5 ta = this.a;
          co5.o(ta, "router");
          Iterator iterator = tb.a.iterator();
          while (iterator.hasNext()) {
             jx0 ojx0 = iterator.next();
             ta.resolve(ojx0.a, ojx0.b);
          }
          tb.a.clear();
       }
       return;
    }
    public final void onError(Throwable p0){
       co5.o(p0, "throwable");
       jl.f("Could not subscribe to cosmos session state", p0);
    }
    public final void onResolved(Response p0){
       co5.o(p0, "response");
       int i = (p0.getStatus() == 200)? 1: 0;
       if (i) {
          if (this.c == null) {
             this.c = true;
             this.a();
          }
       }else {
          this.c = false;
       }
       return;
    }
}
