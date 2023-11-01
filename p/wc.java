package p.wc;
import p.wf2;
import p.gi3;
import java.lang.Object;
import p.st5;
import p.zo;
import p.xo5;
import p.xs6;
import p.qc;
import p.co5;
import java.util.Map;
import p.pl;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Class;
import java.util.List;
import p.np5;
import p.zn2;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import p.gw5;
import java.util.Collection;
import p.dj0;
import p.iw5;
import java.lang.ClassLoader;
import java.lang.String;
import java.util.Enumeration;
import java.util.Collections;
import java.net.URL;
import p.c42;
import p.m95;
import java.io.File;
import java.net.URI;
import p.ir2;
import p.t65;
import p.av6;
import p.cs3;
import p.xg3;
import p.yg3;
import java.lang.Math;
import p.j32;
import p.nn6;
import p.hp5;
import p.xe7;
import p.y97;
import java.io.Closeable;
import java.lang.Throwable;
import p.eb3;
import java.io.IOException;
import java.lang.StringBuilder;
import p.ej4;
import p.ts7;
import java.util.LinkedHashMap;
import p.us7;
import java.lang.IllegalStateException;
import p.ko6;
import p.ti3;
import p.g15;
import p.ot5;
import p.yc;
import p.cm5;
import p.oo0;
import p.vc;
import p.wy6;
import p.pp3;
import p.zo3;
import p.xc;

public final class wc extends gi3 implements wf2	// class@002b10 from classes.dex
{
    public final int a;
    public final Object b;

    public void wc(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super(0);
    }
    public final st5 a(){
       pl opl;
       pl opl1;
       wc tb = this.b;
       switch (this.a){
           case 5:
             break;
           default:
             tb.getClass();
             return null;
       }
       zo d = tb.d;
       xo5 oxo5 = d.b();
       xo5 oxo51 = co5.D(oxo5, d.d.b());
       st5 ost5 = new st5(false, 1200);
       oxo51 = oxo51.b;
       boolean b = ((opl = oxo51.get("remote-configuration-client-android:fetch_inject_ps")) != null && (opl = opl.c) != null)? opl.booleanValue(): ost5.a();
       int i = ((opl1 = oxo51.get("remote-configuration-client-android:reconnect_throttle_seconds")) != null && (opl1 = opl1.d) != null)? opl1.intValue(): ost5.b();
       return new st5(b, i);
    }
    public final List c(){
       ArrayList uArrayList;
       Iterator iterator;
       String str1;
       URL uRL;
       Iterator iterator1;
       ArrayList uArrayList3;
       t65 ot651;
       ArrayList uArrayList4;
       int i;
       hp5 ohp52;
       int i4;
       y97 i4;
       y97 oy97;
       y97 a1;
       cs3 uocs31;
       wc owc = this;
       wc b = owc.b;
       switch (owc.a){
           case 8:
           case 12:
             np5 e = b.e;
             co5.i(e);
             List list = e.a();
             uArrayList = new ArrayList(aj0.b0(list));
             iterator = list.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next());
             }
             return uArrayList;
             break;
           default:
             co5.o(b, "<this>");
             Enumeration resources = b.getResources("");
             co5.l(resources, "getResources\(\"\"\)");
             ArrayList uArrayList1 = Collections.list(resources);
             String str = "list\(this\)";
             co5.l(uArrayList1, str);
             ArrayList uArrayList2 = new ArrayList();
             iterator = uArrayList1.iterator();
             while (true) {
                str1 = "it";
                if (iterator.hasNext()) {
                   uRL = iterator.next();
                   co5.l(uRL, str1);
                   t65 ot65 = (!co5.c(uRL.getProtocol(), "file"))? null: new t65(c42.a, ir2.w(new File(uRL.toURI())));
                   if (ot65 != null) {
                      uArrayList2.add(ot65);
                   }
                }else {
                   break ;
                }
             }
             resources = b.getResources("META-INF/MANIFEST.MF");
             co5.l(resources, "getResources\(\"META-INF/MANIFEST.MF\"\)");
             uArrayList1 = Collections.list(resources);
             co5.l(uArrayList1, str);
             uArrayList = new ArrayList();
             iterator = uArrayList1.iterator();
          label_00bc :
             if (iterator.hasNext()) {
                uRL = iterator.next();
                co5.l(uRL, str1);
                str = uRL.toString();
                co5.l(str, "toString\(\)");
                if (!av6.D0(str, "jar:file:", false) || (i = av6.r0(str, "!", 6)) == -1) {
                   iterator1 = iterator;
                   uArrayList3 = uArrayList;
                   ot651 = null;
                }else {
                   str = str.substring(4, i);
                   co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
                   m95 om95 = ir2.w(new File(URI.create(str)));
                   yg3 a = c42.a;
                   cs3 x = cs3.x;
                   String str2 = "not a zip: size=";
                   co5.o(a, "fileSystem");
                   xg3 oxg3 = a.j(om95);
                   _monitor_enter(oxg3);
                   if ((oxg3.a ^ 1)) {
                      _monitor_exit(oxg3);
                      cs3 uocs3 = x;
                      long l = oxg3.x() - (long)22;
                      long l1 = 0;
                      if ((l - l1) >= 0) {
                         Iterator iterator2 = iterator;
                         long l2 = Math.max((l - 0x10000), l1);
                         while (true) {
                            hp5 ohp5 = xe7.f(oxg3.y(l));
                            if (ohp5.E() == 0x6054b50) {
                               int y97 i1 = ohp5.x() & 0xffff;
                               int i2 = ohp5.x() & 0xffff;
                               l1 = (long)(ohp5.x() & 0xffff);
                               uArrayList3 = uArrayList;
                               String str3 = "unsupported zip: spanned";
                               if (!(l1 - (long)(ohp5.x() & 0xffff)) && (!i1 && !i2)) {
                                  ohp5.skip(4);
                                  i1 = new y97(l1, ((long)ohp5.E() & 0xffffffff), (ohp5.x() & 0xffff));
                                  ohp5.y((long)i1.c);
                                  ohp5.close();
                                  l = l - (long)20;
                                  l1 = 0;
                                  if ((l - l1) > 0) {
                                     hp5 ohp51 = xe7.f(oxg3.y(l));
                                     if (ohp51.E() == 0x7064b50) {
                                        int i3 = ohp51.E();
                                        long l3 = ohp51.N();
                                        if (ohp51.E() == 1 && !i3) {
                                           ohp52 = xe7.f(oxg3.y(l3));
                                           i4 = ohp52.E();
                                           i2 = 0x6064b50;
                                           if (i4 == i2) {
                                              ohp52.skip(12);
                                              i4 = ohp52.E();
                                              i2 = ohp52.E();
                                              l2 = ohp52.N();
                                              if (!(l2 - ohp52.N()) && (!i4 && !i2)) {
                                                 ohp52.skip(8);
                                                 i4 = new y97(l2, ohp52.N(), i1.c);
                                                 eb3.d(ohp52, null);
                                                 oy97 = i4;
                                              }else {
                                                 throw new IOException(str3);
                                              }
                                           }else {
                                              throw new IOException("bad zip: expected "+ej4.D(i2)+" but was "+ej4.D(i4));
                                           }
                                        }else {
                                           throw new IOException(str3);
                                        }
                                     }
                                     eb3.d(ohp51, null);
                                  }
                                  ArrayList uArrayList5 = new ArrayList();
                                  ohp52 = xe7.f(oxg3.y(oy97.b));
                                  a1 = oy97.a;
                                  while (true) {
                                     if ((l1 - a1) < 0) {
                                        ts7 ots7 = ej4.E0(ohp52);
                                        iterator1 = iterator2;
                                        i4 = a1;
                                        if ((ots7.g - oy97.b) < 0) {
                                           uocs31 = uocs3;
                                           if (uocs31.invoke(ots7).booleanValue()) {
                                              uArrayList5.add(ots7);
                                           }
                                           l1 = l1 + 1;
                                           uocs3 = uocs31;
                                           iterator2 = iterator1;
                                           a1 = i4;
                                        }else {
                                        }
                                     }else {
                                        iterator1 = iterator2;
                                        eb3.d(ohp52, null);
                                        eb3.d(oxg3, null);
                                        ot651 = new t65(new us7(om95, a, ej4.d(uArrayList5)), iw5.c);
                                     }
                                  }
                                  throw new IOException("bad zip: local file header offset >= central directory offset");
                               }else {
                                  throw new IOException(str3);
                               }
                            }else {
                               uArrayList4 = uArrayList;
                               iterator1 = iterator2;
                               uocs31 = uocs3;
                               ohp5.close();
                               l = l - 1;
                               if ((l - l2) >= 0) {
                                  uocs3 = uocs31;
                                  uArrayList = uArrayList4;
                                  iterator2 = iterator1;
                                  a1 = 1;
                               }else {
                                  throw new IOException("not a zip: end of central directory signature not found");
                               }
                            }
                         }
                         return dj0.u0(uArrayList, uArrayList2);
                      }else {
                         throw new IOException(str2+oxg3.size());
                      }
                   }else {
                      throw new IllegalStateException("closed".toString());
                   }
                }
                uArrayList4 = uArrayList3;
                if (ot651 != null) {
                   uArrayList4.add(ot651);
                }
                uArrayList = uArrayList4;
                iterator = iterator1;
                goto label_00bc ;
             }else {
             }
       }
       return dj0.C0(b.c);
    }
    public final Object invoke(){
       xc a;
       zo3 b;
       pp3 g;
       wy6 b1;
       vc b2;
       ot5 b3;
       cm5 uocm5 = null;
       wc tb = this.b;
       switch (this.a){
           case 0:
             if ((a = tb.a) != null) {
                uocm5 = a.a(new yc(tb, 5));
             }
             return uocm5;
             break;
           case 1:
             if ((b = tb.b) != null) {
                uocm5 = b.a(new yc(tb, 6));
             }
             return uocm5;
             break;
           case 2:
             if ((g = tb.g) != null) {
                uocm5 = g.a(new yc(tb, 7));
             }
             return uocm5;
             break;
           case 3:
             if ((b1 = tb.b) != null) {
                uocm5 = b1.a(new yc(tb, 8));
             }
             return uocm5;
             break;
           case 4:
             if ((b2 = tb.b) != null) {
                uocm5 = b2.a(new yc(tb, 9));
             }
             return uocm5;
             break;
           case 5:
             return this.a();
           case 6:
             return this.a();
           case 7:
             if ((b3 = tb.b) != null) {
                uocm5 = b3.a(new yc(tb, 11));
             }
             return uocm5;
             break;
           case 8:
             return this.c();
           case 9:
             return tb.get();
           case 10:
             return xe7.D(tb);
           case 11:
             return tb;
           case 12:
             return this.c();
           default:
             return this.c();
       }
    }
}
