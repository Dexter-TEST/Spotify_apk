package p.a05;
import p.yf2;
import java.lang.Object;
import p.c85;
import p.tg6;
import p.ag6;
import p.p10;
import p.mg6;
import p.vf6;
import java.lang.Boolean;
import p.ug6;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Observable;
import p.lg6;
import p.uf7;
import p.b85;
import p.ii1;
import com.spotify.scrobble.esperanto.proto.GetIncognitoModeResponse;
import java.util.Base64$Encoder;
import p.p3;
import java.lang.String;
import java.lang.RuntimeException;
import p.tp2;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfigDummy$ResolveDummyResponse;
import com.spotify.prefs.esperanto.proto.EsPrefs$PrefValues;
import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import com.spotify.player.esperanto.proto.EsContextPlayerError$ContextPlayerError;
import com.spotify.player.esperanto.proto.EsQueue$Queue;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextPlayerState;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsResponse;
import p.wf6;

public final class a05 implements yf2	// class@000eea from classes.dex
{
    public final int a;

    public void a05(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
             try{
                return EsOffline$GetContextsResponse.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.GetContextsResponse: \'", p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 1:
             try{
                return EsContextPlayerState$ContextPlayerState.Q(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.player.esperanto.proto.EsContextPlayerState.ContextPlayerState: \'", p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 2:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 3:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 4:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 5:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 6:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 7:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 8:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 9:
             try{
                return EsQueue$Queue.m(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.player.esperanto.proto.EsQueue.Queue: \'", p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 10:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 11:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 12:
             try{
                return EsContextPlayerError$ContextPlayerError.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.player.esperanto.proto.EsContextPlayerError.ContextPlayerError: \'", p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 13:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 14:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 15:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 16:
             try{
                return EsResponseWithReasons$ResponseWithReasons.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m(v1, p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 17:
             try{
                return EsPrefs$PrefValues.f(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.prefs.esperanto.proto.EsPrefs.PrefValues: \'", p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 18:
             try{
                return EsRemoteConfigDummy$ResolveDummyResponse.f(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.remoteconfig.esperanto.proto.EsRemoteConfigDummy.ResolveDummyResponse: \'", p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 19:
             try{
                return GetIncognitoModeResponse.f(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.scrobble.esperanto.proto.GetIncognitoModeResponse: \'", p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 20:
             return new ii1(p0);
           case 21:
             return new b85(p0);
           case 22:
             return new lg6();
           case 23:
             return Observable.just(Boolean.FALSE);
           case 24:
             return new ug6();
           case 25:
             return p0.A;
           case 26:
             return new mg6(p0);
           case 27:
             return p0.A;
           case 28:
             return new tg6(p0);
           default:
             return p0.A;
       }
    }
}
