package p.pp;
import p.yf2;
import p.bi5;
import p.x00;
import p.gr0;
import p.pg2;
import p.ci5;
import p.vc1;
import java.lang.Object;
import p.i85;
import com.spotify.signup.signup.view.PasswordView;
import p.ui1;
import com.spotify.signup.signup.view.EmailView;
import p.ti1;
import p.bf5;
import p.qn1;
import java.lang.Throwable;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import p.df5;
import p.j85;
import p.ut;
import p.dt1;
import java.util.Map;
import p.bt1;
import com.spotify.webapi.service.models.Playlist;
import p.nt1;
import p.sx6;
import p.vv;
import p.rx6;
import p.tx6;
import p.r45;
import p.ks0;
import p.rr;
import com.google.common.collect.c;
import p.e73;
import p.d1;
import p.gt0;
import p.tr;
import java.util.AbstractCollection;
import java.util.Set;
import p.ux6;
import p.sv;
import p.r05;
import java.lang.Enum;
import java.lang.Boolean;
import p.hv;
import p.dm3;
import p.em3;
import io.reactivex.rxjava3.core.Single;
import p.hw;
import com.spotify.limited_offlining_esperanto.proto.SetOfflineResponse;
import java.util.Base64$Encoder;
import p.p3;
import java.lang.RuntimeException;
import p.tp2;
import p.cg5;
import android.support.v4.media.MediaMetadataCompat;
import p.ox7;
import p.bg5;
import p.so3;
import com.spotify.connectivity.connectiontype.InternetState;
import p.e43;
import com.spotify.connectivity.connectiontype.ConnectionType;
import com.spotify.connectivity.sessionstate.SessionState;
import com.spotify.connectivity.platformconnectiontype.InternetConnectivityObservableImpl;
import com.spotify.connectivity.connectiontype.OfflineState;
import com.spotify.connectivity.connectiontype.OfflineState$State;
import com.spotify.connectivity.connectiontype.ConnectionState;
import com.spotify.connectivity.connectiontype.DeferUntilConnected;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.connect.esperanto.proto.ConnectMessages$PullResponse;
import p.ym7;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import p.rp;
import p.jg2;
import p.nh6;
import p.ws;
import p.mv;
import java.lang.Class;
import p.tr7;
import java.lang.NullPointerException;
import p.hu;
import p.t10;
import p.nd5;
import p.b;
import p.i;
import p.ad6;
import p.nu;
import p.e;
import p.aw;
import p.ju2;
import p.fu2;
import p.zv;
import p.zs;
import p.b43;
import p.s05;
import p.a43;
import java.util.List;
import java.lang.Iterable;
import p.ab2;
import p.z23;
import java.util.HashMap;
import java.util.Iterator;
import p.o05;
import p.tn1;
import p.vu2;
import p.u76;
import p.cv2;
import p.av2;
import p.d37;
import p.iu5;
import java.lang.Integer;
import com.google.common.collect.b;
import android.view.KeyEvent;
import p.us;
import p.ng1;
import p.b01;
import com.spotify.litenetwork.webapi.model.RecommendedGenres;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import p.av3;
import p.yu3;
import p.sn6;
import p.a25;
import p.lp3;

public final class pp implements yf2, bi5, x00, gr0, pg2, ci5, vc1	// class@0022ab from classes.dex
{
    public final int a;

    public void pp(int p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       switch (this.a){
           case 1:
             return;
           case 2:
             Object[] objArray = new Object[0];
             Logger.c(p0.a, "Error performing play action", objArray);
             return;
           case 13:
             return;
           case 14:
             return;
           case 15:
             return;
           default:
             return;
       }
    }
    public Object apply(Object p0){
       c uoc;
       c uoc1;
       boolean b = false;
       switch (this.a){
           case 0:
             return Boolean.valueOf(p0.c());
           case 1:
             return p0.g(new rp(1));
           case 2:
             return p0.g(new rp(2));
           case 3:
             p0 = (p0.booleanValue())? Observable.just(p0): Observable.just(p0).delay(200, TimeUnit.MILLISECONDS);
             return p0;
             break;
           case 4:
             try{
                return ConnectMessages$PullResponse.f(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connect.esperanto.proto.ConnectMessages.PullResponse: \'", p3.n(p3.o(), p0), v1), e0);
             }
             break;
           case 5:
             try{
                return ConnectMessages$StateResponse.k(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.connect.esperanto.proto.ConnectMessages.StateResponse: \'", p3.n(p3.o(), p0), v1), e0);
             }
             break;
           case 6:
             return DeferUntilConnected.c(p0);
           case 7:
             return Boolean.valueOf(p0.isOnline());
           case 8:
             return p0.offlineState();
           case 9:
             return InternetConnectivityObservableImpl.b(p0);
           case 10:
             return Boolean.valueOf(p0.connected());
           case 11:
             if (p0.connectionType().isOffline() && (p0.flightModeEnabled() && !p0.mobileDataDisabled())) {
                b = true;
             }
             return Boolean.valueOf(b);
             break;
           case 12:
             switch (p0.n.ordinal()){
                 case 8:
                 case 10:
                 case 11:
                 case 9:
                 default:
                   b = true;
             }
             return Boolean.valueOf(b);
             break;
           case 13:
             return new bf5(p0);
           case 14:
             return new bf5(p0);
           case 15:
             return p0;
           case 16:
             if (!p0.c()) {
                p0 = new cg5();
             }else {
                p0 = p0.b();
                String str = ox7.h(p0);
                p0 = ox7.o(p0, "spotify.media.metadata.TRACK_UID");
                p0 = (str != null && p0 != null)? new bg5(str, p0): new cg5();
             }
             return p0;
             break;
           case 17:
             try{
                return SetOfflineResponse.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.limited_offlining_esperanto.proto.SetOfflineResponse: \'", p3.n(p3.o(), p0), v1), e0);
             }
             break;
           case 18:
             return p0.b;
           case 19:
             return p0;
           case 20:
             return em3.a();
           case 21:
             switch (p0.n.ordinal()){
                 case 8:
                 case 10:
                 case 11:
                 case 9:
                 default:
                   b = true;
             }
             return Boolean.valueOf(b);
             break;
           case 22:
             return p0.c;
           case 23:
             if (p0.l != null) {
                if (p0.j == null && p0.k == null) {
                   p0 = new rx6();
                }else {
                   p0 = new tx6();
                }
             }else {
                vv e = p0.e;
                if (e.c()) {
                   if ((uoc = e.b().d.f()) != null) {
                      e73 uoe73 = uoc.q(b);
                      while (uoe73.hasNext()) {
                         if ((uoc1 = uoe73.next().c.f()) != null) {
                            b = b + uoc1.size();
                         }
                      }
                   }
                }else {
                   b = -1;
                }
                p0 = new ux6(b, p0.c.size(), p0.d.size());
             }
             return p0;
             break;
           case 24:
             return new sx6(p0);
           case 25:
             return new nt1(p0);
           case 26:
             return new dt1(p0);
           case 27:
             return new bt1(p0);
           case 28:
             return new dt1(p0);
           default:
             return p0.connectionType();
       }
    }
    public Object apply(Object p0,Object p1){
       tr7 otr7;
       switch (this.a){
           case 0:
             break;
           case 9:
             p0.getClass();
             otr7 = new tr7(p0);
             if (p1 == null) {
                throw new NullPointerException("Null birthday");
             }
             otr7.a = p1;
             return otr7.a();
             break;
           case 10:
             p0.getClass();
             otr7 = new tr7(p0);
             if (p1 == null) {
                throw new NullPointerException("Null password");
             }
             otr7.t = p1;
             return otr7.a();
             break;
           case 11:
             p0.getClass();
             otr7 = new tr7(p0);
             if (p1 == null) {
                throw new NullPointerException("Null email");
             }
             otr7.c = p1;
             return otr7.a();
             break;
           default:
             p0.getClass();
             otr7 = new tr7(p0);
             if (p1 == null) {
                throw new NullPointerException("Null gender");
             }
             otr7.b = p1;
             return otr7.a();
       }
       p0.getClass();
       ad6 uoad6 = new ad6(p0);
       if (p1 == null) {
          throw new NullPointerException("Null callingCodePhoneNumber");
       }
       uoad6.a = p1;
       return uoad6.a();
    }
    public boolean apply(Object p0){
       aw d;
       boolean b = true;
       switch (this.a){
           case 4:
             if (p0 == null || "lite:downloadToggle".equals(p0.q().c())) {
                b = false;
             }
             break;
           case 5:
             if (p0 == null || p0.a.startsWith("spotify:local:")) {
                b = false;
             }
             return b;
             break;
           default:
             if (p0 != null) {
                if ((d = p0.d) != null) {
                   p0 = d.f;
                }else if((p0 = p0.e) != null){
                   p0 = p0.i;
                }else {
                   p0 = 1;
                }
                if (p0 != null) {
                label_0047 :
                   return b;
                }
             }
             b = false;
             goto label_0047 ;
       }
       return b;
    }
    public Object c(Object p0,Object p1,Object p2){
       if (!p2.booleanValue()) {
          p0 = p0.a().e(ab2.b(p0.m()).a(new pp(4)).d()).g();
       }else {
          p2 = p1.n;
          HashMap hashMap = new HashMap(p2.size());
          Iterator iterator = p2.iterator();
          int i = 0;
          int i1 = 0;
          while (true) {
             o05 a = o05.a;
             if (iterator.hasNext()) {
                r05 or05 = iterator.next();
                or05 = or05.n;
                hashMap.put(or05.m, or05);
                if (or05 != a && or05 != o05.b) {
                   continue ;
                }else {
                   i1 = i1 + 1;
                }
             }else if(p2.isEmpty()){
                i = (i1 * 100) / p2.size();
             }
             if ((p2 = p1.m.n) != o05.y || i != 100) {
                a = p2;
             }
             p0 = p0.a().e(ab2.b(p0.m()).m(new tn1(a, i, p1, hashMap)).d()).g();
          }
       }
       return p0;
    }
    public void dispose(){
    }
    public boolean test(Object p0){
       d37 c;
       String str = "spotify:search:";
       boolean b = false;
       switch (this.a){
           case 0:
             return lp3.c(p0);
           case 1:
             if (p0.b == 1) {
                b = true;
             }
             return b;
             break;
           case 2:
             return p0.c();
           case 3:
             p0.getClass();
             return p0 instanceof yu3;
           case 4:
             return (p0.booleanValue() ^ 1);
           case 5:
             p0.getClass();
             return p0 instanceof av2;
           case 6:
             return p0.booleanValue();
           case 7:
             p0.getClass();
             return p0 instanceof vu2;
           case 8:
             p0.getClass();
             return p0 instanceof vu2;
           case 9:
             return p0.booleanValue();
           case 10:
             p0.getClass();
             return p0 instanceof vu2;
           case 11:
             return p0.booleanValue();
           case 12:
             return p0.c();
           case 13:
             if ((p0 = p0.a) != null && !p0.isEmpty()) {
                b = true;
             }
             return b;
             break;
           case 14:
             p0.getClass();
             return p0 instanceof av2;
           case 15:
             p0.getClass();
             return p0 instanceof vu2;
           case 16:
             c = p0.c;
             if (b01.A.contains(Integer.valueOf(p0.b)) || (c != null || c.getKeyCode() != 66)) {
                b = true;
             }
             return b;
             break;
           case 17:
             if (p0.b != null) {
                b = true;
             }
             return b;
             break;
           case 18:
             c = p0.c;
             if (iu5.B.contains(Integer.valueOf(p0.b)) || (c != null || c.getKeyCode() != 66)) {
                b = true;
             }
             return b;
             break;
           case 19:
             p0.getClass();
             return p0 instanceof vu2;
           case 20:
             p0.getClass();
             return p0 instanceof av2;
           case 21:
             p0.getClass();
             return p0 instanceof av2;
           case 22:
             p0.getClass();
             return p0 instanceof vu2;
           case 23:
             return p0.startsWith(str);
           case 24:
             p0.getClass();
             return p0 instanceof av2;
           case 25:
             return p0.booleanValue();
           case 26:
             p0.getClass();
             return p0 instanceof vu2;
           case 27:
             p0.getClass();
             return p0 instanceof vu2;
           case 28:
             return (p0.a.startsWith(str) ^ 1);
           default:
             p0.getClass();
             return p0 instanceof vu2;
       }
    }
}
