package p.y7;
import java.lang.String;
import p.hd1;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.HostnameVerifier;
import p.ld0;
import p.eq;
import java.net.Proxy;
import java.util.List;
import java.net.ProxySelector;
import java.lang.Object;
import p.co5;
import p.os2;
import p.ps2;
import p.we7;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import p.kg4;
import java.util.Objects;
import java.lang.StringBuilder;
import p.hr7;

public final class y7	// class@002d67 from classes.dex
{
    public final hd1 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final ld0 e;
    public final eq f;
    public final Proxy g;
    public final ProxySelector h;
    public final ps2 i;
    public final List j;
    public final List k;

    public void y7(String p0,int p1,hd1 p2,SocketFactory p3,SSLSocketFactory p4,HostnameVerifier p5,ld0 p6,eq p7,Proxy p8,List p9,List p10,ProxySelector p11){
       int i;
       co5.o(p0, "uriHost");
       co5.o(p2, "dns");
       co5.o(p3, "socketFactory");
       co5.o(p7, "proxyAuthenticator");
       co5.o(p9, "protocols");
       co5.o(p10, "connectionSpecs");
       co5.o(p11, "proxySelector");
       super();
       this.a = p2;
       this.b = p3;
       this.c = p4;
       this.d = p5;
       this.e = p6;
       this.f = p7;
       this.g = p8;
       this.h = p11;
       os2 oos2 = new os2();
       String str = (p4 != null)? "https": "http";
       oos2.g(str);
       oos2.e(p0);
       if ((i = 1) > p1 || p1 >= 0x10000) {
          i = 0;
       }
       if (i) {
          oos2.e = p1;
          this.i = oos2.b();
          this.j = we7.x(p9);
          this.k = we7.x(p10);
          return;
       }else {
          throw new IllegalArgumentException(co5.K(Integer.valueOf(p1), "unexpected port: ").toString());
       }
    }
    public final boolean a(y7 p0){
       co5.o(p0, "that");
       boolean b = (co5.c(this.a, p0.a) && (co5.c(this.f, p0.f) && (co5.c(this.j, p0.j) && (co5.c(this.k, p0.k) && (co5.c(this.h, p0.h) && (co5.c(this.g, p0.g) && (co5.c(this.c, p0.c) && (co5.c(this.d, p0.d) && (co5.c(this.e, p0.e) && this.i.e == p0.i.e)))))))))? true: false;
       return b;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof y7 && (co5.c(this.i, p0.i) && this.a(p0)))? true: false;
       return b;
    }
    public final int hashCode(){
       return (Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.g) + ((this.h.hashCode() + kg4.j(this.k, kg4.j(this.j, ((this.f.hashCode() + ((this.a.hashCode() + ((this.i.hashCode() + 527) * 31)) * 31)) * 31), 31), 31)) * 31)) * 31)) * 31)) * 31));
    }
    public final String toString(){
       y7 ti = this.i;
       StringBuilder str = "Address{"+ti.d+':'+ti.e+", ";
       String str1 = ((ti = this.g) != null)? co5.K(ti, "proxy="): co5.K(this.h, "proxySelector=");
       return hr7.a(str, str1, '}');
    }
}
