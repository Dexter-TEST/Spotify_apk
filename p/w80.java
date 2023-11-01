package p.w80;
import p.re5;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.cx5;
import p.bv5;
import p.mp2;
import java.util.Set;
import p.fv1;
import p.we7;
import p.sm2;
import p.nn6;
import p.hp5;
import p.xe7;
import p.os2;
import p.ps2;
import p.zr6;
import p.gg1;
import java.lang.Long;
import p.kf0;
import java.util.List;
import p.k57;
import p.zn2;
import p.yn2;
import p.wf2;
import java.io.IOException;
import java.lang.StringBuilder;
import java.io.Closeable;
import java.lang.Throwable;
import p.eb3;
import p.ll1;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import p.e70;
import p.j80;
import p.ir2;
import p.y70;
import java.io.InputStream;
import java.security.cert.Certificate;
import p.gp5;
import p.f70;
import java.util.Iterator;
import p.tb1;
import p.el6;
import p.sm5;

public final class w80	// class@002ae4 from classes.dex
{
    public final ps2 a;
    public final mp2 b;
    public final String c;
    public final sm5 d;
    public final int e;
    public final String f;
    public final mp2 g;
    public final zn2 h;
    public final long i;
    public final long j;
    public static final String k;
    public static final String l;

    static {
       re5.a.getClass();
       w80.k = co5.K("-Sent-Millis", "OkHttp");
       re5.a.getClass();
       w80.l = co5.K("-Received-Millis", "OkHttp");
    }
    public void w80(cx5 p0){
       mp2 b;
       super();
       cx5 a = p0.a;
       this.a = a.a;
       cx5 y = p0.y;
       co5.i(y);
       bv5 c = y.a.c;
       cx5 w = p0.w;
       Set set = fv1.B(w);
       if (set.isEmpty()) {
          b = we7.b;
       }else {
          sm2 osm2 = new sm2();
          int i = c.a.length / 2;
          int i1 = 0;
          while (i1 < i) {
             int i2 = i1 + 1;
             String str = c.c(i1);
             if (set.contains(str)) {
                osm2.b(str, c.g(i1));
             }
             i1 = i2;
          }
          b = osm2.e();
       }
       this.b = b;
       this.c = a.b;
       this.d = p0.b;
       this.e = p0.t;
       this.f = p0.c;
       this.g = w;
       this.h = p0.v;
       this.i = p0.B;
       this.j = p0.C;
       return;
    }
    public void w80(nn6 p0){
       int i;
       ps2 ops2;
       co5.o(p0, "rawSource");
       super();
       hp5 ohp5 = xe7.f(p0);
       String str = ohp5.B();
       try{
          i = 0;
          os2 oos2 = new os2();
          oos2.f(i, str);
          ops2 = oos2.b();
       }catch(java.lang.IllegalArgumentException e0){
          ops2 = i;
       }
       if (ops2 != null) {
          this.a = ops2;
          this.c = e0.B();
          sm2 osm2 = new sm2();
          int i1 = fv1.A(e0);
          int i2 = 0;
          while (i2 < i1) {
             i2 = i2 + 1;
             osm2.c(e0.B());
          }
          this.b = osm2.e();
          zr6 ozr6 = gg1.Q(e0.B());
          this.d = ozr6.a;
          this.e = ozr6.b;
          this.f = ozr6.c;
          osm2 = new sm2();
          i1 = fv1.A(e0);
          i2 = 0;
          while (i2 < i1) {
             i2 = i2 + 1;
             osm2.c(e0.B());
          }
          String k = w80.k;
          String str1 = osm2.f(k);
          String l = w80.l;
          String str2 = osm2.f(l);
          osm2.g(k);
          osm2.g(l);
          long l1 = 0;
          long l2 = (str1 == null)? l1: Long.parseLong(str1);
          this.i = l2;
          if (str2 != null) {
             l1 = Long.parseLong(str2);
          }
          this.j = l1;
          this.g = osm2.e();
          if (co5.c(this.a.a, "https")) {
             str = e0.B();
             k = (str.length() > 0)? 1: 0;
             if (!k) {
                kf0 okf0 = kf0.b.u(e0.B());
                List list = w80.a(e0);
                List list1 = w80.a(e0);
                k57 ok57 = (!e0.F())? gg1.A(e0.B()): k57.w;
                this.h = new zn2(ok57, okf0, we7.x(list1), new yn2(0, we7.x(list)));
             }else {
                throw new IOException("expected \"\" but was \""+str+'"');
             }
          }else {
             this.h = i;
          }
          eb3.d(p0, i);
          return;
       }else {
          IOException iOException = new IOException(co5.K(str, "Cache corruption for "));
          re5.a.getClass();
          re5.i(5, "cache corruption", iOException);
          throw iOException;
       }
    }
    public static List a(hp5 p0){
       int i;
       if ((i = fv1.A(p0)) == -1) {
          return ll1.a;
       }
       try{
          CertificateFactory instance = CertificateFactory.getInstance("X.509");
          ArrayList uArrayList = new ArrayList(i);
          int i1 = 0;
          while (i1 < i) {
             i1 = i1 + 1;
             e70 uoe70 = new e70();
             j80 oj80 = ir2.q(p0.B());
             co5.i(oj80);
             uoe70.u0(oj80);
             uArrayList.add(instance.generateCertificate(uoe70.e0()));
          }
          return uArrayList;
       }catch(java.security.cert.CertificateException e7){
          throw new IOException(e7.getMessage());
       }
    }
    public static void b(gp5 p0,List p1){
       try{
          p0.X((long)p1.size());
          p0.writeByte(10);
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             byte[] encoded = iterator.next().getEncoded();
             co5.l(encoded, "bytes");
             p0.W(ir2.F(encoded).a());
             p0.writeByte(10);
          }
          return;
       }catch(java.security.cert.CertificateEncodingException e3){
          throw new IOException(e3.getMessage());
       }
    }
    public final void c(tb1 p0){
       w80 ta = this.a;
       w80 th = this.h;
       w80 tg = this.g;
       w80 tb = this.b;
       int i = 0;
       gp5 ogp5 = xe7.d(p0.f(i));
       ogp5.W(ta.i);
       ogp5.writeByte(10);
       ogp5.W(this.c);
       ogp5.writeByte(10);
       ogp5.X((long)(tb.a.length / 2));
       ogp5.writeByte(10);
       int i1 = tb.a.length / 2;
       for (int i2 = 0; i2 < i1; i2 = i3) {
          int i3 = i2 + 1;
          ogp5.W(tb.c(i2));
          ogp5.W(": ");
          ogp5.W(tb.g(i2));
          ogp5.writeByte(10);
       }
       tb = this.d;
       w80 te = this.e;
       w80 tf = this.f;
       co5.o(tb, "protocol");
       co5.o(tf, "message");
       StringBuilder str = "";
       str = (tb == sm5.b)? str+"HTTP/1.0": str+"HTTP/1.1";
       String str1 = str+' '+te+' '+tf;
       co5.l(str1, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       ogp5.W(str1);
       ogp5.writeByte(10);
       ogp5.X((long)((tg.a.length / 2) + 2));
       ogp5.writeByte(10);
       int i4 = tg.a.length / 2;
       for (; i < i4; i = i1) {
          i1 = i + 1;
          ogp5.W(tg.c(i));
          ogp5.W(": ");
          ogp5.W(tg.g(i));
          ogp5.writeByte(10);
       }
       ogp5.W(w80.k);
       ogp5.W(": ");
       ogp5.X(this.i);
       ogp5.writeByte(10);
       ogp5.W(w80.l);
       ogp5.W(": ");
       ogp5.X(this.j);
       ogp5.writeByte(10);
       if (co5.c(ta.a, "https")) {
          ogp5.writeByte(10);
          co5.i(th);
          ogp5.W(th.b.a);
          ogp5.writeByte(10);
          w80.b(ogp5, th.a());
          w80.b(ogp5, th.c);
          ogp5.W(th.a.a);
          ogp5.writeByte(10);
       }
       eb3.d(ogp5, null);
       return;
    }
}
