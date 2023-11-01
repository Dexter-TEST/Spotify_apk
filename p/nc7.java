package p.nc7;
import java.lang.Object;
import java.util.Arrays;
import java.lang.System;
import java.lang.UnsupportedOperationException;
import java.lang.Integer;
import p.vh0;
import java.lang.IllegalStateException;
import p.rc3;
import p.qc3;
import java.lang.Throwable;
import p.i80;
import java.lang.Long;
import p.sh0;
import p.h80;
import p.vf;
import java.lang.Class;
import java.lang.RuntimeException;

public final class nc7	// class@001fb1 from classes.dex
{
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;
    public static final nc7 f;

    static {
       int[] ointArray = new int[0];
       Object[] objArray = new Object[0];
       nc7.f = new nc7(0, ointArray, objArray, 0);
    }
    public void nc7(){
       int[] ointArray = new int[8];
       Object[] objArray = new Object[8];
       super(0, ointArray, objArray, true);
    }
    public void nc7(int p0,int[] p1,Object[] p2,boolean p3){
       super();
       this.d = -1;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
    }
    public static nc7 e(nc7 p0,nc7 p1){
       int i = p0.a + p1.a;
       int[] ointArray = Arrays.copyOf(p0.b, i);
       System.arraycopy(p1.b, 0, ointArray, p0.a, p1.a);
       Object[] objArray = Arrays.copyOf(p0.c, i);
       System.arraycopy(p1.c, 0, objArray, p0.a, p1.a);
       return new nc7(i, ointArray, objArray, true);
    }
    public final void a(){
       if (this.e != null) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public final void b(int p0){
       int i;
       nc7 tb = this.b;
       if (p0 > tb.length) {
          nc7 ta = this.a;
          if ((i = (ta / 2) + ta) >= p0) {
             p0 = i;
          }
          if (p0 < 8) {
             p0 = 8;
          }
          this.b = Arrays.copyOf(tb, p0);
          this.c = Arrays.copyOf(this.c, p0);
       }
       return;
    }
    public final int c(){
       nc7 td;
       if ((td = this.d) != -1) {
          return td;
       }
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i < this.a) {
             int i2 = this.b[i];
             int i3 = i2 >> 3;
             if (i2 = i2 & 0x07) {
                if (i2 != 1) {
                   if (i2 != 2) {
                      if (i2 != 3) {
                         if (i2 == 5) {
                            this.c[i].intValue();
                            i2 = vh0.r0(i3);
                         }else {
                            break ;
                         }
                      }else {
                         i2 = vh0.E0(i3) * 2;
                         i3 = this.c[i].c() + i2;
                         i3 = i3 + i1;
                         i1 = i3;
                      label_007a :
                         i = i + 1;
                      }
                   }else {
                      i2 = vh0.o0(i3, this.c[i]);
                   }
                }else {
                   this.c[i].longValue();
                   i2 = vh0.s0(i3);
                }
             }else {
                i2 = vh0.H0(i3, this.c[i].longValue());
             }
             i2 = i2 + i1;
             i1 = i2;
             goto label_007a ;
          }else {
             this.d = i1;
             return i1;
          }
       }
       throw new IllegalStateException(new qc3());
    }
    public final boolean d(int p0,sh0 p1){
       int i1;
       int i2;
       this.a();
       int i = p0 >> 3;
       if (i1 = p0 & 0x07) {
          if (i1 != 1) {
             if (i1 != 2) {
                if (i1 != 3) {
                   if (i1 == 4) {
                      return false;
                   }
                   if (i1 != 5) {
                      throw new qc3();
                   }
                   this.f(p0, Integer.valueOf(p1.o()));
                   return true;
                }else {
                   nc7 onc7 = new nc7();
                   do {
                   } while ((i2 = p1.A()) && onc7.d(i2, p1));
                   p1.a(((i << 3) | 4));
                   this.f(p0, onc7);
                   return true;
                }
             }else {
                this.f(p0, p1.l());
                return true;
             }
          }else {
             this.f(p0, Long.valueOf(p1.p()));
             return true;
          }
       }else {
          this.f(p0, Long.valueOf(p1.s()));
          return true;
       }
    }
    public final boolean equals(Object p0){
       nc7 ta;
       int i2;
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (!p0 instanceof nc7) {
          return false;
       }
       if ((ta = this.a) == p0.a) {
          nc7 tb = this.b;
          nc7 b = p0.b;
          int i = 0;
          while (true) {
             if (i < ta) {
                if (tb[i] != b[i]) {
                   ta = 0;
                label_0028 :
                   if (ta) {
                      ta = this.c;
                      p0 = p0.c;
                      tb = this.a;
                      int i1 = 0;
                      while (true) {
                         if (i1 < tb) {
                            if (!ta[i1].equals(p0[i1])) {
                               i2 = 0;
                            label_0043 :
                               if (i2) {
                                  return true;
                               }
                            }else {
                               i1 = i1 + 1;
                            }
                         }else {
                            i2 = 1;
                            goto label_0043 ;
                         }
                      }
                   }
                }else {
                   i = i + 1;
                }
             }else {
                ta = 1;
                goto label_0028 ;
             }
          }
       }
       return false;
    }
    public final void f(int p0,Object p1){
       this.a();
       this.b((this.a + 1));
       nc7 ta = this.a;
       this.b[ta] = p0;
       p0[ta] = p1;
       this.a = ta + 1;
    }
    public final void g(vf p0){
       if (this.a == null) {
          return;
       }
       p0.getClass();
       int i = 0;
       while (true) {
          if (i >= this.a) {
             return;
          }
          int i1 = this.b[i];
          object oobject = this.c[i];
          int i2 = i1 >> 3;
          if (i1 = i1 & 0x07) {
             if (i1 != 1) {
                if (i1 != 2) {
                   int i3 = 3;
                   if (i1 != i3) {
                      if (i1 == 5) {
                         p0.B(i2, oobject.intValue());
                      }else {
                         break ;
                      }
                   }else {
                      p0.b.a1(i2, i3);
                      oobject.g(p0);
                      p0.b.a1(i2, 4);
                   }
                }else {
                   p0.y(i2, oobject);
                }
             }else {
                p0.C(i2, oobject.longValue());
             }
          }else {
             p0.G(i2, oobject.longValue());
          }
          i = i + 1;
       }
       throw new RuntimeException(new qc3());
    }
    public final int hashCode(){
       nc7 ta = this.a;
       int i = (527 + ta) * 31;
       nc7 tb = this.b;
       int i1 = 0;
       int i2 = 17;
       int i4 = 17;
       for (int i3 = 0; i3 < ta; i3 = i3 + 1) {
          i4 = i4 * 31;
          i4 = i4 + tb[i3];
       }
       i = (i + i4) * 31;
       ta = this.c;
       tb = this.a;
       for (; i1 < tb; i1 = i1 + 1) {
          i2 = i2 * 31;
          i2 = i2 + ta[i1].hashCode();
       }
       return (i + i2);
    }
}
