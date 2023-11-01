package p.zn5;
import p.yt5;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import p.ao5;
import com.spotify.clientfoundations.cosmos.cosmos.Lifetime;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import com.spotify.clientfoundations.cosmos.cosmos.ResolveCallback;
import java.lang.String;
import java.lang.Object;
import p.av6;
import p.yn5;
import java.util.Map;
import com.spotify.clientfoundations.cosmos.cosmos.Router;
import java.lang.Class;
import p.jx0;
import p.g54;
import java.util.concurrent.ConcurrentLinkedQueue;
import p.kx0;
import java.lang.IllegalStateException;
import p.co5;
import com.spotify.base.java.logging.Logger;

public final class zn5 extends yt5	// class@002f30 from classes.dex
{
    public final ao5 d;
    public Lifetime e;
    public boolean f;

    public void zn5(NativeRouter p0,ao5 p1){
       super(p0);
       this.e = Lifetime.UNRESOLVED;
       this.d = p1;
    }
    public final Lifetime a(Request p0,ResolveCallback p1){
       yn5 oyn5;
       Map headers;
       String uri;
       int i = 1;
       String str = "sp://session/v1";
       int i1 = ("DELETE".equals(p0.getAction()) && av6.i0(p0.getUri(), str, false))? 1: 0;
       zn5 td = this.d;
       if (i1 && td.c != null) {
          td.c = false;
          oyn5 = new yn5(p1, td);
       }
       if (this.f == null || td.c == null) {
          if ((headers = p0.getHeaders()) != null) {
             String str1 = "force-request";
             if (headers.containsKey(str1) && av6.i0(headers.get(str1), "true", false)) {
             label_0079 :
                i = 0;
             label_007a :
                if (i) {
                   td.getClass();
                   ao5 b = td.b;
                   b.getClass();
                   jx0 ojx0 = new jx0(p0, oyn5);
                   b.a.add(ojx0);
                   return new kx0(b, false, ojx0);
                }
             }
          }
          if ((uri = p0.getUri()) != null) {
             if (!"sp://orbitsession/v1/state".equals(uri) && (!av6.D0(uri, str, false) && (!av6.D0(uri, "sp://client-token/v1", false) && !av6.D0(uri, "sp://esperanto/spotify.connectivity.auth.login5.esperanto.proto.Login5/", false)))) {
                goto label_007a ;
             }else {
                goto label_0079 ;
             }
          }else {
             throw new IllegalStateException("Required value was null.".toString());
          }
       }
       return this.a.resolve(p0, oyn5);
    }
    public synchronized final void b(){
       Lifetime lifetime;
       if (this.b != null) {
          throw new IllegalStateException("\(Router Destroyed\) Unable to perform onNativeRouterIntialized");
       }
       zn5 td = this.d;
       co5.o(td, "wrapper");
       if ((lifetime = this.a.resolve(new Request("SUB", "sp://session/v1"), td)) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       this.e = lifetime;
       Object[] objArray = new Object[0];
       Logger.e("onNativeRouterInitialized", objArray);
       return;
    }
}
