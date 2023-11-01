package p.f00;
import p.x97;
import java.security.cert.X509Certificate;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.LinkedHashMap;
import javax.security.auth.x500.X500Principal;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.security.PublicKey;
import java.security.cert.Certificate;

public final class f00 implements x97	// class@0001e8 from classes2.dex
{
    public final LinkedHashMap a;

    public void f00(X509Certificate[] p0){
       LinkedHashSet linkedHashSe;
       co5.o(p0, "caCerts");
       super();
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          i = i + 1;
          X500Principal subjectX500P = oobject.getSubjectX500Principal();
          co5.l(subjectX500P, "caCert.subjectX500Principal");
          if ((linkedHashSe = linkedHashMa.get(subjectX500P)) == null) {
             linkedHashSe = new LinkedHashSet();
             linkedHashMa.put(subjectX500P, linkedHashSe);
          }
          linkedHashSe.add(oobject);
       }
       this.a = linkedHashMa;
       return;
    }
    public final X509Certificate a(X509Certificate p0){
       co5.o(p0, "cert");
       Set set = this.a.get(p0.getIssuerX500Principal());
       X509Certificate x509Certific = null;
       if (set == null) {
          return x509Certific;
       }
       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = obj;
          try{
             p0.verify(obj1.getPublicKey());
             obj1 = 1;
          }catch(java.lang.Exception e0){
             obj1 = 0;
          }
       }
       return x509Certific;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 != this && (!p0 instanceof f00 && co5.c(p0.a, this.a)))? false: true;
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
}
