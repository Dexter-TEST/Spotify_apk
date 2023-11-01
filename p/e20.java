package p.e20;
import java.lang.Runnable;
import java.lang.Object;
import p.cf7;
import java.util.concurrent.atomic.AtomicInteger;
import p.c20;
import p.wd5;
import p.lc1;
import p.iw3;
import p.xr6;
import p.a5;
import p.mv5;
import p.cv5;
import java.util.List;
import android.graphics.Bitmap;
import p.p77;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;
import java.util.Iterator;
import p.em0;
import android.os.Handler;
import p.d20;
import p.iz7;
import p.nn6;
import p.hp5;
import p.xe7;
import p.lf7;
import p.j80;
import android.graphics.BitmapFactory$Options;
import p.y70;
import p.s14;
import java.io.InputStream;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import java.io.IOException;
import android.graphics.Matrix;
import java.lang.Math;
import android.net.Uri;
import java.lang.Integer;
import java.lang.ThreadLocal;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Future;
import android.util.LruCache;
import p.hw3;
import p.ud5;
import p.dm5;
import java.lang.Class;
import android.os.Message;
import java.lang.IllegalStateException;
import java.io.StringWriter;
import p.yr6;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.RuntimeException;
import java.lang.Throwable;
import p.hi4;

public final class e20 implements Runnable	// class@001401 from classes.dex
{
    public final mv5 A;
    public a5 B;
    public ArrayList C;
    public Bitmap D;
    public Future E;
    public ud5 F;
    public Exception G;
    public int H;
    public int I;
    public int J;
    public final int a;
    public final wd5 b;
    public final lc1 c;
    public final iw3 t;
    public final xr6 v;
    public final String w;
    public final cv5 x;
    public final int y;
    public int z;
    public static final Object K;
    public static final cf7 L;
    public static final AtomicInteger M;
    public static final c20 N;

    static {
       e20.K = new Object();
       e20.L = new cf7(8);
       e20.M = new AtomicInteger();
       e20.N = new c20();
    }
    public void e20(wd5 p0,lc1 p1,iw3 p2,xr6 p3,a5 p4,mv5 p5){
       super();
       this.a = e20.M.incrementAndGet();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.B = p4;
       this.w = p4.i;
       a5 b = p4.b;
       this.x = b;
       this.J = b.s;
       this.y = p4.e;
       this.z = p4.f;
       this.A = p5;
       this.I = p5.d();
    }
    public static Bitmap a(List p0,Bitmap p1){
       int i3;
       Bitmap uBitmap;
       int i = p0.size();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i2 >= i) {
             return p1;
          }
          p77 op77 = p0.get(i2);
          try{
             i3 = 0;
             if ((uBitmap = op77.b(p1)) == null) {
                StringBuilder str = en6.r("Transformation ")+op77.a()+" returned null after "+i2+" previous transformation\(s\).\n\nTransformation list:\n";
                Iterator iterator = p0.iterator();
                while (iterator.hasNext()) {
                   str = str.append(iterator.next().a()).append(10);
                }
                wd5.m.post(new em0(28, str));
                return i3;
             }else if(uBitmap == p1 && p1.isRecycled()){
                wd5.m.post(new d20(op77, i1));
                return i3;
             }else if(uBitmap != p1 && !p1.isRecycled()){
                wd5.m.post(new d20(op77, 1));
                return i3;
             }else {
                i2 = i2 + 1;
                p1 = uBitmap;
             }
          }catch(java.lang.RuntimeException e7){
             wd5.m.post(new iz7(op77, 16, e7));
             return i3;
          }
       }
    }
    public static Bitmap c(nn6 p0,cv5 p1){
       BitmapFactory$Options options;
       Bitmap uBitmap;
       hp5 ohp5 = xe7.f(p0);
       int i = (ohp5.l(0, lf7.b) && ohp5.l(8, lf7.c))? 1: 0;
       int i1 = ((options = mv5.c(p1)) != null && options.inJustDecodeBounds != null)? 1: 0;
       cv5 h = p1.h;
       cv5 g = p1.g;
       if (!i) {
          y70 oy70 = ohp5.e0();
          if (i1) {
             s14 os14 = new s14(oy70);
             os14.w = false;
             long l = os14.b + (long)1024;
             if ((os14.t - l) < 0) {
                os14.f(l);
             }
             BitmapFactory.decodeStream(os14, null, options);
             mv5.a(g, h, options.outWidth, options.outHeight, options, p1);
             os14.b(os14.b);
             os14.w = true;
             oy70 = os14;
          }
          if ((uBitmap = BitmapFactory.decodeStream(oy70, null, options)) != null) {
             return uBitmap;
          }else {
             throw new IOException("Failed to decode stream.");
          }
       }else {
          byte[] uobyteArray = ohp5.D();
          if (i1) {
             BitmapFactory.decodeByteArray(uobyteArray, false, uobyteArray.length, options);
             mv5.a(g, h, options.outWidth, options.outHeight, options, p1);
          }
          return BitmapFactory.decodeByteArray(uobyteArray, false, uobyteArray.length, options);
       }
    }
    public static e20 e(wd5 p0,lc1 p1,iw3 p2,xr6 p3,a5 p4){
       mv5 omv5;
       e20 v7;
       a5 b = p4.b;
       wd5 b1 = p0.b;
       int i = b1.size();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             omv5 = b1.get(i1);
             if (omv5.b(b)) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             v7 = new e20(p0, p1, p2, p3, p4, e20.N);
             return v7;
          }
       }
       v7 = new e20(p0, p1, p2, p3, p4, omv5);
       return v7;
    }
    public static Bitmap g(cv5 p0,Bitmap p1,int p2){
       cv5 n;
       cv5 o;
       double d2;
       cv5 uocv51;
       double d4;
       int i1;
       double d5;
       double d6;
       int i2;
       double d7;
       double d8;
       int i4;
       cv5 uocv52;
       int i5;
       float f;
       float f1;
       float f2;
       float f3;
       int i6;
       int i7;
       int i8;
       int i9;
       float f4;
       float f5;
       cv5 uocv5 = p0;
       int i = p2;
       int width = p1.getWidth();
       int height = p1.getHeight();
       cv5 l = uocv5.l;
       Matrix matrix = new Matrix();
       if (!p0.c() && !i) {
          i5 = width;
          i4 = height;
       }else {
          cv5 h = uocv5.h;
          cv5 g = uocv5.g;
          cv5 m = uocv5.m;
          if (0 - m) {
             double d = (double)m;
             double d1 = Math.cos(Math.toRadians(d));
             d = Math.sin(Math.toRadians(d));
             if (uocv5.p != null) {
                n = uocv5.n;
                o = uocv5.o;
                matrix.setRotate(m, n, o);
                d2 = (double)n;
                double d3 = 0x3ff0000000000000 - d1;
                uocv51 = l;
                d4 = (double)o;
                i1 = height;
                d5 = (d4 * d) + (d2 * d3);
                d4 = (d4 * d3) - (d2 * d);
                d2 = (double)g;
                d6 = (d2 * d1) + d5;
                d2 = (d2 * d) + d4;
                i2 = width;
                d7 = (double)h;
                d = d * d7;
                d8 = d4;
                d4 = d6 - d;
                d7 = d7 * d1;
                d1 = d7 + d2;
                d = d5 - d;
                d7 = Math.max(d, Math.max(d4, Math.max(d5, d6)));
                d5 = Math.min(d, Math.min(d4, Math.min(d5, d6)));
                d4 = d8;
                d = d7 + d8;
                h = (int)Math.floor((Math.max(d, Math.max(d1, Math.max(d4, d2))) - Math.min(d, Math.min(d1, Math.min(d4, d2)))));
                g = (int)Math.floor((d7 - d5));
             }else {
                i2 = width;
                i1 = height;
                uocv51 = l;
                matrix.setRotate(m);
                d7 = (double)g;
                d5 = d7 * d1;
                d7 = d7 * d;
                d4 = (double)h;
                d = d * d4;
                d2 = d5 - d;
                d4 = d4 * d1;
                d6 = d4 + d7;
                d = - d;
                d8 = d4;
                d4 = Math.max(d, Math.max(d2, Math.max(0, d5)));
                d5 = Math.min(d, Math.min(d2, Math.min(0, d5)));
                d = d8;
                i9 = (int)Math.floor((d4 - d5));
                i8 = (int)Math.floor((Math.max(d, Math.max(d6, Math.max(0, d7))) - Math.min(d, Math.min(d6, Math.min(0, d7)))));
             }
          }else {
             i2 = width;
             i1 = height;
             uocv51 = l;
             o = h;
          }
          int i3 = 2;
          i = 1;
          width = 5;
          if (height = p2) {
             d4 = 90;
             n = 270;
             switch (height){
                 case 3:
                 case 4:
                   i4 = 180;
                   break;
                 case 5:
                 case 6:
                   i4 = 90;
                   break;
                 case 7:
                 case 8:
                   i4 = 270;
                   break;
                 default:
                   i4 = 0;
             }
             height = (height != i3 && (height != 7 && (height != 4 && height != width)))? 1: -1;
             if (i4) {
                matrix.preRotate((float)i4);
                if (i4 == d4 || i4 == n) {
                label_0155 :
                   if (height != i) {
                      matrix.postScale((float)height, 0x3f800000);
                   }
                   uocv52 = p0;
                   g = h;
                   h = g;
                }
             }
             g = h;
             h = g;
             goto label_0155 ;
          }else {
             uocv52 = p0;
          }
          if (uocv52.i != null) {
             if (g != null) {
                i5 = i2;
                f = (float)g / (float)i5;
                i4 = i1;
             }else {
                i5 = i2;
                i4 = i1;
                f = (float)h / (float)i4;
             }
             if (h != null) {
                f1 = (float)h;
                f2 = (float)i4;
             }else {
                f1 = (float)g;
                f2 = (float)i5;
             }
             f1 = f1 / f2;
             uocv52 = uocv52.j;
             if ((f1 - f) > 0) {
                width = (int)Math.ceil((double)((f1 / f) * (float)i4));
                if (((uocv52 & 0x30)) == 48) {
                   uocv52 = 0;
                }else {
                   i7 = 80;
                   height = (((uocv52 & i7)) == i7)? i4 - width: (i4 - width) / i3;
                }
                f1 = (float)h / (float)width;
             }else if((f - f1) < 0){
                i6 = (int)Math.ceil((double)((f / f1) * (float)i5));
                if (((uocv52 & 0x03)) == 3) {
                   d5 = 0;
                }else if(((uocv52 & width)) == width){
                   width = i5 - i6;
                }else {
                   width = (i5 - i6) / i3;
                }
                f3 = (float)g / (float)i6;
                height = d5;
                i2 = i6;
                width = i4;
                i6 = 0;
             label_01db :
                i4 = (uocv51 != null && (g == null && (i5 > g && (h == null && i4 > h))))? 0: 1;
                if (i4) {
                   matrix.preScale(f3, f1);
                }
                i7 = width;
                i4 = uocv52;
                i8 = i6;
                i9 = i2;
             label_0252 :
                Bitmap uBitmap = Bitmap.createBitmap(p1, i4, i8, i9, i7, matrix, true);
                i = p1;
                if (uBitmap != i) {
                   p1.recycle();
                }else {
                   uBitmap = i;
                }
                return uBitmap;
             }else {
                width = i4;
                f = f1;
                uocv52 = 0;
             }
             f3 = f;
             i2 = i5;
             i6 = uocv52;
             uocv52 = 0;
             goto label_01db ;
          }else {
             i5 = i2;
             i4 = i1;
             if (uocv52.k != null) {
                if (g != null) {
                   f3 = (float)g;
                   f4 = (float)i5;
                }else {
                   f3 = (float)h;
                   f4 = (float)i4;
                }
                f3 = f3 / f4;
                if (h != null) {
                   f4 = (float)h;
                   f5 = (float)i4;
                }else {
                   f4 = (float)g;
                   f5 = (float)i5;
                }
                f4 = f4 / f5;
                if ((f3 - f4) >= 0) {
                   f3 = f4;
                }
                if (uocv51 != null && (g == null && (i5 > g && (h == null && i4 > h)))) {
                   i = 0;
                }
                if (i) {
                   matrix.preScale(f3, f3);
                }
             }else if(g == null && (h == null || (g == i5 && h == i4))){
                if (g != null) {
                   f3 = (float)g;
                   f4 = (float)i5;
                }else {
                   f3 = (float)h;
                   f4 = (float)i4;
                }
                f3 = f3 / f4;
                if (h != null) {
                   f4 = (float)h;
                   f5 = (float)i4;
                }else {
                   f4 = (float)g;
                   f5 = (float)i5;
                }
                f4 = f4 / f5;
                if (uocv51 != null && (g == null && (i5 > g && (h == null && i4 > h)))) {
                   i = 0;
                }
                if (i) {
                   matrix.preScale(f3, f4);
                }
             }
          }
       }
       i9 = i5;
       i7 = i4;
       i4 = 0;
       i8 = 0;
       goto label_0252 ;
    }
    public static void h(cv5 p0){
       cv5 c;
       String str = ((c = p0.c) != null)? String.valueOf(c.getPath()): Integer.toHexString(p0.d);
       StringBuilder str1 = e20.L.get();
       str1.ensureCapacity((str.length() + 8));
       str1.replace(8, str1.length(), str);
       Thread.currentThread().setName(str1);
       return;
    }
    public final boolean b(){
       e20 tC;
       boolean b = false;
       if (this.B == null && ((tC = this.C) == null && (!tC.isEmpty() || ((tC = this.E) == null || !tC.cancel(b))))) {
          b = true;
       }
       return b;
    }
    public final void d(a5 p0){
       int i2;
       e20 tC;
       e20 tB;
       int i = 1;
       int i1 = 0;
       if (this.B == p0) {
          this.B = null;
          i2 = 1;
       }else if((tC = this.C) != null){
          i2 = tC.remove(p0);
       }else {
          i2 = false;
       }
       if (i2 && p0.b.s == this.J) {
          tC = ((tC = this.C) != null && !tC.isEmpty())? 1: 0;
          int i3 = ((tB = this.B) == null && !tC)? 0: 1;
          if (i3) {
             if (tB != null) {
                i = tB.b.s;
             }
             if (tC) {
                i2 = this.C.size();
                while (i1 < i2) {
                   cv5 s = this.C.get(i1).b.s;
                   if (en6.A(s) > en6.A(i)) {
                      i = s;
                   }
                   i1 = i1 + 1;
                }
             }
          }
          this.J = i;
       }
       if (this.b.l != null) {
          lf7.f("Hunter", "removed", p0.b.b(), lf7.d(this, "from "));
       }
       return;
    }
    public final Bitmap f(){
       hw3 ohw3;
       dm5 uodm5;
       int allocationBy;
       cv5 f;
       int i = 1;
       int i1 = 0;
       int i2 = (!((this.y & i)))? 1: 0;
       Bitmap uBitmap = null;
       if (i2) {
          if ((ohw3 = this.t.a.get(this.w)) != null) {
             uBitmap = ohw3.a;
          }
          if (uBitmap != null) {
             this.v.b.sendEmptyMessage(i1);
             this.F = ud5.b;
             if (this.b.l != null) {
                lf7.f("Hunter", "decoded", this.x.b(), "from cache");
             }
             return uBitmap;
          }
       }
       i2 = (this.I == null)? 4: this.z;
       this.z = i2;
       if ((uodm5 = this.A.e(this.x, i2)) != null) {
          this.F = uodm5.c;
          this.H = uodm5.b;
          if ((uBitmap = uodm5.d) == null) {
             uodm5 = uodm5.e;
             uBitmap = e20.c(uodm5, this.x);
             try{
                uodm5.close();
             }catch(java.io.IOException e0){
             }
          }
       }
       if (uBitmap != null) {
          if (this.b.l != null) {
             lf7.e("Hunter", "decoded", this.x.b());
          }
          e20 tv = this.v;
          tv.getClass();
          if ((allocationBy = uBitmap.getAllocationByteCount()) >= 0) {
             xr6 b = tv.b;
             b.sendMessage(b.obtainMessage(2, allocationBy, i1));
             tv = this.x;
             if (!tv.c()) {
                b = (tv.f != null)? 1: 0;
                if (!b) {
                   Object k = 0;
                label_00bb :
                   if (b || this.H != null) {
                      k = e20.K;
                      _monitor_enter(k);
                      if (this.x.c() || this.H != null) {
                         uBitmap = e20.g(this.x, uBitmap, this.H);
                         if (this.b.l != null) {
                            lf7.e("Hunter", "transformed", this.x.b());
                         }
                      }
                      if ((f = this.x.f) == null) {
                         i = 0;
                      }
                      if (i) {
                         Bitmap uBitmap1 = e20.a(f, uBitmap);
                         if (this.b.l != null) {
                            lf7.f("Hunter", "transformed", this.x.b(), "from custom transformations");
                         }
                         uBitmap = uBitmap1;
                      }
                      _monitor_exit(k);
                      if (uBitmap != null) {
                         tv = this.v;
                         tv.getClass();
                         if ((i = uBitmap.getAllocationByteCount()) >= 0) {
                            b = tv.b;
                            b.sendMessage(b.obtainMessage(3, i, i1));
                         }else {
                            throw new IllegalStateException("Negative size: "+uBitmap);
                         }
                      }
                   }
                }
             }
             b = 1;
             goto label_00bb ;
          }else {
             throw new IllegalStateException("Negative size: "+uBitmap);
          }
       }
       return uBitmap;
    }
    public final void run(){
       lc1 h;
       int i = 6;
       try{
          e20.h(this.x);
          if (this.b.l != null) {
             lf7.e("Hunter", "executing", lf7.c(this));
          label_0019 :
             Bitmap uBitmap = this.f();
             this.D = uBitmap;
             if (uBitmap == null) {
                h = this.c.h;
                h.sendMessage(h.obtainMessage(i, this));
             }else {
                this.c.b(this);
             }
          }else {
             goto label_0019 ;
          }
       }catch(p.hi4 e2){
          int i1 = ((e2.b & 0x04))? 1: 0;
          if (!i1 || e2.a != 504) {
             this.G = e2;
          }
          h = this.c.h;
          h.sendMessage(h.obtainMessage(i, this));
       }catch(java.io.IOException e1){
          this.G = e1;
          lc1 h1 = this.c.h;
          h1.sendMessageDelayed(h1.obtainMessage(5, this), 500);
       }catch(java.lang.OutOfMemoryError e2){
          StringWriter stringWriter = new StringWriter();
          this.v.a().a(new PrintWriter(stringWriter));
          this.G = new RuntimeException(stringWriter.toString(), e2);
          h = this.c.h;
          h.sendMessage(h.obtainMessage(i, this));
       }catch(java.lang.Exception e2){
          this.G = e2;
          h = this.c.h;
          h.sendMessage(h.obtainMessage(i, this));
       }
       Thread.currentThread().setName("Picasso-Idle");
       return;
    }
}
