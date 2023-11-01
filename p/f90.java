package p.f90;
import p.pb3;
import p.gg1;
import p.a90;
import java.lang.Object;
import p.ob3;
import p.cx5;
import p.yp5;
import java.lang.String;
import p.co5;
import p.bv5;
import p.ps2;
import p.fv1;
import p.xb1;
import p.dc1;
import p.w80;
import java.util.List;
import p.nn6;
import p.mp2;
import p.zu5;
import p.fv5;
import p.sm2;
import p.ax5;
import p.v80;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.io.Closeable;
import p.we7;
import java.lang.System;
import p.av6;
import java.util.Date;
import p.t51;
import p.k90;
import p.c90;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import java.lang.Long;
import java.lang.StringBuilder;
import java.util.LinkedHashMap;
import java.util.Map;
import p.q14;
import p.ml1;
import java.util.Collections;
import java.lang.IllegalStateException;
import p.lp5;
import p.sm5;
import p.fx5;
import java.lang.Class;
import p.tb1;
import java.lang.NullPointerException;
import p.es2;
import p.y80;
import p.g70;
import p.el6;
import p.gp5;
import p.xe7;
import p.e90;
import p.ex5;
import p.hp5;

public final class f90 implements pb3	// class@0001ed from classes2.dex
{
    public final a90 a;

    static {
       gg1 ogg1 = new gg1();
    }
    public void f90(a90 p0){
       this.a = p0;
    }
    public final cx5 intercept(ob3 p0){
       cx5 uocx5;
       cx5 b;
       cx5 c;
       cx5 w;
       int i3;
       Date uDate;
       Date uDate1;
       Date uDate2;
       int i4;
       int i5;
       int i6;
       String str1;
       int i8;
       cx5 uocx51;
       int b1;
       k90 ok90;
       yp5 oyp51;
       k90 ok901;
       bv5 uobv5;
       f90 a3;
       cx5 x;
       long l1;
       ax5 x1;
       cx5 a21;
       cx5 w1;
       String str2;
       String str4;
       tb1 otb1;
       c90 uoc902;
       String str6;
       long l2;
       c90 c1;
       long l3;
       String str7;
       String str8;
       LinkedHashMap str8;
       bv5 a6;
       ml1 a7;
       String str9;
       Long longx;
       ps2 g;
       long l4;
       xb1 oxb1;
       Set set;
       yp5 oyp5 = p0;
       yp5 a = oyp5.a;
       f90 a1 = this.a;
       fv5 uofv5 = null;
       int i = 0;
       if (a1 == null) {
          uocx5 = uofv5;
       }else {
          yp5 e2 = oyp5.e;
          co5.o(e2, "request");
          a6 = e2.a;
          String str11 = fv1.x(a6);
          try{
             if ((oxb1 = a1.a.y(str11)) != null) {
                w80 ow801 = new w80(oxb1.c.get(i));
                w80 b6 = ow801.b;
                w80 c4 = ow801.c;
                w80 a8 = ow801.a;
                w80 g1 = ow801.g;
                zu5 i12 = new zu5();
                co5.o(a8, "url");
                i12.a = a8;
                i12.e(c4, uofv5);
                co5.o(b6, "headers");
                i12.c = b6.d();
                ax5 uoax51 = new ax5();
                uoax51.a = i12.b();
                w80 d1 = ow801.d;
                co5.o(d1, "protocol");
                uoax51.b = d1;
                uoax51.c = ow801.e;
                d1 = ow801.f;
                co5.o(d1, "message");
                uoax51.d = d1;
                uoax51.c(g1);
                uoax51.g = new v80(oxb1, g1.a("Content-Type"), g1.a("Content-Length"));
                uoax51.e = ow801.h;
                uoax51.k = ow801.i;
                uoax51.l = ow801.j;
                uocx5 = uoax51.a();
                if (co5.c(a8, a6) && co5.c(c4, e2.b)) {
                   set = fv1.B(uocx5.w);
                   if (!set.isEmpty()) {
                      Iterator iterator = set.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            str7 = iterator.next();
                            List list = b6.k(str7);
                            int b7 = co5.c(list, e2.c.k(str7));
                            if (b7 = b7 ^ 1) {
                               iterator = 0;
                               break ;
                            }
                         }
                      }
                      if (set) {
                         set = 1;
                      label_00e3 :
                         if (!set) {
                            if ((uocx5 = uocx5.x) != null) {
                               we7.d(uocx5);
                            }
                         }
                      }
                   }
                   set = 1;
                }
                set = 0;
                goto label_00e3 ;
             }
          }catch(java.io.IOException e0){
          }catch(java.io.IOException e0){
             we7.d(uocx5);
          }
          uocx5 = null;
       }
       long l = System.currentTimeMillis();
       yp5 e = oyp5.e;
       co5.o(e, "request");
       if (uocx5 != null) {
          b = uocx5.B;
          c = uocx5.C;
          w = uocx5.w;
          int i1 = w.a.length / 2;
          int i2 = 0;
          i3 = -1;
          uDate = null;
          uDate1 = null;
          uDate2 = null;
          i4 = 0;
          i5 = 0;
          i6 = 0;
          while (i2 < i1) {
             int i7 = i2 + 1;
             String str = w.c(i2);
             str1 = w.g(i2);
             i8 = i3;
             uocx51 = b;
             b1 = true;
             if (av6.i0(str, "Date", b1)) {
                uDate = t51.a(str1);
                i6 = str1;
             }else if(av6.i0(str, "Expires", b1)){
                uDate1 = t51.a(str1);
             }else if(av6.i0(str, "Last-Modified", b1)){
                uDate2 = t51.a(str1);
                i5 = str1;
             }else if(av6.i0(str, "ETag", b1)){
                i4 = str1;
             }else if(av6.i0(str, "Age", b1)){
                i3 = we7.y(-1, str1);
             label_0171 :
                i2 = i7;
                b = uocx51;
             }
             i3 = i8;
             goto label_0171 ;
          }
          uocx51 = b;
       }else {
          i3 = -1;
          l4 = 0;
          l3 = 0;
          uDate = null;
          uDate1 = null;
          uDate2 = null;
          str9 = null;
          i5 = 0;
          i6 = 0;
       }
       if (uocx5 == null) {
          ok90 = new k90(e, null);
       label_01b1 :
          oyp51 = oyp5;
       label_0370 :
          ok901 = ok90;
          uobv5 = null;
       }else {
          cx5 uocx53 = null;
          if (e.a.j != null && uocx5.v == null) {
             ok90 = new k90(e, uocx53);
             goto label_01b1 ;
          }else if(!gg1.J(e, uocx5)){
             ok90 = new k90(e, uocx53);
             goto label_01b1 ;
          }else {
             c90 uoc90 = e.a();
             if (uoc90.a == null) {
                str1 = "If-Modified-Since";
                String str5 = "If-None-Match";
                c90 uoc901 = (e.c.a(str1) == null && e.c.a(str5) == null)? 0: 1;
                if (!w) {
                   uoc901 = uocx5.b();
                   if (uDate != null) {
                      oyp51 = oyp5;
                      uoc902 = uoc901;
                      str6 = str5;
                      l2 = Math.max(0, (c - uDate.getTime()));
                   }else {
                      oyp51 = oyp5;
                      uoc902 = uoc901;
                      str6 = str5;
                      l2 = 0;
                   }
                   if (i3 != -1) {
                      str5 = str1;
                      l2 = Math.max(l2, TimeUnit.SECONDS.toMillis((long)i3));
                   }else {
                      str5 = str1;
                   }
                   l2 = (l2 + (c - b)) + (l - c);
                   if ((c1 = uocx5.b().c) != -1) {
                      l = TimeUnit.SECONDS.toMillis((long)c1);
                   label_0241 :
                      l1 = l;
                      l = 0;
                   }else if(uDate1 != null){
                      longx = (uDate == null)? null: Long.valueOf(uDate.getTime());
                      if (longx != null) {
                         l3 = longx.longValue();
                      }
                      l = uDate1.getTime() - c;
                      if ((l) > 0) {
                         goto label_0241 ;
                      }
                   }else if(uDate2 != null){
                      if ((g = uocx5.a.a.g) == null) {
                         g = 0;
                      }else {
                         str7 = "";
                         gg1.X(g, str7);
                         String str10 = str7;
                      }
                      if (g == null) {
                         longx = (uDate == null)? null: Long.valueOf(uDate.getTime());
                         if (longx != null) {
                            l4 = longx.longValue();
                         }
                         l4 = b - uDate2.getTime();
                         l = 0;
                         if ((l4 - l) > 0) {
                            l1 = l4 / (long)10;
                         }else {
                         label_0285 :
                            l1 = l;
                         }
                      }
                   }
                   l = 0;
                   goto label_0285 ;
                   c90 c2 = uoc90.c;
                   str4 = -1;
                   if (c2 != str4) {
                      l1 = Math.min(l1, TimeUnit.SECONDS.toMillis((long)c2));
                   }
                   l3 = ((c2 = uoc90.i) != str4)? TimeUnit.SECONDS.toMillis((long)c2): l;
                   c2 = uoc902;
                   if (c2.g == null && (uoc90 = uoc90.h) != str4) {
                      str4 = str5;
                      l = TimeUnit.SECONDS.toMillis((long)uoc90);
                   }else {
                      str4 = str5;
                   }
                   if (c2.a == null) {
                      l3 = l3 + l2;
                      if ((l3 - (l + l1)) < 0) {
                         ax5 uoax5 = new ax5(uocx5);
                         str7 = "Warning";
                         if ((l3 - l1) >= 0) {
                            uoax5.f.b(str7, "110 HttpURLConnection \"Response is stale\"");
                         }
                         if ((l2 - 0x5265c00) > 0) {
                            l2 = (uocx5.b().c == -1 && uDate1 == null)? 1: 0;
                            if (l2) {
                               uoax5.f.b(str7, "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                         }
                         bv5 uobv51 = null;
                         ok901 = new k90(uobv51, uoax5.a());
                         uobv5 = uobv51;
                      }
                   }
                   if (i4 != null) {
                      str8 = i4;
                      str1 = str6;
                   }else if(uDate2 != null){
                      str9 = i5;
                   }else if(uDate != null){
                      str9 = i6;
                   }else {
                      uocx53 = null;
                      ok901 = new k90(e, uocx53);
                   }
                   str1 = str4;
                   str8 = str9;
                   sm2 bv5 c3 = e.c;
                   sm2 osm21 = c3.d();
                   co5.i(str8);
                   osm21.d(str1, str8);
                   str8 = new LinkedHashMap();
                   bv5 b5 = e.b;
                   bv5 d = e.d;
                   bv5 e1 = e.e;
                   str8 = (e1.isEmpty())? new LinkedHashMap(): q14.t0(e1);
                   c3.d();
                   c3 = osm21.e().d();
                   if ((a6 = e.a) != null) {
                      mp2 omp2 = c3.e();
                      if (str8.isEmpty()) {
                         a7 = ml1.a;
                      }else {
                         a7 = Collections.unmodifiableMap(new LinkedHashMap(str8));
                         co5.l(a7, "{\n    Collections.unmodi…(LinkedHashMap\(this\)\)\n  }");
                      }
                      uobv5 = new bv5(a6, b5, omp2, d, a7);
                      ok90 = new k90(a7, uocx5);
                      goto label_0370 ;
                   }else {
                      throw new IllegalStateException("url == null".toString());
                   }
                }
             }
             oyp51 = oyp5;
             uocx53 = null;
             ok901 = new k90(e, uocx53);
          }
       }
       if (ok901.a != null && e.a().j != null) {
          ok901 = new k90(uobv5, uobv5);
       }
       k90 yp5 a2 = ok901.a;
       ok90 = ok901.b;
       f90 uof90 = this;
       if ((a3 = uof90.a) != null) {
          _monitor_enter(a3);
          if (ok901.a == null) {
             ok901 = ok901.b;
          }
          _monitor_exit(a3);
       }
       if (uocx5 != null && (ok90 == null && (x = uocx5.x) != null)) {
          we7.d(x);
       }
       l1 = -1;
       if (a2 == null && ok90 == null) {
          x1 = new ax5();
          a2 = oyp51.e;
          co5.o(a2, "request");
          x1.a = a2;
          x1.b = sm5.c;
          x1.c = 504;
          x1.d = "Unsatisfiable Request \(only-if-cached\)";
          x1.g = we7.c;
          x1.k = l1;
          x1.l = System.currentTimeMillis();
          co5.o(a, "call");
          return x1.a();
       }else if(a2 == null){
          co5.i(ok90);
          x1 = new ax5(ok90);
          a21 = gg1.e(ok90);
          ax5.b("cacheResponse", a21);
          x1.i = a21;
          co5.o(a, "call");
          return x1.a();
       }else if(ok90 != null){
          co5.o(a, "call");
       }else if(uof90.a != null){
          co5.o(a, "call");
       }
       x = p0.b(a2);
       if (ok90 != null) {
          uocx5 = (x.t == 304)? 1: 0;
          if (uocx5) {
             ax5 a22 = new ax5(ok90);
             uocx5 = ok90.w;
             w1 = x.w;
             sm2 osm2 = new sm2();
             i3 = uocx5.a.length / 2;
             b1 = 0;
             while (b1 < i3) {
                int i9 = b1 + 1;
                str2 = uocx5.c(b1);
                String str3 = uocx5.g(b1);
                if (av6.i0("Warning", str2, true)) {
                   if (!av6.D0(str3, "1", false)) {
                   label_0472 :
                      int i10 = (!av6.i0("Content-Length", str2, true) && (!av6.i0("Content-Encoding", str2, true) && !av6.i0("Content-Type", str2, true)))? 0: 1;
                      if (i10 || (!gg1.L(str2) || w1.a(str2) == null)) {
                         osm2.d(str2, str3);
                      }
                   }
                }else {
                   w = 0;
                   goto label_0472 ;
                }
                b1 = i9;
             }
             int i11 = w1.a.length / 2;
             i8 = 0;
             while (i8 < i11) {
                b1 = i8 + 1;
                str4 = w1.c(i8);
                str2 = (!av6.i0("Content-Length", str4, true) && (!av6.i0("Content-Encoding", str4, true) && !av6.i0("Content-Type", str4, true)))? 0: 1;
                if (!str2 && gg1.L(str4)) {
                   osm2.d(str4, w1.g(i8));
                }
                i3 = b1;
             }
             a22.c(osm2.e());
             a22.k = x.B;
             a22.l = x.C;
             uocx5 = gg1.e(ok90);
             ax5.b("cacheResponse", uocx5);
             a22.i = uocx5;
             uocx5 = gg1.e(x);
             ax5.b("networkResponse", uocx5);
             a22.h = uocx5;
             a21 = a22.a();
             x = x.x;
             co5.i(x);
             x.close();
             f90 a4 = uof90.a;
             co5.i(a4);
             a4.b();
             uof90.a.getClass();
             w80 ow80 = new w80(a21);
             if ((uocx5 = ok90.x) != null) {
                v80 b2 = uocx5.b;
                try{
                   if ((otb1 = b2.t.x(b2.a, b2.b)) != null) {
                      try{
                         ow80.c(otb1);
                         otb1.b();
                      }catch(java.io.IOException e0){
                         if (otb1) {
                            otb1.a();
                         }
                      }
                   }
                   co5.o(a, "call");
                   return a21;
                }catch(java.io.IOException e0){
                   otb1 = uobv5;
                }catch(java.io.IOException e0){
                }
             }else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
             }
          }else {
             w = 0;
             if ((uocx5 = ok90.x) != null) {
                we7.d(uocx5);
             }
          }
       }else {
          w = 0;
       }
       try{
          ax5 uocx52 = new ax5(x);
          w1 = gg1.e(ok90);
          ax5.b("cacheResponse", w1);
          uocx52.i = w1;
          x = gg1.e(x);
          ax5.b("networkResponse", x);
          uocx52.h = x;
          x = uocx52.a();
          if (uof90.a != null) {
             if (es2.a(x) && gg1.J(a2, x)) {
                f90 a23 = uof90.a;
                a23.getClass();
                uocx5 = x.a;
                bv5 w80 b3 = uocx5.b;
                co5.o(b3, "method");
                if (co5.c(b3, "POST") || (co5.c(b3, "PATCH") || (co5.c(b3, "PUT") || (co5.c(b3, "DELETE") || co5.c(b3, "MOVE"))))) {
                   w = 1;
                }
                try{
                   if (w) {
                      try{
                         a23.a.l0(fv1.x(uocx5.a));
                      }catch(java.io.IOException e0){
                      }
                   }else if(!co5.c(b3, "GET") || fv1.B(x.w).contains("*")){
                      try{
                         b3 = new w80(x);
                         if ((otb1 = a23.a.x(fv1.x(uocx5.a), l1)) != null) {
                            b3.c(otb1);
                            y80 oy80 = new y80(a23, otb1);
                         label_0615 :
                            if (b3 != null) {
                               uocx5 = e0.x;
                               co5.i(uocx5);
                               uocx52 = new ax5(e0);
                               uocx52.g = new ex5(cx5.f(e0, "Content-Type"), e0.x.f(), xe7.f(new e90(uocx5.y(), b3, xe7.d(b3.c))));
                               x = uocx52.a();
                            }
                            if (ok90 != null) {
                               co5.o(a, "call");
                            }
                            return e0;
                         }
                      }catch(java.io.IOException e0){
                         otb1 = uobv5;
                         if (otb1) {
                            otb1.a();
                         }
                      }catch(java.io.IOException e0){
                      }
                   }
                   b3 = uobv5;
                   goto label_0615 ;
                }catch(java.io.IOException e0){
                }
             }else {
                bv5 b4 = a2.b;
                co5.o(b4, "method");
                ok90 = (!co5.c(b4, "POST") && (!co5.c(b4, "PATCH") && (!co5.c(b4, "PUT") && (!co5.c(b4, "DELETE") && !co5.c(b4, "MOVE")))))? 0: 1;
                if (ok90) {
                   f90 a5 = uof90.a;
                   a5.getClass();
                   a5.a.l0(fv1.x(a2.a));
                }
             }
          }
          return e0;
       }catch(java.io.IOException e0){
       }
    }
}
