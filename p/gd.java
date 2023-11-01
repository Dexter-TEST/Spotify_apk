package p.gd;
import p.re5;
import p.ir2;
import android.os.Build$VERSION;
import p.dn6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.vq6;
import java.lang.Throwable;
import p.z81;
import p.kd;
import p.y81;
import p.zp0;
import p.l50;
import java.util.ArrayList;
import p.uk;
import java.util.Iterator;
import java.lang.reflect.Method;
import p.ch0;
import javax.net.ssl.X509TrustManager;
import p.ry7;
import android.net.http.X509TrustManagerExtensions;
import p.gc;
import p.vz;
import p.x97;
import java.security.cert.X509Certificate;
import java.lang.reflect.AccessibleObject;
import p.fd;
import javax.net.ssl.SSLSocket;
import java.util.List;
import java.net.Socket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.io.IOException;
import android.security.NetworkSecurityPolicy;
import p.t3;
import p.v3;

public final class gd extends re5	// class@00020d from classes2.dex
{
    public final ArrayList c;
    public final ch0 d;
    public static final ir2 e;
    public static final boolean f;

    static {
       int i = 0;
       gd.e = new ir2(7, i);
       if (!ir2.B()) {
       }else if(Build$VERSION.SDK_INT >= 30){
          i = true;
       }
       gd.f = i;
    }
    public void gd(){
       int i;
       vq6 ovq6;
       Class[] obj;
       Method method1;
       Method method2;
       Method method3;
       super();
       dn6[] uodn6Array = new dn6[4];
       String str = "com.android.org.conscrypt";
       try{
          i = 0;
          ovq6 = new vq6(Class.forName(co5.K(".OpenSSLSocketImpl", str)), Class.forName(co5.K(".OpenSSLSocketFactoryImpl", str)), Class.forName(co5.K(".SSLParametersImpl", str)));
       }catch(java.lang.Exception e1){
          re5.a.getClass();
          re5.i(5, "unable to load android socket classes", e1);
          ovq6 = i;
       }
       int i1 = 0;
       uodn6Array[i1] = ovq6;
       int i2 = 1;
       uodn6Array[i2] = new z81(kd.f);
       uodn6Array[2] = new z81(zp0.a.y());
       uodn6Array[3] = new z81(l50.a.y());
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = uk.n0(uodn6Array).iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (obj.c()) {
             uArrayList.add(obj);
          }
       }
       this.c = uArrayList;
       try{
          Class uClass = Class.forName("dalvik.system.CloseGuard");
          obj = new Class[i1];
          Method method = uClass.getMethod("get", obj);
          Class[] uClassArray = new Class[i2];
          uClassArray[i1] = String.class;
          method1 = uClass.getMethod("open", uClassArray);
          Class[] uClassArray1 = new Class[i1];
          method2 = uClass.getMethod("warnIfOpen", uClassArray1);
          method3 = method;
       }catch(java.lang.Exception e0){
          method2 = method3;
          method1 = method2;
       }
       this.d = new ch0(method3, method1, method2);
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
    public final x97 c(X509TrustManager p0){
       fd uofd;
       try{
          Class[] uClassArray = new Class[]{X509Certificate.class};
          Method declaredMeth = p0.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", uClassArray);
          declaredMeth.setAccessible(1);
          uofd = new fd(p0, declaredMeth);
       }catch(java.lang.NoSuchMethodException e0){
          uofd = super.c(p0);
       }
       return uofd;
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
    public final void e(Socket p0,InetSocketAddress p1,int p2){
       try{
          co5.o(p1, "address");
          p0.connect(p1, p2);
          return;
       }catch(java.lang.ClassCastException e2){
          if (Build$VERSION.SDK_INT == 26) {
             throw new IOException("Exception in connect", e2);
          }
          throw e2;
       }
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
    public final Object g(){
       ch0 a;
       gd td = this.d;
       td.getClass();
       Object obj = null;
       if ((a = td.a) != null) {
          int i = 0;
          try{
             Object[] objArray = new Object[i];
             Object obj1 = a.invoke(obj, objArray);
             ch0 b = td.b;
             co5.i(b);
             objArray = new Object[]{"response.body\(\).close\(\)"};
             b.invoke(obj1, objArray);
             obj = obj1;
          }catch(java.lang.Exception e0){
          }
       }
       return obj;
    }
    public final boolean h(String p0){
       int sDK_INT;
       boolean b;
       co5.o(p0, "hostname");
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 24) {
          b = p0.z(t3.b(), p0);
       }else if(sDK_INT >= 23){
          b = t3.h(t3.b());
       }else {
          b = true;
       }
       return b;
    }
    public final void j(Object p0,String p1){
       co5.o(p1, "message");
       gd td = this.d;
       td.getClass();
       int i = 0;
       if (p0 != null) {
          try{
             ch0 c = td.c;
             co5.i(c);
             Object[] objArray = new Object[i];
             c.invoke(p0, objArray);
             i = 1;
          }catch(java.lang.Exception e0){
          }
       }
       if (!i) {
          re5.i(5, p1, null);
       }
       return;
    }
}
