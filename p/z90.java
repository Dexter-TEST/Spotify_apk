package p.z90;
import p.pb3;
import java.lang.Object;
import p.ob3;
import p.cx5;
import p.yp5;
import p.co5;
import p.l67;
import p.bv5;
import java.lang.System;
import p.i70;
import p.lp5;
import java.lang.Class;
import java.lang.String;
import p.lw1;
import p.is7;
import p.mp2;
import p.av6;
import p.ax5;
import java.io.IOException;
import p.fv5;
import p.el6;
import p.jw1;
import p.gp5;
import p.xe7;
import p.f70;
import p.np5;
import p.we7;
import p.nn6;
import p.kw1;
import p.ex5;
import p.hp5;
import p.fx5;
import java.net.ProtocolException;
import java.lang.StringBuilder;
import p.kg4;
import java.lang.Long;

public final class z90 implements pb3	// class@0003ef from classes2.dex
{
    public final boolean a;

    public void z90(boolean p0){
       this.a = p0;
    }
    public final cx5 intercept(ob3 p0){
       ax5 uoax5;
       IOException iOException;
       cx5 t;
       ax5 oyp51;
       cx5 uocx51;
       cx5 x;
       long l2;
       long l3;
       String str = "call";
       yp5 oyp5 = p0;
       yp5 d = oyp5.d;
       co5.i(d);
       l67 e = d.e;
       l67 c = d.c;
       l67 b = d.b;
       oyp5 = oyp5.e;
       bv5 d1 = oyp5.d;
       long l = System.currentTimeMillis();
       try{
          c.getClass();
          co5.o(b, str);
          e.f(oyp5);
          c.getClass();
          co5.o(b, str);
          boolean b1 = true;
          boolean b2 = false;
          l67 f = d.f;
          if (is7.v(oyp5.b) && d1 != null) {
             if (av6.i0("100-continue", oyp5.c.a("Expect"), b1)) {
                try{
                   e.c();
                   uoax5 = d.c(b1);
                   d.d();
                   b1 = 0;
                }catch(java.io.IOException e0){
                   c.getClass();
                   co5.o(b, str);
                   d.f(e0);
                   throw e0;
                }
             }else {
                uoax5 = null;
                l3 = 1;
             }
             if (uoax5 == null) {
                d.a = b2;
                bv5 d2 = oyp5.d;
                co5.i(d2);
                long l1 = d2.a();
                c.getClass();
                co5.o(b, str);
                gp5 ogp5 = xe7.d(new jw1(d, e.a(oyp5, l1), l1));
                d1.d(ogp5);
                ogp5.close();
             }else {
                b.i(d, true, false, null);
                iOException = (f.g != null)? 1: 0;
                if (!iOException) {
                   e.h().l();
                }
             }
             iOException = null;
             b2 = false;
          }else {
             uoax5 = null;
             b1 = true;
             b2 = false;
             b.i(d, b1, b2, uoax5);
             iOException = uoax5;
          }
          try{
             e.b();
             if (uoax5 == null) {
                uoax5 = d.c(b2);
                co5.i(uoax5);
                if (b1) {
                   d.d();
                   b1 = false;
                }
             }
             uoax5.a = oyp5;
             uoax5.e = f.e;
             uoax5.k = l;
             uoax5.l = System.currentTimeMillis();
             cx5 uocx5 = uoax5.a();
             if ((t = uocx5.t) == 100) {
                uoax5 = d.c(false);
                co5.i(uoax5);
                if (b1) {
                   d.d();
                }
                uoax5.a = oyp5;
                uoax5.e = f.e;
                uoax5.k = l;
                uoax5.l = System.currentTimeMillis();
                uocx5 = uoax5.a();
                t = uocx5.t;
             }
             c.getClass();
             co5.o(b, str);
             if (this.a != null && t == 101) {
                oyp51 = new ax5(uocx5);
                oyp51.g = we7.c;
                uocx51 = oyp51.a();
             }else {
                try{
                   oyp51 = new ax5(uocx5);
                   l3 = e.e(uocx5);
                   oyp51.g = new ex5(cx5.f(uocx5, "Content-Type"), l3, xe7.f(new kw1(d, e.d(uocx5), l3)));
                   uocx51 = oyp51.a();
                }catch(java.io.IOException e0){
                   c.getClass();
                   co5.o(b, str);
                   d.f(e0);
                   throw e0;
                }
             }
             StringBuilder str1 = "Connection";
             String str2 = "close";
             if (av6.i0(str2, uocx51.a.c.a(str1), true) || av6.i0(str2, cx5.f(uocx51, str1), true)) {
                e.h().l();
             }
             if (t == 204 || t == 205) {
                str1 = ((x = uocx51.x) == null)? -1: x.f();
                if ((str1) > 0) {
                   str1 = kg4.r("HTTP ", t, " had non-zero Content-Length: ");
                   if (x != null) {
                      iOException = Long.valueOf(x.f());
                   }
                   throw new ProtocolException(str1+iOException);
                }
             }
             return uocx51;
          }catch(java.io.IOException e0){
             c.getClass();
             co5.o(b, str);
             d.f(e0);
             throw e0;
          }
       }catch(java.io.IOException e0){
          c.getClass();
          co5.o(b, str);
          d.f(e0);
          throw e0;
       }
    }
}
