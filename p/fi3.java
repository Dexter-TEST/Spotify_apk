package p.fi3;
import java.io.InputStream;
import p.rx0;
import p.i70;
import java.io.DataInputStream;
import p.jw3;
import p.oo5;
import p.ei3;
import java.lang.IllegalArgumentException;
import p.id7;
import java.lang.String;
import p.fx0;
import java.lang.Class;
import java.lang.Object;
import p.bi3;
import java.lang.System;
import p.ng3;
import p.mf3;
import java.lang.IndexOutOfBoundsException;

public final class fi3 extends InputStream	// class@0001f3 from classes2.dex
{
    public InputStream a;
    public i70 b;
    public jw3 c;
    public oo5 t;
    public ei3 v;
    public boolean w;
    public final byte[] x;
    public long y;
    public IOException z;

    public void fi3(rx0 p0){
       int i2;
       int i3;
       int i4;
       int i5;
       fi3 uofi3 = this;
       InputStream inputStream = p0;
       i70 t = i70.t;
       super();
       uofi3.w = false;
       byte[] uobyteArray = new byte[1];
       uofi3.x = uobyteArray;
       uofi3.z = null;
       DataInputStream uDataInputSt = new DataInputStream(inputStream);
       int b = uDataInputSt.readByte();
       int i = 0;
       int i1 = 0;
       while (true) {
          i2 = 4;
          if (i < i2) {
             i3 = i * 8;
             i2 = uDataInputSt.readUnsignedByte() << i3;
             i1 = i1 | i2;
             i = i + 1;
          }else {
             break ;
          }
       }
       i = 0;
       long l = 0;
       while (true) {
          i4 = 8;
          if (i < i4) {
             i5 = i * 8;
             long l1 = (long)uDataInputSt.readUnsignedByte() << i5;
             l = l | l1;
             i = i + 1;
          }else {
             break ;
          }
       }
       String str = "LZMA dictionary is too big for this implementation";
       if (i1 >= 0) {
          i = 0x7ffffff0;
          if (i1 <= i) {
             b = b & 0x00ff;
             int i6 = 224;
             if (b <= i6) {
                i5 = b % 45;
                int i7 = i5 / 9;
                if ((i5 = i5 - (i7 * 9)) >= 0 && (i5 <= i4 && (i7 >= 0 && i7 <= i2))) {
                   if ((v3 = l - -1) >= 0) {
                      if (b <= i6) {
                         i3 = b / 45;
                         b = b - ((i3 * 9) * 5);
                         int i8 = b / 9;
                         b = b - (i8 * 9);
                         if (i1 >= 0 && i1 <= i) {
                            if (i7 >= 0 && (b >= 0 && (b <= i4 && (i8 >= 0 && (i8 <= i2 && (i3 >= 0 && i3 <= i2)))))) {
                               uofi3.a = inputStream;
                               uofi3.b = t;
                               int i9 = fi3.b(i1);
                               if ((l) >= 0 && ((long)i9 - l) > 0) {
                                  i9 = fi3.b((int)l);
                               }
                               uofi3.c = new jw3(fi3.b(i9), 0);
                               oo5 ooo5 = new oo5(inputStream);
                               uofi3.t = ooo5;
                               ei3 inputStream1 = new ei3(uofi3.c, ooo5, b, i8, i3);
                               uofi3.v = inputStream;
                               uofi3.y = l;
                               return;
                            }else {
                               throw new IllegalArgumentException();
                            }
                         }else {
                            throw new id7(str);
                         }
                      }else {
                         throw new fx0(0);
                      }
                   }else {
                      throw new id7("Uncompressed size is too big");
                   }
                }else {
                   throw new IllegalArgumentException("Invalid lc or lp");
                }
             }else {
                throw new fx0(0);
             }
          }
       }
       throw new id7(str);
    }
    public static int b(int p0){
       if (p0 < 0 || p0 > 0x7ffffff0) {
          throw new IllegalArgumentException("LZMA dictionary is too big for this implementation");
       }
       if (p0 < 4096) {
          p0 = 4096;
       }
       return ((p0 + 15) & 0xf0);
    }
    public final void close(){
       if (this.a != null) {
          if (this.c != null) {
             this.b.getClass();
             this.c = null;
          }
          this.a.close();
          this.a = null;
       }
       return;
    }
    public final int read(){
       fi3 tx = this.x;
       int i = -1;
       if (this.read(tx, 0, 1) == i) {
       }else {
          i = tx[0] & 0x00ff;
       }
       return i;
    }
    public final int read(byte[] p0,int p1,int p2){
       int i;
       fi3 tz;
       int i4;
       if (p1 < 0 || (p2 < 0 || ((i = p1 + p2) < 0 || i > p0.length))) {
          throw new IndexOutOfBoundsException();
       }
       i = 0;
       if (!p2) {
          return i;
       }
       if (this.a == null) {
          throw new mf3("Stream closed");
       }
       if ((tz = this.z) != null) {
          throw tz;
       }
       int i1 = -1;
       if (this.w != null) {
          return i1;
       }
       int i2 = 0;
       while (true) {
          if (p2 <= 0) {
             return i2;
          }
          try{
             fi3 ty = this.y;
             int i3 = ((ty) >= 0 && (ty - (long)p2) < 0)? (int)ty: p2;
             ty = this.c;
             jw3 b = ty.b;
             jw3 d = ty.d;
             if ((i4 = b - d) <= i3) {
                ty.f = b;
             }else {
                int i6 = d + i3;
                ty.f = i6;
             }
             boolean b1 = true;
             try{
                this.v.a();
             }catch(p.fx0 e4){
                if (!(this.y - -1)) {
                   b = (this.v.b[i] == i1)? 1: 0;
                   if (b) {
                      this.w = b1;
                      this.t.f();
                   }
                }
                throw e4;
             }
             fi3 tc = this.c;
             b = tc.d;
             d = tc.c;
             i4 = b - d;
             if (b == tc.b) {
                tc.d = i;
             }
             System.arraycopy(tc.i, d, p0, p1, i4);
             tc.c = tc.d;
             p1 = p1 + i4;
             p2 = p2 - i4;
             i2 = i2 + i4;
             fi3 ty1 = this.y;
             if ((ty1) >= 0) {
                long l = ty1 - (long)i4;
                this.y = l;
                if (!(l)) {
                   this.w = b1;
                }
             }
             if (this.w != null) {
                int i5 = (this.t.c == null)? 1: 0;
                if (i5) {
                   fi3 tc1 = this.c;
                   if (tc1.g > null) {
                      i = 1;
                   }
                   if (!i) {
                      if (tc1 != null) {
                         this.b.getClass();
                         this.c = null;
                      }
                      if (i2) {
                         i1 = i2;
                         break ;
                      }
                      break ;
                   }
                }
                throw new fx0();
             }
          }catch(java.io.IOException e13){
             this.z = e13;
             throw e13;
          }
       }
       return i1;
    }
}
