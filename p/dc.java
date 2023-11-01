package p.dc;
import p.re5;
import p.ir2;
import android.os.Build$VERSION;
import p.dn6;
import p.ec;
import p.z81;
import p.kd;
import p.y81;
import p.zp0;
import p.l50;
import java.lang.Object;
import java.util.ArrayList;
import p.uk;
import java.util.Iterator;
import javax.net.ssl.X509TrustManager;
import p.ry7;
import android.net.http.X509TrustManagerExtensions;
import p.gc;
import p.vz;
import p.x97;
import javax.net.ssl.SSLSocket;
import java.lang.String;
import java.util.List;
import p.co5;
import android.security.NetworkSecurityPolicy;
import p.t3;
import p.v3;

public final class dc extends re5	// class@0001b3 from classes2.dex
{
    public final ArrayList c;
    public static final ir2 d;
    public static final boolean e;

    static {
       int i = 0;
       dc.d = new ir2(6, i);
       if (ir2.B() && Build$VERSION.SDK_INT >= 29) {
          i = true;
       }
       dc.e = i;
    }
    public void dc(){
       super();
       dn6[] uodn6Array = new dn6[4];
       ec uoec = (ec.a.C())? new ec(): null;
       uodn6Array[0] = uoec;
       uodn6Array[1] = new z81(kd.f);
       uodn6Array[2] = new z81(zp0.a.y());
       uodn6Array[3] = new z81(l50.a.y());
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = uk.n0(uodn6Array).iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj.c()) {
             uArrayList.add(obj);
          }
       }
       this.c = uArrayList;
       return;
    }
    public final ry7 b(X509TrustManager p0){
       X509TrustManagerExtensions x509TrustMan;
       ry7 ory7 = null;
       try{
          x509TrustMan = new X509TrustManagerExtensions(p0);
       }catch(java.lang.IllegalArgumentException e0){
          x509TrustMan = e0;
       }
       if (x509TrustMan != null) {
          ory7 = new gc(p0, x509TrustMan);
       }
       if (ory7 == null) {
          ory7 = new vz(this.c(p0));
       }
       return ory7;
    }
    public final void d(SSLSocket p0,String p1,List p2){
       Object obj;
       co5.o(p2, "protocols");
       Iterator iterator = this.c.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             if (!obj.b(p0)) {
                continue ;
             }
          }else {
             obj = null;
          }
          if (obj != null) {
             obj.d(p0, p1, p2);
             break ;
          }
          break ;
       }
       return;
    }
    public final String f(SSLSocket p0){
       String str;
       String str1;
       Iterator iterator = this.c.iterator();
       while (true) {
          str = null;
          if (iterator.hasNext()) {
             str1 = iterator.next();
             if (!str1.b(p0)) {
                continue ;
             }
          }else {
             str1 = str;
          }
          if (str1 != null) {
             str = str1.a(p0);
             break ;
          }
          break ;
       }
       return str;
    }
    public final boolean h(String p0){
       co5.o(p0, "hostname");
       return v3.z(t3.b(), p0);
    }
}
