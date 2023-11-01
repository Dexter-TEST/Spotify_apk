package p.z84;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.ta3;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvideInternetMonitorFactory;
import p.cy5;
import p.nm5;
import p.y9;
import java.lang.String;
import p.co5;
import p.ds7;
import p.qu0;
import p.v06;
import p.u90;
import java.lang.Class;
import p.ep;
import p.dq;
import p.vp;
import p.oy6;
import java.util.Objects;
import p.dp;
import p.ti3;
import p.tp;
import p.op3;
import p.s53;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import p.mx6;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;
import p.bm;
import p.bi5;
import p.jk0;
import p.aw6;
import p.g15;
import p.fw6;
import p.wp;
import p.up;
import p.np;
import java.lang.IllegalArgumentException;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.zg0;
import p.vn3;
import p.ui0;
import p.mp;
import p.xi0;
import p.tn6;
import p.rp3;
import p.co3;
import p.nd4;
import p.l32;
import p.ud4;
import android.content.Context;
import p.bq3;
import p.ew5;
import p.nd1;
import p.vg0;
import p.ga4;
import p.nx6;
import p.m94;
import p.s94;
import p.ew0;
import p.n94;
import p.km3;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Maybe;
import p.nt6;
import p.k34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.nm3;
import p.lj;
import p.oh5;
import p.kg0;
import p.nh5;
import p.lg0;
import android.os.Build;
import p.mg0;
import p.ng0;
import p.rc6;
import android.os.Build$VERSION;
import p.ti4;
import p.be7;
import p.hn3;
import p.gn3;
import p.ap3;
import p.hs3;
import p.ga1;
import p.l56;
import p.fv1;
import java.util.List;
import java.util.Collections;
import p.g63;
import p.r61;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.e43;
import p.tu1;
import p.m61;
import p.j61;
import p.uz0;
import java.util.EnumSet;
import p.e17;
import p.go;
import p.ko;
import android.media.AudioManager;
import android.app.Application;
import p.ve6;
import p.vn6;
import p.co6;
import p.vi0;
import p.ek3;
import com.spotify.allboarding.entrypointlite.AllboardingFollowManagerImpl;
import p.w12;
import com.spotify.allboarding.entrypointlite.AllboardingDoneImpl;
import p.y84;
import p.f01;
import p.h12;
import p.m12;
import p.wn3;

public final class z84 implements a02	// class@002ea9 from classes.dex
{
    public final int a;
    public final tm5 b;
    public final tm5 c;

    public void z84(tm5 p0,tm5 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public static z84 a(ta3 p0,ConnectionTypeModule_ProvideInternetMonitorFactory p1){
       return new z84(p0, p1, 9);
    }
    public static y9 b(cy5 p0,nm5 p1){
       co5.o(p0, "retrofit");
       co5.o(p1, "converterFactory");
       ds7 uods7 = new ds7(p0);
       uods7.b(p1);
       uods7.a(v06.b());
       p0 = uods7.e().b(y9.class);
       co5.l(p0, "retrofit.newBuilder\(\)\n  …dingEndpoint::class.java\)");
       return p0;
    }
    public static vp c(ep p0,dq p1){
       oy6 c;
       oy6 t;
       co5.o(p0, "authenticationParameters");
       co5.o(p1, "tokenRepository");
       oy6 ooy6 = new oy6(8);
       ep a = p0.a;
       Objects.requireNonNull(a);
       ooy6.b = new dp(a, 0);
       ooy6.c = new tp(2, p0.b);
       p0 = p0.c;
       op3 b = p0.b;
       Objects.requireNonNull(b);
       ooy6.v = Single.fromCallable(new s53(4, b)).flatMap(new mx6(2, p0)).ignoreElement().n(new bm(11));
       ooy6.t = p1;
       if (ooy6.b == null) {
          ooy6.b = new fw6(new g15());
       }
       if ((c = ooy6.c) != null) {
          if ((t = ooy6.t) != null) {
             if (ooy6.v != null) {
                return new vp(ooy6.b, c.a(new up(0, ooy6), t), ooy6.t, ooy6.v);
             }else {
                throw new IllegalArgumentException("must set bootstrap");
             }
          }else {
             throw new IllegalArgumentException("must set token repository");
          }
       }else {
          throw new IllegalArgumentException("must set authentication strategy");
       }
    }
    public final Object get(){
       ti4 systemServic;
       z84 tc = this.c;
       z84 tb = this.b;
       switch (this.a){
           case 0:
             return new y84(tb.get(), tc.get());
           case 1:
             return new AllboardingDoneImpl(tb.get(), tc.get());
           case 2:
             return new AllboardingFollowManagerImpl(tb.get(), tc.get());
           case 3:
             return z84.b(tb.get(), tc.get());
           case 4:
             Application uApplication = tb.get();
             ve6 ove6 = tc.get();
             co5.o(uApplication, "application");
             co5.o(ove6, "spSharedPreferencesFactory");
             return ove6.a(uApplication);
           case 5:
             Context uContext = tb.get();
             go ogo = tc.get();
             co5.o(uContext, "context");
             co5.o(ogo, "eventSender");
             systemServic = uContext.getSystemService("audio");
             co5.j(systemServic, "null cannot be cast to non-null type android.media.AudioManager");
             return new ko(systemServic, ogo);
           case 6:
             return z84.c(tb.get(), tc.get());
           case 7:
             return new e17(tb.get(), tc.get());
           case 8:
             return new j61(tb.get(), tc.get());
           case 9:
             return new e43(tb.get(), tc.get());
           case 10:
             return new r61(tb.get(), tc.get());
           case 11:
             hs3 ohs3 = tc.get();
             tb.get().getClass();
             co5.o(ohs3, "logger");
             List list = Collections.singletonList(new ga1(3, "7e7cf598605d47caba394c628e2735a2"));
             co5.o(list, "eventContextProviders");
             return new l56(list, ohs3, l56.e, new fv1());
           case 12:
             return new ap3(tb.get(), tc.get());
           case 13:
             return new be7(tb.get(), tc.get().a());
           case 14:
             systemServic = (Build$VERSION.SDK_INT >= 26)? tc.get(): tb.get();
             co5.n(systemServic);
             return systemServic;
             break;
           case 15:
             return new rc6(tb.get(), tc.get());
           case 16:
             oh5 ooh5 = new oh5(tb.get().d);
             tc.get().getClass();
             ooh5.a(new kg0("8.8.80.328"));
             ooh5.a(new lg0(Build.BRAND));
             ooh5.a(new mg0(Build.MANUFACTURER));
             ooh5.a(new ng0(Build.MODEL));
             return ooh5;
           case 17:
             Maybe maybe = tc.get().b().firstElement();
             maybe.getClass();
             return new k34(maybe, new nt6(tb.get(), 0), 1);
           case 18:
             return new m94(tb.get(), tc.get());
           case 19:
             return new n94(tb.get(), tc.get());
           case 20:
             return new s94(tb.get(), tc.get());
           case 21:
             return new ga4(tb.get(), tc.get());
           case 22:
             return new op3(nd1.a(tb), nd1.a(tc));
           case 23:
             return new rp3(tb.get(), tc);
           case 24:
             return new bq3(tb.get(), tc.get());
           case 25:
             return new ud4(tb.get(), tc.get());
           case 26:
             return new co3(tb.get(), tc.get());
           case 27:
             return new xi0(tb.get(), tc.get());
           case 28:
             return new vn3(tb.get(), tc.get());
           default:
             return new wn3(tb.get(), tc.get());
       }
    }
}
