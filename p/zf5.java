package p.zf5;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.ti3;
import p.cd4;
import p.rh6;
import p.ds7;
import p.bi4;
import p.os2;
import p.ps2;
import java.lang.String;
import p.qu0;
import p.v06;
import p.u90;
import p.cy5;
import java.lang.Class;
import p.co5;
import p.c17;
import p.xs7;
import p.dp2;
import p.gb2;
import p.rr3;
import java.util.EnumSet;
import p.or3;
import java.lang.Integer;
import p.pr3;
import p.nd1;
import p.lj;
import p.oh5;
import p.sg0;
import io.reactivex.rxjava3.core.Scheduler;
import p.aj5;
import p.xi5;
import p.w71;
import p.l06;
import p.hm5;
import p.yi5;
import p.yi2;
import p.ui5;
import p.fm5;
import java.util.Set;
import p.wi5;
import p.qs3;
import p.ls1;
import p.ht0;
import p.is1;
import p.ed3;

public final class zf5 implements a02	// class@002ee8 from classes.dex
{
    public final int a;
    public final tm5 b;
    public final tm5 c;

    public void zf5(tm5 p0,tm5 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public static rh6 a(ti3 p0,cd4 p1){
       ds7 uods7 = new ds7();
       uods7.d = new bi4(p0, 1);
       os2 oos2 = new os2();
       oos2.f(null, "https://spclient.wg.spotify.com/");
       uods7.d(oos2.b());
       uods7.b(p1);
       uods7.a(v06.b());
       rh6 orh6 = uods7.e().b(rh6.class);
       co5.n(orh6);
       return orh6;
    }
    public final Object get(){
       zf5 tc = this.c;
       zf5 tb = this.b;
       switch (this.a){
           case 0:
             return new is1(nd1.a(tb).get(), tc.get());
           case 1:
             return new ls1(nd1.a(tb).get(), tc.get());
           case 2:
             return new wi5(tb.get(), tc.get());
           case 3:
             Object obj = tb.get();
             aj5 uoaj5 = tc.get();
             co5.o(obj, "ioScheduler");
             co5.o(uoaj5, "fileFactory");
             w71 tc1 = new w71(new l06(), new hm5(uoaj5), yi5.a, "ro.csc.spotify.music.referrerid", "ro.csc.spotify.music.partnerid", obj);
             return tc;
           case 4:
             oh5 ooh5 = tc.get();
             co5.o(tb.get(), "appMetadata");
             co5.o(ooh5, "policyInputs");
             return new sg0(ooh5);
           case 5:
             return zf5.a(nd1.a(tb), tc.get());
           case 6:
             return new pr3(tb.get().intValue(), tc.get().intValue());
           case 7:
             return new or3(tb.get(), tc.get());
           case 8:
             return new gb2(tb.get(), tc.get());
           case 9:
             return new dp2(tb.get(), tc.get());
           default:
             return new ed3(tb.get(), tc.get());
       }
    }
}
