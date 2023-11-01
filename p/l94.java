package p.l94;
import p.yf2;
import java.lang.Object;
import com.spotify.offline_esperanto.proto.EsOffline$TotalProgressResponse;
import java.util.Base64$Encoder;
import p.p3;
import java.lang.String;
import java.lang.RuntimeException;
import p.tp2;
import java.lang.Throwable;
import com.spotify.offline_esperanto.proto.EsOffline$Error;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MultiResponse;
import p.r45;
import java.lang.Boolean;
import android.support.v4.media.MediaMetadataCompat;
import p.ox7;
import p.xe7;
import p.i97;
import p.u65;
import p.j97;
import p.l97;
import java.util.List;
import java.util.Collection;
import com.google.common.collect.c;
import p.m97;
import p.d97;
import p.n97;
import p.o97;
import java.lang.Class;
import p.k97;
import p.zj5;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import p.ar6;
import p.cr6;
import p.xp;
import p.n91;
import p.jw;
import java.lang.NullPointerException;
import p.tk0;
import p.xt3;
import p.jc7;
import com.spotify.liteui.login.LoginActivity;
import p.au3;
import p.st3;
import p.wt3;
import p.ut3;
import p.gq2;
import p.fq2;
import p.q34;
import io.reactivex.rxjava3.core.Maybe;
import p.a34;
import p.bu3;
import java.lang.CharSequence;
import p.zt3;
import p.cu3;
import p.vt;
import io.reactivex.rxjava3.core.Observable;
import p.rx6;
import p.vx6;
import p.sx6;
import p.tx6;
import java.io.IOException;
import java.lang.StringBuilder;
import p.et1;
import p.qs1;
import p.r05;
import java.lang.Enum;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadResponse;

public final class l94 implements yf2	// class@001d0c from classes.dex
{
    public final int a;

    public void l94(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       xp b1;
       boolean b = false;
       switch (this.a){
           case 0:
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
           case 1:
             return new qs1(p0.booleanValue());
           case 2:
             return new et1(p0);
           case 3:
             if (p0.b.c()) {
                p0 = Observable.just(p0);
             }else {
                vx6 ovx6 = p0.i.e(new rx6());
                ovx6.getClass();
                if (ovx6 instanceof sx6) {
                   p0 = Observable.error(ovx6.a);
                }else if(ovx6 instanceof tx6){
                   p0 = Observable.error(new IOException("Could not sync "+p0.a));
                }else {
                   p0 = Observable.just(p0);
                }
             }
             return p0;
             break;
           case 4:
             return new cu3(p0.toString());
           case 5:
             return new zt3(p0.toString());
           case 6:
             return new bu3();
           case 7:
             p0 = (p0 instanceof fq2)? Maybe.c(p0.a): a34.a;
             return p0;
             break;
           case 8:
             return new ut3(p0);
           case 9:
             return new wt3();
           case 10:
             return new st3();
           case 11:
             return new au3();
           case 12:
             return new xt3();
           case 13:
             return tk0.a;
           case 14:
             return p0.b();
           case 15:
             return p0.b();
           case 16:
             return p0.b();
           case 17:
             n91 on91 = new n91(12, null);
             if ((b1 = p0.b) != null) {
                on91.b = b1;
                if ((p0 = p0.c) != null) {
                   on91.c = p0;
                   return new jw(b1, p0);
                }else {
                   throw new NullPointerException("Null storedCredential");
                }
             }else {
                throw new NullPointerException("Null username");
             }
             break;
           case 18:
             p0 = (p0.booleanValue())? new ar6(): new cr6();
             return p0;
             break;
           case 19:
             p0.getClass();
             return new zj5(p0.b, p0.a);
           case 20:
             return new n97();
           case 21:
             return new m97(c.o(p0));
           case 22:
             return new l97();
           case 23:
             j97 oj97 = (p0.c())? new j97(p0.b()): new i97();
             return oj97;
             break;
           case 24:
             return new i97();
           case 25:
             if (!p0.c()) {
                p0 = Boolean.FALSE;
             }else {
                p0 = xe7.J(ox7.s(p0.b()));
                if (p0.startsWith("spotify:interruption:") || p0.startsWith("spotify:ad:")) {
                   b = true;
                }
                p0 = Boolean.valueOf(b);
             }
             return p0;
             break;
           case 26:
             try{
                return MetadataCosmos$MultiResponse.h(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.metadata.cosmos.proto.MetadataCosmos.MultiResponse: \'", p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 27:
             try{
                return EsOffline$Error.g(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.Error: \'", p3.n(p3.o(), p0), v2), e0);
             }
             break;
           case 28:
             try{
                return EsOffline$TotalProgressResponse.g(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.TotalProgressResponse: \'", p3.n(p3.o(), p0), v2), e0);
             }
             break;
           default:
             try{
                return EsOffline$DownloadResponse.f(p0);
             }catch(java.lang.Exception e0){
                throw new RuntimeException(tp2.m("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.DownloadResponse: \'", p3.n(p3.o(), p0), v2), e0);
             }
       }
    }
}
