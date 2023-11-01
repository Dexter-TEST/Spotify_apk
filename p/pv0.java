package p.pv0;
import p.kv0;
import android.content.Context;
import p.vg0;
import p.cn3;
import p.as7;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import com.spotify.connectivity.MobileDeviceInfo;
import p.ps1;
import p.g15;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import p.co5;
import p.tw0;
import com.spotify.clientfoundations.concurrency.async.Scheduler;
import p.tb6;
import p.he7;
import com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService;
import com.spotify.connectivity.sessionservice.SessionService;
import com.spotify.connectivity.sessionapi.SharedNativeSession;
import java.lang.IllegalStateException;
import java.lang.String;
import p.jl;
import android.os.Handler;
import android.os.HandlerThread;
import p.c0;
import p.t00;
import p.em0;
import java.lang.Runnable;
import com.spotify.core.coreservice.CoreService;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import p.df6;
import p.mt5;
import p.se6;
import p.qw0;
import com.spotify.clientfoundations.logging.logging.Logging;
import com.spotify.clientfoundations.logging.logging.Logging$Companion;
import p.eq3;
import io.reactivex.rxjava3.core.Single;
import p.v05;
import p.ir0;
import p.jw0;
import p.yf2;
import p.r45;
import android.content.pm.ApplicationInfo;
import java.io.File;
import p.tv;
import p.bn3;
import p.jj5;
import java.lang.StringBuilder;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import p.zn5;
import p.ao5;
import com.spotify.clientfoundations.cosmos.cosmos.Router;
import com.spotify.clientfoundations.core.corefullimpl.FullAuthenticatedScopeConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.nm3;
import p.kq3;
import java.lang.Class;
import com.spotify.connectivity.WebgateUserAgentPlatform;
import com.spotify.connectivity.WebgateUserAgentPlatform$Companion;
import com.spotify.clientfoundations.core.corelimitedimpl.LimitedAuthenticatedScopeConfiguration;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import android.os.Build;
import p.ox7;
import java.util.Locale;
import android.os.Build$VERSION;
import java.lang.Integer;
import java.util.Arrays;
import com.spotify.connectivity.auth.NativeLoginControllerConfiguration;
import com.spotify.connectivity.AuthenticatedScopeConfiguration;
import com.spotify.clientfoundations.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.connectivity.eventsenderanalyticsdelegate.EventSenderAnalyticsDelegate;
import com.spotify.connectivity.AnalyticsDelegate;
import p.sw0;
import p.pw0;
import p.re6;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import p.ov0;
import com.spotify.connectivity.auth.LoginControllerDelegate;
import java.lang.Thread;
import android.os.Looper;
import p.bu5;

public final class pv0 implements kv0	// class@0022d7 from classes.dex
{
    public final Context a;
    public final vg0 b;
    public final cn3 c;
    public final as7 d;
    public final EventSenderCoreBridge e;
    public final MobileDeviceInfo f;
    public final ps1 g;
    public final g15 h;
    public final Observable i;
    public final boolean j;
    public tw0 k;
    public qw0 l;
    public se6 m;
    public ConnectivityService n;
    public SessionService o;
    public CoreService p;
    public SharedNativeSession q;
    public ConnectivitySessionService r;
    public mt5 s;
    public df6 t;
    public he7 u;
    public tb6 v;

    public void pv0(Context p0,vg0 p1,cn3 p2,as7 p3,EventSenderCoreBridge p4,MobileDeviceInfo p5,ps1 p6,g15 p7,Observable p8){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = false;
    }
    public static final void a(pv0 p0){
       pv0 k = p0.k;
       co5.i(k);
       if (!k.a.isCurrentThread()) {
          throw new IllegalStateException("destroySessionServices should always be called on the core thread");
       }
       if (p0.r != null) {
          k = p0.v;
          co5.i(k);
          k.shutdown();
          p0.v = null;
          pv0 u = p0.u;
          co5.i(u);
          u.shutdown();
          p0.u = null;
          u = p0.r;
          co5.i(u);
          u.shutdown();
          p0.r = null;
          u = p0.o;
          co5.i(u);
          u.shutdown();
          p0.o = null;
          if ((u = p0.q) != null) {
             u.release();
          }
          p0.q = null;
       }
       return;
    }
    public final void b(){
       as7 c;
       tw0 a;
       if (this.p == null) {
          jl.d("Attempted to destroy un-started Core");
          return;
       }else {
          pv0 td = this.d;
          if (td.b == null) {
             throw new IllegalStateException("Not started".toString());
          }
          if ((c = td.c) != null) {
             c.removeCallbacksAndMessages(null);
          }
          if ((c = td.d) != null) {
             c.quit();
          }
          td.a.onNext(c0.a);
          td.b = null;
          if ((td = this.k) != null && (a = td.a) != null) {
             a.runBlocking(new em0(27, this));
          }
          if ((td = this.p) != null) {
             td.shutdown();
          }
          this.p = null;
          if ((td = this.n) != null) {
             td.shutdown();
          }
          this.n = null;
          if ((td = this.t) != null) {
             td.shutdown();
          }
          this.t = null;
          if ((td = this.s) != null) {
             td.shutdown();
          }
          this.s = null;
          if ((td = this.m) != null) {
             td.shutdown();
          }
          this.m = null;
          if ((td = this.l) != null) {
             td.shutdown();
          }
          this.l = null;
          if ((td = this.k) != null) {
             td.shutdown();
          }
          this.k = null;
          Logging.Companion.deinitLogging();
          return;
       }
    }
    public final void c(){
       tv otv;
       File cacheDir;
       pv0 opv0 = this;
       if (opv0.p != null) {
          jl.d("Attempted to re-start Core without destroying it first");
          return;
       }else {
          pv0 c = opv0.c;
          c0 a = c0.a;
          r45 or45 = c.b.b().doOnError(new v05(9)).map(new jw0(10)).onErrorReturnItem(a).blockingGet();
          Object[] objArray = new Object[3];
          cn3 FullAuthenticatedScopeConfiguration a1 = c.a;
          objArray[0] = a1.getApplicationInfo().dataDir;
          int i = 1;
          objArray[1] = a1.getFilesDir();
          objArray[2] = a1.getCacheDir();
          jl.i(or45.c(), "getCacheDir\(\) invalid response, dataDir=%s, files=%s, cache=%s", objArray);
          String str = "core";
          if (or45.c()) {
             otv = or45.b();
             if (otv.g != null) {
                File uFile = cn3.b(a1.getFilesDir(), "core-settings");
                String str1 = "pinned";
                File uFile1 = cn3.b(a1.getFilesDir(), str1);
                if ((cacheDir = a1.getCacheDir()) != null) {
                   c.c(new File(new File(cacheDir.getAbsoluteFile(), str), "settings"), uFile);
                }
                if ((cacheDir = a1.getCacheDir()) != null) {
                   c.c(new File(cacheDir, str1), uFile1);
                }
                if ((uFile1 = a1.getCacheDir()) != null) {
                   c.a(new File(new File(uFile1.getAbsoluteFile(), str).getAbsoluteFile(), "cache"));
                   c.a(new File(uFile1.getAbsoluteFile(), "esdk"));
                }
                a = new jj5(new bn3(otv, uFile));
             }else {
                jl.p(otv+" is not mounted");
             }
          }
          if (!a.c()) {
             jl.p("Core paths not available");
             return;
          }else {
             Object obj = a.b();
             Logging.Companion.initLogging(i);
             opv0.k = new tw0();
             opv0.l = new qw0();
             NativeRouter c1 = new NativeRouter();
             zn5 otv1 = new zn5(c1, new ao5(c1));
             pv0 k = opv0.k;
             co5.i(k);
             opv0.m = new se6(k, otv1);
             co5.l(obj, "corePaths");
             a1 = new FullAuthenticatedScopeConfiguration(null, null, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, 0, null, false, 0x7ffff, null);
             bn3 a2 = obj.a;
             a1.setCachePath(a2.i.getAbsolutePath());
             otv = a2.j;
             a1.setVolatileCachePath(otv.getAbsolutePath());
             bn3 b = obj.b;
             a1.setSettingsPath(b.getAbsolutePath());
             pv0 b1 = opv0.b;
             a1.setDeviceId(b1.d);
             int a3 = kq3.a;
             a1.setVersionNumber(a3);
             a1.setVersionName("1.9.0.49155");
             b1.getClass();
             a1.setClientId("7e7cf598605d47caba394c628e2735a2");
             a1.setNativeBundleId("full");
             pv0 f = opv0.f;
             a1.setDeviceType(f.getDeviceType());
             a1.setDeviceName(f.getName());
             a1.setModel(f.getModel());
             a1.setDescription(f.getModel());
             a1.setDescriptionShort(f.getModel());
             a1.setBrand(f.getBrand());
             WebgateUserAgentPlatform$Companion companion = WebgateUserAgentPlatform.Companion;
             a1.setDeviceModelName(companion.android());
             a1.setCanPlay(i);
             LimitedAuthenticatedScopeConfiguration v12 = new LimitedAuthenticatedScopeConfiguration(null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, 0, null, 0xffff, null);
             ConnectivityService tv i1 = a2.i;
             v12.setCachePath(i1.getAbsolutePath());
             v12.setVolatileCachePath(otv.getAbsolutePath());
             v12.setSettingsPath(b.getAbsolutePath());
             nm3 d = b1.d;
             v12.setDeviceId(d);
             v12.setVersionNumber(a3);
             v12.setVersionName("1.9.0.49155");
             v12.setClientId("7e7cf598605d47caba394c628e2735a2");
             v12.setNativeBundleId("limited");
             v12.setDeviceType(f.getDeviceType());
             v12.setDeviceName(f.getName());
             v12.setDescription(f.getModel());
             v12.setDescriptionShort(f.getModel());
             v12.setDeviceModelName(companion.android());
             ApplicationScopeConfiguration f1 = new ApplicationScopeConfiguration();
             f1.setClientId("7e7cf598605d47caba394c628e2735a2");
             f1.setCachePath(i1.getAbsolutePath());
             f1.setDeviceId(d);
             String mODEL = Build.MODEL;
             f1.setDeviceHardwareModel(mODEL);
             f1.setClientRevision(a3);
             f1.setClientVersionLong("1.9.0.49155");
             pv0 a4 = opv0.a;
             f1.setAccesspointLanguage(ox7.I(ox7.k(a4)));
             String str2 = str;
             LimitedAuthenticatedScopeConfiguration limitedAuthe = v12;
             Object[] objArray1 = new Object[4];
             objArray1[0] = b1.a();
             objArray1[1] = mODEL;
             int sDK_INT = Build$VERSION.SDK_INT;
             objArray1[2] = Integer.valueOf(sDK_INT);
             objArray1[3] = mODEL;
             String str3 = String.format(Locale.ENGLISH, "Spotify/%s %s/%d \(%s\)", Arrays.copyOf(objArray1, 4));
             co5.l(str3, "format\(locale, format, *args\)");
             f1.setDefaultHTTPUserAgent(str3);
             f1.setEnableClientToken(false);
             f1.setEncryptedPersistedClientToken(null);
             NativeLoginControllerConfiguration nativeLoginC = new NativeLoginControllerConfiguration();
             nativeLoginC.setClientID(f1.getClientId());
             nativeLoginC.setCachePath(f1.getCachePath());
             nativeLoginC.setDeviceId(f1.getDeviceId());
             nativeLoginC.setDeviceHardwareModel(f1.getDeviceHardwareModel());
             String str4 = mODEL;
             nativeLoginC.setRevision((long)f1.getClientRevision());
             nativeLoginC.setVersionLong(f1.getClientVersionLong());
             nativeLoginC.setAccesspointLanguage(f1.getAccesspointLanguage());
             nativeLoginC.setTracingEnabled(f1.getEnablePerformanceTracing());
             nativeLoginC.setReconnectPolicy(f1.getReconnectPolicy());
             nativeLoginC.setProtocolOsOverride(f1.getProtocolOsOverride());
             nativeLoginC.setContentAccessRefreshToken(f1.getContentAccessRefreshToken());
             AuthenticatedScopeConfiguration uAuthenticat = new AuthenticatedScopeConfiguration();
             uAuthenticat.setClientVersionLong("1.9.0.49155");
             uAuthenticat.setCachePath(i1.getAbsolutePath());
             uAuthenticat.setClientId("7e7cf598605d47caba394c628e2735a2");
             uAuthenticat.setDeviceId(d);
             ox7.I(ox7.k(a4));
             uAuthenticat.setWebgateUserAgentParameterAppVersion(b1.a());
             uAuthenticat.setWebgateUserAgentParameterAppPlatform(companion.android());
             uAuthenticat.setWebgateUserAgentParameterOsVersion(String.valueOf(sDK_INT));
             uAuthenticat.setWebgateUserAgentParameterExtraInformation(str4);
             ApplicationScopeConfiguration d1 = new ApplicationScopeConfiguration(null, null, false, null, 15, null);
             d.setCachePath(i1.getAbsolutePath());
             d.setSettingsPath(b.getAbsolutePath());
             EventSenderAnalyticsDelegate b2 = new EventSenderAnalyticsDelegate(opv0.e);
             opv0.s = new mt5(opv0.g);
             b1 = opv0.k;
             co5.i(b1);
             pv0 l = opv0.l;
             co5.i(l);
             pv0 m = opv0.m;
             co5.i(m);
             i1 = new ConnectivityService(b2, b1, l, f1, opv0.f, m, opv0.a, opv0.h, opv0.i);
             opv0.n = i1;
             b1 = opv0.k;
             co5.i(b1);
             l = opv0.l;
             co5.i(l);
             a4 = opv0.n;
             co5.i(a4);
             f = opv0.m;
             co5.i(f);
             CoreService i11 = new CoreService(b1, l, d, a4, f, opv0.e);
             opv0.p = i1;
             f = opv0.n;
             co5.i(f);
             ov0 m1 = new ov0(this, b2, nativeLoginC, uAuthenticat, obj, a1, limitedAuthe);
             f.setLoginControllerDelegate(m);
             c = opv0.m;
             co5.i(c);
             c.b.b();
             c = opv0.m;
             co5.i(c);
             pv0 d2 = opv0.d;
             d2.getClass();
             se6 b3 = c.b;
             co5.o(b3, "nativeRouter");
             uAuthenticat = (d2.b == null)? 1: 0;
             if (uAuthenticat) {
                HandlerThread handlerThrea = new HandlerThread(str2, 10);
                handlerThrea.start();
                Handler handler = new Handler(handlerThrea.getLooper());
                bu5 l1 = new bu5(b3, handler);
                d2.b = l1;
                jj5 ojj5 = new jj5(l1);
                d2.a.onNext(ojj5);
                d2.c = handler;
                d2.d = handlerThrea;
                return;
             }else {
                throw new IllegalStateException("Already started".toString());
             }
          }
       }
    }
}
