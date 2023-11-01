package p.ga4;
import p.vg0;
import p.nx6;
import java.lang.Object;
import p.aq6;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.sx6;
import java.lang.Throwable;
import p.p82;
import p.te5;
import java.lang.Class;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.s81;
import p.bh1;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.zg1;
import p.ix6;
import p.cm7;
import p.eh1;
import p.fh1;
import p.yg1;
import p.ch1;
import p.jx6;
import p.fa4;
import p.nh1;
import p.ph1;
import p.qh1;
import p.rh1;
import p.mh1;
import p.oh1;
import p.tg1;
import p.ih1;
import p.s36;
import p.px6;
import io.reactivex.rxjava3.core.Scheduler;
import p.bm;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import p.mi;
import p.xk5;
import p.ms3;
import p.qb4;
import p.ad6;
import java.util.Set;
import java.util.Collections;
import java.lang.Boolean;
import p.vv;
import p.xz3;
import p.sb4;
import p.j93;
import p.er7;
import io.reactivex.rxjava3.core.Observable;
import p.q06;
import p.pb4;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import p.bi5;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import p.pp;
import p.r82;
import p.yf2;
import java.lang.NullPointerException;

public final class ga4	// class@0016cf from classes.dex
{
    public final vg0 a;
    public final nx6 b;

    public void ga4(vg0 p0,nx6 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Flowable a(aq6 p0){
       Set set;
       int i = p0.b.ordinal();
       int i1 = 9;
       int i2 = 5;
       px6 int i3 = 3;
       int i4 = 1;
       if (i != i4 && (i != i3 && i != i2)) {
          if (i != 64) {
             if (i != i1 && (i != 10 && (i != 51 && i != 52))) {
                return Flowable.o(new sx6(new IllegalArgumentException(p0.toString())));
             }
          }else if(te5.a(p0.c)){
             return Flowable.o(new sx6(new IllegalArgumentException(p0.toString())));
          }
       }
       ga4 tb = this.b;
       tb.getClass();
       RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
       subtypeEffec.g(bh1.class, new s81(i3, tb.a));
       subtypeEffec.g(zg1.class, new s81(2, tb.b));
       nx6 c = tb.c;
       subtypeEffec.g(eh1.class, new ix6(c, 2));
       subtypeEffec.g(fh1.class, new ix6(c, 0));
       subtypeEffec.g(yg1.class, new ix6(c, i3));
       ix6 oix6 = new ix6(c, i4);
       subtypeEffec.g(ch1.class, oix6);
       c = tb.d;
       subtypeEffec.g(nh1.class, new jx6(c, 2));
       subtypeEffec.g(ph1.class, new jx6(c, 6));
       subtypeEffec.g(qh1.class, new jx6(c, i4));
       subtypeEffec.g(rh1.class, new jx6(c, i2));
       subtypeEffec.g(mh1.class, new jx6(c, 0));
       subtypeEffec.g(oh1.class, new jx6(c, i3));
       subtypeEffec.g(tg1.class, new jx6(c, 4));
       subtypeEffec.g(ih1.class, new s81(4, tb.e));
       i3 = new px6(s36.c, 0);
       lb4 olb4 = mi.A(new bm(0), RxConnectables.a(subtypeEffec.h())).a(i3).b(i3).e(ms3.h("MetadataSync"));
       ad6 uoad6 = new ad6(2);
       if ((set = Collections.emptySet()) != null) {
          uoad6.c = set;
          if ((set = Collections.emptySet()) != null) {
             uoad6.d = set;
             Boolean fALSE = Boolean.FALSE;
             uoad6.i = fALSE;
             uoad6.j = fALSE;
             uoad6.k = fALSE;
             uoad6.e(0);
             uoad6.a = p0;
             this.a.getClass();
             uoad6.b = "7e7cf598605d47caba394c628e2735a2";
             Flowable uFlowable = Observable.create(new q06(new sb4(olb4, uoad6.b(), new bm(0), new xz3()), Observable.empty())).takeUntil(new bm(i1)).toFlowable(BackpressureStrategy.c);
             uFlowable.getClass();
             r82 or82 = new r82(uFlowable, new pp(23), 0);
             return new r82(or82, new pp(24), 2);
          }else {
             throw new NullPointerException("Null loadedMetadata");
          }
       }else {
          throw new NullPointerException("Null requestedMetadata");
       }
    }
}
