package p.re5;
import p.ir2;
import p.ad;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.String;
import java.util.logging.Logger;
import java.util.concurrent.CopyOnWriteArraySet;
import android.util.Log;
import java.util.logging.Level;
import p.bd;
import java.util.logging.Handler;
import p.dc;
import p.gd;
import p.co5;
import java.security.Provider;
import java.security.Security;
import p.xp0;
import p.k50;
import p.e45;
import p.le3;
import p.ke3;
import p.g15;
import java.lang.Class;
import java.lang.Throwable;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p.ry7;
import p.vz;
import p.x97;
import p.f00;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.net.Socket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.KeyManager;
import java.security.SecureRandom;
import java.lang.AssertionError;
import javax.net.ssl.TrustManagerFactory;
import java.security.KeyStore;
import java.lang.NullPointerException;
import java.lang.IllegalStateException;

public class re5	// class@00031e from classes2.dex
{
    public static re5 a;
    public static final Logger b;

    static {
       ir2 oir2;
       Level fINE;
       re5 ore5;
       int i = 0;
       if (oir2 = new ir2(12, i)) {
          Iterator iterator = ad.b.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             String value = uEntry.getValue();
             Logger logger = Logger.getLogger(key);
             if (ad.a.add(logger)) {
                logger.setUseParentHandlers(i);
                if (Log.isLoggable(value, 3)) {
                   fINE = Level.FINE;
                }else if(Log.isLoggable(value, 4)){
                   fINE = Level.INFO;
                }else {
                   fINE = Level.WARNING;
                }
                logger.setLevel(fINE);
                logger.addHandler(bd.a);
             }
          }
          if ((ore5 = dc.d.j()) == null) {
             ore5 = gd.e.j();
             co5.i(ore5);
          }
       }else if(co5.c("Conscrypt", Security.getProviders()[i].getName())){
          ore5 = (xp0.d)? new xp0(): null;
          if (ore5 == null) {
          label_0093 :
             if (co5.c("BC", Security.getProviders()[i].getName())) {
                ore5 = (k50.d.C())? new k50(): null;
                if (ore5 == null) {
                label_00b7 :
                   if (co5.c("OpenJSSE", Security.getProviders()[i].getName())) {
                      ore5 = (e45.d.C())? new e45(): null;
                      if (ore5 == null) {
                      label_00db :
                         ore5 = (le3.c)? new le3(): null;
                         if (ore5 == null && (ore5 = ke3.h.j()) == null) {
                            ore5 = new re5();
                         }
                      }
                   }else {
                      goto label_00db ;
                   }
                }
             }else {
                goto label_00b7 ;
             }
          }
       }else {
          goto label_0093 ;
       }
       re5.a = ore5;
       re5.b = Logger.getLogger(g15.class.getName());
    }
    public void re5(){
       super();
    }
    public static void i(int p0,String p1,Throwable p2){
       co5.o(p1, "message");
       Level wARNING = (p0 == 5)? Level.WARNING: Level.INFO;
       re5.b.log(wARNING, p1, p2);
       return;
    }
    public void a(SSLSocket p0){
    }
    public ry7 b(X509TrustManager p0){
       return new vz(this.c(p0));
    }
    public x97 c(X509TrustManager p0){
       X509Certificate[] acceptedIssu = p0.getAcceptedIssuers();
       co5.l(acceptedIssu, "trustManager.acceptedIssuers");
       return new f00(Arrays.copyOf(acceptedIssu, acceptedIssu.length));
    }
    public void d(SSLSocket p0,String p1,List p2){
       co5.o(p2, "protocols");
    }
    public void e(Socket p0,InetSocketAddress p1,int p2){
       co5.o(p1, "address");
       p0.connect(p1, p2);
    }
    public String f(SSLSocket p0){
       return null;
    }
    public Object g(){
       Throwable throwable = (re5.b.isLoggable(Level.FINE))? new Throwable("response.body\(\).close\(\)"): null;
       return throwable;
    }
    public boolean h(String p0){
       co5.o(p0, "hostname");
       return true;
    }
    public void j(Object p0,String p1){
       co5.o(p1, "message");
       if (p0 == null) {
          p1 = co5.K(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger\(OkHttpClient.class.getName\(\)\).setLevel\(Level.FINE\);", p1);
       }
       re5.i(5, p1, p0);
       return;
    }
    public SSLContext k(){
       SSLContext instance = SSLContext.getInstance("TLS");
       co5.l(instance, "getInstance\(\"TLS\"\)");
       return instance;
    }
    public SSLSocketFactory l(X509TrustManager p0){
       try{
          SSLContext sSLContext = this.k();
          TrustManager[] trustManager = new TrustManager[]{p0};
          sSLContext.init(null, trustManager, null);
          SSLSocketFactory socketFactor = sSLContext.getSocketFactory();
          co5.l(socketFactor, "newSSLContext\(\).apply {\n…ll\)\n      }.socketFactory");
          return socketFactor;
       }catch(java.security.GeneralSecurityException e4){
          throw new AssertionError(co5.K(e4, "No System TLS: "), e4);
       }
    }
    public X509TrustManager m(){
       object oobject;
       TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
       instance.init(null);
       TrustManager[] trustManager = instance.getTrustManagers();
       co5.i(trustManager);
       int i = 1;
       if (trustManager.length != i || !trustManager[0] instanceof X509TrustManager) {
          i = 0;
       }
       if (i) {
          if ((oobject = trustManager[0]) != null) {
             return oobject;
          }else {
             throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
          }
       }else {
          String str = Arrays.toString(trustManager);
          co5.l(str, "toString\(this\)");
          throw new IllegalStateException(co5.K(str, "Unexpected default trust managers: ").toString());
       }
    }
    public final String toString(){
       return this.getClass().getSimpleName();
    }
}
