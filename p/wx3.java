package p.wx3;
import p.yf2;
import p.o11;
import java.lang.Object;
import p.nt0;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.ur;
import p.m73;
import java.lang.Boolean;
import p.ux3;
import io.reactivex.rxjava3.core.Observable;
import p.ce7;
import p.aq6;
import com.spotify.base.java.logging.Logger;
import p.ex3;
import p.px3;
import p.tm5;
import p.zc;
import io.reactivex.rxjava3.core.Single;
import p.ir2;
import com.spotify.connectivity.connectiontype.DeferUntilConnected;
import io.reactivex.rxjava3.core.ObservableTransformer;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import com.spotify.connectivity.connectiontype.ConnectionType;
import p.tx3;
import p.sx3;
import p.jc7;
import io.reactivex.rxjava3.core.Flowable;
import p.p72;
import p.bi5;
import p.r82;
import p.i72;

public final class wx3 implements yf2	// class@002bc5 from classes.dex
{
    public final int a;
    public final o11 b;

    public void wx3(o11 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       String str;
       wx3 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             p0 = tb.c;
             p0.getClass();
             p72 op72 = new p72(p0, ir2.d0, 0);
             r82 or82 = new r82(op72, ir2.L, 0);
             return new i72(or82, ir2.M).x().switchMap(new wx3(tb, 0));
       }
       co5.o(p0, "p0");
       tb.getClass();
       if (!Boolean.parseBoolean(p0.c.get("has_lyrics"))) {
          p0 = Observable.just(ux3.a);
          co5.l(p0, "{\n            Observable…State.NoLyrics\)\n        }");
       }else {
          o11 b = tb.b;
          p0 = p0.a;
          co5.l(p0, "contextTrack.uri\(\)");
          b.getClass();
          try{
             str = "";
             if ((p0 = new aq6(p0).t) != null) {
             label_005c :
                b.b.getClass();
                p0 = b.a.a(p0, 0, b.b.a.get().c(), str).map(ir2.S);
                co5.l(p0, "lyricsEndpoint.loadLyric…  \).map { it.toLyrics\(\) }");
                p0 = p0.map(ir2.J).toObservable().compose(tb.t).onErrorReturn(ir2.K);
                tx3 a = (tb.v.getConnectionType().isOffline())? tx3.a: sx3.a;
                p0 = p0.startWithItem(a);
                co5.l(p0, "{\n            dataSource…              \)\n        }");
             }
          }catch(p.cq6 e4){
             Object[] objArray = new Object[]{p0,e4};
             Logger.i("Parsing uri [%s] failed; %s", objArray);
          }
          p0 = str;
          goto label_005c ;
       }
       return p0;
    }
}
