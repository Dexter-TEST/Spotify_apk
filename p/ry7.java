package p.ry7;
import p.w54;
import p.c65;
import p.mb2;
import p.pc;
import p.v74;
import p.az5;
import p.ps3;
import java.lang.Object;
import android.content.Context;
import android.graphics.drawable.Drawable;
import p.eb3;
import java.lang.String;
import p.tp2;
import java.lang.IllegalStateException;
import android.content.res.TypedArray;
import android.animation.PropertyValuesHolder;
import android.util.TypedValue;
import p.v95;
import p.vv7;
import p.rq5;
import android.animation.TypeEvaluator;
import android.view.InflateException;
import java.lang.StringBuilder;
import p.dk;
import p.ju2;
import java.util.Map;
import p.tt2;
import p.au2;
import p.b43;
import java.util.List;
import java.util.Iterator;
import p.ej7;
import p.q26;
import p.co5;
import java.util.ArrayList;
import java.lang.Class;
import p.uf0;
import p.ns5;
import p.xi7;
import p.ah3;
import p.ye7;
import p.n93;
import java.util.Arrays;
import p.qo5;
import p.aj7;
import p.vi7;
import android.content.res.Resources;
import java.io.File;
import android.os.Process;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.os.IBinder;
import p.sp6;
import p.lp6;
import p.fr0;
import android.content.res.Configuration;
import android.graphics.Color;
import java.lang.Math;
import p.lj0;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import android.animation.ObjectAnimator;
import android.content.res.XmlResourceParser;
import android.animation.ValueAnimator;
import p.tu6;
import p.ej4;
import org.xmlpull.v1.XmlPullParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.lang.Float;
import android.view.animation.Interpolator;
import android.view.animation.AnimationUtils;
import android.animation.TimeInterpolator;
import android.net.Uri;
import java.nio.MappedByteBuffer;
import android.content.ContentResolver;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import p.wa7;
import java.io.FileInputStream;
import java.io.FileDescriptor;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel$MapMode;
import java.lang.Throwable;
import android.os.Build$VERSION;
import p.ww5;
import p.vw5;
import java.lang.reflect.Method;
import java.lang.reflect.AccessibleObject;
import p.ek3;
import p.ys5;
import java.lang.Iterable;
import p.ab2;
import p.jr7;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import p.zq0;
import p.b7;
import p.h51;
import java.util.HashMap;
import p.kg4;
import p.rq7;
import com.google.common.collect.c;
import p.pq5;
import p.jg2;
import p.jo6;
import p.ko6;
import java.nio.ByteBuffer;
import java.lang.RuntimeException;
import android.widget.TextView;
import p.ac2;
import java.lang.Integer;
import android.graphics.Typeface;
import p.fm1;
import p.tx5;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import p.kz6;
import java.io.Closeable;
import java.util.Date;
import java.io.InputStream;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import java.io.FileOutputStream;
import android.util.Log;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.util.Xml;
import android.animation.Keyframe;
import p.me4;
import p.m26;
import p.i01;
import java.util.LinkedHashMap;
import p.v26;
import android.os.Bundle;
import p.fv1;
import p.t26;
import p.s26;
import p.p26;
import p.ay6;
import android.os.BaseBundle;
import p.gg1;
import java.lang.IllegalArgumentException;
import p.vj3;
import p.uj3;
import androidx.lifecycle.SavedStateHandleAttacher;
import p.dk3;
import java.util.Set;
import p.io2;
import android.view.ViewGroup;
import java.lang.NullPointerException;
import java.lang.reflect.Field;
import android.util.LongSparseArray;
import p.yw5;
import p.mo;
import p.g20;
import java.lang.Enum;
import android.util.DisplayMetrics;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import p.p3;
import p.ox7;
import android.content.res.ColorStateList;
import p.n6;
import p.p86;
import p.uo7;

public abstract class ry7 implements w54	// class@002584 from classes.dex
{
    public static final c65 A;
    public static final c65 B;
    public static final mb2 C;
    public static final mb2 D;
    public static final pc E;
    public static final pc F;
    public static final v74 G;
    public static final int[] H;
    public static final az5 I;
    public static final az5 J;
    public static final az5 K;
    public static final ps3 L;
    public static wx7 a;
    public static Field b;
    public static boolean c;
    public static Class t;
    public static boolean v;
    public static Field w;
    public static boolean x;
    public static Field y;
    public static boolean z;

    static {
       ry7.A = new c65(22);
       ry7.B = new c65(15);
       ry7.C = new mb2(5);
       ry7.D = new mb2(6);
       ry7.E = new pc(9);
       ry7.F = new pc(8);
       ry7.G = new v74(10);
       ry7.H = new int[4]{0x7f030069,0x7f03013a,0x7f0302ff,0x7f030300};
       ry7.I = new az5();
       ry7.J = new az5();
       ry7.K = new az5();
       ry7.L = new ps3(21);
    }
    public void ry7(){
       super();
    }
    public static final Drawable A(Context p0,int p1){
       Drawable uDrawable;
       if ((uDrawable = eb3.m(p0, p1)) != null) {
          return uDrawable;
       }
       throw new IllegalStateException(tp2.k("Invalid resource ID: ", p1).toString());
    }
    public static PropertyValuesHolder B(TypedArray p0,int p1,int p2,int p3,String p4){
       TypedValue typedValue;
       TypedValue typedValue1;
       Object[] objArray;
       PropertyValuesHolder propertyValu1;
       dk a;
       float dimension1;
       int i4;
       int i5;
       int i6;
       int i = ((typedValue = p0.peekValue(p2)) != null)? 1: 0;
       typedValue = (i)? typedValue.type: 0;
       int i1 = ((typedValue1 = p0.peekValue(p3)) != null)? 1: 0;
       typedValue1 = (i1)? typedValue1.type: 0;
       int i2 = 3;
       if (p1 == 4) {
          p1 = (i && (ry7.K(typedValue) || (i1 && ry7.K(typedValue1))))? 3: 0;
       }
       int i3 = (!p1)? 1: 0;
       PropertyValuesHolder propertyValu = null;
       if (p1 == 2) {
          String str = p0.getString(p2);
          String str1 = p0.getString(p3);
          v95[] ov95Array = vv7.k(str);
          v95[] ov95Array1 = vv7.k(str1);
          if (ov95Array != null || ov95Array1 != null) {
             if (ov95Array != null) {
                rq5 orq5 = new rq5(1);
                if (ov95Array1 != null) {
                   if (vv7.e(ov95Array, ov95Array1)) {
                      objArray = new Object[]{ov95Array,ov95Array1};
                      propertyValu1 = PropertyValuesHolder.ofObject(p4, orq5, objArray);
                   }else {
                      throw new InflateException(" Can\'t morph from "+str+" to "+str1);
                   }
                }else {
                   objArray = new Object[]{ov95Array};
                   propertyValu1 = PropertyValuesHolder.ofObject(p4, orq5, objArray);
                }
                propertyValu = propertyValu1;
             }else if(ov95Array1 != null){
                Object[] objArray1 = new Object[]{ov95Array1};
                propertyValu = PropertyValuesHolder.ofObject(p4, new rq5(1), objArray1);
             }
          }
       }else if(p1 == i2){
          a = dk.a;
       }else {
          a = propertyValu;
       }
       if (i3) {
          if (i) {
             float dimension = (typedValue == 5)? p0.getDimension(p2, 0): p0.getFloat(p2, 0);
             if (i1) {
                dimension1 = (typedValue1 == 5)? p0.getDimension(p3, 0): p0.getFloat(p3, 0);
                float[] uofloatArray = new float[]{dimension,dimension1};
                propertyValu1 = PropertyValuesHolder.ofFloat(p4, uofloatArray);
             }else {
                float[] uofloatArray1 = new float[]{dimension};
                propertyValu1 = PropertyValuesHolder.ofFloat(p4, uofloatArray1);
             }
          }else if(typedValue1 == 5){
             dimension1 = p0.getDimension(p3, 0);
          }else {
             dimension1 = p0.getFloat(p3, 0);
          }
          float[] uofloatArray2 = new float[]{dimension1};
          propertyValu1 = PropertyValuesHolder.ofFloat(p4, uofloatArray2);
          propertyValu = propertyValu1;
       }else if(i){
          if (typedValue == 5) {
             p2 = (int)p0.getDimension(p2, 0);
          }else if(ry7.K(typedValue)){
             p2 = p0.getColor(p2, 0);
          }else {
             p2 = p0.getInt(p2, 0);
          }
          if (i1) {
             if (typedValue1 == 5) {
                i4 = (int)p0.getDimension(p3, 0);
             }else if(ry7.K(typedValue1)){
                i4 = p0.getColor(p3, 0);
             }else {
                i4 = p0.getInt(p3, 0);
             }
             int[] ointArray = new int[]{p2,i4};
             propertyValu = PropertyValuesHolder.ofInt(p4, ointArray);
          }else {
             int[] ointArray1 = new int[]{p2};
             propertyValu = PropertyValuesHolder.ofInt(p4, ointArray1);
          }
       }else if(i1){
          if (typedValue1 == 5) {
             i4 = (int)p0.getDimension(p3, 0);
          }else if(ry7.K(typedValue1)){
             i4 = p0.getColor(p3, 0);
          }else {
             i4 = p0.getInt(p3, 0);
          }
          int[] ointArray2 = new int[]{i4};
          propertyValu = PropertyValuesHolder.ofInt(p4, ointArray2);
       }
       if (propertyValu != null && a != null) {
          propertyValu.setEvaluator(a);
       }
       return propertyValu;
    }
    public static String C(ju2 p0){
       tt2 ott2;
       if ((ott2 = p0.m().get("click")) != null && "playFromContext".equals(ott2.name())) {
          return ott2.b().q("uri");
       }
       return null;
    }
    public static String D(b43 p0){
       ju2 oju2;
       String str;
       if ((oju2 = p0.e()) != null) {
          List list = oju2.e("primary_buttons");
          if (list.isEmpty()) {
             return p0.b().q("context_uri");
          }else {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                if ((str = ry7.C(iterator.next())) != null) {
                   return str;
                }
             }
          }
       }
       return null;
    }
    public static final q26 E(ej7 p0){
       co5.o(p0, "<this>");
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new xi7(ye7.z(ns5.a(q26.class))));
       xi7[] oxi7Array = new xi7[0];
       xi7[] oxi7Array1 = uArrayList.toArray(oxi7Array);
       return new qo5(p0, new n93(Arrays.copyOf(oxi7Array1, oxi7Array1.length))).h(q26.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
    public static int F(Context p0){
       int identifier;
       Resources resources = p0.getResources();
       int i = (!(identifier = resources.getIdentifier("status_bar_height", "dimen", "android")))? 0: resources.getDimensionPixelSize(identifier);
       return i;
    }
    public static File G(Context p0){
       File cacheDir;
       File uFile;
       if ((cacheDir = p0.getCacheDir()) == null) {
          return null;
       }
       String str = ".font"+Process.myPid()+"-"+Process.myTid()+"-";
       int i = 0;
       while (true) {
          if (i >= 100) {
             return null;
          }
          String str1 = "".append(str).append(i).toString();
          try{
             uFile = new File(cacheDir, str1);
             if (uFile.createNewFile()) {
                break ;
             }else {
                i = i + 1;
             }
          }catch(java.io.IOException e0){
          }
       }
       return uFile;
    }
    public static void H(View p0){
       p0.getContext().getSystemService("input_method").hideSoftInputFromWindow(p0.getWindowToken(), 0);
    }
    public static lp6 I(Context p0,sp6 p1){
       return new lp6(p0, p1, (float)p0.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
    }
    public static void J(String p0,String p1,fr0 p2){
       if (p0 != null) {
          p2.accept(p0);
       }else if(p1 != null){
          p2.accept(p1);
       }
       return;
    }
    public static boolean K(int p0){
       boolean b = (p0 >= 28 && p0 <= 31)? true: false;
       return b;
    }
    public static boolean L(Context p0){
       boolean b = ((0x3fa66666 - p0.getResources().getConfiguration().fontScale) >= 0)? true: false;
       return b;
    }
    public static int M(int p0,float p1,int p2){
       return lj0.f(lj0.h(p2, Math.round(((float)Color.alpha(p2) * p1))), p0);
    }
    public static ValueAnimator N(Context p0,Resources p1,Resources$Theme p2,AttributeSet p3,ObjectAnimator p4,XmlResourceParser p5){
       TypedValue typedValue;
       TypedValue typedValue1;
       PropertyValuesHolder propertyValu;
       PropertyValuesHolder[] propertyValu1;
       String str;
       ValueAnimator valueAnimato2;
       TypedArray typedArray2;
       int i12;
       PropertyValuesHolder propertyValu2;
       TypedArray typedArray3;
       ValueAnimator valueAnimato3;
       Resources resources = p1;
       Resources$Theme theme = p2;
       AttributeSet uAttributeSe = p3;
       XmlPullParser xmlPullParse = p5;
       TypedArray typedArray = ej4.h0(resources, theme, uAttributeSe, tu6.x);
       TypedArray typedArray1 = ej4.h0(resources, theme, uAttributeSe, tu6.B);
       ValueAnimator valueAnimato = (p4 == null)? new ValueAnimator(): p4;
       int i = 1;
       long l = (long)ej4.L(typedArray, xmlPullParse, "duration", i, 300);
       int i1 = 0;
       long l1 = (long)ej4.L(typedArray, xmlPullParse, "startOffset", 2, i1);
       int i2 = 4;
       int i3 = ej4.L(typedArray, xmlPullParse, "valueType", 7, i2);
       int i4 = 3;
       if (ej4.R(xmlPullParse, "valueFrom") && ej4.R(xmlPullParse, "valueTo")) {
          int i5 = 6;
          int i6 = 5;
          if (i3 == i2) {
             int i7 = ((typedValue = typedArray.peekValue(i6)) != null)? 1: 0;
             typedValue = (i7)? typedValue.type: 0;
             int i8 = ((typedValue1 = typedArray.peekValue(i5)) != null)? 1: 0;
             typedValue1 = (i8)? typedValue1.type: 0;
             if (i7 && (ry7.K(typedValue) || (i8 && ry7.K(typedValue1)))) {
                i3 = 3;
             }else {
                i3 = 0;
             }
          }
          if ((propertyValu = ry7.B(typedArray, i3, i6, i5, "")) != null) {
             propertyValu1 = new PropertyValuesHolder[i];
             propertyValu1[i1] = propertyValu;
             valueAnimato.setValues(propertyValu1);
          }
       }
       valueAnimato.setDuration(l);
       valueAnimato.setStartDelay(l1);
       valueAnimato.setRepeatCount(ej4.L(typedArray, xmlPullParse, "repeatCount", i4, i1));
       valueAnimato.setRepeatMode(ej4.L(typedArray, xmlPullParse, "repeatMode", i2, i));
       if (typedArray1 != null) {
          ValueAnimator valueAnimato1 = valueAnimato;
          if ((str = ej4.M(typedArray1, xmlPullParse, "pathData", i)) != null) {
             String str1 = ej4.M(typedArray1, xmlPullParse, "propertyXName", 2);
             String str2 = ej4.M(typedArray1, xmlPullParse, "propertyYName", i4);
             if (str1 == null && str2 == null) {
                throw new InflateException(typedArray1.getPositionDescription()+" propertyXName or propertyYName is needed for PathData");
             }else {
                Path path = vv7.l(str);
                PathMeasure pathMeasure = new PathMeasure(path, i1);
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(Float.valueOf(0));
                float f = 0;
                do {
                   f = f + pathMeasure.getLength();
                   uArrayList.add(Float.valueOf(f));
                } while (!pathMeasure.nextContour());
                pathMeasure = new PathMeasure(path, i1);
                int i9 = Math.min(100, ((int)(f / 0x3f000000) + i));
                float[] uofloatArray = new float[i9];
                float[] uofloatArray1 = new float[i9];
                float[] uofloatArray2 = new float[2];
                f = f / (float)(i9 - 1);
                valueAnimato2 = valueAnimato;
                typedArray2 = typedArray;
                int i10 = 0;
                float f1 = 0;
                while (true) {
                   float[] uofloatArray3 = null;
                   if (i1 < i9) {
                      int i11 = i9;
                      float f2 = f1 - uArrayList.get(i10).floatValue();
                      pathMeasure.getPosTan(f2, uofloatArray2, uofloatArray3);
                      uofloatArray[i1] = uofloatArray2[0];
                      uofloatArray1[i1] = uofloatArray2[1];
                      f1 = f1 + f;
                      if ((i12 = i10 + 1) < uArrayList.size() && (uArrayList.get(i12).floatValue() - f1) > 0) {
                         pathMeasure.nextContour();
                         i10 = i12;
                      }
                      i1 = i1 + 1;
                      i9 = i11;
                   }else if(str1 != null){
                      propertyValu2 = PropertyValuesHolder.ofFloat(str1, uofloatArray);
                   }else {
                      propertyValu2 = uofloatArray3;
                   }
                   if (str2 != null) {
                      uofloatArray3 = PropertyValuesHolder.ofFloat(str2, uofloatArray1);
                   }
                   if (propertyValu2 == null) {
                      PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[]{uofloatArray3};
                      i1 = 0;
                      valueAnimato1.setValues(propertyValu3);
                   }else {
                      i1 = 0;
                      if (uofloatArray3 == null) {
                         PropertyValuesHolder[] propertyValu4 = new PropertyValuesHolder[]{propertyValu2};
                         valueAnimato1.setValues(propertyValu4);
                      }else {
                         propertyValu1 = new PropertyValuesHolder[]{propertyValu2,uofloatArray3};
                         valueAnimato1.setValues(propertyValu1);
                      }
                   }
                }
             }
          }else {
             valueAnimato2 = valueAnimato;
             typedArray2 = typedArray;
             valueAnimato1.setPropertyName(ej4.M(typedArray1, xmlPullParse, "propertyName", i1));
          }
       }else {
          valueAnimato2 = valueAnimato;
          typedArray2 = typedArray;
       }
       if (!ej4.R(xmlPullParse, "interpolator")) {
          typedArray3 = typedArray2;
       }else {
          typedArray3 = typedArray2;
          i1 = typedArray3.getResourceId(i1, i1);
       }
       if (i1 > 0) {
          valueAnimato3 = valueAnimato2;
          valueAnimato3.setInterpolator(AnimationUtils.loadInterpolator(p0, i1));
       }else {
          valueAnimato3 = valueAnimato2;
       }
       typedArray3.recycle();
       if (typedArray1 != null) {
          typedArray1.recycle();
       }
       return valueAnimato3;
    }
    public static MappedByteBuffer P(Context p0,Uri p1){
       ParcelFileDescriptor parcelFileDe;
       ContentResolver contentResol = p0.getContentResolver();
       try{
          int i = 0;
          if ((parcelFileDe = wa7.a(contentResol, p1, "r", i)) == null) {
             if (parcelFileDe != null) {
                parcelFileDe.close();
             }
             return i;
          }else {
             FileInputStream uFileInputSt = new FileInputStream(parcelFileDe.getFileDescriptor());
             FileChannel channel = uFileInputSt.getChannel();
             uFileInputSt.close();
             parcelFileDe.close();
             return channel.map(FileChannel$MapMode.READ_ONLY, 0, channel.size());
          }
       }catch(java.io.IOException e0){
          return e0;
       }
    }
    public static void Q(Resources$Theme p0){
       int sDK_INT;
       Method b1;
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 29) {
          ww5.a(p0);
       }else if(sDK_INT >= 23){
          Object a = vw5.a;
          _monitor_enter(a);
          int i = 0;
          if (!vw5.c) {
             boolean b = true;
             try{
                Class[] uClassArray = new Class[i];
                Method declaredMeth = Resources$Theme.class.getDeclaredMethod("rebase", uClassArray);
                vw5.b = declaredMeth;
                declaredMeth.setAccessible(b);
                vw5.c = b;
             }catch(java.lang.NoSuchMethodException e0){
             }
          }
          if ((b1 = vw5.b) != null) {
             try{
                Object[] objArray = new Object[i];
                b1.invoke(p0, objArray);
             }catch(java.lang.IllegalAccessException e0){
                vw5.b = null;
             }catch(java.lang.reflect.InvocationTargetException e0){
             }
          }
          _monitor_exit(e0);
       }
       return;
    }
    public static final void R(View p0,ek3 p1){
       co5.o(p0, "<this>");
       p0.setTag(R.id.view_tree_lifecycle_owner, p1);
    }
    public static ys5 S(List p0){
       return ab2.b(p0).l(ry7.C);
    }
    public static final jr7 T(jr7 p0){
       jr7 ojr7 = p0;
       jr7 j = ojr7.j;
       ConstraintTrackingWorker uConstraintT = ConstraintTrackingWorker.class;
       jr7 c = ojr7.c;
       if (!co5.c(c, uConstraintT.getName()) && (j.d != null && j.e == null)) {
          b7 j1 = new b7(7);
          j1.p(ojr7.e.a);
          j1.b.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", c);
          h51 oh51 = j1.l();
          j = ojr7.b;
          jr7 ojr71 = j;
          jr7 j2 = ojr7.j;
          jr7 l = ojr7.l;
          c = ojr7.a;
          jr7 ojr72 = c;
          co5.o(c, "id");
          co5.o(j, "state");
          j = ojr7.f;
          jr7 ojr73 = j;
          co5.o(j, "output");
          co5.o(j2, "constraints");
          kg4.t(l, "backoffPolicy");
          ojr7 = ojr7.r;
          jr7 ojr74 = ojr7;
          kg4.t(ojr7, "outOfQuotaPolicy");
          ojr7 = new jr7(ojr72, ojr71, uConstraintT.getName(), ojr7.d, oh51, ojr73, ojr7.g, ojr7.h, ojr7.i, j2, ojr7.k, l, ojr7.m, ojr7.n, ojr7.o, ojr7.p, ojr7.q, ojr74, ojr7.s, ojr7.t);
       }
       return ojr7;
    }
    public static c U(ys5 p0){
       return ab2.b(p0).m(new pq5(3)).d();
    }
    public static final ko6 V(jo6 p0){
       co5.q(p0, "receiver$0");
       return new ko6(0, p0);
    }
    public static void W(ByteBuffer p0,long p1,int p2){
       if (p2 != 1) {
          if (p2 != 2) {
             if (p2 != 3) {
                if (p2 != 4) {
                   if (p2 == 8) {
                      p0.putLong(p1);
                   }else {
                      throw new RuntimeException(tp2.l("I don\'t know how to read ", p2, " bytes"));
                   }
                }else {
                   p0.putInt((int)p1);
                }
             }else {
                vv7.f0(p0, (int)(p1 & 0xffffff));
             }
          }else {
             vv7.e0(p0, (int)(p1 & 0xffff));
          }
       }else {
          p0.put((byte)((int)(p1 & 255) & 0x00ff));
       }
       return;
    }
    public static final void a(TextView p0,int p1){
       int resourceId;
       Object[] objArray;
       co5.o(p0, "textView");
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 29;
       if (sDK_INT >= i) {
          int[] ointArray = new int[]{0x10103ac};
          Context context = p0.getContext();
          co5.l(context, "textView.context");
          TypedArray typedArray = context.obtainStyledAttributes(p1, ointArray);
          co5.l(typedArray, "obtainStyledAttributes\(resourceId, attrs\)");
          resourceId = typedArray.getResourceId(0, 0);
          context = p0.getContext();
          co5.l(context, "textView.context");
          Typeface typeface = null;
          if (sDK_INT >= i) {
             if ((objArray = ac2.a.get(Integer.valueOf(resourceId))) == null) {
                objArray = new String[0];
             }
             Typeface typeface1 = fm1.a(context, resourceId, objArray);
             if (!typeface1 instanceof tx5) {
                typeface = typeface1;
             }
          }
          if (typeface != null) {
             p0.setTypeface(typeface);
          }
          typedArray.recycle();
       }
       return;
    }
    public static final void b(TextView p0,AttributeSet p1,int p2){
       co5.o(p0, "textView");
       Context context = p0.getContext();
       co5.l(context, "context");
       int[] ointArray = new int[]{0x1010034};
       TypedArray typedArray = context.obtainStyledAttributes(p1, ointArray, p2, 0);
       co5.l(typedArray, "context.obtainStyledAttr…arance\), defStyleAttr, 0\)");
       typedArray.recycle();
       ry7.a(p0, typedArray.getResourceId(0, 0));
    }
    public static void d(View p0){
       p0.setFocusable(false);
       p0.setOnClickListener(null);
       p0.setClickable(false);
       p0.setOnLongClickListener(null);
       p0.setLongClickable(false);
    }
    public static final kz6 e(View p0){
       co5.q(p0, "$this$clicks");
       return new kz6(p0);
    }
    public static void f(Closeable p0){
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static long g(Date p0){
       return ((p0.getTime() / 1000) + 0x7c25b080);
    }
    public static Date h(long p0){
       return new Date(((p0 - 0x7c25b080) * 1000));
    }
    public static boolean i(File p0,Resources p1,int p2){
       InputStream inputStream = p1.openRawResource(p2);
       ry7.f(inputStream);
       return ry7.j(p0, inputStream);
    }
    public static boolean j(File p0,InputStream p1){
       StrictMode$ThreadPolicy threadPolicy = StrictMode.allowThreadDiskWrites();
       try{
          int i = 0;
          FileOutputStream uFileOutputS = new FileOutputStream(p0, false);
          try{
             int i1 = 1024;
             byte[] uobyteArray = new byte[i1];
             while ((i = p1.read(uobyteArray)) != -1) {
                uFileOutputS.write(uobyteArray, false, i);
             }
             ry7.f(uFileOutputS);
             StrictMode.setThreadPolicy(threadPolicy);
             return true;
          }catch(java.io.IOException e5){
             Closeable uCloseable = uFileOutputS;
          }
          Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: "+e5.getMessage());
          ry7.f(i);
          StrictMode.setThreadPolicy(threadPolicy);
          return false;
       }catch(java.io.IOException e5){
       }
    }
    public static Animator k(Context p0,Resources p1,Resources$Theme p2,XmlResourceParser p3,AttributeSet p4,AnimatorSet p5,int p6){
       int i4;
       ObjectAnimator objectAnimat1;
       int eventType;
       AttributeSet uAttributeSe1;
       String str3;
       Keyframe keyframe;
       int i8;
       ArrayList uArrayList2;
       float fraction;
       float f1;
       int i10;
       int i11;
       PropertyValuesHolder propertyValu;
       PropertyValuesHolder[] propertyValu1;
       Resources resources = p1;
       Resources$Theme theme = p2;
       XmlPullParser xmlPullParse = p3;
       AnimatorSet uAnimatorSet = p5;
       int depth = p3.getDepth();
       ObjectAnimator objectAnimat = null;
       ArrayList uArrayList = null;
       while (true) {
          int i = p3.next();
          int i1 = 3;
          int i2 = 0;
          if (i != i1 || p3.getDepth() > depth) {
             int i3 = 1;
             if (i != i3) {
                i4 = 2;
                if (i != i4) {
                   continue ;
                }else {
                   String name = p3.getName();
                   if (name.equals("objectAnimator")) {
                      objectAnimat1 = new ObjectAnimator();
                      ry7.N(p0, p1, p2, p4, objectAnimat1, p3);
                   label_005a :
                      objectAnimat = objectAnimat1;
                   }else if(name.equals("animator")){
                      objectAnimat1 = ry7.N(p0, p1, p2, p4, null, p3);
                      goto label_005a ;
                   }else if(name.equals("set")){
                      AnimatorSet uAnimatorSet1 = new AnimatorSet();
                      TypedArray typedArray = ej4.h0(resources, theme, p4, tu6.y);
                      int i5 = ej4.L(typedArray, xmlPullParse, "ordering", i2, i2);
                      TypedArray typedArray1 = typedArray;
                      ry7.k(p0, p1, p2, p3, p4, uAnimatorSet1, i5);
                      typedArray1.recycle();
                      objectAnimat = uAnimatorSet1;
                   }else {
                      String str = "propertyValuesHolder";
                      if (name.equals(str)) {
                         AttributeSet uAttributeSe = Xml.asAttributeSet(p3);
                         ArrayList uArrayList1 = null;
                         while ((eventType = p3.getEventType()) != i1 && eventType != i3) {
                            if (eventType != i4) {
                               p3.next();
                            }else if(p3.getName().equals(str)){
                               TypedArray typedArray2 = ej4.h0(resources, theme, uAttributeSe, tu6.z);
                               String str1 = ej4.M(typedArray2, xmlPullParse, "propertyName", i1);
                               i2 = ej4.L(typedArray2, xmlPullParse, "valueType", i4, 4);
                               i4 = i2;
                               int i6 = 0;
                               while (true) {
                                  i3 = p3.next();
                                  uAttributeSe1 = uAttributeSe;
                                  if (i3 != i1 && i3 != 1) {
                                     if (p3.getName().equals("keyframe")) {
                                        int[] a = tu6.A;
                                        String str2 = "value";
                                        if (i4 == 4) {
                                           TypedArray typedArray3 = ej4.h0(resources, theme, Xml.asAttributeSet(p3), a);
                                           TypedValue typedValue = (!ej4.R(xmlPullParse, str2))? null: typedArray3.peekValue(0);
                                           int i7 = (typedValue != null)? 1: 0;
                                           i4 = (i7 && ry7.K(typedValue.type))? 3: 0;
                                           typedArray3.recycle();
                                        }
                                        TypedArray typedArray4 = ej4.h0(resources, theme, Xml.asAttributeSet(p3), a);
                                        str3 = str;
                                        float f = ej4.K(typedArray4, xmlPullParse, "fraction", 3, 0xbf800000);
                                        TypedValue typedValue1 = (!ej4.R(xmlPullParse, str2))? null: typedArray4.peekValue(0);
                                        str = (typedValue1 != null)? 1: 0;
                                        if (i4 == 4) {
                                           typedValue1 = (str && ry7.K(typedValue1.type))? 3: 0;
                                        }else {
                                           i8 = i4;
                                        }
                                        if (str) {
                                           if (typedValue1) {
                                              keyframe = (typedValue1 != 1 && typedValue1 != 3)? null: Keyframe.ofInt(f, ej4.L(typedArray4, xmlPullParse, str2, 0, 0));
                                           }else {
                                              keyframe = Keyframe.ofFloat(f, ej4.K(typedArray4, xmlPullParse, str2, 0, 0));
                                           }
                                        }else if(!typedValue1){
                                           keyframe = Keyframe.ofFloat(f);
                                        }else {
                                           keyframe = Keyframe.ofInt(f);
                                        }
                                        i8 = (!ej4.R(xmlPullParse, "interpolator"))? 0: typedArray4.getResourceId(1, 0);
                                        Context uContext = p0;
                                        if (i8 > 0) {
                                           keyframe.setInterpolator(AnimationUtils.loadInterpolator(uContext, i8));
                                        }
                                        typedArray4.recycle();
                                        uArrayList2 = i6;
                                        if (keyframe != null) {
                                           if (!uArrayList2) {
                                              uArrayList2 = new ArrayList();
                                           }
                                           uArrayList2.add(keyframe);
                                           i6 = uArrayList2;
                                        }
                                        p3.next();
                                     }else {
                                        str3 = str;
                                        uArrayList2 = i6;
                                     }
                                     resources = p1;
                                     theme = p2;
                                     uAttributeSe = uAttributeSe1;
                                     str = str3;
                                     i1 = 3;
                                  }else {
                                     break ;
                                  }
                               }
                               str3 = str;
                               if ((uArrayList2 = i6) != null && (i1 = uArrayList2.size()) > 0) {
                                  Keyframe keyframe1 = uArrayList2.get(0);
                                  int i9 = i1 - 1;
                                  Keyframe keyframe2 = uArrayList2.get(i9);
                                  fraction = keyframe2.getFraction();
                                  f1 = 0x3f800000;
                                  if ((fraction - f1) < 0) {
                                     if ((fraction) < 0) {
                                        keyframe2.setFraction(f1);
                                     }else {
                                        uArrayList2.add(uArrayList2.size(), ry7.l(keyframe2, f1));
                                        i1 = i1 + 1;
                                     }
                                  }
                                  float fraction1 = keyframe1.getFraction();
                                  fraction = 0;
                                  if (fraction - fraction1) {
                                     if ((fraction1 - fraction) < 0) {
                                        keyframe1.setFraction(fraction);
                                     }else {
                                        uArrayList2.add(0, ry7.l(keyframe1, fraction));
                                        i1 = i1 + 1;
                                     }
                                  }
                                  Keyframe[] keyframeArra = new Keyframe[i1];
                                  uArrayList2.toArray(keyframeArra);
                                  i = 0;
                                  while (i < i1) {
                                     object oobject = keyframeArra[i];
                                     f1 = 0;
                                     if ((oobject.getFraction() - f1) < 0) {
                                        if (!i) {
                                           oobject.setFraction(f1);
                                        }else {
                                           i3 = i1 - 1;
                                           if (i == i3) {
                                              oobject.setFraction(0x3f800000);
                                           }else {
                                              i8 = i + 1;
                                              int i12 = i;
                                              while (true) {
                                                 if (i8 < i3) {
                                                    if ((0 - keyframeArra[i8].getFraction()) >= 0) {
                                                    label_025a :
                                                       f1 = (keyframeArra[(i12 + 1)].getFraction() - keyframeArra[(i - 1)].getFraction()) / (float)((i12 - i) + 2);
                                                       i8 = i;
                                                       while (true) {
                                                          i10 = i1;
                                                          if (i8 <= i12) {
                                                             int i13 = i8 - 1;
                                                             fraction = keyframeArra[i13].getFraction() + f1;
                                                             keyframeArra[i8].setFraction(fraction);
                                                             i8 = i8 + 1;
                                                             i1 = i10;
                                                             i12 = i12;
                                                          }else {
                                                             break ;
                                                          }
                                                       }
                                                       i = i + 1;
                                                       i1 = i10;
                                                       f1 = 0x3f800000;
                                                    }else {
                                                       i12 = i8 + 1;
                                                       int i14 = i12;
                                                       i12 = i8;
                                                       i8 = i14;
                                                    }
                                                 }else {
                                                    i11 = 0;
                                                    goto label_025a ;
                                                 }
                                              }
                                           }
                                        }
                                     }
                                     i10 = i1;
                                     i11 = 0;
                                  }
                                  propertyValu = PropertyValuesHolder.ofKeyframe(str1, keyframeArra);
                                  i1 = 3;
                                  if (i4 == i1) {
                                     propertyValu.setEvaluator(dk.a);
                                  }
                               }else {
                                  i1 = 3;
                                  propertyValu = null;
                               }
                               i3 = 0;
                               i4 = 1;
                               if (propertyValu == null) {
                                  propertyValu = ry7.B(typedArray2, i2, i3, i4, str1);
                               }
                               if (propertyValu != null) {
                                  if (uArrayList1 == null) {
                                     uArrayList1 = new ArrayList();
                                  }
                                  uArrayList1.add(propertyValu);
                               }
                               typedArray2.recycle();
                            }else {
                               uAttributeSe1 = uAttributeSe;
                               str3 = str;
                               int i15 = 2;
                            }
                            p3.next();
                            resources = p1;
                            theme = p2;
                            uAttributeSe = uAttributeSe1;
                            str = str3;
                            f1 = 1;
                            i4 = 2;
                            i2 = 0;
                            continue ;
                         }
                         if (uArrayList1 != null) {
                            i = uArrayList1.size();
                            propertyValu1 = new PropertyValuesHolder[i];
                            for (i2 = 0; i2 < i; i2 = i2 + 1) {
                               propertyValu1[i2] = uArrayList1.get(i2);
                            }
                         }else {
                            propertyValu1 = null;
                         }
                         if (propertyValu1 != null && objectAnimat instanceof ValueAnimator) {
                            objectAnimat.setValues(propertyValu1);
                         }
                         i2 = 1;
                      }else {
                         throw new RuntimeException("Unknown animator name: "+p3.getName());
                      }
                   }
                   if (uAnimatorSet && !i2) {
                      if (uArrayList == null) {
                         uArrayList = new ArrayList();
                      }
                      uArrayList.add(objectAnimat);
                   }
                   resources = p1;
                   theme = p2;
                }
             }
          }
          if (uAnimatorSet && uArrayList != null) {
             Animator[] uAnimatorArr = new Animator[uArrayList.size()];
             Iterator iterator = uArrayList.iterator();
             i2 = 0;
             while (iterator.hasNext()) {
                i4 = i2 + 1;
                uAnimatorArr[i2] = iterator.next();
                i2 = i4;
             }
             if (!p6) {
                uAnimatorSet.playTogether(uAnimatorArr);
             }else {
                uAnimatorSet.playSequentially(uAnimatorArr);
             }
          }
          break ;
       }
       return objectAnimat;
    }
    public static Keyframe l(Keyframe p0,float p1){
       if (p0.getType() == Float.TYPE) {
          p0 = Keyframe.ofFloat(p1);
       }else if(p0.getType() == Integer.TYPE){
          p0 = Keyframe.ofInt(p1);
       }else {
          p0 = Keyframe.ofObject(p1);
       }
       return p0;
    }
    public static final m26 m(me4 p0){
       v26 ov26;
       ej7 uoej7;
       String str;
       m26 om26;
       q26 value;
       p26 c;
       p26 c1;
       i01 a = p0.a;
       if ((ov26 = a.get(ry7.I)) == null) {
          throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
       }
       if ((uoej7 = a.get(ry7.J)) == null) {
          throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
       }
       Bundle uBundle = a.get(ry7.K);
       if ((str = a.get(fv1.A)) == null) {
          throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
       }
       s26 os26 = ov26.getSavedStateRegistry().b();
       if (os26 instanceof p26) {
       }else {
          os26 = null;
       }
       if (os26 != null) {
          q26 t = ry7.E(uoej7).t;
          if ((om26 = t.get(str)) == null) {
             boolean b = true;
             if (os26.b == null) {
                os26.c = os26.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                os26.b = b;
                value = os26.d.getValue();
             }
             Bundle bundle = ((c = os26.c) != null)? c.getBundle(str): null;
             if ((c1 = os26.c) != null) {
                c1.remove(str);
             }
             if ((c1 = os26.c) == null || c1.isEmpty() != b) {
                b = false;
             }
             if (b) {
                os26.c = null;
             }
             om26 = gg1.v(bundle, uBundle);
             t.put(str, om26);
          }
          return om26;
       }else {
          throw new IllegalStateException("enableSavedStateHandles\(\) wasn\'t called prior to createSavedStateHandle\(\) call");
       }
    }
    public static boolean n(File p0){
       File[] uFileArray;
       if (p0.isDirectory()) {
          if ((uFileArray = p0.listFiles()) == null) {
             return false;
          }
          int len = uFileArray.length;
          int i = 0;
          boolean b = true;
          while (i < len) {
             b = (ry7.n(uFileArray[i]) && b)? true: false;
             i = i + 1;
          }
          return b;
       }else {
          p0.delete();
          return true;
       }
    }
    public static final void o(v26 p0){
       uj3 ouj3;
       co5.o(p0, "<this>");
       p26 op26 = ((ouj3 = p0.getLifecycle().b()) != uj3.b && ouj3 != uj3.c)? 0: 1;
       if (ouj3) {
          if (p0.getSavedStateRegistry().b() == null) {
             op26 = new p26(p0.getSavedStateRegistry(), p0);
             p0.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", op26);
             p0.getLifecycle().a(new SavedStateHandleAttacher(op26));
          }
          return;
       }else {
          throw new IllegalArgumentException("Failed requirement.".toString());
       }
    }
    public static boolean p(Bundle p0,Bundle p1){
       if (p0 == p1) {
          return true;
       }
       if (p0 == null || p1 == null) {
          return false;
       }
       if (p0.size() != p1.size()) {
          return false;
       }
       Set set = p0.keySet();
       if (!set.equals(p1.keySet())) {
          return false;
       }
       Iterator iterator = set.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          String str = iterator.next();
          Object obj = p0.get(str);
          Object obj1 = p1.get(str);
          if (obj != obj1) {
             if (obj != null && obj1 != null) {
                if (!obj.getClass().equals(obj1.getClass())) {
                   return false;
                }else if(obj instanceof Bundle && !ry7.p(obj, obj1)){
                   return false;
                }else if(!io2.j(obj, obj1)){
                }
             }
             break ;
          }
       }
       return false;
    }
    public static View q(View p0,int p1){
       View view;
       if (!p0 instanceof ViewGroup) {
          return null;
       }
       int childCount = p0.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return null;
          }
          if ((view = p0.getChildAt(i).findViewById(p1)) != null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return view;
    }
    public static Object r(Object p0,Object p1){
       if (p0 != null) {
          return p0;
       }
       if (p1 != null) {
          return p1;
       }
       throw new NullPointerException("Both parameters are null");
    }
    public static void s(Object p0){
       Class t;
       Field declaredFiel;
       if (!ry7.v) {
          try{
             ry7.t = Class.forName("android.content.res.ThemedResourceCache");
          }catch(java.lang.ClassNotFoundException e0){
             Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e0);
          }
          ry7.v = true;
       }
       if ((t = ry7.t) == null) {
          return;
       }else if(!ry7.x){
          try{
             declaredFiel = t.getDeclaredField("mUnthemedEntries");
             ry7.w = declaredFiel;
             declaredFiel.setAccessible(true);
          }catch(java.lang.NoSuchFieldException e0){
             Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e0);
          }
          ry7.x = true;
       }
       if ((declaredFiel = ry7.w) == null) {
          return;
       }else {
          try{
             p0 = declaredFiel.get(p0);
          }catch(java.lang.IllegalAccessException e4){
             Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
             p0 = null;
          }
          if (p0 != null) {
             yw5.a(p0);
          }
          return;
       }
    }
    public static g20 t(mo p0){
       int i;
       if (!(i = p0.ordinal())) {
          return g20.b;
       }
       if (i == 1) {
          return g20.c;
       }
       if (i == 2) {
          return g20.t;
       }
       if (i == 3) {
          return g20.v;
       }
       throw new IllegalStateException("Unknown audio quality "+p0);
    }
    public static int u(Context p0){
       TypedValue typedValue = new TypedValue();
       if (!p0.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
          return 0;
       }
       return TypedValue.complexToDimensionPixelSize(typedValue.data, p0.getResources().getDisplayMetrics());
    }
    public static final int v(Bitmap p0){
       int allocationBy;
       Bitmap$Config config;
       int i = 1;
       if (!((p0.isRecycled() ^ i))) {
          throw new IllegalStateException("Cannot obtain size for recycled bitmap: "+p0+" ["+p0.getWidth()+" x "+p0.getHeight()+"] + "+p0.getConfig().toString());
       }
       try{
          allocationBy = p0.getAllocationByteCount();
       label_003d :
          return allocationBy;
       }catch(java.lang.Exception e0){
          int i1 = allocationBy.getHeight() * allocationBy.getWidth();
          if ((config = allocationBy.getConfig()) != Bitmap$Config.ALPHA_8) {
             if (config == Bitmap$Config.RGB_565 || config == Bitmap$Config.ARGB_4444) {
                i = 2;
             }else if(Build$VERSION.SDK_INT >= 26 && config == p3.h()){
                i = 8;
             }else {
                i = 4;
             }
          }
          allocationBy = i1 * i;
          goto label_003d ;
       }
    }
    public static int w(View p0,int p1){
       return ox7.G(p1, p0.getContext(), p0.getClass().getCanonicalName());
    }
    public static ColorStateList x(Context p0,TypedArray p1,int p2){
       int resourceId;
       ColorStateList uColorStateL;
       if (p1.hasValue(p2) && ((resourceId = p1.getResourceId(p2, 0)) && (uColorStateL = n6.c(p0, resourceId)) != null)) {
          return uColorStateL;
       }
       return p1.getColorStateList(p2);
    }
    public static ColorStateList y(Context p0,p86 p1,int p2){
       int i;
       ColorStateList uColorStateL;
       if (p1.l(p2) && ((i = p1.i(p2, 0)) && (uColorStateL = n6.c(p0, i)) != null)) {
          return uColorStateL;
       }
       return p1.b(p2);
    }
    public static Drawable z(Context p0,TypedArray p1,int p2){
       int resourceId;
       Drawable uDrawable;
       if (p1.hasValue(p2) && ((resourceId = p1.getResourceId(p2, 0)) && (uDrawable = eb3.m(p0, resourceId)) != null)) {
          return uDrawable;
       }
       return p1.getDrawable(p2);
    }
    public abstract void O(uo7 p0,uo7 p1,uo7 p2,uo7 p3);
    public abstract List c(String p0,List p1);
}
