package p.zn2;
import p.k57;
import p.kf0;
import java.util.List;
import p.wf2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.t76;
import p.ay6;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.Principal;
import java.lang.StringBuilder;

public final class zn2	// class@002f2d from classes.dex
{
    public final k57 a;
    public final kf0 b;
    public final List c;
    public final ay6 d;

    public void zn2(k57 p0,kf0 p1,List p2,wf2 p3){
       co5.o(p0, "tlsVersion");
       co5.o(p1, "cipherSuite");
       co5.o(p2, "localCertificates");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new ay6(new t76(p3, 1));
    }
    public final List a(){
       return this.d.getValue();
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof zn2 && (p0.a == this.a && (co5.c(p0.b, this.b) && (co5.c(p0.a(), this.a()) && co5.c(p0.c, this.c)))))? true: false;
       return b;
    }
    public final int hashCode(){
       return (this.c.hashCode() + ((this.a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31));
    }
    public final String toString(){
       String str;
       String str2;
       List list = this.a();
       ArrayList uArrayList = new ArrayList(aj0.b0(list));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Certificate uCertificate = iterator.next();
          if (uCertificate instanceof X509Certificate) {
             str = uCertificate.getSubjectDN().toString();
          }else {
             str = uCertificate.getType();
             co5.l(str, "type");
          }
          uArrayList.add(str);
       }
       StringBuilder str1 = "Handshake{tlsVersion="+this.a+" cipherSuite="+this.b+" peerCertificates="+uArrayList.toString()+" localCertificates=";
       zn2 tc = this.c;
       ArrayList uArrayList1 = new ArrayList(aj0.b0(tc));
       Iterator iterator1 = tc.iterator();
       while (iterator1.hasNext()) {
          Certificate uCertificate1 = iterator1.next();
          if (uCertificate1 instanceof X509Certificate) {
             str2 = uCertificate1.getSubjectDN().toString();
          }else {
             str2 = uCertificate1.getType();
             co5.l(str2, "type");
          }
          uArrayList1.add(str2);
       }
       return str1+uArrayList1+'}';
    }
}
