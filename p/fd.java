package p.fd;
import p.x97;
import javax.net.ssl.X509TrustManager;
import java.lang.reflect.Method;
import java.lang.Object;
import java.security.cert.X509Certificate;
import java.lang.String;
import p.co5;
import java.security.cert.TrustAnchor;
import java.lang.NullPointerException;
import java.lang.AssertionError;
import java.lang.Throwable;
import java.lang.StringBuilder;

public final class fd implements x97	// class@0001ef from classes2.dex
{
    public final X509TrustManager a;
    public final Method b;

    public void fd(X509TrustManager p0,Method p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final X509Certificate a(X509Certificate p0){
       String str = "cert";
       try{
          co5.o(p0, str);
          Object[] objArray = new Object[]{p0};
          if ((p0 = this.b.invoke(this.a, objArray)) != null) {
             p0 = p0.getTrustedCert();
          }else {
             throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
          }
       }catch(java.lang.IllegalAccessException e5){
          throw new AssertionError("unable to get issues and signature", e5);
       }catch(java.lang.reflect.InvocationTargetException e0){
          p0 = null;
       }
       return p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof fd) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return "CustomTrustRootIndex\(trustManager="+this.a+", findByIssuerAndSignatureMethod="+this.b+')';
    }
}
