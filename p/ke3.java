package p.ke3;
import p.re5;
import p.ir2;
import java.lang.reflect.Method;
import java.lang.Class;
import javax.net.ssl.SSLSocket;
import java.lang.Object;
import java.lang.AssertionError;
import java.lang.String;
import java.lang.Throwable;
import java.util.List;
import p.co5;
import java.util.ArrayList;
import java.lang.ClassLoader;
import p.je3;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.NullPointerException;

public final class ke3 extends re5	// class@00027e from classes2.dex
{
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class f;
    public final Class g;
    public static final ir2 h;

    static {
       ke3.h = new ir2(9, 0);
    }
    public void ke3(Method p0,Method p1,Method p2,Class p3,Class p4){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
    }
    public final void a(SSLSocket p0){
       String str = "failed to remove ALPN";
       try{
          Object[] objArray = new Object[]{p0};
          this.e.invoke(null, objArray);
          return;
       }catch(java.lang.IllegalAccessException e5){
          throw new AssertionError(str, e5);
       }catch(java.lang.reflect.InvocationTargetException e5){
          throw new AssertionError(str, e5);
       }
    }
    public final void d(SSLSocket p0,String p1,List p2){
       co5.o(p2, "protocols");
       ArrayList uArrayList = ir2.c(p2);
       try{
          Class[] uClassArray = new Class[]{this.f,this.g};
          Object[] objArray = new Object[]{p0,Proxy.newProxyInstance(re5.class.getClassLoader(), uClassArray, new je3(uArrayList))};
          this.c.invoke(null, objArray);
          return;
       }catch(java.lang.reflect.InvocationTargetException e7){
          throw new AssertionError(p1, e7);
       }catch(java.lang.IllegalAccessException e7){
          throw new AssertionError(p1, e7);
       }
    }
    public final String f(SSLSocket p0){
       InvocationHandler invocationHa;
       je3 b;
       String str = "failed to get ALPN selected protocol";
       try{
          Object[] objArray = new Object[]{p0};
          je3 oje3 = null;
          if ((invocationHa = Proxy.getInvocationHandler(this.d.invoke(oje3, objArray))) == null) {
             throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
          }
          if ((b = invocationHa.b) == null && invocationHa.c == null) {
             re5.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", oje3);
             return oje3;
          }else if(b != null){
             oje3 = invocationHa.c;
          }
          return oje3;
       }catch(java.lang.reflect.InvocationTargetException e5){
          throw new AssertionError(str, e5);
       }catch(java.lang.IllegalAccessException e5){
          throw new AssertionError(str, e5);
       }
    }
}
