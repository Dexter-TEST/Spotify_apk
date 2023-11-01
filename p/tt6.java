package p.tt6;
import p.yf2;
import p.ut6;
import java.lang.Object;
import io.reactivex.rxjava3.core.Flowable;
import p.eq3;
import io.reactivex.rxjava3.core.Observable;
import p.ew0;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import p.ow0;
import p.tv0;
import java.lang.Class;
import com.spotify.storage.esperanto.proto.EsStorage$GetStatsParams;
import java.lang.String;
import p.co5;
import p.s74;
import io.reactivex.rxjava3.core.Single;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.jh6;
import p.ir2;
import p.i76;

public final class tt6 implements yf2	// class@0027dd from classes.dex
{
    public final int a;
    public final ut6 b;

    public void tt6(ut6 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       tt6 tb = this.b;
       switch (this.a){
           case 0:
             p0 = tb.w.a.n;
             p0.getClass();
             EsStorage$GetStatsParams getStatsPara = EsStorage$GetStatsParams.f();
             co5.l(getStatsPara, "params");
             p0 = p0.i;
             p0.getClass();
             p0 = p0.callSingle("spotify.storage.esperanto.proto.Storage", "GetStats", getStatsPara);
             p0 = p0.map(new jh6(15));
             co5.l(p0, "callSingle\(\"spotify.stor…     }\n                }\)");
             p0 = p0.map(ir2.U);
             co5.l(p0, "storageClient.GetStats\(p…   .toInt\(\)\n            }");
             return p0;
           case 1:
             return Flowable.p(tb.t.d(), tb.w.e().toFlowable(BackpressureStrategy.c));
           default:
             return tb.w.e().map(new i76(28)).distinctUntilChanged();
       }
    }
}
