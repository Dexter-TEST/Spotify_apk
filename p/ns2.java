package p.ns2;
import p.j22;
import p.c90;
import java.lang.String;
import p.u45;
import p.ui3;
import java.lang.Object;
import p.u54;
import p.av6;
import android.webkit.MimeTypeMap;
import p.r;
import p.au0;
import p.ms2;
import p.dx0;
import p.cx5;
import p.eb3;
import java.lang.IllegalStateException;
import p.l90;
import p.en6;
import p.sb1;
import p.rp5;
import p.j80;
import p.ir2;
import p.yb1;
import p.ec1;
import p.qp5;
import p.c42;
import p.m95;
import p.i51;
import java.lang.Long;
import p.qn6;
import p.m32;
import p.q63;
import p.j90;
import p.bv5;
import p.i90;
import p.co5;
import java.lang.Class;
import p.rb1;
import p.fx5;
import p.g70;
import p.pn6;
import java.io.File;
import android.content.Context;
import java.io.Closeable;
import p.ls2;
import android.os.Looper;
import p.r90;
import p.t90;
import p.lp5;
import android.os.NetworkOnMainThreadException;
import p.wb0;
import p.ye7;
import p.cu0;
import p.da0;
import p.zf2;
import p.ds2;
import p.zu5;
import p.sm2;
import p.mp2;
import p.zz6;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import p.nn6;
import p.hp5;
import p.xe7;
import java.lang.Throwable;
import p.io2;
import p.wb1;
import p.tb1;
import p.pp5;
import p.ax5;
import p.qf2;
import p.el6;
import p.gp5;
import p.jc7;
import p.f70;

public final class ns2 implements j22	// class@00203b from classes.dex
{
    public final String a;
    public final u45 b;
    public final ui3 c;
    public final ui3 d;
    public final boolean e;
    public static final c90 f;
    public static final c90 g;

    static {
       c90 v14 = new c90(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
       ns2.f = v14;
       v14 = new c90(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
       ns2.g = v14;
    }
    public void ns2(String p0,u45 p1,ui3 p2,ui3 p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static String d(String p0,u54 p1){
       String str1;
       String str = null;
       p1 = (p1 != null)? p1.a: str;
       if (p1 != null && (!av6.D0(p1, "text/plain", false) || (p0 = r.b(MimeTypeMap.getSingleton(), p0)) == null)) {
          if (p1 != null) {
             str = av6.I0(p1, ';');
          }
          return str;
       }else {
          return p0;
       }
    }
    public final Object a(au0 p0){
       ms2 oms2;
       Closeable uCloseable;
       Closeable uCloseable1;
       ms2 oms21;
       cx5 x1;
       String str1;
       ms2 v;
       ms2 t;
       qp5 oqp5;
       ns2 a1;
       m32 om32;
       i90 oi90;
       sb1 value;
       u45 i5;
       yb1 oyb1;
       i51 e;
       l90 ol90;
       l90 b1;
       qp5 obj;
       ns2 ons2 = this;
       au0 uoau0 = p0;
       if (uoau0 instanceof ms2) {
          oms2 = uoau0;
          ms2 z = oms2.z;
          int i = Integer.MIN_VALUE;
          if ((z & i)) {
             oms2.z = z - i;
             try{
             label_001c :
                ms2 x = oms2.x;
                dx0 a = dx0.a;
                ms2 z1 = oms2.z;
                String str = "response body == null";
                co5 uoco5 = null;
                int i1 = 0;
                int i2 = 2;
                int i3 = 1;
                int i4 = 4;
                if (z1 != null) {
                   try{
                      if (z1 != i3) {
                         if (z1 == i2) {
                            oms2 = oms2.t;
                            try{
                               eb3.G(x);
                               try{
                               label_01bb :
                                  oms21 = x;
                                  oms2.getClass();
                                  if ((x1 = oms21.x) != null) {
                                     File cacheDir = oms2.b.a.getCacheDir();
                                     cacheDir.mkdirs();
                                     pn6 opn6 = new pn6(x1.y(), cacheDir, uoco5);
                                     str1 = ns2.d(oms2.a, x1.x());
                                     if (oms21.y == null) {
                                        i4 = 3;
                                     }
                                     return new qn6(opn6, str1, i4);
                                  }else {
                                     throw new IllegalStateException(str.toString());
                                  }
                               }catch(java.lang.Exception e0){
                                  uCloseable = oms2.w;
                               }catch(java.lang.Exception e0){
                               }
                            }catch(java.lang.Exception e0){
                            }
                         }else {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                         }
                      }else {
                         z1 = oms2.w;
                         v = oms2.v;
                         t = oms2.t;
                         eb3.G(x);
                      }
                   }catch(java.lang.Exception e0){
                   }
                   if (uCloseable1) {
                      r.a(uCloseable1);
                   }
                   throw e0;
                }else {
                   eb3.G(x);
                   ns2 b = ons2.b;
                   ns2 a2 = ons2.a;
                   if (en6.i(b.n) && (value = ons2.d.getValue()) != null) {
                      if ((i5 = b.i) == null) {
                         i5 = a2;
                      }
                      if ((oyb1 = value.b.y(ir2.t(i5).c("SHA-256").e())) != null) {
                         oqp5 = new qp5(oyb1);
                      label_0098 :
                         if (oqp5 != null) {
                            if ((e = this.c().h(oqp5.a.b(0)).e) == null || (e.longValue() - i1)) {
                               if (ons2.e != null) {
                                  ol90 = new j90(this.e(), ons2.f(oqp5)).a();
                                  if (ol90.a == null && (b1 = ol90.b) != null) {
                                     return new qn6(ons2.g(oqp5), ns2.d(a2, b1.b.getValue()), 3);
                                  }
                               }else {
                                  om32 = ons2.g(oqp5);
                                  if ((oi90 = ons2.f(oqp5)) != null) {
                                     uoco5 = oi90.b.getValue();
                                  }
                                  return new qn6(om32, ns2.d(a2, uoco5), 3);
                               }
                            }else {
                               return new qn6(ons2.g(oqp5), ns2.d(a2, uoco5), 3);
                            }
                         }else {
                            ol90 = new j90(this.e(), uoco5).a();
                         }
                         l90 a3 = ol90.a;
                         co5.i(a3);
                         oms2.t = ons2;
                         oms2.v = oqp5;
                         oms2.w = ol90;
                         oms2.z = i3;
                         if ((obj = ons2.b(a3, oms2)) == a) {
                            return a;
                         }else {
                            a2 = ons2;
                            l90 ol901 = ol90;
                            x = obj;
                            obj = oqp5;
                         }
                      }
                   }
                   co5 uoco51 = uoco5;
                   goto label_0098 ;
                }
                oms21 = x;
                t.getClass();
                if ((x1 = oms21.x) != null) {
                   try{
                      oqp5 = t.h(v, z1.a, oms21, z1.b);
                      a1 = t.a;
                      if (oqp5 != null) {
                         om32 = t.g(oqp5);
                         if ((oi90 = t.f(oqp5)) != null) {
                            uoco5 = oi90.b.getValue();
                         }
                         return new qn6(om32, ns2.d(a1, uoco5), i4);
                      }else if((x1.f() - i1) > 0){
                         File cacheDir1 = t.b.a.getCacheDir();
                         cacheDir1.mkdirs();
                         pn6 opn61 = new pn6(x1.y(), cacheDir1, uoco5);
                         str1 = ns2.d(a1, x1.x());
                         if (oms21.y == null) {
                            i4 = 3;
                         }
                         return new qn6(opn61, str1, i4);
                      }else {
                         r.a(oms21);
                         oms2.t = t;
                         oms2.v = oqp5;
                         oms2.w = oms21;
                         oms2.z = i2;
                         if ((x = t.b(t.e(), oms2)) == a) {
                            return a;
                         }else {
                            oms2 = t;
                            z = oms21;
                            goto label_01bb ;
                         }
                      }
                   }catch(java.lang.Exception e0){
                   }catch(java.lang.Exception e0){
                      i3 = oqp5;
                   }
                   i = a1;
                   r.a(uCloseable);
                   throw e0;
                }else {
                   throw new IllegalStateException(str.toString());
                }
             }catch(java.lang.Exception e0){
                uCloseable1 = oms2.v;
             }catch(java.lang.Exception e0){
             }
          }
       }
       oms2 = new ms2(ons2, uoau0);
       goto label_001c ;
    }
    public final Object b(bv5 p0,au0 p1){
       ls2 ols2;
       ls2 w1;
       ls2 ols21;
       cx5 x;
       if (p1 instanceof ls2) {
          ols2 = p1;
          ls2 w = ols2.w;
          int i = Integer.MIN_VALUE;
          if ((w & i)) {
             ols2.w = w - i;
          label_0018 :
             ls2 t = ols2.t;
             dx0 a = dx0.a;
             if ((w1 = ols2.w) != null) {
                if (w1 == 1) {
                   eb3.G(t);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                eb3.G(t);
                ns2 tc = this.c;
                if (co5.c(Looper.myLooper(), Looper.getMainLooper())) {
                   if (!en6.i(this.b.o)) {
                      ols21 = tc.getValue().a(p0).f();
                   label_0094 :
                      if (!ols21.x() && ols21.t != 304) {
                         if ((x = ols21.x) != null) {
                            r.a(x);
                         }
                         throw new ds2(ols21);
                      }else {
                         return ols21;
                      }
                   }else {
                      throw new NetworkOnMainThreadException();
                   }
                }else {
                   t90 ot90 = tc.getValue().a(p0);
                   ols2.w = 1;
                   wb0 owb0 = new wb0(1, ye7.E(ols2));
                   owb0.p();
                   cu0 uocu0 = new cu0(ot90, owb0);
                   ot90.e(uocu0);
                   owb0.r(uocu0);
                   if ((t = owb0.o()) == a) {
                      return a;
                   }
                }
             }
             ols21 = t;
             goto label_0094 ;
          }
       }
       ols2 = new ls2(this, p1);
       goto label_0018 ;
    }
    public final c42 c(){
       Object value = this.d.getValue();
       co5.i(value);
       return value.a;
    }
    public final bv5 e(){
       boolean b1;
       zu5 ozu5 = new zu5();
       ozu5.g(this.a);
       ns2 tb = this.b;
       u45 j = tb.j;
       co5.o(j, "headers");
       ozu5.c = j.d();
       Iterator iterator = tb.k.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          co5.j(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
          ozu5.f(key, uEntry.getValue());
       }
       j = tb.n;
       boolean b = en6.i(j);
       if (!(b1 = en6.i(tb.o)) && b) {
          ozu5.c(c90.o);
       }else if(b1 && !b){
          if (en6.k(j)) {
             ozu5.c(c90.n);
          }else {
             ozu5.c(ns2.f);
          }
       }else if(!b1 && !b){
          ozu5.c(ns2.g);
       }
       return ozu5.b();
    }
    public final i90 f(qp5 p0){
       i90 oi90 = null;
       try{
          hp5 ohp5 = xe7.f(this.c().l(p0.a.b(0)));
          i90 oi901 = new i90(ohp5);
          i90 oi902 = oi90;
          ohp5.close();
          if (oi902) {
             throw oi902;
          }
          co5.i(oi901);
          return oi901;
       }catch(java.io.IOException e0){
          return e0;
       }
    }
    public final m32 g(qp5 p0){
       u45 i;
       m95 om95 = p0.a.b(1);
       c42 uoc42 = this.c();
       if ((i = this.b.i) == null) {
          i = this.a;
       }
       return new m32(om95, uoc42, i, p0);
    }
    public final qp5 h(rb1 p0,bv5 p1,cx5 p2,i90 p3){
       int i2;
       tb1 otb1;
       pp5 opp5;
       sb1 value;
       int i = 0;
       int i1 = 1;
       if (en6.k(this.b.n)) {
          if (this.e != null) {
             i2 = (p1.a().b == null && (p2.b().b == null && !co5.c(p2.w.a("Vary"), "*")))? 1: 0;
             if (!i2) {
             label_0037 :
                u45 i3 = 0;
             label_0038 :
                if (!i2) {
                   if (p0 != null) {
                      r.a(p0);
                   }
                   return null;
                }else if(p0 != null){
                   qp5 a = p0.a;
                   yb1 c = a.c;
                   _monitor_enter(c);
                   a.close();
                   otb1 = c.x(a.a.a);
                   _monitor_exit(c);
                   if (otb1 != null) {
                      opp5 = new pp5(otb1);
                   label_0094 :
                      if (opp5 == null) {
                         return null;
                      }else if(p2.t == 304 && p3 != null){
                         ax5 uoax5 = new ax5(p2);
                         uoax5.c(qf2.a(p3.f, p2.w));
                         gp5 ogp5 = xe7.d(this.c().k(opp5.a.e(i)));
                         new i90(uoax5.a()).a(ogp5);
                         jc7 a1 = jc7.a;
                         ogp5.close();
                         if (null == null) {
                            co5.i(a1);
                         }else {
                            throw null;
                         }
                      }else {
                         gp5 ogp51 = xe7.d(this.c().k(opp5.a.e(i)));
                         new i90(p2).a(ogp51);
                         jc7 ojc7 = jc7.a;
                         qp5 oqp5 = null;
                         ogp51.close();
                         if (oqp5 == null) {
                            co5.i(ojc7);
                            ogp51 = xe7.d(this.c().k(opp5.a.e(i1)));
                            cx5 x = p2.x;
                            co5.i(x);
                            Long longx = Long.valueOf(x.y().L(ogp51));
                            ogp51.close();
                            if (null == null) {
                               co5.i(longx);
                            }else {
                               throw null;
                            }
                         }else {
                            throw oqp5;
                         }
                      }
                      r.a(p2);
                      return opp5.a();
                   }
                }else if((value = this.d.getValue()) != null){
                   if ((i3 = this.b.i) == null) {
                      i3 = this.a;
                   }
                   if ((otb1 = value.b.x(ir2.t(i3).c("SHA-256").e())) != null) {
                      opp5 = new pp5(otb1);
                      goto label_0094 ;
                   }
                }
                opp5 = null;
                goto label_0094 ;
             }
          }
          i2 = 1;
          goto label_0038 ;
       }else {
          goto label_0037 ;
       }
    }
}
