package p.eb1;
import p.do5;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Arrays;
import p.db1;
import java.util.Iterator;
import java.util.ArrayDeque;
import p.fb1;
import p.xl3;
import p.g00;
import java.util.List;

public final class eb1	// class@001452 from classes.dex
{
    public final List a;
    public final int[] b;
    public final int[] c;
    public final do5 d;
    public final int e;
    public final int f;
    public final boolean g;

    public void eb1(do5 p0,ArrayList p1,int[] p2,int[] p3){
       int i2;
       int i3;
       int i4;
       db1 a;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       Arrays.fill(p2, 0);
       Arrays.fill(p3, 0);
       this.d = p0;
       int i = p0.A();
       this.e = i;
       int i1 = p0.z();
       this.f = i1;
       this.g = true;
       db1 uodb1 = (p1.isEmpty())? null: p1.get(0);
       if (uodb1 == null || (uodb1.a != null || uodb1.b != null)) {
          p1.add(0, new db1(0, 0, 0));
       }
       p1.add(new db1(i, i1, 0));
       Iterator iterator = p1.iterator();
       while (true) {
          eb1 td = this.d;
          eb1 tc = this.c;
          eb1 tb = this.b;
          if (iterator.hasNext()) {
             db1 uodb11 = iterator.next();
             for (i2 = 0; i2 < uodb11.c; i2 = i2 + 1) {
                i3 = uodb11.a + i2;
                i4 = uodb11.b + i2;
                int i5 = (td.b(i3, i4))? 1: 2;
                int i6 = i4 << 4;
                i6 = i6 | i5;
                tb[i3] = i6;
                i3 = i3 << 4;
                i3 = i3 | i5;
                tc[i4] = i3;
             }
          }else if(this.g != null){
             iterator = p1.iterator();
             i = 0;
             while (iterator.hasNext()) {
                db1 uodb12 = iterator.next();
                while (true) {
                   a = uodb12.a;
                   if (i < a) {
                      if (!tb[i]) {
                         i2 = p1.size();
                         i4 = 0;
                         for (i3 = 0; i3 < i2; i3 = i3 + 1) {
                            db1 uodb13 = p1.get(i3);
                            while (true) {
                               db1 b = uodb13.b;
                               if (i4 < b) {
                                  if (!tc[i4] && td.c(i, i4)) {
                                     i2 = (td.b(i, i4))? 8: 4;
                                     i3 = i4 << 4;
                                     i3 = i3 | i2;
                                     tb[i] = i3;
                                     i3 = i << 4;
                                     i2 = i2 | i3;
                                     tc[i4] = i2;
                                  }else {
                                     i4 = i4 + 1;
                                  }
                               }else {
                                  i4 = uodb13.c + b;
                               }
                            }
                         }
                      }
                      i++;
                   }else {
                      break ;
                   }
                }
                i = uodb12.c + a;
             }
          }
          return;
       }
    }
    public static fb1 b(ArrayDeque p0,int p1,boolean p2){
       fb1 uofb1;
       int i;
       Iterator iterator = p0.iterator();
       while (true) {
          if (iterator.hasNext()) {
             uofb1 = iterator.next();
             if (uofb1.a == p1 && uofb1.c == p2) {
                iterator.remove();
             }
          }else {
             uofb1 = null;
          }
          while (iterator.hasNext()) {
             fb1 uofb11 = iterator.next();
             if (p2) {
                i = uofb11.b - 1;
                uofb11.b = i;
             }else {
                i = uofb11.b + 1;
                uofb11.b = i;
                continue ;
             }
          }
          return uofb1;
       }
    }
    public final void a(xl3 p0){
       int b1;
       eb1 b2;
       eb1 d;
       int i4;
       eb1 uoeb13;
       int i5;
       fb1 uofb1;
       eb1 uoeb14;
       int i6;
       int i7;
       fb1 uofb11;
       eb1 uoeb1 = this;
       g00 og00 = p0;
       if (og00 instanceof g00) {
       }else {
          og00 = new g00(og00);
       }
       ArrayDeque uArrayDeque = new ArrayDeque();
       eb1 a = uoeb1.a;
       int i = a.size() - 1;
       eb1 e = uoeb1.e;
       eb1 uoeb11 = uoeb1.f;
       eb1 uoeb12 = e;
       while (i >= 0) {
          db1 uodb1 = a.get(i);
          db1 c = uodb1.c;
          int i1 = uodb1.a + c;
          db1 b = uodb1.b;
          int i2 = c + b;
          while (true) {
             b1 = false;
             b2 = uoeb1.b;
             d = uoeb1.d;
             if (uoeb12 > i1) {
                uoeb12 = uoeb12 - 1;
                int i3 = b2[uoeb12];
                if (i4 = i3 & 0x0c) {
                   uoeb13 = a;
                   i5 = i3 >> 4;
                   if ((uofb1 = eb1.b(uArrayDeque, i5, b1)) != null) {
                      b1 = e - uofb1.b;
                      uoeb14 = uoeb11;
                      i6 = 1;
                      b1 = b1 - i6;
                      og00.f(uoeb12, b1);
                      if (i3 = i3 & 0x04) {
                         d.u(uoeb12, i5);
                         og00.l(b1, i6, null);
                      }
                   }else {
                      uoeb14 = uoeb11;
                      i6 = 1;
                      i7 = e - uoeb12;
                      i7 = i7 - i6;
                      uArrayDeque.add(new fb1(uoeb12, i6, i7));
                   }
                }else {
                   uoeb13 = a;
                   uoeb14 = uoeb11;
                   og00.d(uoeb12, 1);
                   e = e - 1;
                }
                a = uoeb13;
                uoeb11 = uoeb14;
                d = 1;
             }else {
                break ;
             }
          }
          uoeb13 = a;
          uoeb14 = uoeb11;
          while (uoeb11 > i2) {
             i6 = uoeb11 - 1;
             i5 = uoeb1.c[i6];
             if (i1 = i5 & 0x0c) {
                i1 = i5 >> 4;
                b1 = true;
                if ((uofb11 = eb1.b(uArrayDeque, i1, b1)) == null) {
                   i5 = e - uoeb12;
                   uArrayDeque.add(new fb1(i6, false, i5));
                   uoeb14 = 0;
                }else {
                   int i8 = e - uofb11.b;
                   i8 = i8 - b1;
                   og00.f(i8, uoeb12);
                   if (i8 = i5 & 0x04) {
                      d.u(i1, i6);
                      og00.l(uoeb12, b1, null);
                   }
                }
             }else {
                og00.k(uoeb12, 1);
                e = e + 1;
             }
             uoeb1 = this;
          }
          uoeb12 = uodb1.a;
          db1 uodb11 = uoeb12;
          db1 uodb12 = b;
          for (b1 = 0; b1 < c; b1 = b1 + 1) {
             if ((i6 = b2[uodb11] & 0x0f) == 2) {
                d.u(uodb11, uodb12);
                og00.l(uodb11, 1, null);
             }else {
                uodb1 = 1;
             }
             uodb11 = uodb11 + 1;
             uodb12 = uodb12 + 1;
          }
          i = i - 1;
          uoeb1 = this;
          uoeb11 = b;
          a = uoeb13;
          i7 = 1;
       }
       og00.a();
       return;
    }
}
