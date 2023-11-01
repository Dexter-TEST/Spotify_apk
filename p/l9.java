package p.l9;
import p.yf2;
import p.v9;
import java.lang.Object;
import p.y8;
import java.lang.String;
import p.co5;
import java.lang.Class;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import p.nr0;
import java.util.List;
import p.ox1;
import p.vk;
import p.iq6;
import io.reactivex.rxjava3.core.Observable;
import p.t9;
import p.u9;
import p.d9;
import java.util.concurrent.TimeUnit;
import java.lang.Long;
import p.j9;
import p.u8;
import p.x8;
import com.spotify.allboarding.entrypoint.EntryPoint;
import p.zk;
import p.y9;
import io.reactivex.rxjava3.core.Single;
import p.w9;
import p.ir2;
import p.q9;
import p.k9;
import p.ir0;
import com.spotify.allboarding.entrypointlite.AllboardingDoneImpl;
import p.co3;
import java.lang.Boolean;
import p.tn6;
import p.ok0;
import p.ko1;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;
import io.reactivex.rxjava3.core.Completable;
import p.lb;
import p.mb;
import p.b5;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fn0;
import p.aa;

public final class l9 implements yf2	// class@001d10 from classes.dex
{
    public final int a;
    public final v9 b;

    public void l9(v9 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       Observable observable;
       y8 obj;
       int i = 1;
       int i1 = 0;
       String str = "effect";
       l9 tb = this.b;
       switch (this.a){
           case 0:
             co5.l(p0, str);
             tb.getClass();
             x8 a = p0.a;
             String endpointPath = a.getEndpointPath();
             tb.c.getClass();
             String label = a.getLabel();
             v9 a1 = tb.a;
             a1.getClass();
             co5.o(endpointPath, "path");
             co5.o(label, "entryPoint");
             Single single = w9.a(a1.a, endpointPath, "", label, null, null, null, 56, null).map(ir2.y);
             co5.l(single, "apiEndpoint.getAllboardi…oDomain\(\)\n        \)\n    }");
             observable = a1.g(single);
             p0 = observable.map(new q9(tb, i1, p0));
             p0 = p0.doOnSubscribe(new k9(tb, 5));
             co5.l(p0, "private fun getInitialSt…er.initialLoadStarted\(\) }");
             return p0;
           case 1:
             tb.getClass();
             p0 = tb.h.map(new l9(tb, 4));
             co5.l(p0, "private fun onFinishAllB…lBoarding\n        }\n    }");
             return p0;
           case 2:
             co5.l(p0, str);
             tb.getClass();
             observable = (p0.c != null)? Observable.timer(3, TimeUnit.SECONDS): Observable.just(Long.valueOf(1));
             p0 = observable.flatMap(new j9(tb, p0, i));
             co5.l(p0, "private fun concludeStep…arted\(\) }\n        }\n    }");
             return p0;
             break;
           case 3:
             co5.l(p0, str);
             tb.getClass();
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = p0.t.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (!p0.c.contains(obj.a())) {
                   uArrayList.add(obj);
                }
             }
             y8 a2 = p0.a;
             obj = (a2 instanceof ox1)? a2: null;
             int i2 = (obj != null)? obj.h(): 0;
             if (!a2 instanceof vk && !a2 instanceof iq6) {
                i = false;
             }
             p0 = Observable.just(uArrayList).flatMap(new t9(i2, p0, tb)).map(new u9(i2, p0, i));
             co5.l(p0, "private fun onLoadMore\(e…    \)\n            }\n    }");
             return p0;
             break;
           default:
             tb.c.getClass();
             co5.l(p0, "it");
             p0 = tb.e;
             p0.getClass();
             AllboardingDoneImpl a3 = p0.a;
             p0.b.c(a3.b.s(a3.i, Boolean.TRUE).p(s36.c).subscribe(lb.b, mb.b));
             return aa.a;
       }
    }
}
