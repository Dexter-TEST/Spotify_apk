package p.c63;
import p.sy;
import p.bw3;
import p.ni3;
import p.zh3;
import android.graphics.Rect;
import p.sv3;
import java.lang.Object;
import java.util.Map;
import p.cw3;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.Matrix;
import p.mf7;
import android.graphics.Canvas;
import p.qy;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.Context;
import p.a63;
import android.app.Application;
import android.graphics.BitmapFactory$Options;
import java.lang.String;
import android.util.Base64;
import android.graphics.BitmapFactory;
import p.js3;
import java.lang.Class;
import p.bs3;
import java.util.HashSet;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.AssetManager;
import java.lang.StringBuilder;
import java.io.InputStream;
import p.tp2;
import java.lang.IllegalStateException;
import android.graphics.Color;
import p.lr7;
import java.lang.Integer;

public final class c63 extends sy	// class@0011a5 from classes.dex
{
    public final int A;
    public final zh3 B;
    public final Parcelable C;
    public final Object D;
    public final Object E;
    public final ni3 F;

    public void c63(bw3 p0,ni3 p1,int p2){
       this.A = p2;
       if (p2 != 1) {
          super(p0, p1);
          this.B = new zh3(3);
          this.C = new Rect();
          this.D = new Rect();
          cw3 uocw3 = ((p0 = p0.a) == null)? null: p0.d.get(p1.g);
          this.E = uocw3;
          return;
       }else {
          super(p0, p1);
          this.C = new RectF();
          zh3 ozh3 = new zh3();
          this.B = ozh3;
          float[] uofloatArray = new float[8];
          this.D = uofloatArray;
          this.E = new Path();
          this.F = p1;
          ozh3.setAlpha(0);
          ozh3.setStyle(Paint$Style.FILL);
          ozh3.setColor(p1.l);
          return;
       }
    }
    public final void a(RectF p0,Matrix p1,boolean p2){
       c63 tE;
       sy tn = this.n;
       switch (this.A){
           case 0:
             break;
           default:
             super.a(p0, p1, p2);
             tE = this.C;
             c63 tF = this.F;
             tE.set(0, 0, (float)tF.j, (float)tF.k);
             tn.mapRect(tE);
             p0.set(tE);
             return;
       }
       super.a(p0, p1, p2);
       if ((tE = this.E) != null) {
          float f = mf7.c();
          p0.set(0, 0, ((float)tE.a * f), ((float)tE.b * f));
          tn.mapRect(p0);
       }
       return;
    }
    public final void i(Canvas p0,Matrix p1,int p2){
       Bitmap uBitmap;
       Drawable$Callback callback;
       cw3 uocw3;
       cw3 d1;
       a63 a1;
       Bitmap uBitmap1;
       Bitmap d2;
       String str;
       HashSet a2;
       int i2;
       int i3;
       lr7 j;
       c63 uoc63 = this;
       Canvas uCanvas = p0;
       int i = p2;
       c63 d = uoc63.D;
       c63 b = uoc63.B;
       c63 e = uoc63.E;
       c63 f = uoc63.F;
       boolean b1 = true;
       switch (uoc63.A){
           case 0:
             sy o = uoc63.o;
             if (f == null || (uBitmap = f.e()) == null) {
                ni3 g = uoc63.p.g;
                bw3 w = o.w;
                a63 uoa63 = null;
                if (w != null) {
                   Context uContext = ((callback = o.getCallback()) == null || !callback instanceof View)? uoa63: callback.getContext();
                   a63 a = w.a;
                   if (a instanceof Application) {
                      uContext = uContext.getApplicationContext();
                   }
                   a = (uContext == a)? 1: 0;
                   if (!a) {
                      o.w = uoa63;
                   }
                }
                if (o.w == null) {
                   o.w = new a63(o.getCallback(), o.a.d);
                }
                if ((w = o.w) != null) {
                   a63 b2 = w.b;
                   if ((uocw3 = w.c.get(g)) != null) {
                      if ((d1 = uocw3.d) != null) {
                         uBitmap = d1;
                      label_017d :
                         if (uBitmap == null) {
                            if ((f = e) != null) {
                               uBitmap = f.d;
                            }else {
                               uBitmap = uoa63;
                            }
                         }
                      }else if((a1 = w.a) == null){
                         BitmapFactory$Options options = new BitmapFactory$Options();
                         options.inScaled = b1;
                         options.inDensity = 160;
                         cw3 c1 = uocw3.c;
                         if (c1.startsWith("data:") && c1.indexOf("base64,") > 0) {
                            int i1 = 44;
                            byte[] uobyteArray = Base64.decode(c1.substring((c1.indexOf(i1) + b1)), 0);
                            uBitmap1 = BitmapFactory.decodeByteArray(uobyteArray, 0, uobyteArray.length, options);
                            d2 = a63.d;
                            _monitor_enter(d2);
                            w.c.get(g).d = uBitmap1;
                            _monitor_exit(d2);
                            g = 0;
                         }else if(!TextUtils.isEmpty(b2)){
                            InputStream inputStream = a1.getAssets().open(b2+c1);
                            try{
                               a1 = 0;
                               if ((d2 = BitmapFactory.decodeStream(inputStream, a1, options)) == null) {
                                  js3.a("Decoded image `"+g+"` is null.");
                               }else {
                                  cw3 a3 = uocw3.a;
                                  uocw3 = uocw3.b;
                                  if (d2.getWidth() == a3 && d2.getHeight() == uocw3) {
                                     uBitmap1 = d2;
                                  }else {
                                     uBitmap1 = Bitmap.createScaledBitmap(d2, a3, uocw3, b1);
                                     d2.recycle();
                                  }
                                  w.a(g, uBitmap1);
                                  i2 = a1;
                               }
                            }catch(java.lang.IllegalArgumentException e0){
                               str = tp2.m("Unable to decode image `", g, "`.");
                               js3.a.getClass();
                               a2 = bs3.a;
                               if (!a2.contains(str)) {
                                  a2.add(str);
                               }
                            }
                            uoa63 = a1;
                         }else {
                            i2 = 0;
                            try{
                               throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                            }catch(java.io.IOException e0){
                            }
                            uoa63 = str;
                            str = "Unable to open asset.";
                            js3.a.getClass();
                            a2 = bs3.a;
                            if (!a2.contains(str)) {
                               a2.add(str);
                            }
                         }
                         uoa63 = g;
                         uBitmap = uBitmap1;
                         goto label_017d ;
                      }
                   }
                }
             }
             if (uBitmap != null && (!uBitmap.isRecycled() && e != null)) {
                float f1 = mf7.c();
                b.setAlpha(i);
                p0.save();
                p0.concat(p1);
                c63 c = uoc63.C;
                c.set(0, 0, uBitmap.getWidth(), uBitmap.getHeight());
                o.getClass();
                d.set(0, 0, (int)((float)uBitmap.getWidth() * f1), (int)((float)uBitmap.getHeight() * f1));
                uCanvas.drawBitmap(uBitmap, c, d, b);
                p0.restore();
             }
             break;
           default:
             if (i3 = Color.alpha(f.l)) {
                int i4 = ((j = uoc63.w.j) == null)? 100: j.e().intValue();
                float f2 = 0x437f0000;
                i = (int)((((((float)i3 / f2) * (float)i4) / 100.00f) * ((float)i / f2)) * f2);
                b.setAlpha(i);
                if (i > 0) {
                   d[0] = 0;
                   d[b1] = 0;
                   float f3 = (float)f.j;
                   d[2] = f3;
                   d[3] = 0;
                   d[4] = f3;
                   f3 = (float)f.k;
                   d[5] = f3;
                   d[6] = 0;
                   d[7] = f3;
                   p1.mapPoints(d);
                   e.reset();
                   e.moveTo(d[0], d[b1]);
                   e.lineTo(d[2], d[3]);
                   e.lineTo(d[4], d[5]);
                   e.lineTo(d[6], d[7]);
                   e.lineTo(d[0], d[b1]);
                   e.close();
                   uCanvas.drawPath(e, b);
                }
             }
             return;
       }
       return;
    }
}
