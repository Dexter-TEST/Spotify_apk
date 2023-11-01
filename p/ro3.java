package p.ro3;
import p.qg2;
import p.so3;
import java.lang.Object;
import p.zu2;
import java.lang.Class;
import p.i77;
import java.lang.Boolean;
import p.r45;
import java.lang.String;
import p.pu;
import p.aq6;
import p.td7;
import io.reactivex.rxjava3.core.Observable;
import p.ew0;
import p.pp;
import p.yf2;
import io.reactivex.rxjava3.core.Single;
import p.ws3;
import p.e16;
import p.yu2;
import p.p54;
import io.reactivex.rxjava3.core.Completable;
import p.df5;
import p.pl0;
import p.bv2;

public final class ro3 implements qg2	// class@002528 from classes.dex
{
    public final int a;
    public final so3 b;

    public void ro3(so3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       aq6 uoaq6;
       int i = 14;
       ro3 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             tb.getClass();
             i77 oi77 = new i77(i);
             oi77.c = null;
             oi77.d = null;
             Boolean fALSE = Boolean.FALSE;
             oi77.e = fALSE;
             oi77.f = fALSE;
             oi77.a = r45.a(p0.a);
             zu2 c = p0.c;
             oi77.c = c.f();
             oi77.f = Boolean.valueOf((c.c() ^ 0x01));
             oi77.e = Boolean.valueOf(p0.d);
             pu opu = oi77.k();
             p0 = ((uoaq6 = td7.d(p0.b.e(p0.a))) != null)? tb.c.d(uoaq6).map(new pp(12)).first(fALSE).flatMap(new ws3(tb, p0, opu, 2)): Single.just(opu);
             return p0.flatMap(new e16(8, tb));
             break;
           default:
             return tb.b.l().t(new df5()).onErrorReturn(new pp(13));
       }
       return tb.b.i().t(new df5()).onErrorReturn(new pp(i));
    }
}
