package p.ub7;
import p.tt5;
import p.rc6;
import p.ru1;
import p.xs6;
import p.sm3;
import p.ds7;
import java.lang.String;
import p.nm5;
import p.qu0;
import p.v06;
import io.reactivex.rxjava3.core.Scheduler;
import p.u90;
import p.cy5;
import p.hw5;
import java.lang.Class;
import java.lang.Object;
import p.co5;
import p.gg1;
import p.n22;
import java.util.concurrent.atomic.AtomicLong;
import p.ko0;
import p.za3;
import p.lj;
import p.oh5;
import p.sb7;
import p.d22;
import io.reactivex.rxjava3.core.Single;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import p.no0;
import p.ge6;
import p.t37;
import com.google.protobuf.c;
import p.ir0;
import p.i70;
import io.reactivex.rxjava3.core.SingleTransformer;
import p.tb7;
import p.mb;
import p.mf1;
import p.yf2;
import p.a22;
import p.s36;

public final class ub7 implements tt5	// class@00287e from classes.dex
{
    public final lj a;
    public final hw5 b;
    public final gg1 c;
    public final oh5 d;
    public final n22 e;
    public final AtomicLong f;
    public final ko0 g;
    public final sb7 h;

    public void ub7(rc6 p0,ru1 p1,xs6 p2,sm3 p3){
       ds7 uods7 = new ds7();
       uods7.c("https://spclient.wg.spotify.com/");
       uods7.d = p3;
       uods7.b(new nm5());
       uods7.a(new v06(null, false));
       cy5 uocy5 = uods7.e();
       uocy5 = uocy5.b(hw5.class);
       co5.l(uocy5, "retrofit\n               …olverService::class.java\)");
       rc6 b = p0.b;
       co5.o(b, "appMetadata");
       p0 = p0.c;
       co5.o(p0, "policyInputs");
       super();
       this.a = b;
       this.b = uocy5;
       this.c = new gg1();
       this.d = p0;
       this.e = new n22(p2);
       this.f = new AtomicLong(0);
       this.g = new ko0(p2, new za3(p1, b, p0, 1));
       this.h = new sb7(this, 1);
    }
    public final Single a(d22 p0){
       ResolveRequest resolveReque = no0.a(this.a, p0, this.d);
       resolveReque.toString();
       Object[] objArray = new Object[0];
       t37.a().getClass();
       ge6.k(objArray);
       ub7 te = this.e;
       te.getClass();
       Single single = this.b.a(resolveReque).doOnSubscribe(new sb7(this, 0)).doOnSuccess(this.h).compose(new i70()).doOnSuccess(new tb7(this, p0, 0)).doOnError(mb.y).doOnError(new tb7(this, p0, 1)).flatMap(new mf1(11, te)).onErrorReturnItem(a22.a).subscribeOn(s36.c);
       co5.l(single, "override fun fetch\(fetch…On\(Schedulers.io\(\)\)\n    }");
       return single;
    }
}
