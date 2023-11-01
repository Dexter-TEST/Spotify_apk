package p.lv1;
import p.bx6;
import java.lang.String;
import p.c65;
import p.ps3;
import java.lang.Object;
import p.au1;
import android.view.View;
import p.co5;
import p.di0;
import android.os.Bundle;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import p.b75;
import android.os.BaseBundle;
import java.util.ArrayList;
import java.lang.Class;
import p.b3;
import p.bi0;
import p.gi7;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import android.content.Context;
import p.sz1;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.Locale;
import java.text.NumberFormat;
import java.lang.Number;
import java.util.concurrent.Executor;
import p.ij;
import java.lang.Runnable;
import android.graphics.Rect;
import java.lang.IllegalArgumentException;
import java.lang.Math;
import p.rq7;
import java.lang.Enum;
import p.cd2;
import java.util.LinkedHashSet;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.InputStream;
import android.net.Uri;
import p.yq0;
import java.util.Set;
import java.io.Closeable;
import java.lang.Throwable;
import p.eb3;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap$Config;
import p.fl6;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build$VERSION;
import p.p3;
import p.b17;
import p.oi;
import p.r;
import p.ye7;
import p.io2;
import android.graphics.Canvas;
import p.oe0;
import java.nio.charset.Charset;
import p.ox7;
import p.a86;
import p.lg4;
import p.n26;
import p.la6;
import p.pa6;
import p.c87;
import p.zf2;
import p.cs3;
import p.v42;
import p.u42;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import p.tp2;
import p.gk5;
import p.m2;
import java.lang.Thread;
import p.gv5;
import p.c75;
import p.n2;
import p.j2;
import java.util.LinkedList;
import java.util.AbstractList;
import java.util.Collection;
import p.vd6;
import p.kv1;

public abstract class lv1	// class@001dcc from classes.dex
{
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final int[] K;
    public static final int[] L;
    public static final int[] M;
    public static final int[] N;
    public static final int[] O;
    public static final bx6 a;
    public static final c65 b;
    public static final ps3 c;
    public static final ps3 d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;
    public static final int[] o;
    public static final int[] p;
    public static final int[] q;
    public static final int[] r;
    public static final int[] s;
    public static final int[] t;
    public static final int[] u;
    public static final int[] v;
    public static final int[] w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;

    static {
       lv1.a = new bx6("NO_DECISION");
       lv1.b = new c65(28);
       lv1.c = new ps3(8);
       lv1.d = new ps3(29);
       lv1.e = new int[8]{0x10100d4,0x101048f,0x1010540,0x7f0301f0,0x7f030245,0x7f03038b,0x7f03038c,0x7f0305c6};
       lv1.f = new int[3]{0x7f030386,0x7f030387,0x7f030388};
       lv1.g = new int[12]{0x7f030068,0x7f03007e,0x7f03007f,0x7f030081,0x7f030082,0x7f030083,0x7f0302d6,0x7f0302d7,0x7f0303e3,0x7f030453,0x7f030693,0x7f030694};
       lv1.h = new int[19]{0x101011f,0x1010120,0x1010440,0x7f030076,0x7f0300a3,0x7f0300a4,0x7f0300a5,0x7f0300a6,0x7f0300a7,0x7f0300a9,0x7f0300aa,0x7f0300ab,0x7f030299,0x7f030474,0x7f030476,0x7f030477,0x7f03047a,0x7f030568,0x7f03056b};
       lv1.i = new int[42]{0x1010034,0x1010095,0x1010098,0x10100ab,0x101011f,0x101014f,0x10101e5,0x7f0300fd,0x7f0300fe,0x7f030101,0x7f030102,0x7f030104,0x7f030105,0x7f030106,0x7f030108,0x7f030109,0x7f03010a,0x7f03010b,0x7f03010c,0x7f03010d,0x7f03010e,0x7f030113,0x7f030114,0x7f030115,0x7f030117,0x7f030127,0x7f030128,0x7f030129,0x7f03012a,0x7f03012b,0x7f03012c,0x7f03012d,0x7f030233,0x7f0302cd,0x7f0302dd,0x7f0302e3,0x7f030542,0x7f030568,0x7f03056b,0x7f030589,0x7f03062f,0x7f030640};
       lv1.j = new int[7]{0x7f0300fc,0x7f03010f,0x7f030110,0x7f030111,0x7f030563,0x7f030591,0x7f030592};
       lv1.k = new int[2]{0x7f030123,0x7f030126};
       lv1.l = new int[3]{0x7f030124,0x7f0303d7,0x7f030564};
       lv1.m = new int[23]{0x7f030132,0x7f030133,0x7f030134,0x7f030189,0x7f030247,0x7f030248,0x7f030249,0x7f03024a,0x7f03024b,0x7f03024c,0x7f03024d,0x7f03024e,0x7f030256,0x7f030295,0x7f0303e7,0x7f03054f,0x7f030551,0x7f0305c7,0x7f03065b,0x7f03065d,0x7f03065e,0x7f030665,0x7f03066b};
       lv1.n = new int[2]{0x7f03033f,0x7f030340};
       lv1.o = new int[2]{0x7f0300a1,0x7f0300a2};
       int[] ointArray = new int[]{0x7f0300a1};
       lv1.p = ointArray;
       lv1.q = new int[2]{0x7f030324,0x7f03038f};
       lv1.r = new int[3]{0x1010109,0x1010200,0x7f030296};
       ointArray = new int[]{0x1010220};
       lv1.s = ointArray;
       lv1.t = new int[21]{0x10100d4,0x10101b7,0x10101b8,0x10101b9,0x10101ba,0x10101e5,0x7f030076,0x7f030077,0x7f030196,0x7f0301f0,0x7f0302da,0x7f0302de,0x7f0302e1,0x7f0302e2,0x7f0302e4,0x7f0302e5,0x7f030542,0x7f030568,0x7f03056b,0x7f0305c8,0x7f0305c9};
       lv1.u = new int[3]{0x7f0300fb,0x7f030563,0x7f030592};
       lv1.v = new int[10]{0x101020d,0x7f0301b3,0x7f0301b4,0x7f0301b5,0x7f0301b6,0x7f030450,0x7f03052d,0x7f0306c1,0x7f0306c2,0x7f0306c3};
       lv1.w = new int[10]{0x10101b7,0x10101b8,0x10101b9,0x10101ba,0x7f030311,0x7f03031d,0x7f03031e,0x7f030325,0x7f030326,0x7f03032a};
       lv1.x = new int[2]{0x7f0300e1,0x7f03068e};
       lv1.y = new int[2]{0x7f0300e1,0x7f03068e};
       lv1.z = new int[2]{0x7f030568,0x7f03056b};
       lv1.A = new int[3]{0x10104b6,0x101057f,0x7f03038e};
       lv1.B = new int[3]{0x1010034,0x101057f,0x7f03038e};
       lv1.C = new int[3]{0x7f030438,0x7f0305d2,0x7f03065c};
       int[] ointArray1 = new int[]{0x7f0303d7};
       lv1.D = ointArray1;
       ointArray1 = new int[]{0x7f0300a8};
       lv1.E = ointArray1;
       lv1.F = new int[10]{0x7f030191,0x7f030192,0x7f030193,0x7f030194,0x7f030195,0x7f030197,0x7f030198,0x7f030199,0x7f03019a,0x7f03019b};
       lv1.G = new int[8]{0x101011f,0x7f030026,0x7f03003d,0x7f030072,0x7f030076,0x7f030077,0x7f0301f0,0x7f0303e1};
       lv1.H = new int[26]{0x7f0305de,0x7f0305df,0x7f0305e0,0x7f0305e1,0x7f0305e2,0x7f0305e3,0x7f0305e4,0x7f0305e5,0x7f0305e6,0x7f0305e7,0x7f0305e8,0x7f0305e9,0x7f0305ea,0x7f0305eb,0x7f0305ec,0x7f0305ed,0x7f0305ee,0x7f0305ef,0x7f0305f0,0x7f0305f1,0x7f0305f2,0x7f0305f3,0x7f0305f5,0x7f0305f7,0x7f0305f8,0x7f0305f9};
       lv1.I = new int[16]{0x1010095,0x1010096,0x1010097,0x1010098,0x101009a,0x101009b,0x1010161,0x1010162,0x1010163,0x1010164,0x10103ac,0x1010585,0x7f03028a,0x7f030293,0x7f0305ff,0x7f030639};
       int[] ointArray2 = new int[]{0x7f030634};
       lv1.J = ointArray2;
       lv1.K = new int[65]{0x101000e,0x101009a,0x101011f,0x101013f,0x1010150,0x7f0300b7,0x7f0300b8,0x7f0300b9,0x7f0300ba,0x7f0300bb,0x7f0300bc,0x7f0300bd,0x7f0300be,0x7f0300bf,0x7f0300c0,0x7f0300c1,0x7f03019e,0x7f03019f,0x7f0301a0,0x7f0301a1,0x7f0301a2,0x7f0301a3,0x7f03022b,0x7f03022c,0x7f03022d,0x7f03022e,0x7f03022f,0x7f030230,0x7f030235,0x7f030236,0x7f030237,0x7f030238,0x7f030239,0x7f03023a,0x7f03023b,0x7f030246,0x7f0302c8,0x7f0302c9,0x7f0302ca,0x7f0302cb,0x7f0302d0,0x7f0302d1,0x7f0302d2,0x7f0302d3,0x7f030480,0x7f030481,0x7f030482,0x7f030483,0x7f030484,0x7f0304f9,0x7f0304fa,0x7f0304fb,0x7f03051a,0x7f03051b,0x7f03051c,0x7f030568,0x7f03056b,0x7f0305b6,0x7f0305b7,0x7f0305b8,0x7f0305b9,0x7f0305ba,0x7f0305d6,0x7f0305d7,0x7f0305d8};
       lv1.L = new int[3]{0x1010034,0x7f030231,0x7f030232};
       lv1.M = new int[5]{0x1010003,0x7f030002,0x7f0301b1,0x7f0301b2,0x7f0305fb};
       int[] ointArray3 = new int[]{0x7f030435};
       lv1.N = ointArray3;
       ointArray2 = new int[]{0x7f0302b5};
       lv1.O = ointArray2;
    }
    public void lv1(){
       super();
    }
    public void lv1(int p0){
       super();
    }
    public static final void A(au1 p0,View p1,View p2){
       String str2;
       double d;
       Configuration locale;
       co5.o(p0, "mapping");
       Bundle uBundle = new Bundle();
       List list = Collections.unmodifiableList(p0.c);
       co5.l(list, "unmodifiableList\(parameters\)");
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          b75 uob75 = iterator.next();
          b75 b = uob75.b;
          b75 a = uob75.a;
          if (b != null) {
             b = (b.length() > 0)? 1: 0;
             if (b) {
                uBundle.putString(a, uob75.b);
             }
          }
          b = uob75.c;
          if (b.size() > 0) {
             int i = -1;
             ArrayList uArrayList = (co5.c(uob75.d, "relative"))? b3.k(p2, b, 0, i, p2.getClass().getSimpleName()): b3.k(p1, b, 0, i, p1.getClass().getSimpleName());
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                bi0 uobi0 = iterator1.next();
                if (uobi0.a() == null) {
                   continue ;
                }else {
                   String str = gi7.h(uobi0.a());
                   i = (str.length() > 0)? 1: 0;
                   if (i) {
                      uBundle.putString(a, str);
                   }else {
                      continue ;
                   }
                }
             }
          }
       }
       String str1 = "_valueToSum";
       if ((str2 = uBundle.getString(str1)) != null) {
          try{
             Matcher matcher = Pattern.compile("[-+]*\\d+\([.,]\\d+\)*\([.,]\\d+\)?", 8).matcher(str2);
             if (matcher.find()) {
                str2 = matcher.group(0);
                try{
                   locale = sz1.a().getResources().getConfiguration().locale;
                }catch(java.lang.Exception e0){
                   locale = null;
                }
                if (locale == null) {
                   locale = Locale.getDefault();
                   co5.l(locale, "getDefault\(\)");
                }
                d = NumberFormat.getNumberInstance(locale).parse(str2).doubleValue();
             }else {
                d = 0;
             }
          }catch(java.text.ParseException e0){
          }
          e0.putDouble(str1, d);
       }
       e0.putString("_is_fb_codeless", "1");
       sz1.c().execute(new ij(p0.a, 20, e0));
       return;
    }
    public static int B(int p0,Rect p1,Rect p2){
       Rect top;
       if (p0 != 17) {
          if (p0 != 33) {
             if (p0 != 66) {
                if (p0 == 130) {
                   top = p2.top;
                   p1 = p1.bottom;
                }else {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }else {
                top = p2.left;
                p1 = p1.right;
             }
          }else {
             top = p1.top;
             p1 = p2.bottom;
          }
       }else {
          top = p1.left;
          p1 = p2.right;
       }
       return Math.max(0, (top - p1));
    }
    public static int D(int p0,Rect p1,Rect p2){
       if (p0 != 17) {
          if (p0 != 33) {
             if (p0 != 66) {
                if (p0 != 130) {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }
          }
          return Math.abs((((p1.width() / 2) + p1.left) - ((p2.width() / 2) + p2.left)));
       }
       return Math.abs((((p1.height() / 2) + p1.top) - ((p2.height() / 2) + p2.top)));
    }
    public static final int H(rq7 p0){
       int i;
       int i1;
       co5.o(p0, "state");
       if (i = p0.ordinal()) {
          i1 = 1;
          if (i != i1) {
             i1 = 2;
             if (i != i1) {
                i1 = 3;
                if (i != i1) {
                   i1 = 4;
                   if (i != i1) {
                      i1 = 5;
                      if (i != i1) {
                         throw new cd2(10);
                      }
                   }
                }
             }
          }
       }else {
          i1 = 0;
       }
       return i1;
    }
    public static boolean c(int p0,Rect p1,Rect p2,Rect p3){
       int i;
       Rect bottom;
       boolean b = lv1.d(p0, p1, p2);
       boolean b1 = false;
       if (lv1.d(p0, p1, p3) || !b) {
          return b1;
       }
       if (p0 != 17) {
          if (p0 != 33) {
             if (p0 != 66) {
                if (p0 == 130) {
                   if (p1.bottom <= p3.top) {
                   label_0043 :
                      i = 1;
                   label_0046 :
                      if (!i) {
                         return true;
                      }else if(p0 != 17 && p0 != 66){
                         int i1 = lv1.B(p0, p1, p2);
                         if (p0 != 17) {
                            if (p0 != 33) {
                               if (p0 != 66) {
                                  if (p0 == 130) {
                                     bottom = p3.bottom;
                                     p1 = p1.bottom;
                                  }else {
                                     throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                  }
                               }else {
                                  bottom = p3.right;
                                  p1 = p1.right;
                               }
                            }else {
                               bottom = p1.top;
                               p1 = p3.top;
                            }
                         }else {
                            bottom = p1.left;
                            p1 = p3.left;
                         }
                         if (i1 < Math.max(true, (bottom - p1))) {
                            b1 = true;
                         }
                         return b1;
                      }else {
                         return true;
                      }
                   }
                }else {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }else if(p1.right <= p3.left){
                goto label_0043 ;
             }
          }else if(p1.top >= p3.bottom){
             goto label_0043 ;
          }
       }else if(p1.left >= p3.right){
          goto label_0043 ;
       }
       i = 0;
       goto label_0046 ;
    }
    public static boolean d(int p0,Rect p1,Rect p2){
       boolean b = false;
       if (p0 != 17) {
          if (p0 != 33) {
             if (p0 != 66) {
                if (p0 != 130) {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }
          }
          if (p2.right >= p1.left && p2.left <= p1.right) {
             b = true;
          }
          return b;
       }
       if (p2.bottom >= p1.top && p2.top <= p1.bottom) {
          b = true;
       }
       return b;
    }
    public static final LinkedHashSet e(byte[] p0){
       int i2;
       co5.o(p0, "bytes");
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       int i = 0;
       int i1 = (!p0.length)? 1: 0;
       if (i1) {
          return linkedHashSe;
       }else {
          ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(p0);
          try{
             i2 = 0;
             ObjectInputStream objectInputS = new ObjectInputStream(uByteArrayIn);
             int i3 = objectInputS.readInt();
             for (; i < i3; i = i + 1) {
                Uri uri = Uri.parse(objectInputS.readUTF());
                co5.l(uri, "uri");
                linkedHashSe.add(new yq0(uri, objectInputS.readBoolean()));
             }
             eb3.d(objectInputS, i2);
          }catch(java.io.IOException e2){
             e2.printStackTrace();
          }
          eb3.d(uByteArrayIn, i2);
          return linkedHashSe;
       }
    }
    public static Bitmap i(Drawable p0,Bitmap$Config p1,fl6 p2,int p3,boolean p4){
       int i2;
       Bitmap$Config aRGB_8888;
       int i3;
       Bitmap bitmap1;
       int width;
       Bitmap bitmap2;
       int height;
       int i = 26;
       int i1 = 1;
       if (p0 instanceof BitmapDrawable) {
          Bitmap bitmap = p0.getBitmap();
          Bitmap$Config config = bitmap.getConfig();
          if (p1 != null) {
             i2 = (Build$VERSION.SDK_INT >= i && p1 == p3.D())? 1: 0;
             if (!i2) {
                aRGB_8888 = p1;
             label_0029 :
                config = (config == aRGB_8888)? 1: 0;
                if (config) {
                   if (!p4) {
                      i3 = bitmap.getWidth();
                      width = bitmap.getHeight();
                      i2 = (b17.r(p2))? bitmap.getWidth(): r.d(p2.a, p3);
                      height = (b17.r(p2))? bitmap.getHeight(): r.d(p2.b, p3);
                      if (ye7.m(i3, width, i2, height, p3) - 0x3ff0000000000000) {
                         bitmap2 = 0;
                      label_006a :
                         if (i3) {
                            return bitmap;
                         }
                      }
                   }
                   i3 = 1;
                   goto label_006a ;
                }
             }
          }
          aRGB_8888 = Bitmap$Config.ARGB_8888;
          goto label_0029 ;
       }
       p0 = p0.mutate();
       i3 = p0 instanceof BitmapDrawable;
       BitmapDrawable uBitmapDrawa = null;
       Drawable uDrawable = (i3)? p0: uBitmapDrawa;
       width = (uDrawable != null && (bitmap1 = uDrawable.getBitmap()) != null)? bitmap1.getWidth(): p0.getIntrinsicWidth();
       i2 = 512;
       if (width <= 0) {
          width = 512;
       }
       if (i3) {
          uBitmapDrawa = p0;
       }
       i3 = (uBitmapDrawa != null && (bitmap2 = uBitmapDrawa.getBitmap()) != null)? bitmap2.getHeight(): p0.getIntrinsicHeight();
       if (i3 > 0) {
          i2 = i3;
       }
       i3 = (b17.r(p2))? width: r.d(p2.a, p3);
       int i4 = (b17.r(p2))? i2: r.d(p2.b, p3);
       double d = ye7.m(width, i2, i3, i4, p3);
       i3 = io2.t(((double)width * d));
       i4 = io2.t((d * (double)i2));
       if (p1 != null) {
          if (Build$VERSION.SDK_INT < i || p1 != p3.D()) {
             i1 = 0;
          }
          if (!i1) {
          label_00ee :
             Bitmap uBitmap = Bitmap.createBitmap(i3, i4, p1);
             co5.l(uBitmap, "createBitmap\(width, height, config\)");
             Rect bounds = p0.getBounds();
             p0.setBounds(0, 0, i3, i4);
             p0.draw(new Canvas(uBitmap));
             p0.setBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
             return uBitmap;
          }
       }
       p1 = Bitmap$Config.ARGB_8888;
       goto label_00ee ;
    }
    public static final String l(String p0){
       co5.o(p0, "query");
       p0 = a86.a.matcher(ox7.c(p0, oe0.a)).replaceAll("%20");
       co5.l(p0, "PLUS_SIGN_PATTERN\n      …       .replaceAll\(\"%20\"\)");
       return p0;
    }
    public static final lg4 m(View p0){
       u42 ou42 = new u42(new v42(new c87(pa6.G(p0, n26.B), n26.C), false, cs3.c));
       lg4 olg4 = (!ou42.hasNext())? null: ou42.next();
       if (olg4 != null) {
          return olg4;
       }else {
          throw new IllegalStateException("View "+p0+" does not have a NavController set");
       }
    }
    public static final int t(int p0){
       int i = 1;
       if (p0) {
          if (p0 == i) {
             i = 2;
          }else {
             throw new IllegalArgumentException(tp2.l("Could not convert ", p0, " to BackoffPolicy"));
          }
       }
       return i;
    }
    public static final int u(int p0){
       int i = 1;
       if (p0) {
          int i1 = 2;
          if (p0 != i) {
             i = 3;
             if (p0 != i1) {
                i1 = 4;
                if (p0 != i) {
                   i = 5;
                   if (p0 != i1) {
                      if (Build$VERSION.SDK_INT >= 30 && p0 == i) {
                         return 6;
                      }else {
                         throw new IllegalArgumentException(tp2.l("Could not convert ", p0, " to NetworkType"));
                      }
                   }
                }else {
                   i = 4;
                }
             }
          }else {
             i = 2;
          }
       }
       return i;
    }
    public static final int v(int p0){
       int i = 1;
       if (p0) {
          if (p0 == i) {
             i = 2;
          }else {
             throw new IllegalArgumentException(tp2.l("Could not convert ", p0, " to OutOfQuotaPolicy"));
          }
       }
       return i;
    }
    public static final rq7 w(int p0){
       rq7 w;
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 != 4) {
                      if (p0 == 5) {
                         w = rq7.w;
                      }else {
                         throw new IllegalArgumentException(tp2.l("Could not convert ", p0, " to State"));
                      }
                   }else {
                      w = rq7.v;
                   }
                }else {
                   w = rq7.t;
                }
             }else {
                w = rq7.c;
             }
          }else {
             w = rq7.b;
          }
       }else {
          w = rq7.a;
       }
       return w;
    }
    public static boolean x(int p0,Rect p1,Rect p2){
       Rect top;
       boolean b = false;
       if (p0 != 17) {
          if (p0 != 33) {
             if (p0 != 66) {
                if (p0 == 130) {
                   top = p2.top;
                   if (p1.top < top || (p1.bottom <= top && p1.bottom < p2.bottom)) {
                      b = true;
                   }
                   return b;
                }else {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }else {
                top = p2.left;
                if (p1.left < top || (p1.right <= top && p1.right < p2.right)) {
                   b = true;
                }
                return b;
             }
          }else {
             top = p2.bottom;
             if (p1.bottom > top || (p1.top >= top && p1.top > p2.top)) {
                b = true;
             }
             return b;
          }
       }else {
          top = p2.right;
          if (p1.right > top || (p1.left >= top && p1.left > p2.left)) {
             b = true;
          }
          return b;
       }
    }
    public abstract void C(gk5 p0,gk5 p1,gk5 p2);
    public abstract void E(m2 p0,m2 p1);
    public abstract void F(m2 p0,Thread p1);
    public abstract void G();
    public abstract void a(gv5 p0,Object p1);
    public c75 b(){
       return new c75(this, 1);
    }
    public abstract boolean f(n2 p0,j2 p1,j2 p2);
    public abstract boolean g(n2 p0,Object p1,Object p2);
    public abstract boolean h(n2 p0,m2 p1,m2 p2);
    public void j(LinkedList p0){
       if (p0.size() <= 999) {
          this.k(p0);
          return;
       }else {
          ArrayList uArrayList = new ArrayList(999);
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next());
             if (uArrayList.size() == 999) {
                this.k(uArrayList);
                uArrayList.clear();
             }
          }
          if (uArrayList.size() > 0) {
             this.k(uArrayList);
          }
          return;
       }
    }
    public abstract void k(AbstractList p0);
    public abstract void n(float p0,float p1,vd6 p2);
    public abstract int o();
    public abstract long p(String p0,byte[] p1);
    public abstract int q();
    public abstract int r();
    public abstract void s(kv1 p0);
    public abstract boolean y();
    public c75 z(){
       return new c75(this, 0);
    }
}
