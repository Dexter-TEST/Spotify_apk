package p.vf;
import p.j52;
import p.c67;
import p.k64;
import p.z5;
import p.yx6;
import p.a24;
import p.nz;
import p.m25;
import p.n60;
import p.pv6;
import p.bu0;
import p.tr3;
import p.vc1;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.LinkedList;
import android.util.SparseArray;
import java.util.regex.Pattern;
import java.lang.String;
import android.os.Looper;
import android.os.Build$VERSION;
import android.os.Handler;
import p.q3;
import java.lang.Class;
import android.os.Handler$Callback;
import java.lang.Boolean;
import java.lang.reflect.Constructor;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.RuntimeException;
import java.lang.Error;
import androidx.media.AudioAttributesCompat;
import p.yn;
import p.uv1;
import android.content.Context;
import p.g54;
import p.hs3;
import p.oe7;
import p.li5;
import p.n56;
import java.util.HashMap;
import p.tc4;
import p.dy1;
import p.zk;
import p.b7;
import p.xq7;
import p.n91;
import p.xl0;
import p.k30;
import p.cu1;
import p.ga1;
import p.ak;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.material.button.MaterialButtonToggleGroup;
import p.ac;
import p.co5;
import p.vh0;
import p.cc3;
import java.lang.NullPointerException;
import java.lang.System;
import p.va7;
import java.lang.Math;
import java.lang.CharSequence;
import java.util.Objects;
import java.lang.Float;
import p.w36;
import p.s74;
import android.view.View;
import android.animation.ValueAnimator;
import p.ke;
import p.sq7;
import p.u16;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import p.q16;
import p.r16;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import p.fw;
import p.qe3;
import java.net.URI;
import java.lang.StringBuilder;
import p.en6;
import java.util.Locale;
import java.util.Map;
import java.lang.Appendable;
import p.xb2;
import android.content.res.Resources;
import android.graphics.Typeface;
import p.yb2;
import p.pa7;
import p.jw3;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import java.lang.Number;
import android.util.Log;
import java.lang.Long;
import p.dc2;
import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;
import java.io.Closeable;
import p.ry7;
import p.j07;
import java.lang.Void;
import p.a28;
import p.vv7;
import p.iz7;
import p.m07;
import java.lang.Exception;
import java.io.File;
import java.util.regex.Matcher;
import p.e64;
import android.view.MenuItem;
import p.pc0;
import p.l64;
import java.util.ArrayList;
import p.oc0;
import p.nc0;
import android.os.SystemClock;
import java.lang.Runnable;
import p.dx7;
import p.mz7;
import java.lang.AssertionError;
import p.tk7;
import p.ab3;
import p.jp3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LitePageView;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.vk7;
import p.f67;
import android.view.Window$Callback;
import androidx.appcompat.widget.Toolbar;
import p.nq5;
import android.animation.Animator;
import p.d87;
import android.animation.Animator$AnimatorListener;
import p.i80;
import java.lang.Double;

public class vf implements j52, c67, k64, z5, yx6, a24, nz, m25, n60, pv6, bu0, tr3, vc1	// class@0029e8 from classes.dex
{
    public final int a;
    public Object b;

    public void vf(){
       this.a = 25;
       super(25);
    }
    public void vf(int p0){
       Handler handler;
       Handler handler1;
       this.a = p0;
       int i = 7;
       if (p0 != i) {
          int i1 = 1;
          int i2 = 0;
          if (p0 != 9) {
             if (p0 != 18) {
                if (p0 != 23) {
                   if (p0 != 25) {
                      if (p0 != 27) {
                         super();
                         this.b = new ConcurrentHashMap();
                         return;
                      }else {
                         super();
                         this.b = new LinkedList();
                         return;
                      }
                   }else {
                      super(new SparseArray());
                      return;
                   }
                }else {
                   super();
                   Pattern[] patternArray = new Pattern[i];
                   patternArray[i2] = Pattern.compile("spotify:user:\([a-zA-Z0-9%_~+.\\-]+\)");
                   patternArray[i1] = Pattern.compile("spotify%3Auser%3A\([^%\\s]+\)");
                   patternArray[2] = Pattern.compile("spotify\(?::user:\([a-zA-Z0-9%_~+.\\-]+\)\)?:playlist:\([a-zA-Z0-9]+\)");
                   patternArray[3] = Pattern.compile("spotify\(?:%3Auser%3A\([^%]+\)\)?%3Aplaylist%3A\([a-zA-Z0-9]+\)");
                   patternArray[4] = Pattern.compile("spotify:user:\([a-zA-Z0-9%_~+.\\-]+\):cluster:\([a-zA-Z0-9]+\)");
                   patternArray[5] = Pattern.compile("spotify%3Auser%3A\([a-zA-Z0-9%_~+.\\-]+\)%3Acluster%3A\([a-zA-Z0-9]+\)");
                   patternArray[6] = Pattern.compile("searchview/.*username=\([^&]+\)");
                   this.b = patternArray;
                   return;
                }
             }else {
                super();
                return;
             }
          }else {
             super();
             Looper mainLooper = Looper.getMainLooper();
             if (Build$VERSION.SDK_INT >= 28) {
                handler = q3.h(mainLooper);
             }else {
                try{
                   Class[] uClassArray = new Class[]{Looper.class,Handler$Callback.class,Boolean.TYPE};
                   Object[] objArray = new Object[]{mainLooper,null,Boolean.TRUE};
                   handler1 = Handler.class.getDeclaredConstructor(uClassArray).newInstance(objArray);
                }catch(java.lang.IllegalAccessException e0){
                   handler1 = new Handler(mainLooper);
                }catch(java.lang.InstantiationException e0){
                }catch(java.lang.NoSuchMethodException e0){
                }catch(java.lang.reflect.InvocationTargetException e8){
                   Throwable cause = e8.getCause();
                   if (!cause instanceof RuntimeException) {
                      if (cause instanceof Error) {
                         throw cause;
                      }else {
                         throw new RuntimeException(cause);
                      }
                   }else {
                      throw cause;
                   }
                }
                handler = handler1;
             }
             this.b = handler;
             return;
          }
       }else {
          super();
          this.b = (Build$VERSION.SDK_INT >= 26)? new yn(): new uv1(8);
          return;
       }
    }
    public void vf(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void vf(Context p0,g54 p1,hs3 p2,oe7 p3,li5 p4,n56 p5){
       int i = 24;
       this.a = i;
       super();
       this.b = new HashMap();
       p0 = p0.getApplicationContext();
       dy1 uody1 = new dy1(12);
       zk ozk = (Build$VERSION.SDK_INT < i)? new zk(p1, new b7(23, p2)): new xq7(p1, 10, new n91(p0, 10, p2));
       this.d(new tc4(uody1, new xl0(p1, ozk)));
       this.d(new ga1(0, p3));
       this.d(new ga1(2, p5));
       this.d(new ak(p0, p2));
       this.d(new ga1(1, p4));
       return;
    }
    public void vf(SparseArray p0){
       this.a = 25;
       super();
       this.b = p0;
    }
    public void vf(ViewGroup p0){
       this.a = 8;
       super();
       this.b = p0.getOverlay();
    }
    public void vf(SignInHubActivity p0){
       this.a = 12;
       this.b = p0;
       super();
    }
    public void vf(MaterialButtonToggleGroup p0){
       this.a = 13;
       super(13, p0);
    }
    public void vf(Object p0){
       this.a = 15;
       super();
    }
    public void vf(String p0){
       this.a = 17;
       super();
       p0.getClass();
       this.b = p0;
    }
    public void vf(ac p0){
       this.a = 28;
       co5.o(p0, "eventSender");
       super();
       this.b = p0;
    }
    public void vf(vf p0){
       this.a = 17;
       super();
       this.b = p0.b;
    }
    public void vf(vf p0,int p1){
       this.a = 17;
       super(p0);
    }
    public void vf(vh0 p0){
       this.a = 22;
       super();
       if (p0 == null) {
          throw new NullPointerException("output");
       }
       this.b = p0;
       p0.F = this;
       return;
    }
    public void vf(vc1[] p0){
       this.a = 29;
       super();
       vc1[] ovc1Array = new vc1[p0.length];
       this.b = ovc1Array;
       System.arraycopy(p0, 0, ovc1Array, 0, p0.length);
    }
    public static Object p(Object[] p0,int p1,va7 p2){
       int i = (!((p1 & 0x01)))? 400: 700;
       p1 = ((p1 & 0x02))? 1: 0;
       int len = p0.length;
       object oobject = null;
       int i1 = Integer.MAX_VALUE;
       int i2 = 0;
       while (i2 < len) {
          object oobject1 = p0[i2];
          int i3 = p2.f(oobject1) - i;
          i3 = Math.abs(i3) * 2;
          int i4 = (p2.g(oobject1) == p1)? 0: 1;
          i3 = i3 + i4;
          if (oobject == null || i1 > i3) {
             oobject = oobject1;
             i1 = i3;
          }
          i2 = i2 + 1;
       }
       return oobject;
    }
    public static CharSequence w(Object p0){
       Objects.requireNonNull(p0);
       if (p0 instanceof CharSequence) {
       }else {
          p0 = p0.toString();
       }
       return p0;
    }
    public final void A(int p0,int p1){
       this.b.U0(p0, p1);
    }
    public final void B(int p0,int p1){
       this.b.Q0(p0, p1);
    }
    public final void C(int p0,long p1){
       this.b.S0(p0, p1);
    }
    public final void D(float p0,int p1){
       vf tb = this.b;
       tb.getClass();
       tb.Q0(p1, Float.floatToRawIntBits(p0));
    }
    public final void E(int p0,w36 p1,Object p2){
       vf tb = this.b;
       tb.a1(p0, 3);
       p1.g(p2, tb.F);
       tb.a1(p0, 4);
    }
    public final void F(int p0,int p1){
       this.b.U0(p0, p1);
    }
    public final void G(int p0,long p1){
       this.b.d1(p0, p1);
    }
    public final void H(int p0,w36 p1,Object p2){
       this.b.W0(p0, p2, p1);
    }
    public final void I(int p0,int p1){
       this.b.Q0(p0, p1);
    }
    public final void J(int p0,long p1){
       this.b.S0(p0, p1);
    }
    public final void K(int p0,int p1){
       this.b.b1(p0, ((p1 >> 31) ^ (p1 << 1)));
    }
    public final void L(int p0,long p1){
       this.b.d1(p0, ((p1 >> 63) ^ (p1 << 1)));
    }
    public final void M(int p0,int p1){
       this.b.b1(p0, p1);
    }
    public final void N(int p0,long p1){
       this.b.d1(p0, p1);
    }
    public final void a(View p0,ValueAnimator p1,boolean p2){
       this.b.add(new ke(p0, p1, p2));
       if (this.b.size() == 1) {
          this.v();
       }
       return;
    }
    public final Object b(){
       vf tb = this.b;
       SQLiteDatabase sQLiteDataba = tb.b.b();
       sQLiteDataba.beginTransaction();
       String[] stringArray = new String[0];
       sQLiteDataba.setTransactionSuccessful();
       sQLiteDataba.endTransaction();
       Iterator iterator = u16.T(sQLiteDataba.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", stringArray), q16.a).iterator();
       while (iterator.hasNext()) {
          tb.c.a(iterator.next(), 1);
       }
       return null;
    }
    public final String c(String p0,Object[] p1){
       String str1;
       int len = p1.length;
       int i = 0;
       while (i < len) {
          object oobject = p1[i];
          String str = String.valueOf(oobject);
          if (oobject instanceof URI) {
             String scheme = oobject.getScheme();
             if (!"http".equals(scheme) && !"https".equals(scheme)) {
                str1 = (scheme != null)? scheme.concat(":AnonymizedMarvin"): "<no colon, ".append(oobject.toString().length()).append(" characters>").toString();
             }else {
                str1 = en6.s(scheme, "://").append(oobject.getHost()).append("/AnonymizedMarvin").toString();
             }
          }else {
             str1 = this.l(str);
          }
          if (!str1.equals(str)) {
             p1[i] = str1;
          }
          i = i + 1;
       }
       return String.format(Locale.US, this.l(p0), p1);
    }
    public final void d(cu1 p0){
       this.b.put(p0.a(), p0);
    }
    public synchronized final void dispose(){
       vf tb = this.b;
       int len = tb.length;
       for (int i = 0; i < len; i = i + 1) {
          tb[i].dispose();
       }
       return;
    }
    public void e(StringBuilder p0,Iterator p1){
       if (p1.hasNext()) {
          Appendable uAppendable = p0+vf.w(p1.next());
          while (p1.hasNext()) {
             uAppendable.append(this.b).append(vf.w(p1.next()));
          }
       }
       return;
    }
    public Typeface f(Context p0,xb2 p1,Resources p2,int p3){
       yb2 oyb2;
       Typeface typeface;
       long l;
       if ((oyb2 = vf.p(p1.a, p3, new b7(3, this))) == null) {
          return null;
       }
       yb2 f = oyb2.f;
       yb2 a = oyb2.a;
       if ((typeface = pa7.a.m(p0, p2, f, a, p3)) != null) {
          pa7.b.c(pa7.b(p2, f, a, 0, p3), typeface);
       }
       try{
          oyb2 = 0;
          if (typeface != null) {
             Field declaredFiel = Typeface.class.getDeclaredField("native_instance");
             declaredFiel.setAccessible(true);
             l = declaredFiel.get(typeface).longValue();
          label_0058 :
             if (l - oyb2) {
                this.b.put(Long.valueOf(l), p1);
             }
             return typeface;
          }
       }catch(java.lang.NoSuchFieldException e2){
          Log.e("TypefaceCompatBaseImpl", l, e2);
       }catch(java.lang.IllegalAccessException e2){
          Log.e("TypefaceCompatBaseImpl", l, e2);
       }
       l = oyb2;
       goto label_0058 ;
    }
    public final void g(vf p0){
       this.b = p0;
       Log.isLoggable("FirebaseCrashlytics", 3);
    }
    public Typeface h(Context p0,dc2[] p1,int p2){
       Closeable uCloseable;
       if (p1.length < 1) {
          return null;
       }
       dc2 uodc2 = this.q(p2, p1);
       try{
          InputStream inputStream = p0.getContentResolver().openInputStream(uodc2.a);
          try{
             ry7.f(inputStream);
             return this.k(p0, inputStream);
          }catch(java.io.IOException e0){
             ry7.f(uCloseable);
             return null;
          }
       }catch(java.io.IOException e0){
          uCloseable = null;
       }
    }
    public final j07 i(Object p0){
       return vv7.t(Boolean.TRUE);
    }
    public final Object j(j07 p0){
       if (p0.f()) {
          this.b.c.a.k(p0.e());
       }else {
          this.b.c.a.j(p0.d());
       }
       return null;
    }
    public Typeface k(Context p0,InputStream p1){
       File uFile;
       if ((uFile = ry7.G(p0)) == null) {
          return null;
       }
       try{
          if (!ry7.j(uFile, p1)) {
             uFile.delete();
             return null;
          }else {
             uFile.delete();
             return Typeface.createFromFile(uFile.getPath());
          }
       }catch(java.lang.RuntimeException e0){
          uFile.delete();
          return e0;
       }
    }
    public final String l(String p0){
       int i3;
       if (p0 == null) {
          return null;
       }
       StringBuilder str = new StringBuilder(p0.length());
       vf tb = this.b;
       int len = tb.length;
       for (int i = 0; i < len; i = i + 1) {
          str.setLength(0);
          Matcher matcher = tb[i].matcher(p0);
          int i1 = 0;
          while (matcher.find()) {
             int i2 = 1;
             while (i2 <= matcher.groupCount()) {
                if ((i3 = matcher.start(i2)) != -1) {
                   str = str.append(p0, i1, i3).append("AnonymizedMarvin");
                   i1 = matcher.end(i2);
                }
                i2 = i2 + 1;
             }
          }
          str = str.append(p0, i1, p0.length());
          p0 = str.toString();
       }
       return p0;
    }
    public Typeface m(Context p0,Resources p1,int p2,String p3,int p4){
       File uFile;
       if ((uFile = ry7.G(p0)) == null) {
          return null;
       }
       try{
          if (!ry7.i(uFile, p1, p2)) {
             uFile.delete();
             return null;
          }else {
             uFile.delete();
             return Typeface.createFromFile(uFile.getPath());
          }
       }catch(java.lang.RuntimeException e0){
          uFile.delete();
          return null;
       }
    }
    public final void n(e64 p0,MenuItem p1){
       this.b.x.removeCallbacksAndMessages(p0);
    }
    public final void o(e64 p0,l64 p1){
       Object obj = null;
       this.b.x.removeCallbacksAndMessages(obj);
       int i = this.b.z.size();
       int i1 = 0;
       while (true) {
          int i2 = -1;
          if (i1 < i) {
             if (p0 == this.b.z.get(i1).b) {
             label_002d :
                if (i1 == i2) {
                   return;
                }
                if ((i1 = i1 + 1) < this.b.z.size()) {
                   obj = this.b.z.get(i1);
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             i1 = -1;
             goto label_002d ;
          }
       }
       nc0 i3 = new nc0(this, obj, p1, p0, 0);
       this.b.x.postAtTime(i, p0, (SystemClock.uptimeMillis() + 200));
       return;
    }
    public final void onSuccess(Object p0){
       vf tb = this.b;
       int i = tb.b.a();
       Iterator iterator = tb.e().iterator();
       while (iterator.hasNext()) {
          File uFile = iterator.next();
          if (!p0.contains(uFile.getName()) && (dx7.b(uFile, true) - (long)i)) {
             dx7.g(uFile);
          }
       }
       return;
    }
    public dc2 q(int p0,dc2[] p1){
       return vf.p(p1, p0, new g54(this));
    }
    public final String r(Iterable p0){
       Iterator iterator = p0.iterator();
       try{
          StringBuilder str = "";
          this.e(str, iterator);
          return str;
       }catch(java.io.IOException e2){
          throw new AssertionError(e2);
       }
    }
    public final void s(tk7 p0){
       co5.o(p0, "viewUri");
       vf tb = this.b;
       tb.getClass();
       jp3 ojp3 = LitePageView.i();
       ojp3.d("enter");
       ojp3.c("lite/now-playing-view/lyrics-fullscreen");
       ojp3.e(p0.a);
       tb.a.a(ojp3.build());
    }
    public final void t(vk7 p0){
       co5.o(p0, "viewUri");
       vf tb = this.b;
       tb.getClass();
       jp3 ojp3 = LitePageView.i();
       ojp3.d("exit");
       ojp3.c("lite/now-playing-view/lyrics-fullscreen");
       ojp3.e(p0.a());
       tb.a.a(ojp3.build());
    }
    public final boolean u(MenuItem p0){
       Toolbar c0;
       int i = 0;
       switch (this.a){
           case 1:
           default:
             if (this.b.a0.f(p0)) {
                i = true;
             }else if((c0 = this.b.c0) != null){
                i = c0.u(p0);
             }
             return i;
       }
       return this.b.G.onMenuItemSelected(i, p0);
    }
    public final void v(){
       ke oke = this.b.element();
       oke.a.setVisibility(0);
       ke b = oke.b;
       b.setTarget(oke.a);
       b.cancel();
       b.start();
       b.addListener(new d87(this, 2, oke));
    }
    public final void x(int p0,boolean p1){
       this.b.M0(p0, p1);
    }
    public final void y(int p0,i80 p1){
       this.b.O0(p0, p1);
    }
    public final void z(int p0,double p1){
       vf tb = this.b;
       tb.getClass();
       tb.S0(p0, Double.doubleToRawLongBits(p1));
    }
}
