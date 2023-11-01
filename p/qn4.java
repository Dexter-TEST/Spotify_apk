package p.qn4;
import java.net.ProxySelector;
import java.net.URI;
import java.net.SocketAddress;
import java.io.IOException;
import java.util.List;
import java.net.Proxy;
import java.lang.Object;
import p.ye7;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class qn4 extends ProxySelector	// class@000310 from classes2.dex
{
    public static final qn4 a;

    static {
       qn4.a = new qn4();
    }
    public void qn4(){
       super();
    }
    public final void connectFailed(URI p0,SocketAddress p1,IOException p2){
    }
    public final List select(URI p0){
       if (p0 != null) {
          return ye7.J(Proxy.NO_PROXY);
       }
       throw new IllegalArgumentException("uri must not be null".toString());
    }
}
