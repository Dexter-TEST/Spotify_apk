package p.rh0;
import p.sh0;
import java.nio.ByteBuffer;
import p.gd7;
import java.lang.Object;
import p.fd7;
import java.nio.Buffer;
import p.rc3;
import p.qc3;
import java.lang.String;
import p.h80;
import p.i80;
import java.lang.Double;
import java.lang.Float;
import p.cc3;
import java.nio.charset.Charset;
import p.se7;
import java.lang.Class;
import p.qe7;
import p.xe7;

public final class rh0 extends sh0	// class@0024e6 from classes.dex
{
    public final ByteBuffer e;
    public final long f;
    public long g;
    public long h;
    public final long i;
    public int j;
    public int k;
    public int l;

    public void rh0(ByteBuffer p0,boolean p1){
       super();
       this.l = Integer.MAX_VALUE;
       this.e = p0;
       long l = gd7.c.j(gd7.g, p0);
       this.f = l;
       this.g = (long)p0.limit() + l;
       l = l + (long)p0.position();
       this.h = l;
       this.i = l;
    }
    public final int A(){
       if (this.e()) {
          this.k = 0;
          return 0;
       }else {
          int i = this.G();
          this.k = i;
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
       rh0 th;
       long l;
       int i = p0 & 0x07;
       boolean b = false;
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 4) {
                      if (i == 5) {
                         this.K(4);
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
                this.K(this.G());
                return true;
             }
          }else {
             this.K(8);
             return true;
          }
       }else if((int)(this.g - this.h) >= 10){
          while (true) {
             if (b >= 10) {
                throw rc3.d();
             }
             th = this.h;
             l = th + 1;
             this.h = l;
             if (gd7.h(th) < 0) {
                b = b + 1;
             }
          }
       }else {
          while (true) {
             if (b >= 10) {
                throw rc3.d();
             }
             th = this.h;
             if (th - this.g) {
                l = th + 1;
                this.h = l;
                if (gd7.h(th) < 0) {
                   b = b + 1;
                }
             }else {
                throw rc3.g();
             }
          }
       }
       return true;
    }
    public final int E(){
       rh0 th = this.h;
       long l = 4;
       if (((this.g - th) - l) < 0) {
          throw rc3.g();
       }
       this.h = l + th;
       return (((gd7.h((th + 3)) & 0x00ff) << 24) | (((gd7.h(th) & 0x00ff) | ((gd7.h((1 + th)) & 0x00ff) << 8)) | ((gd7.h((2 + th)) & 0x00ff) << 16)));
    }
    public final long F(){
       rh0 th = this.h;
       long l = 8;
       if (((this.g - th) - l) < 0) {
          throw rc3.g();
       }
       this.h = l + th;
       return ((((long)gd7.h((th + 7)) & 255) << 56) | ((((((((long)gd7.h(th) & 255) | (((long)gd7.h((1 + th)) & 255) << 8)) | (((long)gd7.h((2 + th)) & 255) << 16)) | (((long)gd7.h((3 + th)) & 255) << 24)) | (((long)gd7.h((4 + th)) & 255) << 32)) | (((long)gd7.h((5 + th)) & 255) << 40)) | (((long)gd7.h((6 + th)) & 255) << 48)));
    }
    public final int G(){
       int b;
       rh0 th = this.h;
       if (!(this.g - th)) {
       }else {
          long l = th + 1;
          if ((b = gd7.h(th)) >= 0) {
             this.h = l;
             return b;
          }else if(((this.g - l) - 9) < 0){
             long l1 = l + 1;
             if ((b = b ^ (gd7.h(l) << 7)) < 0) {
                b = b ^ 0x80;
             }else {
                l = l1 + 1;
                if ((b = b ^ (gd7.h(l1) << 14)) >= 0) {
                   b = b ^ 0x3f80;
                }else {
                   l1 = l + 1;
                   if ((b = b ^ (gd7.h(l) << 21)) < 0) {
                      b = b ^ -2080896;
                   }else {
                      l = l1 + 1;
                      byte b1 = gd7.h(l1);
                      b = (b ^ (b1 << 28)) ^ 0xfe03f80;
                      if (b1 < 0) {
                         l1 = l + 1;
                         if (gd7.h(l) < 0) {
                            l = l1 + 1;
                            if (gd7.h(l1) < 0) {
                               l1 = l + 1;
                               if (gd7.h(l) < 0) {
                                  l = l1 + 1;
                                  if (gd7.h(l1) < 0) {
                                     l1 = l + 1;
                                     if (gd7.h(l) >= 0) {
                                     label_008b :
                                        this.h = l1;
                                        return b;
                                     }
                                  }
                               }else {
                                  goto label_008b ;
                               }
                            }
                         }else {
                            goto label_008b ;
                         }
                      }
                   }
                }
                l1 = l;
                goto label_008b ;
             }
          }
       }
       return (int)this.I();
    }
    public final long H(){
       int b;
       long l3;
       rh0 th = this.h;
       if (!(this.g - th)) {
       }else {
          long l = 1;
          long l1 = th + l;
          if ((b = gd7.h(th)) >= 0) {
             this.h = l1;
             return (long)b;
          }else if(((this.g - l1) - 9) < 0){
             long l2 = l1 + l;
             if ((b = b ^ (gd7.h(l1) << 7)) < 0) {
                b = b ^ 0x80;
             label_0030 :
                l3 = (long)b;
             }else {
                l1 = l2 + l;
                if ((b = b ^ (gd7.h(l2) << 14)) >= 0) {
                   l3 = (long)(b ^ 0x3f80);
                }else {
                   l2 = l1 + l;
                   if ((b = b ^ (gd7.h(l1) << 21)) < 0) {
                      b = b ^ -2080896;
                      goto label_0030 ;
                   }else {
                      l1 = l2 + l;
                      l3 = (long)b ^ ((long)gd7.h(l2) << 28);
                      l2 = 0;
                      if ((l3 - l2) >= 0) {
                         l = 0xfe03f80;
                      }else {
                         long l4 = l1 + l;
                         l3 = l3 ^ ((long)gd7.h(l1) << 35);
                         if ((l3 - l2) < 0) {
                            l = 0xfffffff80fe03f80;
                         }else {
                            l1 = l4 + l;
                            l3 = l3 ^ ((long)gd7.h(l4) << 42);
                            if ((l3 - l2) >= 0) {
                               l = 0x3f80fe03f80;
                            }else {
                               l4 = l1 + l;
                               l3 = l3 ^ ((long)gd7.h(l1) << 49);
                               if ((l3 - l2) < 0) {
                                  l = 0xfffe03f80fe03f80;
                               }else {
                                  l1 = l4 + l;
                                  l3 = (l3 ^ ((long)gd7.h(l4) << 56)) ^ 0xfe03f80fe03f80;
                                  if ((l3 - l2) < 0) {
                                     l = l + l1;
                                     if (((long)gd7.h(l1) - l2) >= 0) {
                                        l2 = l;
                                     }
                                  }
                               }
                            }
                         }
                         l3 = l3 ^ l;
                         l2 = l4;
                      }
                      l3 = l3 ^ l;
                   }
                }
                l2 = l1;
             }
             this.h = l2;
             return l3;
          }
       }
       return this.I();
    }
    public final long I(){
       long l = 0;
       long l1 = 0;
       while (true) {
          if (l1 >= 64) {
             throw rc3.d();
          }
          rh0 th = this.h;
          if (!(th - this.g)) {
             throw rc3.g();
          }
          long l2 = 1 + th;
          this.h = l2;
          int b = gd7.h(th);
          int i = b & 0x7f;
          long l3 = (long)i << l1;
          l = l | l3;
          if (!(b = b & 0x0080)) {
             break ;
          }else {
             l1 = l1 + 7;
          }
       }
       return l;
    }
    public final void J(){
       long l = this.g + (long)this.j;
       this.g = l;
       int i = (int)(l - this.i);
       rh0 tl = this.l;
       if (i > tl) {
          i = i - tl;
          this.j = i;
          this.g = l - (long)i;
       }else {
          this.j = 0;
       }
       return;
    }
    public final void K(int p0){
       if (p0 >= 0) {
          rh0 th = this.h;
          if (p0 <= (int)(this.g - th)) {
             this.h = th + (long)p0;
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
       if (this.k == p0) {
          return;
       }
       throw new rc3("Protocol message end-group tag did not match expected tag.");
    }
    public final int d(){
       return (int)(this.h - this.i);
    }
    public final boolean e(){
       boolean b = (!(this.h - this.g))? true: false;
       return b;
    }
    public final void i(int p0){
       this.l = p0;
       this.J();
    }
    public final int j(int p0){
       if (p0 < 0) {
          throw rc3.e();
       }
       int i = this.d() + p0;
       rh0 tl = this.l;
       if (i > tl) {
          throw rc3.g();
       }
       this.l = i;
       this.J();
       return tl;
    }
    public final boolean k(){
       boolean b = (this.H())? true: false;
       return b;
    }
    public final h80 l(){
       int i;
       if ((i = this.G()) > 0) {
          rh0 th = this.h;
          if (i <= (int)(this.g - th)) {
             byte[] uobyteArray = new byte[i];
             long l = (long)i;
             gd7.c.c(th, uobyteArray, l);
             this.h = this.h + l;
             return new h80(uobyteArray);
          }
       }
       if (!i) {
          return i80.b;
       }else if(i < 0){
          throw rc3.e();
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
          rh0 th = this.h;
          if (i <= (int)(this.g - th)) {
             byte[] uobyteArray = new byte[i];
             long l = (long)i;
             gd7.c.c(th, uobyteArray, l);
             String str = new String(uobyteArray, cc3.a);
             this.h = this.h + l;
             return str;
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
       String str;
       if ((i = this.G()) > 0) {
          rh0 th = this.h;
          if (i <= (int)(this.g - th)) {
             int i1 = (int)(th - this.f);
             qe7 a = se7.a;
             a.getClass();
             th = this.e;
             if (th.hasArray()) {
                str = a.n0(th.array(), (th.arrayOffset() + i1), i);
             }else if(th.isDirect()){
                str = a.o0(th, i1, i);
             }else {
                str = xe7.p(th, i1, i);
             }
             this.h = this.h + (long)i;
             return str;
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
