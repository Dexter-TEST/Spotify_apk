package p.mk5;
import p.rk;
import p.oy6;
import p.fn6;
import p.ko1;
import p.vk3;
import p.qk;
import java.lang.Math;
import java.lang.Object;
import java.util.Arrays;
import p.lk5;
import java.util.Comparator;
import java.lang.String;
import java.lang.StringBuilder;

public final class mk5 extends rk	// class@001eb3 from classes.dex
{
    public fn6[] f;
    public fn6[] g;
    public int h;
    public final ko1 i;

    public void mk5(oy6 p0){
       super(p0);
       fn6[] uofn6Array = new fn6[128];
       this.f = uofn6Array;
       fn6[] uofn6Array1 = new fn6[128];
       this.g = uofn6Array1;
       this.h = 0;
       this.i = new ko1(this, this);
    }
    public final fn6 d(boolean[] p0){
       int i4;
       int i = 0;
       int i1 = -1;
       while (i < this.h) {
          mk5 tf = this.f;
          object oobject = tf[i];
          if (!p0[oobject.b]) {
             mk5 ti = this.i;
             ti.b = oobject;
             oobject = 1;
             int i2 = 8;
             if (i1 == -1) {
                while (true) {
                   if (i2 >= 0) {
                      int i3 = ti.b.y[i2];
                      i4 = 0;
                      if ((i4 - i3) > 0) {
                      label_0034 :
                         oobject = 0;
                         break ;
                      }else if((i3 - i4) < 0){
                         break ;
                      }else {
                         i2 = i2 - 1;
                      }
                   }else {
                      goto label_0034 ;
                   }
                }
                if (!oobject) {
                label_0058 :
                   i = i + 1;
                }
             }else {
                object oobject1 = tf[i1];
                while (true) {
                   if (i2 >= 0) {
                      i4 = oobject1.y[i2];
                      int i5 = ti.b.y[i2];
                      if (!(i4 - i5)) {
                         i2 = i2 - 1;
                      }else if((i5 - i4) < 0){
                         break ;
                      }else {
                      label_0054 :
                         oobject = 0;
                         break ;
                      }
                   }else {
                      goto label_0054 ;
                   }
                }
                if (!oobject) {
                }
             }
             i1 = i;
             goto label_0058 ;
          }
       }
       if (i1 == -1) {
          return null;
       }
       return this.f[i1];
    }
    public final boolean e(){
       boolean b = (this.h == null)? true: false;
       return b;
    }
    public final void i(vk3 p0,rk p1,boolean p2){
       rk a;
       int i3;
       int i4;
       mk5 omk5 = this;
       rk ork = p1;
       if ((a = ork.a) == null) {
          return;
       }
       rk d = ork.d;
       int i = d.g();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          fn6 uofn6 = d.h(i1);
          float f = d.a(i1);
          mk5 i2 = omk5.i;
          i2.b = uofn6;
          fn6 y = a.y;
          if (uofn6.a != null) {
             i3 = 0;
             i4 = 1;
             while (i3 < 9) {
                fn6 y1 = i2.b.y;
                float f1 = y[i3] * f;
                f1 = f1 + y1[i3];
                if (((y1[i3] = f1)) < 0) {
                   i2.b.y[i3] = 0;
                }else {
                   i4 = 0;
                }
                i3 = i3 + 1;
             }
             if (i4) {
                i2.t.k(i2.b);
             }
             i4 = 0;
          }else {
             int i5 = 0;
             while (i5 < 9) {
                i3 = y[i5];
                if (0 - i3) {
                   float f3 = i3 * f;
                   if ((Math.abs(f3) - 0x38d1b717) < 0) {
                      f3 = 0;
                   }
                   i2.b.y[i5] = f3;
                }else {
                   i2.b.y[i5] = 0;
                }
                i5 = i5 + 1;
             }
             i4 = 1;
          }
          if (i4) {
             omk5.j(uofn6);
          }
          float f2 = ork.b * f;
          f2 = f2 + omk5.b;
          omk5.b = f2;
       }
       omk5.k(a);
       return;
    }
    public final void j(fn6 p0){
       mk5 th;
       mk5 tf = this.f;
       if (((this.h + 1)) > tf.length) {
          fn6[] uofn6Array = Arrays.copyOf(tf, (tf.length * 2));
          this.f = uofn6Array;
          this.g = Arrays.copyOf(uofn6Array, (uofn6Array.length * 2));
       }
       mk5 tf1 = this.f;
       tf = this.h;
       tf1[tf] = p0;
       int i = tf + 1;
       this.h = i;
       if (i > 1 && tf1[(i - 1)].b > p0.b) {
          int i1 = 0;
          i = 0;
          while (true) {
             th = this.h;
             if (i < th) {
                this.g[i] = this.f[i];
                i = i + 1;
             }else {
                break ;
             }
          }
          Arrays.sort(this.g, i1, th, new lk5(i1, this));
          for (; i1 < this.h; i1 = i1 + 1) {
             this.f[i1] = this.g[i1];
          }
       }
       p0.a = true;
       p0.a(this);
       return;
    }
    public final void k(fn6 p0){
       mk5 th;
       int i = 0;
       while (true) {
          if (i >= this.h) {
             return;
          }
          if (this.f[i] == p0) {
             while (true) {
                th = this.h;
                int i1 = th - 1;
                if (i < i1) {
                   th = this.f;
                   i1 = i + 1;
                   th[i] = th[i1];
                   i = i1;
                }else {
                   break ;
                }
             }
             this.h = th - 1;
             p0.a = false;
             return;
          }else {
             i = i + 1;
          }
       }
    }
    public final String toString(){
       String str = " goal -> \("+this.b+"\) : ";
       for (int i = 0; i < this.h; i = i + 1) {
          mk5 ti = this.i;
          ti.b = this.f[i];
          str = "".append(str).append(ti).append(" ").toString();
       }
       return str;
    }
}
