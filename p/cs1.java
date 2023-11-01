package p.cs1;
import p.ht0;
import p.qs3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ou;
import io.reactivex.rxjava3.core.Single;
import p.rq1;
import com.spotify.player.esperanto.proto.EsPlay$PlayRequest;
import p.yq1;
import com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest;
import p.xo1;
import com.spotify.player.esperanto.proto.EsContext$Context;
import p.rr;
import p.r45;
import java.lang.Iterable;
import java.util.ArrayList;
import p.aj0;
import java.util.Iterator;
import p.gt0;
import p.zo1;
import com.spotify.player.esperanto.proto.EsContextPage$ContextPage;
import p.tr;
import p.nt0;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import p.m73;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.qx5;
import p.hr1;
import com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import p.dv;
import com.google.common.collect.d;
import p.tq1;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import p.qu;
import p.hj5;
import p.ar1;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import p.av;
import p.h80;
import p.b17;
import java.lang.Boolean;
import p.rl6;
import p.rr1;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import p.qv;
import p.oq1;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import java.lang.Number;
import p.yf5;
import p.dp1;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import p.tu;
import p.nq1;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import p.vw6;
import p.uv;
import p.ni5;
import p.ij5;
import java.lang.Enum;
import p.cr1;
import p.cd2;
import p.to;
import p.zq1;
import p.rt;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import p.eo5;
import java.lang.Class;
import p.s74;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.a05;
import p.yf2;
import p.fv1;
import p.tp2;

public final class cs1	// class@001268 from classes.dex
{
    public final ht0 a;
    public final qs3 b;

    public void cs1(ht0 p0,qs3 p1){
       co5.o(p0, "playerClient");
       co5.o(p1, "loggingParamsFactory");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Single a(ou p0){
       boolean b;
       c obj2;
       qv obj4;
       oq1 obj5;
       c obj6;
       tu obj7;
       nq1 onq1;
       nq1 obj8;
       cr1 c2;
       zq1 c3;
       int i1;
       rq1 orq1 = EsPlay$PlayRequest.h();
       yq1 oyq1 = EsPreparePlay$PreparePlayRequest.i();
       ou a = p0.a;
       co5.l(a, "command.context\(\)");
       rr orr = EsContext$Context.l();
       rr d = a.d;
       if (d.c()) {
          Iterator obj = d.b();
          co5.l(obj, "context.pages\(\).get\(\)");
          ArrayList uArrayList = new ArrayList(aj0.b0(obj));
          obj = obj.iterator();
          while (true) {
             b = false;
             if (obj.hasNext()) {
                gt0 ogt0 = obj.next();
                co5.o(ogt0, "page");
                tr otr = EsContextPage$ContextPage.k();
                tr c = ogt0.c;
                if (c.c()) {
                   Iterator obj1 = c.b();
                   co5.l(obj1, "page.tracks\(\).get\(\)");
                   ArrayList uArrayList1 = new ArrayList(aj0.b0(obj1));
                   obj1 = obj1.iterator();
                   while (obj1.hasNext()) {
                      uArrayList1.add(co5.t(obj1.next()));
                   }
                   otr.c(uArrayList1);
                   otr.e(b);
                }else {
                   otr.e(true);
                }
                otr.d(ogt0.d);
                otr.g(ogt0.a);
                otr.f(ogt0.b);
                c uoc = otr.build();
                co5.l(uoc, "newBuilder\(\).apply {\n   …xtPageUrl\(\)\n    }.build\(\)");
                uArrayList.add(uoc);
             }else {
                break ;
             }
          }
          orr.c(uArrayList);
          orr.e(b);
       }else {
          orr.e(true);
       }
       orr.d(a.c);
       orr.g(a.a);
       orr.h(a.b);
       rr e = a.e;
       if (e.c()) {
          obj2 = e.b();
          co5.l(obj2, "context.restrictions\(\).get\(\)");
          dv uodv = EsRestrictions$Restrictions.Y();
          uodv.g(obj2.b);
          uodv.o(obj2.c);
          uodv.p(obj2.d);
          uodv.i(obj2.e);
          uodv.h(obj2.f);
          uodv.s(obj2.g);
          uodv.r(obj2.h);
          uodv.t(obj2.i);
          uodv.u(obj2.j);
          uodv.v(obj2.k);
          uodv.q(obj2.l);
          uodv.c(obj2.m);
          uodv.f(obj2.n);
          uodv.w(obj2.o);
          uodv.j(obj2.p);
          uodv.e(obj2.q);
          uodv.d(obj2.r);
          uodv.n(obj2.s);
          uodv.m(obj2.t);
          uodv.l(obj2.u);
          uodv.k(obj2.v);
          uodv.z(obj2.w);
          obj2 = uodv.build();
          co5.l(obj2, "newBuilder\(\).apply {\n   …tReasons\(\)\)\n    }.build\(\)");
          orr.f(obj2);
       }
       obj2 = orr.build();
       String str = "newBuilder\(\).apply {\n   …)\n        }\n    }.build\(\)";
       co5.l(obj2, str);
       oyq1.c(obj2);
       ou b1 = p0.b;
       co5.l(b1, "command.playOrigin\(\)");
       qu oqu = EsPlayOrigin$PlayOrigin.w();
       oqu.f(b1.a);
       oqu.g(b1.b);
       oqu.j(b1.c);
       oqu.e(b1.d);
       oqu.h(b1.e);
       oqu.d(b1.f);
       oqu.i(b1.h);
       oqu.c(b1.g);
       obj2 = oqu.build();
       co5.l(obj2, "newBuilder\(\).apply {\n   …eClasses\(\)\)\n    }.build\(\)");
       oyq1.e(obj2);
       a = p0.c;
       if (a.c()) {
          Object obj3 = a.b();
          co5.l(obj3, "command.options\(\).get\(\)");
          av uoav = EsPreparePlayOptions$PreparePlayOptions.s();
          av b2 = obj3.b;
          if (b2.c()) {
             obj4 = b2.b();
             co5.l(obj4, "preparePlayOptions.playbackId\(\).get\(\)");
             uoav.i(b17.u(obj4));
          }
          b2 = obj3.c;
          if (b2.c()) {
             obj4 = b2.b();
             co5.l(obj4, "preparePlayOptions.alwaysPlaySomething\(\).get\(\)");
             uoav.e(obj4.booleanValue());
          }
          b2 = obj3.d;
          if (b2.c()) {
             obj4 = b2.b();
             co5.l(obj4, "preparePlayOptions.skipTo\(\).get\(\)");
             qv oqv = EsSkipToTrack$SkipToTrack.k();
             String str1 = "";
             oqv.d(obj4.b.e(str1));
             qv c1 = obj4.c;
             if (c1.c()) {
                oq1 ooq1 = EsOptional$OptionalInt64.i();
                obj5 = c1.b();
                co5.l(obj5, "skipToTrack.pageIndex\(\).get\(\)");
                ooq1.c(obj5.longValue());
                oqv.c(ooq1.build());
             }
             oqv.f(obj4.d.e(str1));
             oqv.g(obj4.e.e(str1));
             obj4 = obj4.f;
             if (obj4.c()) {
                obj5 = EsOptional$OptionalInt64.i();
                obj6 = obj4.b();
                co5.l(obj6, "skipToTrack.trackIndex\(\).get\(\)");
                obj5.c(obj6.longValue());
                oqv.e(obj5.build());
             }
             obj6 = oqv.build();
             co5.l(obj6, str);
             uoav.n(obj6);
          }
          b2 = obj3.e;
          if (b2.c()) {
             oq1 ooq11 = EsOptional$OptionalInt64.i();
             obj7 = b2.b();
             co5.l(obj7, "preparePlayOptions.seekTo\(\).get\(\)");
             ooq11.c(obj7.longValue());
             uoav.l(ooq11.build());
          }
          b2 = obj3.f;
          if (b2.c()) {
             obj7 = b2.b();
             co5.l(obj7, "preparePlayOptions.initiallyPaused\(\).get\(\)");
             uoav.g(obj7.booleanValue());
          }
          b2 = obj3.g;
          if (b2.c()) {
             obj7 = b2.b();
             co5.l(obj7, "preparePlayOptions.systemInitiated\(\).get\(\)");
             uoav.o(obj7.booleanValue());
          }
          b2 = obj3.h;
          if (b2.c()) {
             obj7 = b2.b();
             co5.l(obj7, "preparePlayOptions.playerOptionsOverride\(\).get\(\)");
             tu otu = EsContextPlayerOptions$ContextPlayerOptionOverrides.i();
             tu b3 = obj7.b;
             if (b3.c()) {
                onq1 = EsOptional$OptionalBoolean.g();
                obj8 = b3.b();
                co5.l(obj8, "overrides.shufflingContext\(\).get\(\)");
                onq1.c(obj8.booleanValue());
                otu.e(onq1.build());
             }
             b3 = obj7.c;
             if (b3.c()) {
                onq1 = EsOptional$OptionalBoolean.g();
                obj8 = b3.b();
                co5.l(obj8, "overrides.repeatingContext\(\).get\(\)");
                onq1.c(obj8.booleanValue());
                otu.c(onq1.build());
             }
             obj7 = obj7.d;
             if (obj7.c()) {
                obj8 = EsOptional$OptionalBoolean.g();
                Object obj9 = obj7.b();
                co5.l(obj9, "overrides.repeatingTrack\(\).get\(\)");
                obj8.c(obj9.booleanValue());
                otu.d(obj8.build());
             }
             obj6 = otu.build();
             co5.l(obj6, str);
             uoav.j(obj6);
          }
          av i = obj3.i;
          if (i.c()) {
             uoav.c(i.b().b);
          }
          i = obj3.j;
          if (i.c()) {
             ni5 oni5 = ((oni5 = i.b()) == null)? -1: ij5.a[oni5.ordinal()];
             if (oni5 != -1 && oni5 != 1) {
                if (oni5 == 2) {
                   c2 = cr1.c;
                }else {
                   throw new cd2(10);
                }
             }else {
                c2 = cr1.b;
             }
             uoav.k(c2);
          }
          i = obj3.k;
          if (i.c()) {
             to oto = ((oto = i.b()) == null)? -1: ij5.b[oto.ordinal()];
             if (oto != -1 && oto != 1) {
                if (oto == 2) {
                   c3 = zq1.c;
                }else {
                   throw new cd2(10);
                }
             }else {
                c3 = zq1.b;
             }
             uoav.f(c3);
          }
          i = obj3.l;
          if (i.c()) {
             uoav.m(i.b());
          }
          i = obj3.m;
          if (i.c()) {
             uoav.h(i.b());
          }
          uoav.d(obj3.n);
          obj2 = uoav.build();
          co5.l(obj2, "newBuilder\(\).apply {\n   …Override\(\)\)\n    }.build\(\)");
          oyq1.d(obj2);
       }
       orq1.d(oyq1.build());
       ou d1 = p0.d;
       if (!d1.c()) {
          p0 = p0.e;
          co5.l(p0, "command.loggingParams\(\)");
          rt ort = this.b.b(p0);
          co5.l(ort, "loggingParamsFactory.dec…(command.loggingParams\(\)\)");
          orq1.c(eo5.w(ort));
          c uoc1 = orq1.build();
          co5.l(uoc1, "newBuilder\(\).apply {\n   …ams\(\)\)\)\n        }.build\(\)");
          cs1 ta = this.a;
          ta.getClass();
          Single single = ta.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Play", uoc1);
          single = single.map(new a05(15));
          co5.l(single, "callSingle\(\"spotify.play…     }\n                }\)");
          single = single.map(fv1.x);
          co5.l(single, "playerClient.Play\(playCo…::commandResultFromProto\)");
          return single;
       }else {
          p0 = d1.b();
          co5.l(p0, "command.playOptions\(\).get\(\)");
          tp2.t(p0);
          throw null;
       }
    }
}
