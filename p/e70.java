package p.e70;
import p.g70;
import p.f70;
import java.lang.Cloneable;
import java.nio.channels.ByteChannel;
import java.lang.Object;
import p.nn6;
import java.lang.String;
import p.co5;
import java.nio.charset.Charset;
import p.oe0;
import java.lang.StringBuilder;
import p.kg4;
import java.lang.IllegalArgumentException;
import p.tp2;
import p.u96;
import java.lang.Math;
import p.ej4;
import java.lang.IndexOutOfBoundsException;
import p.j80;
import p.x96;
import p.uk;
import java.lang.IllegalStateException;
import p.el6;
import java.io.EOFException;
import p.zs7;
import p.t45;
import java.lang.NumberFormatException;
import p.b57;
import p.y70;
import p.en6;
import p.hp5;
import p.aa5;
import p.xe7;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.AssertionError;
import p.y96;

public final class e70 implements g70, f70, Cloneable, ByteChannel	// class@0001cc from classes2.dex
{
    public u96 a;
    public long b;

    public void e70(){
       super();
    }
    public final long A(nn6 p0){
       co5.o(p0, "source");
       long l = 0;
       while (true) {
          long l1 = p0.o(this, 8192);
          if (l1 - -1) {
             l = l + l1;
          }else {
             break ;
          }
       }
       return l;
    }
    public final e70 A0(String p0,int p1,int p2,Charset p3){
       co5.o(p0, "string");
       int i = 1;
       int i1 = (p1 >= 0)? 1: 0;
       if (i1) {
          i1 = (p2 >= p1)? 1: 0;
          if (i1) {
             if (p2 > p0.length()) {
                i = 0;
             }
             if (i) {
                if (co5.c(p3, oe0.a)) {
                   this.C0(p0, p1, p2);
                   return this;
                }else {
                   p0 = p0.substring(p1, p2);
                   co5.l(p0, "this as java.lang.String…ing\(startIndex, endIndex\)");
                   byte[] bytes = p0.getBytes(p3);
                   co5.l(bytes, "this as java.lang.String\).getBytes\(charset\)");
                   this.write(bytes, 0, bytes.length);
                   return this;
                }
             }else {
                throw new IllegalArgumentException(kg4.r("endIndex > string.length: ", p2, " > ")+p0.length().toString());
             }
          }else {
             throw new IllegalArgumentException("endIndex < beginIndex: "+p2+" < "+p1.toString());
          }
       }else {
          throw new IllegalArgumentException(tp2.k("beginIndex < 0: ", p1).toString());
       }
    }
    public final String B(){
       return this.O(Long.MAX_VALUE);
    }
    public final void B0(String p0){
       co5.o(p0, "string");
       this.C0(p0, 0, p0.length());
    }
    public final void C0(String p0,int p1,int p2){
       char c;
       int i2;
       int i3;
       int i4;
       u96 a;
       long l;
       u96 c2;
       u96 c3;
       int i5;
       u96 a1;
       int i6;
       int i7;
       co5.o(p0, "string");
       int i = 1;
       int i1 = (p1 >= 0)? 1: 0;
       if (i1) {
          i1 = (p2 >= p1)? 1: 0;
          if (i1) {
             i1 = (p2 <= p0.length())? 1: 0;
             if (i1) {
                while (p1 < p2) {
                   if ((c = p0.charAt(p1)) < 128) {
                      u96 ou96 = this.t0(i);
                      i2 = ou96.c - p1;
                      i3 = i2 - 8192;
                      i3 = Math.min(p2, i3);
                      i4 = p1 + 1;
                      p1 = p1 + i2;
                      a = ou96.a;
                      a[p1] = (byte)c;
                      while ((p1 = i4) < i3 && (c = p0.charAt(p1)) < 128) {
                         i4 = p1 + 1;
                         p1 = p1 + i2;
                         a[p1] = (byte)c;
                      }
                      i2 = i2 + p1;
                      u96 c1 = ou96.c;
                      i2 = i2 - c1;
                      i1 = c1 + i2;
                      ou96.c = i1;
                      l = this.b + (long)i2;
                      this.b = l;
                   }else if(c < 2048){
                      u96 ou961 = this.t0(2);
                      c2 = ou961.c;
                      i4 = c >> 6;
                      i4 = i4 | 0x00c0;
                      a = ou961.a;
                      a[c2] = (byte)i4;
                      i4 = c2 + 1;
                      i1 = c & 0x3f;
                      i1 = i1 | 128;
                      a[i4] = (byte)i1;
                      i3 = c2 + 2;
                      ou961.c = i3;
                      l = this.b + 2;
                      this.b = l;
                   }else {
                      i2 = 63;
                      if (c >= 0xd800 && c <= 0xdfff) {
                         char c4 = ((i7 = p1 + 1) < p2)? p0.charAt(i7): 0;
                         if (c <= 0xdbff) {
                            c3 = (0xdc00 <= c4 && c4 < 0xe000)? 1: 0;
                            if (c3) {
                               i1 = c & 0x03ff;
                               i1 = i1 << 10;
                               i7 = c4 & 0x03ff;
                               i1 = i1 | i7;
                               i1 = i1 + 0x10000;
                               c2 = this.t0(4);
                               c3 = c2.c;
                               i5 = i1 >> 18;
                               i5 = i5 | 0x00f0;
                               a1 = c2.a;
                               a1[c3] = (byte)i5;
                               i5 = c3 + 1;
                               i6 = i1 >> 12;
                               i6 = i6 & i2;
                               i6 = i6 | 128;
                               a1[i5] = (byte)i6;
                               i5 = c3 + 2;
                               i6 = i1 >> 6;
                               i6 = i6 & i2;
                               i6 = i6 | 128;
                               a1[i5] = (byte)i6;
                               i5 = c3 + 3;
                               i1 = i1 & i2;
                               i1 = i1 | 128;
                               a1[i5] = (byte)i1;
                               i4 = c3 + 4;
                               c2.c = i4;
                               l = this.b + 4;
                               this.b = l;
                               p1 = p1 + 2;
                            }
                         }
                         this.v0(i2);
                         p1 = i7;
                      }else {
                         c2 = this.t0(3);
                         c3 = c2.c;
                         i5 = c >> 12;
                         i5 = i5 | 0x00e0;
                         a1 = c2.a;
                         a1[c3] = (byte)i5;
                         i5 = c3 + 1;
                         i6 = c >> 6;
                         i2 = i2 & i6;
                         i2 = i2 | 128;
                         a1[i5] = (byte)i2;
                         i2 = c3 + 2;
                         i1 = c & 0x3f;
                         i1 = i1 | 128;
                         a1[i2] = (byte)i1;
                         i4 = c3 + 3;
                         c2.c = i4;
                         l = this.b + 3;
                         this.b = l;
                      }
                   }
                   p1++;
                }
                return;
             }else {
                throw new IllegalArgumentException(kg4.r("endIndex > string.length: ", p2, " > ")+p0.length().toString());
             }
          }else {
             throw new IllegalArgumentException("endIndex < beginIndex: "+p2+" < "+p1.toString());
          }
       }else {
          throw new IllegalArgumentException(tp2.k("beginIndex < 0: ", p1).toString());
       }
    }
    public final byte[] D(){
       return this.l0(this.b);
    }
    public final void D0(int p0){
       u96 ou96;
       u96 ou961;
       u96 a1;
       char[] n0;
       String str1;
       int i = 128;
       if (p0 < i) {
          this.v0(p0);
       }else {
          int i1 = 2;
          int i2 = 63;
          if (p0 < 2048) {
             ou96 = this.t0(i1);
             u96 c = ou96.c;
             u96 a = ou96.a;
             a[c] = (byte)((p0 >> 6) | 0x00c0);
             a[(c + 1)] = (byte)((p0 & i2) | i);
             ou96.c = c + i1;
             this.b = this.b + 2;
          }else {
             int i3 = 0;
             int i4 = 1;
             ou96 = (0xd800 <= p0 && p0 < 0xe000)? 1: 0;
             if (ou96) {
                this.v0(i2);
             }else {
                int i5 = 3;
                if (p0 < 0x10000) {
                   ou961 = this.t0(i5);
                   ou96 = ou961.c;
                   a1 = ou961.a;
                   a1[ou96] = (byte)((p0 >> 12) | 0x00e0);
                   a1[(ou96 + 1)] = (byte)(((p0 >> 6) & i2) | i);
                   a1[(ou96 + 2)] = (byte)((p0 & i2) | i);
                   ou961.c = ou96 + i5;
                   this.b = this.b + 3;
                }else if(p0 <= 0x10ffff){
                   ou961 = this.t0(4);
                   ou96 = ou961.c;
                   a1 = ou961.a;
                   a1[ou96] = (byte)((p0 >> 18) | 0x00f0);
                   a1[(ou96 + 1)] = (byte)(((p0 >> 12) & i2) | i);
                   a1[(ou96 + 2)] = (byte)(((p0 >> 6) & i2) | i);
                   a1[(ou96 + 3)] = (byte)((p0 & i2) | i);
                   ou961.c = ou96 + 4;
                   this.b = this.b + 4;
                }else {
                   String str = "Unexpected code point: 0x";
                   if (p0) {
                      char[] uocharArray = new char[]{n0[((p0 >> 28) & 0x0f)],n0[((p0 >> 24) & 0x0f)],n0[((p0 >> 20) & 0x0f)],n0[((p0 >> 16) & 0x0f)],n0[((p0 >> 12) & 0x0f)],n0[((p0 >> 8) & 0x0f)],n0[((p0 >> 4) & 0x0f)],n0[(p0 & 0x0f)]};
                      n0 = ej4.n0;
                      while (i3 < 8 && uocharArray[i3] == '0') {
                         i3 = i3 + 1;
                      }
                      str1 = "startIndex: ";
                      if (i3 >= 0) {
                         if (i3 <= 8) {
                            str1 = new String(uocharArray, i3, (i3 - 8));
                         }else {
                            throw new IllegalArgumentException(tp2.l(str1, i3, " > endIndex: 8"));
                         }
                      }else {
                         throw new IndexOutOfBoundsException(tp2.l(str1, i3, ", endIndex: 8, size: 8"));
                      }
                   }else {
                      str1 = "0";
                   }
                   throw new IllegalArgumentException(str+str1);
                }
             }
          }
       }
       return;
    }
    public final int E(){
       int i = this.readInt();
       return (((i & 0x00ff) << 24) | ((((0xff000000 & i) >> 24) | ((0xff0000 & i) >> 8)) | ((0xff00 & i) << 8)));
    }
    public final boolean F(){
       boolean b = (!(this.b))? true: false;
       return b;
    }
    public final long H(j80 p0){
       co5.o(p0, "bytes");
       return this.j0(0, p0);
    }
    public final void I(e70 p0,long p1){
       long l;
       int i2;
       int i3;
       u96 ou96;
       e70 ta;
       u96 g1;
       int i5;
       int i6;
       co5.o(p0, "source");
       int i = 0;
       int i1 = (p0 != this)? 1: 0;
       if (i1) {
          co5.p(p0.b, 0, p1);
          while ((p1) > 0) {
             e70 a = p0.a;
             co5.i(a);
             e70 a1 = p0.a;
             co5.i(a1);
             i1 = a.c - a1.b;
             if ((p1 - (long)i1) < 0) {
                u96 g = ((a = this.a) != null)? a.g: null;
                if (g != null && g.e != null) {
                   l = (long)g.c + p1;
                   i2 = (g.d != null)? 0: g.b;
                   l = l - (long)i2;
                   if ((l - 8192) <= 0) {
                      e70 a2 = p0.a;
                      co5.i(a2);
                      a2.d(g, (int)p1);
                      p0.b = p0.b - p1;
                      this.b = this.b + p1;
                      break ;
                   }
                }
                a = p0.a;
                co5.i(a);
                if ((i3 = (int)p1) > 0) {
                   int i4 = a.c - a.b;
                   if (i3 <= i4) {
                      i4 = 1;
                   label_0079 :
                      if (i4) {
                         if (i3 >= 1024) {
                            ou96 = a.c();
                         }else {
                            ou96 = x96.b();
                            g1 = a.b;
                            i5 = g1 + i3;
                            uk.j0(i, g1, i5, a.a, ou96.a);
                         }
                         i2 = ou96.b + i3;
                         ou96.c = i2;
                         i2 = a.b + i3;
                         a.b = i2;
                         g = a.g;
                         co5.i(g);
                         g.b(ou96);
                         p0.a = ou96;
                      }else {
                         throw new IllegalArgumentException("byteCount out of range".toString());
                      }
                   }
                }
                ou96 = 0;
                goto label_0079 ;
             }
             a = p0.a;
             co5.i(a);
             i3 = a.c - a.b;
             l = (long)i3;
             p0.a = a.a();
             if ((ta = this.a) == null) {
                this.a = a;
                a.g = a;
                a.f = a;
             }else {
                g1 = ta.g;
                co5.i(g1);
                g1.b(a);
                i5 = ((g1 = a.g) != a)? 1: 0;
                if (i5) {
                   co5.i(g1);
                   if (g1.e != null) {
                      i2 = a.c - a.b;
                      u96 g2 = a.g;
                      co5.i(g2);
                      i5 = g2.c - 8192;
                      u96 g3 = a.g;
                      co5.i(g3);
                      if (g3.d != null) {
                         i6 = 0;
                      }else {
                         g3 = a.g;
                         co5.i(g3);
                         i6 = g3.b;
                      }
                      i5 = i5 + i6;
                      if (i2 <= i5) {
                         g2 = a.g;
                         co5.i(g2);
                         a.d(g2, i2);
                         a.a();
                         x96.a(a);
                      }
                   }
                }else {
                   throw new IllegalStateException("cannot compact".toString());
                }
             }
             long l1 = p0.b - l;
             p0.b = l1;
             l1 = this.b + l;
             this.b = l1;
             p1 = p1 - l;
          }
          return;
       }else {
          throw new IllegalArgumentException("source == this".toString());
       }
    }
    public final f70 K(){
       return this;
    }
    public final long L(f70 p0){
       e70 tb = this.b;
       if ((tb) > 0) {
          p0.I(this, tb);
       }
       return tb;
    }
    public final long N(){
       long l;
       e70 uoe70 = this;
       int i = 8;
       if ((uoe70.b - i) < 0) {
          throw new EOFException();
       }
       e70 a = uoe70.a;
       co5.i(a);
       u96 b = a.b;
       u96 c = a.c;
       if (((long)(c - b) - i) < 0) {
          l = (((long)this.readInt() & 0xffffffff) << 32) | (0xffffffff & (long)this.readInt());
       }else {
          int i1 = b + 1;
          u96 a1 = a.a;
          int i2 = i1 + 1;
          i1 = i2 + 1;
          i2 = i1 + 1;
          i1 = i2 + 1;
          i2 = i1 + 1;
          i1 = i2 + 1;
          i2 = i1 + 1;
          long l1 = (((((((((long)a1[b] & 255) << 56) | (((long)a1[i1] & 255) << 48)) | (((long)a1[i2] & 255) << 40)) | (((long)a1[i1] & 255) << 32)) | (((long)a1[i2] & 255) << 24)) | (((long)a1[i1] & 255) << 16)) | (((long)a1[i2] & 255) << 8)) | ((long)a1[i1] & 255);
          uoe70.b = uoe70.b - 8;
          if (i2 == c) {
             uoe70.a = a.a();
             x96.a(a);
          }else {
             a.b = i2;
          }
          l = l1;
       }
       return (((l & 255) << 56) | ((((((((0xff00000000000000 & l) >> 56) | ((0xff000000000000 & l) >> 40)) | ((0xff0000000000 & l) >> 24)) | ((0xff00000000 & l) >> 8)) | ((0xff000000 & l) << 8)) | ((0xff0000 & l) << 24)) | ((0xff00 & l) << 40)));
    }
    public final String O(long p0){
       String str;
       int i = ((p0) >= 0)? 1: 0;
       if (i) {
          long l = 1;
          long l1 = Long.MAX_VALUE;
          if (p0 - l1) {
             l1 = p0 + l;
          }
          byte b = (byte)10;
          long l2 = this.i0(b, 0, l1);
          if (l2 - -1) {
             str = zs7.b(this, l2);
          }else if((l1 - this.b) < 0 && (this.h0((l1 - l)) == (byte)13 && this.h0(l1) == b)){
             str = zs7.b(this, l1);
          }else {
             e70 uoe70 = new e70();
             this.g0(0, Math.min((long)32, this.b), uoe70);
             throw super("\\n not found: limit="+Math.min(this.b, p0)+" content="+uoe70.m0().e()+8230);
          }
          return str;
       }else {
          throw new IllegalArgumentException(kg4.k("limit < 0: ", p0).toString());
       }
    }
    public final long T(){
       u96 c;
       e70 tb = this.b;
       long l = 0;
       if (!(tb - l)) {
       }else {
          e70 ta = this.a;
          co5.i(ta);
          u96 g = ta.g;
          co5.i(g);
          if ((c = g.c) < 8192 && g.e != null) {
             tb = tb - (long)(c - g.b);
          }
          ta = tb;
       }
       return l;
    }
    public final int U(t45 p0){
       int i;
       co5.o(p0, "options");
       if ((i = zs7.c(this, p0, false)) == -1) {
          i = -1;
       }else {
          this.skip((long)p0.a[i].d());
       }
       return i;
    }
    public final void V(long p0){
       if ((this.b - p0) >= 0) {
          return;
       }
       throw new EOFException();
    }
    public final f70 W(String p0){
       this.B0(p0);
       return this;
    }
    public final f70 X(long p0){
       return this.w0(p0);
    }
    public final boolean a(long p0){
       boolean b = ((this.b - p0) >= 0)? true: false;
       return b;
    }
    public final long b0(){
       byte b1;
       char[] n0;
       int i = 0;
       if (!(this.b - i)) {
          throw new EOFException();
       }
       e70 int i1 = 0;
       long l = i;
       int i2 = 0;
       int i3 = 0;
       while (true) {
          e70 ta = this.a;
          co5.i(ta);
          u96 b = ta.b;
          u96 c = ta.c;
          while (true) {
             if (b < c) {
                b1 = ta.a[b];
                byte b2 = (byte)48;
                if (b1 >= b2 && b1 <= (byte)57) {
                   b2 = b1 - b2;
                }else {
                   b2 = (byte)97;
                   if (b1 < b2 || b1 > (byte)102) {
                      b2 = (byte)65;
                      if (b1 < b2 || b1 > (byte)70) {
                         i3 = 1;
                         if (i2) {
                         label_0094 :
                            if (b == c) {
                               this.a = ta.a();
                               x96.a(ta);
                            }else {
                               ta.b = b;
                            }
                            if (!i3 && this.a != null) {
                               continue ;
                            }else {
                               this.b = this.b - (long)i2;
                               return l;
                            }
                         }else {
                            break ;
                         }
                      }
                   }
                   b2 = b1 - b2;
                   b2 = b2 + 10;
                }
                long l1 = 0xf000000000000000 & l;
                if (!(l1 - i)) {
                   l = l << 4;
                   l = l | (long)b2;
                   b = b + 1;
                   i2 = i2 + 1;
                }else {
                   i1 = new e70();
                   i1.x0(l);
                   i1.v0(b1);
                   throw new NumberFormatException("Number too large: ".concat(i1.q0()));
                }
             }else {
                goto label_0094 ;
             }
          }
          char[] uocharArray = new char[]{n0[((b1 >> 4) & 0x0f)],n0[(b1 & 0x0f)]};
          n0 = ej4.n0;
          throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(uocharArray)));
       }
    }
    public final e70 c(){
       return this;
    }
    public final String c0(Charset p0){
       return this.p0(this.b, p0);
    }
    public final Object clone(){
       e70 uoe70 = new e70();
       if (!(this.b)) {
       }else {
          e70 ta = this.a;
          co5.i(ta);
          u96 ou96 = ta.c();
          uoe70.a = ou96;
          ou96.g = ou96;
          ou96.f = ou96;
          u96 f = ta.f;
          while (f != ta) {
             u96 g = ou96.g;
             co5.i(g);
             co5.i(f);
             g.b(f.c());
             f = f.f;
          }
          uoe70.b = this.b;
       }
       return uoe70;
    }
    public final void close(){
    }
    public final b57 e(){
       return b57.d;
    }
    public final y70 e0(){
       return new y70(this, 1);
    }
    public final boolean equals(Object p0){
       boolean b;
       e70 uoe70 = this;
       e70 uoe701 = p0;
       if (uoe70 != uoe701) {
          if (uoe701 instanceof e70) {
             e70 b1 = uoe70.b;
             if (!(b1 - uoe701.b)) {
                if (b1) {
                   e70 a = uoe70.a;
                   co5.i(a);
                   uoe701 = uoe701.a;
                   co5.i(uoe701);
                   u96 b2 = a.b;
                   u96 b3 = uoe701.b;
                   long l = 0;
                   while (true) {
                      if ((l - uoe70.b) < 0) {
                         int i = a.c - b2;
                         int i1 = uoe701.c - b3;
                         long l1 = (long)Math.min(i, i1);
                         long l2 = 0;
                         while (true) {
                            if ((l2 - l1) < 0) {
                               int i2 = b2 + 1;
                               int i3 = b3 + 1;
                               if (a.a[b2] == uoe701.a[b3]) {
                                  l2 = l2 + 1;
                                  b3 = i3;
                                  i3 = i2;
                               }
                            }else if(b2 == a.c){
                               u96 f = a.f;
                               co5.i(f);
                               b2 = f.b;
                               a = f;
                            }
                            if (b3 == uoe701.c) {
                               u96 f1 = uoe701.f;
                               co5.i(f1);
                               b3 = f1.b;
                            }
                            l = l + l1;
                         }
                         return b;
                      }
                   }
                }
             }
          }
          b = false;
       }
       b = true;
    }
    public final void f(){
       this.skip(this.b);
    }
    public final void flush(){
    }
    public final void g0(long p0,long p1,e70 p2){
       e70 a;
       co5.o(p2, "out");
       co5.p(this.b, p0, p1);
       if (!(p1)) {
       }else {
          p2.b = p2.b + p1;
          e70 ta = this.a;
          while (true) {
             co5.i(ta);
             int i = ta.c - ta.b;
             long l = (long)i;
             if ((p0 - l) >= 0) {
                p0 = p0 - l;
                ta = ta.f;
             }else {
                break ;
             }
          }
          while ((p1) > 0) {
             co5.i(ta);
             u96 ou96 = ta.c();
             int i1 = ou96.b + (int)p0;
             ou96.b = i1;
             i1 = i1 + (int)p1;
             ou96.c = Math.min(i1, ou96.c);
             if ((a = p2.a) == null) {
                ou96.g = ou96;
                ou96.f = ou96;
                p2.a = ou96;
             }else {
                u96 g = a.g;
                co5.i(g);
                g.b(ou96);
             }
             int i2 = ou96.c - ou96.b;
             p1 = p1 - (long)i2;
             ta = ta.f;
             i2 = 0;
          }
       }
       return;
    }
    public final byte h0(long p0){
       e70 ta;
       int i;
       byte b;
       u96 b1;
       co5.p(this.b, p0, 1);
       if ((ta = this.a) != null) {
          e70 tb = this.b;
          if (((tb - p0) - p0) < 0) {
             while ((tb - p0) > 0) {
                ta = ta.g;
                co5.i(ta);
                i = ta.c - ta.b;
                tb = tb - (long)i;
             }
             b = ta.a[(int)(((long)ta.b + p0) - tb)];
          }else {
             long l = 0;
             while (true) {
                b1 = ta.b;
                i = ta.c - b1;
                long l1 = (long)i + l;
                if ((l1 - p0) <= 0) {
                   ta = ta.f;
                   co5.i(ta);
                   l = l1;
                }else {
                   break ;
                }
             }
             b = ta.a[(int)(((long)b1 + p0) - l)];
          }
          return b;
       }else {
          co5.i(null);
          throw null;
       }
    }
    public final int hashCode(){
       e70 ta;
       int i;
       if ((ta = this.a) == null) {
          i = 0;
       }else {
          int i1 = 1;
          while (true) {
             u96 c = ta.c;
             for (u96 b = ta.b; b < c; b = b + 1) {
                i1 = i1 * 31;
                i1 = i1 + ta.a[b];
             }
             ta = ta.f;
             co5.i(ta);
             if (ta == this.a) {
                i = i1;
             }
          }
       }
       return i;
    }
    public final long i0(byte p0,long p1,long p2){
       e70 uoe70;
       e70 ta;
       long l2;
       int i3;
       int i = 0;
       long l = 0;
       if ((l - p1) <= 0 && (p1 - p2) <= 0) {
          i = 1;
       }
       if (i) {
          e70 tb = this.b;
          if ((p2 - tb) > 0) {
             uoe70 = tb;
          }
          long l1 = -1;
          if ((p1 - uoe70) && (ta = this.a) != null) {
             if (((tb - p1) - p1) < 0) {
                while ((tb - p1) > 0) {
                   ta = ta.g;
                   co5.i(ta);
                   int i1 = ta.c - ta.b;
                   tb = tb - (long)i1;
                }
                while ((tb - uoe70) < 0) {
                   l2 = (long)ta.b + uoe70;
                   l2 = l2 - tb;
                   int i2 = (int)Math.min((long)ta.c, l2);
                   l2 = (long)ta.b + p1;
                   l2 = l2 - tb;
                   i3 = (int)l2;
                   while (true) {
                      if (i3 < i2) {
                         if (ta.a[i3] == p0) {
                            l1 = (long)(i3 - ta.b) + tb;
                            break ;
                         }else {
                            i3++;
                         }
                      }else {
                         i3 = ta.c - ta.b;
                         tb = tb + (long)i3;
                         ta = ta.f;
                         co5.i(ta);
                         i3 = tb;
                      }
                   }
                }
             }else {
                while (true) {
                   int i4 = ta.c - ta.b;
                   long l3 = (long)i4 + l;
                   if ((l3 - p1) <= 0) {
                      ta = ta.f;
                      co5.i(ta);
                      l = l3;
                   }else {
                      break ;
                   }
                }
                while ((l - uoe70) < 0) {
                   l2 = (long)ta.b + uoe70;
                   l2 = l2 - l;
                   int i5 = (int)Math.min((long)ta.c, l2);
                   l2 = (long)ta.b + p1;
                   l2 = l2 - l;
                   i3 = (int)l2;
                   while (true) {
                      if (i3 < i5) {
                         if (ta.a[i3] == p0) {
                            l1 = (long)(i3 - ta.b) + l;
                            break ;
                         }else {
                            i3++;
                         }
                      }else {
                         i3 = ta.c - ta.b;
                         l = l + (long)i3;
                         ta = ta.f;
                         co5.i(ta);
                         i3 = l;
                      }
                   }
                }
             }
          }
          return l1;
       }else {
          throw new IllegalArgumentException("size="+this.b+" fromIndex="+p1+" toIndex="+p2.toString());
       }
    }
    public final boolean isOpen(){
       return true;
    }
    public final long j0(long p0,j80 p1){
       e70 ta;
       byte[] uobyteArray;
       int i3;
       long l2;
       int i4;
       int i5;
       int i6;
       long l3;
       co5.o(p1, "bytes");
       int i = 1;
       byte i1 = 0;
       int i2 = (p1.d() > 0)? 1: 0;
       if (i2) {
          long l = 0;
          if ((p0 - l) < 0) {
             uobyteArray = 0;
          }
          if (i) {
             if ((ta = this.a) != null) {
                e70 tb = this.b;
                long l1 = 1;
                if (((tb - p0) - p0) < 0) {
                   while ((tb - p0) > 0) {
                      ta = ta.g;
                      co5.i(ta);
                      i = ta.c - ta.b;
                      tb = tb - (long)i;
                   }
                   uobyteArray = p1.h();
                   i1 = uobyteArray[i1];
                   i3 = p1.d();
                   l = (this.b - (long)i3) + l1;
                   while (true) {
                      if ((tb - l) < 0) {
                         l2 = (long)ta.b + l;
                         l2 = l2 - tb;
                         i4 = (int)Math.min((long)ta.c, l2);
                         l1 = (long)ta.b + p0;
                         l1 = l1 - tb;
                         i5 = (int)l1;
                         while (true) {
                            if (i5 < i4) {
                               if (ta.a[i5] == i1 && (i6 = i5 + 1)) {
                                  i5 = (long)(i5 - ta.b) + tb;
                                  break ;
                               }else {
                                  i5++;
                               }
                            }else {
                               i5 = ta.c - ta.b;
                               tb = tb + (long)i5;
                               ta = ta.f;
                               co5.i(ta);
                               i5 = tb;
                            }
                         }
                         return p0;
                      }
                   }
                }else {
                   while (true) {
                      i = ta.c - ta.b;
                      l3 = (long)i + l;
                      if ((l3 - p0) <= 0) {
                         ta = ta.f;
                         co5.i(ta);
                         l = l3;
                      }else {
                         break ;
                      }
                   }
                   uobyteArray = p1.h();
                   i1 = uobyteArray[i1];
                   i3 = p1.d();
                   l3 = (this.b - (long)i3) + l1;
                   while (true) {
                      if ((l - l3) < 0) {
                         l2 = (long)ta.b + l3;
                         l2 = l2 - l;
                         i4 = (int)Math.min((long)ta.c, l2);
                         l1 = (long)ta.b + p0;
                         l1 = l1 - l;
                         i5 = (int)l1;
                         while (true) {
                            if (i5 < i4) {
                               if (ta.a[i5] == i1 && (i6 = i5 + 1)) {
                                  i5 = (long)(i5 - ta.b) + l;
                               }else {
                                  i5++;
                               }
                            }else {
                               i5 = ta.c - ta.b;
                               l = l + (long)i5;
                               ta = ta.f;
                               co5.i(ta);
                               i5 = l;
                            }
                         }
                      }
                   }
                }
             }
             p0 = -1;
          }else {
             throw new IllegalArgumentException(kg4.k("fromIndex < 0: ", p0).toString());
          }
       }else {
          throw new IllegalArgumentException("bytes is empty".toString());
       }
    }
    public final f70 k(String p0,int p1,int p2){
       this.C0(p0, p1, p2);
       return this;
    }
    public final long k0(long p0,j80 p1){
       int i3;
       byte b1;
       int i4;
       u96 c;
       long l4;
       e70 uoe70 = this;
       long l = p0;
       byte[] obj = p1;
       co5.o(obj, "targetBytes");
       byte i = 0;
       int i1 = 1;
       long l1 = 0;
       int i2 = ((l - l1) >= 0)? 1: 0;
       if (i2) {
          e70 a = uoe70.a;
          long l2 = -1;
          if (a != null) {
             e70 b = uoe70.b;
             if (((b - l) - l) < 0) {
                while ((b - l) > 0) {
                   a = a.g;
                   co5.i(a);
                   i3 = a.c - a.b;
                   b = b - (long)i3;
                }
                if (p1.d() == 2) {
                   i = obj.i(i);
                   b1 = obj.i(i1);
                   while ((b - uoe70.b) < 0) {
                      long l3 = (long)a.b + l;
                      l3 = l3 - b;
                      i4 = (int)l3;
                      c = a.c;
                      while (true) {
                         if (i4 < c) {
                            if ((i1 = a.a[i4]) != i && i1 != b1) {
                               i4 = i4 + 1;
                            }else {
                               c = a.b;
                            }
                         }else {
                            i4 = a.c - a.b;
                            b = b + (long)i4;
                            a = a.f;
                            co5.i(a);
                            l = b;
                         }
                      }
                   }
                }else {
                   obj = p1.h();
                   while ((b - uoe70.b) < 0) {
                      l4 = (long)a.b + l;
                      l4 = l4 - b;
                      i4 = (int)l4;
                      c = a.c;
                      while (true) {
                         if (i4 < c) {
                            i = a.a[i4];
                            i1 = obj.length;
                            i3 = 0;
                            while (true) {
                               if (i3 < i1) {
                                  if (i == obj[i3]) {
                                     c = a.b;
                                  }else {
                                     i3 = i3 + 1;
                                  }
                               }else {
                                  i4 = i4 + 1;
                               }
                            }
                         }else {
                            i4 = a.c - a.b;
                            b = b + (long)i4;
                            a = a.f;
                            co5.i(a);
                            l = b;
                         }
                      }
                   }
                }
                l2 = (long)(i4 - c) + b;
             }else {
                while (true) {
                   int i5 = a.c - a.b;
                   long l5 = (long)i5 + l1;
                   if ((l5 - l) <= 0) {
                      a = a.f;
                      co5.i(a);
                      l1 = l5;
                   }else if(p1.d() == 2){
                      i = obj.i(i);
                      b1 = obj.i(i1);
                      while ((l1 - uoe70.b) < 0) {
                         l5 = (long)a.b + l;
                         l5 = l5 - l1;
                         i4 = (int)l5;
                         c = a.c;
                         while (true) {
                            if (i4 < c) {
                               if ((i1 = a.a[i4]) != i && i1 != b1) {
                                  i4 = i4 + 1;
                               }else {
                                  c = a.b;
                               }
                            }else {
                               i4 = a.c - a.b;
                               l1 = l1 + (long)i4;
                               a = a.f;
                               co5.i(a);
                               l = l1;
                            }
                         }
                      }
                   }else {
                      obj = p1.h();
                      while ((l1 - uoe70.b) < 0) {
                         l4 = (long)a.b + l;
                         l4 = l4 - l1;
                         i4 = (int)l4;
                         c = a.c;
                         while (true) {
                            if (i4 < c) {
                               i = a.a[i4];
                               i1 = obj.length;
                               i5 = 0;
                               while (true) {
                                  if (i5 < i1) {
                                     if (i == obj[i5]) {
                                        c = a.b;
                                     }else {
                                        i5 = i5 + 1;
                                     }
                                  }else {
                                     i4 = i4 + 1;
                                  }
                               }
                            }else {
                               i4 = a.c - a.b;
                               l1 = l1 + (long)i4;
                               a = a.f;
                               co5.i(a);
                               l = l1;
                            }
                         }
                      }
                   }
                   l2 = (long)(i4 - c) + l1;
                }
             }
          }
          return l2;
       }else {
          throw new IllegalArgumentException(kg4.k("fromIndex < 0: ", l).toString());
       }
    }
    public final boolean l(long p0,j80 p1){
       co5.o(p1, "bytes");
       j80 a = p1.a;
       int len = a.length;
       int i = 0;
       if ((p0) >= 0 && (len >= 0 && (((this.b - p0) - (long)len) >= 0 && ((a.length - i)) >= len))) {
          int i1 = 0;
          while (true) {
             if (i1 < len) {
                long l = (long)i1 + p0;
                int i2 = i + i1;
                if (this.h0(l) == p1.a[i2]) {
                   i1 = i1 + 1;
                }
             }else {
                i = true;
                break ;
             }
          }
       }
       return i;
    }
    public final byte[] l0(long p0){
       int i = 0;
       int i1 = ((p0) >= 0 && (p0 - 0x7fffffff) <= 0)? 1: 0;
       if (i1) {
          if ((this.b - p0) >= 0) {
             int i2 = (int)p0;
             byte[] uobyteArray = new byte[i2];
             while (true) {
                if (i >= i2) {
                   return uobyteArray;
                }
                i1 = i2 - i;
                if ((i1 = this.read(uobyteArray, i, i1)) != -1) {
                   i = i + i1;
                }else {
                   break ;
                }
             }
             throw new EOFException();
          }else {
             throw new EOFException();
          }
       }else {
          throw new IllegalArgumentException(kg4.k("byteCount: ", p0).toString());
       }
    }
    public final f70 m(long p0){
       this.x0(p0);
       return this;
    }
    public final j80 m0(){
       return this.q(this.b);
    }
    public final long n0(){
       long l = 0;
       if (!(this.b - l)) {
          throw new EOFException();
       }
       long l1 = -7;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (true) {
          e70 ta = this.a;
          co5.i(ta);
          u96 b = ta.b;
          u96 c = ta.c;
          while (true) {
             if (b < c) {
                byte b1 = ta.a[b];
                int b2 = (byte)48;
                if (b1 >= b2 && b1 <= (byte)57) {
                   b2 = b2 - b1;
                   if ((v14 = l - 0xf333333333333334) >= 0 && (v14 && ((long)b2 - l1) < 0)) {
                      l = l * 10;
                      l = l + (long)b2;
                   }else {
                      e70 uoe70 = new e70();
                      uoe70.w0(l);
                      uoe70.v0(b1);
                      if (!i1) {
                         uoe70.readByte();
                      }
                      throw new NumberFormatException("Number too large: ".concat(uoe70.q0()));
                   }
                }else if(b1 == (byte)45 && !i){
                   l1 = l1 - 1;
                   i1 = 1;
                }else {
                   i2 = 1;
                label_0070 :
                   if (b == c) {
                      this.a = ta.a();
                      x96.a(ta);
                   }else {
                      ta.b = b;
                   }
                   if (!i2 && this.a != null) {
                      continue ;
                   }else {
                      l1 = this.b - (long)i;
                      this.b = l1;
                      i2 = 2;
                      ta = (i1)? 2: 1;
                      if (i < ta) {
                         if (l1) {
                            String str = (i1)? "Expected a digit": "Expected a digit or \'-\'";
                            byte b3 = this.h0(0);
                            char[] uocharArray = new char[i2];
                            char[] n0 = ej4.n0;
                            uocharArray[0] = n0[((b3 >> 4) & 0x0f)];
                            uocharArray[1] = n0[(b3 & 0x0f)];
                            throw new NumberFormatException(en6.s(str, " but was 0x")+new String(uocharArray));
                         }else {
                            throw new EOFException();
                         }
                      }else if(i1){
                         l = - l;
                         break ;
                      }
                      break ;
                   }
                }
                b = b + 1;
                i = i + 1;
             }else {
                goto label_0070 ;
             }
          }
          return l;
       }
    }
    public final long o(e70 p0,long p1){
       long l;
       e70 uoe70;
       co5.o(p0, "sink");
       int i = 0;
       int i1 = ((p1 - i) >= 0)? 1: 0;
       if (i1) {
          e70 tb = this.b;
          if (!(tb - i)) {
             l = -1;
          }else if((p1 - tb) > 0){
             uoe70 = tb;
          }
          p0.I(this, uoe70);
          p0 = uoe70;
          return l;
       }else {
          throw new IllegalArgumentException(kg4.k("byteCount < 0: ", p1).toString());
       }
    }
    public final short o0(){
       int i = this.readShort() & 0xffff;
       return (short)(((i & 0x00ff) << 8) | ((0xff00 & i) >> 8));
    }
    public final long p(j80 p0){
       co5.o(p0, "targetBytes");
       return this.k0(0, p0);
    }
    public final String p0(long p0,Charset p1){
       co5.o(p1, "charset");
       int i = ((v2 = p0) >= 0 && (p0 - 0x7fffffff) <= 0)? 1: 0;
       if (i) {
          if ((this.b - p0) >= 0) {
             if (!v2) {
                return "";
             }else {
                e70 ta = this.a;
                co5.i(ta);
                u96 b = ta.b;
                if ((((long)b + p0) - (long)ta.c) > 0) {
                   return new String(this.l0(p0), p1);
                }else {
                   int i1 = (int)p0;
                   String str = new String(ta.a, b, i1, p1);
                   int i2 = ta.b + i1;
                   ta.b = i2;
                   this.b = this.b - p0;
                   if (i2 == ta.c) {
                      this.a = ta.a();
                      x96.a(ta);
                   }
                   return str;
                }
             }
          }else {
             throw new EOFException();
          }
       }else {
          throw new IllegalArgumentException(kg4.k("byteCount: ", p0).toString());
       }
    }
    public final hp5 peek(){
       return xe7.f(new aa5(this));
    }
    public final j80 q(long p0){
       j80 oj80;
       int i = ((p0) >= 0 && (p0 - 0x7fffffff) <= 0)? 1: 0;
       if (i) {
          if ((this.b - p0) >= 0) {
             if ((p0 - 4096) >= 0) {
                oj80 = this.s0((int)p0);
                this.skip(p0);
             }else {
                oj80 = new j80(this.l0(p0));
             }
             return oj80;
          }else {
             throw new EOFException();
          }
       }else {
          throw new IllegalArgumentException(kg4.k("byteCount: ", p0).toString());
       }
    }
    public final String q0(){
       return this.p0(this.b, oe0.a);
    }
    public final String r0(long p0){
       return this.p0(p0, oe0.a);
    }
    public final int read(ByteBuffer p0){
       e70 ta;
       co5.o(p0, "sink");
       if ((ta = this.a) == null) {
          return -1;
       }
       int i = Math.min(p0.remaining(), (ta.c - ta.b));
       p0.put(ta.a, ta.b, i);
       int i1 = ta.b + i;
       ta.b = i1;
       this.b = this.b - (long)i;
       if (i1 == ta.c) {
          this.a = ta.a();
          x96.a(ta);
       }
       return i;
    }
    public final int read(byte[] p0){
       return this.read(p0, 0, p0.length);
    }
    public final int read(byte[] p0,int p1,int p2){
       e70 ta;
       int i;
       co5.o(p0, "sink");
       co5.p((long)p0.length, (long)p1, (long)p2);
       if ((ta = this.a) == null) {
          i = -1;
       }else {
          p2 = Math.min(p2, (ta.c - ta.b));
          u96 b = ta.b;
          uk.j0(p1, b, (b + p2), ta.a, p0);
          i = ta.b + p2;
          ta.b = i;
          this.b = this.b - (long)p2;
          if (i == ta.c) {
             this.a = ta.a();
             x96.a(ta);
          }
          i = p2;
       }
       return i;
    }
    public final byte readByte(){
       if (!(this.b)) {
          throw new EOFException();
       }
       e70 ta = this.a;
       co5.i(ta);
       u96 b = ta.b;
       int i = b + 1;
       byte b1 = ta.a[b];
       this.b = this.b - 1;
       if (i == ta.c) {
          this.a = ta.a();
          x96.a(ta);
       }else {
          ta.b = i;
       }
       return b1;
    }
    public final int readInt(){
       int i;
       long l = 4;
       if ((this.b - l) < 0) {
          throw new EOFException();
       }
       e70 ta = this.a;
       co5.i(ta);
       u96 b = ta.b;
       u96 c = ta.c;
       if (((long)(c - b) - l) < 0) {
          i = ((((this.readByte() & 0x00ff) << 24) | ((this.readByte() & 0x00ff) << 16)) | ((this.readByte() & 0x00ff) << 8)) | (this.readByte() & 0x00ff);
       }else {
          int i1 = b + 1;
          u96 a = ta.a;
          int i2 = i1 + 1;
          i1 = i2 + 1;
          i2 = i1 + 1;
          int i3 = ((((a[b] & 0x00ff) << 24) | ((a[i1] & 0x00ff) << 16)) | ((a[i2] & 0x00ff) << 8)) | (a[i1] & 0x00ff);
          this.b = this.b - l;
          if (i2 == c) {
             this.a = ta.a();
             x96.a(ta);
          }else {
             ta.b = i2;
          }
          i = i3;
       }
       return i;
    }
    public final short readShort(){
       short s;
       long l = 2;
       if ((this.b - l) < 0) {
          throw new EOFException();
       }
       e70 ta = this.a;
       co5.i(ta);
       u96 b = ta.b;
       u96 c = ta.c;
       if (((c - b)) < 2) {
          s = (short)(((this.readByte() & 0x00ff) << 8) | (this.readByte() & 0x00ff));
       }else {
          int i = b + 1;
          u96 a = ta.a;
          int i1 = i + 1;
          int i2 = ((a[b] & 0x00ff) << 8) | (a[i] & 0x00ff);
          this.b = this.b - l;
          if (i1 == c) {
             this.a = ta.a();
             x96.a(ta);
          }else {
             ta.b = i1;
          }
          s = (short)i2;
       }
       return s;
    }
    public final j80 s0(int p0){
       j80 t;
       u96 b;
       int i3;
       if (!p0) {
          t = j80.t;
       }else {
          co5.p(this.b, 0, (long)p0);
          e70 ta = this.a;
          int i = 0;
          int i1 = 0;
          int i2 = 0;
          while (true) {
             if (i1 < p0) {
                co5.i(ta);
                u96 c = ta.c;
                b = ta.b;
                if (c != b) {
                   i3 = c - b;
                   i1 = i1 + i3;
                   i2 = i2 + 1;
                   ta = ta.f;
                }else {
                   throw new AssertionError("s.limit == s.pos");
                }
             }else {
                byte[][] uobyteArray = new byte[][i2];
                int[] ointArray = new int[(i2 * 2)];
                e70 uoe70 = this.a;
                i3 = 0;
                while (i < p0) {
                   co5.i(uoe70);
                   uobyteArray[i3] = uoe70.a;
                   int i4 = uoe70.c - uoe70.b;
                   i = i + i4;
                   ointArray[i3] = Math.min(i, p0);
                   i4 = i3 + i2;
                   ointArray[i4] = uoe70.b;
                   uoe70.d = true;
                   i3 = i3 + true;
                   b = uoe70.f;
                }
                t = new y96(uobyteArray, ointArray);
             }
          }
       }
       return t;
    }
    public final void skip(long p0){
       e70 ta;
       while (true) {
          if ((p0) <= 0) {
             return;
          }
          if ((ta = this.a) != null) {
             int i = ta.c - ta.b;
             int i1 = (int)Math.min(p0, (long)i);
             long l = (long)i1;
             long l1 = this.b - l;
             this.b = l1;
             p0 = p0 - l;
             i = ta.b + i1;
             ta.b = i;
             if (i == ta.c) {
                this.a = ta.a();
                x96.a(ta);
             }
          }else {
             break ;
          }
       }
       throw new EOFException();
    }
    public final u96 t0(int p0){
       e70 ta;
       u96 ou96;
       int i = 8192;
       int i1 = 1;
       if (p0 < i1 || p0 > i) {
          i1 = 0;
       }
       if (i1) {
          if ((ta = this.a) == null) {
             ou96 = x96.b();
             this.a = ou96;
             ou96.g = ou96;
             ou96.f = ou96;
          }else {
             u96 g = ta.g;
             co5.i(g);
             if (((g.c + p0)) <= i && g.e != null) {
                ou96 = g;
             }else {
                ou96 = x96.b();
                g.b(ou96);
             }
          }
          return ou96;
       }else {
          throw new IllegalArgumentException("unexpected capacity".toString());
       }
    }
    public final String toString(){
       e70 tb = this.b;
       int i = ((tb - 0x7fffffff) <= 0)? 1: 0;
       if (i) {
          return this.s0((int)tb).toString();
       }else {
          throw new IllegalStateException("size > Int.MAX_VALUE: "+this.b.toString());
       }
    }
    public final void u0(j80 p0){
       co5.o(p0, "byteString");
       p0.r(this, p0.d());
    }
    public final f70 v(j80 p0){
       this.u0(p0);
       return this;
    }
    public final void v0(int p0){
       u96 ou96 = this.t0(1);
       u96 c = ou96.c;
       ou96.c = c + 1;
       ou96.a[c] = (byte)p0;
       this.b = this.b + 1;
    }
    public final e70 w0(long p0){
       int i2;
       int i = 0;
       if (!(v2 = p0 - i)) {
          this.v0(48);
       }else {
          int i1 = 1;
          if (v2 < 0) {
             p0 = - p0;
             if ((p0 - i) < 0) {
                this.B0("-9223372036854775808");
             }else {
                i2 = 1;
             }
          }else {
             i2 = 0;
          }
          if ((p0 - 0x5f5e100) < 0) {
             if ((p0 - 0x2710) < 0) {
                if ((p0 - 100) < 0) {
                   if ((p0 - 10) >= 0) {
                      i1 = 2;
                   }
                }else if((p0 - 1000) < 0){
                   i1 = 3;
                }else {
                   i1 = 4;
                }
             }else if((p0 - 0xf4240) < 0){
                i1 = ((p0 - 0x186a0) < 0)? 5: 6;
             }else if((p0 - 0x989680) < 0){
                i1 = 7;
             }else {
                i1 = 8;
             }
          }else if((p0 - 0xe8d4a51000) < 0){
             if ((p0 - 0x2540be400) < 0) {
                i1 = ((p0 - 0x3b9aca00) < 0)? 9: 10;
             }else if((p0 - 0x174876e800) < 0){
                i1 = 11;
             }else {
                i1 = 12;
             }
          }else if((p0 - 0x38d7ea4c68000) < 0){
             if ((p0 - 0x9184e72a000) < 0) {
                i1 = 13;
             }else if((p0 - 0x5af3107a4000) < 0){
                i1 = 14;
             }else {
                i1 = 15;
             }
          }else if((p0 - 0x16345785d8a0000) < 0){
             i1 = ((p0 - 0x2386f26fc10000) < 0)? 16: 17;
          }else if((p0 - 0xde0b6b3a7640000) < 0){
             i1 = 18;
          }else {
             i1 = 19;
          }
          if (i2) {
             i1 = i1 + 1;
          }
          u96 ou96 = this.t0(i1);
          int i3 = ou96.c + i1;
          while (true) {
             u96 a = ou96.a;
             if (p0 - i) {
                long l = (long)10;
                long l1 = p0 % l;
                int i4 = (int)l1;
                i3 = i3 - 1;
                a[i3] = zs7.a[i4];
                p0 = p0 / l;
             }else if(i2){
                a[(i3 - 1)] = (byte)45;
             }
             ou96.c = ou96.c + i1;
             this.b = this.b + (long)i1;
          }
       }
       return this;
    }
    public final int write(ByteBuffer p0){
       co5.o(p0, "source");
       int i = p0.remaining();
       int i1 = i;
       while (i1 > 0) {
          u96 ou96 = this.t0(1);
          int i2 = ou96.c - 8192;
          i2 = Math.min(i1, i2);
          p0.get(ou96.a, ou96.c, i2);
          i1 = i1 - i2;
          int i3 = ou96.c + i2;
          ou96.c = i3;
       }
       this.b = this.b + (long)i;
       return i;
    }
    public final f70 write(byte[] p0){
       co5.o(p0, "source");
       this.write(p0, 0, p0.length);
       return this;
    }
    public final f70 write(byte[] p0,int p1,int p2){
       this.write(p0, p1, p2);
       return this;
    }
    public final void write(byte[] p0,int p1,int p2){
       co5.o(p0, "source");
       long l = (long)p2;
       co5.p((long)p0.length, (long)p1, l);
       p2 = p2 + p1;
       for (; p1 < p2; p1 = i2) {
          u96 ou96 = this.t0(1);
          int i = p2 - p1;
          int i1 = ou96.c - 8192;
          i = Math.min(i, i1);
          int i2 = p1 + i;
          uk.j0(ou96.c, p1, i2, p0, ou96.a);
          p1 = ou96.c + i;
          ou96.c = p1;
       }
       this.b = this.b + l;
       return;
    }
    public final f70 writeByte(int p0){
       this.v0(p0);
       return this;
    }
    public final f70 writeInt(int p0){
       this.y0(p0);
       return this;
    }
    public final f70 writeShort(int p0){
       this.z0(p0);
       return this;
    }
    public final e70 x0(long p0){
       if (!(p0)) {
          this.v0(48);
       }else {
          long l = 1;
          long l1 = (p0 >> l) | p0;
          l1 = l1 | (l1 >> 2);
          l1 = l1 | (l1 >> 4);
          l1 = l1 | (l1 >> 8);
          long l2 = 16;
          l1 = l1 | (l1 >> l2);
          long l3 = 32;
          l1 = l1 | (l1 >> l3);
          l1 = l1 - ((l1 >> l) & 0x5555555555555555);
          long l4 = ((l1 >> 2) & 0x3333333333333333) + (l1 & 0x3333333333333333);
          l1 = (l4 >> 4) + l4;
          l1 = l1 & 0xf0f0f0f0f0f0f0f;
          l1 = l1 + (l1 >> 8);
          l1 = l1 + (l1 >> l2);
          l4 = l1 & 63;
          int i = (int)(((l4 + ((l1 >> l3) & 63)) + (long)3) / (long)4);
          u96 ou96 = this.t0(i);
          u96 c = ou96.c;
          for (int i1 = (c + i) - l; i1 >= c; i1 = i1 - 1) {
             l2 = 15 & p0;
             ou96.a[i1] = zs7.a[(int)l2];
             p0 = p0 >> 4;
          }
          ou96.c = ou96.c + i;
          this.b = this.b + (long)i;
       }
       return this;
    }
    public final void y0(int p0){
       u96 ou96 = this.t0(4);
       u96 c = ou96.c;
       int i = c + 1;
       u96 a = ou96.a;
       a[c] = (byte)((p0 >> 24) & 0x00ff);
       int i1 = i + 1;
       a[i] = (byte)((p0 >> 16) & 0x00ff);
       i = i1 + 1;
       a[i1] = (byte)((p0 >> 8) & 0x00ff);
       a[i] = (byte)(p0 & 0x00ff);
       ou96.c = i + 1;
       this.b = this.b + 4;
    }
    public final void z0(int p0){
       u96 ou96 = this.t0(2);
       u96 c = ou96.c;
       int i = c + 1;
       u96 a = ou96.a;
       a[c] = (byte)((p0 >> 8) & 0x00ff);
       a[i] = (byte)(p0 & 0x00ff);
       ou96.c = i + 1;
       this.b = this.b + 2;
    }
}
