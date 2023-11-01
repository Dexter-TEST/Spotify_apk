package p.wq2;
import p.e70;
import java.lang.Object;
import p.ro2;
import p.co5;
import java.lang.System;
import java.util.Arrays;
import p.j80;
import java.lang.String;
import p.g43;
import p.we7;
import java.util.ArrayList;
import p.xq2;
import java.util.Map;
import java.lang.Integer;
import java.lang.Class;

public final class wq2	// class@0003ab from classes2.dex
{
    public final boolean a;
    public final e70 b;
    public int c;
    public boolean d;
    public int e;
    public ro2[] f;
    public int g;
    public int h;
    public int i;

    public void wq2(e70 p0){
       super();
       this.a = true;
       this.b = p0;
       this.c = Integer.MAX_VALUE;
       this.e = 4096;
       ro2[] oro2Array = new ro2[8];
       this.f = oro2Array;
       this.g = 7;
    }
    public final void a(int p0){
       wq2 tg;
       int i2;
       if (p0 > 0) {
          int i = this.f.length - 1;
          int i1 = 0;
          while (true) {
             tg = this.g;
             if (i >= tg && p0 > 0) {
                object oobject = this.f[i];
                co5.i(oobject);
                p0 = p0 - oobject.c;
                object oobject1 = this.f[i];
                co5.i(oobject1);
                i2 = this.i - oobject1.c;
                this.i = i2;
                i2 = this.h - 1;
                this.h = i2;
                i1 = i1 + 1;
                i = i - 1;
             }else {
                break ;
             }
          }
          i2 = tg + 1;
          System.arraycopy(this.f, i2, this.f, (i2 + i1), this.h);
          i = this.g + 1;
          Arrays.fill(this.f, i, (i + i1), null);
          this.g = this.g + i1;
       }
       return;
    }
    public final void b(ro2 p0){
       ro2 c;
       wq2 te = this.e;
       int i = 0;
       if ((c = p0.c) > te) {
          wq2 tf = this.f;
          Arrays.fill(tf, i, tf.length, null);
          this.g = this.f.length - 1;
          this.h = i;
          this.i = i;
          return;
       }else {
          this.a(((this.i + c) - te));
          wq2 tf1 = this.f;
          if (((this.h + 1)) > tf1.length) {
             ro2[] oro2Array = new ro2[(tf1.length * 2)];
             System.arraycopy(tf1, i, oro2Array, tf1.length, tf1.length);
             this.g = this.f.length - 1;
             this.f = oro2Array;
          }
          te = this.g;
          this.g = te - 1;
          this.f[te] = p0;
          this.h = this.h + 1;
          this.i = this.i + c;
          return;
       }
    }
    public final void c(j80 p0){
       co5.o(p0, "data");
       wq2 tb = this.b;
       byte i = 0;
       if (this.a != null) {
          int i1 = p0.d();
          int i2 = 0;
          long l = i2;
          for (int i3 = 0; i3 < i1; i3 = i4) {
             int i4 = i3 + 1;
             i3 = p0.i(i3) & 0x00ff;
             l = l + (long)g43.b[i3];
          }
          if ((int)((l + (long)7) >> 3) < p0.d()) {
             e70 uoe70 = new e70();
             i3 = p0.d();
             l = i2;
             i2 = 0;
             while (i < i3) {
                int i5 = i + 1;
                i = p0.i(i) & 0x00ff;
                i = g43.b[i];
                l = l << i;
                l = l | (long)g43.a[i];
                i2 = i2 + i;
                while (i2 >= 8) {
                   i2 = i2 - 8;
                   long l1 = l >> i2;
                   uoe70.v0((int)l1);
                }
                i = i5;
             }
             if (i2 > 0) {
                uoe70.v0((int)((255 >> i2) | (l << (i2 - 8))));
             }
             p0 = uoe70.m0();
             this.e(p0.d(), 127, 128);
             tb.u0(p0);
          label_0097 :
             return;
          }
       }
       this.e(p0.d(), 127, i);
       tb.u0(p0);
       goto label_0097 ;
    }
    public final void d(ArrayList p0){
       int i;
       int i6;
       int i7;
       int i8;
       if (this.d != null) {
          wq2 tc = this.c;
          i = 32;
          int i1 = 31;
          if (tc < this.e) {
             this.e(tc, i1, i);
          }
          this.d = false;
          this.c = Integer.MAX_VALUE;
          this.e(this.e, i1, i);
       }
       int i2 = p0.size();
       int i3 = 0;
       while (i3 < i2) {
          i = i3 + 1;
          ro2 oro2 = p0.get(i3);
          j80 oj80 = oro2.a.p();
          Integer integer = xq2.b.get(oj80);
          int i4 = -1;
          int i5 = 1;
          ro2 b = oro2.b;
          if (integer != null) {
             i6 = integer.intValue() + i5;
             i7 = (2 <= i6 && i6 < 8)? 1: 0;
             if (i7) {
                ro2[] a = xq2.a;
                if (i8 = i6 - 1) {
                   i7 = i6;
                }else if(co5.c(a[i6].b, b)){
                   i7 = i6 + 1;
                   int i10 = i7;
                   i7 = i6;
                   i6 = i10;
                }
             }
             i7 = i6;
             i6 = -1;
          }else {
             i6 = -1;
             i7 = -1;
          }
          if (i6 == i4) {
             i8 = this.g + i5;
             i5 = this.f.length;
             while (i8 < i5) {
                int i9 = i8 + 1;
                object oobject = this.f[i8];
                co5.i(oobject);
                if (co5.c(oobject.a, oj80)) {
                   oobject = this.f[i8];
                   co5.i(oobject);
                   if (co5.c(oobject.b, b)) {
                      i8 = i8 - this.g;
                      i6 = xq2.a.length + i8;
                      break ;
                   }else if(i7 == i4){
                      i8 = i8 - this.g;
                      i7 = xq2.a.length + i8;
                   }
                }
                i8 = i9;
             }
          }
          if (i6 != i4) {
             this.e(i6, 127, 128);
          }else {
             i6 = 64;
             if (i7 == i4) {
                this.b.v0(i6);
                this.c(oj80);
                this.c(b);
                this.b(oro2);
             }else {
                j80 d = ro2.d;
                oj80.getClass();
                co5.o(d, "prefix");
                if (oj80.m(false, d, d.d()) && !co5.c(ro2.i, oj80)) {
                   this.e(i7, 15, false);
                   this.c(b);
                }else {
                   this.e(i7, 63, i6);
                   this.c(b);
                   this.b(oro2);
                }
             }
          }
          i3 = i;
       }
       return;
    }
    public final void e(int p0,int p1,int p2){
       wq2 tb = this.b;
       if (p0 < p1) {
          tb.v0((p0 | p2));
          return;
       }else {
          tb.v0((p2 | p1));
          p0 = p0 - p1;
          while (true) {
             p1 = 128;
             if (p0 >= p1) {
                p2 = p0 & 0x7f;
                p1 = p1 | p2;
                tb.v0(p1);
                p0 = p0 >> 7;
             }else {
                break ;
             }
          }
          tb.v0(p0);
          return;
       }
    }
}
