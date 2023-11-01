package p.k50;
import p.re5;
import p.ir2;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.String;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import java.security.Provider;
import javax.net.ssl.SSLSocket;
import java.util.List;
import java.lang.Object;
import p.co5;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import java.util.ArrayList;
import java.lang.NullPointerException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.TrustManagerFactory;
import java.security.KeyStore;
import javax.net.ssl.TrustManager;
import java.util.Arrays;
import java.lang.IllegalStateException;

public final class k50 extends re5	// class@000270 from classes2.dex
{
    public final Provider c;
    public static final ir2 d;
    public static final boolean e;

    static {
       boolean i = 0;
       ir2 oir2 = new ir2(8, i);
       try{
          k50.d = oir2;
          Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", i, ir2.class.getClassLoader());
          i = true;
          k50.e = i;
       }catch(java.lang.ClassNotFoundException e0){
       }
    }
    public void k50(){
       super();
       this.c = new BouncyCastleJsseProvider();
    }
    public final void d(SSLSocket p0,String p1,List p2){
       Object[] objArray;
       co5.o(p2, "protocols");
       if (p0 instanceof BCSSLSocket) {
          BCSSLParameters parameters = p0.getParameters();
          String[] stringArray = new String[0];
          if ((objArray = ir2.c(p2).toArray(stringArray)) != null) {
             parameters.setApplicationProtocols(objArray);
             p0.setParameters(parameters);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
          }
       }else {
          super.d(p0, p1, p2);
       }
       return;
    }
    public final String f(SSLSocket p0){
       String applicationP;
       if (p0 instanceof BCSSLSocket) {
          int i = ((applicationP = p0.getApplicationProtocol()) == null)? 1: co5.c(applicationP, "");
          if (!i) {
          label_0017 :
             return applicationP;
          }
       }
       applicationP = null;
       goto label_0017 ;
    }
    public final SSLContext k(){
       SSLContext instance = SSLContext.getInstance("TLS", this.c);
       co5.l(instance, "getInstance\(\"TLS\", provider\)");
       return instance;
    }
    public final X509TrustManager m(){
       object oobject;
       TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
}
