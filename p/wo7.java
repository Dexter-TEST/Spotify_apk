package p.wo7;
import p.yf2;
import p.xo7;
import java.lang.Object;
import p.wn7;
import p.ma3;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import p.bm;
import p.bi5;
import p.jk0;
import p.ho7;
import p.pl0;
import p.tn7;
import p.wp3;
import java.lang.Boolean;
import p.tn6;
import p.ok0;
import p.ko1;
import p.mn7;
import p.tf6;
import java.lang.String;
import p.rh6;
import p.uf;
import io.reactivex.rxjava3.core.SingleTransformer;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import com.spotify.login.signupapi.services.model.ConfigurationResponse$Companion;
import p.fx6;
import p.kn7;
import java.lang.Class;
import p.vp;
import p.mx6;
import p.ot;
import p.ij;
import java.lang.Runnable;

public final class wo7 implements yf2	// class@002b7b from classes.dex
{
    public final int a;
    public final xo7 b;

    public void wo7(xo7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       wo7 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return tb.t.e(p0.M, p0.N).map(new fx6(18)).onErrorReturn(new mx6(5, p0));
           case 1:
             p0 = tb.x;
             return p0.a.e(p0.c).compose(new uf()).onErrorReturnItem(ConfigurationResponse.Companion.getDefault()).map(new fx6(19));
           case 2:
             p0 = tb.z;
             return p0.i.s(p0.a, Boolean.TRUE);
           case 3:
             return tb.w.a.flatMapCompletable(new wo7(tb, 4)).n(new bm(13)).t(new ho7());
           default:
             tb.getClass();
             return Completable.j(new ij(tb, 28, p0));
       }
    }
}
