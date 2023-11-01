package p.t9;
import p.yf2;
import p.y8;
import p.v9;
import java.lang.Object;
import java.util.List;
import java.lang.CharSequence;
import p.av6;
import java.lang.Class;
import java.lang.String;
import p.co5;
import p.zk;
import p.y9;
import io.reactivex.rxjava3.core.Single;
import p.ir2;
import io.reactivex.rxjava3.core.Observable;
import p.r9;
import p.s9;
import p.ir0;

public final class t9 implements yf2	// class@00272b from classes.dex
{
    public final int a;
    public final y8 b;
    public final v9 c;

    public void t9(int p0,y8 p1,v9 p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final Object apply(Object p0){
       if (p0.size() < this.a) {
          t9 tb = this.b;
          if ((av6.p0(tb.v) ^ 0x01)) {
             t9 tc = this.c;
             v9 a = tc.a;
             a.getClass();
             y8 v = tb.v;
             co5.o(v, "path");
             Single single = a.a.d("allboarding".concat(v)).map(ir2.z);
             co5.l(single, "apiEndpoint.getAllboardi…}\n            \)\n        }");
             Observable observable = a.g(single);
             p0 = observable.map(new r9(tc, tb, p0));
             p0 = p0.doOnSubscribe(new s9(tc, 0, tb));
          label_0059 :
             return p0;
          }
       }
       p0 = Observable.just(p0);
       goto label_0059 ;
    }
}
