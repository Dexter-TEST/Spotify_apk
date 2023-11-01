package p.ph0;
import p.sh0;
import p.rc3;
import p.qc3;
import java.lang.String;
import p.h80;
import p.i80;
import java.util.Arrays;
import p.cc3;
import java.lang.Double;
import java.lang.Float;
import java.nio.charset.Charset;
import p.se7;
import p.qe7;

public final class ph0 extends sh0	// class@00225d from classes.dex
{
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public final int i;
    public int j;
    public int k;

    public void ph0(byte[] p0,int p1,int p2,boolean p3){
       super();
       this.k = Integer.MAX_VALUE;
       this.e = p0;
       this.f = p2 + p1;
       this.h = p1;
       this.i = p1;
    }
    public final int A(){
       if (this.e()) {
          this.j = 0;
          return 0;
       }else {
          int i = this.G();
          this.j = i;
          if ((i >> 3)) {
             return i;
          }
          throw rc3.a();
       }
    }
    public final int B(){
       return this.G();
    }
    public final long C(){
       return this.H();
    }
    public final boolean D(int p0){
       ph0 th;
       int i1;
       int i = p0 & 0x07;
       boolean b = false;
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 4) {
                      if (i == 5) {
                         this.J(4);
                         return true;
                      }else {
                         throw new qc3();
                      }
                   }else {
                      return b;
                   }
                }else {
                   do {
                   } while ((i = this.A()) && this.D(i));
                   this.a((((p0 >> 3) << 3) | 4));
                   return true;
                }
             }else {
                this.J(this.G());
                return true;
             }
          }else {
             this.J(8);
             return true;
          }
       }else {
          ph0 te = this.e;
          if (((this.f - this.h)) >= 10) {
             while (true) {
                if (b >= 10) {
                   throw rc3.d();
                }
                th = this.h;
                i1 = th + 1;
                this.h = i1;
                if (te[th] < 0) {
                   b = b + 1;
                }
             }
          }else {
             while (true) {
                if (b >= 10) {
                   throw rc3.d();
                }
                if ((th = this.h) != this.f) {
                   i1 = th + 1;
                   this.h = i1;
                   if (te[th] < 0) {
                      b = b + 1;
                   }
                }else {
                   throw rc3.g();
                }
             }
          }
          return true;
       }
    }
    public final int E(){
       ph0 th = this.h;
       if (((this.f - th)) < 4) {
          throw rc3.g();
       }
       this.h = th + 4;
       ph0 te = this.e;
       return (((te[(th + 3)] & 0x00ff) << 24) | (((te[th] & 0x00ff) | ((te[(th + 1)] & 0x00ff) << 8)) | ((te[(th + 2)] & 0x00ff) << 16)));
    }
    public final long F(){
       ph0 th = this.h;
       long l = 8;
       if (((this.f - th)) < l) {
          throw rc3.g();
       }
       this.h = th + 8;
       ph0 te = this.e;
       return ((((long)te[(th + 7)] & 255) << 56) | ((((((((long)te[th] & 255) | (((long)te[(th + 1)] & 255) << l)) | (((long)te[(th + 2)] & 255) << 16)) | (((long)te[(th + 3)] & 255) << 24)) | (((long)te[(th + 4)] & 255) << 32)) | (((long)te[(th + 5)] & 255) << 40)) | (((long)te[(th + 6)] & 255) << 48)));
    }
    public final int G(){
       ph0 tf;
       int b;
       ph0 th = this.h;
       if ((tf = this.f) == th) {
       }else {
          int i = th + 1;
          ph0 te = this.e;
          if ((b = te[th]) >= 0) {
             this.h = i;
             return b;
          }else if(((tf - i)) < 9){
             byte i1 = i + 1;
             if ((b = b ^ (te[i] << 7)) < 0) {
                b = b ^ 0x80;
             }else {
                i = i1 + 1;
                if ((b = b ^ (te[i1] << 14)) >= 0) {
                   b = b ^ 0x3f80;
                }else {
                   i1 = i + 1;
                   if ((b = b ^ (te[i] << 21)) < 0) {
                      b = b ^ -2080896;
                   }else {
                      i = i1 + 1;
                      i1 = te[i1];
                      b = (b ^ (i1 << 28)) ^ 0xfe03f80;
                      if (i1 < 0) {
                         i1 = i + 1;
                         if (te[i] < 0) {
                            i = i1 + 1;
                            if (te[i1] < 0) {
                               i1 = i + 1;
                               if (te[i] < 0) {
                                  i = i1 + 1;
                                  if (te[i1] < 0) {
                                     i1 = i + 1;
                                     if (te[i] >= 0) {
                                     label_0070 :
                                        this.h = i1;
                                        return b;
                                     }
                                  }
                               }else {
                                  goto label_0070 ;
                               }
                            }
                         }else {
                            goto label_0070 ;
                         }
                      }
                   }
                }
                i1 = i;
                goto label_0070 ;
             }
          }
       }
       return (int)this.I();
    }
    public final long H(){
       ph0 tf;
       int b;
       long l;
       long l1;
       ph0 th = this.h;
       if ((tf = this.f) == th) {
       }else {
          int i = th + 1;
          ph0 te = this.e;
          if ((b = te[th]) >= 0) {
             this.h = i;
             return (long)b;
          }else if(((tf - i)) < 9){
             int i1 = i + 1;
             if ((b = b ^ (te[i] << 7)) < 0) {
                b = b ^ 0x80;
             label_0026 :
                l = (long)b;
             }else {
                i = i1 + 1;
                if ((b = b ^ (te[i1] << 14)) >= 0) {
                   l1 = (long)(b ^ 0x3f80);
                }else {
                   i1 = i + 1;
                   if ((b = b ^ (te[i] << 21)) < 0) {
                      b = b ^ -2080896;
                      goto label_0026 ;
                   }else {
                      b = i1 + 1;
                      long l2 = ((long)te[i1] << 28) ^ (long)b;
                      if ((l2) >= 0) {
                         l = l2 ^ 0xfe03f80;
                         i1 = b;
                      }else {
                         i1 = b + 1;
                         l1 = l2 ^ ((long)te[b] << 35);
                         if ((l1) < 0) {
                            l1 = 0xfffffff80fe03f80;
                         }else {
                            i = i1 + 1;
                            l1 = l1 ^ ((long)te[i1] << 42);
                            if ((l1) >= 0) {
                               l1 = l1 ^ 0x3f80fe03f80;
                            }else {
                               int i2 = i + 1;
                               l1 = l1 ^ ((long)te[i] << 49);
                               if ((l1) < 0) {
                                  l1 = 0xfffe03f80fe03f80;
                               }else {
                                  i = i2 + 1;
                                  l1 = (l1 ^ ((long)te[i2] << 56)) ^ 0xfe03f80fe03f80;
                                  if ((l1) < 0) {
                                     i2 = i + 1;
                                     if (((long)te[i]) >= 0) {
                                        l = l1;
                                     label_0073 :
                                        i1 = i1;
                                     }
                                  }
                               }
                            }
                         }
                         l1 = l1 ^ l1;
                         goto label_0073 ;
                      }
                   }
                }
                i1 = i;
                l = l1;
             }
             this.h = i1;
             return l;
          }
       }
       return this.I();
    }
    public final long I(){
       ph0 th;
       long l = 0;
       long l1 = 0;
       while (true) {
          if (l1 >= 64) {
             throw rc3.d();
          }
          if ((th = this.h) == this.f) {
             throw rc3.g();
          }
          int i = th + 1;
          this.h = i;
          int b = this.e[th];
          i = b & 0x7f;
          long l2 = (long)i << l1;
          l = l | l2;
          if (!(b = b & 0x0080)) {
             break ;
          }else {
             l1 = l1 + 7;
          }
       }
       return l;
    }
    public final void J(int p0){
       if (p0 >= 0) {
          ph0 th = this.h;
          if (p0 <= (this.f - th)) {
             this.h = th + p0;
             return;
          }
       }
       if (p0 < 0) {
          throw rc3.e();
       }else {
          throw rc3.g();
       }
    }
    public final void a(int p0){
       if (this.j == p0) {
          return;
       }
       throw new rc3("Protocol message end-group tag did not match expected tag.");
    }
    public final int d(){
       return (this.h - this.i);
    }
    public final boolean e(){
       boolean b = (this.h == this.f)? true: false;
       return b;
    }
    public final void i(int p0){
       int i1;
       this.k = p0;
       int i = this.f + this.g;
       this.f = i;
       if ((i1 = i - this.i) > p0) {
          i1 = i1 - p0;
          this.g = i1;
          this.f = i - i1;
       }else {
          this.g = 0;
       }
       return;
    }
    public final int j(int p0){
       int i;
       int i2;
       if (p0 < 0) {
          throw rc3.e();
       }
       ph0 ti = this.i;
       if ((i = (this.h - ti) + p0) < 0) {
          throw rc3.f();
       }
       ph0 tk = this.k;
       if (i > tk) {
          throw rc3.g();
       }
       this.k = i;
       int i1 = this.f + this.g;
       this.f = i1;
       if ((i2 = i1 - ti) > i) {
          i2 = i2 - i;
          this.g = i2;
          this.f = i1 - i2;
       }else {
          this.g = 0;
       }
       return tk;
    }
    public final boolean k(){
       boolean b = (this.H())? true: false;
       return b;
    }
    public final h80 l(){
       ph0 th;
       byte[] uobyteArray;
       int i = this.G();
       ph0 te = this.e;
       if (i > 0) {
          th = this.h;
          if (i <= (this.f - th)) {
             this.h = this.h + i;
             return i80.c(te, th, i);
          }
       }
       if (!i) {
          return i80.b;
       }else if(i > 0){
          th = this.h;
          if (i <= (this.f - th)) {
             i = i + th;
             this.h = i;
             uobyteArray = Arrays.copyOfRange(te, th, i);
          label_0035 :
             return new h80(uobyteArray);
          }
       }
       if (i <= 0) {
          if (!i) {
             uobyteArray = cc3.b;
             goto label_0035 ;
          }else {
             throw rc3.e();
          }
       }else {
          throw rc3.g();
       }
    }
    public final double m(){
       return Double.longBitsToDouble(this.F());
    }
    public final int n(){
       return this.G();
    }
    public final int o(){
       return this.E();
    }
    public final long p(){
       return this.F();
    }
    public final float q(){
       return Float.intBitsToFloat(this.E());
    }
    public final int r(){
       return this.G();
    }
    public final long s(){
       return this.H();
    }
    public final int u(){
       return this.E();
    }
    public final long v(){
       return this.F();
    }
    public final int w(){
       return sh0.b(this.G());
    }
    public final long x(){
       return sh0.c(this.H());
    }
    public final String y(){
       int i;
       if ((i = this.G()) > 0) {
          ph0 th = this.h;
          if (i <= (this.f - th)) {
             this.h = this.h + i;
             return new String(this.e, th, i, cc3.a);
          }
       }
       if (!i) {
          return "";
       }else if(i < 0){
          throw rc3.e();
       }else {
          throw rc3.g();
       }
    }
    public final String z(){
       int i;
       if ((i = this.G()) > 0) {
          ph0 th = this.h;
          if (i <= (this.f - th)) {
             this.h = this.h + i;
             return se7.a.n0(this.e, th, i);
          }
       }
       if (!i) {
          return "";
       }else if(i <= 0){
          throw rc3.e();
       }else {
          throw rc3.g();
       }
    }
}
