package p.zs7;
import p.oe0;
import java.nio.charset.Charset;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.u96;
import p.e70;
import p.t45;

public abstract class zs7	// class@0003fd from classes2.dex
{
    public static final byte[] a;

    static {
       byte[] bytes = "0123456789abcdef".getBytes(oe0.a);
       co5.l(bytes, "this as java.lang.String\).getBytes\(charset\)");
       zs7.a = bytes;
    }
    public static final boolean a(u96 p0,int p1,byte[] p2,int p3){
       u96 b;
       u96 c = p0.c;
       u96 a = p0.a;
       int i = 1;
       while (true) {
          if (i >= p3) {
             return true;
          }
          if (p1 == c) {
             p0 = p0.f;
             co5.i(p0);
             b = p0.b;
             c = p0.c;
             a = p0.a;
          }
          if (a[b] != p2[i]) {
             break ;
          }else {
             b++;
             i = i + 1;
          }
       }
       return false;
    }
    public static final String b(e70 p0,long p1){
       String str;
       co5.o(p0, "<this>");
       if ((p1) > 0) {
          long l = p1 - 1;
          if (p0.h0(l) == (byte)13) {
             str = p0.r0(l);
             p0.skip(2);
          label_0029 :
             return str;
          }
       }
       str = p0.r0(p1);
       p0.skip(1);
       goto label_0029 ;
    }
    public static final int c(e70 p0,t45 p1,boolean p2){
       int i5;
       int i6;
       int i7;
       u96 a1;
       u96 ou96;
       e70 obj = p0;
       Object obj1 = p1;
       co5.o(obj, "<this>");
       co5.o(obj1, "options");
       obj = obj.a;
       int i = -2;
       if (obj == null) {
          if (!p2) {
             i = -1;
          }
          return i;
       }else {
          u96 b = obj.b;
          u96 c = obj.c;
          u96 a = obj.a;
          e70 uoe70 = obj;
          int i1 = 0;
          int i2 = -1;
          while (true) {
             int i3 = i1 + 1;
             t45 b1 = obj1.b;
             i1 = b1[i1];
             int i4 = i3 + 1;
             if ((i3 = b1[i3]) != -1) {
                i2 = i3;
                break ;
             }else if(uoe70 == null){
                i3 = 0;
                if (i1 < 0) {
                   i1 = i1 * -1;
                   i5 = i1 + i4;
                   while (true) {
                      i1 = b + 1;
                      i6 = a[b] & 0x00ff;
                      i7 = i4 + 1;
                      if (i6 != b1[i4]) {
                         return i2;
                      }
                      i6 = (i7 == i5)? 1: 0;
                      if (i1 == c) {
                         co5.i(uoe70);
                         c = uoe70.f;
                         co5.i(c);
                         a = c.b;
                         u96 c1 = c.c;
                         a1 = c.a;
                         if (c == obj) {
                            if (i6) {
                               c = c1;
                               i1 = i3;
                            }
                         }else {
                            c1 = c;
                            c = c1;
                         }
                      }else {
                         a1 = a;
                         int i8 = i1;
                         e70 uoe701 = uoe70;
                      }
                      if (i6) {
                         i6 = b1[i7];
                         ou96 = a;
                         a = a1;
                         a1 = i1;
                      }else {
                         b = a;
                         a = a1;
                         i4 = i7;
                         a1 = i1;
                      }
                   }
                   return i2;
                }else {
                   i5 = b + 1;
                   i6 = a[b] & 0x00ff;
                   i7 = i4 + i1;
                   while (i4 != i7) {
                      if (i6 == b1[i4]) {
                         i4 = i4 + i1;
                         i6 = b1[i4];
                         if (i5 == c) {
                            a1 = uoe70.f;
                            co5.i(a1);
                            ou96 = a1.b;
                            c = a1.c;
                            a = a1.a;
                            if (a1 == obj) {
                               a1 = i3;
                            }
                         }else {
                            ou96 = i5;
                         }
                      }
                      i4 = i4 + 1;
                      ou96 = -2;
                   }
                }
                if (i6 >= 0) {
                   return i6;
                }else {
                   i1 = - i6;
                   b = ou96;
                   i = -2;
                }
             }
             if (p2) {
                return i;
             }else {
                return i2;
             }
          }
       }
    }
}
