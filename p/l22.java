package p.l22;
import p.yf2;
import p.st5;
import p.n22;
import java.lang.Object;
import p.bx5;
import com.spotify.ucs.proto.v0.UcsResponseWrapper;
import p.a22;
import p.rb7;
import io.reactivex.rxjava3.core.CompletableSource;
import com.spotify.ucs.proto.v0.UcsResponseWrapper$UcsResponse;
import java.lang.String;
import p.co5;
import java.lang.Class;
import com.spotify.ucs.proto.v0.h;
import com.spotify.ucs.proto.v0.UcsResponseWrapper$AccountAttributesResponse;
import java.util.Map;
import java.util.LinkedHashMap;
import p.ge6;
import p.t37;
import p.m22;
import p.ok0;
import p.tk0;
import com.spotify.ucs.proto.v0.j;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import p.jk0;
import com.spotify.ucs.proto.v0.UcsResponseWrapper$Error;
import io.reactivex.rxjava3.core.Completable;
import p.pl0;
import io.reactivex.rxjava3.core.Single;

public final class l22 implements yf2	// class@001ccc from classes.dex
{
    public final boolean a;
    public final st5 b;
    public final n22 c;

    public void l22(boolean p0,st5 p1,n22 p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final Object apply(Object p0){
       int i2;
       ok0 ook0;
       bx5 b = p0.b;
       a22 a = a22.a;
       if (p0.a() && (b != null && b.g() == rb7.a)) {
          int i = 1;
          int i1 = 0;
          i2 = (this.a == null && !this.b.a())? 0: 1;
          CompletableSource[] uCompletable = new CompletableSource[2];
          UcsResponseWrapper$UcsResponse ucsResponse = b.h();
          co5.l(ucsResponse, "body.success");
          l22 tc = this.c;
          tc.getClass();
          if (ucsResponse.g() == h.a) {
             Map map = ucsResponse.h().f();
             co5.l(map, "ucsResponse.accountAttri…cess.accountAttributesMap");
             LinkedHashMap linkedHashMa = co5.C(map);
             if (i2) {
                linkedHashMa.isEmpty();
             }
             Object[] objArray = new Object[i1];
             t37.a().getClass();
             ge6.a(objArray);
             ook0 = new ok0(5, new m22(tc, ucsResponse));
          }else {
             ook0 = tk0.a;
             co5.l(ook0, "{\n            Completable.complete\(\)\n        }");
          }
          uCompletable[i1] = ook0;
          i2 = b.h();
          co5.l(i2, "body.success");
          ook0 = (i2.n() && (i2.l() == j.a && (i2.m().h() && i2.m().f() != null)))? 1: 0;
          if (ook0) {
             i2 = i2.m().f();
             co5.l(i2, "ucsResponse.resolveSuccess.configuration");
             i2 = tc.a(i2);
          }else {
             i2.k().getErrorCode();
             i2.k().g();
             i2 = new Object[i1];
             t37.a().getClass();
             ge6.l(i2);
             i2 = tk0.a;
             co5.l(i2, "{\n            Timber.tag…able.complete\(\)\n        }");
          }
          uCompletable[i] = i2;
          i2 = Completable.l(uCompletable);
          UcsResponseWrapper$UcsResponse ucsResponse1 = b.h();
          co5.l(ucsResponse1, "body.success");
          if (ucsResponse1.l() != j.b && ucsResponse1.g() != h.b) {
             a = a22.c;
          }
          i2 = i2.t(a);
       }else {
          p0 = Single.just(a);
       }
       return i2;
    }
}
