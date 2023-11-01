package p.es1;
import p.ht0;
import p.qs3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.w51;
import io.reactivex.rxjava3.core.Single;
import p.ds1;
import p.nv;
import p.qr1;
import com.spotify.player.esperanto.proto.EsSkipPrev$SkipPrevRequest;
import p.r45;
import p.ov;
import p.pr;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import p.b17;
import java.lang.Boolean;
import p.rt;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import p.eo5;
import p.nt0;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import com.google.protobuf.c;
import com.google.protobuf.b;
import java.lang.Class;
import p.s74;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.a05;
import p.yf2;
import p.lz0;

public final class es1	// class@0014e8 from classes.dex
{
    public final ht0 a;
    public final qs3 b;

    public void es1(ht0 p0,qs3 p1){
       co5.o(p0, "playerClient");
       co5.o(p1, "loggingParamsFactory");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Single a(w51 p0){
       p0 = p0.E(new ds1(this, 4), new ds1(this, 6), new ds1(this, 9), new ds1(this, 12), new ds1(this, 0), new ds1(this, 3));
       co5.l(p0, "override fun execute\(pla…stop\(\) },\n        \)\n    }");
       return p0;
    }
    public final Single b(nv p0){
       nv b;
       rt obj;
       qr1 oqr1 = EsSkipPrev$SkipPrevRequest.j();
       if (p0.b.c()) {
          b = p0.b;
          if (b.b().b != null) {
             ov b1 = b.b().b;
             co5.l(b1, "command.options\(\).get\(\).commandOptions\(\)");
             oqr1.e(b17.g(b1));
          }
          if (b.b().a.c()) {
             obj = b.b().a.b();
             co5.l(obj, "command.options\(\).get\(\).allowSeeking\(\).get\(\)");
             oqr1.c(obj.booleanValue());
          }
       }
       b = p0.c;
       co5.l(b, "command.loggingParams\(\)");
       obj = this.b.b(b);
       co5.l(obj, "loggingParamsFactory.dec…(command.loggingParams\(\)\)");
       oqr1.d(eo5.w(obj));
       p0 = p0.a;
       if (p0.c()) {
          p0 = p0.b();
          co5.l(p0, "command.track\(\).get\(\)");
          oqr1.f(co5.t(p0));
       }
       c uoc = oqr1.build();
       co5.l(uoc, "requestBuilder.build\(\)");
       es1 ta = this.a;
       ta.getClass();
       Single single = ta.callSingle("spotify.player.esperanto.proto.ContextPlayer", "SkipPrev", uoc);
       single = single.map(new a05(3));
       co5.l(single, "callSingle\(\"spotify.play…     }\n                }\)");
       single = single.map(lz0.b);
       co5.l(single, "playerClient.SkipPrev\(re…::commandResultFromProto\)");
       return single;
    }
}
