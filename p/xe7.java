package p.xe7;
import p.es7;
import p.w54;
import java.lang.String;
import p.bx6;
import p.c65;
import p.ps3;
import p.yy6;
import java.lang.Object;
import p.co5;
import p.eo5;
import android.content.Context;
import p.sz1;
import android.widget.EditText;
import java.lang.Class;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.os.IBinder;
import java.lang.AssertionError;
import p.i15;
import java.lang.Throwable;
import java.lang.CharSequence;
import p.av6;
import p.ko6;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;
import java.util.logging.Logger;
import java.util.logging.Level;
import p.en6;
import p.ad5;
import p.uv1;
import p.t65;
import java.util.Map;
import java.util.Collections;
import p.aw6;
import p.dw6;
import p.bw6;
import java.io.Serializable;
import p.te5;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import p.rn;
import p.iv6;
import p.gw;
import p.k97;
import p.xt;
import p.t97;
import p.ju;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import p.o11;
import p.w51;
import p.u97;
import p.e73;
import com.google.common.collect.c;
import p.d1;
import p.w87;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import p.do5;
import java.util.Arrays;
import p.ys5;
import java.util.AbstractCollection;
import p.c97;
import p.b97;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import android.graphics.PorterDuff$Mode;
import p.fn0;
import io.reactivex.rxjava3.disposables.Disposable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import p.kd0;
import java.io.File;
import java.util.UUID;
import java.io.PrintStream;
import p.ic1;
import p.au0;
import p.tx5;
import p.eb3;
import p.gc1;
import p.xw0;
import p.zb7;
import android.animation.StateListAnimator;
import android.animation.AnimatorInflater;
import p.bv5;
import p.zu5;
import java.net.Socket;
import p.nn;
import p.kp5;
import java.io.OutputStream;
import p.b57;
import p.vj1;
import java.util.concurrent.ExecutionException;
import java.lang.Exception;
import p.b7;
import p.n07;
import p.l18;
import p.zw7;
import java.util.concurrent.Executor;
import p.m25;
import p.e25;
import java.util.concurrent.CountDownLatch;
import java.lang.NullPointerException;
import p.on;
import java.io.FileInputStream;
import java.io.InputStream;
import p.el6;
import p.gp5;
import p.nn6;
import p.hp5;
import p.xq0;
import p.vk3;
import p.wq0;
import p.cq0;
import p.fn6;
import p.ws0;
import java.lang.Number;
import p.cd2;
import p.tp2;
import java.lang.IllegalArgumentException;
import java.util.Iterator;
import java.util.Map$Entry;
import p.tj2;
import p.oe7;
import android.widget.TextView;
import p.sj2;
import p.y77;
import p.u77;
import p.r77;
import p.t77;
import p.s77;
import p.dg1;
import p.eg7;
import p.g07;
import java.util.List;
import android.util.Property;
import p.zq7;
import p.ak2;
import p.vo2;
import p.gk2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import p.zk2;
import p.yo2;
import java.security.MessageDigest;
import android.util.Base64;
import p.ap2;
import p.cp2;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import p.xj0;
import p.rc3;
import java.lang.ArrayIndexOutOfBoundsException;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.content.IntentFilter;
import p.t60;
import java.lang.Boolean;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.AbstractSet;
import p.uk;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources$Theme;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p.lx;
import p.v10;
import p.sl1;
import java.lang.Math;

public abstract class xe7 implements es7, w54	// class@0003bc from classes2.dex
{
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final ps3 D;
    public static final yy6 E;
    public static ue7 a;
    public static boolean b;
    public static final String[] c;
    public static final bx6 t;
    public static final char[] v;
    public static final c65 w;
    public static final boolean[] x;
    public static final int[] y;
    public static final int[] z;

    static {
       String[] stringArray = new String[]{"com.android.chrome","com.chrome.beta","com.chrome.dev"};
       xe7.c = stringArray;
       xe7.t = new bx6("CLOSED_EMPTY");
       xe7.v = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       xe7.w = new c65(29);
       boolean[] uobooleanArr = new boolean[3];
       xe7.x = uobooleanArr;
       xe7.y = new int[4]{0x7f0301d5,0x7f0301d6,0x7f0301d7,0x7f0301d8};
       xe7.z = new int[4]{0x7f0302f4,0x7f0302f8,0x7f0302fa,0x7f0302fb};
       xe7.A = new int[5]{0x10100d4,0x7f03048a,0x7f03048b,0x7f03048c,0x7f0304e7};
       xe7.B = new int[4]{0x7f03018c,0x7f03018d,0x7f03018e,0x7f03018f};
       xe7.C = new int[5]{0x7f030535,0x7f030536,0x7f030537,0x7f030538,0x7f030539};
       xe7.D = new ps3(7);
       xe7.E = new yy6(3);
    }
    public void xe7(){
       super();
    }
    public void xe7(int p0){
       super();
    }
    public static final String A(String p0){
       co5.o(p0, "developerDefinedRedirectURI");
       if (eo5.o(sz1.a(), p0)) {
          return p0;
       }
       if (eo5.o(sz1.a(), co5.K(sz1.a().getPackageName(), "fbconnect://cct."))) {
          return co5.K(sz1.a().getPackageName(), "fbconnect://cct.");
       }
       return "";
    }
    public static void B(EditText p0){
       p0.getClass();
       p0.getContext().getSystemService("input_method").hideSoftInputFromWindow(p0.getWindowToken(), 0);
    }
    public static final boolean C(AssertionError p0){
       String message;
       boolean b = false;
       if (p0.getCause() != null) {
          boolean b1 = ((message = p0.getMessage()) != null)? av6.f0(message, "getsockname failed"): false;
          if (b1) {
             b = true;
          }
       }
       return b;
    }
    public static final ko6 D(Object[] p0){
       co5.o(p0, "array");
       return new ko6(p0);
    }
    public static String E(String p0,Object[] p1){
       object oobject;
       int i3;
       p0 = String.valueOf(p0);
       int i = 0;
       for (int i1 = 0; i1 < p1.length; i1 = i1 + 1) {
          String str = ((oobject = p1[i1]) == null)? "null": oobject.toString();
          p1[i1] = str;
       }
       StringBuilder str1 = new StringBuilder(((p1.length * 16) + p0.length()));
       int i2 = 0;
       for (; i < p1.length && (i3 = p0.indexOf("%s", i2)) != -1; i = i5) {
          i2 = i + 1;
          str1 = str1.append(p0, i2, i3).append(p1[i]);
          i = i3 + 2;
          int i5 = i2;
          i2 = i;
       }
       str1 = str1+p0;
       if (i < p1.length) {
          str1 = str1+" ["+p1[i];
          for (int i4 = i + 1; i4 < p1.length; i4 = i) {
             i = i4 + 1;
             str1 = str1.append(", ").append(p1[i4]);
          }
          str1 = str1+']';
       }
       return str1;
    }
    public static final int F(int p0){
       if (p0 < 0) {
       }else if(p0 < 3){
          p0++;
       }else if(p0 < 0x40000000){
          p0 = (int)(((float)p0 / 0x3f400000) + 0x3f800000);
       }else {
          p0 = Integer.MAX_VALUE;
       }
       return p0;
    }
    public static uv1 G(ad5 p0){
       return new uv1(29, p0);
    }
    public static final Map H(t65 p0){
       co5.o(p0, "pair");
       Map map = Collections.singletonMap(p0.a, p0.b);
       co5.l(map, "singletonMap\(pair.first, pair.second\)");
       return map;
    }
    public static aw6 I(aw6 p0){
       if (p0 instanceof dw6 || p0 instanceof bw6) {
          return p0;
       }
       bw6 uobw6 = (p0 instanceof Serializable)? new bw6(p0): new dw6(p0);
       return uobw6;
    }
    public static String J(String p0){
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
    public static void K(Observer p0,AtomicInteger p1,rn p2){
       if (!p1.getAndIncrement()) {
          p2.d(p0);
       }
       return;
    }
    public static void L(Observer p0,Throwable p1,AtomicInteger p2,rn p3){
       if (p3.a(p1) && !p2.getAndIncrement()) {
          p3.d(p0);
       }
       return;
    }
    public static void M(iv6 p0,Throwable p1,AtomicInteger p2,rn p3){
       if (p3.a(p1) && !p2.getAndIncrement()) {
          p3.e(p0);
       }
       return;
    }
    public static void N(Observer p0,Object p1,AtomicInteger p2,rn p3){
       if (!p2.get() && p2.compareAndSet(0, 1)) {
          p0.onNext(p1);
          if (p2.decrementAndGet()) {
             p3.d(p0);
          }
       }
       return;
    }
    public static boolean O(iv6 p0,Object p1,AtomicInteger p2,rn p3){
       if (!p2.get() && p2.compareAndSet(0, 1)) {
          p0.onNext(p1);
          if (!p2.decrementAndGet()) {
             return 1;
          }else {
             p3.e(p0);
          }
       }
       return 0;
    }
    public static xt P(gw p0,k97 p1){
       k97 a3;
       c97 p0;
       gw a = p0.a;
       a.getClass();
       if (a instanceof t97) {
          o11 oo11 = new o11(p0, 0);
          oo11.w = new ju(p1.b, p1.a);
          return xt.d(oo11.m());
       }else {
          w51.h(4, "initialCapacity");
          Object[] objArray = new Object[4];
          gw a1 = p0.a;
          a1.getClass();
          e73 uoe73 = a1.m.q(0);
          int i = 0;
          while (uoe73.hasNext()) {
             w87 ow87 = uoe73.next();
             if (ow87.b == p1.b) {
                w87 a2 = ow87.a;
                co5.o(a2, "thisPattern");
                int b = ((a3 = p1.a) != null)? Pattern.compile(av6.x0(a2, "?", "\([a-zA-Z0-9~`!@#\\$%\\^&\\*\\\(\\\)_\\-\\+={\\[\\}\\]\\|\\;\"\'<,>\\.\\?\\/  ]*\)")).matcher(a3).matches(): false;
                if (b && p0.b.contains(ow87.c)) {
                   b = i + 1;
                   if (objArray.length < b) {
                      objArray = Arrays.copyOf(objArray, do5.t(objArray.length, b));
                   }
                   objArray[i] = ow87;
                   i = b;
                }
             }
          }
          ys5 oys5 = c.m(i, objArray);
          if (oys5.isEmpty()) {
             return xt.e();
          }
          objArray = new Object[]{p0,new b97(p1.a)};
          p0 = new c97(p1.a, p1.b, oys5, p0.b, p0.c);
          return xt.a(vv7.p(objArray));
       }
    }
    public static int Q(int p0){
       if (p0 >= 200 && p0 <= 299) {
          return 0;
       }
       if (p0 >= 300 && p0 <= 399) {
          return 1;
       }
       if (p0 >= 400 && p0 <= 499) {
          return 0;
       }
       return 1;
    }
    public static PorterDuff$Mode R(int p0,PorterDuff$Mode p1){
       if (p0 == 3) {
          return PorterDuff$Mode.SRC_OVER;
       }
       if (p0 == 5) {
          return PorterDuff$Mode.SRC_IN;
       }
       if (p0 == 9) {
          return PorterDuff$Mode.SRC_ATOP;
       }
       switch (p0){
           case 14:
             return PorterDuff$Mode.MULTIPLY;
           case 15:
             return PorterDuff$Mode.SCREEN;
           case 16:
             return PorterDuff$Mode.ADD;
           default:
             return p1;
       }
    }
    public static final void S(fn0 p0,Disposable p1){
       co5.o(p0, "<this>");
       p0.c(p1);
    }
    public static CharSequence T(CharSequence p0,Drawable p1){
       SpannableStringBuilder spannableStr = new SpannableStringBuilder("@  ");
       spannableStr.append(p0);
       p1.setBounds(0, 0, p1.getIntrinsicWidth(), p1.getIntrinsicHeight());
       spannableStr.setSpan(new kd0(p1), 0, 1, 0);
       return spannableStr;
    }
    public static boolean U(File p0){
       int i;
       boolean b = false;
       String str = (!p0.mkdirs() && !p0.isDirectory())? 0: 1;
       if (!i) {
          return b;
       }else {
          str = UUID.randomUUID().toString();
          try{
             File uFile = new File(p0, str);
             boolean b1 = uFile.createNewFile();
             if (uFile.exists()) {
                b = uFile.delete();
             }
             return (b1 | b);
          }catch(java.io.IOException e0){
             return b;
          }
       }
    }
    public static final void V(String p0){
       System.err.println("SLF4J: "+p0);
    }
    public static final void W(String p0,Throwable p1){
       System.err.println(p0);
       System.err.println("Reported exception:");
       p1.printStackTrace();
    }
    public static final void X(ic1 p0,au0 p1,boolean p2){
       Throwable throwable;
       Object obj1;
       xw0 obj = p0.h();
       tx5 otx5 = ((throwable = p0.e(obj)) != null)? eb3.h(throwable): p0.f(obj);
       if (p2) {
          gc1 v = p1.v;
          obj = v.getContext();
          zb7 ozb7 = ((obj1 = w51.W(obj, p1.x)) != w51.C)? vv7.X(v, obj, obj1): null;
          p1.v.d(otx5);
          if (ozb7 == null || ozb7.O()) {
             w51.N(obj, obj1);
          }
       }else {
          p1.d(otx5);
       }
       return;
    }
    public static final void Z(View p0,int p1){
       p0.setStateListAnimator(AnimatorInflater.loadStateListAnimator(p0.getContext(), p1));
    }
    public static bv5 a(bv5 p0,String p1){
       p0.getClass();
       zu5 ozu5 = new zu5(p0);
       ozu5.d("Authorization", "Bearer "+p1);
       return ozu5.b();
    }
    public static void a0(EditText p0){
       p0.getClass();
       p0.requestFocus();
       p0.getContext().getSystemService("input_method").showSoftInput(p0, 1);
    }
    public static int b(boolean[] p0,int p1,int[] p2,boolean p3){
       int len = p2.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          int i2 = p2[i];
          int i3 = 0;
          while (i3 < i2) {
             int i4 = p1 + 1;
             p0[p1] = p3;
             i3 = i3 + 1;
             p1 = i4;
          }
          i1 = i1 + i2;
          int i5 = p3 ^ 0x01;
       }
       return i1;
    }
    public static final nn b0(Socket p0){
       kp5 okp5 = new kp5(p0);
       OutputStream outputStream = p0.getOutputStream();
       co5.l(outputStream, "getOutputStream\(\)");
       nn onn = new nn(outputStream, okp5);
       return new nn(okp5, onn);
    }
    public static Object c(vj1 p0){
       String str = "Task must not be null";
       if (p0 == null) {
          throw new NullPointerException(str);
       }
       vj1 b = p0.b;
       _monitor_enter(b);
       _monitor_exit(b);
       if (p0.a != null) {
          if (p0.e()) {
             return p0.c();
          }
          throw new ExecutionException(p0.b());
       }else {
          b7 str1 = new b7(null);
          kj b1 = n07.b;
          p0.c.b(new zw7(b1, str1));
          p0.g();
          p0.c.b(new zw7(b1, str1));
          p0.g();
          str1.b.await();
          if (p0.e()) {
             return p0.c();
          }
          throw new ExecutionException(p0.b());
       }
    }
    public static final on c0(File p0){
       co5.o(p0, "<this>");
       return new on(new FileInputStream(p0), b57.d);
    }
    public static final gp5 d(el6 p0){
       co5.o(p0, "<this>");
       return new gp5(p0);
    }
    public static final on d0(InputStream p0){
       co5.o(p0, "<this>");
       return new on(p0, new b57());
    }
    public static final on e0(Socket p0){
       kp5 okp5 = new kp5(p0);
       InputStream inputStream = p0.getInputStream();
       co5.l(inputStream, "getInputStream\(\)");
       on oon = new on(inputStream, okp5);
       return new on(okp5, oon);
    }
    public static final hp5 f(nn6 p0){
       co5.o(p0, "<this>");
       return new hp5(p0);
    }
    public static void h(xq0 p0,vk3 p1,wq0 p2){
       wq0 i2;
       cq0 g;
       p2.o = -1;
       p2.p = -1;
       int i = 0;
       int i1 = 4;
       wq0 t = p2.T;
       if (p0.T[i] != 2 && t[i] == i1) {
          i2 = p2.I;
          g = i2.g;
          wq0 k = p2.K;
          int i3 = p0.r() - k.g;
          i2.i = p1.k(i2);
          k.i = p1.k(k);
          p1.d(i2.i, g);
          p1.d(k.i, i3);
          p2.o = 2;
          p2.Z = g;
          i3 = i3 - g;
          p2.V = i3;
          i2 = p2.c0;
          if (i3 < i2) {
             p2.V = i2;
          }
       }
       i = 1;
       if (p0.T[i] != 2 && t[i] == i1) {
          i2 = p2.J;
          g = i2.g;
          wq0 l = p2.L;
          int i4 = p0.l() - l.g;
          i2.i = p1.k(i2);
          l.i = p1.k(l);
          p1.d(i2.i, g);
          p1.d(l.i, i4);
          if (p2.b0 > null || p2.h0 == 8) {
             i2 = p2.M;
             fn6 uofn6 = p1.k(i2);
             i2.i = uofn6;
             p1.d(uofn6, (p2.b0 + g));
          }
          p2.p = 2;
          p2.a0 = g;
          i4 = i4 - g;
          p2.W = i4;
          wq0 d0 = p2.d0;
          if (i4 < d0) {
             p2.W = d0;
          }
       }
       return;
    }
    public static final Drawable h0(eo5 p0,Context p1,Integer p2){
       co5.o(p1, "context");
       if (!p0 instanceof ws0) {
          throw new cd2(10);
       }
       ws0 d = p0.D;
       if (p2 != null) {
          d.setTint(p2.intValue());
       }
       return d;
    }
    public static final void i(int p0){
       int i = 1;
       if (p0 >= i) {
       }else {
          i = 0;
       }
       if (i) {
          return;
       }else {
          throw new IllegalArgumentException(tp2.k("Expected positive parallelism level, but got ", p0).toString());
       }
    }
    public static final Map i0(Map p0){
       co5.o(p0, "<this>");
       Map$Entry uEntry = p0.entrySet().iterator().next();
       Object key = uEntry.getKey();
       uEntry = Collections.singletonMap(key, uEntry.getValue());
       co5.l(uEntry, "with\(entries.iterator\(\).…ingletonMap\(key, value\) }");
       return uEntry;
    }
    public static byte[] j(byte[][] p0){
       int len = p0.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          i1 = i1 + p0[i].length;
       }
       byte[] uobyteArray = new byte[i1];
       i = p0.length;
       int i2 = 0;
       for (i1 = 0; i1 < i; i1 = i1 + 1) {
          object oobject = p0[i1];
          System.arraycopy(oobject, 0, uobyteArray, i2, oobject.length);
          i2 = i2 + oobject.length;
       }
       return uobyteArray;
    }
    public static tj2 j0(Context p0,String p1){
       oe7 a;
       oe7 ooe7 = new oe7(10);
       p1.getClass();
       ooe7.b = p1;
       if ((a = ooe7.a) != null) {
          a.setText(p1);
       }
       return new tj2(p0, ooe7);
    }
    public static y77 k(View p0){
       Property[] propertyArra;
       u77 ou77 = new u77(0x3f800000);
       r77 or77 = new r77(ou77.a, ou77.b, 0, ou77);
       s77 os77 = or77.b(0);
       os77.f.e = dg1.a;
       g07[] og07Array = new g07[]{new g07(p0, Collections.singletonList(View.ALPHA))};
       os77.f.f = Arrays.asList(og07Array);
       os77 = os77.g.b(0x3f4ccccd);
       og07Array = new g07[]{new g07(p0, Arrays.asList(propertyArra))};
       propertyArra = new Property[]{View.SCALE_X,View.SCALE_Y};
       p0.f = Arrays.asList(og07Array);
       s77 g = os77.g;
       r77 c = g.c;
       c.a(g.e, g.a, g.b);
       return c.c;
    }
    public static tj2 k0(Context p0,CharSequence p1,CharSequence p2){
       zq7 a;
       zq7 b;
       zq7 ozq7 = new zq7();
       p1.getClass();
       ozq7.c = p1;
       if ((a = ozq7.a) != null) {
          a.setText(p1);
       }
       p2.getClass();
       ozq7.t = p2;
       if ((b = ozq7.b) != null) {
          b.setText(p2);
       }
       return new tj2(p0, ozq7);
    }
    public static vo2 l(ak2 p0){
       p0.getClass();
       vo2 ovo2 = new vo2(LayoutInflater.from(p0.getContext()).inflate(R.layout.glue_header_content_set_title, p0, false), false);
       eo5.P(ovo2);
       return ovo2;
    }
    public static yo2 m(ak2 p0){
       p0.getClass();
       yo2 oyo2 = new yo2(LayoutInflater.from(p0.getContext()).inflate(R.layout.glue_header_content_set_cover_art, p0, false));
       eo5.P(oyo2);
       return oyo2;
    }
    public static String m0(List p0){
       int i;
       MessageDigest instance = MessageDigest.getInstance("SHA256");
       byte[] uobyteArray = new byte[8192];
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          FileInputStream uFileInputSt = new FileInputStream(iterator.next());
          do {
             if ((i = uFileInputSt.read(uobyteArray)) > 0) {
                instance.update(uobyteArray, 0, i);
             }
          } while (i == -1);
          uFileInputSt.close();
       }
       return Base64.encodeToString(instance.digest(), 11);
    }
    public static ap2 n(ak2 p0){
       ap2 obj = p0;
       obj.getClass();
       obj = new ap2(LayoutInflater.from(obj.getContext()).inflate(R.layout.glue_header_content_set_multiline, p0, false));
       eo5.P(obj);
       return obj;
    }
    public static cp2 o(ak2 p0){
       p0.getClass();
       cp2 uocp2 = new cp2(LayoutInflater.from(p0.getContext()).inflate(R.layout.glue_header_content_set_two_lines, p0, false));
       eo5.P(uocp2);
       return uocp2;
    }
    public static String p(ByteBuffer p0,int p1,int p2){
       int b;
       int i2;
       byte b1;
       byte i4;
       if ((((p1 | p2) | ((p0.limit() - p1) - p2))) >= 0) {
          int i = p1 + p2;
          char[] uocharArray = new char[p2];
          int i1 = 0;
          while (p1 < i) {
             i2 = ((b = p0.get(p1)) >= 0)? 1: 0;
             if (!i2) {
                break ;
             }
             p1++;
             i2 = i1 + 1;
             uocharArray[i1] = (char)b;
             i1 = i2;
          }
          int i3 = i1;
          while (true) {
             if (p1 >= i) {
                return new String(uocharArray, 0, i3);
             }
             i1 = p1 + 1;
             b = ((b1 = p0.get(p1)) >= 0)? 1: 0;
             if (b) {
                b = i3 + 1;
                uocharArray[i3] = (char)b1;
                b1 = i1;
                while (true) {
                   i3 = b;
                   if (b1 < i) {
                      b = ((i1 = p0.get(b1)) >= 0)? 1: 0;
                      if (!b) {
                      }else {
                         b1++;
                         b = i3 + 1;
                         uocharArray[i3] = (char)i1;
                      }
                   }else {
                      continue ;
                   }
                }
             }else if(b1 < -32){
                b = 1;
             }else {
                b = 0;
             }
             if (b) {
                if (i1 < i) {
                   b = i1 + 1;
                   i2 = i3 + 1;
                   xj0.f(b1, p0.get(i1), uocharArray, i3);
                   b1 = b;
                   i3 = i2;
                }else {
                   break ;
                }
             }else if(b1 < -16){
                b = 1;
             }else {
                b = 0;
             }
             if (b) {
                b = i - 1;
                if (i1 < b) {
                   b = i1 + 1;
                   i2 = b + 1;
                   i4 = i3 + 1;
                   xj0.g(b1, p0.get(i1), p0.get(b), uocharArray, i3);
                   b1 = i2;
                   i3 = i4;
                }else {
                   throw rc3.b();
                }
             }else {
                b = i - 2;
                if (i1 < b) {
                   b = i1 + 1;
                   i1 = b + 1;
                   i4 = p0.get(b);
                   int i5 = i1 + 1;
                   byte b2 = p0.get(i1);
                   int i6 = i3 + 1;
                   i2 = i4;
                   i4 = b2;
                   xj0.e(b1, p0.get(i1), i2, i4, uocharArray, i3);
                   i3 = i6 + 1;
                   b1 = i5;
                }else {
                   throw rc3.b();
                }
             }
          }
          throw rc3.b();
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0.limit()),Integer.valueOf(p1),Integer.valueOf(p2)};
          throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", objArray));
       }
    }
    public static float q(Context p0,int p1){
       return TypedValue.applyDimension(1, (float)p1, p0.getResources().getDisplayMetrics());
    }
    public static final boolean r(int p0,int p1){
       boolean b = (((p0 & p1)) == p1)? true: false;
       return b;
    }
    public static String t(byte[] p0,int p1){
       int i3;
       int len = p0.length;
       int i = len << 1;
       int i1 = 0;
       int i2 = (p1 > 0)? len / p1: 0;
       char[] uocharArray = new char[(i + i2)];
       i2 = 0;
       for (; i1 < len; i1 = i1 + 1) {
          if (p1 > 0 && (!(i3 = i1 % p1) && i2 > 0)) {
             i3 = i2 + 1;
             uocharArray[i2] = '-';
             i2 = i3;
          }
          i3 = i2 + 1;
          char[] v = xe7.v;
          int b = p0[i1];
          int i4 = b & 0x00f0;
          i4 = i4 >> 4;
          uocharArray[i2] = v[i4];
          i2 = i3 + 1;
          b = b & 0x0f;
          uocharArray[i3] = v[b];
       }
       return new String(uocharArray);
    }
    public static boolean u(Object p0,Object p1){
       boolean b = (p0 != p1 && (p0 == null && p0.equals(p1)))? false: true;
       return b;
    }
    public static final t60 v(Context p0,IntentFilter p1){
       co5.o(p0, "context");
       co5.o(p1, "intentFilter");
       return new t60(p0, p1, null);
    }
    public static final String w(){
       List list;
       ResolveInfo serviceInfo;
       if ((list = sz1.a().getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0)) != null) {
          HashSet hashSet = new HashSet(xe7.F(3));
          uk.s0(hashSet, xe7.c);
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             if ((serviceInfo = iterator.next().serviceInfo) != null && hashSet.contains(serviceInfo.packageName)) {
                return serviceInfo.packageName;
             }
          }
       }
       return null;
    }
    public static int x(Context p0,int p1){
       TypedValue typedValue = new TypedValue();
       p0.getTheme().resolveAttribute(p1, typedValue, true);
       return typedValue.data;
    }
    public static SimpleDateFormat z(int p0,int p1){
       String str1;
       StringBuilder str = "";
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 == 3) {
                   str1 = "M/d/yy";
                }else {
                   throw new IllegalArgumentException(tp2.k("Unknown DateFormat style: ", p0));
                }
             }else {
                str1 = "MMM d, yyyy";
             }
          }else {
             str1 = "MMMM d, yyyy";
          }
       }else {
          str1 = "EEEE, MMMM d, yyyy";
       }
       str = str+str1+" ";
       if (p1 && p1 != 1) {
          if (p1 != 2) {
             if (p1 == 3) {
                str1 = "h:mm a";
             }else {
                throw new IllegalArgumentException(tp2.k("Unknown DateFormat style: ", p1));
             }
          }else {
             str1 = "h:mm:ss a";
          }
       }else {
          str1 = "h:mm:ss a z";
       }
       return new SimpleDateFormat(str+str1, Locale.US);
    }
    public void Y(){
    }
    public v10 e(String p0,lx p1,int p2,int p3,Map p4){
       if (p0.isEmpty()) {
          throw new IllegalArgumentException("Found empty contents");
       }
       if (p2 < 0 || p3 < 0) {
          throw new IllegalArgumentException("Negative size is not allowed. Input: "+p2+'x'+p3);
       }
       int i = this.y();
       if (p4 != null) {
          sl1 w = sl1.w;
          if (p4.containsKey(w)) {
             i = Integer.parseInt(p4.get(w).toString());
          }
       }
       boolean[] uobooleanArr = this.s(p0);
       int len = uobooleanArr.length;
       i = i + len;
       p2 = Math.max(p2, i);
       p3 = Math.max(1, p3);
       i = p2 / i;
       int i1 = (p2 - (len * i)) / 2;
       v10 ov10 = new v10(p2, p3);
       int i2 = 0;
       while (i2 < len) {
          if (uobooleanArr[i2]) {
             ov10.d(i1, 0, i, p3);
          }
          i2 = i2 + 1;
          i1 = i1 + i;
       }
       return ov10;
    }
    public abstract void f0();
    public boolean g(){
       return false;
    }
    public abstract void g0();
    public abstract void l0(byte[] p0,int p1,int p2);
    public abstract boolean[] s(String p0);
    public int y(){
       return 10;
    }
}
