package p.ey5;
import p.pb3;
import p.g15;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.cx5;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.Integer;
import java.lang.Number;
import p.l67;
import p.bv5;
import p.np5;
import p.mz5;
import java.net.Proxy$Type;
import java.net.Proxy;
import p.eq;
import java.net.ProtocolException;
import p.mw1;
import p.y7;
import p.ps2;
import java.lang.Class;
import p.os2;
import p.zu5;
import p.is7;
import p.fv5;
import p.sm2;
import p.we7;
import java.io.IOException;
import p.lp5;
import java.io.FileNotFoundException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLHandshakeException;
import java.lang.Throwable;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p.q52;
import p.oz5;
import p.ob3;
import p.yp5;
import p.ll1;
import java.lang.IllegalStateException;
import p.hd1;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.HostnameVerifier;
import p.ld0;
import java.util.List;
import java.net.ProxySelector;
import p.op5;
import p.i70;
import p.ax5;
import java.lang.IllegalArgumentException;
import p.pn;
import java.io.Closeable;
import p.gp0;
import java.util.Collection;
import java.util.ArrayList;
import p.dj0;
import p.nz5;

public final class ey5 implements pb3	// class@0001e7 from classes2.dex
{
    public final g15 a;

    public void ey5(g15 p0){
       co5.o(p0, "client");
       super();
       this.a = p0;
    }
    public static int c(cx5 p0,int p1){
       String str;
       if ((str = cx5.f(p0, "Retry-After")) == null) {
          return p1;
       }
       Pattern pattern = Pattern.compile("\\d+");
       co5.l(pattern, "compile\(pattern\)");
       if (!pattern.matcher(str).matches()) {
          return Integer.MAX_VALUE;
       }
       Integer integer = Integer.valueOf(str);
       co5.l(integer, "valueOf\(header\)");
       return integer.intValue();
    }
    public final bv5 a(cx5 p0,l67 p1){
       np5 onp5;
       String str;
       os2 oos2;
       cx5 a1;
       l67 f;
       bv5 uobv5 = null;
       if (p1 == null) {
       }else if((f = p1.f) == null){
          onp5 = f.b;
       label_000e :
          cx5 t = p0.t;
          bv5 b = p0.a.b;
          int i = 1;
          int i1 = 0;
          if (t != 307 && t != 308) {
             if (t != 401) {
                if (t != 421) {
                   int i2 = 503;
                   if (t != i2) {
                      if (t != 407) {
                         i2 = 408;
                         if (t != i2) {
                            switch (t){
                                case 300:
                                case 302:
                                case 303:
                                case 301:
                                  break;
                                default:
                                  return uobv5;
                            }
                         }else if(this.a.w == null){
                            return uobv5;
                         }else if((a1 = p0.A) != null && a1.t == i2){
                            return uobv5;
                         }else if(ey5.c(p0, i1) > 0){
                            return uobv5;
                         }else {
                            return p0.a;
                         }
                      }else {
                         co5.i(onp5);
                         if (onp5.b.type() == Proxy$Type.HTTP) {
                            return this.a.F.d(onp5, p0);
                         }else {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH \(407\) code while not using proxy");
                         }
                      }
                   }else if((a1 = p0.A) != null && a1.t == i2){
                      return uobv5;
                   }else if(!ey5.c(p0, Integer.MAX_VALUE)){
                      return p0.a;
                   }else {
                      return uobv5;
                   }
                }else if(p1 != null && ((co5.c(p1.d.b.i.d, p1.f.b.a.i.d) ^ i))){
                   p1 = p1.f;
                   _monitor_enter(p1);
                   p1.k = i;
                   _monitor_exit(p1);
                   return p0.a;
                }else {
                   return uobv5;
                }
             }else {
                return this.a.x.d(onp5, p0);
             }
          }
          ey5 ta = this.a;
          if (ta.y != null && (str = cx5.f(p0, "Location")) != null) {
             t = p0.a;
             bv5 a = t.a;
             a.getClass();
             bv5 uobv51 = ((oos2 = a.g(str)) == null)? uobv5: oos2.b();
             if (uobv51 != null && (co5.c(uobv51.a, t.a.a) || ta.z != null)) {
                zu5 ozu5 = new zu5(t);
                if (is7.v(b)) {
                   String str1 = "PROPFIND";
                   p0 = p0.t;
                   if (co5.c(b, str1) || (p0 == 308 || p0 == 307)) {
                      i1 = 1;
                   }
                   if (((i ^ co5.c(b, str1))) && (p0 != 308 && p0 != 307)) {
                      ozu5.e("GET", uobv5);
                   }else if(i1){
                      uobv5 = t.d;
                   }
                   ozu5.e(b, uobv5);
                   if (!i1) {
                      ozu5.c.g("Transfer-Encoding");
                      ozu5.c.g("Content-Length");
                      ozu5.c.g("Content-Type");
                   }
                }
                if (!we7.a(t.a, uobv51)) {
                   ozu5.c.g("Authorization");
                }
                ozu5.a = uobv51;
                uobv5 = ozu5.b();
             }
          }
          return uobv5;
       }
       onp5 = uobv5;
       goto label_000e ;
    }
    public final boolean b(IOException p0,lp5 p1,bv5 p2,boolean p3){
       mw1 g;
       np5 onp5;
       mw1 f;
       if (this.a.w == null) {
          return false;
       }
       if (p3 && p0 instanceof FileNotFoundException) {
          return false;
       }
       if (!p0 instanceof ProtocolException) {
          if (p0 instanceof InterruptedIOException) {
             if (!p0 instanceof SocketTimeoutException || p3) {
             label_0031 :
                boolean i = 0;
             label_0034 :
                if (!i) {
                   return false;
                }else {
                   lp5 z = p1.z;
                   co5.i(z);
                   if ((g = z.g) == null && (z.h == null && z.i == null)) {
                      z = 0;
                   }else if(z.j != null){
                      if (g <= true && (z.h <= true && (z.i <= null && (g = z.c.A) != null))) {
                         _monitor_enter(g);
                         if (g.l != null) {
                            _monitor_exit(g);
                         }else if(!we7.a(g.b.a.i, z.b.i)){
                            _monitor_exit(g);
                         }else {
                            onp5 = g.b;
                            _monitor_exit(g);
                         label_0082 :
                            if (onp5 != null) {
                               z.j = onp5;
                            }else if((g = z.e) == null || g.a() != true){
                               g = 0;
                            }else {
                               g = 1;
                            }
                            if (!g && (f = z.f) != null) {
                               i = f.a();
                            }
                         }
                      }
                      onp5 = null;
                      goto label_0082 ;
                   }
                   z = 1;
                   if (!z) {
                      return false;
                   }else {
                      return true;
                   }
                }
             }
          }else if(p0 instanceof SSLHandshakeException && (p0.getCause() instanceof CertificateException || p0 instanceof SSLPeerUnverifiedException)){
             goto label_0031 ;
          }
          f = 1;
          goto label_0034 ;
       }
    }
    public final cx5 intercept(ob3 p0){
       lp5 t;
       g15 h;
       g15 og15;
       g15 og151;
       g15 og152;
       ll1 oll11;
       int i4;
       ArrayList uArrayList;
       yp5 oyp5 = p0;
       yp5 a = oyp5.a;
       int i = 1;
       ll1 oll1 = ll1.a;
       int i1 = 0;
       cx5 uocx5 = null;
       yp5 oyp51 = oyp5.e;
       boolean i2 = 1;
       while (true) {
          a.getClass();
          co5.o(oyp51, "request");
          if (a.C == null) {
             int i3 = 1;
          label_0021 :
             if (!i3) {
                throw new IllegalStateException("Check failed.".toString());
             }
             _monitor_enter(a);
             if (!(i3 = a.E ^ i)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close\(\)".toString());
             }
             if (!(i3 = a.D ^ i)) {
                throw new IllegalStateException("Check failed.".toString());
             }
             _monitor_exit(a);
             if (i2) {
                t = a.t;
                bv5 a1 = oyp51.a;
                lp5 a2 = a.a;
                if (a1.j != null) {
                   if ((h = a2.H) != null) {
                      og15 = a2.M;
                      og151 = h;
                      og152 = a2.L;
                   }else {
                      throw new IllegalStateException("CLEARTEXT-only client");
                   }
                }else {
                   og151 = null;
                   og152 = null;
                   og15 = null;
                }
                oll11 = oll1;
                i4 = i1;
                y7 v6 = new y7(a1.d, a1.e, a2.C, a2.G, og151, og152, og15, a2.F, a2.D, a2.K, a2.J, a2.E);
                a.z = new mw1(t, v6, a, a.v);
             }else {
                oll11 = oll1;
                i4 = i1;
             }
             if (a.G == null) {
                try{
                   cx5 ax5 uocx51 = oyp5.b(oyp51);
                   if (uocx5 != null) {
                      ax5 uoax5 = new ax5(uocx51);
                      uocx51 = new ax5(uocx5);
                      uocx51.g = null;
                      uocx51 = uocx51.a();
                      oyp51 = (uocx51.x == null)? 1: 0;
                      if (oyp51) {
                         uoax5.j = uocx51;
                         uocx51 = uoax5.a();
                      }else {
                         throw new IllegalArgumentException("priorResponse.body != null".toString());
                      }
                   }else {
                      int i6 = 0;
                   }
                   uocx5 = uocx51;
                   lp5 c = a.C;
                   if ((oyp51 = this.a(uocx5, c)) == null) {
                      if (c != null && c.a != null) {
                         int i5 = 1;
                         if ((a.B ^ i5)) {
                            a.B = i5;
                            a.w.i();
                            break ;
                         }else {
                            throw new IllegalStateException("Check failed.".toString());
                         }
                      }
                      break ;
                   }else if((uocx51 = uocx5.x) == null){
                      we7.d(uocx51);
                   }
                   if ((i1 = i4 + 1) <= 20) {
                      a.g(true);
                      c = 1;
                      oll1 = 0;
                   label_0168 :
                      oll1 = oll11;
                      i = 1;
                   }else {
                      throw new ProtocolException(co5.K(Integer.valueOf(i1), "Too many follow-up requests: "));
                   }
                }catch(p.nz5 e0){
                   Collection uCollection = oll11;
                   nz5 onz5 = e0;
                   if (this.b(onz5.b, a, oyp51, false)) {
                      uArrayList = dj0.v0(onz5.a, uCollection);
                      a.g(true);
                   }else {
                      nz5 a3 = onz5.a;
                      we7.A(a3, uCollection);
                      throw a3;
                   }
                }catch(java.io.IOException e0){
                   ey5 uoey5 = this;
                   IOException iOException = e0;
                   i2 = (!iOException instanceof gp0)? true: false;
                   if (uoey5.b(iOException, a, oyp51, i2)) {
                      uArrayList = dj0.v0(iOException, oll11);
                      a.g(true);
                      oll1 = 0;
                   }else {
                      we7.A(iOException, oll11);
                      throw iOException;
                   }
                }
                oll11 = uArrayList;
                i1 = i4;
                uArrayList = 0;
                goto label_0168 ;
             }else {
                throw new IOException("Canceled");
             }
          }else {
             t = 0;
             goto label_0021 ;
          }
       }
       a.g(false);
       return uocx5;
    }
}
