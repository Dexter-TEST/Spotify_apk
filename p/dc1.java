package p.dc1;
import java.io.Closeable;
import java.io.Flushable;
import p.ts5;
import java.lang.String;
import java.io.File;
import p.u07;
import p.d42;
import java.lang.Object;
import p.co5;
import java.util.LinkedHashMap;
import p.r07;
import p.we7;
import p.zb1;
import java.lang.IllegalArgumentException;
import java.lang.Class;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.StringBuilder;
import p.b42;
import p.nn;
import java.lang.Throwable;
import p.eb3;
import p.re5;
import java.util.AbstractMap;
import java.lang.IllegalStateException;
import java.util.Collection;
import p.vb1;
import p.tb1;
import p.el6;
import java.lang.NullPointerException;
import java.util.ArrayList;
import java.lang.Integer;
import p.f70;
import p.gp5;
import p.i15;
import java.io.FileOutputStream;
import p.b57;
import java.io.OutputStream;
import p.p02;
import p.cc1;
import p.zf2;
import p.xe7;
import java.util.Iterator;
import p.on;
import p.nn6;
import p.hp5;
import java.io.IOException;
import p.av6;
import java.util.Map;
import java.util.List;
import java.lang.Long;
import p.xb1;

public final class dc1 implements Closeable, Flushable	// class@0001b2 from classes2.dex
{
    public f70 A;
    public final LinkedHashMap B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public long J;
    public final r07 K;
    public final zb1 L;
    public final d42 a;
    public final File b;
    public final int c;
    public final int t;
    public final long v;
    public final File w;
    public final File x;
    public final File y;
    public long z;
    public static final ts5 M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;

    static {
       dc1.M = new ts5("[a-z0-9_-]{1,120}");
       dc1.N = "CLEAN";
       dc1.O = "DIRTY";
       dc1.P = "REMOVE";
       dc1.Q = "READ";
    }
    public void dc1(File p0,long p1,u07 p2){
       co5.o(p2, "taskRunner");
       super();
       this.a = d42.a;
       this.b = p0;
       this.c = 0x31191;
       this.t = 2;
       this.v = p1;
       int i = 0;
       this.B = new LinkedHashMap(i, 0x3f400000, true);
       this.K = p2.f();
       this.L = new zb1(i, this, co5.K(" Cache", we7.g));
       if ((p1) > 0) {
          i = 1;
       }
       if (i) {
          this.w = new File(p0, "journal");
          this.x = new File(p0, "journal.tmp");
          this.y = new File(p0, "journal.bkp");
          return;
       }else {
          throw new IllegalArgumentException("maxSize <= 0".toString());
       }
    }
    public static void o0(String p0){
       ts5 m = dc1.M;
       m.getClass();
       co5.o(p0, "input");
       if (m.a.matcher(p0).matches()) {
          return;
       }
       throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \""+p0+'"'.toString());
    }
    public synchronized final void J(){
       int i;
       boolean b;
       String str = "DiskLruCache ";
       if (this.F != null) {
          return;
       }
       if (this.a.c(this.y)) {
          if (this.a.c(this.w)) {
             this.a.a(this.y);
          }else {
             this.a.d(this.y, this.w);
          }
       }
       dc1 ta = this.a;
       dc1 ty = this.y;
       co5.o(ta, "<this>");
       co5.o(ty, "file");
       nn onn = ta.e(ty);
       try{
          i = 0;
          ta.a(ty);
          eb3.d(onn, i);
          b = true;
       }catch(java.io.IOException e0){
          eb3.d(onn, i);
          b.a(ty);
          b = false;
       }
       this.E = b;
       if (this.a.c(this.w)) {
          try{
             this.i0();
             this.h0();
             this.F = true;
             return;
          }catch(java.io.IOException e1){
             re5.a.getClass();
             re5.i(5, str+this.b+" is corrupt: "+e1.getMessage()+", removing", e1);
             this.close();
             this.a.b(this.b);
             this.G = v5;
          }
          this.k0();
          this.F = v4;
          return;
       }else {
       }
    }
    public final boolean T(){
       dc1 tC;
       boolean b = ((tC = this.C) >= 2000 && tC >= this.B.size())? true: false;
       return b;
    }
    public synchronized final void b(){
       if ((this.G ^ 0x01)) {
          return;
       }
       throw new IllegalStateException("cache is closed".toString());
    }
    public synchronized final void close(){
       Object[] objArray;
       vb1 g;
       boolean b = true;
       if (this.F != null && this.G == null) {
          Collection uCollection = this.B.values();
          co5.l(uCollection, "lruEntries.values");
          int i = 0;
          vb1[] ovb1Array = new vb1[i];
          if ((objArray = uCollection.toArray(ovb1Array)) == null) {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
          }
          int len = objArray.length;
          while (i < len) {
             i = i + 1;
             if ((g = objArray[i].g) != null && g != null) {
                g.d();
             }
          }
          this.n0();
          dc1 tA = this.A;
          co5.i(tA);
          tA.close();
          this.A = null;
          this.G = b;
          return;
       }else {
          this.G = b;
          return;
       }
    }
    public synchronized final void f(tb1 p0,boolean p1){
       int i1;
       co5.o(p0, "editor");
       tb1 c = p0.c;
       if (!co5.c(c.g, p0)) {
          throw new IllegalStateException("Check failed.".toString());
       }
       int i = 0;
       if (p1 && c.e == null) {
          dc1 tt = this.t;
          i1 = 0;
          while (true) {
             if (i1 < tt) {
                int i2 = i1 + 1;
                tb1 d = p0.d;
                co5.i(d);
                if (d[i1]) {
                   if (!this.a.c(c.d.get(i1))) {
                      p0.a();
                      return;
                   }else {
                      i1 = i2;
                   }
                }else {
                   p0.a();
                   throw new IllegalStateException(co5.K(Integer.valueOf(i1), "Newly created entry didn\'t create value for index "));
                }
             }
          }
       }
       dc1 tt1 = this.t;
       int i3 = 0;
       while (i3 < tt1) {
          i1 = i3 + 1;
          File uFile = c.d.get(i3);
          if (p1 && c.f == null) {
             if (this.a.c(uFile)) {
                File uFile1 = c.c.get(i3);
                this.a.d(uFile, uFile1);
                this.a.getClass();
                long l = uFile1.length();
                c.b[i3] = l;
                long l1 = this.z - c.b[i3];
                l1 = l1 + l;
                this.z = l1;
             }
          }else {
             this.a.a(uFile);
          }
          i3 = i1;
       }
       c.g = null;
       if (c.f != null) {
          this.m0(c);
          return;
       }else {
          i3 = 1;
          this.C = this.C + i3;
          tt1 = this.A;
          co5.i(tt1);
          if (c.e == null && !p1) {
             this.B.remove(c.a);
             tt1.W(dc1.P).writeByte(32);
             tt1.W(c.a);
             tt1.writeByte(10);
          }else {
             c.e = i3;
             tt1.W(dc1.N).writeByte(32);
             tt1.W(c.a);
             vb1 b = c.b;
             i1 = b.length;
             while (i < i1) {
                i = i + 1;
                tt1.writeByte(32).X(b[i]);
             }
             tt1.writeByte(10);
             if (p1) {
                dc1 tJ = this.J;
                this.J = 1 + tJ;
                c.i = tJ;
             }
          }
          tt1.flush();
          if ((this.z - this.v) > 0 || this.T()) {
             r07.d(this.K, this.L);
          }
          return;
       }
    }
    public synchronized final void flush(){
       if (this.F == null) {
          return;
       }
       this.b();
       this.n0();
       dc1 tA = this.A;
       co5.i(tA);
       tA.flush();
       return;
    }
    public final gp5 g0(){
       int i;
       nn onn;
       dc1 tw = this.w;
       this.a.getClass();
       co5.o(tw, "file");
       try{
          i = 1;
          onn = new nn(new FileOutputStream(tw, i), new b57());
       }catch(java.io.FileNotFoundException e0){
          e0.getParentFile().mkdirs();
          onn = new nn(new FileOutputStream(e0, i), new b57());
       }
       return xe7.d(new p02(onn, new cc1(11, this), i));
    }
    public final void h0(){
       int i;
       int i1;
       dc1 ta = this.a;
       ta.a(this.x);
       Iterator iterator = this.B.values().iterator();
       while (iterator.hasNext()) {
          tb1 otb1 = iterator.next();
          co5.l(otb1, "i.next\(\)");
          dc1 tt = this.t;
          if (otb1.g == null) {
             for (i = 0; i < tt; i = i1) {
                i1 = i + 1;
                long l = this.z + otb1.b[i];
                this.z = l;
             }
          }else {
             otb1.g = null;
             for (; i < tt; i = i1) {
                i1 = i + 1;
                ta.a(otb1.c.get(i));
                ta.a(otb1.d.get(i));
             }
             iterator.remove();
          }
       }
       return;
    }
    public final void i0(){
       String str = ", ";
       dc1 tw = this.w;
       this.a.getClass();
       co5.o(tw, "file");
       hp5 ohp5 = xe7.f(xe7.c0(tw));
       String str1 = ohp5.B();
       String str2 = ohp5.B();
       String str3 = ohp5.B();
       String str4 = ohp5.B();
       String str5 = ohp5.B();
       if (co5.c("libcore.io.DiskLruCache", str1) && (co5.c("1", str2) && (co5.c(String.valueOf(this.c), str3) && co5.c(String.valueOf(this.t), str4)))) {
          int i = 0;
          str3 = (str5.length() > 0)? 1: 0;
          if (!str3) {
             try{
                while (true) {
                   this.j0(ohp5.B());
                   i = i + 1;
                }
             }catch(java.io.EOFException e0){
                this.C = i - this.B.size();
                if (!ohp5.F()) {
                   this.k0();
                }else {
                   this.A = this.g0();
                }
                eb3.d(ohp5, null);
                return;
             }
          }
       }
       throw new IOException("unexpected journal header: ["+str1+str+str2+str+str4+str+str5+']');
    }
    public final void j0(String p0){
       String str;
       vb1 ovb1;
       String o;
       char c = ' ';
       int i = 0;
       int i1 = av6.m0(p0, c, i, i, 6);
       int i2 = -1;
       if (i1 == i2) {
          throw new IOException(co5.K(p0, "unexpected journal line: "));
       }
       int i3 = i1 + 1;
       int i4 = av6.m0(p0, c, i3, i, 4);
       dc1 tB = this.B;
       if (i4 == i2) {
          str = p0.substring(i3);
          co5.l(str, "this as java.lang.String\).substring\(startIndex\)");
          String p = dc1.P;
          if (i1 == p.length() && av6.D0(p0, p, i)) {
             tB.remove(str);
             return;
          }
       }else {
          str = p0.substring(i3, i4);
          co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
       }
       if ((ovb1 = tB.get(str)) == null) {
          ovb1 = new vb1(this, str);
          tB.put(str, ovb1);
       }
       if (i4 != i2) {
          str = dc1.N;
          if (i1 == str.length() && av6.D0(p0, str, i)) {
             p0 = p0.substring((i4 + 1));
             co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
             char[] uocharArray = new char[]{c};
             List list = av6.A0(p0, uocharArray);
             ovb1.e = true;
             ovb1.g = null;
             if (list.size() == ovb1.j.t) {
                try{
                   i1 = list.size();
                   for (; i < i1; i = i5) {
                      int i5 = i + 1;
                      ovb1.b[i] = Long.parseLong(list.get(i));
                   }
                }catch(java.lang.NumberFormatException e0){
                   throw new IOException(co5.K(list, "unexpected journal line: "));
                }
             }else {
                throw new IOException(co5.K(list, "unexpected journal line: "));
             }
          }else if(i4 == i2){
             o = dc1.O;
             if (i1 == o.length() && av6.D0(p0, o, i)) {
                ovb1.g = new tb1(this, ovb1);
             }
          }
          if (i4 == i2) {
             o = dc1.Q;
             if (i1 != o.length() || !av6.D0(p0, o, i)) {
             }
          }else {
          }
       }else {
       }
       return;
    }
    public synchronized final void k0(){
       dc1 tA;
       int i1;
       if ((tA = this.A) == null) {
       }else {
          tA.close();
       }
       gp5 ogp5 = xe7.d(this.a.e(this.x));
       ogp5.W("libcore.io.DiskLruCache");
       int i = 10;
       ogp5.writeByte(i);
       ogp5.W("1");
       ogp5.writeByte(i);
       ogp5.X((long)this.c);
       ogp5.writeByte(i);
       ogp5.X((long)this.t);
       ogp5.writeByte(i);
       ogp5.writeByte(i);
       Iterator iterator = this.B.values().iterator();
       while (true) {
          i1 = 0;
          if (iterator.hasNext()) {
             vb1 ovb1 = iterator.next();
             if (ovb1.g != null) {
                ogp5.W(dc1.O);
                ogp5.writeByte(32);
                ogp5.W(ovb1.a);
                ogp5.writeByte(i);
             }else {
                ogp5.W(dc1.N);
                ogp5.writeByte(32);
                ogp5.W(ovb1.a);
                ovb1 = ovb1.b;
                int len = ovb1.length;
                while (i1 < len) {
                   i1 = i1 + 1;
                   ogp5.writeByte(32);
                   ogp5.X(ovb1[i1]);
                }
                ogp5.writeByte(i);
             }
          }else {
             break ;
          }
       }
       eb3.d(ogp5, null);
       if (this.a.c(this.w)) {
          this.a.d(this.w, this.y);
       }
       this.a.d(this.x, this.w);
       this.a.a(this.y);
       this.A = this.g0();
       this.D = i1;
       this.I = i1;
       return;
    }
    public synchronized final void l0(String p0){
       vb1 ovb1;
       co5.o(p0, "key");
       this.J();
       this.b();
       dc1.o0(p0);
       if ((ovb1 = this.B.get(p0)) == null) {
          return;
       }
       this.m0(ovb1);
       if ((this.z - this.v) <= 0) {
          this.H = false;
       }
       return;
    }
    public final void m0(vb1 p0){
       dc1 tA;
       vb1 g;
       dc1 tA1;
       co5.o(p0, "entry");
       vb1 a = p0.a;
       if (this.E == null) {
          if (p0.h > null && (tA = this.A) != null) {
             tA.W(dc1.O);
             tA.writeByte(32);
             tA.W(a);
             tA.writeByte(10);
             tA.flush();
          }
          if (p0.h > null || p0.g != null) {
             p0.f = true;
             return;
          }
       }
       if ((g = p0.g) != null) {
          g.d();
       }
       for (int i = 0; i < this.t; i = i1) {
          int i1 = i + 1;
          this.a.a(p0.c.get(i));
          vb1 b = p0.b;
          long l = this.z - b[i];
          this.z = l;
          b[i] = 0;
       }
       this.C = this.C + true;
       if ((tA1 = this.A) != null) {
          tA1.W(dc1.P);
          tA1.writeByte(32);
          tA1.W(a);
          tA1.writeByte(10);
       }
       this.B.remove(a);
       if (this.T()) {
          r07.d(this.K, this.L);
       }
       return;
    }
    public final void n0(){
       while (true) {
          boolean b = false;
          if ((this.z - this.v) > 0) {
             Iterator iterator = this.B.values().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   vb1 ovb1 = iterator.next();
                   if (ovb1.f == null) {
                      this.m0(ovb1);
                      b = 1;
                   }
                }
                if (!b) {
                   break ;
                }
             }
             return;
          }else {
             this.H = b;
             return;
          }
       }
    }
    public synchronized final tb1 x(String p0,long p1){
       co5.o(p0, "key");
       this.J();
       this.b();
       dc1.o0(p0);
       vb1 ovb1 = this.B.get(p0);
       if ((p1 - -1) && (ovb1 == null && !(ovb1.i - p1))) {
          return null;
       }
       tb1 otb1 = (ovb1 == null)? null: ovb1.g;
       if (otb1 != null) {
          return null;
       }else if(ovb1 != null && ovb1.h != null){
          return null;
       }else if(this.H == null && this.I == null){
          dc1 tA = this.A;
          co5.i(tA);
          tA.W(dc1.O).writeByte(32).W(p0).writeByte(10);
          tA.flush();
          if (this.D != null) {
             return null;
          }else if(ovb1 == null){
             ovb1 = new vb1(this, p0);
             this.B.put(p0, ovb1);
          }
          tb1 otb11 = new tb1(this, ovb1);
          ovb1.g = otb11;
          return otb11;
       }else {
          r07.d(this.K, this.L);
          return null;
       }
    }
    public synchronized final xb1 y(String p0){
       xb1 oxb11;
       co5.o(p0, "key");
       this.J();
       this.b();
       dc1.o0(p0);
       vb1 ovb1 = this.B.get(p0);
       xb1 oxb1 = null;
       if (ovb1 == null) {
          return oxb1;
       }
       if ((oxb11 = ovb1.a()) == null) {
          return oxb1;
       }
       this.C = this.C + 1;
       dc1 tA = this.A;
       co5.i(tA);
       tA.W(dc1.Q).writeByte(32).W(p0).writeByte(10);
       if (this.T()) {
          r07.d(this.K, this.L);
       }
       return oxb11;
    }
}
