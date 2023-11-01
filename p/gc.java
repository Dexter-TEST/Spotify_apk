package p.gc;
import p.ry7;
import javax.net.ssl.X509TrustManager;
import android.net.http.X509TrustManagerExtensions;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import p.co5;
import java.security.cert.X509Certificate;
import java.util.Collection;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.lang.Throwable;
import java.lang.NullPointerException;
import java.lang.System;

public final class gc extends ry7	// class@00020c from classes2.dex
{
    public final X509TrustManager M;
    public final X509TrustManagerExtensions N;

    public void gc(X509TrustManager p0,X509TrustManagerExtensions p1){
       super();
       this.M = p0;
       this.N = p1;
    }
    public final List c(String p0,List p1){
       Object[] objArray;
       co5.o(p1, "chain");
       co5.o(p0, "hostname");
       X509Certificate[] x509Certific = new X509Certificate[0];
       if ((objArray = p1.toArray(x509Certific)) == null) {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
       }
       try{
          List list = this.N.checkServerTrusted(objArray, "RSA", p0);
          co5.l(list, "x509TrustManagerExtensio…ficates, \"RSA\", hostname\)");
          return list;
       }catch(java.security.cert.CertificateException e3){
          SSLPeerUnverifiedException sSLPeerUnver = new SSLPeerUnverifiedException(e3.getMessage());
          sSLPeerUnver.initCause(e3);
          throw sSLPeerUnver;
       }
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof gc && p0.M == this.M)? true: false;
       return b;
    }
    public final int hashCode(){
       return System.identityHashCode(this.M);
    }
}
