package p.fw0;
import p.yf2;
import io.reactivex.rxjava3.core.CompletableTransformer;
import p.ow0;
import java.lang.Object;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import p.rk0;
import java.lang.Integer;
import p.an3;
import p.jk0;
import p.km3;
import java.util.Map;
import java.lang.Class;
import p.nw0;
import p.g16;
import p.b5;
import p.ok0;
import java.lang.String;
import p.ha5;
import p.al5;
import p.vp;
import java.lang.Boolean;
import p.tv0;
import com.spotify.base.java.logging.Logger;
import com.spotify.prefs.esperanto.proto.EsPrefs$Value;
import p.t65;
import p.xe7;
import p.q14;
import java.lang.Long;
import p.ur1;
import com.spotify.storage.esperanto.proto.EsStorage$SetCacheSizeLimitParams;
import p.tr1;
import com.spotify.storage.esperanto.proto.EsStorage$CacheSizeLimit;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.co5;
import p.s74;
import io.reactivex.rxjava3.core.Single;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.jh6;
import p.mo;
import p.r45;
import io.reactivex.rxjava3.core.Observable;
import p.aq6;
import p.wn3;
import p.uo0;
import com.spotify.connect.esperanto.proto.ConnectMessages$PullRequest;
import p.xr1;
import p.pp;
import p.tk0;

public final class fw0 implements yf2, CompletableTransformer	// class@00164b from classes.dex
{
    public final int a;
    public final ow0 b;

    public void fw0(ow0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public CompletableSource a(Completable p0){
       fw0 tb = this.b;
       switch (this.a){
           case 0:
             return tb.x(p0);
           case 1:
             return tb.x(p0);
           case 2:
             return tb.x(p0);
           case 3:
             return tb.x(p0);
           case 4:
             return tb.x(p0);
           case 5:
             return tb.x(p0);
           case 6:
             return tb.x(p0);
           case 7:
             return tb.x(p0);
           case 8:
             return tb.x(p0);
           case 9:
             return tb.x(p0);
           case 10:
             return tb.x(p0);
           default:
             return tb.x(p0);
       }
    }
    public Object apply(Object p0){
       boolean i2;
       ow0 n1;
       Object[] objArray2;
       int i = 1;
       int i1 = 0;
       fw0 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             if (p0.booleanValue()) {
                p0 = tb.n.q;
                p0.getClass();
                c uoc = ConnectMessages$PullRequest.f().build();
                co5.l(uoc, "newBuilder\(\).build\(\)");
                p0 = p0.a;
                p0.getClass();
                p0 = p0.callSingle("spotify.connect.esperanto.proto.ConnectService", "Pull", uoc);
                p0 = p0.map(new pp(4));
                co5.l(p0, "callSingle\(\"spotify.conn…     }\n                }\)");
                p0 = Completable.k(p0);
             }else {
                p0 = tk0.a;
             }
             return p0;
             break;
           case 1:
             tb.getClass();
             p0 = (p0.booleanValue())? Observable.empty(): tb.x;
             return p0;
             break;
           case 2:
             tb.getClass();
             p0 = (!p0.c())? Observable.just(Boolean.FALSE): tb.l.b(p0.b()).distinctUntilChanged();
             return p0;
             break;
           case 3:
             tb.getClass();
             return Completable.i(new g16(tb, 12, p0));
           case 4:
             tb.getClass();
             long l = (long)(int)(p0.longValue() / 0xf4240);
             p0 = tb.n;
             p0.getClass();
             Object[] objArray = new Object[i];
             objArray[i1] = Long.valueOf(l);
             Logger.e("setCacheSize\(%s\)", objArray);
             ur1 our1 = EsStorage$SetCacheSizeLimitParams.g();
             tr1 otr1 = EsStorage$CacheSizeLimit.g();
             otr1.c(l);
             our1.c(otr1);
             EsStorage$SetCacheSizeLimitParams setCacheSize = our1.build();
             co5.l(setCacheSize, "params");
             p0 = p0.i;
             p0.getClass();
             p0 = p0.callSingle("spotify.storage.esperanto.proto.Storage", "SetCacheSizeLimit", setCacheSize);
             p0 = p0.map(new jh6(16));
             co5.l(p0, "callSingle\(\"spotify.stor…     }\n                }\)");
             p0 = p0.ignoreElement();
             co5.l(p0, "storageClient.SetCacheSi…t\(params\).ignoreElement\(\)");
             return p0;
           case 5:
             tb.getClass();
             boolean b = (p0.intValue() > 0)? true: false;
             i2 = p0.intValue();
             ow0 n = tb.n;
             n.getClass();
             Object[] objArray1 = new Object[]{Boolean.valueOf(b),Integer.valueOf(i2)};
             Logger.e("setCrossfade\(%b, %d\)", objArray1);
             t65[] ot65Array = new t65[]{new t65("audio.crossfade_v2", tv0.c(b)),new t65("audio.crossfade.time_v2", tv0.b(i2))};
             return n.g(q14.o0(ot65Array)).m();
             break;
           case 6:
             tb.getClass();
             i2 = p0.booleanValue();
             n1 = tb.n;
             n1.getClass();
             objArray2 = new Object[i];
             objArray2[i1] = Boolean.valueOf(i2);
             Logger.e("setGapless\(%s\)", objArray2);
             return n1.g(xe7.H(new t65("audio.gapless_v2", tv0.c(i2)))).m();
           case 7:
             tb.getClass();
             i2 = p0.booleanValue();
             n1 = tb.n;
             n1.getClass();
             objArray2 = new Object[i];
             objArray2[i1] = Boolean.valueOf(i2);
             Logger.e("setAutomix\(%s\)", objArray2);
             return n1.g(xe7.H(new t65("audio.automix", tv0.c(i2)))).m();
           case 8:
             tb.getClass();
             i2 = p0.booleanValue();
             n1 = tb.n;
             n1.getClass();
             objArray2 = new Object[i];
             objArray2[i1] = Boolean.valueOf(i2);
             Logger.e("setNormalizeVolume\(%s\)", objArray2);
             return n1.g(xe7.H(new t65("audio.normalize_v2", tv0.c(i2)))).m();
           case 9:
             p0 = tb.B;
             p0.getClass();
             return Completable.i(new ha5(9, p0)).c(p0.b.a.b().m());
           case 10:
             tb.getClass();
             p0 = tb.B;
             p0.getClass();
             return Completable.i(new g16(p0, 6, new nw0(i1, p0)));
           case 11:
             return tb.o.a.c(i1);
           default:
             tb.getClass();
             p0 = (!p0.c())? Observable.just(Boolean.FALSE): tb.l.b(p0.b());
             return p0;
       }
    }
}
