package p.g15;
import java.lang.Cloneable;
import p.r90;
import p.sm5;
import java.lang.Object;
import java.util.List;
import p.we7;
import p.ip0;
import p.f15;
import p.qn4;
import java.net.ProxySelector;
import p.hj2;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import p.ld0;
import p.co5;
import java.util.Set;
import p.ry7;
import p.re5;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import java.lang.IllegalStateException;
import java.lang.String;
import p.bv5;
import p.t90;
import p.lp5;

public final class g15 implements Cloneable, r90	// class@00167e from classes.dex
{
    public final vu0 A;
    public final a90 B;
    public final hd1 C;
    public final Proxy D;
    public final ProxySelector E;
    public final eq F;
    public final SocketFactory G;
    public final SSLSocketFactory H;
    public final X509TrustManager I;
    public final List J;
    public final List K;
    public final HostnameVerifier L;
    public final ld0 M;
    public final ry7 N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final long T;
    public final hj2 U;
    public final kc1 a;
    public final i40 b;
    public final List c;
    public final List t;
    public final up0 v;
    public final boolean w;
    public final eq x;
    public final boolean y;
    public final boolean z;
    public static final List V;
    public static final List W;

    static {
       sm5[] osm5Array = new sm5[]{sm5.v,sm5.c};
       g15.V = we7.l(osm5Array);
       ip0[] oip0Array = new ip0[]{ip0.e,ip0.f};
       g15.W = we7.l(oip0Array);
    }
    public void g15(){
       super(new f15());
    }
    public void g15(f15 p0){
       qn4 a;
       ld0 old0;
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = we7.x(p0.c);
       this.t = we7.x(p0.d);
       this.v = p0.e;
       this.w = p0.f;
       this.x = p0.g;
       this.y = p0.h;
       this.z = p0.i;
       this.A = p0.j;
       this.B = p0.k;
       this.C = p0.l;
       f15 m = p0.m;
       this.D = m;
       if (m != null) {
          a = qn4.a;
       }else if((a = p0.n) == null){
          a = ProxySelector.getDefault();
       }
       if (a == null) {
          a = qn4.a;
       }
       this.E = a;
       this.F = p0.o;
       this.G = p0.p;
       m = p0.s;
       this.J = m;
       this.K = p0.t;
       this.L = p0.u;
       this.O = p0.x;
       this.P = p0.y;
       this.Q = p0.z;
       this.R = p0.A;
       this.S = p0.B;
       this.T = p0.C;
       f15 d = p0.D;
       int i = 1;
       if (d == null) {
          d = new hj2(i);
       }
       this.U = d;
       if (!m instanceof Collection || !m.isEmpty()) {
          Iterator iterator1 = m.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                if (iterator1.next().a != null) {
                   iterator1 = 0;
                   break ;
                }
             }
          }
          SSLSocketFactory sSLSocketFac = null;
          if (a) {
             this.H = sSLSocketFac;
             this.N = sSLSocketFac;
             this.I = sSLSocketFac;
             this.M = ld0.c;
          }else if((m = p0.q) != null){
             this.H = m;
             m = p0.w;
             co5.i(m);
             this.N = m;
             f15 r = p0.r;
             co5.i(r);
             this.I = r;
             p0 = p0.v;
             if (!co5.c(p0.b, m)) {
                old0 = new ld0(p0.a, m);
             }
             this.M = p0;
          }else {
             X509TrustManager x509TrustMan = re5.a.m();
             this.I = x509TrustMan;
             co5.i(x509TrustMan);
             this.H = re5.a.l(x509TrustMan);
             ry7 ory7 = re5.a.b(x509TrustMan);
             this.N = ory7;
             p0 = p0.v;
             co5.i(ory7);
             if (!co5.c(p0.b, ory7)) {
                old0 = new ld0(p0.a, ory7);
             }
             this.M = p0;
          }
          g15 tc = this.c;
          if ((tc.contains(sSLSocketFac) ^ i)) {
             tc = this.t;
             if ((tc.contains(sSLSocketFac) ^ i)) {
                tc = this.J;
                if (!tc instanceof Collection || !tc.isEmpty()) {
                   Iterator iterator = tc.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (iterator.next().a != null) {
                            iterator = 0;
                            break ;
                         }
                      }
                   }
                   g15 tI = this.I;
                   g15 tN = this.N;
                   g15 tH = this.H;
                   if (tc) {
                      tc = (tH == null)? 1: 0;
                      if (tc) {
                         tc = (tN == null)? 1: 0;
                         if (tc) {
                            if (tI != null) {
                               i = 0;
                            }
                            if (i) {
                               if (!co5.c(this.M, ld0.c)) {
                                  throw new IllegalStateException("Check failed.".toString());
                               }
                            }else {
                               throw new IllegalStateException("Check failed.".toString());
                            }
                         }else {
                            throw new IllegalStateException("Check failed.".toString());
                         }
                      }else {
                         throw new IllegalStateException("Check failed.".toString());
                      }
                   }else if(tH != null){
                      if (tN != null) {
                         if (tI == null) {
                            throw new IllegalStateException("x509TrustManager == null".toString());
                         }
                      }else {
                         throw new IllegalStateException("certificateChainCleaner == null".toString());
                      }
                   }else {
                      throw new IllegalStateException("sslSocketFactory == null".toString());
                   }
                   return;
                }
                tc = 1;
             }else {
                throw new IllegalStateException(co5.K(tc, "Null network interceptor: ").toString());
             }
          }else {
             throw new IllegalStateException(co5.K(tc, "Null interceptor: ").toString());
          }
       }
       a = 1;
    }
    public final t90 a(bv5 p0){
       co5.o(p0, "request");
       return new lp5(this, p0, false);
    }
    public final Object clone(){
       return super.clone();
    }
}
