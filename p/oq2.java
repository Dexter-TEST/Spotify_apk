package p.oq2;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.u36;
import p.ti3;
import p.nd1;
import p.qs3;
import p.es1;
import p.ht0;
import android.content.Context;
import p.tu1;
import java.lang.String;
import p.co5;
import p.oa1;
import p.wh2;
import p.s36;
import p.ra1;
import io.reactivex.rxjava3.core.Scheduler;
import androidx.fragment.app.Fragment;
import p.u73;
import androidx.fragment.app.k;
import p.kj5;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingPresenter;
import p.qc1;
import p.rh6;
import p.uf6;
import p.tf6;
import p.mp;
import p.dh5;
import p.km3;
import p.ch5;
import p.lq3;
import p.e43;
import p.f43;
import p.rf5;
import p.wm1;
import p.mt6;
import p.pd4;
import p.lt6;
import p.ti4;
import p.we6;
import p.vc0;
import p.al5;
import p.s4;
import p.d70;
import p.jv0;
import p.ps7;
import p.mq3;
import p.w12;
import p.tn6;
import p.a25;
import p.an3;
import p.tu3;
import p.i16;
import com.squareup.moshi.Moshi;
import com.spotify.cosmos.cosmonaut.Converter$Factory;
import p.v70;
import p.uu6;
import p.om5;
import p.bd4;
import com.squareup.moshi.Moshi$a;
import p.fd4;
import com.squareup.moshi.JsonAdapter$a;
import p.qx0;
import java.util.List;
import p.ye7;
import p.hx0;
import p.dm7;
import p.jp;
import p.tm3;
import java.lang.Class;
import p.sm3;
import p.em7;
import p.qu0;
import p.cd4;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.spotify.webapi.service.models.Entity;
import com.google.common.collect.d;
import p.dl6;
import java.util.Set;
import p.zc4;
import p.yc4;
import p.ds7;
import p.ps2;
import p.v06;
import p.u90;
import p.cy5;
import p.cm7;
import p.xp6;
import p.pf1;
import p.x37;
import p.lf5;
import p.wl6;
import p.j61;
import com.spotify.litelisteningexperience.share.logging.a;
import p.gj5;
import p.va1;
import p.q45;
import p.ac;
import p.ov5;
import p.pv5;
import p.ma3;
import p.yo3;
import p.py0;
import p.pn3;
import p.jn3;
import p.vg0;
import p.xm3;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import p.nq2;
import p.cs1;

public final class oq2 implements a02	// class@00216c from classes.dex
{
    public final int a;
    public final tm5 b;
    public final tm5 c;

    public void oq2(tm5 p0,tm5 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public static oq2 a(tm5 p0,u36 p1){
       return new oq2(p0, p1, 0);
    }
    public final Object get(){
       int i = 0;
       int i1 = 1;
       int i2 = 2;
       oq2 tc = this.c;
       oq2 tb = this.b;
       switch (this.a){
           case 0:
             return new nq2(tb.get(), tc.get());
           case 1:
             return new xm3(tb.get(), tc.get());
           case 2:
             return new jn3(tb.get(), tc.get());
           case 3:
             return new pn3(tb.get(), tc.get());
           case 4:
             return new ma3(tb.get(), tc.get());
           case 5:
             return new pv5(tb.get(), tc.get());
           case 6:
             return new q45(tb.get(), tc.get());
           case 7:
             return new gj5(tb.get(), tc.get());
           case 8:
             return new a(tb.get(), tc.get());
           case 9:
             return new wl6(tb.get(), tc.get());
           case 10:
             return new xp6(tb, tc.get());
           case 11:
             jp ojp = tb.get();
             ds7 uods7 = new ds7();
             ojp.getClass();
             uods7.d = new sm3(ojp, i1);
             uods7.d(tc.get());
             return uods7.e();
           case 12:
             jp ojp1 = tc.get();
             ojp1.getClass();
             sm3 osm3 = new sm3(ojp1, i1);
             tb.get().getClass();
             qu0[] oqu0Array = new qu0[i2];
             oqu0Array[i] = new cd4(zc4.a(new dl6(Entity.getPolymorphicAdapter())));
             oqu0Array[i1] = yc4.c(zc4.a(new dl6(Entity.getPolymorphicAdapter())));
             ds7 uods71 = new ds7();
             uods71.d = osm3;
             uods71.d(em7.a);
             for (; i < i2; i = i + 1) {
                uods71.b(oqu0Array[i]);
             }
             uods71.a(v06.b());
             cm7 uocm7 = uods71.e().b(cm7.class);
             co5.n(uocm7);
             return uocm7;
             break;
           case 13:
             i16 oi16 = tb.get();
             Moshi moshi = tc.get();
             co5.o(oi16, "rxRouter");
             co5.o(moshi, "moshi");
             Converter$Factory[] uFactoryArra = new Converter$Factory[4];
             uFactoryArra[0] = new v70();
             uFactoryArra[1] = new uu6();
             uFactoryArra[2] = new om5();
             Moshi moshi1 = moshi.h().a(new fd4()).a(new qx0()).d();
             co5.l(moshi1, "moshi\n                  …                 .build\(\)");
             bd4 i3 = new bd4(moshi1);
             uFactoryArra[3] = i3;
             return new hx0(oi16, ye7.K(uFactoryArra));
           case 14:
             return new tu3(tb.get(), tc.get());
           case 15:
             return new a25(tb.get(), tc.get());
           case 16:
             return new mq3(tb.get(), tc.get());
           case 17:
             return new d70(tb.get(), tc.get());
           case 18:
             return new s4(tb.get(), tc.get());
           case 19:
             return new vc0(tb.get(), tc.get());
           case 20:
             return new lt6(tb.get(), tc.get());
           case 21:
             return new wm1(tb.get(), tc.get());
           case 22:
             return new f43(tb.get(), tc.get());
           case 23:
             return new ch5(tb.get(), tc.get());
           case 24:
             return new dh5(tb.get(), tc.get());
           case 25:
             rh6 orh6 = tb.get();
             uf6 ouf6 = tc.get();
             co5.o(orh6, "signupService");
             co5.o(ouf6, "configuration");
             return new tf6(orh6, ouf6.a);
           case 26:
             Fragment uFragment = tb.get();
             u73 ou73 = tc.get();
             InAppMessagingPresenter inAppMessagi = (uFragment.getActivity() instanceof kj5)? uFragment.getActivity().c(ou73.w): new qc1();
             co5.n(inAppMessagi);
             return inAppMessagi;
             break;
           case 27:
             Context uContext = tb.get();
             tu1 otu1 = tc.get();
             co5.o(uContext, "context");
             co5.o(otu1, "eventPublisherAdapter");
             wh2 owh2 = new wh2(otu1);
             Scheduler c = s36.c;
             co5.l(c, "io\(\)");
             return new oa1(owh2, c, new ra1(uContext));
           case 28:
             return new es1(nd1.a(tb).get(), tc.get());
           default:
             return new cs1(nd1.a(tb).get(), tc.get());
       }
    }
}
