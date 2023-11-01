package p.qh0;
import p.sh0;
import java.io.InputStream;
import p.cc3;
import java.lang.NullPointerException;
import java.lang.String;
import p.rc3;
import p.qc3;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.System;
import java.util.Iterator;
import java.lang.Math;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Class;
import p.tp2;
import p.h80;
import p.i80;
import java.lang.Double;
import java.lang.Float;
import java.nio.charset.Charset;
import p.se7;
import p.qe7;

public final class qh0 extends sh0	// class@00239d from classes.dex
{
    public final InputStream e;
    public final byte[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public void qh0(InputStream p0){
       super();
       this.l = Integer.MAX_VALUE;
       if (p0 == null) {
          throw new NullPointerException("input");
       }
       this.e = p0;
       byte[] uobyteArray = new byte[4096];
       this.f = uobyteArray;
       this.g = 0;
       this.i = 0;
       this.k = 0;
       return;
    }
    public final int A(){
       if (this.e()) {
          this.j = 0;
          return 0;
       }else {
          int i = this.J();
          this.j = i;
          if ((i >> 3)) {
             return i;
          }
          throw rc3.a();
       }
    }
    public final int B(){
       return this.J();
    }
    public final long C(){
       return this.K();
    }
    public final boolean D(int p0){
       qh0 ti;
       int i1;
       int i = p0 & 0x07;
       boolean b = false;
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 4) {
                      if (i == 5) {
                         this.O(4);
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
                this.O(this.J());
                return true;
             }
          }else {
             this.O(8);
             return true;
          }
       }else {
          qh0 tf = this.f;
          if (((this.g - this.i)) >= 10) {
             while (true) {
                if (b >= 10) {
                   throw rc3.d();
                }
                ti = this.i;
                i1 = ti + 1;
                this.i = i1;
                if (tf[ti] < 0) {
                   b = b + 1;
                }
             }
          }else {
             while (true) {
                if (b >= 10) {
                   throw rc3.d();
                }
                if (this.i == this.g) {
                   this.N(true);
                }
                ti = this.i;
                i1 = ti + 1;
                this.i = i1;
                if (tf[ti] < 0) {
                   b = b + 1;
                }
             }
          }
          return true;
       }
    }
    public final byte[] E(int p0){
       byte[] uobyteArray;
       if ((uobyteArray = this.F(p0)) != null) {
          return uobyteArray;
       }
       qh0 ti = this.i;
       qh0 tg = this.g;
       int i = tg - ti;
       this.k = this.k + tg;
       this.i = 0;
       this.g = 0;
       byte[] uobyteArray1 = new byte[p0];
       System.arraycopy(this.f, ti, uobyteArray1, 0, i);
       Iterator iterator = this.G((p0 - i)).iterator();
       while (iterator.hasNext()) {
          byte[] uobyteArray2 = iterator.next();
          System.arraycopy(uobyteArray2, 0, uobyteArray1, i, uobyteArray2.length);
          i = i + uobyteArray2.length;
       }
       return uobyteArray1;
    }
    public final byte[] F(int p0){
       if (!p0) {
          return cc3.b;
       }
       if (p0 < 0) {
          throw rc3.e();
       }
       qh0 tk = this.k;
       qh0 ti = this.i;
       int i = (tk + ti) + p0;
       if (((i - this.c)) > 0) {
          throw new rc3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit\(\) to increase the size limit.");
       }
       qh0 tl = this.l;
       if (i <= tl) {
          try{
             int i1 = this.g - ti;
             int i2 = p0 - i1;
             qh0 te = this.e;
             if (i2 >= 4096 && i2 > te.available()) {
                return null;
             }
             byte[] uobyteArray = new byte[p0];
             System.arraycopy(this.f, this.i, uobyteArray, 0, i1);
             this.k = this.k + this.g;
             this.i = 0;
             this.g = 0;
             while (true) {
                if (i1 >= p0) {
                   return uobyteArray;
                }
                int i3 = p0 - i1;
                try{
                   if ((i3 = te.read(uobyteArray, i1, i3)) != -1) {
                      int i4 = this.k + i3;
                      this.k = i4;
                      i1 = i1 + i3;
                   }else {
                      break ;
                   }
                }catch(p.rc3 e8){
                   p0.a = true;
                   throw e8;
                }
             }
             throw rc3.g();
          }catch(p.rc3 e8){
             p0.a = true;
             throw e8;
          }
       }else {
          this.O(((tl - tk) - ti));
          throw rc3.g();
       }
    }
    public final ArrayList G(int p0){
       int i3;
       ArrayList uArrayList = new ArrayList();
       while (true) {
          if (p0 <= 0) {
             return uArrayList;
          }
          int i = Math.min(p0, 4096);
          byte[] uobyteArray = new byte[i];
          int i1 = 0;
          while (true) {
             if (i1 < i) {
                int i2 = i - i1;
                if ((i3 = this.e.read(uobyteArray, i1, i2)) != -1) {
                   i2 = this.k + i3;
                   this.k = i2;
                   i1 = i1 + i3;
                }else {
                   break ;
                }
             }else {
                p0 = p0 - i;
                uArrayList.add(uobyteArray);
             }
          }
          throw rc3.g();
       }
    }
    public final int H(){
       qh0 ti = this.i;
       int i = 4;
       if (((this.g - ti)) < i) {
          this.N(i);
          ti = this.i;
       }
       this.i = ti + 4;
       qh0 tf = this.f;
       return (((tf[(ti + 3)] & 0x00ff) << 24) | (((tf[ti] & 0x00ff) | ((tf[(ti + 1)] & 0x00ff) << 8)) | ((tf[(ti + 2)] & 0x00ff) << 16)));
    }
    public final long I(){
       qh0 ti = this.i;
       int i = 8;
       if (((this.g - ti)) < i) {
          this.N(i);
          ti = this.i;
       }
       this.i = ti + 8;
       qh0 tf = this.f;
       return ((((long)tf[(ti + 7)] & 255) << 56) | ((((((((long)tf[ti] & 255) | (((long)tf[(ti + 1)] & 255) << i)) | (((long)tf[(ti + 2)] & 255) << 16)) | (((long)tf[(ti + 3)] & 255) << 24)) | (((long)tf[(ti + 4)] & 255) << 32)) | (((long)tf[(ti + 5)] & 255) << 40)) | (((long)tf[(ti + 6)] & 255) << 48)));
    }
    public final int J(){
       qh0 tg;
       int b;
       qh0 ti = this.i;
       if ((tg = this.g) == ti) {
       }else {
          int i = ti + 1;
          qh0 tf = this.f;
          if ((b = tf[ti]) >= 0) {
             this.i = i;
             return b;
          }else if(((tg - i)) < 9){
             byte i1 = i + 1;
             if ((b = b ^ (tf[i] << 7)) < 0) {
                b = b ^ 0x80;
             }else {
                i = i1 + 1;
                if ((b = b ^ (tf[i1] << 14)) >= 0) {
                   b = b ^ 0x3f80;
                }else {
                   i1 = i + 1;
                   if ((b = b ^ (tf[i] << 21)) < 0) {
                      b = b ^ -2080896;
                   }else {
                      i = i1 + 1;
                      i1 = tf[i1];
                      b = (b ^ (i1 << 28)) ^ 0xfe03f80;
                      if (i1 < 0) {
                         i1 = i + 1;
                         if (tf[i] < 0) {
                            i = i1 + 1;
                            if (tf[i1] < 0) {
                               i1 = i + 1;
                               if (tf[i] < 0) {
                                  i = i1 + 1;
                                  if (tf[i1] < 0) {
                                     i1 = i + 1;
                                     if (tf[i] >= 0) {
                                     label_0070 :
                                        this.i = i1;
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
       return (int)this.L();
    }
    public final long K(){
       qh0 tg;
       int b;
       long l;
       long l1;
       qh0 ti = this.i;
       if ((tg = this.g) == ti) {
       }else {
          int i = ti + 1;
          qh0 tf = this.f;
          if ((b = tf[ti]) >= 0) {
             this.i = i;
             return (long)b;
          }else if(((tg - i)) < 9){
             int i1 = i + 1;
             if ((b = b ^ (tf[i] << 7)) < 0) {
                b = b ^ 0x80;
             label_0026 :
                l = (long)b;
             }else {
                i = i1 + 1;
                if ((b = b ^ (tf[i1] << 14)) >= 0) {
                   l1 = (long)(b ^ 0x3f80);
                }else {
                   i1 = i + 1;
                   if ((b = b ^ (tf[i] << 21)) < 0) {
                      b = b ^ -2080896;
                      goto label_0026 ;
                   }else {
                      b = i1 + 1;
                      long l2 = ((long)tf[i1] << 28) ^ (long)b;
                      if ((l2) >= 0) {
                         l = l2 ^ 0xfe03f80;
                         i1 = b;
                      }else {
                         i1 = b + 1;
                         l1 = l2 ^ ((long)tf[b] << 35);
                         if ((l1) < 0) {
                            l1 = 0xfffffff80fe03f80;
                         }else {
                            i = i1 + 1;
                            l1 = l1 ^ ((long)tf[i1] << 42);
                            if ((l1) >= 0) {
                               l1 = l1 ^ 0x3f80fe03f80;
                            }else {
                               int i2 = i + 1;
                               l1 = l1 ^ ((long)tf[i] << 49);
                               if ((l1) < 0) {
                                  l1 = 0xfffe03f80fe03f80;
                               }else {
                                  i = i2 + 1;
                                  l1 = (l1 ^ ((long)tf[i2] << 56)) ^ 0xfe03f80fe03f80;
                                  if ((l1) < 0) {
                                     i2 = i + 1;
                                     if (((long)tf[i]) >= 0) {
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
             this.i = i1;
             return l;
          }
       }
       return this.L();
    }
    public final long L(){
       long l = 0;
       long l1 = 0;
       while (true) {
          if (l1 >= 64) {
             throw rc3.d();
          }
          if (this.i == this.g) {
             this.N(1);
          }
          qh0 ti = this.i;
          int i = ti + 1;
          this.i = i;
          int b = this.f[ti];
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
    public final void M(){
       int i = this.g + this.h;
       this.g = i;
       int i1 = this.k + i;
       qh0 tl = this.l;
       if (i1 > tl) {
          i1 = i1 - tl;
          this.h = i1;
          this.g = i - i1;
       }else {
          this.h = 0;
       }
       return;
    }
    public final void N(int p0){
       if (this.P(p0)) {
          return;
       }
       if (p0 > ((this.c - this.k) - this.i)) {
          throw new rc3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit\(\) to increase the size limit.");
       }
       throw rc3.g();
    }
    public final void O(int p0){
       qh0 tg = this.g;
       qh0 ti = this.i;
       if (p0 <= (tg - ti) && p0 >= 0) {
          this.i = ti + p0;
       }else {
          qh0 te = this.e;
          if (p0 >= 0) {
             qh0 tk = this.k;
             int i = tk + ti;
             qh0 tl = this.l;
             if (((i + p0)) <= tl) {
                this.k = i;
                int i1 = tg - ti;
                int i2 = 0;
                this.g = i2;
                this.i = i2;
                while (true) {
                   i2 = 1;
                   if (i1 < p0) {
                      int i3 = p0 - i1;
                      long l = (long)i3;
                      try{
                         long l1 = te.skip(l);
                         if ((v9 = l1) >= 0 && (l1 - l) <= 0) {
                            if (!v9) {
                            label_0071 :
                               this.k = this.k + i1;
                               this.M();
                               if (i1 < p0) {
                                  tg = this.g;
                                  int i4 = tg - this.i;
                                  this.i = tg;
                                  this.N(i2);
                                  while (true) {
                                     i1 = p0 - i4;
                                     tk = this.g;
                                     if (i1 > tk) {
                                        i4 = i4 + tk;
                                        this.i = tk;
                                        this.N(i2);
                                     }else {
                                        break ;
                                     }
                                  }
                                  this.i = i1;
                               }
                            }else {
                               i1 = i1 + (int)l1;
                            }
                         }else {
                            throw new IllegalStateException(te.getClass()+"#skip returned invalid result: "+l1+"\nThe InputStream implementation is buggy.");
                         }
                      }catch(p.rc3 e11){
                         p0.a = i2;
                         throw e11;
                      }
                   }else {
                      goto label_0071 ;
                   }
                }
             }else {
                this.O(((tl - tk) - ti));
                throw rc3.g();
             }
          }else {
             throw rc3.e();
          }
       }
       return;
    }
    public final boolean P(int p0){
       boolean i1;
       int i2;
       qh0 ti = this.i;
       qh0 tg = this.g;
       if (((ti + p0)) <= tg) {
          throw new IllegalStateException(tp2.l("refillBuffer\(\) called when ", p0, " bytes were already available in buffer"));
       }
       qh0 tk = this.k;
       sh0 tc = this.c;
       if (p0 > ((tc - tk) - ti)) {
          return false;
       }
       if ((((tk + ti) + p0)) > this.l) {
          return false;
       }
       tk = this.f;
       if (ti > null) {
          if (tg > ti) {
             System.arraycopy(tk, ti, tk, false, (tg - ti));
          }
          this.k = this.k + ti;
          this.g = this.g - ti;
          this.i = 0;
       }
       ti = this.g;
       int i = Math.min((tk.length - ti), ((tc - this.k) - ti));
       qh0 te = this.e;
       try{
          i1 = 1;
          if ((i2 = te.read(tk, ti, i)) && (i2 >= -1 && i2 <= tk.length)) {
             if (i2 > 0) {
                this.g = this.g + i2;
                this.M();
                if (this.g < p0) {
                   i1 = this.P(p0);
                }
                return i1;
             }else {
                return false;
             }
          }else {
             throw new IllegalStateException(te.getClass()+"#read\(byte[]\) returned invalid result: "+i2+"\nThe InputStream implementation is buggy.");
          }
       }catch(p.rc3 e7){
          p0.a = i1;
          throw e7;
       }
    }
    public final void a(int p0){
       if (this.j == p0) {
          return;
       }
       throw new rc3("Protocol message end-group tag did not match expected tag.");
    }
    public final int d(){
       return (this.k + this.i);
    }
    public final boolean e(){
       int i;
       if (this.i == this.g) {
          i = 1;
          if (!this.P(i)) {
          label_000f :
             return i;
          }
       }
       i = false;
       goto label_000f ;
    }
    public final void i(int p0){
       this.l = p0;
       this.M();
    }
    public final int j(int p0){
       if (p0 < 0) {
          throw rc3.e();
       }
       int i = (this.k + this.i) + p0;
       qh0 tl = this.l;
       if (i > tl) {
          throw rc3.g();
       }
       this.l = i;
       this.M();
       return tl;
    }
    public final boolean k(){
       boolean b = (this.K())? true: false;
       return b;
    }
    public final h80 l(){
       byte[] uobyteArray;
       h80 oh80;
       int i = this.J();
       qh0 ti = this.i;
       qh0 tf = this.f;
       if (i <= (this.g - ti) && i > 0) {
          this.i = this.i + i;
          return i80.c(tf, ti, i);
       }else if(!i){
          return i80.b;
       }else if((uobyteArray = this.F(i)) != null){
          oh80 = i80.c(uobyteArray, 0, uobyteArray.length);
       }else {
          qh0 ti1 = this.i;
          qh0 tg = this.g;
          int i1 = tg - ti1;
          this.k = this.k + tg;
          this.i = 0;
          this.g = 0;
          byte[] uobyteArray1 = new byte[i];
          System.arraycopy(tf, ti1, uobyteArray1, 0, i1);
          Iterator iterator = this.G((i - i1)).iterator();
          while (iterator.hasNext()) {
             byte[] uobyteArray2 = iterator.next();
             System.arraycopy(uobyteArray2, 0, uobyteArray1, i1, uobyteArray2.length);
             i1 = i1 + uobyteArray2.length;
          }
          oh80 = new h80(uobyteArray1);
       }
       return oh80;
    }
    public final double m(){
       return Double.longBitsToDouble(this.I());
    }
    public final int n(){
       return this.J();
    }
    public final int o(){
       return this.H();
    }
    public final long p(){
       return this.I();
    }
    public final float q(){
       return Float.intBitsToFloat(this.H());
    }
    public final int r(){
       return this.J();
    }
    public final long s(){
       return this.K();
    }
    public final int u(){
       return this.H();
    }
    public final long v(){
       return this.I();
    }
    public final int w(){
       return sh0.b(this.J());
    }
    public final long x(){
       return sh0.c(this.K());
    }
    public final String y(){
       int i = this.J();
       qh0 tf = this.f;
       if (i > 0) {
          qh0 ti = this.i;
          if (i <= (this.g - ti)) {
             this.i = this.i + i;
             return new String(tf, ti, i, cc3.a);
          }
       }
       if (!i) {
          return "";
       }else if(i <= this.g){
          this.N(i);
          this.i = this.i + i;
          return new String(tf, this.i, i, cc3.a);
       }else {
          return new String(this.E(i), cc3.a);
       }
    }
    public final String z(){
       int i = this.J();
       qh0 ti = this.i;
       qh0 tg = this.g;
       qh0 tf = this.f;
       if (i <= (tg - ti) && i > 0) {
          this.i = ti + i;
       }else if(!i){
          return "";
       }else {
          ti = 0;
          if (i <= tg) {
             this.N(i);
             this.i = i + 0;
          }else {
             tf = this.E(i);
          }
       }
       return se7.a.n0(tf, ti, i);
    }
}
