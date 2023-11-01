package p.hk;
import p.qk;
import p.rk;
import p.oy6;
import java.lang.Object;
import p.fn6;
import java.util.Arrays;
import java.lang.String;
import p.kg4;
import java.lang.StringBuilder;
import p.en6;

public final class hk implements qk	// class@001870 from classes.dex
{
    public int a;
    public final rk b;
    public final oy6 c;
    public int d;
    public int[] e;
    public int[] f;
    public float[] g;
    public int h;
    public int i;
    public boolean j;

    public void hk(rk p0,oy6 p1){
       super();
       this.a = 0;
       this.d = 8;
       int[] ointArray = new int[8];
       this.e = ointArray;
       ointArray = new int[8];
       this.f = ointArray;
       float[] uofloatArray = new float[8];
       this.g = uofloatArray;
       this.h = -1;
       this.i = -1;
       this.j = false;
       this.b = p0;
       this.c = p1;
    }
    public final float a(int p0){
       hk th = this.h;
       int i = 0;
       while (true) {
          if (th == -1 || i >= this.a) {
             return 0;
          }
          if (i == p0) {
             break ;
          }else {
             th = this.f[th];
             i = i + 1;
          }
       }
       return this.g[th];
    }
    public final float b(rk p0,boolean p1){
       float f = this.i(p0.a);
       this.c(p0.a, p1);
       p0 = p0.d;
       int i = p0.g();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          fn6 uofn6 = p0.h(i1);
          float f1 = p0.i(uofn6) * f;
          this.f(uofn6, f1, p1);
       }
       return f;
    }
    public final float c(fn6 p0,boolean p1){
       hk th = this.h;
       float f = 0;
       if (th == -1) {
          return f;
       }
       int i = 0;
       int i1 = -1;
       while (true) {
          if (th == -1 || i >= this.a) {
             return f;
          }
          if (this.e[th] == p0.b) {
             if (th == this.h) {
                this.h = this.f[th];
             }else {
                hk tf = this.f;
                tf[i1] = tf[th];
             }
             if (p1) {
                p0.b(this.b);
             }
             p0.C = p0.C - 1;
             this.a = this.a - 1;
             if ((p0[th] = -1) != null) {
                this.i = th;
                break ;
             }
             break ;
          }else {
             i = i + 1;
             i1 = th;
             th = this.f[th];
          }
       }
       return this.g[th];
    }
    public final void clear(){
       int i1;
       object oobject;
       hk th = this.h;
       int i = 0;
       while (true) {
          i1 = -1;
          if (th != i1 && i < this.a) {
             if ((oobject = this.c.v[this.e[th]]) != null) {
                oobject.b(this.b);
             }
             th = this.f[th];
             i = i + 1;
          }else {
             break ;
          }
       }
       this.h = i1;
       this.i = i1;
       this.j = false;
       this.a = 0;
       return;
    }
    public final void d(fn6 p0,float p1){
       int i2;
       hk te;
       hk te1;
       int i6;
       if (!(0 - p1)) {
          this.c(p0, true);
          return;
       }else {
          hk th = this.h;
          int i = -1;
          int i1 = 0;
          hk tb = this.b;
          if (th == i) {
             this.h = i1;
             this.g[i1] = p1;
             p1[i1] = p0.b;
             p1[i1] = i;
             p0.C = p0.C + true;
             p0.a(tb);
             this.a = this.a + true;
             if (this.j == null) {
                i2 = this.i + true;
                this.i = i2;
                te = this.e;
                if (i2 >= te.length) {
                   this.j = true;
                   this.i = te.length - true;
                }
             }
             return;
          }else {
             int i3 = 0;
             int i4 = -1;
             while (true) {
                if (th != i && i3 < this.a) {
                   int i5 = this.e[th];
                   fn6 b = p0.b;
                   if (i5 == b) {
                      p0[th] = p1;
                      return;
                   }else if(i5 < b){
                      i4 = th;
                   }
                   th = this.f[th];
                   i3 = i3 + 1;
                }else {
                   th = this.i;
                   i3 = th + 1;
                   if (this.j != null) {
                      te1 = this.e;
                      if (te1[th] != i) {
                         i6 = te1.length;
                      }
                   }else {
                      i6 = i3;
                   }
                   te1 = this.e;
                   if (th >= te1.length && this.a < te1.length) {
                      i3 = 0;
                      while (true) {
                         hk te2 = this.e;
                         if (i3 < te2.length) {
                            if (te2[i3] == i) {
                               i6 = i3;
                               break ;
                            }else {
                               i3 = i3 + 1;
                            }
                         }
                      }
                   }
                   te1 = this.e;
                   if (i6 >= te1.length) {
                      i6 = te1.length;
                      i3 = this.d * 2;
                      this.d = i3;
                      this.j = i1;
                      this.i = i6 - 1;
                      this.g = Arrays.copyOf(this.g, i3);
                      this.e = Arrays.copyOf(this.e, this.d);
                      this.f = Arrays.copyOf(this.f, this.d);
                   }
                   this.e[i6] = p0.b;
                   this.g[i6] = p1;
                   if (i4 != i) {
                      te = this.f;
                      te[i6] = te[i4];
                      te[i4] = i6;
                   }else {
                      p1[i6] = this.h;
                      this.h = i6;
                   }
                   p0.C = p0.C + true;
                   p0.a(tb);
                   i2 = this.a + true;
                   this.a = i2;
                   if (this.j == null) {
                      this.i = this.i + true;
                   }
                   te = this.e;
                   if (i2 >= te.length) {
                      this.j = true;
                   }
                   if (this.i >= te.length) {
                      this.j = true;
                      this.i = te.length - true;
                      break ;
                   }
                   break ;
                }
             }
             return;
          }
       }
    }
    public final boolean e(fn6 p0){
       hk th;
       if ((th = this.h) == -1) {
          return false;
       }
       int i = 0;
       while (true) {
          if (th == -1 || i >= this.a) {
             return false;
          }
          if (this.e[th] == p0.b) {
             break ;
          }else {
             th = this.f[th];
             i = i + 1;
          }
       }
       return true;
    }
    public final void f(fn6 p0,float p1,boolean p2){
       hk te;
       hk te1;
       int i = 0x3a83126f;
       int i1 = -1165815185;
       if ((i1 - p1) > 0 && (p1 - i) < 0) {
          return;
       }
       hk th = this.h;
       hk tb = this.b;
       int i2 = 0;
       int i3 = -1;
       if (th == i3) {
          this.h = i2;
          p2[i2] = p1;
          p1[i2] = p0.b;
          p1[i2] = i3;
          p0.C = p0.C + 1;
          p0.a(tb);
          this.a = this.a + 1;
          if (this.j == null) {
             int i4 = this.i + 1;
             this.i = i4;
             te = this.e;
             if (i4 >= te.length) {
                this.j = true;
                this.i = te.length - 1;
             }
          }
          return;
       }else {
          int i5 = 0;
          int i6 = -1;
          while (true) {
             if (th != i3 && i5 < this.a) {
                int i7 = this.e[th];
                fn6 b = p0.b;
                if (i7 == b) {
                   hk tg = this.g;
                   float f = tg[th] + p1;
                   te = 0;
                   if ((i1 - f) > 0 && (f - i) < 0) {
                      f = 0;
                   }
                   tg[th] = f;
                   if (!(te - f)) {
                      if (th == this.h) {
                         this.h = this.f[th];
                      }else {
                         te = this.f;
                         te[i6] = te[th];
                      }
                      if (p2) {
                         p0.b(tb);
                      }
                      if (this.j != null) {
                         this.i = th;
                      }
                      p0.C = p0.C - 1;
                      this.a = this.a - 1;
                      break ;
                   }
                   break ;
                }else if(i7 < b){
                   i6 = th;
                }
                th = this.f[th];
                i5 = i5 + 1;
             }else {
                hk ti = this.i;
                i = ti + 1;
                if (this.j != null) {
                   te1 = this.e;
                   if (te1[ti] != i3) {
                      ti = te1.length;
                   }
                }else {
                   ti = i;
                }
                te1 = this.e;
                if (ti >= te1.length && this.a < te1.length) {
                   i = 0;
                   while (true) {
                      hk te2 = this.e;
                      if (i < te2.length) {
                         if (te2[i] == i3) {
                            ti = i;
                            break ;
                         }else {
                            i = i + 1;
                         }
                      }
                   }
                }
                te1 = this.e;
                if (ti >= te1.length) {
                   ti = te1.length;
                   i = this.d * 2;
                   this.d = i;
                   this.j = i2;
                   this.i = ti - 1;
                   this.g = Arrays.copyOf(this.g, i);
                   this.e = Arrays.copyOf(this.e, this.d);
                   this.f = Arrays.copyOf(this.f, this.d);
                }
                this.e[ti] = p0.b;
                this.g[ti] = p1;
                if (i6 != i3) {
                   te = this.f;
                   te[ti] = te[i6];
                   te[i6] = ti;
                }else {
                   p1[ti] = this.h;
                   this.h = ti;
                }
                p0.C = p0.C + 1;
                p0.a(tb);
                this.a = this.a + 1;
                if (this.j == null) {
                   this.i = this.i + 1;
                }
                te = this.e;
                if (this.i >= te.length) {
                   this.j = true;
                   this.i = te.length - 1;
                }
                return;
             }
          }
          return;
       }
    }
    public final int g(){
       return this.a;
    }
    public final fn6 h(int p0){
       hk th = this.h;
       int i = 0;
       while (true) {
          if (th == -1 || i >= this.a) {
             return null;
          }
          if (i == p0) {
             break ;
          }else {
             th = this.f[th];
             i = i + 1;
          }
       }
       return this.c.v[this.e[th]];
    }
    public final float i(fn6 p0){
       hk th = this.h;
       int i = 0;
       while (true) {
          if (th == -1 || i >= this.a) {
             return 0;
          }
          if (this.e[th] == p0.b) {
             break ;
          }else {
             th = this.f[th];
             i = i + 1;
          }
       }
       return this.g[th];
    }
    public final void j(float p0){
       hk th = this.h;
       int i = 0;
       while (th != -1 && i < this.a) {
          hk tg = this.g;
          float f = tg[th] / p0;
          tg[th] = f;
          th = this.f[th];
          i = i + 1;
       }
       return;
    }
    public final void k(){
       hk th = this.h;
       int i = 0;
       while (th != -1 && i < this.a) {
          hk tg = this.g;
          float f = tg[th] * 0xbf800000;
          tg[th] = f;
          th = this.f[th];
          i = i + 1;
       }
       return;
    }
    public final String toString(){
       hk th = this.h;
       String str = "";
       int i = 0;
       while (th != -1 && i < this.a) {
          str = en6.r(en6.r(kg4.l(str, " -> ")).append(this.g[th]).append(" : ").toString()).append(this.c.v[this.e[th]]).toString();
          th = this.f[th];
          i = i + 1;
       }
       return str;
    }
}
