package p.e43;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.iu2;
import p.ty0;
import java.lang.String;
import p.bu2;
import p.k23;
import p.a43;
import java.lang.Boolean;
import java.io.Serializable;
import p.ju2;
import p.z23;
import java.lang.Enum;
import p.c23;
import p.zt2;
import p.a23;
import android.content.Context;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import p.pp;
import p.yf2;
import io.reactivex.rxjava3.core.Maybe;
import java.lang.Class;
import java.util.Objects;
import p.jh2;
import p.k34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.a44;
import p.sp6;
import p.b43;
import p.su2;
import p.ry2;
import p.fu2;
import p.gu2;
import p.o23;
import p.tu2;
import p.st2;
import p.n13;
import p.tt2;
import com.spotify.connectivity.connectiontype.InternetState;
import java.lang.Throwable;
import java.lang.StringBuilder;
import p.jl;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ox7;
import p.c43;

public final class e43 implements ObservableTransformer	// class@001417 from classes.dex
{
    public final a44 a;
    public final b43 b;
    public final b43 c;
    public final b43 d;
    public final b43 e;
    public final b43 f;
    public final b43 g;
    public final Single h;
    public static final ju2 i;
    public static final b43 j;
    public static final c23 k;

    static {
       k23 ok23 = ty0.k().o("loading-indicator").j("app:loading_indicator", bu2.w.a).g();
       e43.i = ok23;
       ju2[] oju2Array = new ju2[]{ok23};
       e43.j = ty0.B().c("lite:inProgress", Boolean.TRUE).k(oju2Array).g();
       e43.k = ty0.l("lite:whitePrimaryButton", bu2.t.name());
       ty0.b().r("hubs:glue:highlight", "1").d();
       ty0.b().b("lite:playing", 1).d();
    }
    public void e43(Context p0,InternetMonitor p1){
       super();
       this.h = p1.getInternetState().firstOrError();
       Maybe maybe = p1.getInternetState().map(new pp(11)).firstElement();
       Boolean fALSE = Boolean.FALSE;
       maybe.getClass();
       Objects.requireNonNull(fALSE, "item is null");
       k34 ok34 = new k34(maybe, new jh2(fALSE), 2);
       Objects.requireNonNull(fALSE, "defaultItem is null");
       this.a = new a44(ok34, 1, fALSE);
       sp6 v = sp6.V;
       this.c = e43.b(v, p0.getString(R.string.hubs_error_offline_title), p0.getString(R.string.hubs_error_offline_description), p0.getString(R.string.hubs_error_offline_retry_button), false);
       this.d = e43.b(v, p0.getString(R.string.hubs_error_dependency_title), p0.getString(R.string.hubs_error_dependency_description), p0.getString(R.string.hubs_error_dependency_retry_button), false);
       this.f = e43.b(sp6.W, p0.getString(R.string.hubs_error_default_title), p0.getString(R.string.hubs_error_default_description), p0.getString(R.string.hubs_error_default_retry_button), false);
       this.e = e43.b(sp6.J, p0.getString(R.string.hubs_error_forced_offline_title), p0.getString(R.string.hubs_error_forced_offline_description), p0.getString(R.string.hubs_error_forced_offline_retry_button), 1);
       b43 j = e43.j;
       this.g = j;
       ju2[] oju2Array = new ju2[]{e43.i.a().s(ty0.z().b(p0.getString(R.string.hubs_error_timeout_description))).g()};
       this.b = j.a().k(oju2Array).g();
    }
    public static b43 a(String p0,String p1){
       gu2 ogu2 = ty0.o();
       ogu2.getClass();
       iu2 oiu2 = ty0.k().k(ry2.t).p(ogu2.b("FLAG"));
       if (p0 != null || p1 != null) {
          oiu2 = oiu2.s(ty0.z().d(p0).b(p1));
       }
       ju2[] oju2Array = new ju2[]{oiu2.g()};
       return ty0.B().c("lite:error", Boolean.TRUE).k(oju2Array).g();
    }
    public static b43 b(sp6 p0,String p1,String p2,String p3,boolean p4){
       gu2 ogu2;
       ju2[] oju2Array1;
       ju2[] oju2Array = new ju2[]{ty0.k().k(ry2.t).p(ogu2.b(p0.name())).s(ty0.z().d(p1).b(p2)).i(oju2Array1).g()};
       ogu2 = ty0.o();
       ogu2.getClass();
       oju2Array1 = new ju2[]{ty0.k().k(e43.k).t(ty0.z().d(p3).build()).e("click", ty0.j().d("reload").a("allow_offline", Boolean.valueOf(p4)).b()).g()};
       return ty0.B().c("lite:error", Boolean.TRUE).k(oju2Array).g();
    }
    public static void c(InternetState p0,Throwable p1,boolean p2){
       String str = (p2)? "by not-explicitly-offline branch.": "by error.";
       jl.q("DefaultError state has been achieved "+str+" | "+p0, p1);
       return;
    }
    public final ObservableSource apply(Observable p0){
       return ox7.P(ox7.P(p0, this.b, 6000), this.g, 500).onErrorResumeNext(new c43(this, 0)).onErrorResumeNext(new c43(this, 1));
    }
}
