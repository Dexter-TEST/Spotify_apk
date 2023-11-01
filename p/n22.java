package p.n22;
import p.xs6;
import java.lang.Object;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import p.jk0;
import io.reactivex.rxjava3.core.Single;
import p.gg1;
import p.u00;
import p.vt5;
import p.yf2;
import p.mb;
import p.ir0;
import p.xo5;
import p.hs0;
import io.reactivex.rxjava3.core.Completable;

public final class n22	// class@001f51 from classes.dex
{
    public final xs6 a;

    public void n22(xs6 p0){
       super();
       this.a = p0;
    }
    public final jk0 a(Configuration p0){
       return Single.just(p0).doOnEvent(gg1.w).map(vt5.b).doOnError(mb.x).onErrorReturnItem(this.a.b()).doOnSuccess(new hs0(13, this)).ignoreElement().m();
    }
}
