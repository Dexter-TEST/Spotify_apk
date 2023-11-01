package p.zo;
import p.tt5;
import p.ru1;
import p.sm3;
import p.rc6;
import p.xs6;
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
import p.ko0;
import p.za3;
import p.lj;
import p.oh5;
import java.util.concurrent.atomic.AtomicLong;
import p.ap;
import java.util.List;
import p.wc;
import p.ay6;
import p.wf2;
import p.wo;
import p.d22;
import io.reactivex.rxjava3.core.Single;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import p.st5;
import p.a22;
import com.spotify.ucs.proto.v0.b;
import com.spotify.ucs.proto.v0.UcsRequest;
import com.spotify.ucs.proto.v0.c;
import com.spotify.ucs.proto.v0.UcsRequest$CallerInfo;
import java.lang.Enum;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import p.no0;
import com.spotify.ucs.proto.v0.a;
import com.spotify.ucs.proto.v0.UcsRequest$AccountAttributesRequest;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.ir0;
import p.i70;
import io.reactivex.rxjava3.core.SingleTransformer;
import p.xo;
import p.yo;
import p.l22;
import p.yf2;
import p.s36;

public final class zo implements tt5	// class@002f3c from classes.dex
{
    public final lj a;
    public final hw5 b;
    public final gg1 c;
    public final xs6 d;
    public final oh5 e;
    public final n22 f;
    public final ko0 g;
    public final AtomicLong h;
    public long i;
    public final boolean j;
    public final ay6 k;
    public final wo l;

    public void zo(ru1 p0,sm3 p1,rc6 p2,xs6 p3){
       ds7 uods7 = new ds7();
       uods7.c("https://spclient.wg.spotify.com/");
       uods7.d = p1;
       uods7.b(new nm5());
       uods7.a(new v06(null, false));
       cy5 uocy5 = uods7.e();
       uocy5 = uocy5.b(hw5.class);
       co5.l(uocy5, "retrofit\n               …olverService::class.java\)");
       rc6 b = p2.b;
       co5.o(b, "appMetadata");
       p2 = p2.c;
       co5.o(p2, "policyInputs");
       super();
       this.a = b;
       this.b = uocy5;
       this.c = new gg1();
       this.d = p3;
       this.e = p2;
       this.f = new n22(p3);
       this.g = new ko0(p3, new za3(p0, b, p2, false));
       this.h = new AtomicLong(0);
       this.j = ap.a.contains("com.spotify.lite");
       this.k = new ay6(new wc(5, this));
       this.l = new wo(this, 1);
    }
    public final Single a(d22 p0){
       Single single;
       zo tj;
       int i1;
       this.c.getClass();
       long l = System.currentTimeMillis();
       zo tk = this.k;
       long l1 = TimeUnit.SECONDS.toMillis((long)tk.getValue().b());
       if (p0 == d22.w && ((l - this.i) - l1) < 0) {
          single = Single.just(a22.b);
          co5.l(single, "just\(FetchResult.NoOperation\)");
          return single;
       }else {
          int i = 0;
          c uoc1 = ((tj = this.j) == null && !tk.getValue().a())? 0: 1;
          zo ta = this.a;
          co5.o(ta, "appMetadata");
          zo te = this.e;
          co5.o(te, "policyInputs");
          b uob = UcsRequest.i();
          c uoc = UcsRequest$CallerInfo.i();
          uoc.e();
          uoc.d();
          uoc.c(p0.name());
          uob.d(uoc);
          uob.e(no0.a(ta, p0, te));
          if (i1) {
             uob.c(UcsRequest$AccountAttributesRequest.f());
          }
          uoc1 = uob.build();
          co5.l(uoc1, "requestBuilder.build\(\)");
          st5 value = tk.getValue();
          co5.o(value, "sdkProperties");
          zo tf = this.f;
          tf.getClass();
          single = this.b.b(uoc1).doOnSubscribe(new wo(this, i)).doOnSuccess(this.l).compose(new i70()).doOnSuccess(new xo(this, p0, i)).doOnSuccess(new yo(this, l)).doOnError(new xo(this, p0, 1)).flatMap(new l22(tj, value, tf)).onErrorReturnItem(a22.a).subscribeOn(s36.c);
          co5.l(single, "override fun fetch\(fetch…On\(Schedulers.io\(\)\)\n    }");
          return single;
       }
    }
}
