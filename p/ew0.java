package p.ew0;
import p.cw0;
import java.lang.Object;
import p.aq6;
import java.util.List;
import io.reactivex.rxjava3.core.Completable;
import java.lang.Class;
import p.tk0;
import java.lang.Enum;
import p.ow0;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Exception;
import p.ok0;
import java.lang.Boolean;
import io.reactivex.rxjava3.core.Single;
import p.wn3;
import io.reactivex.rxjava3.core.Observable;
import p.xl6;
import p.yf2;
import p.zv0;
import p.ys5;
import p.up0;
import p.bi5;
import io.reactivex.rxjava3.core.Maybe;
import p.ws3;
import p.jk0;
import p.rk0;
import io.reactivex.rxjava3.core.CompletableSource;
import p.ft6;
import p.co5;
import p.ir0;
import p.lb;
import p.b5;
import p.fl0;
import p.aw0;
import p.k34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.rp;
import p.c34;
import p.yv0;
import p.c05;
import p.k05;
import p.tv0;
import com.google.protobuf.Empty;
import p.bs1;
import p.s74;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.l94;
import p.ir2;
import p.xv0;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.ObservableSource;

public final class ew0	// class@00150b from classes.dex
{
    public final cw0 a;

    public void ew0(cw0 p0){
       super();
       this.a = p0;
    }
    public final Completable a(aq6 p0,List p1){
       ok0 ook0;
       Single single;
       aq6 uoaq6 = p0;
       Object obj = p1;
       ew0 a = this.a;
       a.getClass();
       tk0 a1 = tk0.a;
       int i = uoaq6.b.ordinal();
       int i1 = 1;
       ow0 l = a.l;
       if (i != 3) {
          if (i != 52) {
             if (i != 64) {
                if (i != 9 && i != 10) {
                   ook0 = Completable.h(new IllegalArgumentException(p0.toString()));
                label_00ce :
                   return ook0;
                }else {
                label_004a :
                   single = l.b(uoaq6).firstOrError().map(new xl6(20));
                }
             }else {
                single = Single.just(Boolean.FALSE);
             }
          }else {
             single = Single.just(Boolean.FALSE);
             a1 = l.d(uoaq6, i1);
          }
       }else {
          goto label_004a ;
       }
       ys5 v = ys5.v;
       Single single1 = a.z(uoaq6).map(new xl6(21)).first(v).onErrorReturnItem(v);
       Maybe maybe = single1.filter(new up0(i1, obj));
       maybe.getClass();
       mb g = co5.g;
       lb f = co5.f;
       ook0 = Completable.u(a.x(single.flatMapCompletable(new zv0(a, uoaq6, 0)).c(new jk0(maybe, 5, new ws3(a, uoaq6, obj, 5))).c(a1))).g(new ft6(a, 3, uoaq6), g, f, f, f, f).g(g, g, f, f, new aw0(a, 0), f);
       goto label_00ce ;
    }
    public final Completable b(){
       ew0 ta = this.a;
       ta.getClass();
       Maybe maybe = ta.I.map(new xl6(18)).firstElement();
       maybe.getClass();
       k34 ok34 = new k34(maybe, new xl6(19), 1);
       c34 uoc34 = new c34(ok34, new rp(19), 0);
       return Completable.u(ta.x(new jk0(uoc34, 5, new yv0(ta, 0))));
    }
    public final Observable c(){
       ew0 ta = this.a;
       tv0 p = ta.n.p;
       p.getClass();
       Empty uEmpty = Empty.f();
       co5.l(uEmpty, "getDefaultInstance\(\)");
       bs1 a = p.a;
       a.getClass();
       Observable observable = a.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeError", uEmpty);
       observable = observable.map(new l94(27));
       co5.l(observable, "callStream\(\"spotify.offl…     }\n                }\)");
       observable = observable.map(ir2.W);
       co5.l(observable, "client.SubscribeError\(Em… code = value }\n        }");
       return Observable.merge(ta.v().map(new xl6(14)).compose(new xv0(ta, 2)), observable.map(new xl6(15)).filter(new rp(17)).map(new up0(0, new k05(c05.v))).compose(new xv0(ta, 3)));
    }
    public final Observable d(aq6 p0){
       ew0 ta = this.a;
       return ta.z(p0).map(new xl6(27)).distinctUntilChanged().compose(new xv0(ta, 6));
    }
    public final Observable e(){
       ew0 ta = this.a;
       ta.getClass();
       return ta.I.filter(new rp(16)).map(new xl6(12)).map(new xl6(13)).distinctUntilChanged().compose(new xv0(ta, 1));
    }
}
