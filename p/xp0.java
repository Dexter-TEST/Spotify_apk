package p.xp0;
import p.re5;
import p.vp0;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.String;
import org.conscrypt.Conscrypt;
import java.security.Provider;
import java.lang.Object;
import p.co5;
import javax.net.ssl.SSLSocket;
import java.util.List;
import java.util.ArrayList;
import p.ir2;
import java.lang.NullPointerException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.KeyManager;
import java.security.SecureRandom;
import javax.net.ssl.TrustManagerFactory;
import java.security.KeyStore;
import p.wp0;
import org.conscrypt.ConscryptHostnameVerifier;
import java.util.Arrays;
import java.lang.IllegalStateException;

public final class xp0 extends re5	// class@0003c5 from classes2.dex
{
    public final Provider c;
    public static final boolean d;

    static {
       boolean b = false;
       try{
          Class.forName("org.conscrypt.Conscrypt$Version", b, vp0.class.getClassLoader());
          if (Conscrypt.isAvailable() && vp0.a()) {
             b = true;
          }
          xp0.d = e0;
       }catch(java.lang.NoClassDefFoundError e0){
       }catch(java.lang.ClassNotFoundException e0){
       }
    }
    public void xp0(){
       super();
       Provider provider = Conscrypt.newProvider();
       co5.l(provider, "newProvider\(\)");
       this.c = provider;
    }
    public final void d(SSLSocket p0,String p1,List p2){
       Object[] objArray;
       co5.o(p2, "protocols");
       if (Conscrypt.isConscrypt(p0)) {
          Conscrypt.setUseSessionTickets(p0, true);
          String[] stringArray = new String[0];
          if ((objArray = ir2.c(p2).toArray(stringArray)) != null) {
             Conscrypt.setApplicationProtocols(p0, objArray);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
          }
       }else {
          super.d(p0, p1, p2);
       }
       return;
    }
    public final String f(SSLSocket p0){
       String applicationP = (Conscrypt.isConscrypt(p0))? Conscrypt.getApplicationProtocol(p0): null;
       return applicationP;
    }
    public final SSLContext k(){
       SSLContext instance = SSLContext.getInstance("TLS", this.c);
       co5.l(instance, "getInstance\(\"TLS\", provider\)");
       return instance;
    }
    public final SSLSocketFactory l(X509TrustManager p0){
       SSLContext sSLContext = this.k();
       TrustManager[] trustManager = new TrustManager[]{p0};
       sSLContext.init(null, trustManager, null);
       SSLSocketFactory socketFactor = sSLContext.getSocketFactory();
       co5.l(socketFactor, "newSSLContext\(\).apply {\n…null\)\n    }.socketFactory");
       return socketFactor;
    }
    public final X509TrustManager m(){
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
             Conscrypt.setHostnameVerifier(oobject, wp0.a);
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
}
