package p.w86;
import p.vi7;
import p.o11;
import java.lang.Boolean;
import p.iv;
import android.content.Context;
import p.g96;
import p.np3;
import p.an5;
import java.lang.String;
import com.spotify.mobius.rx3.RxMobius$SubtypeEffectHandlerBuilder;
import com.spotify.mobius.rx3.RxMobius;
import p.t86;
import p.d66;
import java.lang.Class;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.y56;
import p.z56;
import p.b66;
import p.u56;
import p.r56;
import p.s56;
import p.bm;
import p.xo0;
import com.spotify.mobius.rx3.RxConnectables;
import p.kd7;
import p.lb4;
import p.mi;
import p.ms3;
import p.qb4;
import java.lang.Object;
import p.sb4;

public final class w86 extends vi7	// class@002aea from classes.dex
{
    public final an5 A;
    public final sb4 B;
    public final g96 t;
    public final np3 v;
    public final String w;
    public final String x;
    public final an5 y;
    public final an5 z;
    public static final iv C;

    static {
       o11 oo11 = new o11(23, 0);
       oo11.b = Boolean.FALSE;
       oo11.t = null;
       oo11.c = null;
       oo11.v = null;
       oo11.w = null;
       w86.C = oo11.l().a(true);
    }
    public void w86(Context p0,g96 p1,np3 p2){
       super();
       this.y = new an5();
       this.z = new an5();
       this.A = new an5();
       this.t = p1;
       this.v = p2;
       this.w = p0.getString(R.string.search_recent_searches);
       this.x = p0.getString(R.string.search_delete_recent_searches);
       RxMobius$SubtypeEffectHandlerBuilder subtypeEffec = RxMobius.a();
       subtypeEffec.g(d66.class, new t86(this, 4));
       subtypeEffec.g(y56.class, new t86(this, 0));
       subtypeEffec.g(z56.class, new t86(this, 6));
       subtypeEffec.g(b66.class, new t86(this, 5));
       subtypeEffec.g(u56.class, new t86(this, 3));
       subtypeEffec.g(r56.class, new t86(this, 2));
       subtypeEffec.g(s56.class, new t86(this, 1));
       this.B = mi.g(mi.A(new bm(5), RxConnectables.a(subtypeEffec.h())).d(new bm(3)).e(ms3.i("Search")), w86.C);
    }
}
