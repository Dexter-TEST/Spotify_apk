package p.uf;
import p.j15;
import p.c26;
import p.wm0;
import p.bi5;
import p.ca0;
import p.w00;
import p.xl3;
import p.br5;
import p.lq6;
import p.sk7;
import io.reactivex.rxjava3.core.SingleTransformer;
import p.vm0;
import java.lang.Object;
import p.ns4;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.po3;
import p.w24;
import io.reactivex.rxjava3.core.Emitter;
import p.u00;
import p.ir0;
import p.kk7;
import p.iz3;
import java.lang.String;
import p.co5;
import p.hy3;
import p.gy3;
import p.u44;
import p.gu0;
import p.ay6;
import p.dk3;
import p.vj3;
import p.qw3;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import p.lw3;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import com.spotify.lyrics.core.ui.ExtraEndSpaceLinearLayoutManager;
import android.content.Context;
import android.view.View;
import p.hr5;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.LinkedHashMap;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View$MeasureSpec;
import java.lang.Integer;
import java.util.Map;
import java.lang.Number;
import p.zf2;
import p.dj0;
import p.g37;
import p.hz3;
import p.iy3;
import java.lang.IllegalArgumentException;
import p.lv1;
import p.tp2;
import p.wp6;
import p.ej0;
import java.lang.Class;
import p.b7;
import p.gh4;
import android.util.SparseArray;
import java.util.List;
import p.yq5;
import p.rk7;
import p.mi7;
import p.s90;
import java.lang.Throwable;
import p.vb0;
import p.tx5;
import p.eb3;
import p.wb0;
import p.ng2;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.up0;
import p.yf2;
import p.nx5;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import p.b52;
import p.oy0;
import p.yb;
import p.g52;
import p.u53;
import p.i51;
import p.bb4;
import p.p25;
import android.util.Log;
import p.yy6;
import java.util.concurrent.ExecutorService;
import p.tu6;
import p.ny0;
import p.zb;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import p.i52;
import p.xj0;
import p.a70;
import java.util.Locale;
import p.x61;
import android.os.Build;
import android.os.Build$VERSION;
import p.et0;
import p.wc6;
import p.es;
import java.util.concurrent.Executor;
import p.a28;
import p.bu0;
import p.kf6;
import p.i77;
import p.ze;
import p.ly0;
import p.wx0;
import java.io.File;
import p.my0;
import java.util.concurrent.Callable;
import p.if7;
import java.lang.Boolean;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Thread;
import p.hi7;
import p.fy0;
import p.vz0;
import p.iz7;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p.c52;
import p.t5;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.lang.NullPointerException;
import java.lang.IllegalStateException;
import p.bx5;
import p.bs2;
import p.bv5;
import p.wc3;
import p.wh3;
import java.lang.StringBuilder;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import p.cx5;
import p.fx5;
import p.xp7;
import p.h50;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p.g50;
import android.widget.FrameLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import p.wh7;
import p.dh7;
import p.yo4;
import p.vp7;
import p.ef;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import p.av0;
import p.jg;
import android.graphics.Rect;
import p.uv1;
import p.aa3;
import p.pp7;
import android.view.WindowInsets;
import p.hh7;
import p.rz;
import p.wv0;
import java.util.Objects;

public final class uf implements j15, c26, wm0, bi5, ca0, w00, xl3, br5, lq6, sk7, SingleTransformer, vm0	// class@0028a1 from classes.dex
{
    public final int a;
    public final Object b;

    public void uf(){
       this.a = 0;
       super();
       this.b = new ns4();
    }
    public void uf(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void uf(InternetMonitor p0){
       this.a = 1;
       super();
       this.b = new w24(1, new po3(p0, 1));
    }
    public long a(long p0){
       switch (this.a){
           case 3:
             p0 = -1;
             break;
           default:
       }
       return p0;
    }
    public Object apply(Object p0,Object p1){
       gy3 b1;
       gu0 b2;
       iz3 i;
       Integer integer;
       Object obj2;
       uf ouf = this;
       hy3 obj = p0;
       uf b = ouf.b;
       uf a = ouf.a;
       switch (a){
           case 0:
             Object obj1 = p1;
             co5.o(obj, "<anonymous parameter 0>");
             co5.o(obj1, "lyricsConfig");
             obj = b.a;
             obj.f.t();
             if ((b1 = obj.b) != null && ((b2 = b1.b) != null && (i = b2.i) != null)) {
                i.c(obj.g.getValue());
             }
             if ((obj = b.e) != null) {
                iz3 a1 = obj1.a;
                qw3 a2 = a1.a;
                ArrayList uArrayList = new ArrayList(aj0.b0(a2));
                Iterator iterator = a2.iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(iterator.next().b);
                }
                Context context = obj.getContext();
                co5.l(context, "context");
                obj.setLayoutManager(new ExtraEndSpaceLinearLayoutManager(context, obj.getHeight()));
                Context context1 = obj.getContext();
                co5.l(context1, "context");
                boolean b3 = false;
                View view = LayoutInflater.from(context1).inflate(R.layout.lyrics_text_view, obj, b3);
                co5.j(view, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
                LinkedHashMap linkedHashMa = new LinkedHashMap();
                ArrayList uArrayList1 = new ArrayList();
                Iterator iterator1 = uArrayList.iterator();
                while (iterator1.hasNext()) {
                   String str = iterator1.next();
                   if ((integer = linkedHashMa.get(str)) == null) {
                      view.setText(str);
                      int i1 = obj.getPaddingEnd() + obj.getPaddingStart();
                      int i2 = obj.getWidth() - i1;
                      view.measure(View$MeasureSpec.makeMeasureSpec(i2, 0x40000000), View$MeasureSpec.makeMeasureSpec(b3, b3));
                      integer = Integer.valueOf(view.getLineCount());
                      linkedHashMa.put(str, integer);
                   }
                   uArrayList1.add(Integer.valueOf(integer.intValue()));
                }
                view.setText(dj0.q0(uArrayList, " ", null, null, null, 62));
                view.measure(View$MeasureSpec.makeMeasureSpec(b3, b3), View$MeasureSpec.makeMeasureSpec(b3, b3));
                int measuredHeig = view.getMeasuredHeight();
                int height = obj.getHeight();
                linkedHashMa = 1;
                if (measuredHeig > 0) {
                   b3 = true;
                }
                if (b3) {
                   if ((measuredHeig = height / measuredHeig) && measuredHeig != linkedHashMa) {
                      height = height / (measuredHeig - (measuredHeig % 2));
                   }
                   obj.d1 = new g37(height, uArrayList1);
                   if ((obj = b.e) != null) {
                      obj.q0(new hz3(obj1));
                      return new gu0(new iy3(a1), obj1);
                   }else {
                      co5.N("viewBinder");
                      throw null;
                   }
                }else {
                   throw new IllegalArgumentException("Failed requirement.".toString());
                }
             }else {
                co5.N("viewBinder");
                throw null;
             }
             break;
           case 1:
             obj2 = p1;
             switch (a){
                 case 1:
                   b.accept(obj, obj2);
                   break;
                 default:
                   b.accept(obj2);
             }
             break;
           default:
             obj2 = p1;
             switch (a){
                 case 1:
                   b.accept(obj, obj2);
                   break;
                 default:
                   b.accept(obj2);
             }
             return obj;
       }
       return obj;
    }
    public void b(lv1 p0){
       uf tb = this.b;
       switch (this.a){
           case 0:
           default:
             wp6 c = tb.c;
             if (c instanceof ej0) {
                ej0 h = c.H;
                h.getClass();
                h.b.q(ej0.p(p0));
                h.b.getClass();
             }
             return;
       }
       tp2.v(tb);
       throw null;
    }
    public gh4 c(int p0){
       List list;
       if ((list = this.b.get(p0)) != null && !list.isEmpty()) {
          return list.get(0);
       }
       throw new IllegalArgumentException(tp2.k("Cannot find the wrapper for global view type ", p0));
    }
    public void d(int p0,int p1){
       this.b.l(p0, p1);
    }
    public rk7 e(gh4 p0){
       return new mi7(this, p0);
    }
    public void f(int p0,int p1){
       this.b.i(p0, p1);
    }
    public void g(s90 p0,Throwable p1){
       String message;
       uf tb = this.b;
       switch (this.a){
           case 0:
             co5.q(p0, "call");
             co5.q(p1, "t");
             tb.d(eb3.h(p1));
             return;
           case 1:
             co5.q(p0, "call");
             co5.q(p1, "t");
             tb.d(eb3.h(p1));
             return;
           case 2:
             co5.q(p0, "call");
             co5.q(p1, "t");
             tb.d(eb3.h(p1));
             return;
           default:
             co5.o(p0, "p0");
             co5.o(p1, "throwable");
             if (tb != null) {
                Integer integer = Integer.valueOf(-1);
                if ((message = p1.getMessage()) == null) {
                   message = "";
                }
                tb.b(integer, message);
             }
             return;
       }
    }
    public Single h(Single p0){
       switch (this.a){
           case 0:
           default:
             return p0.onErrorResumeNext(new up0(9, this));
       }
       return p0.toObservable().compose(this.b).singleOrError();
    }
    public Object i(nx5 p0){
       p25 k;
       a70 uoa701;
       boolean b4;
       c52 e0;
       ny0 h;
       vz0 ovz0;
       uf ouf = this;
       nx5 onx5 = p0;
       uf b = ouf.b;
       switch (ouf.a){
           case 0:
           case 1:
           default:
             b.getClass();
             b52 uob52 = onx5.a(b52.class);
             oy0 ooy0 = onx5.a(oy0.class);
             tp2.v(onx5.a(yb.class));
             String str = "0.0";
             uob52.a();
             b52 a = uob52.a;
             u53 ou53 = new u53(a, a.getPackageName(), onx5.a(g52.class));
             i51 oi51 = new i51(uob52);
             bb4 uobb4 = (ooy0 == null)? new bb4(): ooy0;
             p25 op25 = new p25(uob52, a, ou53, oi51);
             String str1 = "FirebaseCrashlytics";
             Log.isLoggable(str1, 3);
             ny0 ony0 = v4;
             ny0 ony01 = v4;
             ony0 = new ny0(uob52, ou53, uobb4, oi51, new yy6(10), new yy6(9), tu6.h("Crashlytics Exception Handler"));
             try{
                ony0 = 0;
                op25.h = op25.l.c();
                op25.d = op25.c.getPackageManager();
                String packageName = op25.c.getPackageName();
                op25.e = packageName;
                PackageInfo packageInfo = op25.d.getPackageInfo(packageName, ony0);
                op25.k = packageInfo;
                op25.f = Integer.toString(packageInfo.versionCode);
                k = op25.k;
                packageName = (k.versionName == null)? str: k.versionName;
                op25.g = packageName;
                op25.i = op25.d.getApplicationLabel(op25.c.getApplicationInfo()).toString();
                op25.j = Integer.toString(op25.c.getApplicationInfo().targetSdkVersion);
                Future uFuture = 1;
             }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                Log.e(str1, "Failed init", e0);
                k = 0;
             }
             Throwable throwable = null;
             if (!k) {
                Log.e(str1, "Unable to start Crashlytics.", throwable);
             }else {
                ExecutorService uExecutorSer = tu6.h("com.google.firebase.crashlytics.startup");
                uob52.a();
                i52 b1 = uob52.c.b;
                p25 op251 = op25.l;
                p25 a1 = op25.a;
                p25 op252 = op25.f;
                p25 op253 = op25.g;
                p25 c = op25.c;
                int i = xj0.o0(c, "com.crashlytics.ApiEndpoint", "string");
                String str2 = "";
                String str3 = (i > 0)? c.getString(i): str2;
                p25 op254 = op25.m;
                yy6 oyy6 = new yy6(11);
                u44 ou44 = new u44(22, oyy6);
                a70 uoa70 = new a70(a, ony0);
                Locale uS = Locale.US;
                String str4 = str;
                Object[] objArray = new Object[1];
                objArray[ony0] = b1;
                x61 ox61 = new x61(str3, String.format(uS, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", objArray), a1);
                Object[] objArray1 = new Object[2];
                String g = u53.g;
                objArray1[ony0] = Build.MANUFACTURER.replaceAll(g, str2);
                objArray1[1] = Build.MODEL.replaceAll(g, str2);
                String str5 = String.format(uS, "%s/%s", objArray1);
                String str6 = Build$VERSION.INCREMENTAL.replaceAll(g, str2);
                String str7 = Build$VERSION.RELEASE.replaceAll(g, str2);
                wc6 int i1 = 4;
                String[] stringArray = new String[i1];
                stringArray[ony0] = xj0.n0(a);
                stringArray[1] = b1;
                stringArray[2] = op253;
                stringArray[3] = op252;
                String str8 = xj0.p(stringArray);
                if (op251.c() == null) {
                   i1 = 1;
                }
                i1 = new wc6(b1, str5, str6, str7, op251, str8, op253, op252, et0.h(i1));
                i = 3;
                str2 = str1;
                wc6 owc6 = i1;
                p25 op255 = op25;
                es stringArray1 = new es(a, owc6, oyy6, ou44, uoa70, ox61, op254);
                stringArray.d(1, uExecutorSer).h(uExecutorSer, new b7(15, op255));
                ny0 ony02 = ony01;
                ny0 a2 = ony02.a;
                String str9 = xj0.n0(a2);
                Log.isLoggable(str2, i);
                String str10 = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app\'s build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";
                if (!xj0.j0(a2, "com.crashlytics.RequireBuildId")) {
                   Log.isLoggable(str2, i);
                }else if(!xj0.C0(str9)){
                   Log.e(str2, ".");
                   Log.e(str2, ".     |  | ");
                   str = ".     |  |";
                   Log.e(str2, str);
                   Log.e(str2, str);
                   Log.e(str2, ".   \\ |  | /");
                   Log.e(str2, ".    \\    /");
                   Log.e(str2, ".     \\  /");
                   Log.e(str2, ".      \\/");
                   Log.e(str2, ".");
                   Log.e(str2, str10);
                   Log.e(str2, ".");
                   Log.e(str2, ".      /\\");
                   Log.e(str2, ".     /  \\");
                   Log.e(str2, ".    /    \\");
                   Log.e(str2, ".   / |  | \\");
                   Log.e(str2, str);
                   Log.e(str2, str);
                   Log.e(str2, str);
                   Log.e(str2, ".");
                   boolean b6 = 0;
                label_0242 :
                   if (ou44) {
                      ny0 b2 = ony02.b;
                      b2.a();
                      b52 c1 = b2.c;
                      try{
                         i52 b3 = c1.b;
                         uoa701 = new a70(a2);
                         ony02.f = new kf6("crash_marker", 6, uoa701);
                         ony02.e = new kf6("initialization_marker", 6, uoa701);
                         yy6 oyy61 = new yy6(14);
                         str1 = a2.getPackageName();
                         String str11 = ony02.i.c();
                         PackageInfo packageInfo1 = a2.getPackageManager().getPackageInfo(str1, ony0);
                         str3 = Integer.toString(packageInfo1.versionCode);
                         String str12 = ((packageInfo1 = packageInfo1.versionName) == null)? str4: packageInfo1;
                         i77 v40 = new i77(b3, str9, str11, str1, str3, str12);
                         Log.isLoggable(str2, i);
                         ly0 v401 = new ly0(ony02.a, ony02.m, oyy61, ony02.i, ony02.c, uoa701, ony02.f, v40, ony02.n, new ze(a2, 2), ony02.k, stringArray);
                         ony02.h = v40;
                         int b5 = ony02.e.f().exists();
                         a28 uoa28 = ony02.m.a(new my0(ony02, 1));
                         try{
                            ony02.g = Boolean.TRUE.equals(if7.a(uoa28));
                            uoa28 = 0;
                         }catch(java.lang.Exception e0){
                            b6 = false;
                            ony02.g = b6;
                         }catch(java.lang.Exception e0){
                         }
                         Log.e(str2, "Crashlytics was not started due to an exception during initialization", e0);
                         ony02.h = null;
                      }catch(java.lang.Exception e0){
                         uoa701 = 0;
                      }
                   }else {
                      throw new IllegalStateException(str10);
                   }
                }
                ou44 = 1;
                goto label_0242 ;
             }
             return throwable;
       }
       return b;
    }
    public void j(s90 p0,bx5 p1){
       String str2;
       uf tb = this.b;
       String str = "response";
       String str1 = "call";
       switch (this.a){
           case 0:
             co5.q(p0, str1);
             co5.q(p1, str);
             if (p1.a()) {
                if ((p1 = p1.b) == null) {
                   wc3 owc3 = wc3.class;
                   if ((p0 = owc3.cast(p0.y().e.get(owc3))) != null) {
                      wc3 a = p0.a;
                      co5.h(a, "method");
                      Class declaringCla = a.getDeclaringClass();
                      co5.h(declaringCla, "method.declaringClass");
                      tb.d(eb3.h(new wh3("Response from "+declaringCla.getName()+'.'+a.getName()+" was null but response body type was declared as non-null")));
                   }else {
                      wh3 owh3 = new wh3();
                      co5.G(co5.class.getName(), owh3);
                      throw owh3;
                   }
                }else {
                   tb.d(p1);
                }
             }else {
                tb.d(eb3.h(new bs2(p1)));
             }
             return;
             break;
           case 1:
             co5.q(p0, str1);
             co5.q(p1, str);
             if (p1.a()) {
                tb.d(p1.b);
             }else {
                tb.d(eb3.h(new bs2(p1)));
             }
             return;
             break;
           case 2:
           default:
             co5.o(p0, str1);
             co5.o(p1, str);
             if (!p1.a() && tb != null) {
                Integer integer = Integer.valueOf(p1.a.t);
                if ((p1 = p1.c) == null || (str2 = p1.J()) == null) {
                   str2 = "";
                }
                tb.b(integer, str2);
             }
             return;
       }
       co5.q(p0, str1);
       co5.q(p1, str);
       tb.d(p1);
       return;
    }
    public void k(int p0,int p1){
       this.b.k(p0, p1);
    }
    public void l(int p0,int p1,Object p2){
       this.b.j(p0, p1, p2);
    }
    public xp7 m(View p0,xp7 p1){
       WindowInsets windowInsets;
       h50 d;
       int i = 0;
       int b = true;
       xp7 a = p1.a;
       Rect rect = null;
       uf tb = this.b;
       switch (this.a){
           case 0:
             b = tb.K(p1, rect);
             if (p1.d() != b) {
                uv1 ouv1 = new uv1(p1);
                ouv1.b.d(aa3.a(p1.b(), b, p1.c(), p1.a()));
                p1 = ouv1.b.b();
             }
             if ((windowInsets = p1.f()) != null) {
                WindowInsets windowInsets1 = hh7.b(p0, windowInsets);
                if (!windowInsets1.equals(windowInsets)) {
                   p1 = xp7.g(windowInsets1, p0);
                }
             }
             break;
           case 1:
             if (!yo4.a(tb.E, p1)) {
                tb.E = p1;
                int b1 = (p1.d() > 0)? true: false;
                tb.F = b1;
                if (b1 || tb.getBackground() != null) {
                   b = false;
                }
                tb.setWillNotDraw(b);
                if (!a.m()) {
                   b1 = tb.getChildCount();
                   while (i < b1) {
                      View childAt = tb.getChildAt(i);
                      if (!dh7.b(childAt) || (childAt.getLayoutParams().a == null || !a.m())) {
                         i = i + 1;
                      }
                   }
                }
                tb.requestLayout();
             }
             return p1;
             break;
           case 2:
             tb.getClass();
             if (dh7.b(tb)) {
                rect = p1;
             }
             if (!yo4.a(tb.x, rect)) {
                tb.x = rect;
                if (tb.I != null && tb.getTopInset() > 0) {
                   i = 1;
                }
                tb.setWillNotDraw((i ^ 0x01));
                tb.requestLayout();
             }
             return p1;
             break;
           case 3:
             tb.getClass();
             if (!dh7.b(tb)) {
                Rect rect1 = rect;
             }
             if (!yo4.a(tb.P, p1)) {
                tb.P = p1;
                tb.requestLayout();
             }
             return a.c();
             break;
           case 4:
             if ((d = tb.D) != null) {
                tb.w.Q.remove(d);
             }
             g50 og50 = new g50(tb.z, p1);
             tb.D = og50;
             BottomSheetBehavior q = tb.w.Q;
             if (!q.contains(og50)) {
                q.add(og50);
             }
             return p1;
             break;
           default:
             tb.h = p1.a();
             tb.i = p1.b();
             tb.j = p1.c();
             tb.e();
             return p1;
       }
       return p1;
    }
    public boolean test(Object p0){
       uf tb = this.b;
       switch (this.a){
           case 0:
             boolean b = false;
             int i = (!tb.length)? 1: 0;
             if (((i ^ 1)) && p0 instanceof wv0) {
                i = tb.length;
                int i1 = 0;
                while (i1 < i) {
                   if (tb[i1] == p0.a) {
                      b = true;
                      break ;
                   }
                   i1 = i1 + 1;
                }
             }
             return b;
             break;
           case 1:
             tp2.v(tb);
             throw false;
           case 2:
             return tb.isInstance(p0);
           default:
             return Objects.equals(p0, tb);
       }
    }
}
