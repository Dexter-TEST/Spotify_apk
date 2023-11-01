package p.p54;
import p.rf5;
import android.content.Context;
import p.wn3;
import p.eo;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import p.fn0;
import p.c0;
import p.t00;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Class;
import p.hb4;
import p.t81;
import p.v05;
import p.zv6;
import p.yf2;
import p.ir0;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import io.reactivex.rxjava3.core.Completable;
import p.ow0;
import p.tv0;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import com.spotify.storage.esperanto.proto.EsStorage$DeleteUnlockedItemsParams;
import p.co5;
import p.s74;
import io.reactivex.rxjava3.core.Single;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.jh6;
import p.fw0;
import io.reactivex.rxjava3.core.CompletableTransformer;
import p.s53;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.n54;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.r44;
import p.or7;
import p.mk4;
import p.xl6;
import p.jw0;
import p.iw0;
import android.support.v4.media.session.PlaybackStateCompat;
import p.do5;
import p.tk0;
import p.sf5;
import p.w51;
import p.es1;
import p.rv0;
import io.reactivex.rxjava3.core.CompletableSource;
import p.pu;
import p.r45;
import java.lang.Boolean;
import com.spotify.offline_esperanto.proto.a;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest;
import p.jq1;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfoPolicy;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.bs1;
import p.b05;
import p.q9;
import p.sv0;
import java.lang.Integer;
import p.ys5;
import p.ou;
import p.cs1;
import p.ok0;
import p.jk0;
import p.ks0;
import java.util.HashMap;
import p.rr;
import java.util.Map;
import p.o11;
import p.m73;
import p.qx5;
import p.jj5;
import com.google.common.collect.c;
import java.lang.IllegalArgumentException;
import java.lang.Exception;
import p.lq5;
import p.nt0;
import p.ur;
import p.aw1;
import p.vo1;
import com.spotify.player.esperanto.proto.EsAddToQueueRequest$AddToQueueRequest;
import p.pr;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import p.b17;
import p.ls1;
import p.rt;
import p.qs3;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import p.eo5;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import p.a05;
import p.js1;
import p.tf5;
import p.uf5;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.MediaDescriptionCompat;
import p.aq6;
import p.td7;
import java.lang.IllegalStateException;
import p.ox7;
import p.vf5;
import p.ov;
import p.si4;
import p.nv;
import p.wf5;
import java.lang.NullPointerException;
import p.xf5;
import java.util.Objects;
import p.ha5;
import p.b5;

public abstract class p54 implements rf5	// class@0021f5 from classes.dex
{
    public final Context a;
    public or7 b;
    public v44 c;
    public final wn3 d;
    public final eo e;
    public bo f;
    public final AtomicInteger g;
    public final fn0 h;
    public final t00 i;
    public final t00 j;

    public void p54(Context p0,wn3 p1,eo p2){
       super();
       this.g = new AtomicInteger();
       this.h = new fn0();
       c0 a = c0.a;
       this.i = t00.b(a);
       this.j = t00.b(a);
       this.a = p0;
       this.d = p1;
       this.e = p2;
    }
    public static Observable a(p54 p0,Observable p1){
       p0.getClass();
       return Observable.using(new hb4(3, p0), new t81(p1, 5), new v05(13)).doOnSubscribe(new v05(14)).subscribeOn(id.a()).unsubscribeOn(id.a());
    }
    public final Completable b(){
       ow0 oow0 = this;
       ow0 n = oow0.n;
       n.getClass();
       Object[] objArray = new Object[0];
       Logger.e("deleteUnlockedItems\(\)", objArray);
       EsStorage$DeleteUnlockedItemsParams uDeleteUnloc = EsStorage$DeleteUnlockedItemsParams.f();
       co5.l(uDeleteUnloc, "params");
       tv0 i = n.i;
       i.getClass();
       Single single = i.callSingle("spotify.storage.esperanto.proto.Storage", "DeleteUnlockedItems", uDeleteUnloc);
       single = single.map(new jh6(14));
       co5.l(single, "callSingle\(\"spotify.stor…     }\n                }\)");
       Completable uCompletable = single.ignoreElement();
       co5.l(uCompletable, "storageClient.DeleteUnlo…s\(params\).ignoreElement\(\)");
       return uCompletable.e(new fw0(oow0, 2));
    }
    public final Observable c(){
       return Observable.never().startWith(Observable.fromCallable(new s53(11, this))).doOnSubscribe(new v05(12)).subscribeOn(id.a()).compose(new n54(this, 1)).compose(new n54(this, 2));
    }
    public final r44 d(){
       p54 tb;
       r44 or44 = ((tb = this.b) == null)? null: tb.b;
       return or44;
    }
    public final Observable e(){
       return this.c().flatMap(new mk4(15)).doOnSubscribe(new v05(10));
    }
    public final Observable f(){
       return this.c().flatMap(new mk4(16)).doOnSubscribe(new v05(11));
    }
    public final Observable g(){
       ow0 oow0 = this;
       return oow0.A.map(new xl6(29)).distinctUntilChanged().map(new jw0(0)).compose(new iw0(oow0, 1)).compose(new n54(this, 3));
    }
    public final Observable h(){
       ow0 oow0 = this;
       return oow0.z.distinctUntilChanged().compose(new iw0(oow0, 0)).compose(new n54(this, 0));
    }
    public final Completable i(){
       r44 or44;
       PlaybackStateCompat playbackStat = ((or44 = this.d()) == null)? null: or44.c();
       if (!do5.I(playbackStat, 2)) {
          return tk0.a;
       }else {
          ow0 oow0 = this;
          ow0 n = oow0.n;
          n.getClass();
          Completable uCompletable = n.d.a(new sf5()).map(new rv0(n, 0)).ignoreElement();
          co5.l(uCompletable, "override fun pause\(featu…   .ignoreElement\(\)\n    }");
          return Completable.u(new fw0(oow0, 3).a(uCompletable));
       }
    }
    public final Completable j(pu p0){
       Object[] objArray;
       Completable uCompletable;
       pu opu = p0;
       String str = "play\(%s, %s, %s, %b\)";
       int i = 3;
       int i1 = 2;
       int i2 = 1;
       int i3 = 0;
       int i4 = 4;
       if (opu.a.c()) {
          String str1 = opu.a.b();
          pu c = opu.c;
          pu d = opu.d;
          pu e = opu.e;
          pu f = opu.f;
          ow0 oow0 = this;
          ow0 oow01 = oow0.n;
          oow01.getClass();
          co5.o(str1, "uri");
          objArray = new Object[i4];
          objArray[i3] = str1;
          objArray[i2] = c;
          objArray[i1] = d;
          objArray[i] = Boolean.valueOf(e);
          Logger.e(str, objArray);
          if (e == null) {
             tv0 p = oow01.p;
             p.getClass();
             a uoa = EsOffline$GetContextsRequest.h();
             jq1 ojq1 = EsOffline$ContextInfoPolicy.g();
             ojq1.c(i3);
             uoa.d(ojq1.build());
             uoa.c(str1);
             c uoc = uoa.build();
             co5.l(uoc, "newBuilder\(\).apply {\n   …ri\)\n            }.build\(\)");
             Observable observable = p.a.a(uoc).map(new q9(p, i, str1));
             co5.l(observable, "override fun offlineTrac…        }\n        }\n    }");
             sv0 i5 = new sv0(oow01, str1, c, d, e, f);
             uCompletable = observable.firstOrError().flatMapCompletable(i);
             co5.l(uCompletable, "override fun play\(\n     …        \)\n        }\n    }");
          }else {
             uCompletable = Completable.k(oow01.f.a(oow01.d(str1, null, c, d, e, f)));
          }
          return Completable.u(new fw0(oow0, 9).a(oow0.D.c(uCompletable)));
       }else {
          pu b = opu.b;
          if (!b.c()) {
             return Completable.h(new IllegalArgumentException());
          }
          ks0 oks0 = b.b();
          ow0 oow02 = this;
          if (opu.e != null) {
             HashMap hashMap = new HashMap(oks0.c);
             hashMap.put("license", "mod");
             o11 oo11 = ks0.a(oks0.a);
             oo11.t = m73.b(hashMap);
             rr e1 = oks0.e;
             qx5 oqx5 = (e1.c())? e1.b(): qx5.a;
             oqx5.getClass();
             oo11.w = new jj5(oqx5);
             e1 = oks0.d;
             c uoc1 = (e1.c())? e1.b(): ys5.v;
             uoc1.getClass();
             oo11.v = new jj5(uoc1);
             oo11.s(oks0.b);
             oks0 = oo11.d();
          }
          ow0 n = oow02.n;
          n.getClass();
          co5.o(oks0, "context");
          objArray = new Object[i4];
          objArray[i3] = oks0;
          pu c1 = opu.c;
          objArray[i2] = c1;
          pu d1 = opu.d;
          objArray[i1] = d1;
          opu = opu.f;
          objArray[i] = Boolean.valueOf(opu);
          Logger.e(str, objArray);
          return Completable.u(new fw0(oow02, 8).a(oow02.D.c(Completable.k(n.f.a(n.e(oks0, c1, d1, opu))))));
       }
    }
    public final Completable k(String p0){
       ow0 oow0 = this;
       ow0 n = oow0.n;
       n.getClass();
       co5.o(p0, "uri");
       ur our = nt0.a(p0).e();
       tv0 g = n.g;
       g.getClass();
       aw1 uoaw1 = new aw1(11);
       uoaw1.b = our;
       aw1 a = uoaw1.a;
       uoaw1 = uoaw1.c;
       vo1 ovo1 = EsAddToQueueRequest$AddToQueueRequest.i();
       if (a.c()) {
          Object obj = a.b();
          co5.l(obj, "command.options\(\).get\(\)");
          ovo1.d(b17.g(obj));
       }
       co5.l(uoaw1, "command.loggingParams\(\)");
       rt ort = g.b.b(uoaw1);
       co5.l(ort, "loggingParamsFactory.dec…(command.loggingParams\(\)\)");
       ovo1.c(eo5.w(ort));
       ovo1.e(co5.t(our));
       c uoc = ovo1.build();
       co5.l(uoc, "requestBuilder.build\(\)");
       ls1 a1 = g.a;
       a1.getClass();
       Single single = a1.callSingle("spotify.player.esperanto.proto.ContextPlayer", "AddToQueue", uoc);
       single = single.map(new a05(8));
       co5.l(single, "callSingle\(\"spotify.play…     }\n                }\)");
       single = single.map(js1.a);
       co5.l(single, "playerClient.AddToQueue\(…::commandResultFromProto\)");
       Completable uCompletable = single.map(new rv0(n, 1)).ignoreElement();
       co5.l(uCompletable, "override fun queueSong\(u…   .ignoreElement\(\)\n    }");
       return Completable.u(new fw0(oow0, 1).a(oow0.D.c(uCompletable)));
    }
    public final Completable l(){
       r44 or44;
       PlaybackStateCompat playbackStat = ((or44 = this.d()) == null)? null: or44.c();
       if (!do5.I(playbackStat, 4)) {
          return tk0.a;
       }else {
          ow0 oow0 = this;
          ow0 n = oow0.n;
          n.getClass();
          Completable uCompletable = n.d.a(new tf5()).map(new rv0(n, 2)).ignoreElement();
          co5.l(uCompletable, "override fun resume\(feat…   .ignoreElement\(\)\n    }");
          return Completable.u(new fw0(oow0, 4).a(oow0.D.c(uCompletable)));
       }
    }
    public final Completable m(int p0){
       ow0 oow0 = this;
       ow0 n = oow0.n;
       n.getClass();
       Completable uCompletable = n.d.a(new uf5((long)p0)).map(new rv0(n, 3)).ignoreElement();
       co5.l(uCompletable, "override fun seek\(positi…   .ignoreElement\(\)\n    }");
       return Completable.u(new fw0(oow0, 5).a(uCompletable));
    }
    public final Completable n(boolean p0){
       r44 or44 = this.d();
       aq6 uoaq6 = null;
       MediaMetadataCompat mediaMetadat = (or44 == null)? uoaq6: or44.b();
       if (mediaMetadat != null) {
          uoaq6 = td7.d(mediaMetadat.b().a);
       }
       if (uoaq6 == null) {
          return Completable.h(new IllegalStateException("No currently playing track."));
       }else {
          p54 tb = this.b;
          tb.o(ox7.J(tb.b.b(), p0));
          return this.d.c(uoaq6, p0);
       }
    }
    public final Completable o(){
       ow0 oow0 = this;
       ow0 n = oow0.n;
       Completable uCompletable = n.d.a(new vf5()).map(new rv0(n, 7)).ignoreElement();
       co5.l(uCompletable, "override fun skipToNext\(…   .ignoreElement\(\)\n    }");
       return Completable.u(new fw0(oow0, 7).a(oow0.D.c(uCompletable)));
    }
    public final Completable p(){
       pr e;
       ow0 oow0 = this;
       ow0 n = oow0.n;
       n.getClass();
       aw1 uoaw1 = new aw1(12);
       si4 osi4 = new si4(12);
       if ((e = pr.e) == null) {
          throw new NullPointerException("Null commandOptions");
       }
       osi4.b = e;
       Boolean tRUE = Boolean.TRUE;
       tRUE.getClass();
       osi4.a = new jj5(tRUE);
       jj5 osi41 = new jj5(osi4.b());
       uoaw1.b = osi41;
       Completable uCompletable = n.d.a(new wf5(new nv(uoaw1.a, osi41, uoaw1.c))).map(new rv0(n, 8)).ignoreElement();
       co5.l(uCompletable, "override fun skipToPrevi…   .ignoreElement\(\)\n    }");
       return Completable.u(new fw0(oow0, 6).a(oow0.D.c(uCompletable)));
    }
    public final Completable q(){
       ow0 oow0 = this;
       ow0 n = oow0.n;
       Completable uCompletable = n.d.a(new xf5()).map(new rv0(n, 9)).ignoreElement();
       co5.l(uCompletable, "override fun stop\(\): Com…   .ignoreElement\(\)\n    }");
       ow0 m = oow0.m;
       Objects.requireNonNull(m);
       return Completable.u(new fw0(oow0, 0).a(uCompletable.c(Completable.i(new ha5(17, m)))));
    }
    public abstract Observable r(Observable p0);
}
