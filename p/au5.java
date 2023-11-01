package p.au5;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import p.bu5;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import java.lang.Object;
import io.reactivex.rxjava3.core.ObservableEmitter;
import p.fw5;
import p.s9;
import p.hs0;
import android.os.Handler;
import java.lang.String;
import java.util.Map;
import p.xt5;
import p.yt5;
import com.spotify.base.java.logging.Logger;
import com.spotify.clientfoundations.cosmos.cosmos.Lifetime;
import java.lang.Class;
import p.yn5;
import com.spotify.clientfoundations.cosmos.cosmos.ResolveCallback;
import p.kx0;
import p.zt5;
import p.tb0;
import java.lang.IllegalStateException;

public final class au5 implements ObservableOnSubscribe	// class@000ff5 from classes.dex
{
    public final bu5 a;
    public final Request b;

    public void au5(bu5 p0,Request p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void subscribe(ObservableEmitter p0){
       bu5 a;
       String action;
       String uri;
       Lifetime uNRESOLVED;
       int i = 1;
       fw5 uofw5 = new fw5(this.a.b, new s9(p0, 2, this.b), new hs0(i, p0));
       if ((a = this.a.a) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       if ((action = this.b.getAction()) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       if ((uri = this.b.getUri()) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       xt5 oxt5 = new xt5(a, uofw5, uri);
       Request request = new Request(action, uri, this.b.getHeaders(), this.b.getBody());
       _monitor_enter(a);
       action = request.getUri();
       if (a.b != null) {
          Object[] objArray = new Object[i];
          objArray[0] = action;
          Logger.e("\(Router Destroyed\) Dropping request for uri = %s", objArray);
          uNRESOLVED = Lifetime.UNRESOLVED;
          _monitor_exit(a);
       }else {
          Object[] objArray1 = new Object[i];
          objArray1[0] = action;
          Logger.e("Resolving router with uri = %s", objArray1);
          int i1 = oxt5.a();
          String.valueOf(i1);
          yt5.c.getClass();
          _monitor_exit(a);
          uNRESOLVED = new kx0(oxt5, i, a.a(request, new yn5(String.valueOf(i1), oxt5)));
       }
       p0.setCancellable(new zt5(uNRESOLVED));
       return;
    }
}
