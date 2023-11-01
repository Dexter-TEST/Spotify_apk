package p.nd7;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.f91;
import com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule_ProvideInternetMonitorFactory;
import p.jm6;
import p.dn3;
import p.mp;
import p.m12;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.ah5;
import p.bh5;
import p.w7;
import p.yg5;
import android.app.Application;
import p.sm;
import p.c96;
import p.zg5;
import p.np3;
import p.hv6;
import p.t2;
import p.wm;
import p.lq3;
import p.e43;
import p.w12;
import p.vg0;
import p.w15;
import p.u67;
import p.rq2;
import p.uq2;
import p.h12;
import p.bn6;
import p.vi0;
import p.cm7;
import p.zp3;
import p.bo3;
import p.wn3;
import p.ew0;
import p.h13;
import p.k33;
import p.rf5;
import p.zg0;
import p.uf1;
import p.zd1;
import p.ac;
import p.ma3;
import java.lang.String;
import p.we6;
import p.qf6;
import p.to6;
import p.xo7;
import android.content.Context;
import p.ti3;
import p.nd1;
import p.xp6;
import p.mt6;
import p.iw3;
import p.uo3;
import java.util.Objects;
import p.dp;
import p.i63;
import p.ze;
import p.zh0;
import p.ew6;
import p.aw6;
import p.xe7;
import p.up;
import p.u44;
import java.util.ArrayList;
import p.is7;
import android.os.Build$VERSION;
import android.graphics.Bitmap$Config;
import java.lang.IllegalArgumentException;
import p.zd5;
import p.xr6;
import p.lc1;
import p.wd5;
import java.util.concurrent.ExecutorService;
import p.qc4;
import p.ae1;
import p.vd5;
import java.lang.IllegalStateException;
import p.md7;
import p.y84;
import p.wv1;
import p.fr7;
import java.util.concurrent.Executor;
import p.zx6;
import p.ah0;
import p.al5;
import p.rg1;

public final class nd7 implements a02	// class@001fba from classes.dex
{
    public final int a;
    public final tm5 b;
    public final tm5 c;
    public final tm5 d;
    public final tm5 e;
    public final tm5 f;
    public final tm5 g;
    public final tm5 h;

    public void nd7(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5,tm5 p6,int p7){
       this.a = p7;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public static nd7 a(tm5 p0,f91 p1,tm5 p2,tm5 p3,ConnectionTypeModule_ProvideInternetMonitorFactory p4,tm5 p5,jm6 p6){
       nd7 v9 = new nd7(p0, p1, p2, p3, p4, p5, p6, 7);
       return v9;
    }
    public final Object get(){
       md7 v0;
       int sDK_INT;
       Bitmap$Config rGB_565;
       nd7 th = this.h;
       nd7 tg = this.g;
       nd7 tf = this.f;
       nd7 te = this.e;
       nd7 td = this.d;
       nd7 tc = this.c;
       nd7 tb = this.b;
       switch (this.a){
           case 0:
             v0 = new md7(tb.get(), tc.get(), td.get(), te.get(), tf.get(), tg.get(), th.get());
             return v0;
           case 1:
             Context uContext = tb.get();
             ti3 oti3 = nd1.a(tc);
             xp6 oxp6 = td.get();
             iw3 oiw3 = tf.get();
             uo3 ouo3 = th.get();
             Objects.requireNonNull(oti3);
             int i = 1;
             dp uodp = new dp(oti3, i);
             int i1 = 0;
             ze oze = new ze(new up(i, xe7.I(new ew6(new zh0(uContext, i1, new i63(tg.get(), i1, te.get())), uodp))));
             if (uContext == null) {
                throw new IllegalArgumentException("Context must not be null.");
             }
             Context applicationC = uContext.getApplicationContext();
             if (ouo3 == null) {
                throw new IllegalArgumentException("Transformer must not be null.");
             }
             u44 ou44 = new u44(29, oze);
             if (oiw3 == null) {
                throw new IllegalArgumentException("Memory cache must not be null.");
             }
             if (oxp6 == null) {
                throw new IllegalArgumentException("RequestHandler must not be null.");
             }
             ArrayList uArrayList = new ArrayList();
             if (uArrayList.contains(oxp6)) {
                throw new IllegalStateException("RequestHandler already registered.");
             }
             uArrayList.add(oxp6);
             if (is7.n(uContext) < 2012 && ((sDK_INT = Build$VERSION.SDK_INT) != 22 && sDK_INT != 21)) {
                if ((rGB_565 = Bitmap$Config.RGB_565) == null) {
                   throw new IllegalArgumentException("Bitmap config must not be null.");
                }
             }else {
                rGB_565 = 0;
             }
             Context uContext1 = applicationC;
             xr6 oxr6 = new xr6(oiw3);
             lc1 oxp61 = new lc1(uContext1, new zd5(), wd5.m, ou44, oiw3, oxr6);
             wd5 oti31 = new wd5(uContext1, oxp6, oiw3, ouo3, uArrayList, oxr6, rGB_565);
             return oti3;
             break;
           case 2:
             xo7 v01 = new xo7(tb.get(), tc.get(), td.get(), te.get(), tf.get(), tg.get(), th.get());
             return v0;
           case 3:
             zd1 v02 = new zd1(tb.get(), tc.get(), td.get(), te.get(), tf.get(), tg.get(), th.get());
             return v0;
           case 4:
             bo3 v03 = new bo3(tb.get(), tc.get(), td.get(), te.get(), tf.get(), tg.get(), this.h);
             return v0;
           case 5:
             uq2 v04 = new uq2(tb.get(), tc.get(), td.get(), te.get(), tf.get(), tg.get(), th.get());
             return v0;
           case 6:
             wm v05 = new wm(tb.get(), tc.get(), td.get(), te.get(), tf.get(), tg.get(), th.get());
             return v0;
           case 7:
             w7 th1 = new w7(tb.get(), tc.get(), td.get(), te.get(), tf.get(), tg.get(), th.get());
             return th;
           default:
             rg1 th2 = new rg1(tb.get(), tc.get(), td.get(), te.get(), tf.get(), tg.get(), th.get());
             return th;
       }
    }
}
