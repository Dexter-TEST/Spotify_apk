package p.yl7;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.ha0;
import com.spotify.signup.signup.facebook.FacebookLoginActivity;
import p.qy1;
import android.content.Context;
import p.rc6;
import p.r45;
import java.lang.String;
import p.co5;
import p.xs6;
import p.tp2;
import io.reactivex.rxjava3.core.Scheduler;
import p.aj5;
import p.xi5;
import p.sl7;
import p.tl7;
import p.km3;
import p.q97;
import p.w12;
import p.y87;
import p.cy5;
import p.tu1;
import p.v06;
import java.lang.Class;
import p.ds7;
import p.u90;
import java.lang.Boolean;
import io.reactivex.rxjava3.core.Single;
import com.spotify.liteuser.account.LiteAccountObserver;
import p.zg0;
import p.uf1;
import p.gf6;
import p.ho1;
import p.rf5;
import p.tn6;
import p.tj;
import p.j96;
import p.al5;
import p.i96;
import p.g96;
import p.np3;
import p.w86;
import p.e86;
import p.e43;
import p.f86;
import p.qs2;
import p.ui2;
import p.cm7;
import p.m12;
import p.ju5;
import p.yg5;
import p.hv6;
import p.zp3;
import p.mp3;
import p.cn;
import p.wl6;
import p.al4;
import p.vi5;
import p.we6;
import p.dl5;
import p.lp3;
import p.mt6;
import p.l32;
import p.cn3;
import p.iv0;
import p.gv0;
import p.an3;
import p.nm5;
import p.qu0;
import p.yc4;
import p.c96;
import p.ti3;
import p.nd1;
import java.util.Set;
import p.os2;
import p.ps2;
import p.wc;
import p.ay6;
import p.wf2;
import p.h15;
import p.fb2;

public final class yl7 implements a02	// class@002de2 from classes.dex
{
    public final int a;
    public final tm5 b;
    public final tm5 c;
    public final tm5 d;

    public void yl7(tm5 p0,tm5 p1,tm5 p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final Object get(){
       cy5 uocy5;
       ds7 uods7;
       ds7 uods71;
       wc obj = null;
       yl7 td = this.d;
       yl7 tc = this.c;
       yl7 tb = this.b;
       switch (this.a){
           case 0:
             uocy5 = tb.get();
             uocy5.getClass();
             uods7 = new ds7(uocy5);
             uods7.b(tc.get());
             uods7.a(td.get());
             c96 uoc96 = uods7.e().b(c96.class);
             co5.n(uoc96);
             return uoc96;
           case 1:
             uocy5 = tb.get();
             uocy5.getClass();
             uods7 = new ds7(uocy5);
             uods7.b(td.get());
             uods7.a(tc.get());
             j96 oj96 = uods7.e().b(j96.class);
             co5.n(oj96);
             return oj96;
           case 2:
             return new an3(tb.get(), tc.get(), td.get());
           case 3:
             return new cn3(tb.get(), tc.get(), td.get());
           case 4:
             return new lp3(tb.get(), tc.get(), td.get());
           case 5:
             return new al4(tb.get(), tc.get(), td.get());
           case 6:
             return new cn(tb.get(), tc.get(), td.get());
           case 7:
             return new ju5(tb.get(), tc.get(), td.get());
           case 8:
             return new ui2(tb.get(), tc.get(), td.get());
           case 9:
             return new f86(tb.get(), tc.get(), td.get());
           case 10:
             return new w86(tb.get(), tc.get(), td.get());
           case 11:
             return new i96(tb.get(), tc.get(), td.get());
           case 12:
             return new tj(tb.get(), tc.get(), td.get());
           case 13:
             return new ho1(tb.get(), tc.get(), td.get());
           case 14:
             return new gf6(tb.get(), tc.get(), td.get());
           case 15:
             return new LiteAccountObserver(tb.get(), tc.get(), td.get());
           case 16:
             uocy5 = tb.get();
             uocy5.getClass();
             uods71 = new ds7(uocy5);
             uods71.a(td.get());
             return new q97(uods71.e(), tc.get(), Single.just(Boolean.TRUE));
           case 17:
             return new y87(tb.get(), tc.get(), td.get());
           case 18:
             Object obj1 = tb.get();
             Object obj2 = tc.get();
             Object obj3 = td.get();
             co5.o(obj1, "vivoPreloadId");
             co5.o(obj2, "ioScheduler");
             co5.o(obj3, "fileFactory");
             sl7 v0 = new sl7(new tl7(), "spotifylite_channel.txt", obj1, obj2, obj3);
             return v0;
           case 19:
             Context uContext = tb.get();
             rc6 orc6 = tc.get();
             r45 or45 = td.get();
             co5.o(uContext, "context");
             co5.o(orc6, "settings");
             co5.o(or45, "remoteConfigNotifier");
             uContext = uContext.getApplicationContext();
             co5.l(uContext, "context.applicationContext");
             if (or45.c()) {
                obj = or45.b();
             }
             tp2.v(obj);
             return new xs6(uContext, orc6);
             break;
           case 20:
             return new qy1(tb, tc.get(), td.get());
           default:
             ti3 oti3 = nd1.a(tb);
             qu0 oqu0 = tc.get();
             Set set = td.get();
             co5.o(oti3, "okHttpClient");
             co5.o(oqu0, "moshiConverter");
             co5.o(set, "interceptors");
             uods71 = new ds7();
             os2 oos2 = new os2();
             oos2.f(obj, "https://localhost/");
             uods71.d(oos2.b());
             obj = new wc(9, oti3);
             ay6 oti31 = new ay6(obj);
             uods71.d = new h15(oti31, set);
             uods71.b(oqu0);
             uods71.a(v06.b());
             Object obj4 = uods71.e().b(fb2.class);
             co5.l(obj4, "@Named\(\"ZeroRatingThirdP…rectEndpoint::class.java\)");
             return obj4;
       }
    }
}
