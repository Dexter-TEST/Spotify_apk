package p.g01;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.jp;
import p.cy5;
import p.v06;
import java.lang.Class;
import p.ds7;
import p.tm3;
import p.sm3;
import p.d36;
import p.u90;
import p.qu0;
import p.v75;
import p.co5;
import p.yc4;
import p.lq3;
import p.zp3;
import p.dn3;
import p.qs2;
import p.va1;
import p.it0;
import android.content.Context;
import p.we6;
import p.zg0;
import p.wi4;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import io.reactivex.rxjava3.core.Scheduler;
import p.np0;
import p.km3;
import p.mt6;
import p.w12;
import p.mi3;
import p.un2;
import p.yl6;
import p.x37;
import io.reactivex.rxjava3.core.Observable;
import p.lf5;
import p.mp;
import p.tn6;
import p.py0;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.al5;
import p.fa4;
import p.j61;
import p.by1;
import p.nf5;
import p.gn3;
import p.ru1;
import p.xs6;
import p.rc6;
import java.lang.String;
import p.xb4;
import p.hp;
import p.lj;
import p.oh5;
import p.yb4;
import p.vb7;
import p.cd2;
import p.l16;
import p.pi7;
import p.pv5;
import p.ga5;
import p.nm5;
import p.bn6;
import p.ah5;
import p.p05;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import p.wp3;
import p.ko1;
import p.gr7;
import io.reactivex.rxjava3.core.ObservableSource;
import p.pg2;
import io.reactivex.rxjava3.core.Observer;
import p.ui0;
import p.wu1;
import com.spotify.eventsender.corebridge.EventSenderCoreBridgeImpl;
import p.rp3;
import p.bv1;
import io.reactivex.rxjava3.core.Single;
import p.fx6;
import p.yf2;
import p.s36;
import p.ti3;
import p.nd1;
import p.sb1;
import p.f63;
import p.g15;
import p.l93;
import p.s61;
import p.a81;
import java.io.File;
import p.uk;
import p.c42;
import p.mc1;
import p.m95;
import p.ir2;
import p.eq3;
import p.rn6;
import android.os.StatFs;
import p.eb3;
import p.rp5;
import p.yg3;
import p.j71;
import java.lang.IllegalArgumentException;
import p.op3;
import p.wp;
import p.cp;
import p.ep;
import android.app.Activity;
import p.r61;
import p.em1;
import p.am1;
import p.ve6;
import p.mi5;
import p.c46;
import java.lang.Integer;
import p.f01;
import p.ah0;
import p.l32;
import p.ne5;

public final class g01 implements a02	// class@001670 from classes.dex
{
    public final int a;
    public final tm5 b;
    public final tm5 c;
    public final tm5 d;

    public void g01(tm5 p0,tm5 p1,tm5 p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final Object get(){
       Activity uActivity;
       Context uContext;
       long l2;
       cy5 uocy5;
       ds7 uods7;
       hp ohp;
       g01 og01 = this;
       int i = 0;
       String str = "context";
       g01 d = og01.d;
       g01 c = og01.c;
       g01 b = og01.b;
       switch (og01.a){
           case 0:
             return new f01(b.get(), c.get(), d.get());
           case 1:
             return new c46(d.get().intValue(), b.get(), c.get());
           case 2:
             return new mi5(b.get(), c.get(), d.get());
           case 3:
             uActivity = b.get();
             r61 or61 = c.get();
             em1 uoem1 = d.get();
             co5.o(uActivity, "activity");
             co5.o(or61, "imageLoader");
             co5.o(uoem1, "properties");
             return new am1(uActivity, or61, uoem1);
           case 4:
             return new ep(d.get(), c.get(), nd1.a(b));
           case 5:
             uContext = b.get();
             we6 owe6 = c.get();
             co5.o(uContext, str);
             co5.o(owe6, "preferences");
             co5.o(d.get(), "manager");
             File cacheDir = uContext.getCacheDir();
             co5.l(cacheDir, "context.cacheDir");
             yg3 a = c42.a;
             j71 b1 = mc1.b;
             m95 om95 = ir2.w(uk.p0(cacheDir, "coil_cache"));
             long l = owe6.a.b(wp3.y, (eq3.j / 4));
             if ((l) > 0) {
                uActivity = 1;
             }
             if (uActivity) {
                double rp5 d1 = 0;
                if ((d1 - d1) > 0) {
                   try{
                      StatFs l1 = new StatFs(om95.toFile().getAbsolutePath());
                      l2 = eb3.e((long)((d1 * (double)l1.getBlockCountLong()) * (double)l1.getBlockSizeLong()), 0xa00000, 0xfa00000);
                   }catch(java.lang.Exception e0){
                      l2 = 0xa00000;
                   }
                }else {
                   l2 = l;
                }
                d1 = new rp5(l2, om95, a, b1);
                return d1;
             }else {
                throw new IllegalArgumentException("size must be > 0.".toString());
             }
             break;
           case 6:
             uContext = b.get();
             ti3 oti3 = nd1.a(c);
             sb1 osb1 = d.get();
             co5.o(uContext, str);
             co5.o(oti3, "lazyClient");
             co5.o(osb1, "diskCache");
             f63 uof63 = new f63(uContext);
             a81 obj = oti3.get();
             co5.l(obj, "lazyClient.get\(\)");
             uof63.d = new l93(obj);
             uof63.c = new l93(osb1);
             obj = a81.a(uof63.b, i, s61.a, 0x7f7f);
             uof63.b = obj;
             uof63.b = a81.a(obj, 2, i, 0x7fdf);
             return uof63;
           case 7:
             return new bv1(b.get(), c.get(), d.get().a().map(new fx6(13)), s36.c);
           case 8:
             uocy5 = b.get();
             uocy5.getClass();
             uods7 = new ds7(uocy5);
             uods7.b(d.get());
             uods7.a(c.get());
             ui0 oui0 = uods7.e().b(ui0.class);
             co5.n(oui0);
             return oui0;
           case 9:
             p05 op05 = b.get();
             we6 owe61 = c.get();
             Observable.combineLatest(owe61.g.r(owe61.a), owe61.h.r(owe61.a), d.get().getConnectionTypeObservable(), new gr7(25)).distinctUntilChanged().subscribe(op05);
             co5.n(op05);
             return op05;
           case 10:
             uocy5 = b.get();
             uocy5.getClass();
             uods7 = new ds7(uocy5);
             uods7.b(d.get());
             uods7.a(c.get());
             ah5 uoah5 = uods7.e().b(ah5.class);
             co5.n(uoah5);
             return uoah5;
           case 11:
             uocy5 = b.get();
             uocy5.getClass();
             uods7 = new ds7(uocy5);
             uods7.b(d.get());
             uods7.a(c.get());
             bn6 uobn6 = uods7.e().b(bn6.class);
             co5.n(uobn6);
             return uobn6;
           case 12:
             return new ga5(b.get(), c.get(), d.get());
           case 13:
             ru1 oru1 = b.get();
             xs6 oxs6 = c.get();
             rc6 orc6 = d.get();
             co5.o(oru1, "eventPublisher");
             co5.o(orc6, "settings");
             co5.o(oxs6, "storage");
             rc6 a1 = orc6.a;
             rc6 c1 = orc6.c;
             orc6 = orc6.b;
             if (a1 instanceof xb4) {
                ohp = new hp(orc6, oru1, c1, oxs6);
             }else if(a1 instanceof yb4){
                ohp = new vb7(orc6, oru1, c1, oxs6);
             }else {
                throw new cd2(10);
             }
             return ohp;
             break;
           case 14:
             return new gn3(b.get(), c.get(), d.get());
           case 15:
             return new fa4(b.get(), c.get(), d.get());
           case 16:
             return new py0(b.get(), c.get(), d.get());
           case 17:
             return new lf5(b.get(), c.get(), d.get());
           case 18:
             return new x37(b.get(), c.get(), d.get());
           case 19:
             return new mi3(b.get(), c.get(), d.get());
           case 20:
             return new np0(b.get(), c.get(), d.get());
           case 21:
             return new wi4(b.get(), c.get(), d.get());
           case 22:
             uocy5 = b.get();
             uocy5.getClass();
             uods7 = new ds7(uocy5);
             uods7.b(c.get());
             uods7.a(d.get());
             it0 oit0 = uods7.e().b(it0.class);
             co5.n(oit0);
             return oit0;
           case 23:
             uocy5 = b.get();
             uocy5.getClass();
             uods7 = new ds7(uocy5);
             uods7.b(c.get());
             uods7.a(d.get());
             va1 ova1 = uods7.e().b(va1.class);
             co5.n(ova1);
             return ova1;
           case 24:
             uocy5 = b.get();
             uocy5.getClass();
             uods7 = new ds7(uocy5);
             uods7.b(c.get());
             uods7.a(d.get());
             qs2 oqs2 = uods7.e().b(qs2.class);
             co5.n(oqs2);
             return oqs2;
           case 25:
             uocy5 = b.get();
             uocy5.getClass();
             uods7 = new ds7(uocy5);
             uods7.b(c.get());
             uods7.a(d.get());
             dn3 uodn3 = uods7.e().b(dn3.class);
             co5.n(uodn3);
             return uodn3;
           case 26:
             uocy5 = b.get();
             uocy5.getClass();
             uods7 = new ds7(uocy5);
             uods7.b(c.get());
             uods7.a(d.get());
             zp3 ozp3 = uods7.e().b(zp3.class);
             co5.n(ozp3);
             return ozp3;
           case 27:
             uocy5 = b.get();
             uocy5.getClass();
             uods7 = new ds7(uocy5);
             uods7.b(c.get());
             uods7.a(d.get());
             lq3 olq3 = uods7.e().b(lq3.class);
             co5.n(olq3);
             return olq3;
           case 28:
             jp ojp = b.get();
             cy5 uocy51 = c.get();
             uocy51.getClass();
             ds7 uods71 = new ds7(uocy51);
             ojp.getClass();
             uods71.d = new sm3(ojp, i);
             ds7 uods72 = new ds7(uods71.e());
             uods72.a(d.get());
             uods72.b(new d36());
             v75 ov75 = uods72.e().b(v75.class);
             co5.n(ov75);
             return ov75;
           default:
             return new ne5(b.get(), c.get(), d.get());
       }
    }
}
