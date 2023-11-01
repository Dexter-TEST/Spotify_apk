package com.spotify.lite.app.LiteApplication;
import p.b21;
import p.ni0;
import java.lang.Object;
import p.ay6;
import p.mi0;
import p.jc;
import p.ld;
import p.sc4;
import java.lang.String;
import p.md;
import java.lang.Long;
import p.fn0;
import android.content.Context;
import com.jakewharton.processphoenix.ProcessPhoenix;
import rxdogtag2.RxDogTag;
import java.util.Objects;
import p.vs3;
import p.x06;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Class;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import p.on3;
import java.util.Set;
import java.util.Collections;
import p.pn3;
import p.py0;
import p.vp;
import p.bt3;
import io.reactivex.rxjava3.core.Observable;
import p.pp;
import p.yf2;
import p.rm;
import p.bi5;
import p.mx6;
import p.ft6;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import p.up0;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.kr3;
import p.yo3;
import com.spotify.base.java.logging.Logger;
import p.vf;
import p.az5;
import java.util.List;
import java.util.Arrays;
import p.ge6;
import p.gl;
import p.jl;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import p.sx0;
import p.tx0;
import p.nn3;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Thread;
import p.eq3;
import io.reactivex.rxjava3.core.Single;
import p.cq3;
import io.reactivex.rxjava3.core.Completable;
import p.am0;
import java.lang.Runnable;
import p.ok0;
import p.jk0;
import p.bv1;
import p.v05;
import p.fp3;
import p.ti4;
import p.id;
import p.ep3;
import p.t00;
import android.os.Build$VERSION;
import p.qm3;
import p.tm5;
import p.ga5;
import p.l16;
import java.util.ArrayList;
import p.mg1;
import java.util.Iterator;
import com.spotify.performance.viewloadtracking.events.proto.ViewLoadSequence;
import p.an5;
import p.pv5;
import p.ov5;
import p.uo3;
import p.qc0;
import p.to3;
import p.rp;
import android.content.ComponentCallbacks;
import p.sk5;
import p.dk3;
import p.fk3;
import p.y87;
import p.km3;
import p.x87;
import p.e16;
import p.ab3;
import p.pm3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteAppStartedNonAuth;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.zq7;
import p.bp6;
import p.mq3;
import p.an3;
import com.spotify.compression.extraction.ExtractCompressedLibraryWorker;
import android.app.ActivityManager;
import p.n6;
import p.rm3;
import android.app.ActivityManager$MemoryInfo;

public class LiteApplication extends b21	// class@00090e from classes.dex
{
    public y87 A;
    public DisplayOrchestrator B;
    public LiteLifecycleLogger C;
    public ac D;
    public km3 E;
    public rp3 F;
    public mq3 G;
    public sa1 H;
    public zq7 I;
    public o11 J;
    public bv1 K;
    public EventSenderAppForegroundState L;
    public final fn0 M;
    public pn3 b;
    public fp3 c;
    public tm5 t;
    public rm6 v;
    public gw3 w;
    public LiteAccountObserver x;
    public mt6 y;
    public uo3 z;
    public static final mi0 N;

    static {
       jc c;
       mi0 value = ni0.a.getValue();
       LiteApplication.N = value;
       if (value.b != null) {
       }else {
          long l = value.a.a.a();
          if ((c = value.c) != null) {
             c.h("cold_startup", l, null, true, true);
          }
          value.b = Long.valueOf(l);
          value.b("app_init");
       }
    }
    public void LiteApplication(){
       super();
       this.M = new fn0();
    }
    public final void onCreate(){
       super.onCreate();
       if (ProcessPhoenix.a(this)) {
          return;
       }
       RxDogTag.install();
       LiteApplication tb = this.b;
       Objects.requireNonNull(tb);
       vs3 ovs3 = new vs3(5, tb);
       RxJavaPlugins.a = new x06(ovs3);
       tb = this.b;
       String str = this.getString(R.string.client_core_version);
       String packageName = this.getPackageName();
       tb.getClass();
       FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
       instance.setCustomKey("CORE_VERSION", str);
       if (packageName == null) {
          packageName = "null";
       }
       instance.setCustomKey("PACKAGE_INSTALLER", packageName);
       int i = 0;
       pn3 b = tb.b;
       py0 d = b.d;
       d.e();
       d.c(b.b.c.c().map(new pp(2)).filter(new rm(1)).switchMap(new mx6(16, b)).subscribe(new ft6(b, 1, Collections.singleton(new on3(instance, i)))));
       int i1 = 3;
       kr3[] okr3Array = new kr3[i1];
       pn3 a = tb.a;
       okr3Array[i] = a.c;
       okr3Array[1] = a.d;
       okr3Array[2] = a.e;
       Logger.a = Collections.unmodifiableList(Arrays.asList(okr3Array));
       Logger.b = new vf(23);
       Logger.c = new az5();
       jl.s(new ge6(new up0(6, new on3(instance, 2))));
       yo3 b1 = a.b;
       this.registerActivityLifecycleCallbacks(b1);
       tx0[] otx0Array = new tx0[]{b1,a.a};
       Thread.setDefaultUncaughtExceptionHandler(new nn3(Thread.getDefaultUncaughtExceptionHandler(), new on3(instance, 1), Observable.create(new up0(2, new File(this.getFilesDir(), ".Fabric/com.crashlytics.sdk.android.crashlytics-core/log-files"))).debounce(200, TimeUnit.MILLISECONDS, s36.b).take(1), new sx0(otx0Array)));
       Object[] objArray = new Object[]{str};
       Logger.e("Fabric & Crashlytics started, core version: \"%s\"", objArray);
       LiteApplication ty = this.y;
       this.M.c(ty.c().flatMapCompletable(new cq3(ty, i)).c(Completable.j(new am0(21, ty))).subscribe());
       ty = this.K;
       bv1 vs3 d1 = ty.d;
       Single single = ty.c.subscribeOn(d1).observeOn(d1);
       d1 = new vs3(9, ty);
       this.M.c(single.subscribe(d1, new v05(4)));
       tb = this.c;
       fp3 c = tb.c;
       Objects.requireNonNull(c);
       tb.a.c(tb.b.b().observeOn(id.a()).subscribe(new ep3(c, i)));
       if (Build$VERSION.SDK_INT < 33) {
          this.M.c(this.c.c.distinctUntilChanged().subscribe(new qm3(this, i)));
       }
       ga5 oga5 = this.t.get();
       oga5.a.c.add(oga5.b);
       ga5 a1 = oga5.a;
       _monitor_enter(a1);
       if (!a1.f.isDisposed()) {
          a1.f.dispose();
       }
       a1.f = a1.d.observeOn(a1.e).subscribe(new mg1(23, a1), new v05(19));
       Iterator iterator = a1.b.iterator();
       while (iterator.hasNext()) {
          a1.d.onNext(iterator.next());
       }
       a1.b.clear();
       a1.a = true;
       _monitor_exit(a1);
       oga5 = oga5.c;
       if (oga5.c == null) {
          pv5 a2 = oga5.a;
          Objects.requireNonNull(a2);
          oga5.c = oga5.b.a.hide().subscribe(new vs3(10, a2));
       }
       ty = this.z;
       this.M.c(ty.b.a().doOnSuccess(new to3(ty, i)).doOnError(new to3(ty, 1)).ignoreElement().n(new rp(11)).subscribe());
       this.registerActivityLifecycleCallbacks(this.v);
       this.registerComponentCallbacks(this.w);
       sk5 z = sk5.z;
       z.w.a(this.x);
       z.w.a(this.B);
       z.w.a(this.C);
       z.w.a(this.L);
       tb = this.A;
       y87 d2 = tb.d;
       d2.e();
       d2.c(tb.b.a().switchMapCompletable(new x87(tb, i)).subscribe());
       this.M.c(this.E.a().distinctUntilChanged().flatMapCompletable(new e16(11, this)).subscribe());
       tb = this.D;
       tb.getClass();
       pm3 opm3 = LiteAppStartedNonAuth.g();
       opm3.c();
       tb.a.a(opm3.build());
       tb = this.I;
       tb.getClass();
       tb.t.c(new bp6(tb, this));
       this.M.c(this.E.a().observeOn(id.a()).subscribe(new qm3(this, 1)));
       ty = this.G;
       this.M.c(ty.a.d.filter(new pp(i1)).flatMapCompletable(new up0(2, ty)).subscribe());
       ExtractCompressedLibraryWorker.h(this);
       return;
    }
    public final void onTrimMemory(int p0){
       ActivityManager uActivityMan;
       super.onTrimMemory(p0);
       if (ProcessPhoenix.a(this)) {
          return;
       }
       if ((uActivityMan = n6.e(this, ActivityManager.class)) == null) {
          return;
       }
       FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
       rm3 orm3 = new rm3();
       uActivityMan.getMemoryInfo(orm3);
       instance.setCustomKey("LOW_MEMORY", orm3.lowMemory);
       instance.setCustomKey("FREE_MEMORY", orm3.availMem);
       instance.setCustomKey("TRIM_MEMORY_THRESHOLD", orm3.threshold);
       instance.setCustomKey("TRIM_MEMORY_LEVEL", p0);
       return;
    }
}
