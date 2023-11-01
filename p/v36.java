package p.v36;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.ta3;
import p.f91;
import p.oq2;
import p.jm6;
import p.z84;
import android.content.Context;
import p.l16;
import p.sc4;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import p.gj3;
import android.os.Handler;
import android.os.Looper;
import p.j96;
import p.al5;
import p.e43;
import p.g96;
import p.m12;
import p.ah5;
import p.mp;
import p.bh5;
import p.c01;
import p.zp3;
import p.zg5;
import p.mp3;
import p.cm;
import p.ti3;
import p.nd1;
import p.lq3;
import p.np3;
import p.im;
import p.gm;
import p.gn;
import p.zg0;
import p.gv0;
import p.r90;
import p.ps2;
import p.yc4;
import p.v06;
import p.ds7;
import java.lang.String;
import java.util.Objects;
import p.cy5;
import p.qu0;
import p.u90;
import p.qc0;
import java.lang.Class;
import p.co5;
import p.we6;
import p.qi4;
import p.dp3;
import p.xi4;
import p.wd5;
import p.nq2;
import p.az2;
import p.kq2;
import p.jq2;
import p.iq2;
import p.km3;
import p.jq3;
import p.cm7;
import p.jp;
import p.ru1;
import p.xs6;
import p.rc6;
import p.tm3;
import p.sm3;
import p.xb4;
import p.zo;
import p.yb4;
import p.ub7;
import p.cd2;
import p.tx;
import p.y37;
import p.ev0;
import p.lj7;
import p.y50;
import p.wm3;
import p.wn;
import p.sn;
import p.ap6;
import p.tu1;
import p.vg0;
import p.h32;
import p.u16;
import p.ah0;
import p.et;
import p.c46;
import p.sq7;
import java.util.concurrent.Executor;
import p.wv1;
import p.fr7;
import p.zx6;
import p.fv;
import p.qe3;
import p.xs7;
import p.gb2;
import p.dp2;
import p.ed3;
import p.ns7;

public final class v36 implements a02	// class@002976 from classes.dex
{
    public final int a;
    public final tm5 b;
    public final tm5 c;
    public final tm5 d;
    public final tm5 e;

    public void v36(tm5 p0,tm5 p1,tm5 p2,tm5 p3,int p4){
       this.a = p4;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public static v36 a(ta3 p0,f91 p1,oq2 p2,tm5 p3){
       v36 v6 = new v36(p0, p1, p2, p3, 10);
       return v6;
    }
    public static v36 b(tm5 p0,tm5 p1,tm5 p2,jm6 p3){
       v36 v6 = new v36(p0, p1, p2, p3, 16);
       return v6;
    }
    public static v36 c(tm5 p0,v36 p1,z84 p2,tm5 p3){
       v36 v6 = new v36(p0, p1, p2, p3, 17);
       return v6;
    }
    public static v36 d(ta3 p0,f91 p1,tm5 p2,tm5 p3){
       v36 v6 = new v36(p0, p1, p2, p3, 8);
       return v6;
    }
    public static v36 e(ta3 p0,f91 p1,tm5 p2,tm5 p3){
       v36 v6 = new v36(p0, p1, p2, p3, 9);
       return v6;
    }
    public final Object get(){
       zo ozo;
       v36 te = this.e;
       v36 td = this.d;
       v36 tc = this.c;
       v36 tb = this.b;
       switch (this.a){
           case 0:
             ah0 uoah0 = te.get();
             return new qe3(tb.get(), tc.get(), td.get());
           case 1:
             return new sq7(tb.get(), tc.get(), td.get(), te.get());
           case 2:
             return new u16(tb.get(), tc.get(), td.get(), te.get());
           case 3:
             return new h32(tb, tc.get(), td.get(), te.get());
           case 4:
             return new ap6(tb.get(), tc.get(), td.get(), te.get());
           case 5:
             return new lj7(tb.get(), tc.get(), te.get(), td.get());
           case 6:
             jp ojp = tb.get();
             ru1 oru1 = tc.get();
             xs6 oxs6 = td.get();
             rc6 orc6 = te.get();
             ojp.getClass();
             sm3 osm3 = new sm3(ojp, 1);
             co5.o(oru1, "eventPublisher");
             co5.o(orc6, "settings");
             co5.o(oxs6, "storage");
             rc6 a = orc6.a;
             if (a instanceof xb4) {
                ozo = new zo(oru1, osm3, orc6, oxs6);
             }else if(a instanceof yb4){
                ozo = new ub7(orc6, oru1, oxs6, osm3);
             }else {
                throw new cd2(10);
             }
             return ozo;
             break;
           case 7:
             return new al5(tb.get(), tc.get(), td.get(), te.get());
           case 8:
             return new iq2(tb.get(), tc.get(), td.get(), te.get());
           case 9:
             return new jq2(tb.get(), tc.get(), td.get(), te.get());
           case 10:
             return new kq2(tb.get(), tc.get(), td.get(), te.get());
           case 11:
             return new xi4(tb.get(), tc.get(), td.get(), te.get());
           case 12:
             r90 or90 = tb.get();
             ds7 uods7 = new ds7();
             Objects.requireNonNull(or90, "factory == null");
             uods7.d = or90;
             uods7.d(tc.get());
             ds7 uods71 = new ds7(uods7.e());
             uods71.b(td.get());
             uods71.a(te.get());
             qc0 oqc0 = uods71.e().b(qc0.class);
             co5.n(oqc0);
             return oqc0;
           case 13:
             return new gv0(tb.get(), tc.get(), td.get(), te.get());
           case 14:
             return new gm(te.get(), tc.get(), tb.get(), td.get());
           case 15:
             return new im(te.get(), td.get(), tb.get(), tc.get());
           case 16:
             return new zg5(tb.get(), nd1.a(tc), td.get(), te.get());
           case 17:
             return new cm(tb.get(), tc.get(), td.get(), te.get());
           case 18:
             return new c01(tb.get(), tc.get(), td.get(), te.get());
           case 19:
             return new g96(tb.get(), tc.get(), td.get(), te.get());
           case 20:
             gj3 te1 = new gj3(td.get(), tc.get(), new Handler(Looper.getMainLooper()), tb.get().getApplicationContext(), te.get());
             return te;
           default:
             return new ns7(tb.get(), tc.get(), td.get(), te.get());
       }
    }
}
