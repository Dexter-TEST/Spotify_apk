package p.fl4;
import p.yf2;
import p.jl4;
import java.lang.Object;
import p.yl4;
import java.lang.Class;
import p.p54;
import io.reactivex.rxjava3.core.Completable;
import p.jk0;
import p.dm4;
import p.r44;
import android.support.v4.media.session.PlaybackStateCompat;
import p.do5;
import p.ow0;
import p.tv0;
import p.ce7;
import java.lang.Boolean;
import java.lang.String;
import p.r45;
import p.nr1;
import com.spotify.player.esperanto.proto.EsSetShufflingContext$SetShufflingContextRequest;
import p.co5;
import p.pr;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import p.b17;
import p.is1;
import p.rt;
import p.qs3;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import p.eo5;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.s74;
import io.reactivex.rxjava3.core.Single;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.a05;
import p.hs1;
import p.rv0;
import p.fw0;
import io.reactivex.rxjava3.core.CompletableSource;
import java.lang.IllegalStateException;
import p.tk0;
import p.wl4;
import p.zl4;
import p.em4;
import p.vl4;
import p.ol4;
import p.hb4;
import p.zv6;
import java.util.Objects;
import p.up0;
import io.reactivex.rxjava3.core.Maybe;
import p.k34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.km4;
import android.graphics.Bitmap;
import p.a44;
import p.fm4;
import p.nl4;
import p.xl4;
import java.lang.IllegalArgumentException;
import java.lang.Exception;
import p.ok0;
import java.lang.UnsupportedOperationException;
import p.t63;
import p.lr1;
import com.spotify.player.esperanto.proto.EsSetRepeatingContext$SetRepeatingContextRequest;
import p.fs1;
import p.nq5;
import p.mr1;
import com.spotify.player.esperanto.proto.EsSetRepeatingTrack$SetRepeatingTrackRequest;
import p.gs1;

public final class fl4 implements yf2	// class@0015ed from classes.dex
{
    public final int a;
    public final jl4 b;

    public void fl4(jl4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       jl4 c;
       r44 or44;
       PlaybackStateCompat playbackStat;
       tk0 a;
       tv0 e;
       rt obj;
       r44 or441;
       ok0 ook0;
       is1 obj1;
       nq5 b3;
       fl4 uofl4 = this;
       String str = "command.options\(\).get\(\)";
       String str1 = "callSingle\(\"spotify.play…     }\n                }\)";
       String str2 = "spotify.player.esperanto.proto.ContextPlayer";
       String str3 = "requestBuilder.build\(\)";
       String str4 = "Missing required properties:";
       String str5 = " value";
       String str6 = "";
       int i = 1;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       boolean b = false;
       fl4 b1 = uofl4.b;
       switch (uofl4.a){
           case 0:
             b1.getClass();
             return b1.a.k(p0.P);
           case 1:
             return b1.a.p().m();
           case 2:
             ol4 ool4 = p0;
             b1.getClass();
             b1.b.getClass();
             c = b1.c;
             Objects.requireNonNull(c);
             Maybe maybe = Single.defer(new hb4(i3, ool4.P)).flatMapMaybe(new up0(i2, c));
             maybe.getClass();
             k34 ok34 = new k34(maybe, new up0(i1, ool4), i);
             ool4 = ool4.P;
             return new a44(ok34, i, new km4(ool4)).onErrorReturnItem(new km4(ool4));
           case 3:
             return b1.a.i().m();
           case 4:
             return b1.a.o().m();
           case 5:
             b1.getClass();
             return b1.a.n(p0.P).m();
           case 6:
             return b1.a.l().m();
           case 7:
             b1.getClass();
             dm4 p = p0.P;
             c = b1.a;
             playbackStat = ((or44 = c.d()) == null)? null: or44.c();
             if (do5.I(playbackStat, 0x200000)) {
                if ((or44 = c.d()) == null || !or44.e()) {
                   i = 0;
                }
                if (i != p) {
                   ow0 n = c.n;
                   e = n.e;
                   e.getClass();
                   ce7 uoce7 = new ce7();
                   Boolean uBoolean = Boolean.valueOf(p);
                   uoce7.a = uBoolean;
                   if (uBoolean != null) {
                      str5 = str6;
                   }
                   if (str5.isEmpty()) {
                      ce7 b2 = uoce7.b;
                      ce7 c1 = uoce7.c;
                      nr1 onr1 = EsSetShufflingContext$SetShufflingContextRequest.i();
                      onr1.e(uoce7.a.booleanValue());
                      if (b2.c()) {
                         obj = b2.b();
                         co5.l(obj, str);
                         onr1.d(b17.g(obj));
                      }
                      co5.l(c1, "command.loggingParams\(\)");
                      obj = e.b.b(c1);
                      co5.l(obj, "loggingParamsFactory.dec…(command.loggingParams\(\)\)");
                      onr1.c(eo5.w(obj));
                      c uoc = onr1.build();
                      co5.l(uoc, str3);
                      is1 a1 = e.a;
                      a1.getClass();
                      Single single = a1.callSingle(str2, "SetShufflingContext", uoc);
                      single = single.map(new a05(16));
                      co5.l(single, str1);
                      single = single.map(hs1.a);
                      co5.l(single, "playerClient.SetShufflin…::commandResultFromProto\)");
                      Completable uCompletable = single.map(new rv0(n, 6)).ignoreElement();
                      co5.l(uCompletable, "override fun setShuffle\(…   .ignoreElement\(\)\n    }");
                      a = Completable.u(new fw0(c, 10).a(uCompletable));
                   label_012a :
                      return a.m();
                   }else {
                      throw new IllegalStateException(str4.concat(str5));
                   }
                }
             }
             a = tk0.a;
             goto label_012a ;
             break;
           case 8:
             b1.getClass();
             return b1.a.m(p0.P).m();
           default:
             b1.getClass();
             xl4 p1 = p0.P;
             c = b1.a;
             playbackStat = ((or441 = c.d()) == null)? null: or441.c();
             if (do5.I(playbackStat, 0x40000)) {
                e = ((or44 = c.d()) == null)? -1: or44.d();
                if (e == p1) {
                label_03a2 :
                   a = tk0.a;
                }else if(p1 != null){
                   if (p1 != i) {
                      if (p1 != 2) {
                         if (p1 != 3) {
                            ook0 = Completable.h(new IllegalArgumentException(String.valueOf(p1)));
                         }else {
                            ook0 = Completable.h(new UnsupportedOperationException());
                         }
                      }
                   }else {
                   label_0241 :
                      ow0 n1 = c.n;
                      n1.getClass();
                      t63 ot63 = new t63(13);
                      Boolean uBoolean1 = Boolean.valueOf(b);
                      ot63.b = uBoolean1;
                      String str7 = (uBoolean1 == null)? str5: str6;
                      if (str7.isEmpty()) {
                         t63 c2 = ot63.c;
                         ot63 = ot63.t;
                         tv0 e1 = n1.e;
                         e1.getClass();
                         String str8 = str5;
                         lr1 olr1 = EsSetRepeatingContext$SetRepeatingContextRequest.i();
                         olr1.e(ot63.b.booleanValue());
                         if (c2.c()) {
                            obj1 = c2.b();
                            co5.l(obj1, str);
                            olr1.d(b17.g(obj1));
                         }
                         co5.l(ot63, "command.loggingParams\(\)");
                         obj1 = e1.b;
                         rt ort = obj1.b(ot63);
                         co5.l(ort, "loggingParamsFactory.dec…(command.loggingParams\(\)\)");
                         olr1.c(eo5.w(ort));
                         c uoc1 = olr1.build();
                         co5.l(uoc1, str3);
                         is1 a2 = e1.a;
                         a2.getClass();
                         Single single1 = a2.callSingle(str2, "SetRepeatingContext", uoc1).map(new a05(13));
                         co5.l(single1, str1);
                         single1 = single1.map(fs1.a);
                         co5.l(single1, "playerClient.SetRepeatin…::commandResultFromProto\)");
                         String str9 = str6;
                         Completable uCompletable1 = single1.map(new rv0(n1, 4)).ignoreElement();
                         co5.l(uCompletable1, "override fun setRepeatCo…   .ignoreElement\(\)\n    }");
                         nq5 onq5 = new nq5(13);
                         Boolean uBoolean2 = Boolean.valueOf(i);
                         onq5.a = uBoolean2;
                         String str10 = (uBoolean2 == null)? str8: str9;
                         if (str10.isEmpty()) {
                            b3 = onq5.b;
                            onq5 = onq5.c;
                            mr1 omr1 = EsSetRepeatingTrack$SetRepeatingTrackRequest.i();
                            omr1.e(onq5.a.booleanValue());
                            if (b3.c()) {
                               Object obj2 = b3.b();
                               co5.l(obj2, str);
                               omr1.d(b17.g(obj2));
                            }
                            co5.l(onq5, "command.loggingParams\(\)");
                            rt ort1 = obj1.b(onq5);
                            co5.l(ort1, "loggingParamsFactory.dec…(command.loggingParams\(\)\)");
                            omr1.c(eo5.w(ort1));
                            c uoc2 = omr1.build();
                            co5.l(uoc2, str3);
                            Single single2 = a2.callSingle(str2, "SetRepeatingTrack", uoc2);
                            single2 = single2.map(new a05(14));
                            co5.l(single2, str1);
                            single2 = single2.map(gs1.a);
                            co5.l(single2, "playerClient.SetRepeatin…::commandResultFromProto\)");
                            Completable uCompletable2 = single2.map(new rv0(n1, 5)).ignoreElement();
                            co5.l(uCompletable2, "override fun setRepeatTr…   .ignoreElement\(\)\n    }");
                            ook0 = Completable.u(new fw0(c, 11).a(uCompletable1.c(uCompletable2)));
                         }else {
                            throw new IllegalStateException(str4.concat(str10));
                         }
                      }else {
                         throw new IllegalStateException(str4.concat(str7));
                      }
                   }
                }else {
                   b3 = 0;
                }
                b = i;
                i = false;
                goto label_0241 ;
             }else {
                goto label_03a2 ;
             }
             return a.m();
       }
    }
}
