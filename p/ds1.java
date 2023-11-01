package p.ds1;
import p.qg2;
import p.es1;
import java.lang.Object;
import p.tp2;
import java.lang.String;
import p.co5;
import p.aw1;
import p.nv;
import p.r45;
import io.reactivex.rxjava3.core.Single;
import p.vf5;
import p.or7;
import java.lang.Class;
import p.pr1;
import com.spotify.player.esperanto.proto.EsSkipNext$SkipNextRequest;
import p.pr;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import p.b17;
import p.rt;
import p.qs3;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import p.eo5;
import p.nt0;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.s74;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.a05;
import p.yf2;
import p.j70;
import p.sf5;
import p.oy6;
import java.lang.Boolean;
import p.jj5;
import p.iu;
import p.pq1;
import com.spotify.player.esperanto.proto.EsPause$PauseRequest;
import p.qq1;
import com.spotify.player.esperanto.proto.EsPauseresumeOrigin$PauseResumeOrigin;
import p.az5;
import p.tf5;
import p.ko1;
import p.ir1;
import com.spotify.player.esperanto.proto.EsResume$ResumeRequest;
import p.i70;
import p.xf5;
import p.g54;
import p.sr1;
import com.spotify.player.esperanto.proto.EsStop$StopRequest;
import p.h70;
import p.uf5;
import p.lq5;
import java.lang.Long;
import p.jr1;
import com.spotify.player.esperanto.proto.EsSeekTo$SeekToRequest;
import p.t96;
import java.lang.Enum;
import p.kr1;
import p.cd2;
import p.gg1;
import java.lang.IllegalStateException;
import p.wf5;

public final class ds1 implements qg2	// class@0013a6 from classes.dex
{
    public final int a;
    public final es1 b;

    public void ds1(es1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       rt obj2;
       int i3;
       c uoc;
       es1 a;
       Single single;
       rt ort;
       rt obj6;
       c obj7;
       aw1 obj10;
       ds1 uods1 = this;
       String str = "newBuilder\(\).apply {\n   …dentifier\(\)\n    }.build\(\)";
       int i = 2;
       int i1 = 12;
       int iu i2 = 13;
       String oy6 str1 = "command.options\(\).get\(\)";
       ds1 b = uods1.b;
       String str2 = "it";
       jr1 obj = null;
       switch (uods1.a){
           case 0:
             Long obj1 = p0;
             co5.o(obj1, str2);
             b.getClass();
             lq5 olq5 = new lq5(i1);
             obj1 = Long.valueOf(obj1.D);
             olq5.b = obj1;
             str = (obj1 == null)? " value": "";
             if (str.isEmpty()) {
                long l = olq5.b.longValue();
                lq5 c = olq5.c;
                lq5 t = olq5.t;
                olq5 = olq5.v;
                obj = EsSeekTo$SeekToRequest.j();
                if (t.c()) {
                   obj2 = t.b();
                   co5.l(obj2, str1);
                   obj.d(b17.g(obj2));
                }
                co5.l(olq5, "command.loggingParams\(\)");
                obj2 = b.b.b(olq5);
                co5.l(obj2, "loggingParamsFactory.dec…(command.loggingParams\(\)\)");
                obj.c(eo5.w(obj2));
                obj.e(l);
                if (c.c()) {
                   kr1 obj3 = c.b();
                   co5.l(obj3, "command.relative\(\).get\(\)");
                   if (i3 = obj3.ordinal()) {
                      if (i3 != 1) {
                         if (i3 == i) {
                            obj3 = kr1.t;
                         }else {
                            throw new cd2(10);
                         }
                      }else {
                         obj3 = kr1.c;
                      }
                   }else {
                      obj3 = kr1.b;
                   }
                   obj.f(obj3);
                }
                uoc = obj.build();
                co5.l(uoc, "requestBuilder.build\(\)");
                a = b.a;
                a.getClass();
                single = a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "SeekTo", uoc);
                single = single.map(new a05(4));
                co5.l(single, "callSingle\(\"spotify.play…     }\n                }\)");
                single = single.map(gg1.v);
                co5.l(single, "playerClient.SeekTo\(requ…::commandResultFromProto\)");
                return single;
             }else {
                throw new IllegalStateException("Missing required properties:".concat(str));
             }
             break;
           case 1:
             tp2.v(p0);
             co5.o(obj, str2);
             throw obj;
           case 2:
             tp2.v(p0);
             co5.o(obj, str2);
             throw obj;
           case 3:
             co5.o(p0, str2);
             g54 a1 = new g54(27).a;
             b.getClass();
             sr1 osr1 = EsStop$StopRequest.g();
             co5.l(a1, "command.loggingParams\(\)");
             ort = b.b.b(a1);
             co5.l(ort, "loggingParamsFactory.dec…(command.loggingParams\(\)\)");
             osr1.c(eo5.w(ort));
             uoc = osr1.build();
             co5.l(uoc, "requestBuilder.build\(\)");
             es1 a2 = b.a;
             a2.getClass();
             single = a2.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Stop", uoc);
             single = single.map(new a05(i));
             co5.l(single, "callSingle\(\"spotify.play…     }\n                }\)");
             single = single.map(h70.c);
             co5.l(single, "playerClient.Stop\(reques…::commandResultFromProto\)");
             return single;
           case 4:
             iu obj4 = p0;
             co5.o(obj4, str2);
             tf5 d = obj4.D;
             co5.l(d, "it.featureIdentifier\(\)");
             b.getClass();
             ko1 obj5 = new ko1(i2);
             oy6 ooy6 = new oy6(i2);
             ooy6.t = r45.d(Boolean.valueOf(obj4.E));
             obj5.b = new jj5(ooy6.h());
             obj4 = new iu(d);
             jj5 ojj5 = new jj5(obj4);
             obj5.t = ojj5;
             ko1 b1 = obj5.b;
             ko1 c1 = obj5.c;
             ir1 oir1 = EsResume$ResumeRequest.i();
             if (b1.c()) {
                obj6 = b1.b();
                co5.l(obj6, str1);
                oir1.d(b17.g(obj6));
             }
             co5.l(c1, "command.loggingParams\(\)");
             obj6 = b.b.b(c1);
             co5.l(obj6, "loggingParamsFactory.dec…(command.loggingParams\(\)\)");
             oir1.c(eo5.w(obj6));
             obj7 = ojj5.b();
             co5.l(obj7, "command.resumeOrigin\(\).get\(\)");
             qq1 oqq1 = EsPauseresumeOrigin$PauseResumeOrigin.g();
             oqq1.c(obj7.a);
             obj7 = oqq1.build();
             co5.l(obj7, str);
             oir1.e(obj7);
             uoc = oir1.build();
             co5.l(uoc, "requestBuilder.build\(\)");
             a = b.a;
             a.getClass();
             single = a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Resume", uoc);
             single = single.map(new a05(6));
             co5.l(single, "callSingle\(\"spotify.play…     }\n                }\)");
             single = single.map(i70.y);
             co5.l(single, "playerClient.Resume\(requ…::commandResultFromProto\)");
             return single;
             break;
           case 5:
             tp2.v(p0);
             co5.o(obj, str2);
             throw obj;
           case 6:
             qq1 obj8 = p0;
             co5.o(obj8, str2);
             sf5 d1 = obj8.D;
             co5.l(d1, "it.featureIdentifier\(\)");
             b.getClass();
             str1 = new oy6(i2);
             str1.t = r45.d(Boolean.valueOf(obj8.E));
             i2 = new iu(d1);
             pq1 opq1 = EsPause$PauseRequest.i();
             opq1.d(b17.g(str1.h()));
             a = b.b;
             a.getClass();
             rt e = rt.e;
             co5.l(e, "EMPTY");
             opq1.c(eo5.w(a.a(e)));
             obj8 = EsPauseresumeOrigin$PauseResumeOrigin.g();
             obj8.c(i2.a);
             obj7 = obj8.build();
             co5.l(obj7, str);
             opq1.e(obj7);
             uoc = opq1.build();
             co5.l(uoc, "requestBuilder.build\(\)");
             a = b.a;
             a.getClass();
             single = a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Pause", uoc);
             single = single.map(new a05(11));
             co5.l(single, "callSingle\(\"spotify.play…     }\n                }\)");
             single = single.map(az5.w);
             co5.l(single, "playerClient.Pause\(reque…::commandResultFromProto\)");
             return single;
           case 7:
             tp2.v(p0);
             co5.o(obj, str2);
             throw obj;
           case 8:
             tp2.v(p0);
             co5.o(obj, str2);
             throw obj;
           case 9:
             co5.o(p0, str2);
             or7 str3 = new or7(14);
             or7 a3 = str3.a;
             or7 b2 = str3.b;
             str3 = str3.c;
             b.getClass();
             pr1 opr1 = EsSkipNext$SkipNextRequest.i();
             if (b2.c()) {
                Object obj9 = b2.b();
                co5.l(obj9, str1);
                opr1.d(b17.g(obj9));
             }
             co5.l(str3, "command.loggingParams\(\)");
             ort = b.b.b(str3);
             co5.l(ort, "loggingParamsFactory.dec…(command.loggingParams\(\)\)");
             opr1.c(eo5.w(ort));
             if (a3.c()) {
                obj10 = a3.b();
                co5.l(obj10, "command.track\(\).get\(\)");
                opr1.e(co5.t(obj10));
             }
             uoc = opr1.build();
             co5.l(uoc, "requestBuilder.build\(\)");
             a = b.a;
             a.getClass();
             single = a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "SkipNext", uoc);
             single = single.map(new a05(7));
             co5.l(single, "callSingle\(\"spotify.play…     }\n                }\)");
             single = single.map(j70.b);
             co5.l(single, "playerClient.SkipNext\(re…::commandResultFromProto\)");
             return single;
             break;
           case 10:
             tp2.v(p0);
             co5.o(obj, str2);
             throw obj;
           case 11:
             tp2.v(p0);
             co5.o(obj, str2);
             obj10 = new aw1(i1);
             return b.b(new nv(obj10.a, obj10.b, obj10.c));
           default:
             wf5 obj11 = p0;
             co5.o(obj11, str2);
             obj11 = obj11.D;
             co5.l(obj11, "it.command\(\)");
             return b.b(obj11);
       }
    }
}
