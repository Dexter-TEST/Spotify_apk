package p.np5;
import p.jr2;
import p.op5;
import p.mz5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.ArrayList;
import p.g15;
import java.io.IOException;
import java.net.Proxy$Type;
import java.net.Proxy;
import p.y7;
import java.net.URI;
import p.ps2;
import java.net.SocketAddress;
import java.net.ProxySelector;
import p.hj2;
import java.util.Set;
import p.tr2;
import p.qc6;
import p.zr2;
import p.mo1;
import p.lp5;
import p.i70;
import p.jp0;
import java.util.List;
import p.ip0;
import p.re5;
import p.nz5;
import java.net.UnknownServiceException;
import p.tp2;
import p.sm5;
import java.net.ProtocolException;
import java.lang.System;
import java.net.Socket;
import p.we7;
import java.lang.Throwable;
import p.io2;
import java.io.InterruptedIOException;
import javax.net.ssl.SSLHandshakeException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLException;
import java.lang.IllegalStateException;
import p.mp5;
import java.lang.Enum;
import javax.net.SocketFactory;
import java.lang.Class;
import java.net.InetSocketAddress;
import p.on;
import p.xe7;
import p.nn6;
import p.hp5;
import p.nn;
import p.el6;
import p.gp5;
import java.net.ConnectException;
import p.zu5;
import p.fv5;
import p.bv5;
import p.ax5;
import p.gg1;
import p.sm2;
import p.cx5;
import p.eq;
import java.lang.StringBuilder;
import p.er2;
import p.g70;
import p.f70;
import p.b57;
import java.util.concurrent.TimeUnit;
import p.mp2;
import p.br2;
import p.av6;
import java.lang.Integer;
import p.e70;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSession;
import p.zn2;
import javax.net.ssl.HostnameVerifier;
import java.util.Collection;
import java.security.cert.X509Certificate;
import p.ld0;
import p.j80;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.Key;
import p.ir2;
import java.security.Principal;
import p.a15;
import java.lang.Iterable;
import p.dj0;
import p.ye7;
import p.ao6;
import p.k57;
import p.kf0;
import p.wf2;
import p.wc;
import java.lang.NullPointerException;
import java.util.Iterator;
import p.yp5;
import p.lw1;
import p.ur2;
import p.gr2;
import p.u07;
import p.as2;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.fr2;
import p.r07;
import p.q07;
import p.i07;

public final class np5 extends jr2	// class@0002d2 from classes2.dex
{
    public final mz5 b;
    public Socket c;
    public Socket d;
    public zn2 e;
    public sm5 f;
    public tr2 g;
    public hp5 h;
    public gp5 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public void np5(op5 p0,mz5 p1){
       co5.o(p0, "connectionPool");
       co5.o(p1, "route");
       super();
       this.b = p1;
       this.o = 1;
       this.p = new ArrayList();
       this.q = Long.MAX_VALUE;
    }
    public static void d(g15 p0,mz5 p1,IOException p2){
       co5.o(p0, "client");
       co5.o(p1, "failedRoute");
       co5.o(p2, "failure");
       if (p1.b.type() != Proxy$Type.DIRECT) {
          mz5 a = p1.a;
          a.h.connectFailed(a.i.h(), p1.b.address(), p2);
       }
       p0 = p0.U;
       _monitor_enter(p0);
       p0.a.add(p1);
       _monitor_exit(p0);
       return;
    }
    public synchronized final void a(tr2 p0,qc6 p1){
       co5.o(p0, "connection");
       co5.o(p1, "settings");
       int i = ((p1.a & 0x10))? p1.b[4]: Integer.MAX_VALUE;
       this.o = i;
       return;
    }
    public final void b(zr2 p0){
       co5.o(p0, "stream");
       p0.c(mo1.w, null);
    }
    public final void c(int p0,int p1,int p2,int p3,boolean p4,lp5 p5,i70 p6){
       int i2;
       int i3;
       np5 d1;
       nz5 onz5;
       np5 onp5 = this;
       Object obj = p5;
       Object obj1 = p6;
       co5.o(obj, "call");
       co5.o(obj1, "eventListener");
       int i = (onp5.f == null)? 1: 0;
       if (i) {
          y7 k = onp5.b.a.k;
          jp0 ojp0 = new jp0(k);
          mz5 a = onp5.b.a;
          if (a.c == null) {
             if (k.contains(ip0.f)) {
                ps2 d = onp5.b.a.i.d;
                if (!re5.a.h(d)) {
                   throw new nz5(new UnknownServiceException(tp2.m("CLEARTEXT communication to ", d, " not permitted by network security policy")));
                }
             }else {
                throw new nz5(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
             }
          }else if(!a.j.contains(sm5.w)){
             throw new nz5(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
          }
          int i1 = 0;
          try{
          label_0078 :
             np5 b = onp5.b;
             b = (b.a.c != null && b.b.type() == Proxy$Type.HTTP)? 1: 0;
             try{
                if (b) {
                   this.f(p0, p1, p2, p5, p6);
                   if (onp5.c == null) {
                   label_00c5 :
                      b = onp5.b;
                      b = (b.a.c != null && b.b.type() == Proxy$Type.HTTP)? 1: 0;
                      if (b && onp5.c == null) {
                         throw new nz5(new ProtocolException("Too many tunnel connections attempted: 21"));
                      }else {
                         onp5.q = System.nanoTime();
                         return;
                      }
                   }else {
                      i2 = p1;
                   }
                }else {
                   int i4 = p0;
                   i2 = p1;
                   onp5.e(i4, i2, obj, obj1);
                }
                i3 = p3;
                onp5.g(ojp0, i3, obj, obj1);
                b = onp5.b;
                co5.o(b.c, "inetSocketAddress");
                co5.o(b.b, "proxy");
                goto label_00c5 ;
             }catch(java.io.IOException e0){
             }catch(java.io.IOException e0){
             }
             if ((d1 = onp5.d) != null) {
                we7.e(d1);
             }
             if ((d1 = onp5.c) != null) {
                we7.e(d1);
             }
             onp5.d = null;
             onp5.c = null;
             onp5.h = null;
             onp5.i = null;
             onp5.e = null;
             onp5.f = null;
             onp5.g = null;
             onp5.o = 1;
             d1 = onp5.b;
             co5.o(d1.c, "inetSocketAddress");
             co5.o(d1.b, "proxy");
             if (!i1) {
                onz5 = new nz5(e0);
             }else {
                io2.a(i1.a, e0);
                i1.b = e0;
             }
             if (p4) {
                ojp0.d = true;
                b = (ojp0.c == null || (e0 instanceof ProtocolException || (e0 instanceof InterruptedIOException || (e0 instanceof SSLHandshakeException && (e0.getCause() instanceof CertificateException || (e0 instanceof SSLPeerUnverifiedException || !e0 instanceof SSLException))))))? 0: 1;
                if (b) {
                   goto label_0078 ;
                }
             }
             throw onz5;
          }catch(java.io.IOException e0){
             i2 = p1;
          }
          i3 = p3;
       }else {
          throw new IllegalStateException("already connected".toString());
       }
    }
    public final void e(int p0,int p1,lp5 p2,i70 p3){
       Socket socket;
       int i;
       np5 tb = this.b;
       mz5 b = tb.b;
       mz5 a = tb.a;
       Proxy$Type type = ((type = b.type()) == null)? -1: mp5.a[type.ordinal()];
       if (type != 1 && type != 2) {
          socket = new Socket(b);
       }else {
          socket = a.b.createSocket();
          co5.i(socket);
       }
       this.c = socket;
       p3.getClass();
       co5.o(p2, "call");
       co5.o(this.b.c, "inetSocketAddress");
       try{
          socket.setSoTimeout(p1);
          re5 a1 = re5.a;
          mz5 c = this.b.c;
          try{
             a1.e(socket, c, p0);
             this.h = xe7.f(xe7.e0(socket));
             this.i = xe7.d(xe7.b0(socket));
          }catch(java.lang.NullPointerException e5){
             if (!co5.c(e5.getMessage(), "throw with null exception")) {
             }else {
                throw new IOException(e5);
             }
          }
          return;
       }catch(java.net.ConnectException e5){
          ConnectException uConnectExce = new ConnectException(co5.K(this.b.c, "Failed to connect to "));
          uConnectExce.initCause(e5);
          throw uConnectExce;
       }
    }
    public final void f(int p0,int p1,int p2,lp5 p3,i70 p4){
       bv5 uobv51;
       cx5 t;
       bv5 uobv53;
       np5 c;
       np5 onp5 = this;
       int i = p1;
       lp5 olp5 = p3;
       zu5 ozu5 = new zu5();
       np5 b = onp5.b;
       y7 i1 = b.a.i;
       co5.o(i1, "url");
       ozu5.a = i1;
       fv5 uofv5 = null;
       ozu5.e("CONNECT", uofv5);
       mz5 a = b.a;
       boolean b1 = true;
       ozu5.d("Host", we7.w(a.i, b1));
       ozu5.d("Proxy-Connection", "Keep-Alive");
       ozu5.d("User-Agent", "okhttp/4.10.0");
       bv5 uobv5 = ozu5.b();
       ax5 uoax5 = new ax5();
       uoax5.a = uobv5;
       uoax5.b = sm5.c;
       uoax5.c = 407;
       uoax5.d = "Preemptive Authenticate";
       uoax5.g = we7.c;
       long l = -1;
       uoax5.k = l;
       uoax5.l = l;
       ax5 f = uoax5.f;
       f.getClass();
       String str = "Proxy-Authenticate";
       gg1.j(str);
       String str1 = "OkHttp-Preemptive";
       gg1.l(str1, str);
       f.g(str);
       f.d(str, str1);
       if ((uobv51 = a.f.d(b, uoax5.a())) == null) {
       }else {
          uobv5 = uobv51;
       }
       bv5 uobv52 = uobv5;
       int i2 = 0;
       while (i2 < 21) {
          i2 = i2 + 1;
          onp5.e(p0, i, olp5, p4);
          String str2 = "CONNECT ".append(we7.w(uobv5.a, b1)).append(" HTTP/1.1").toString();
          while (true) {
             np5 h = onp5.h;
             co5.i(h);
             np5 i3 = onp5.i;
             co5.i(i3);
             TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
             h.e().g((long)i, mILLISECONDS);
             i3.e().g((long)p2, mILLISECONDS);
             er2 uoer2 = new er2(uofv5, onp5, h, i3);
             uoer2.j(uobv52.c, str2);
             uoer2.b();
             ax5 uoax51 = uoer2.g(false);
             co5.i(uoax51);
             uoax51.a = uobv52;
             cx5 uocx5 = uoax51.a();
             long l1 = we7.k(uocx5);
             if (!(l1 - -1)) {
             label_00fb :
                if ((t = uocx5.t) != 200) {
                   if (t == 407) {
                      if ((uobv53 = a.f.d(b, uocx5)) != null) {
                         if (!av6.i0("close", cx5.f(uocx5, "Connection"), true)) {
                            i = p1;
                            uobv52 = uobv53;
                            uofv5 = null;
                            uobv53 = 1;
                         }
                      }else {
                         throw new IOException("Failed to authenticate with proxy");
                      }
                   }else {
                      throw new IOException(co5.K(Integer.valueOf(t), "Unexpected response code for CONNECT: "));
                   }
                }else if(h.b.F() && i3.b.F()){
                   uobv53 = null;
                }else {
                   throw new IOException("TLS tunnel buffered too many bytes!");
                }
                if (uobv53 == null) {
                   break ;
                }else if((c = onp5.c) == null){
                   we7.e(c);
                }
                onp5.c = null;
                onp5.i = null;
                onp5.h = null;
                co5.o(olp5, "call");
                co5.o(b.c, "inetSocketAddress");
                co5.o(b.b, "proxy");
                i = p1;
                uobv52 = uobv53;
                uofv5 = null;
                b1 = true;
                c = 407;
             }else {
                br2 uobr2 = uoer2.i(l1);
                we7.u(uobr2, Integer.MAX_VALUE, mILLISECONDS);
                uobr2.close();
                goto label_00fb ;
             }
          }
          return;
       }
    }
    public final void g(jp0 p0,int p1,lp5 p2,i70 p3){
       Socket socket;
       mz5 a = this.b.a;
       sm5 c = sm5.c;
       if (a.c == null) {
          sm5 w = sm5.w;
          if (a.j.contains(w)) {
             this.d = this.c;
             this.f = w;
             this.m(p1);
             return;
          }else {
             this.d = this.c;
             this.f = c;
             return;
          }
       }else {
          p3.getClass();
          co5.o(p2, "call");
          String str = "\n              |Hostname ";
          String str1 = "Hostname ";
          a = this.b.a;
          y7 c1 = a.c;
          String str2 = null;
          co5.i(c1);
          y7 i = a.i;
          boolean b = true;
          if ((socket = c1.createSocket(this.c, i.d, i.e, b)) == null) {
             throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
          }
          ip0 oip0 = p0.a(socket);
          if (oip0.b != null) {
             re5.a.d(socket, a.i.d, a.j);
          }
          socket.startHandshake();
          SSLSession session = socket.getSession();
          co5.l(session, "sslSocketSession");
          zn2 ozn2 = gg1.B(session);
          y7 d = a.d;
          co5.i(d);
          if (!d.verify(a.i.d, session)) {
             List list = ozn2.a();
             if ((list.isEmpty() ^ b)) {
                X509Certificate x509Certific = list.get(0);
                co5.o(x509Certific, "certificate");
                byte[] encoded = x509Certific.getPublicKey().getEncoded();
                co5.l(encoded, "publicKey.encoded");
                List list1 = a15.a(x509Certific, 7);
                throw new SSLPeerUnverifiedException(ye7.Y(str+a.i.d+" not verified:\n              |    certificate: "+co5.K(ir2.F(encoded).c("SHA-256").a(), "sha256/")+"\n              |    DN: "+x509Certific.getSubjectDN().getName()+"\n              |    subjectAltNames: "+dj0.u0(a15.a(x509Certific, 2), list1)+"\n              "));
             }else {
                throw new SSLPeerUnverifiedException(str1+a.i.d+" not verified \(no certificates\)");
             }
          }else {
             y7 e = a.e;
             co5.i(e);
             this.e = new zn2(ozn2.a, ozn2.b, ozn2.c, new ao6(e, ozn2, a, 4));
             e.a(a.i.d, new wc(12, this));
             if (oip0.b != null) {
                str2 = re5.a.f(socket);
             }
             this.d = socket;
             this.h = xe7.f(xe7.e0(socket));
             this.i = xe7.d(xe7.b0(socket));
             if (str2 != null) {
                c = gg1.D(str2);
             }
             this.f = c;
             re5.a.a(socket);
             if (this.f == sm5.v) {
                this.m(p1);
             }
             return;
          }
       }
    }
    public synchronized final void h(){
       this.m = this.m + 1;
    }
    public final boolean i(y7 p0,List p1){
       np5 te;
       co5.o(p0, "address");
       if (this.p.size() < this.o && this.j == null) {
          np5 tb = this.b;
          if (!tb.a.a(p0)) {
             return false;
          }else {
             y7 i = p0.i;
             mz5 a = tb.a;
             if (co5.c(i.d, a.i.d)) {
                return true;
             }else if(this.g == null){
                return false;
             }else if(p1 != null){
                if (!p1.isEmpty()) {
                   Iterator iterator = p1.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         mz5 omz5 = iterator.next();
                         omz5 = (omz5.b.type() == Proxy$Type.DIRECT && (tb.b.type() == Proxy$Type.DIRECT && co5.c(tb.c, omz5.c)))? 1: 0;
                         if (omz5) {
                            iterator = 1;
                            break ;
                         }
                      }
                   }
                   if (i1) {
                      if (p0.d != a15.a) {
                         return false;
                      }else {
                         y7 i2 = a.i;
                         ps2 d = i.d;
                         if (i.e == i2.e) {
                            if (!co5.c(d, i2.d)) {
                               if (this.k == null && (te = this.e) != null) {
                                  te = te.a();
                                  te = (((te.isEmpty() ^ true)) && a15.c(d, te.get(false)))? 1: 0;
                                  if (!te) {
                                  label_00bf :
                                     i2 = 0;
                                  label_00c0 :
                                     if (!i2) {
                                        return false;
                                     }else {
                                        try{
                                           p0 = p0.e;
                                           co5.i(p0);
                                           te = this.e;
                                           co5.i(te);
                                           te = te.a();
                                           co5.o(d, "hostname");
                                           co5.o(te, "peerCertificates");
                                           p0.a(d, new ao6(p0, te, d, 3));
                                           return true;
                                        }catch(javax.net.ssl.SSLPeerUnverifiedException e0){
                                        }
                                     }
                                  }
                               }else {
                                  goto label_00bf ;
                               }
                            }
                            te = 1;
                            goto label_00c0 ;
                         }
                      }
                   }
                }
                int i1 = 0;
             }
          }
       }
       return false;
    }
    public final boolean j(boolean p0){
       long l = System.nanoTime();
       np5 tc = this.c;
       co5.i(tc);
       np5 td = this.d;
       co5.i(td);
       np5 th = this.h;
       co5.i(th);
       boolean b = false;
       if (tc.isClosed() || (td.isClosed() || (td.isInputShutdown() || td.isOutputShutdown()))) {
          return b;
       }
       if ((tc = this.g) != null) {
          return tc.y(l);
       }
       _monitor_enter(this);
       _monitor_exit(this);
       if (((l - this.q) - 0x2540be400) < 0 || !p0) {
          return 1;
       }
       try{
          td.setSoTimeout(1);
          td.setSoTimeout(td.getSoTimeout());
          b = th.F() ^ 1;
       }catch(java.net.SocketTimeoutException e0){
          b = true;
       }catch(java.io.IOException e0){
       }
       return b;
    }
    public final lw1 k(g15 p0,yp5 p1){
       np5 tg;
       ur2 our2;
       np5 td = this.d;
       co5.i(td);
       np5 th = this.h;
       co5.i(th);
       np5 ti = this.i;
       co5.i(ti);
       if ((tg = this.g) != null) {
          our2 = new ur2(p0, this, p1, tg);
       }else {
          yp5 g = p1.g;
          td.setSoTimeout(g);
          TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
          th.e().g((long)g, mILLISECONDS);
          ti.e().g((long)p1.h, mILLISECONDS);
          our2 = new er2(p0, this, th, ti);
       }
       return our2;
    }
    public synchronized final void l(){
       this.j = true;
    }
    public final void m(int p0){
       np5 td = this.d;
       co5.i(td);
       np5 th = this.h;
       co5.i(th);
       np5 ti = this.i;
       co5.i(ti);
       int i = 0;
       td.setSoTimeout(i);
       u07 h = u07.h;
       gr2 ogr2 = new gr2(h);
       ps2 d = this.b.a.i.d;
       co5.o(d, "peerName");
       ogr2.c = td;
       String str = (ogr2.a != null)? we7.g+' '+d: co5.K(d, "MockWebServer ");
       co5.o(str, "<set-?>");
       ogr2.d = str;
       ogr2.e = th;
       ogr2.f = ti;
       ogr2.g = this;
       ogr2.i = p0;
       tr2 otr2 = new tr2(ogr2);
       this.g = otr2;
       qc6 s = tr2.S;
       int i1 = ((s.a & 0x10))? s.b[4]: Integer.MAX_VALUE;
       this.o = i1;
       tr2 p = otr2.P;
       _monitor_enter(p);
       if (p.v == null) {
          if (p.b == null) {
             _monitor_exit(p);
          }else {
             Logger x = as2.x;
             if (x.isLoggable(Level.FINE)) {
                Object[] objArray = new Object[i];
                x.fine(we7.i(co5.K(fr2.a.e(), ">> CONNECTION "), objArray));
             }
             p.a.v(fr2.a);
             p.a.flush();
             _monitor_exit(p);
          }
          otr2.P.h0(otr2.I);
          i1 = otr2.I.a();
          int i2 = 0xffff;
          if (i1 != i2) {
             otr2.P.i0(i, (long)(i1 - i2));
          }
          h.f().c(new q07(i, otr2.Q, otr2.t), 0);
          return;
       }else {
          throw new IOException("closed");
       }
    }
    public final String toString(){
       zn2 b;
       np5 tb = this.b;
       StringBuilder str = "Connection{"+tb.a.i.d+':'+tb.a.i.e+", proxy="+tb.b+" hostAddress="+tb.c+" cipherSuite=";
       tb = this.e;
       String str1 = "none";
       if (tb == null) {
       }else if((b = tb.b) == null){
          str1 = b;
       }
       return str+str1+" protocol="+this.f+'}';
    }
}
