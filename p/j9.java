package p.j9;
import p.yf2;
import p.v9;
import p.d9;
import java.lang.Object;
import p.ux5;
import java.lang.String;
import p.co5;
import java.lang.Throwable;
import p.ls6;
import p.e55;
import p.qb;
import p.f55;
import p.m46;
import p.aa;
import p.fa;
import p.d55;
import p.ca;
import p.h9;
import java.lang.Long;
import java.lang.Class;
import p.zk;
import p.y9;
import p.q25;
import com.spotify.allboarding.model.v1.proto.OnboardingRequest;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import p.ca6;
import com.spotify.allboarding.model.v1.proto.SelectedItem;
import com.google.protobuf.c;
import com.google.protobuf.b;
import io.reactivex.rxjava3.core.Single;
import p.ir2;
import io.reactivex.rxjava3.core.Observable;
import p.k9;
import p.ir0;

public final class j9 implements yf2	// class@001a94 from classes.dex
{
    public final int a;
    public final v9 b;
    public final d9 c;

    public void j9(v9 p0,d9 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object apply(Object p0){
       j9 tc = this.c;
       j9 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             p0 = tb.a;
             d9 a = tc.a;
             p0.getClass();
             co5.o(a, "path");
             d9 b = tc.b;
             co5.o(b, "items");
             zk a1 = p0.a;
             String str = "allboarding".concat(a);
             q25 oq25 = OnboardingRequest.g();
             ArrayList uArrayList = new ArrayList(aj0.b0(b));
             Iterator iterator = b.iterator();
             while (iterator.hasNext()) {
                ca6 uoca6 = SelectedItem.g();
                uoca6.c(iterator.next());
                uArrayList.add(uoca6.build());
             }
             oq25.c(uArrayList);
             OnboardingRequest onboardingRe = oq25.build();
             co5.l(onboardingRe, "buildSubmitStepBody\(items\)");
             Single single = a1.b(str, onboardingRe).map(ir2.x);
             co5.l(single, "apiEndpoint.postAllboard…)\n            \)\n        }");
             p0 = p0.g(single);
             return p0.map(new j9(tb, tc, 0)).doOnSubscribe(new k9(tb, 0));
       }
       co5.l(p0, "result");
       p0 = p0.a;
       if (ux5.a(p0) == null) {
          tb.f.c(e55.b);
          p0 = (p0.c instanceof m46)? aa.a: new fa(p0);
       }else {
          tb.f.c(d55.b);
          p0 = new ca(tc);
       }
       return p0;
    }
}
