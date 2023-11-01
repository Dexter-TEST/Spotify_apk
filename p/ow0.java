package p.ow0;
import p.p54;
import p.mo;
import java.lang.Class;
import java.util.EnumSet;
import java.util.Set;
import java.util.Collections;
import java.lang.Enum;
import android.content.Context;
import p.gv0;
import p.wn3;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import p.qv0;
import p.jv0;
import p.iv0;
import p.we6;
import p.mt6;
import p.a25;
import p.al5;
import p.oo;
import p.lp3;
import p.vw1;
import p.eo;
import p.fn0;
import p.t00;
import java.lang.Boolean;
import java.lang.Object;
import p.dt5;
import p.an5;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import p.fw0;
import p.jk0;
import p.y07;
import java.lang.String;
import java.lang.Throwable;
import p.jl;
import p.z07;
import java.lang.Exception;
import p.gw0;
import p.t81;
import p.hw0;
import p.zv6;
import p.yf2;
import p.ir0;
import io.reactivex.rxjava3.core.Scheduler;
import p.tv0;
import com.google.protobuf.Empty;
import p.co5;
import p.bs1;
import p.s74;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.l94;
import p.as1;
import p.ok0;
import p.kq1;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadRequest;
import com.google.protobuf.c;
import com.google.protobuf.b;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Completable;
import p.rk0;
import p.sp;
import p.rl0;
import io.reactivex.rxjava3.core.CompletableSource;

public abstract class ow0 extends p54	// class@00219f from classes.dex
{
    public final t00 A;
    public final al5 B;
    public final an5 C;
    public final jk0 D;
    public final AtomicInteger E;
    public final Scheduler F;
    public final qv0 k;
    public final wn3 l;
    public final gv0 m;
    public final iv0 n;
    public final jv0 o;
    public final ConnectionApis p;
    public final we6 q;
    public final mt6 r;
    public final a25 s;
    public final oo t;
    public final lp3 u;
    public final fn0 v;
    public final fn0 w;
    public final t00 x;
    public final t00 y;
    public final t00 z;
    public static final Set G;
    public static final Set H;

    static {
       ow0.G = Collections.unmodifiableSet(EnumSet.allOf(mo.class));
       ow0.H = Collections.unmodifiableSet(EnumSet.complementOf(EnumSet.of(mo.x)));
    }
    public void ow0(Context p0,gv0 p1,wn3 p2,ConnectionApis p3,qv0 p4,jv0 p5,iv0 p6,we6 p7,mt6 p8,a25 p9,al5 p10,oo p11,lp3 p12,vw1 p13,eo p14){
       super(p0, p2, p14);
       this.v = new fn0();
       this.w = new fn0();
       this.x = t00.a();
       t00 ot00 = t00.b(Boolean.FALSE);
       this.y = ot00;
       this.z = t00.a();
       this.A = t00.b(dt5.x);
       this.C = new an5();
       this.E = new AtomicInteger();
       this.k = p4;
       this.l = p2;
       this.p = p3;
       this.m = p1;
       this.o = p5;
       this.n = p6;
       this.q = p7;
       this.r = p8;
       this.s = p9;
       this.B = p10;
       this.t = p11;
       this.u = p12;
       Maybe maybe = ot00.firstElement();
       maybe.getClass();
       this.D = new jk0(maybe, 5, new fw0(this, 0));
       this.F = p13;
    }
    public static void s(ow0 p0){
       ow0 z = p0.z;
       if (p0.E.getAndIncrement() > 0) {
       }else {
          try{
             p0.k.a();
             p0.u();
             z.onNext(new y07());
          }catch(java.lang.Exception e2){
             jl.f("Failed to create native player", e2);
             z.onNext(new z07(e2));
          }
       }
       return;
    }
    public static void t(ow0 p0){
       ow0 z = p0.z;
       if (p0.E.decrementAndGet() > 0) {
       }else {
          try{
             p0.v.e();
             p0.k.b();
             z.onNext(new y07());
          }catch(java.lang.Exception e2){
             jl.f("Failed to destroy native player", e2);
             z.onNext(new z07(e2));
          }
       }
       return;
    }
    public final Observable r(Observable p0){
       ow0 tF = this.F;
       return Observable.using(new gw0(this, 1), new t81(p0, 3), new hw0(this, 1)).subscribeOn(tF).unsubscribeOn(tF);
    }
    public abstract void u();
    public final Observable v(){
       tv0 p = this.n.p;
       p.getClass();
       Empty uEmpty = Empty.f();
       co5.l(uEmpty, "getDefaultInstance\(\)");
       bs1 a = p.a;
       a.getClass();
       Observable observable = a.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeTotalProgress", uEmpty);
       observable = observable.map(new l94(28));
       co5.l(observable, "callStream\(\"spotify.offl…     }\n                }\)");
       Observable observable1 = observable.map(new as1(p, 0));
       co5.l(observable1, "override fun progress\(\):…progress\)\n        }\n    }");
       return observable1;
    }
    public final ok0 w(String p0){
       ow0 tn = this.n;
       tn.getClass();
       co5.o(p0, "contextUri");
       tv0 p = tn.p;
       p.getClass();
       kq1 okq1 = EsOffline$DownloadRequest.g();
       okq1.c(p0);
       c uoc = okq1.build();
       co5.l(uoc, "newBuilder\(\)\n           …                 .build\(\)");
       bs1 a = p.a;
       a.getClass();
       Single single = a.callSingle("spotify.offline_esperanto.proto.Offline", "RemoveDownload", uoc);
       single = single.map(new l94(29));
       co5.l(single, "callSingle\(\"spotify.offl…     }\n                }\)");
       return Completable.k(single);
    }
    public final rk0 x(Completable p0){
       ow0 tF = this.F;
       return new rk0(new rl0(new gw0(this, 0), new sp(p0, 4), new hw0(this, 0)).p(tF), tF, 0);
    }
}
