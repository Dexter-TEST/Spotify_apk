package p.vz;
import p.ry7;
import p.x97;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.List;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.ArrayList;
import java.security.cert.X509Certificate;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.Iterator;
import java.lang.NullPointerException;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class vz extends ry7	// class@000395 from classes2.dex
{
    public final x97 M;

    public void vz(x97 p0){
       co5.o(p0, "trustRootIndex");
       super();
       this.M = p0;
    }
    public final List c(String p0,List p1){
       X509Certificate x509Certific1;
       Object obj1;
       int i3;
       co5.o(p1, "chain");
       co5.o(p0, "hostname");
       ArrayDeque uArrayDeque = new ArrayDeque(p1);
       ArrayList uArrayList = new ArrayList();
       Object obj = uArrayDeque.removeFirst();
       co5.l(obj, "queue.removeFirst\(\)");
       uArrayList.add(obj);
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i >= 9) {
             throw new SSLPeerUnverifiedException(co5.K(uArrayList, "Certificate chain too long: "));
          }
          i = i + 1;
          int i2 = uArrayList.size() - 1;
          X509Certificate x509Certific = uArrayList.get(i2);
          if ((x509Certific1 = this.M.a(x509Certific)) != null) {
             if (uArrayList.size() > 1 || !co5.c(x509Certific, x509Certific1)) {
                uArrayList.add(x509Certific1);
             }
             if (!co5.c(x509Certific1.getIssuerDN(), x509Certific1.getSubjectDN())) {
                i1 = 0;
             }else {
                try{
                   x509Certific1.verify(x509Certific1.getPublicKey());
                   i1 = 1;
                }catch(java.security.GeneralSecurityException e0){
                }
             }
             if (i1) {
                break ;
             }else {
                i1 = 1;
             }
          }else {
             Iterator iterator = uArrayDeque.iterator();
             co5.l(iterator, "queue.iterator\(\)");
             while (true) {
                if (iterator.hasNext()) {
                   if ((obj1 = iterator.next()) == null) {
                      throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                   }
                   if (!co5.c(x509Certific.getIssuerDN(), obj1.getSubjectDN())) {
                      i3 = 0;
                   }else {
                      try{
                         x509Certific.verify(obj1.getPublicKey());
                         i3 = 1;
                      }catch(java.security.GeneralSecurityException e0){
                      }
                   }
                   if (i3) {
                      iterator.remove();
                      uArrayList.add(obj1);
                   }else {
                      continue ;
                   }
                }else if(i1){
                   return uArrayList;
                }else {
                   throw new SSLPeerUnverifiedException(co5.K(x509Certific, "Failed to find a trusted cert that signed "));
                }
             }
             return uArrayList;
          }
       }
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
       }else if(p0 instanceof vz && co5.c(p0.M, this.M)){
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return this.M.hashCode();
    }
}
