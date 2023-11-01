package p.ec1;
import java.io.Closeable;
import java.io.Flushable;
import p.ts5;
import java.lang.String;
import p.yg3;
import p.m95;
import p.j71;
import java.lang.Object;
import java.util.LinkedHashMap;
import p.yv6;
import p.me3;
import p.zw0;
import p.xw0;
import p.vv7;
import p.kt0;
import p.gg1;
import p.ww0;
import p.vw0;
import p.pe3;
import p.ac1;
import java.lang.IllegalArgumentException;
import p.tb1;
import p.wb1;
import p.co5;
import java.util.ArrayList;
import p.c42;
import p.el6;
import p.r;
import p.i51;
import java.lang.Long;
import java.util.AbstractMap;
import p.f70;
import java.lang.IllegalStateException;
import java.lang.Class;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.StringBuilder;
import p.eb3;
import p.bc1;
import p.au0;
import p.cx0;
import p.sn2;
import p.ng2;
import p.uq6;
import p.io2;
import java.util.Collection;
import p.ye7;
import p.gp5;
import p.p02;
import p.cc1;
import p.zf2;
import p.xe7;
import java.util.Iterator;
import p.nn6;
import p.hp5;
import p.jc7;
import java.io.IOException;
import java.lang.Throwable;
import p.av6;
import java.util.Map;
import java.util.List;
import p.yb1;

public final class ec1 implements Closeable, Flushable	// class@00145b from classes.dex
{
    public f70 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final ac1 G;
    public final m95 a;
    public final long b;
    public final m95 c;
    public final m95 t;
    public final m95 v;
    public final LinkedHashMap w;
    public final kt0 x;
    public long y;
    public int z;
    public static final ts5 H;

    static {
       ec1.H = new ts5("[a-z0-9_-]{1,120}");
    }
    public void ec1(yg3 p0,m95 p1,j71 p2,long p3){
       super();
       this.a = p1;
       this.b = p3;
       int i = ((p3) > 0)? 1: 0;
       if (i) {
          this.c = p1.c("journal");
          this.t = p1.c("journal.tmp");
          this.v = p1.c("journal.bkp");
          this.w = new LinkedHashMap(0, 0x3f400000, true);
          xw0 oxw0 = vv7.G(new yv6(null), p2.i0(true));
          if (oxw0.f(gg1.y) == null) {
             oxw0 = oxw0.T(new pe3(null));
          }
          this.x = new kt0(oxw0);
          this.G = new ac1(p0);
          return;
       }else {
          throw new IllegalArgumentException("maxSize <= 0".toString());
       }
    }
    public static final void b(ec1 p0,tb1 p1,boolean p2){
       int i3;
       i51 e;
       _monitor_enter(p0);
       tb1 c = p1.c;
       if (!co5.c(c.g, p1)) {
          throw new IllegalStateException("Check failed.".toString());
       }
       int i = 0;
       int i1 = 2;
       if (p2 && c.f == null) {
          int i2 = 0;
          while (true) {
             if (i2 < i1) {
                if (p1.d[i2] && !p0.G.f(c.d.get(i2))) {
                   p1.a();
                   _monitor_exit(p0);
                   break ;
                }else {
                   i2 = i2 + 1;
                }
             }else {
                for (i3 = 0; i3 < i1; i3++) {
                   m95 om95 = c.d.get(i3);
                   m95 om951 = c.c.get(i3);
                   if (p0.G.f(om95)) {
                      p0.G.b(om95, om951);
                   }else {
                      ec1 g = p0.G;
                      m95 om952 = c.c.get(i3);
                      if (!g.f(om952)) {
                         r.a(g.k(om952));
                      }
                   }
                   long l = c.b[i3];
                   long l1 = ((e = p0.G.h(om951).e) != null)? e.longValue(): 0;
                   c.b[i3] = l1;
                   long l2 = p0.y - l;
                   l2 = l2 + l1;
                   p0.y = l2;
                }
                c.g = null;
                if (c.f != null) {
                   p0.k0(c);
                   _monitor_exit(p0);
                }else {
                   p0.z = p0.z + 1;
                   ec1 a = p0.A;
                   co5.i(a);
                   i2 = 32;
                   if (!p2 && c.e == null) {
                      p0.w.remove(c.a);
                      a.W("REMOVE");
                      a.writeByte(i2);
                      a.W(c.a);
                      a.writeByte(10);
                   }else {
                      c.e = true;
                      a.W("CLEAN");
                      a.writeByte(i2);
                      a.W(c.a);
                      wb1 b = c.b;
                      int len = b.length;
                      for (int i4 = 0; i4 < len; i4 = i4 + 1) {
                         a.writeByte(i2).X(b[i4]);
                      }
                      a.writeByte(10);
                   }
                   a.flush();
                   if ((p0.y - p0.b) <= 0) {
                      if (p0.z >= 2000) {
                         i = 1;
                      }
                      if (!i) {
                      label_011d :
                         _monitor_exit(p0);
                      }
                   }
                   p0.T();
                   goto label_011d ;
                }
             }
          }
       }else {
          for (i3 = 0; i3 < i1; i3++) {
             p0.G.e(c.d.get(i3));
          }
       }
       return;
    }
    public static void m0(String p0){
       ts5 h = ec1.H;
       h.getClass();
       co5.o(p0, "input");
       if (h.a.matcher(p0).matches()) {
          return;
       }
       throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \""+p0+'"'.toString());
    }
    public synchronized final void J(){
       if (this.C != null) {
          return;
       }
       this.G.e(this.t);
       if (this.G.f(this.v)) {
          if (this.G.f(this.c)) {
             this.G.e(this.v);
          }else {
             this.G.b(this.v, this.c);
          }
       }
       if (this.G.f(this.c)) {
          try{
             this.i0();
             this.h0();
             this.C = true;
             return;
          }catch(java.io.IOException e0){
             this.close();
             eb3.j(this.G, this.a);
             this.D = false;
          }
          this.n0();
          this.C = v1;
          return;
       }else {
       }
    }
    public final void T(){
       io2.p(this.x, null, new bc1(this, null), 3);
    }
    public synchronized final void close(){
       wb1 g;
       if (this.C != null && this.D == null) {
          int i = 0;
          wb1[] owb1Array = new wb1[i];
          Object[] objArray = this.w.values().toArray(owb1Array);
          co5.j(objArray, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
          int len = objArray.length;
          while (i < len) {
             if ((g = objArray[i].g) != null) {
                tb1 c = g.c;
                if (co5.c(c.g, g)) {
                   c.f = true;
                }
             }
             i = i + 1;
          }
          this.l0();
          ye7.l(this.x);
          ec1 tA = this.A;
          co5.i(tA);
          tA.close();
          this.A = null;
          this.D = true;
          return;
       }else {
          this.D = true;
          return;
       }
    }
    public final void f(){
       if ((this.D ^ 0x01)) {
          return;
       }
       throw new IllegalStateException("cache is closed".toString());
    }
    public synchronized final void flush(){
       if (this.C == null) {
          return;
       }
       this.f();
       this.l0();
       ec1 tA = this.A;
       co5.i(tA);
       tA.flush();
       return;
    }
    public final gp5 g0(){
       ec1 tG = this.G;
       tG.getClass();
       ec1 tc = this.c;
       co5.o(tc, "file");
       el6 uoel6 = tG.b.a(tc);
       return xe7.d(new p02(uoel6, new cc1(0, this), 0));
    }
    public final void h0(){
       int i;
       Iterator iterator = this.w.values().iterator();
       long l = 0;
       while (iterator.hasNext()) {
          wb1 owb1 = iterator.next();
          if (owb1.g == null) {
             for (i = 0; i < 2; i = i + 1) {
                l = l + owb1.b[i];
             }
          }else {
             owb1.g = null;
             for (; i < 2; i = i + 1) {
                ec1 tG = this.G;
                tG.e(owb1.c.get(i));
                tG.e(owb1.d.get(i));
             }
             iterator.remove();
          }
       }
       this.y = l;
       return;
    }
    public final void i0(){
       String str = ", ";
       hp5 ohp5 = xe7.f(this.G.l(this.c));
       String str1 = ohp5.B();
       String str2 = ohp5.B();
       String str3 = ohp5.B();
       String str4 = ohp5.B();
       String str5 = ohp5.B();
       if (co5.c("libcore.io.DiskLruCache", str1) && co5.c("1", str2)) {
          int i = 1;
          if (co5.c(String.valueOf(i), str3) && co5.c(String.valueOf(2), str4)) {
             int i1 = 0;
             if (str5.length() <= 0) {
                i = 0;
             }
             if (!i) {
                try{
                   while (true) {
                      this.j0(ohp5.B());
                      i1 = i1 + 1;
                   }
                }catch(java.io.EOFException e0){
                   this.z = i1 - this.w.size();
                   if (!ohp5.F()) {
                      this.n0();
                   }else {
                      this.A = this.g0();
                   }
                   jc7 a = jc7.a;
                   ohp5.close();
                   if (!0) {
                      co5.i(a);
                      return;
                   }else {
                      throw 0;
                   }
                }
             }
          }
       }
       throw new IOException("unexpected journal header: ["+str1+str+str2+str+str3+str+str4+str+str5+']');
    }
    public final void j0(String p0){
       String str;
       wb1 owb1;
       char c = ' ';
       int i = 0;
       int i1 = 6;
       int i2 = av6.m0(p0, c, i, i, i1);
       int i3 = -1;
       if (i2 == i3) {
          throw new IOException("unexpected journal line: ".concat(p0));
       }
       int i4 = i2 + 1;
       int i5 = av6.m0(p0, c, i4, i, 4);
       ec1 tw = this.w;
       if (i5 == i3) {
          str = p0.substring(i4);
          co5.l(str, "this as java.lang.String\).substring\(startIndex\)");
          if (i2 == i1 && av6.D0(p0, "REMOVE", i)) {
             tw.remove(str);
             return;
          }
       }else {
          str = p0.substring(i4, i5);
          co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
       }
       if ((owb1 = tw.get(str)) == null) {
          owb1 = new wb1(this, str);
          tw.put(str, owb1);
       }
       if (i5 != i3 && (i2 == 5 && av6.D0(p0, "CLEAN", i))) {
          p0 = p0.substring((i5 + 1));
          co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
          char[] uocharArray = new char[]{c};
          List list = av6.A0(p0, uocharArray);
          owb1.e = true;
          owb1.g = null;
          owb1.i.getClass();
          if (list.size() == 2) {
             try{
                int i6 = list.size();
                for (; i < i6; i = i + 1) {
                   owb1.b[i] = Long.parseLong(list.get(i));
                }
             }catch(java.lang.NumberFormatException e0){
                throw new IOException("unexpected journal line: "+list);
             }
          }else {
             throw new IOException("unexpected journal line: "+list);
          }
       }else if(i5 == i3 && (i2 == 5 && av6.D0(p0, "DIRTY", i))){
          owb1.g = new tb1(this, owb1);
       }else if(i5 == i3 && (i2 == 4 && av6.D0(p0, "READ", i))){
          throw new IOException("unexpected journal line: ".concat(p0));
       }
       return;
    }
    public final void k0(wb1 p0){
       ec1 tA;
       ec1 tA1;
       int i = 10;
       wb1 a = p0.a;
       if (p0.h > null && (tA = this.A) != null) {
          tA.W("DIRTY");
          tA.writeByte(32);
          tA.W(a);
          tA.writeByte(i);
          tA.flush();
       }
       boolean b = true;
       if (p0.h <= null && p0.g == null) {
          for (int i1 = 0; i1 < 2; i1 = i1 + 1) {
             this.G.e(p0.c.get(i1));
             wb1 b1 = p0.b;
             long l = this.y - b1[i1];
             this.y = l;
             b1[i1] = 0;
          }
          this.z = this.z + b;
          if ((tA1 = this.A) != null) {
             tA1.W("REMOVE");
             tA1.writeByte(32);
             tA1.W(a);
             tA1.writeByte(i);
          }
          this.w.remove(a);
          if (this.z < 2000) {
             b = false;
          }
          if (b) {
             this.T();
          }
          return;
       }else {
          p0.f = b;
          return;
       }
    }
    public final void l0(){
       while (true) {
          boolean b = false;
          if ((this.y - this.b) > 0) {
             Iterator iterator = this.w.values().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   wb1 owb1 = iterator.next();
                   if (owb1.f == null) {
                      this.k0(owb1);
                      b = 1;
                   }
                }
                if (!b) {
                   break ;
                }
             }
             return;
          }else {
             this.E = b;
             return;
          }
       }
    }
    public synchronized final void n0(){
       ec1 tA;
       if ((tA = this.A) != null) {
          tA.close();
       }
       gp5 ogp5 = xe7.d(this.G.k(this.t));
       void ovoid = null;
       ogp5.W("libcore.io.DiskLruCache");
       int i = 10;
       ogp5.writeByte(i);
       ogp5.W("1");
       ogp5.writeByte(i);
       ogp5.X((long)1);
       ogp5.writeByte(i);
       ogp5.X((long)2);
       ogp5.writeByte(i);
       ogp5.writeByte(i);
       Iterator iterator = this.w.values().iterator();
       while (iterator.hasNext()) {
          wb1 owb1 = iterator.next();
          if (owb1.g != null) {
             ogp5.W("DIRTY");
             ogp5.writeByte(32);
             ogp5.W(owb1.a);
             ogp5.writeByte(i);
          }else {
             ogp5.W("CLEAN");
             ogp5.writeByte(32);
             ogp5.W(owb1.a);
             owb1 = owb1.b;
             int len = owb1.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                ogp5.writeByte(32);
                ogp5.X(owb1[i1]);
             }
             ogp5.writeByte(i);
          }
       }
       jc7 a = jc7.a;
       ogp5.close();
       if (!ovoid) {
          co5.i(a);
          if (this.G.f(this.c)) {
             this.G.b(this.c, this.v);
             this.G.b(this.t, this.c);
             this.G.e(this.v);
          }else {
             this.G.b(this.t, this.c);
          }
          this.A = this.g0();
          this.z = 0;
          this.B = false;
          this.F = false;
          return;
       }else {
          throw ovoid;
       }
    }
    public synchronized final tb1 x(String p0){
       this.f();
       ec1.m0(p0);
       this.J();
       wb1 owb1 = this.w.get(p0);
       tb1 otb1 = null;
       wb1 g = (owb1 != null)? owb1.g: otb1;
       if (g != null) {
          return otb1;
       }else if(owb1 != null && owb1.h != null){
          return otb1;
       }else if(this.E == null && this.F == null){
          ec1 tA = this.A;
          co5.i(tA);
          tA.W("DIRTY");
          tA.writeByte(32);
          tA.W(p0);
          tA.writeByte(10);
          tA.flush();
          if (this.B != null) {
             return otb1;
          }else if(owb1 == null){
             owb1 = new wb1(this, p0);
             this.w.put(p0, owb1);
          }
          tb1 otb11 = new tb1(this, owb1);
          owb1.g = otb11;
          return otb11;
       }else {
          this.T();
          return otb1;
       }
    }
    public synchronized final yb1 y(String p0){
       wb1 owb1;
       yb1 oyb1;
       this.f();
       ec1.m0(p0);
       this.J();
       if ((owb1 = this.w.get(p0)) == null || (oyb1 = owb1.a()) == null) {
          return null;
       }
       int i = 1;
       this.z = this.z + i;
       ec1 tA = this.A;
       co5.i(tA);
       tA.W("READ");
       tA.writeByte(32);
       tA.W(p0);
       tA.writeByte(10);
       if (this.z < 2000) {
          i = 0;
       }
       if (i) {
          this.T();
       }
       return oyb1;
    }
}
