package p.rp;
import p.jg2;
import p.bi5;
import java.lang.Object;
import p.aq6;
import p.ts0;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import p.r05;
import p.cw0;
import p.s05;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import p.nt0;
import p.ur;
import p.au2;
import p.qq2;
import com.spotify.socialgraph.proto.SocialgraphV2$SocialGraphEntity;
import com.spotify.metadata.proto.Metadata$Artist;
import p.td7;
import p.ew;
import java.util.List;
import java.lang.Class;
import java.util.RandomAccess;
import p.jm3;
import p.im3;
import java.lang.Iterable;
import io.reactivex.rxjava3.core.Observable;
import p.og2;
import p.ht2;
import p.tp2;
import java.lang.Integer;
import p.ip3;
import p.m73;
import p.hp3;
import p.dw;
import p.so3;
import p.lq5;
import p.u65;
import com.spotify.eventsender.gabo.b;
import com.spotify.eventsender.gabo.EventEnvelope$EventFragment;
import p.i80;
import com.google.protobuf.c;
import com.google.protobuf.b;
import com.spotify.eventsender.gabo.PublishEventsResponse$EventError;
import p.bd2;
import com.spotify.eventsender.Fragment;
import p.cu1;
import p.fu1;
import java.lang.Long;
import com.spotify.contexts.DeviceAndroid;
import p.xp;
import java.lang.Boolean;
import p.ow0;
import java.util.Map;
import p.r45;
import p.yp6;
import p.n05;
import p.k05;
import java.lang.Throwable;
import java.io.IOException;
import p.zh4;
import p.pi4;
import p.wu;
import android.support.v4.media.MediaMetadataCompat;
import p.ox7;
import p.cv2;
import p.vu2;
import p.av2;

public final class rp implements jg2, bi5	// class@002536 from classes.dex
{
    public final int a;

    public void rp(int p0){
       this.a = p0;
       super();
    }
    public Object apply(Object p0){
       int i;
       String str = "";
       r05 or05 = null;
       switch (this.a){
           case 0:
             return p0.a;
           case 1:
             return p0.a;
           case 2:
             return p0.b;
           case 3:
             return Long.valueOf(p0.a);
           case 4:
             return new u65(p0.getName(), p0.h());
           case 5:
             try{
                str = DeviceAndroid.m(p0.b).k();
                return str;
             }catch(p.rc3 e0){
             }
             break;
           case 6:
             return new u65(p0.getName(), p0.h());
           case 7:
             return Long.valueOf(p0.a);
           case 8:
             return p0.b();
           case 9:
             bd2 uobd2 = Fragment.i();
             uobd2.d(p0.a);
             uobd2.c(p0.b);
             return uobd2.build();
           case 10:
             return Integer.valueOf(p0.f());
           case 11:
             return Integer.valueOf(p0.f());
           case 12:
             b uob = EventEnvelope$EventFragment.h();
             uob.d(p0.a);
             uob.c(p0.b);
             return uob.build();
           case 13:
             lq5 olq5 = nt0.a(p0.a);
             olq5.l(p0.b);
             return olq5.e();
           case 14:
             p0 = ip3.a.get(p0);
             hp3 b = hp3.b;
             if (p0 == null) {
                p0 = b;
             }
             return p0;
             break;
           case 15:
             tp2.v(p0);
             return ht2.access$000().apply(or05);
           case 16:
             p0.getClass();
             jm3 ojm3 = (p0 instanceof RandomAccess)? new jm3(100, p0): new im3(100, p0);
             return Observable.fromIterable(ojm3);
             break;
           case 17:
             if (p0 != null) {
                or05 = p0.a;
             }
             return or05;
             break;
           case 18:
             return td7.d(p0);
           case 19:
             if (p0 != null) {
                or05 = p0.getName();
             }
             return or05;
             break;
           case 20:
             return p0.m;
           case 21:
             if (p0 != null) {
                or05 = p0.f();
             }
             return or05;
             break;
           case 22:
             return p0.b("title", str);
           case 23:
             return p0.c;
           case 24:
             return new Canvas(p0);
           case 25:
             return p0.m;
           case 26:
             if (p0 != null) {
                or05 = p0.m;
             }
             return or05;
             break;
           case 27:
             p0 = ts0.Q.get(p0);
             ts0 b1 = ts0.b;
             if (p0 == null) {
                p0 = b1;
             }
             return p0;
             break;
           case 28:
             if ((i = p0.b.ordinal()) != 18) {
                i = (i != 19)? ts0.b: ts0.A;
             }else {
                i = ts0.c;
             }
             return i;
             break;
           default:
             if ("queue".equals(p0)) {
                p0 = ts0.B;
             }else if(p0.startsWith("mft/") && !"mft/context_switch".equals(p0)){
                p0 = ts0.H;
             }else {
                p0 = ts0.b;
             }
             return p0;
       }
    }
    public boolean test(Object p0){
       u65 a;
       aq6 b1;
       boolean b = false;
       switch (this.a){
           case 0:
             return p0.booleanValue();
           case 1:
             p0.getClass();
             return p0 instanceof av2;
           case 2:
             p0.getClass();
             return p0 instanceof vu2;
           case 3:
             if ((a = p0.a) != null && (a.c() && ((p0 = p0.b) != null && p0.c()))) {
                int i = ((p0 = td7.d(ox7.s(p0.b()))) != null && ((p0 = p0.b) == yp6.J && p0 != yp6.I))? 1: 0;
                if (!i) {
                   b = true;
                }
             }
             return b;
             break;
           case 4:
             if ((b1 = new aq6(p0.b).b) == yp6.J || b1 == yp6.I) {
                b = 1;
             }
             return (b ^ 0x01);
             break;
           case 5:
             return p0.c();
           case 6:
             if (ox7.n(p0) != null && ox7.s(p0) != null) {
                b = true;
             }
             return b;
             break;
           case 7:
             return p0.c();
           case 8:
             if (p0.g.f() != null) {
                b = true;
             }
             return b;
             break;
           case 9:
             if ((p0.a - -1) && (p0.b - -1)) {
                b = true;
             }
             return b;
             break;
           case 10:
             zh4 b2 = p0.b;
             if ((p0 = p0.a) >= 0 && ((v0 = b2) >= 0 && (p0 > 0 && v0 <= 0))) {
                b = true;
             }
             return b;
             break;
           case 11:
             return p0 instanceof IOException;
           case 12:
             p0.getClass();
             return p0 instanceof k05;
           case 15:
             return p0.booleanValue();
           case 16:
             return p0.c();
           case 17:
             if (p0.intValue()) {
                b = true;
             }
             return b;
             break;
           case 18:
             return p0.c();
           case 19:
             if (p0 != null && !p0.isEmpty()) {
                b = true;
             }
             return b;
             break;
           case 20:
             if ((p0 = p0.b) != yp6.y0 && p0 != yp6.m0) {
                b = true;
             }
             return b;
             break;
           case 21:
             return p0.booleanValue();
           case 22:
             return p0.c();
           case 23:
             return p0.booleanValue();
           case 24:
             return p0.containsKey("error");
           case 25:
             return p0 instanceof String;
           case 26:
             return p0.containsKey("type");
           case 27:
             if (p0.intValue() == 401) {
                b = true;
             }
             return b;
             break;
           case 28:
             return (p0.booleanValue() ^ 1);
           default:
             return p0.booleanValue();
       }
    }
}
