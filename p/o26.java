package p.o26;
import p.wf2;
import p.gi3;
import java.lang.Object;
import p.aj7;
import com.spotify.allboarding.allboardingimpl.mobius.AllBoardingFragment;
import java.lang.String;
import p.co5;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import java.lang.Integer;
import p.v23;
import p.u23;
import java.util.Arrays;
import p.s23;
import p.r23;
import p.o23;
import p.n23;
import p.k23;
import p.j23;
import p.g23;
import p.f23;
import p.c23;
import p.n13;
import p.m13;
import p.z23;
import p.y23;
import p.tc;
import p.yc;
import p.cm5;
import p.oo0;
import p.lc;
import java.lang.Class;
import p.rh4;
import p.kh4;
import android.view.View;
import p.wh7;
import p.jh7;
import p.qo5;
import p.dz3;
import p.ej7;
import p.xy3;
import p.vi7;
import p.ed;
import com.spotify.lyrics.corecomponents.presenter.controller.LyricsPlaybackControllerImpl$clientLifecycleObserver$2$1;
import p.gy3;
import p.lo1;
import p.cx3;
import p.g37;
import p.zc;
import p.na3;
import p.j8;
import com.spotify.encoreconsumermobile.elements.loadingdots.ThreeDotsLoaderView;
import android.content.Context;
import p.bw3;
import p.uv3;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.io.InputStream;
import p.on;
import p.xe7;
import p.nn6;
import p.hp5;
import java.lang.Boolean;
import p.js3;
import java.util.zip.ZipInputStream;
import p.y70;
import p.dw3;
import java.io.Closeable;
import p.mf7;
import p.kg3;
import p.tg3;
import java.lang.Exception;
import p.sv3;
import p.fw3;
import android.graphics.drawable.Drawable;
import p.jn0;
import p.oi3;
import p.ni3;
import java.util.List;
import java.util.Collections;
import p.wd;
import p.sd;
import p.yd;
import p.qd;
import p.rd;
import android.graphics.Rect;
import p.uv1;
import p.o11;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p.aw3;
import p.tb1;
import android.graphics.drawable.Drawable$Callback;
import android.widget.ImageView;
import android.content.ContentResolver;
import android.provider.Settings$Global;
import android.animation.ValueAnimator;
import java.lang.IllegalArgumentException;
import p.n61;
import p.wn6;
import p.tn6;
import p.rn6;
import p.jc7;
import p.mi5;
import p.vn6;
import p.co6;
import p.m42;
import java.util.TreeMap;
import p.dv0;
import p.lk5;
import java.util.Comparator;
import java.io.File;
import android.os.Environment;
import p.nm3;
import p.uk;
import p.ts6;
import androidx.activity.a;
import p.dj7;
import p.a20;
import android.graphics.BitmapFactory$Options;
import p.x10;
import p.g70;
import p.q63;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import p.lx1;
import p.mx1;
import p.en6;
import p.cd2;
import java.util.Set;
import p.gx1;
import p.hx1;
import p.zw1;
import android.os.Build$VERSION;
import p.u45;
import android.graphics.ColorSpace;
import p.p3;
import android.graphics.Bitmap$Config;
import p.nw5;
import p.fl6;
import p.b17;
import android.util.DisplayMetrics;
import p.oi;
import p.r;
import p.io2;
import java.lang.Throwable;
import p.eb3;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Paint;
import p.x51;
import android.graphics.drawable.BitmapDrawable;
import java.lang.IllegalStateException;
import p.sf2;
import p.rf2;
import p.b7;
import p.kd3;
import android.database.sqlite.SQLiteOpenHelper;
import p.uy;
import p.xy5;
import p.uw6;
import p.lg4;
import p.mg4;
import p.eh4;
import p.q26;
import p.ry7;
import p.uc;

public final class o26 extends gi3 implements wf2	// class@002099 from classes.dex
{
    public final int a;
    public final Object b;

    public void o26(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super(0);
    }
    public final aj7 a(){
       AllBoardingFragment c;
       SearchFragment x;
       o26 tb = this.b;
       switch (this.a){
           case 6:
             break;
           default:
             if ((x = tb.x) != null) {
                return x;
             }
             co5.N("viewModelFactory");
             throw null;
       }
       if ((c = tb.c) != null) {
          return c;
       }
       co5.N("allboardingVMFactory");
       throw null;
    }
    public final Integer c(){
       Object[] objArray;
       int i = 0;
       o26 tb = this.b;
       switch (this.a){
           case 12:
             objArray = new Object[]{n13.d(tb)};
             return Integer.valueOf(Arrays.hashCode(objArray));
           case 13:
             objArray = new Object[]{c23.b(tb),c23.a(tb)};
             return Integer.valueOf(Arrays.hashCode(objArray));
           case 14:
             objArray = new Object[]{g23.m(tb)};
             return Integer.valueOf(Arrays.hashCode(objArray));
           case 15:
             objArray = new Object[]{k23.M(tb)};
             return Integer.valueOf(Arrays.hashCode(objArray));
           case 16:
             objArray = new Object[]{o23.c(tb)};
             return Integer.valueOf(Arrays.hashCode(objArray));
           case 17:
             objArray = new Object[]{s23.e(tb)};
             return Integer.valueOf(Arrays.hashCode(objArray));
           case 18:
             objArray = new Object[]{v23.d(tb)};
             return Integer.valueOf(Arrays.hashCode(objArray));
           default:
             objArray = new Object[]{z23.u(tb)};
             return Integer.valueOf(Arrays.hashCode(objArray));
       }
    }
    public final Object invoke(){
       o26 oo261;
       sf2 a;
       x10 c;
       int i6;
       zw1 ozw1;
       x10 c1;
       u45 c2;
       zw1 b4;
       Bitmap$Config aRGB_8888;
       zw1 ozw11;
       zw1 ozw12;
       zw1 ozw13;
       String str;
       int height;
       Bitmap$Config config;
       BitmapFactory$Options outWidth;
       BitmapFactory$Options outHeight;
       u45 e;
       int i8;
       int i9;
       File externalCach;
       Context context;
       hp5 ohp51;
       dw3 uodw3;
       jn0 ohp51;
       aw3 uoaw3;
       Boolean fALSE;
       zc d5;
       cx3 t;
       ed a5;
       dz3 j;
       tc b7;
       uc b8;
       o26 oo26 = this;
       int i = 3;
       float f = 0x3f800000;
       boolean i1 = 5;
       int i2 = 2;
       float f1 = 0;
       int i3 = 4;
       Rect rect = null;
       boolean b = false;
       o26 b1 = oo26.b;
       boolean b2 = true;
       switch (oo26.a){
           case 0:
             return ry7.E(b1);
           case 1:
             b1.getClass();
             return new mg4(b1.a, b1.u);
           case 2:
             return b1.a.e(b1.d());
           case 3:
             if (Build$VERSION.SDK_INT >= 23) {
                oo261 = b1;
                if (oo261.b != null && oo261.t != null) {
                   a = oo261.a;
                   co5.o(a, "context");
                   File noBackupFile = a.getNoBackupFilesDir();
                   co5.l(noBackupFile, "context.noBackupFilesDir");
                   File oo262 = new File(noBackupFile, oo261.b);
                   String absolutePath = oo262.getAbsolutePath();
                   rf2 noBackupFile1 = new rf2(oo261.a, absolutePath, new b7(6, null), oo261.c, oo261.v);
                label_0731 :
                   noBackupFile.setWriteAheadLoggingEnabled(b1.x);
                   return noBackupFile;
                }
             }
             oo261 = b1;
             rf2 f2 = new rf2(oo261.a, oo261.b, new b7(6, null), oo261.c, oo261.v);
             goto label_0731 ;
             break;
           case 4:
             BitmapFactory$Options options = new BitmapFactory$Options();
             a20 a1 = b1.a;
             x10 ox10 = new x10(a1.f());
             hp5 ohp5 = xe7.f(ox10);
             options.inJustDecodeBounds = true;
             BitmapFactory.decodeStream(ohp5.peek().e0(), rect, options);
             if ((c = ox10.c) == null) {
                options.inJustDecodeBounds = b;
                BitmapFactory$Options outMimeType = options.outMimeType;
                int i4 = en6.A(b1.d);
                int i5 = 10;
                if (i4) {
                   if (i4 != 1) {
                      if (i4 != i2) {
                         throw new cd2(i5);
                      }
                   }else if(outMimeType != null && mx1.a.contains(outMimeType)){
                   label_0418 :
                      int width = 0;
                   label_0419 :
                      outMimeType = 90;
                      i4 = 270;
                      if (f1) {
                         gx1 ogx1 = new gx1(new hx1(ohp5.peek().e0()));
                         i1 = ((i6 = ogx1.c()) != i2 && (i6 != 7 && (i6 != i3 && i6 != i1)))? false: true;
                         switch (ogx1.c()){
                             case 3:
                             case 4:
                               i2 = 180;
                               break;
                             case 5:
                             case 8:
                               i2 = 270;
                               break;
                             case 6:
                             case 7:
                               i2 = 90;
                               break;
                             default:
                               i2 = 0;
                         }
                         ozw1 = new zw1(i2, i1);
                      }else {
                         ozw1 = zw1.c;
                      }
                      if ((c1 = ox10.c) == null) {
                         options.inMutable = b;
                         i1 = Build$VERSION.SDK_INT;
                         i2 = 26;
                         a20 b3 = b1.b;
                         if (i1 >= i2 && (c2 = b3.c) != null) {
                            p3.u(options, c2);
                         }
                         options.inPremultiplied = b3.h;
                         c2 = b3.b;
                         zw1 a2 = ozw1.a;
                         if ((b4 = ozw1.b) == null) {
                            int i7 = (a2 > null)? 1: 0;
                            if (i7) {
                            label_0486 :
                               if (c2 != null) {
                                  b = (i1 >= i2 && c2 == p3.D())? 1: 0;
                                  if (!b) {
                                  label_0497 :
                                     if (b3.g != null && (aRGB_8888 == Bitmap$Config.ARGB_8888 && co5.c(options.outMimeType, "image/jpeg"))) {
                                        aRGB_8888 = Bitmap$Config.RGB_565;
                                     }
                                     if (i1 >= i2 && (p3.i(options) == p3.h() && aRGB_8888 != p3.D())) {
                                        aRGB_8888 = p3.h();
                                     }
                                     options.inPreferredConfig = aRGB_8888;
                                     co5 uoco5 = a1.b();
                                     ozw1 = ozw1.a;
                                     c2 = b3.a;
                                     u45 d = b3.d;
                                     if (uoco5 instanceof nw5 && b17.r(d)) {
                                        options.inSampleSize = 1;
                                        options.inScaled = true;
                                        options.inDensity = uoco5.q;
                                        options.inTargetDensity = c2.getResources().getDisplayMetrics().densityDpi;
                                        ozw11 = ozw1;
                                        ozw12 = a2;
                                        ozw13 = b4;
                                     }else if((outWidth = options.outWidth) > null && (outHeight = options.outHeight) > null){
                                        BitmapFactory$Options options1 = (ozw1 != outMimeType && ozw1 != i4)? 0: 1;
                                        options1 = (a1)? outHeight: outWidth;
                                        e = (ozw1 != outMimeType && ozw1 != i4)? 0: 1;
                                        if (!i5) {
                                           outWidth = outHeight;
                                        }
                                        e = b3.e;
                                        outHeight = (b17.r(d))? options1: r.d(d.a, e);
                                        BitmapFactory$Options options2 = (b17.r(d))? outWidth: r.d(d.b, e);
                                        i4 = Integer.highestOneBit((options1 / outHeight));
                                        i8 = Integer.highestOneBit((outWidth / options2));
                                        if (height = en6.A(e)) {
                                           ozw11 = ozw1;
                                           ozw1 = 1;
                                           if (height == ozw1) {
                                              height = Math.max(i4, i8);
                                           }else {
                                              throw new cd2(10);
                                           }
                                        }else {
                                           ozw11 = ozw1;
                                           i9 = 1;
                                           height = Math.min(i4, i8);
                                        }
                                        if (height < ozw1) {
                                           height = 1;
                                        }
                                        options.inSampleSize = height;
                                        double d1 = (double)height;
                                        double d2 = (double)options1 / d1;
                                        ozw13 = b4;
                                        double d3 = (double)outWidth / d1;
                                        ozw12 = a2;
                                        d1 = (double)outHeight / d2;
                                        double d4 = (double)options2 / d3;
                                        if (i9 = en6.A(e)) {
                                           if (i9 == 1) {
                                              d3 = Math.min(d1, d4);
                                           }else {
                                              throw new cd2(10);
                                           }
                                        }else {
                                           d3 = Math.max(d1, d4);
                                        }
                                        d4 = 0x3ff0000000000000;
                                        if (b3.f != null && (d4 - d3) > 0) {
                                           d3 = d4;
                                        }
                                        int i10 = (!(d3 - d4))? 1: 0;
                                        int i11 = i10 ^ 0x01;
                                        options.inScaled = i11;
                                        if (i11) {
                                           width = Integer.MAX_VALUE;
                                           if ((d4 - d3) > 0) {
                                              options.inDensity = io2.t(((double)width / d3));
                                              options.inTargetDensity = width;
                                           }else {
                                              options.inDensity = width;
                                              options.inTargetDensity = io2.t(((double)width * d3));
                                           }
                                        }
                                     }else {
                                        ozw11 = ozw1;
                                        ozw12 = a2;
                                        ozw13 = b4;
                                        options.inSampleSize = 1;
                                        options.inScaled = false;
                                     label_05d2 :
                                        Rect rect1 = null;
                                        Bitmap uBitmap = BitmapFactory.decodeStream(ohp5.e0(), rect1, options);
                                        eb3.d(ohp5, rect1);
                                        if ((ox10 = ox10.c) == null) {
                                           if (uBitmap != null) {
                                              uBitmap.setDensity(c2.getResources().getDisplayMetrics().densityDpi);
                                              if (ozw13 == null) {
                                                 ox10 = (ozw12 > null)? 1: 0;
                                                 if (!ox10) {
                                                 label_06a4 :
                                                    BitmapDrawable uBitmapDrawa = new BitmapDrawable(c2.getResources(), uBitmap);
                                                    b = (options.inSampleSize <= 1 && options.inScaled == null)? false: true;
                                                    return new x51(uBitmapDrawa, b);
                                                 }
                                              }
                                              Matrix matrix = new Matrix();
                                              float f3 = 2.00f;
                                              f1 = (float)uBitmap.getWidth() / f3;
                                              float f4 = (float)uBitmap.getHeight() / f3;
                                              if (ozw13 != null) {
                                                 matrix.postScale(0xbf800000, 0x3f800000, f1, f4);
                                              }
                                              ozw13 = (ozw12 > null)? 1: 0;
                                              if (ozw13) {
                                                 matrix.postRotate((float)ozw12, f1, f4);
                                              }
                                              f3 = 0;
                                              RectF rectF = new RectF(f3, f3, (float)uBitmap.getWidth(), (float)uBitmap.getHeight());
                                              matrix.mapRect(rectF);
                                              RectF left = rectF.left;
                                              rect1 = (!(left - f3))? 1: 0;
                                              if (rect1) {
                                                 rect1 = (!(rectF.top - f3))? 1: 0;
                                                 if (rect1) {
                                                 label_0655 :
                                                    Bitmap uBitmap1 = ((ozw12 = ozw11) != 90 && ozw12 != 270)? 0: 1;
                                                    str = "createBitmap\(width, height, config\)";
                                                    if (rectF) {
                                                       height = uBitmap.getHeight();
                                                       width = uBitmap.getWidth();
                                                       if ((config = uBitmap.getConfig()) == null) {
                                                          config = Bitmap$Config.ARGB_8888;
                                                       }
                                                       uBitmap1 = Bitmap.createBitmap(height, width, config);
                                                       co5.l(uBitmap1, str);
                                                    }else {
                                                       height = uBitmap.getWidth();
                                                       width = uBitmap.getHeight();
                                                       if ((config = uBitmap.getConfig()) == null) {
                                                          config = Bitmap$Config.ARGB_8888;
                                                       }
                                                       uBitmap1 = Bitmap.createBitmap(height, width, config);
                                                       co5.l(uBitmap1, str);
                                                    }
                                                    new Canvas(uBitmap1).drawBitmap(uBitmap, matrix, lx1.a);
                                                    uBitmap.recycle();
                                                    uBitmap = uBitmap1;
                                                    goto label_06a4 ;
                                                 }
                                              }
                                              matrix.postTranslate((- left), (- rectF.top));
                                              goto label_0655 ;
                                           }else {
                                              throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source \(e.g. network, disk, or memory\) as it\'s not encoded as a valid image format.".toString());
                                           }
                                        }else {
                                           throw ox10;
                                        }
                                     }
                                     ozw1 = 0;
                                     goto label_05d2 ;
                                  }
                               }
                               aRGB_8888 = Bitmap$Config.ARGB_8888;
                               goto label_0497 ;
                            }else {
                               goto label_0497 ;
                            }
                         }else {
                            goto label_0486 ;
                         }
                      }else {
                         throw c1;
                      }
                   }
                   f1 = 1;
                   goto label_0419 ;
                }else {
                   goto label_0418 ;
                }
             }else {
                throw c;
             }
             break;
           case 5:
             dj7 viewModelSto = b1.getViewModelStore();
             co5.l(viewModelSto, "viewModelStore");
             return viewModelSto;
           case 6:
             return this.a();
           case 7:
             return this.a();
           case 8:
             b1.getClass();
             TreeMap treeMap = new TreeMap(new lk5(i1, new dv0(9)));
             m42 b5 = b1.b;
             String absolutePath1 = new File(b5.getFilesDir(), "settings").getAbsolutePath();
             String[] stringArray = new String[i3];
             stringArray[b] = Environment.getExternalStorageDirectory().getAbsolutePath();
             stringArray[1] = "Android/data/";
             stringArray[i2] = b1.c.a.getApplicationContext().getPackageName();
             stringArray[i] = "cache";
             String separator = File.separator;
             co5.l(separator, "separator");
             separator = uk.o0(stringArray, separator, 62);
             str = new File(b5.getFilesDir(), "spotifycache").getAbsolutePath();
             String absolutePath2 = b5.getCacheDir().getAbsolutePath();
             String absolutePath3 = Environment.getExternalStorageDirectory().getAbsolutePath();
             String absolutePath4 = b5.getFilesDir().getAbsolutePath();
             if ((externalCach = b5.getExternalCacheDir()) != null) {
                rect = externalCach.getAbsolutePath();
             }
             treeMap.put(absolutePath1, ts6.b);
             ts6 a3 = ts6.a;
             treeMap.put(separator, a3);
             treeMap.put(str, a3);
             treeMap.put(absolutePath2, ts6.c);
             if (rect != null) {
                treeMap.put(rect, ts6.t);
             }
             treeMap.put(absolutePath4, ts6.v);
             treeMap.put(absolutePath3, ts6.w);
             return treeMap;
             break;
           case 9:
             return b1.a.a(b1.b);
           case 10:
             wn6 own6 = b1.a.edit();
             own6.d(n61.c);
             own6.d(n61.d);
             own6.e();
             return jc7.a;
           case 11:
             context = b1.getContext();
             co5.l(context, "this.context");
             bw3 uobw3 = new bw3();
             String str1 = "rawRes";
             outHeight = (((context.getResources().getConfiguration().uiMode & 0x30)) == 32)? 1: 0;
             str = (outHeight)? "_night_": "_day_";
             i2 = 0x7f110001;
             str1 = str1+str+i2;
             try{
                ohp51 = xe7.f(xe7.d0(context.getResources().openRawResource(i2)));
                try{
                   hp5 ohp52 = ohp51.peek();
                   byte[] a4 = uv3.a;
                   int len = a4.length;
                   i8 = 0;
                   while (true) {
                      if (i8 < len) {
                         if (ohp52.readByte() != a4[i8]) {
                            fALSE = Boolean.FALSE;
                         }else {
                            i8 = i8 + 1;
                         }
                      }else {
                         ohp52.close();
                         fALSE = Boolean.TRUE;
                      }
                   }
                }catch(java.lang.NoSuchMethodError e0){
                   fALSE = Boolean.FALSE;
                }catch(java.lang.Exception e0){
                   js3.a.getClass();
                   fALSE = Boolean.FALSE;
                }
                if (fALSE.booleanValue()) {
                   ZipInputStream zipInputStre = new ZipInputStream(ohp51.e0());
                   uodw3 = uv3.b(context, zipInputStre, e0);
                   mf7.b(zipInputStre);
                }else {
                   y70 oy70 = ohp51.e0();
                   uodw3 = uv3.a(new tg3(xe7.f(xe7.d0(oy70))), e0, b2);
                   mf7.b(oy70);
                }
             }catch(android.content.res.Resources$NotFoundException e0){
                uodw3 = new dw3(e0);
             }
             if ((uodw3 = uodw3.a) != null) {
                bw3 b6 = uobw3.b;
                if (uobw3.a != uodw3) {
                   uobw3.T = b2;
                   if (b6.D != null) {
                      b6.cancel();
                      if (!uobw3.isVisible()) {
                         uobw3.t = b2;
                      }
                   }
                   uobw3.a = rect;
                   uobw3.z = rect;
                   uobw3.w = rect;
                   uobw3.S = -340282346638528860000000000000000000000.00f;
                   b6.C = rect;
                   b6.A = 0xcf000000;
                   b6.B = 0x4f000000;
                   uobw3.invalidateSelf();
                   uobw3.a = uodw3;
                   sv3 i12 = uodw3.i;
                   ni3 oni3 = v14;
                   wd owd = v39;
                   wd owd1 = new wd(null, null, null, null, null, null, null, null, null);
                   ni3 oni31 = v14;
                   oni3 = new ni3(Collections.emptyList(), uodw3, "__container", -1, 1, -1, null, Collections.emptyList(), owd, 0, 0, 0, 0, 0, (float)i12.width(), (float)i12.height(), null, null, Collections.emptyList(), 1, null, false, null, null);
                   ohp51 = new jn0(uobw3, oni31, uodw3.h, uodw3);
                   uobw3.z = ohp51;
                   ohp51 = ((ohp51.F = uobw3.y) == null)? 1: 0;
                   b6.C = uodw3;
                   if (ohp51) {
                      b6.u(Math.max(b6.A, uodw3.j), Math.min(b6.B, uodw3.k));
                   }else {
                      b6.u((float)(int)uodw3.j, (float)(int)uodw3.k);
                   }
                   fw3 y = b6.y;
                   b6.y = f1;
                   b6.x = f1;
                   b6.s((float)(int)y);
                   b6.k();
                   uobw3.f(b6.getAnimatedFraction());
                   bw3 v = uobw3.v;
                   Iterator iterator = new ArrayList(v).iterator();
                   while (iterator.hasNext()) {
                      if ((uoaw3 = iterator.next()) != null) {
                         uoaw3.run();
                      }
                      iterator.remove();
                   }
                   v.clear();
                   uodw3.a.b = b;
                   uobw3.a();
                   Drawable$Callback callback = uobw3.getCallback();
                   if (callback instanceof ImageView) {
                      callback.setImageDrawable(rect);
                      callback.setImageDrawable(uobw3);
                   }
                }
                if (!(Settings$Global.getFloat(context.getContentResolver(), "animator_duration_scale", f) - f1)) {
                   b = 1;
                }
                uobw3.c = Boolean.valueOf((b ^ 0x01)).booleanValue();
                b6.setRepeatMode(1);
                b6.setRepeatCount(-1);
                return uobw3;
             }else {
                throw new IllegalArgumentException("Lottie composition cannot be null");
             }
             break;
           case 12:
             return this.c();
           case 13:
             return this.c();
           case 14:
             return this.c();
           case 15:
             return this.c();
           case 16:
             return this.c();
           case 17:
             return this.c();
           case 18:
             return this.c();
           case 19:
             return this.c();
           case 20:
             return new na3(b1);
           case 21:
             if ((d5 = b1.d) != null) {
                rect = d5.a(new yc(b1, b));
             }
             return rect;
             break;
           case 22:
             if ((t = b1.t) != null) {
                return new lo1(t.b);
             }else {
                co5.N("lyricTextViewLineSpec");
                throw rect;
             }
             break;
           case 23:
             return new LyricsPlaybackControllerImpl$clientLifecycleObserver$2$1(b1);
           case 24:
             if ((a5 = b1.a) != null) {
                rect = a5.a(new yc(b1, b2));
             }
             return rect;
             break;
           case 25:
             if ((j = b1.J) != null) {
                return new qo5(b1, j).g(xy3.class);
             }else {
                co5.N("viewModelFactory");
                throw rect;
             }
             break;
           case 26:
             rh4 orh4 = new rh4(b1);
             if (orh4.d != null) {
                jh7.z(b1);
             }
             orh4.d = b2;
             return orh4;
             break;
           case 27:
             b1.getClass();
             return rect;
           case 28:
             if ((b7 = b1.b) != null) {
                rect = b7.a(new yc(b1, i));
             }
             return rect;
             break;
           default:
             Rect rect2 = rect;
             cm5 uocm5 = ((b8 = b1.b) != null)? b8.a(new yc(b1, i3)): rect2;
             return uocm5;
       }
    }
}
