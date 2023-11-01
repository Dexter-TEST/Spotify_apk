package p.eb3;
import p.w54;
import p.au0;
import p.c65;
import p.ps3;
import p.bx6;
import java.lang.String;
import p.ry1;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import p.ce1;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.view.View;
import java.lang.CharSequence;
import android.os.Build$VERSION;
import p.q67;
import p.s67;
import android.text.TextUtils;
import android.view.View$OnLongClickListener;
import android.view.View$OnHoverListener;
import p.d46;
import p.ng2;
import p.eo5;
import p.ul0;
import java.lang.Throwable;
import p.dx0;
import p.ve3;
import p.ox7;
import p.a93;
import p.ib3;
import p.gb3;
import p.co5;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.tx5;
import android.content.Context;
import android.content.res.TypedArray;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.yf2;
import p.jl1;
import p.zv6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import p.ww4;
import p.e;
import p.di2;
import p.xt;
import java.lang.Class;
import p.ei2;
import p.pv;
import p.kt;
import java.lang.NullPointerException;
import java.lang.IllegalStateException;
import p.c57;
import p.xr7;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Modifier;
import java.lang.UnsupportedOperationException;
import android.os.Process;
import p.mj;
import android.content.pm.PackageManager;
import p.yo4;
import android.app.AppOpsManager;
import p.nj;
import android.os.Binder;
import android.graphics.drawable.InsetDrawable;
import p.be1;
import p.vr7;
import p.wr7;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import java.io.Closeable;
import p.io2;
import p.tp2;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import p.a23;
import p.au2;
import androidx.fragment.app.Fragment;
import p.uf0;
import p.wf2;
import p.yi7;
import p.if2;
import p.ac1;
import p.m95;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import p.i51;
import p.c42;
import android.text.Spanned;
import p.k11;
import android.text.Html;
import p.sz1;
import p.kg4;
import p.mw5;
import p.de1;
import java.lang.reflect.Method;
import java.lang.reflect.AccessibleObject;
import com.google.common.collect.c;
import p.ys5;
import java.lang.Iterable;
import p.dj0;
import java.util.Collection;
import java.util.Map;
import p.m73;
import p.dt5;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map$Entry;
import android.view.MotionEvent;
import android.animation.AnimatorSet;
import android.animation.Animator;
import java.lang.Math;
import android.animation.ValueAnimator;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.zip.Inflater;
import android.os.Bundle;
import androidx.fragment.app.o;

public abstract class eb3 implements w54	// class@001454 from classes.dex
{
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final ry1 E;
    public static final au0[] a;
    public static final c65 b;
    public static final ps3 c;
    public static Method t;
    public static boolean v;
    public static Method w;
    public static boolean x;
    public static final bx6 y;
    public static final ps3 z;

    static {
       au0[] uoau0Array = new au0[0];
       eb3.a = uoau0Array;
       eb3.b = new c65(24);
       eb3.c = new ps3(17);
       eb3.y = new bx6("CONDITION_FALSE");
       eb3.z = new ps3(16);
       eb3.A = new int[3]{0x7f0302dc,0x7f0302e2,0x7f0302e6};
       int[] ointArray = new int[]{0x1010003};
       eb3.B = ointArray;
       ointArray = new int[]{0x1010003};
       eb3.C = ointArray;
       int[] ointArray1 = new int[]{0x7f0301bd};
       eb3.D = ointArray1;
       eb3.E = new ry1(3);
    }
    public void eb3(){
       super();
    }
    public static void A(Drawable p0,int p1){
       ce1.g(p0, p1);
    }
    public static void B(Drawable p0,ColorStateList p1){
       ce1.h(p0, p1);
    }
    public static void C(Drawable p0,PorterDuff$Mode p1){
       ce1.i(p0, p1);
    }
    public static void D(View p0,CharSequence p1){
       s67 b;
       s67 c;
       if (Build$VERSION.SDK_INT >= 26) {
          q67.a(p0, p1);
       }else if((b = s67.B) != null && b.a == p0){
          s67.b(null);
       }
       if (TextUtils.isEmpty(p1)) {
          if ((c = s67.C) != null && c.a == p0) {
             c.a();
          }
          p0.setOnLongClickListener(null);
          p0.setLongClickable(false);
          p0.setOnHoverListener(null);
       }else {
          b = new s67(p0, p1);
       }
       return;
    }
    public static final Object E(d46 p0,d46 p1,ng2 p2){
       a93 a1;
       eo5.f(p2);
       p1 = p2.b(p1, p0);
       dx0 a = dx0.a;
       if (p1 != a && (p0 = p0.B(p1)) != ox7.w) {
          if (!p0 instanceof ul0) {
             p1 = (p0 instanceof a93)? p0: null;
             if (p1 != null && (a1 = p1.a) != null) {
                a = a1;
             }else {
                a = p0;
             }
          }else {
             throw p0.a;
          }
       }
       return a;
    }
    public static final gb3 F(ib3 p0,int p1){
       co5.o(p0, "<this>");
       int i = (p1 > 0)? 1: 0;
       Integer integer = Integer.valueOf(p1);
       co5.o(integer, "step");
       if (i) {
          if (p0.c <= null) {
             p1 = - p1;
          }
          return new gb3(p0.a, p0.b, p1);
       }else {
          throw new IllegalArgumentException("Step must be positive, was: "+integer+'.');
       }
    }
    public static final void G(Object p0){
       if (!p0 instanceof tx5) {
          return;
       }
       throw p0.a;
    }
    public static int H(Context p0,int p1){
       int[] ointArray = new int[]{p1};
       TypedArray typedArray = p0.obtainStyledAttributes(0x1030001, ointArray);
       typedArray.recycle();
       return typedArray.getResourceId(0, -1);
    }
    public static boolean I(ObservableSource p0,Observer p1,yf2 p2){
       jl1 a = jl1.a;
       if (!p0 instanceof zv6) {
          return false;
       }
       if ((p0 = p0.get()) == null) {
          p1.onSubscribe(a);
          p1.onComplete();
          return true;
       }else {
          p0 = p2.apply(p0);
          Objects.requireNonNull(p0, "The mapper returned a null ObservableSource");
          if (p0 instanceof zv6) {
             if ((p0 = p0.get()) == null) {
                p1.onSubscribe(a);
                p1.onComplete();
                return true;
             }else {
                ww4 oww4 = new ww4(p1, p0);
                p1.onSubscribe(oww4);
                oww4.run();
             }
          }else {
             p0.subscribe(p1);
          }
          return true;
       }
    }
    public static final ib3 J(int p0,int p1){
       if (p1 <= Integer.MIN_VALUE) {
          return ib3.t;
       }
       p1--;
       return new ib3(p0, p1);
    }
    public static xt K(e p0,di2 p1){
       p1.getClass();
       int i = ((p1 = p1.a) != ei2.a)? 1: 0;
       if (i) {
          p0.getClass();
          pv opv = new pv(p0);
          if (p1 != null) {
             opv.a = p1;
             return xt.d(opv.b());
          }else {
             throw new NullPointerException("Null gender");
          }
       }else {
          throw new IllegalStateException();
       }
    }
    public static Drawable L(Drawable p0){
       if (Build$VERSION.SDK_INT >= 23) {
          return p0;
       }
       if (!p0 instanceof c57) {
          return new xr7(p0);
       }
       return p0;
    }
    public static void M(ByteArrayOutputStream p0,long p1,int p2){
       byte[] uobyteArray = new byte[p2];
       for (int i = 0; i < p2; i = i + 1) {
          int i1 = i * 8;
          long l = p1 >> i1;
          l = l & 255;
          uobyteArray[i] = (byte)(int)l;
       }
       p0.write(uobyteArray);
       return;
    }
    public static void N(ByteArrayOutputStream p0,int p1){
       eb3.M(p0, (long)p1, 2);
    }
    public static void a(Class p0){
       int modifiers = p0.getModifiers();
       if (Modifier.isInterface(modifiers)) {
          throw new UnsupportedOperationException("Interface can\'t be instantiated! Interface name: ".concat(p0.getName()));
       }
       if (!Modifier.isAbstract(modifiers)) {
          return;
       }
       throw new UnsupportedOperationException("Abstract class can\'t be instantiated! Class name: ".concat(p0.getName()));
    }
    public static int b(Context p0,String p1){
       int sDK_INT;
       String[] packagesForU;
       int i3;
       int i = Process.myUid();
       String packageName = p0.getPackageName();
       int i1 = -1;
       if (p0.checkPermission(p1, Process.myPid(), i) == i1) {
       }else if((sDK_INT = Build$VERSION.SDK_INT) >= 23){
          p1 = mj.d(p1);
       }else {
          p1 = null;
       }
       if (p1 != null) {
          if (packageName == null) {
             if ((packagesForU = p0.getPackageManager().getPackagesForUid(i)) != null && packagesForU.length > 0) {
                packageName = packagesForU[0];
             }
          }
          String packageName1 = p0.getPackageName();
          int i2 = 1;
          i1 = (Process.myUid() == i && yo4.a(packageName1, packageName))? 1: 0;
          if (i1) {
             if (sDK_INT >= 29) {
                AppOpsManager uAppOpsManag = nj.c(p0);
                if (i3 = nj.a(uAppOpsManag, p1, Binder.getCallingUid(), packageName)) {
                label_0085 :
                   if (i3) {
                      i1 = -2;
                   }
                }else {
                   i3 = nj.a(uAppOpsManag, p1, i, nj.b(p0));
                   goto label_0085 ;
                }
             }else if(sDK_INT >= 23){
                i2 = mj.c(mj.a(p0, AppOpsManager.class), p1, packageName);
             }
          }else if(sDK_INT >= 23){
             i2 = mj.c(mj.a(p0, AppOpsManager.class), p1, packageName);
          }
          i3 = i2;
          goto label_0085 ;
       }
       i1 = 0;
       return i1;
    }
    public static void c(Drawable p0){
       DrawableContainer$DrawableContainerState constantStat;
       Drawable uDrawable;
       if (Build$VERSION.SDK_INT >= 23) {
          p0.clearColorFilter();
       }else {
          p0.clearColorFilter();
          if (p0 instanceof InsetDrawable) {
             eb3.c(be1.c(p0));
          }else if(p0 instanceof vr7){
             eb3.c(p0.w);
          }else if(p0 instanceof DrawableContainer && (constantStat = p0.getConstantState()) != null){
             int childCount = constantStat.getChildCount();
             int i = 0;
             while (i < childCount) {
                if ((uDrawable = be1.b(constantStat, i)) != null) {
                   eb3.c(uDrawable);
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public static final void d(Closeable p0,Throwable p1){
       if (p0 != null) {
          if (p1 == null) {
             p0.close();
          }else {
             p0.close();
          }
       }
       return;
    }
    public static final long e(long p0,long p1,long p2){
       if ((p1 - p2) > 0) {
          throw new IllegalArgumentException(tp2.o("Cannot coerce value to an empty range: maximum "+p2+" is less than minimum ", p1, '.'));
       }
       if ((p0 - p1) < 0) {
          return p1;
       }
       if ((p0 - p2) > 0) {
          return p2;
       }
       return p0;
    }
    public static byte[] f(byte[] p0){
       Deflater uDeflater = new Deflater(1);
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       DeflaterOutputStream uDeflaterOut = new DeflaterOutputStream(uByteArrayOu, uDeflater);
       uDeflaterOut.write(p0);
       uDeflaterOut.close();
       uDeflater.end();
       return uByteArrayOu.toByteArray();
    }
    public static final boolean g(a23 p0,String p1,Object p2){
       co5.o(p0, "bundle");
       return io2.j(p2, p0.u(p1));
    }
    public static final tx5 h(Throwable p0){
       co5.o(p0, "exception");
       return new tx5(p0);
    }
    public static final yi7 i(Fragment p0,uf0 p1,wf2 p2,wf2 p3){
       co5.o(p0, "<this>");
       return new yi7(p1, p2, p3, new if2(p0, 0));
    }
    public static final void j(ac1 p0,m95 p1){
       try{
          Iterator iterator = p0.g(p1).iterator();
          void ovoid = null;
          while (iterator.hasNext()) {
             m95 om95 = iterator.next();
             try{
                if (p0.h(om95).c != null) {
                   eb3.j(p0, om95);
                }
                p0.d(om95);
             }catch(java.io.IOException e1){
                if (!ovoid) {
                   ovoid = e1;
                }else {
                }
             }
          }
          if (!ovoid) {
             return;
          }
          throw ovoid;
       }catch(java.io.FileNotFoundException e0){
          return;
       }
    }
    public static Spanned k(String p0){
       if (Build$VERSION.SDK_INT >= 24) {
          return k11.j(p0);
       }
       return Html.fromHtml(p0);
    }
    public static final String l(){
       Object[] objArray = new Object[]{sz1.p};
       return kg4.q(objArray, 1, "m.%s", "java.lang.String.format\(format, *args\)");
    }
    public static Drawable m(Context p0,int p1){
       return mw5.d().g(p0, p1);
    }
    public static final String n(){
       Object[] objArray = new Object[]{sz1.o};
       return kg4.q(objArray, 1, "m.%s", "java.lang.String.format\(format, *args\)");
    }
    public static int o(Drawable p0){
       Method w;
       if (Build$VERSION.SDK_INT >= 23) {
          return de1.a(p0);
       }
       if (!eb3.x) {
          boolean b = true;
          try{
             Class[] uClassArray = new Class[0];
             Method declaredMeth = Drawable.class.getDeclaredMethod("getLayoutDirection", uClassArray);
             eb3.w = declaredMeth;
             declaredMeth.setAccessible(b);
             eb3.x = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
       if ((w = eb3.w) != null) {
          try{
             Object[] objArray = new Object[0];
             return w.invoke(p0, objArray).intValue();
          }catch(java.lang.Exception e0){
             eb3.w = null;
          }
          return v1;
       }else {
       }
    }
    public static final c p(List p0){
       ys5 v;
       if (p0 == null) {
          v = ys5.v;
          co5.l(v, "of\(\)");
       }else if(p0 instanceof c){
       }else {
          v = c.o(dj0.i0(p0));
          co5.l(v, "copyOf\(other.filterNotNull\(\)\)");
       }
       return v;
    }
    public static final m73 q(Map p0){
       dt5 x;
       if (p0 == null) {
          x = dt5.x;
       }else if(p0 instanceof m73){
          x = m73.b(p0);
       }else {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             int i = (uEntry.getKey() != null && uEntry.getValue() != null)? 1: 0;
             if (i) {
                linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
             }
          }
          x = m73.b(linkedHashMa);
       }
       return x;
    }
    public static boolean r(MotionEvent p0,int p1){
       boolean b = (((p0.getSource() & p1)) == p1)? true: false;
       return b;
    }
    public static void t(AnimatorSet p0,ArrayList p1){
       int i = p1.size();
       long l = 0;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          Animator uAnimator = p1.get(i1);
          long l1 = uAnimator.getDuration() + uAnimator.getStartDelay();
          l = Math.max(l, l1);
       }
       ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[2]{0,0});
       valueAnimato.setDuration(l);
       p1.add(0, valueAnimato);
       p0.playTogether(p1);
       return;
    }
    public static byte[] u(int p0,InputStream p1){
       byte[] uobyteArray = new byte[p0];
       int i = 0;
       while (true) {
          if (i >= p0) {
             return uobyteArray;
          }
          int i1 = p0 - i;
          if ((i1 = p1.read(uobyteArray, i, i1)) >= 0) {
             i = i + i1;
          }else {
             break ;
          }
       }
       throw new IllegalStateException(tp2.k("Not enough bytes to read: ", p0));
    }
    public static byte[] v(FileInputStream p0,int p1,int p2){
       int i2;
       Inflater inflater = new Inflater();
       byte[] uobyteArray = new byte[p2];
       byte[] uobyteArray1 = new byte[2048];
       int i = 0;
       int i1 = 0;
       while (true) {
          if (!inflater.finished() && (!inflater.needsDictionary() && i < p1)) {
             if ((i2 = p0.read(uobyteArray1)) >= 0) {
                inflater.setInput(uobyteArray1, 0, i2);
                try{
                   int i3 = p2 - i1;
                   i1 = i1 + inflater.inflate(uobyteArray, i1, i3);
                   i = i + i2;
                }catch(java.util.zip.DataFormatException e8){
                   throw new IllegalStateException(e8.getMessage());
                }
             }else {
                break ;
             }
          }else if(i == p1){
             if (!inflater.finished()) {
                throw new IllegalStateException("Inflater did not finish");
             }
             inflater.end();
             return uobyteArray;
          }else {
             throw new IllegalStateException("Didn\'t read enough bytes during decompression. expected="+p1+" actual="+i);
          }
       }
       throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "+p1+" bytes");
    }
    public static long w(int p0,InputStream p1){
       byte[] uobyteArray = eb3.u(p0, p1);
       long l = 0;
       for (int i = 0; i < p0; i = i + 1) {
          int i1 = uobyteArray[i] & 0x00ff;
          int i2 = i * 8;
          long l1 = (long)i1 << i2;
          l = l + l1;
       }
       return l;
    }
    public static int x(InputStream p0){
       return (int)eb3.w(2, p0);
    }
    public static final void y(Bundle p0,Fragment p1){
       co5.o(p1, "<this>");
       p1.getParentFragmentManager().Z(p0, "ALLBOARDING_SCREEN_RESPONSE");
    }
    public static boolean z(Drawable p0,int p1){
       Method declaredMeth;
       if (Build$VERSION.SDK_INT >= 23) {
          return de1.b(p0, p1);
       }
       if (!eb3.v) {
          try{
             Class[] uClassArray = new Class[]{Integer.TYPE};
             declaredMeth = Drawable.class.getDeclaredMethod("setLayoutDirection", uClassArray);
             eb3.t = declaredMeth;
             declaredMeth.setAccessible(1);
             eb3.v = true;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
       if ((declaredMeth = eb3.t) != null) {
          try{
             Object[] objArray = new Object[]{Integer.valueOf(p1)};
             declaredMeth.invoke(p0, objArray);
             return 1;
          }catch(java.lang.Exception e0){
             eb3.t = null;
          }
          return v1;
       }else {
       }
    }
    public abstract Object s(Class p0);
}
