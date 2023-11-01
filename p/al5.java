package p.al5;
import android.content.Context;
import p.km3;
import p.jq3;
import p.cm7;
import java.lang.Object;
import p.ym5;
import p.i77;
import java.lang.Boolean;
import android.content.res.Resources;
import android.content.res.Configuration;
import p.br3;
import p.is7;
import java.util.Locale;
import java.lang.String;
import p.sv;
import p.t00;
import io.reactivex.rxjava3.core.Observable;
import java.util.Objects;
import p.zk5;
import p.yf2;
import p.fx6;
import io.reactivex.rxjava3.core.Single;
import p.uf;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.core.Completable;
import p.jk0;
import p.mx6;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Class;
import p.r82;
import p.ok0;
import io.reactivex.rxjava3.core.ObservableSource;
import p.zo0;
import p.tv4;
import java.lang.NullPointerException;

public final class al5	// class@000fa7 from classes.dex
{
    public final ym5 a;
    public final km3 b;
    public final t00 c;
    public final tv4 d;

    public void al5(Context p0,km3 p1,jq3 p2,cm7 p3){
       String country;
       super();
       this.a = new ym5();
       this.b = p1;
       i77 oi77 = new i77();
       Boolean fALSE = Boolean.FALSE;
       oi77.b = fALSE;
       oi77.a = fALSE;
       oi77.c = "";
       oi77.e = fALSE;
       fALSE = Boolean.TRUE;
       oi77.f = fALSE;
       oi77.d = "free";
       if ((country = is7.p(p0.getResources().getConfiguration()).c(0).getCountry()) == null) {
          throw new NullPointerException("Null country");
       }
       oi77.c = country;
       oi77.f = fALSE;
       this.c = t00.b(oi77.m());
       Objects.requireNonNull(p2);
       Flowable uFlowable = p3.d().compose(new uf()).map(new fx6(10)).flatMapCompletable(new zk5(p2, 1)).m().r();
       uFlowable.getClass();
       r82 or82 = new r82(uFlowable, new mx6(1, this), 3);
       zo0 ozo0 = Observable.merge(p1.b().switchMap(new zk5(p2, 0)).map(new fx6(9)), new ok0(6, or82).s()).replay(1);
       ozo0.getClass();
       this.d = new tv4(ozo0);
       return;
    }
}
