package p.fv1;
import p.su0;
import p.fh0;
import p.ww0;
import p.mz0;
import p.wm0;
import p.hd1;
import p.yf2;
import p.t32;
import p.dt2;
import p.zr3;
import p.kd7;
import p.vd5;
import p.y00;
import p.aw4;
import p.dn5;
import p.ub3;
import p.j65;
import p.z17;
import p.cx7;
import p.kw7;
import java.lang.Object;
import p.f32;
import java.lang.String;
import p.co5;
import p.hp5;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.mp2;
import java.util.Set;
import p.av6;
import java.util.TreeSet;
import java.util.Comparator;
import java.lang.CharSequence;
import java.util.List;
import java.util.Iterator;
import p.pl1;
import p.kf0;
import java.util.Map;
import java.lang.IndexOutOfBoundsException;
import java.lang.IllegalArgumentException;
import p.a32;
import p.ko6;
import p.xe7;
import java.io.File;
import p.l42;
import p.la0;
import java.util.Locale;
import p.kg6;
import p.ps2;
import p.j80;
import p.ir2;
import p.c90;
import p.we7;
import p.fx5;
import p.e70;
import p.g70;
import p.f70;
import p.u54;
import p.ex5;
import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import p.uj0;
import p.vv7;
import java.io.Closeable;
import p.dh0;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Character;
import p.c27;
import p.dw4;
import p.jw4;
import p.xt;
import p.vy3;
import p.ty3;
import p.ry3;
import p.my3;
import java.util.HashSet;
import p.sy3;
import p.py3;
import p.ny3;
import p.vu5;
import p.oy3;
import p.cd2;
import io.reactivex.rxjava3.core.Single;
import java.lang.IllegalStateException;
import android.os.IBinder;
import p.y18;
import android.os.IInterface;
import p.c28;
import p.r18;
import p.nx5;
import p.h71;
import android.content.Context;
import java.lang.Class;
import android.util.JsonReader;
import p.nz0;
import p.lq5;
import java.lang.Long;
import android.util.Base64;
import p.jz0;
import java.nio.charset.Charset;
import java.lang.NullPointerException;
import p.js;
import p.cv5;
import p.gf3;
import p.kq;
import p.oo4;
import p.vr;
import p.qq;
import p.iz0;
import p.bs;
import p.nq;
import p.uy0;
import p.cs;
import p.oq;
import p.ty0;
import p.ds;
import p.cr;
import p.hz0;
import p.rs;
import p.br;
import p.gz0;
import p.qs;
import p.pq;
import p.vy0;
import p.fs;
import p.zq;
import p.fz0;
import p.gs;
import p.rq;
import p.cz0;
import p.hs;
import p.tq;
import p.bz0;
import p.is;
import p.wq;
import p.az0;
import p.ms;
import p.xq;
import p.zy0;
import p.ns;
import p.uq;
import p.xy0;
import p.ks;
import p.vq;
import p.yy0;
import p.ls;
import p.sq;
import p.wy0;
import p.jq;
import p.qy0;
import p.xr;
import p.yq;
import p.dz0;
import p.os;
import p.ar;
import p.ez0;
import p.ps;
import p.lq;
import p.sy0;
import p.yr;
import p.mq;
import p.ry0;
import p.zr;
import java.util.Objects;
import java.util.LinkedHashMap;
import java.net.InetAddress;
import p.uk;
import java.net.UnknownHostException;

public final class fv1 implements su0, fh0, ww0, mz0, wm0, hd1, yf2, t32, dt2, zr3, kd7, vd5, y00, aw4, dn5, ub3, j65, z17, cx7, kw7	// class@001643 from classes.dex
{
    public static final fv1 A;
    public static final fv1 B;
    public static final fv1 C;
    public static final fv1 a;
    public static final fv1 b;
    public static final fv1 c;
    public static final fv1 t;
    public static final fv1 v;
    public static final fv1 w;
    public static final fv1 x;
    public static final fv1 y;
    public static final fv1 z;

    static {
       fv1.a = new fv1();
       fv1.b = new fv1();
       fv1.c = new fv1();
       fv1.t = new fv1();
       fv1.v = new fv1();
       fv1.w = new fv1();
       fv1.x = new fv1();
       fv1.y = new fv1();
       fv1.z = new fv1();
       fv1.A = new fv1();
       fv1.B = new fv1();
       fv1.C = new fv1();
    }
    public void fv1(){
       super();
    }
    public void fv1(f32 p0){
       co5.o(p0, "fileFactory");
       super();
    }
    public static int A(hp5 p0){
       String str = "expected an int but was \"";
       try{
          long l = p0.f();
          String str1 = p0.B();
          if ((l) >= 0 && (l - 0x7fffffff) <= 0) {
             int i = (str1.length() > 0)? 1: 0;
             if (!i) {
                return (int)l;
             }
          }
          throw new IOException(str+l+str1+'"');
       }catch(java.lang.NumberFormatException e6){
          throw new IOException(e6.getMessage());
       }
    }
    public static Set B(mp2 p0){
       int i = p0.a.length / 2;
       Set set = null;
       int i1 = 0;
       while (i1 < i) {
          int i2 = i1 + 1;
          if (av6.i0("Vary", p0.c(i1), true)) {
             String str = p0.g(i1);
             if (set == null) {
                Comparator cASE_INSENSI = String.CASE_INSENSITIVE_ORDER;
                co5.l(cASE_INSENSI, "CASE_INSENSITIVE_ORDER");
                set = new TreeSet(cASE_INSENSI);
             }
             char[] uocharArray = new char[true];
             uocharArray[0] = ',';
             Iterator iterator = av6.A0(str, uocharArray).iterator();
             while (iterator.hasNext()) {
                set.add(av6.K0(iterator.next()).toString());
             }
          }
          i1 = i2;
       }
       if (set == null) {
          set = pl1.a;
       }
       return set;
    }
    public static final kf0 m(fv1 p0,String p1){
       kf0 okf0 = new kf0(p1);
       kf0.d.put(p1, okf0);
       return okf0;
    }
    public static void n(int p0,int p1){
       if (p0 >= 0 && p0 < p1) {
          return;
       }
       throw new IndexOutOfBoundsException("index: "+p0+", size: "+p1);
    }
    public static void o(int p0,int p1){
       if (p0 >= 0 && p0 <= p1) {
          return;
       }
       throw new IndexOutOfBoundsException("index: "+p0+", size: "+p1);
    }
    public static void p(int p0,int p1,int p2){
       if (p0 < 0 || p1 > p2) {
          throw new IndexOutOfBoundsException("fromIndex: "+p0+", toIndex: "+p1+", size: "+p2);
       }
       if (p0 <= p1) {
          return;
       }
       throw new IllegalArgumentException("fromIndex: "+p0+" > toIndex: "+p1);
    }
    public static void q(a32 p0){
       co5.o(p0, "dir");
       if (!p0.exists()) {
          throw new IllegalArgumentException(p0+" does not exist");
       }
       if (!p0.isDirectory()) {
          throw new IllegalArgumentException(p0+" is not a directory");
       }
       a32[] uoa32Array = p0.a();
       void ovoid = null;
       if (uoa32Array != null) {
          ko6 oko6 = xe7.D(uoa32Array);
          while (oko6.hasNext()) {
             a32 uoa32 = oko6.next();
             try{
                l42.b(uoa32);
             }catch(java.io.IOException e0){
             }
          }
       }
       if (!ovoid) {
          return;
       }else {
          throw ovoid;
       }
    }
    public static la0 s(String p0,String p1){
       co5.o(p0, "countryCode");
       co5.o(p1, "callingCode");
       String displayCount = new Locale("", p0).getDisplayCountry();
       co5.l(displayCount, "Locale\(\"\", countryCode\).displayCountry");
       return new la0(p0, p1, displayCount);
    }
    public static kg6 v(int p0){
       object oobject;
       kg6[] okg6Array = kg6.values();
       int len = okg6Array.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = okg6Array[i];
             int i1 = (oobject.a == p0)? 1: 0;
             if (i1) {
             label_0019 :
                if (oobject == null) {
                   oobject = kg6.b;
                   break ;
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             oobject = null;
             goto label_0019 ;
          }
       }
       return oobject;
    }
    public static int w(int p0,String p1,String p2){
       int i = p1.length();
       while (true) {
          if (p0 >= i) {
             return p1.length();
          }
          int i1 = p0 + 1;
          if (av6.e0(p2, p1.charAt(p0))) {
             break ;
          }else {
             p0 = i1;
          }
       }
       return p0;
    }
    public static String x(ps2 p0){
       co5.o(p0, "url");
       return ir2.t(p0.i).c("MD5").e();
    }
    public static c90 z(mp2 p0){
       int i11;
       int i12;
       String str3;
       int i13;
       mp2 omp2 = p0;
       co5.o(omp2, "headers");
       int i = omp2.a.length / 2;
       int b = true;
       int i1 = 0;
       int i2 = 1;
       int i3 = 0;
       boolean b1 = false;
       boolean b2 = false;
       int i4 = -1;
       int i5 = -1;
       boolean b3 = false;
       boolean b4 = false;
       boolean b5 = false;
       int i6 = -1;
       int i7 = -1;
       boolean b6 = false;
       boolean b7 = false;
       boolean b8 = false;
       while (i1 < i) {
          int i8 = i1 + 1;
          String str = omp2.c(i1);
          String str1 = omp2.g(i1);
          if (av6.i0(str, "Cache-Control", b)) {
             if (i3 == null) {
                i3 = str1;
             label_0044 :
                int i9 = 0;
                while (i9 < str1.length()) {
                   int i10 = fv1.w(i9, str1, "=,;");
                   str = str1.substring(i9, i10);
                   String str2 = "this as java.lang.String…ing\(startIndex, endIndex\)";
                   co5.l(str, str2);
                   str = av6.K0(str).toString();
                   if (i10 != str1.length() && (str1.charAt(i10) != ',' && str1.charAt(i10) != ';')) {
                      i10 = i10 + 1;
                      i12 = str1.length();
                      while (true) {
                         if (i10 < i12) {
                            i13 = i10 + 1;
                            int i14 = i12;
                            char c = str1.charAt(i10);
                            i11 = i;
                            if (c != ' ' && c != 9) {
                            label_00a2 :
                               if (i10 < str1.length()) {
                                  char c1 = '"';
                                  if (str1.charAt(i10) == c1) {
                                     i10 = i10 + 1;
                                     i12 = av6.m0(str1, c1, i10, false, 4);
                                     str3 = str1.substring(i10, i12);
                                     co5.l(str3, str2);
                                     i12 = i12 + 1;
                                  }
                               }
                               i12 = fv1.w(i10, str1, ",;");
                               str3 = str1.substring(i10, i12);
                               co5.l(str3, str2);
                               str3 = av6.K0(str3).toString();
                            }else {
                               i10 = i13;
                               i12 = i14;
                               i = i11;
                            }
                         }else {
                            i11 = i;
                            i10 = str1.length();
                            goto label_00a2 ;
                         }
                      }
                   }else {
                      i11 = i;
                      i10 = i10 + 1;
                      i12 = i10;
                      str3 = null;
                   }
                   i10 = true;
                   if (av6.i0("no-cache", str, i10)) {
                      b1 = true;
                   }else if(av6.i0("no-store", str, i10)){
                      b2 = true;
                   }else if(av6.i0("max-age", str, i10)){
                      i4 = we7.y(-1, str3);
                   }else {
                      b = -1;
                      if (av6.i0("s-maxage", str, i10)) {
                         i5 = we7.y(b, str3);
                      }else if(av6.i0("private", str, i10)){
                         b3 = true;
                      }else if(av6.i0("public", str, i10)){
                         b4 = true;
                      }else if(av6.i0("must-revalidate", str, i10)){
                         b5 = true;
                      }else if(av6.i0("max-stale", str, i10)){
                         i6 = we7.y(Integer.MAX_VALUE, str3);
                      }else if(av6.i0("min-fresh", str, i10)){
                         i7 = we7.y(-1, str3);
                      }else if(av6.i0("only-if-cached", str, i10)){
                         b6 = true;
                      }else if(av6.i0("no-transform", str, i10)){
                         b7 = true;
                      }else if(av6.i0("immutable", str, i10)){
                         b8 = true;
                      }
                   }
                   i13 = -1;
                   i9 = i12;
                   i = i11;
                   i12 = p0;
                }
                omp2 = p0;
                i1 = i8;
                i11 = i;
                b = true;
             }
          }else if(av6.i0(str, "Pragma", b)){
          }
          i2 = 0;
          goto label_0044 ;
       }
       String str4 = (!i2)? null: i3;
       c90 omp21 = new c90(b1, b2, i4, i5, b3, b4, b5, i6, i7, b6, b7, b8, str4);
       return omp2;
    }
    public Object a(Object p0){
       e70 uoe70 = new e70();
       p0.y().L(uoe70);
       p0.close();
       return new ex5(p0.x(), p0.f(), uoe70);
    }
    public Object apply(Object p0){
       co5.o(p0, "p0");
       return vv7.g(p0);
    }
    public void b(Closeable p0,Throwable p1,Throwable p2){
       dh0.a.log(Level.WARNING, "Suppressing exception thrown when closing "+p0, p2);
    }
    public int c(CharSequence p0,int p1){
       p1 = p1 + 0;
       int i = 0;
       byte i1 = 2;
       while (i < p1 && i1 == 2) {
          if (i1 = Character.getDirectionality(p0.charAt(i))) {
             if (i1 != 1 && i1 != 2) {
                switch (i1){
                    case 14:
                    case 15:
                      break;
                    case 16:
                    case 17:
                      break;
                    default:
                      i1 = 2;
                }
             label_0022 :
                i = i + 1;
             }
             i1 = 0;
             goto label_0022 ;
          }
          i1 = 1;
          goto label_0022 ;
       }
       return i1;
    }
    public dw4 call(){
       return new jw4();
    }
    public int d(int p0){
       return p0;
    }
    public xt e(Object p0,Object p1){
       co5.o(p0, "p0");
       co5.o(p1, "p1");
       int i = (co5.c(p1, ry3.b))? 1: co5.c(p1, ry3.a);
       my3 a = my3.a;
       if (i) {
          p0 = new my3[]{a};
          p0 = xt.a(vv7.p(p0));
       }else if(p1 instanceof sy3){
          py3[] opy3Array = new py3[]{new ny3(p0.b, p0.c, p0.d, p1.a),oy3.a,a};
          p0 = xt.a(vv7.p(opy3Array));
       }else {
          throw new cd2(10);
       }
       return p0;
    }
    public void f(String p0,String p1){
    }
    public Single first(){
       return Single.error(new IllegalStateException());
    }
    public Single g(String p0){
       return Single.error(new IllegalStateException());
    }
    public Object h(IBinder p0){
       IInterface iInterface;
       if (p0 == null) {
          iInterface = null;
       }else {
          IInterface iInterface1 = p0.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
          iInterface = (iInterface1 instanceof c28)? iInterface1: new r18(p0);
       }
       return iInterface;
    }
    public Object i(nx5 p0){
       return new h71(p0.a(Context.class));
    }
    public void j(String p0,String p1,Throwable p2){
    }
    public Object k(JsonReader p0){
       lq5 olq5 = new lq5(5);
       p0.beginObject();
       while (true) {
          if (p0.hasNext()) {
             String str = p0.nextName();
             str.getClass();
             int i = 2;
             int i1 = -1;
             switch (str.hashCode()){
                 case 0x337a8b:
                   if (str.equals("name")) {
                      i1 = 0;
                   }
                   break;
                 case 0x35e001:
                   if (str.equals("size")) {
                      i1 = 1;
                   }
                   break;
                 case 0x36f3bb:
                   if (str.equals("uuid")) {
                      i1 = 2;
                   }
                   break;
                 case 0x44c50fe3:
                   if (str.equals("baseAddress")) {
                      i1 = 3;
                   }
                   break;
                 default:
             }
             switch (i1){
                 case 0:
                   if ((str = p0.nextString()) == null) {
                      throw new NullPointerException("Null name");
                   }
                   olq5.t = str;
                   break;
                 case 1:
                   olq5.c = Long.valueOf(p0.nextLong());
                   break;
                 case 2:
                   olq5.v = new String(Base64.decode(p0.nextString(), i), jz0.a);
                   break;
                 case 3:
                   olq5.b = Long.valueOf(p0.nextLong());
                   break;
                 default:
                   p0.skipValue();
             }
          }else {
             p0.endObject();
             return olq5.f();
          }
       }
    }
    public cv5 l(cv5 p0){
       return p0;
    }
    public void r(gf3 p0){
       kq a = kq.a;
       p0.a(jz0.class, a);
       p0.a(vr.class, a);
       qq a1 = qq.a;
       p0.a(iz0.class, a1);
       p0.a(bs.class, a1);
       nq a2 = nq.a;
       p0.a(uy0.class, a2);
       p0.a(cs.class, a2);
       oq a3 = oq.a;
       p0.a(ty0.class, a3);
       p0.a(ds.class, a3);
       cr a4 = cr.a;
       p0.a(hz0.class, a4);
       p0.a(rs.class, a4);
       br a5 = br.a;
       p0.a(gz0.class, a5);
       p0.a(qs.class, a5);
       pq a6 = pq.a;
       p0.a(vy0.class, a6);
       p0.a(fs.class, a6);
       zq a7 = zq.a;
       p0.a(fz0.class, a7);
       p0.a(gs.class, a7);
       rq a8 = rq.a;
       p0.a(cz0.class, a8);
       p0.a(hs.class, a8);
       tq a9 = tq.a;
       p0.a(bz0.class, a9);
       p0.a(is.class, a9);
       wq a10 = wq.a;
       p0.a(az0.class, a10);
       p0.a(ms.class, a10);
       xq a11 = xq.a;
       p0.a(zy0.class, a11);
       p0.a(ns.class, a11);
       uq a12 = uq.a;
       p0.a(xy0.class, a12);
       p0.a(ks.class, a12);
       vq a13 = vq.a;
       p0.a(yy0.class, a13);
       p0.a(ls.class, a13);
       sq a14 = sq.a;
       p0.a(wy0.class, a14);
       p0.a(js.class, a14);
       jq a15 = jq.a;
       p0.a(qy0.class, a15);
       p0.a(xr.class, a15);
       yq a16 = yq.a;
       p0.a(dz0.class, a16);
       p0.a(os.class, a16);
       ar a17 = ar.a;
       p0.a(ez0.class, a17);
       p0.a(ps.class, a17);
       lq a18 = lq.a;
       p0.a(sy0.class, a18);
       p0.a(yr.class, a18);
       mq a19 = mq.a;
       p0.a(ry0.class, a19);
       p0.a(zr.class, a19);
    }
    public void t(a32 p0){
       co5.o(p0, "dir");
       if (p0.exists()) {
          if (!l42.c(p0)) {
             fv1.q(p0);
          }
          if (!p0.delete()) {
             throw new IOException("Unable to delete directory "+p0+'.');
          }
       }
       return;
    }
    public boolean test(Object p0,Object p1){
       return Objects.equals(p0, p1);
    }
    public synchronized kf0 u(String p0){
       kf0 okf0;
       co5.o(p0, "javaName");
       LinkedHashMap d = kf0.d;
       if ((okf0 = d.get(p0)) == null) {
          String str = "TLS_";
          boolean b = false;
          if (av6.D0(p0, str, b)) {
             str = p0.substring(4);
             co5.l(str, "this as java.lang.String\).substring\(startIndex\)");
             str = co5.K(str, "SSL_");
          }else if(av6.D0(p0, "SSL_", b)){
             String str1 = p0.substring(4);
             co5.l(str1, "this as java.lang.String\).substring\(startIndex\)");
             str = co5.K(str1, str);
          }else {
             str = p0;
          }
          if ((okf0 = d.get(str)) == null) {
             okf0 = new kf0(p0);
          }
          d.put(p0, okf0);
       }
       return okf0;
    }
    public List y(String p0){
       String str = "hostname";
       try{
          co5.o(p0, str);
          InetAddress[] allByName = InetAddress.getAllByName(p0);
          co5.l(allByName, "getAllByName\(hostname\)");
          return uk.t0(allByName);
       }catch(java.lang.NullPointerException e0){
          UnknownHostException unknownHostE = new UnknownHostException(co5.K(p0, "Broken system behaviour for dns lookup of "));
          unknownHostE.initCause(e0);
          throw unknownHostE;
       }
    }
}
