package p.tu6;
import p.w54;
import p.ik7;
import p.c65;
import p.ps3;
import java.lang.Object;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import android.graphics.Color;
import p.u10;
import java.security.PublicKey;
import java.lang.String;
import p.co5;
import java.security.Signature;
import p.oe0;
import java.nio.charset.Charset;
import android.util.Base64;
import java.lang.NullPointerException;
import android.view.View;
import android.animation.ObjectAnimator;
import p.uw3;
import android.animation.Animator;
import p.wf2;
import p.vv7;
import p.qz5;
import p.ju2;
import p.uu2;
import p.au2;
import p.r45;
import p.uw5;
import p.jk7;
import android.content.Context;
import p.sp6;
import com.spotify.legacyglue.icons.SpotifyIconView;
import p.mi;
import java.util.Map;
import p.dv2;
import p.du2;
import p.xz5;
import p.tu2;
import p.te5;
import p.jl;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.io2;
import android.widget.TextView;
import p.eo5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import p.m81;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.lang.Runtime;
import java.lang.Thread;
import p.yw1;
import java.lang.Runnable;
import io.reactivex.rxjava3.core.Observer;
import android.os.Looper;
import p.m5;
import p.et0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.ge6;
import java.lang.Boolean;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.BaseBundle;
import android.os.Bundle;
import android.content.res.Resources;
import p.zl0;
import p.qt;
import java.lang.Class;
import p.kq0;
import p.uf;
import p.vw3;
import p.v10;
import androidx.fragment.app.Fragment;
import p.lg4;
import androidx.navigation.fragment.NavHostFragment;
import androidx.fragment.app.o;
import p.lv1;
import androidx.fragment.app.f;
import android.view.Window;
import android.app.Dialog;
import p.li5;
import p.oi2;
import java.lang.IllegalArgumentException;
import android.util.AttributeSet;
import p.lp6;
import p.xj0;
import java.lang.Math;
import p.lj0;
import java.lang.reflect.Method;
import java.util.Arrays;
import p.av6;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import java.security.spec.KeySpec;
import p.sz1;
import java.net.URL;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import p.ks5;
import java.util.concurrent.Executor;
import p.z05;
import java.util.concurrent.locks.Lock;
import android.graphics.drawable.StateListDrawable;
import p.n6;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import io.reactivex.rxjava3.core.Single;
import p.kx6;
import p.k12;
import p.if4;
import io.reactivex.rxjava3.core.SingleOnSubscribe;

public abstract class tu6 implements w54, ik7	// class@0027e6 from classes.dex
{
    public static final int[] A;
    public static final int[] B;
    public static boolean C;
    public static Boolean D;
    public static final c65 E;
    public static final int[] F;
    public static final char[] G;
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final int[] K;
    public static final int[] L;
    public static final ps3 M;
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] t;
    public static final int[] v;
    public static final int[] w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;

    static {
       tu6.a = new int[9]{0x1010003,0x1010121,0x1010155,0x1010159,0x101031f,0x10103ea,0x10103fb,0x1010402,0x1010403};
       tu6.b = new int[8]{0x1010003,0x10101b5,0x10101b6,0x1010324,0x1010325,0x1010326,0x101045a,0x101045b};
       tu6.c = new int[14]{0x1010003,0x1010404,0x1010405,0x1010406,0x1010407,0x1010408,0x1010409,0x101040a,0x101040b,0x101040c,0x101040d,0x10104cb,0x10104cc,0x101051e};
       tu6.t = new int[3]{0x1010003,0x1010405,0x101051e};
       int[] ointArray = new int[]{0x1010199};
       tu6.v = ointArray;
       tu6.w = new int[2]{0x1010003,0x10101cd};
       tu6.x = new int[8]{0x1010141,0x1010198,0x10101be,0x10101bf,0x10101c0,0x10102de,0x10102df,0x10102e0};
       int[] ointArray1 = new int[]{0x10102e2};
       tu6.y = ointArray1;
       tu6.z = new int[4]{0x10102de,0x10102df,0x10102e0,0x10102e1};
       tu6.A = new int[4]{0x1010024,0x1010141,0x10102e0,0x10104d8};
       tu6.B = new int[4]{0x10102e1,0x1010405,0x1010474,0x1010475};
       tu6.E = new c65(8);
       tu6.F = new int[33]{4,6,6,8,8,8,8,8,8,10,10,10,10,10,10,10,10,10,10,10,10,10,10,12,12,12,12,12,12,12,12,12,12};
       tu6.G = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       tu6.H = new int[8]{0x7f0301f5,0x7f0301f6,0x7f0301f7,0x7f0301f8,0x7f0301f9,0x7f0301fa,0x7f0301fb,0x7f0301fc};
       int[] ointArray2 = new int[]{0x10100a7};
       tu6.I = ointArray2;
       tu6.J = new int[2]{0x10100a1,0x10100a7};
       ointArray1 = new int[]{0x10100a1};
       tu6.K = ointArray1;
       tu6.L = new int[2]{0x101009e,0x10100a7};
       tu6.M = new ps3(12);
    }
    public void tu6(){
       super();
    }
    public static ColorStateList A(ColorStateList p0){
       int sDK_INT;
       int i = 0;
       if (p0 == null) {
          return ColorStateList.valueOf(i);
       }
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 22 && (sDK_INT <= 27 && !Color.alpha(p0.getDefaultColor()))) {
          Color.alpha(p0.getColorForState(tu6.L, i));
       }
       return p0;
    }
    public static boolean B(int[] p0){
       int i3;
       int len = p0.length;
       boolean b = false;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (i < len) {
          if ((i3 = p0[i]) == 0x101009e) {
             i1 = 1;
          }else if(i3 == 0x101009c || (i3 == 0x10100a7 || i3 == 0x1010367)){
             i2 = 1;
          }
          i = i + 1;
       }
       if (i1 && i2) {
          b = true;
       }
       return b;
    }
    public static u10 C(int p0,u10 p1){
       int i4;
       u10 ou10 = new u10();
       u10 b = p1.b;
       int i = (1 << p0) - 2;
       int i1 = 0;
       while (i1 < b) {
          int i2 = 0;
          int i3 = 0;
          while (i2 < p0) {
             if ((i4 = i1 + i2) >= b || p1.e(i4)) {
                i4 = p0 - 1;
                i4 = i4 - i2;
                i4 = 1 << i4;
                i3 = i3 | i4;
             }
             i2 = i2 + 1;
          }
          if ((i2 = i3 & i) == i) {
             ou10.c(i2, p0);
          }else if(!i2){
             i2 = i3 | 0x01;
             ou10.c(i2, p0);
          }else {
             ou10.c(i3, p0);
          label_003c :
             i1 = i1 + p0;
          }
          i1 = i1 - 1;
          goto label_003c ;
       }
       return ou10;
    }
    public static final boolean D(PublicKey p0,String p1,String p2){
       co5.o(p1, "data");
       String str = "signature";
       try{
          co5.o(p2, str);
          Signature instance = Signature.getInstance("SHA256withRSA");
          instance.initVerify(p0);
          byte[] bytes = p1.getBytes(oe0.a);
          co5.l(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
          instance.update(bytes);
          bytes = Base64.decode(p2, 8);
          co5.l(bytes, "decode\(signature, Base64.URL_SAFE\)");
          return instance.verify(bytes);
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public static void E(Object p0){
       if (p0 != null) {
          return;
       }
       throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    public static final ObjectAnimator d(View p0){
       co5.o(p0, "view");
       return tu6.e(p0);
    }
    public static ObjectAnimator e(View p0){
       co5.o(p0, "view");
       float[] uofloatArray = new float[]{p0.getAlpha(),0x3f800000};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "alpha", uofloatArray);
       objectAnimat.setDuration(100);
       vv7.E(objectAnimat, new uw3(p0, 0));
       return objectAnimat;
    }
    public static void f(qz5 p0,ju2 p1,uu2 p2){
       r45 or45 = uw5.s(p1.b().u("accessoryRightIcon"));
       if (or45.c()) {
          SpotifyIconView spotifyIconV = mi.k(p0.getView().getContext(), or45.b());
          if (p1.m().containsKey("rightAccessoryClick")) {
             dv2 uodv2 = new dv2(p2.c);
             uodv2.c("rightAccessoryClick");
             uodv2.g(p1);
             uodv2.f(spotifyIconV);
             uodv2.d();
          }
          p0.d(spotifyIconV);
       }else {
          p0.d(null);
       }
       return;
    }
    public static void g(xz5 p0,ju2 p1){
       String str = p1.y().d();
       jl.h((te5.a(str) ^ 0x01), "title is missing");
       p0.setTitle(str);
       str = p1.y().m();
       if (!TextUtils.isEmpty(str)) {
          String str1 = "";
          if (io2.j("metadata", p1.b().b("subtitleStyle", str1))) {
             p0.e(str);
          }else {
             p0.setSubtitle(str);
          }
          TextView subtitleView = p0.getSubtitleView();
          String str2 = p1.b().q("label");
          Context context = subtitleView.getContext();
          if (str2 != null) {
             str1 = str2;
          }
          eo5.a(context, subtitleView, str1);
       }else {
          p0.setSubtitle(null);
       }
       return;
    }
    public static ExecutorService h(String p0){
       ExecutorService uExecutorSer = Executors.newSingleThreadExecutor(new m81(p0, new AtomicLong(1)));
       Runtime.getRuntime().addShutdownHook(new Thread(new yw1(p0, uExecutorSer, TimeUnit.SECONDS), "Crashlytics Shutdown Hook for ".concat(p0)));
       return uExecutorSer;
    }
    public static final boolean i(Observer p0){
       co5.q(p0, "observer");
       int i = 1;
       if (!((co5.c(Looper.myLooper(), Looper.getMainLooper()) ^ i))) {
          return i;
       }
       p0.onSubscribe(et0.e());
       Thread thread = Thread.currentThread();
       co5.h(thread, "Thread.currentThread\(\)");
       p0.onError(new IllegalStateException("Expected to be called on the main thread but was "+thread.getName()));
       return false;
    }
    public static boolean j(Context p0){
       Boolean uBoolean;
       ApplicationInfo metaData;
       boolean booleanx;
       if (!tu6.C && tu6.D == null) {
          if (ge6.b == null) {
             ge6.b = new ge6(p0);
          }
          try{
             ge6 b = ge6.b;
             boolean b1 = false;
             if (b.j(4)) {
                if ((uBoolean = b.h()) != null) {
                   b1 = uBoolean.booleanValue();
                }
                tu6.C = b1;
             }else {
                boolean c = tu6.C;
                ApplicationInfo applicationI = p0.getPackageManager().getApplicationInfo(p0.getPackageName(), 128);
                if ((metaData = applicationI.metaData) != null && metaData.containsKey("io.branch.sdk.TestMode")) {
                   booleanx = applicationI.metaData.getBoolean("io.branch.sdk.TestMode", b1);
                }else {
                   Resources resources = p0.getResources();
                   booleanx = Boolean.parseBoolean(resources.getString(resources.getIdentifier("io.branch.sdk.TestMode", "string", p0.getPackageName())));
                }
                c = booleanx;
                tu6.C = e0;
             }
          }catch(java.lang.Exception e0){
          }
          tu6.D = Boolean.valueOf(tu6.C);
       }
       return tu6.C;
    }
    public static float k(float p0,float p1,float p2){
       if ((p1 - p0) > 0) {
          p1 = p0;
          p0 = p1;
       }
       if ((p2 - p0) <= 0) {
          return p0;
       }else if((p1 - p2) >= 0){
          return p1;
       }else {
          return p2;
       }
    }
    public static zl0 l(String p0,String p1){
       kq0 okq0 = zl0.a(qt.class);
       okq0.b = 1;
       okq0.e = new uf(1, new qt(p0, p1));
       return okq0.c();
    }
    public static final ObjectAnimator m(View p0){
       co5.o(p0, "view");
       return tu6.n(p0, 0, 6);
    }
    public static ObjectAnimator n(View p0,int p1,int p2){
       long l = ((p2 & 0x02))? 100: 0;
       if ((p2 & 4)) {
          p1 = 4;
       }
       co5.o(p0, "view");
       float[] uofloatArray = new float[]{p0.getAlpha(),0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "alpha", uofloatArray);
       objectAnimat.setDuration(l);
       vv7.D(objectAnimat, new vw3(p0, p1));
       return objectAnimat;
    }
    public static void o(v10 p0,int p1,int p2){
       int i1;
       int i = 0;
       while (i < p2) {
          i1 = p1 - i;
          int i2 = i1;
          while (true) {
             int i3 = p1 + i;
             if (i2 <= i3) {
                p0.c(i2, i1);
                p0.c(i2, i3);
                p0.c(i1, i2);
                p0.c(i3, i2);
                i2 = i2 + 1;
             }else {
                break ;
             }
          }
          i = i + 2;
       }
       i = p1 - p2;
       p0.c(i, i);
       i1 = i + 1;
       p0.c(i1, i);
       p0.c(i, i1);
       p1 = p1 + p2;
       p0.c(p1, i);
       p0.c(p1, i1);
       p0.c(p1, (p1 - 1));
       return;
    }
    public static final lg4 p(Fragment p0){
       NavHostFragment a;
       View view;
       Window window;
       co5.o(p0, "<this>");
       NavHostFragment navHostFragm = p0;
       while (true) {
          if (navHostFragm != null) {
             String str = "null cannot be cast to non-null type androidx.navigation.NavController";
             if (navHostFragm instanceof NavHostFragment) {
                if ((a = navHostFragm.a) != null) {
                   break ;
                }else {
                   throw new NullPointerException(str);
                }
             }else {
                o x = navHostFragm.getParentFragmentManager().x;
                if (x instanceof NavHostFragment) {
                   if ((a = x.a) != null) {
                      break ;
                   }else {
                      throw new NullPointerException(str);
                   }
                }else {
                   navHostFragm = navHostFragm.getParentFragment();
                }
             }
          }else if((view = p0.getView()) != null){
             a = lv1.m(view);
             break ;
          }else {
             View view1 = null;
             f uof = (p0 instanceof f)? p0: view1;
             if (uof != null && ((uof = uof.C) != null && (window = uof.getWindow()) != null)) {
                view1 = window.getDecorView();
             }
             if (view1 != null) {
                a = lv1.m(view1);
                break ;
             }else {
                throw new IllegalStateException(et0.p("Fragment ", p0, " does not have a NavController set"));
             }
          }
       }
       return a;
    }
    public static u10 q(u10 p0,int p1,int p2){
       oi2 g;
       int i = p0.b / p2;
       if (p2 != 4) {
          if (p2 != 6) {
             if (p2 != 8) {
                if (p2 != 10) {
                   if (p2 == 12) {
                      g = oi2.g;
                   }else {
                      throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(p2)));
                   }
                }else {
                   g = oi2.h;
                }
             }else {
                g = oi2.l;
             }
          }else {
             g = oi2.i;
          }
       }else {
          g = oi2.j;
       }
       li5 oli5 = new li5(g);
       int i1 = p1 / p2;
       int[] ointArray = new int[i1];
       int i2 = p0.b / p2;
       int i3 = 0;
       for (int i4 = 0; i4 < i2; i4 = i4 + 1) {
          int i6 = 0;
          for (int i5 = 0; i5 < p2; i5 = i5 + 1) {
             int i7 = i4 * p2;
             if (i7 = i7 + i5) {
                i7 = p2 - i5;
                i7 = i7 - 1;
                i7 = 1 << i7;
             }else {
                i7 = 0;
             }
             i6 = i6 | i7;
          }
          ointArray[i4] = i6;
       }
       oli5.b(ointArray, (i1 - i));
       p0 = new u10();
       p0.c(i3, (p1 % p2));
       for (; i3 < i1; i3 = i3 + 1) {
          p0.c(ointArray[i3], p2);
       }
       return p0;
    }
    public static SpotifyIconView r(Context p0){
       SpotifyIconView spotifyIconV = new SpotifyIconView(p0, null);
       spotifyIconV.setIcon(sp6.D);
       spotifyIconV.setColorStateList(uw5.l(p0, R.attr.pasteColorAccessoryGreen));
       spotifyIconV.getDrawable().d((float)xj0.e0(24.00f, p0.getResources()));
       return spotifyIconV;
    }
    public static int s(ColorStateList p0,int[] p1){
       int colorForStat = (p0 != null)? p0.getColorForState(p1, p0.getDefaultColor()): 0;
       return lj0.h(colorForStat, Math.min((Color.alpha(colorForStat) * 2), 255));
    }
    public static final Method t(Class p0,String p1,Class[] p2){
       Method declaredMeth;
       String str = "args";
       try{
          co5.o(p2, str);
          declaredMeth = p0.getDeclaredMethod(p1, Arrays.copyOf(p2, p2.length));
       }catch(java.lang.NoSuchMethodException e0){
          declaredMeth = null;
       }
       return declaredMeth;
    }
    public static final Method u(Class p0,String p1,Class[] p2){
       Method method;
       String str = "clazz";
       try{
          co5.o(p0, str);
          method = p0.getMethod(p1, Arrays.copyOf(p2, p2.length));
       }catch(java.lang.NoSuchMethodException e0){
          method = null;
       }
       return method;
    }
    public static final PublicKey v(String p0){
       byte[] uobyteArray = Base64.decode(av6.x0(av6.x0(av6.x0(p0, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0);
       co5.l(uobyteArray, "decode\(pubKeyString, Base64.DEFAULT\)");
       X509EncodedKeySpec x509EncodedK = new X509EncodedKeySpec(uobyteArray);
       PublicKey publicKey = KeyFactory.getInstance("RSA").generatePublic(x509EncodedK);
       co5.l(publicKey, "kf.generatePublic\(x509publicKey\)");
       return publicKey;
    }
    public static final String w(String p0){
       co5.o(p0, "kid");
       ReentrantLock reentrantLoc = new ReentrantLock();
       Condition uCondition = reentrantLoc.newCondition();
       ks5 oks5 = new ks5();
       z05 v10 = new z05(new URL("https", co5.K(sz1.p, "www."), "/.well-known/oauth/openid/keys/"), oks5, p0, reentrantLoc, uCondition);
       sz1.c().execute(v10);
       reentrantLoc.lock();
       uCondition.await(5000, TimeUnit.MILLISECONDS);
       reentrantLoc.unlock();
       return oks5.a;
    }
    public static StateListDrawable x(Context p0,sp6 p1,sp6 p2){
       ColorStateList uColorStateL = n6.c(p0, R.color.tab_text_color);
       float f = (float)xj0.e0(26.00f, p0.getResources());
       lp6 olp6 = new lp6(p0, p1, f);
       lp6 olp61 = new lp6(p0, p2, f);
       olp6.c(uColorStateL);
       olp61.c(uColorStateL);
       StateListDrawable stateListDra = new StateListDrawable();
       int[] ointArray = new int[]{0x10100a1};
       stateListDra.addState(ointArray, olp61);
       stateListDra.addState(StateSet.WILD_CARD, olp6);
       return stateListDra;
    }
    public static final Object y(Class p0,Object p1,Method p2,Object[] p3){
       co5.o(p0, "clazz");
       co5.o(p2, "method");
       co5.o(p3, "args");
       if (p1 != null) {
          p1 = p0.cast(p1);
       }
       try{
          return p2.invoke(p1, Arrays.copyOf(p3, p3.length));
       }catch(java.lang.IllegalAccessException e0){
          return null;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public static Single z(Single p0,kx6 p1){
       if4 v6 = new if4(p0, new k12(9), new k12(10), p1, 1);
       return Single.create(v6);
    }
    public void b(View p0){
    }
    public void c(){
    }
}
