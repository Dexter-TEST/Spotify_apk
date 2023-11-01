package p.ns1;
import p.yf2;
import java.lang.Object;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextPlayerState;
import java.lang.String;
import p.co5;
import p.qk4;
import p.wu;
import java.lang.Long;
import com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import p.dv;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import p.ej5;
import p.kf5;
import p.bc3;
import java.util.Collection;
import java.util.Set;
import p.dj0;
import com.google.common.collect.d;
import p.qu;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextIndex;
import p.sr;
import p.jj5;
import com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
import p.ur;
import p.i80;
import p.ay;
import java.util.Locale;
import com.spotify.player.esperanto.proto.EsContextPlayerState$PlaybackQuality;
import p.o11;
import p.ru;
import p.gp1;
import p.f20;
import p.ye7;
import p.hp1;
import java.lang.Enum;
import p.h20;
import p.cd2;
import java.lang.Boolean;
import p.ip1;
import p.xp2;
import com.spotify.player.esperanto.proto.EsOptional$OptionalDouble;
import java.lang.Double;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptions;
import p.zq7;
import p.uu;
import p.uv;
import p.vw6;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import com.google.common.collect.c;
import java.util.Map;
import p.m73;
import java.lang.NullPointerException;
import p.zq1;
import p.ag5;
import p.to;

public final class ns1 implements yf2	// class@00203a from classes.dex
{
    public static final ns1 a;

    static {
       ns1.a = new ns1();
    }
    public void ns1(){
       super();
    }
    public final Object apply(Object p0){
       String str;
       String str1;
       long l;
       EsProvidedTrack$ProvidedTrack providedTrac;
       int i;
       Long longx;
       ArrayList uArrayList;
       Iterator iterator;
       co5.o(p0, "p0");
       qk4 oqk4 = wu.a();
       oqk4.a = Long.valueOf(p0.I());
       if ((str = p0.i()) == null) {
          throw new NullPointerException("Null contextUri");
       }
       oqk4.b = str;
       if ((str = p0.j()) == null) {
          throw new NullPointerException("Null contextUrl");
       }
       oqk4.c = str;
       EsRestrictions$Restrictions restrictions = p0.h();
       co5.l(restrictions, "protoState.contextRestrictions");
       oqk4.d = co5.F(restrictions);
       EsPlayOrigin$PlayOrigin playOrigin = p0.u();
       co5.l(playOrigin, "protoState.playOrigin");
       ej5 uoej5 = kf5.a(playOrigin.r());
       uoej5.j(playOrigin.s());
       if ((str1 = playOrigin.v()) == null) {
          throw new NullPointerException("Null viewUri");
       }
       uoej5.c = str1;
       if ((str1 = playOrigin.p()) == null) {
          throw new NullPointerException("Null externalReferrer");
       }
       uoej5.d = str1;
       if ((str1 = playOrigin.t()) == null) {
          throw new NullPointerException("Null referrerIdentifier");
       }
       uoej5.e = str1;
       if ((str1 = playOrigin.u()) == null) {
          throw new NullPointerException("Null restrictionIdentifier");
       }
       uoej5.h = str1;
       if ((str1 = playOrigin.o()) == null) {
          throw new NullPointerException("Null deviceIdentifier");
       }
       uoej5.f = str1;
       bc3 uobc3 = playOrigin.q();
       co5.l(uobc3, "playOrigin.featureClassesList");
       uoej5.g = d.o(dj0.F0(uobc3));
       oqk4.e = uoej5.c();
       if (p0.L()) {
          EsContextPlayerState$ContextIndex uContextInde = p0.l();
          co5.l(uContextInde, "protoState.index");
          l = uContextInde.g();
          long l1 = uContextInde.h();
          sr osr = new sr(l, l1);
          oqk4.f = new jj5(osr);
       }
       if (p0.P()) {
          providedTrac = p0.J();
          co5.l(providedTrac, "protoState.track");
          oqk4.g = new jj5(co5.s(providedTrac));
       }
       l = 0;
       providedTrac = (!p0.v().size())? 1: 0;
       if (!providedTrac) {
          i80 oi80 = p0.v();
          co5.l(oi80, "protoState.playbackId");
          str = ay.e.c(oi80.p());
          co5.l(str, "base16\(\).encode\(id.toByteArray\(\)\)");
          str = str.toLowerCase(Locale.ROOT);
          co5.l(str, "this as java.lang.String\).toLowerCase\(Locale.ROOT\)");
          oqk4.h = new jj5(str);
       }
       if (p0.M()) {
          EsContextPlayerState$PlaybackQuality playbackQual = p0.w();
          co5.l(playbackQual, "protoState.playbackQuality");
          o11 oo11 = ru.a();
          oo11.b = ye7.f(playbackQual.f());
          h20 a = h20.a;
          switch (playbackQual.i().ordinal()){
              case 0:
              case 6:
             label_0146 :
                oo11.c = a;
                oo11.t = ye7.f(playbackQual.k());
                oo11.v = Boolean.valueOf(playbackQual.j());
                i = playbackQual.h().ordinal();
                xp2 a1 = xp2.a;
                if (i) {
                   if (i != 1) {
                      if (i != 2) {
                         if (i != 3) {
                            throw new cd2(10);
                         }
                      }else {
                         a1 = xp2.c;
                      }
                   }else {
                      a1 = xp2.b;
                   }
                }
                oo11.w = a1;
                oqk4.i = new jj5(oo11.k());
                break;
              case 1:
                a = h20.b;
                goto label_0146 ;
                break;
              case 2:
                a = h20.c;
                goto label_0146 ;
                break;
              case 3:
                a = h20.t;
                goto label_0146 ;
                break;
              case 4:
                a = h20.v;
                goto label_0146 ;
                break;
              case 5:
                a = h20.w;
                goto label_0146 ;
                break;
              default:
                throw new cd2(10);
          }
       }
       if (p0.N()) {
          Double uDouble = Double.valueOf(p0.x().g());
          uDouble.getClass();
          oqk4.j = new jj5(uDouble);
       }
       if (p0.O()) {
          longx = Long.valueOf(p0.y().h());
          longx.getClass();
          oqk4.k = new jj5(longx);
       }
       if (p0.K()) {
          longx = Long.valueOf(p0.k().h());
          longx.getClass();
          oqk4.l = new jj5(longx);
       }
       oqk4.m = Boolean.valueOf(p0.o());
       oqk4.n = Boolean.valueOf(p0.n());
       oqk4.o = Boolean.valueOf(p0.m());
       oqk4.p = Boolean.valueOf(p0.p());
       EsContextPlayerOptions$ContextPlayerOptions uContextPlay = p0.s();
       co5.l(uContextPlay, "protoState.options");
       zq7 oo111 = new zq7(12);
       Boolean fALSE = Boolean.FALSE;
       oo111.a = fALSE;
       oo111.b = fALSE;
       oo111.c = fALSE;
       oo111.a = Boolean.valueOf(uContextPlay.i());
       oo111.b = Boolean.valueOf(uContextPlay.g());
       oo111.c = Boolean.valueOf(uContextPlay.h());
       oqk4.q = oo111.h();
       restrictions = p0.C();
       co5.l(restrictions, "protoState.restrictions");
       oqk4.r = co5.F(restrictions);
       if (p0.G() > 0) {
          uobc3 = p0.H();
          co5.l(uobc3, "protoState.suppressionsList");
          oqk4.s = vw6.a(dj0.F0(uobc3));
       }
       if (p0.q() > 0) {
          uobc3 = p0.r();
          co5.l(uobc3, "protoState.nextTracksList");
          uArrayList = new ArrayList(aj0.b0(uobc3));
          iterator = uobc3.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(co5.s(iterator.next()));
          }
          oqk4.u = c.o(uArrayList);
       }
       if (p0.z() > 0) {
          uobc3 = p0.A();
          co5.l(uobc3, "protoState.prevTracksList");
          uArrayList = new ArrayList(aj0.b0(uobc3));
          iterator = uobc3.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(co5.s(iterator.next()));
          }
          oqk4.t = c.o(uArrayList);
       }
       oqk4.v = m73.b(p0.g());
       oqk4.w = m73.b(p0.t());
       str = p0.D();
       co5.l(str, "protoState.sessionId");
       if (str.length() > 0) {
          l = 1;
       }
       if (l) {
          if ((str = p0.D()) != null) {
             oqk4.x = str;
          }else {
             throw new NullPointerException("Null sessionId");
          }
       }
       if ((str = String.valueOf(p0.B())) != null) {
          oqk4.y = str;
          i = ag5.a[p0.f().ordinal()];
          to a2 = to.a;
          if (i != 1 && i == 2) {
             a2 = to.b;
          }
          oqk4.z = a2;
          if (p0.E() > 0) {
             oqk4.A = c.o(p0.F());
          }
          return oqk4.a();
       }else {
          throw new NullPointerException("Null queueRevision");
       }
    }
}
