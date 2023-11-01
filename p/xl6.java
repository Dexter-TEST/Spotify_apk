package p.xl6;
import p.yf2;
import java.lang.Object;
import p.wu;
import p.ow0;
import p.r45;
import p.nt0;
import p.ur;
import java.lang.String;
import p.aq6;
import p.td7;
import p.s05;
import p.q05;
import p.jj5;
import com.google.common.collect.d;
import java.lang.Iterable;
import io.reactivex.rxjava3.core.Observable;
import p.cw0;
import p.d73;
import com.google.common.collect.b;
import p.m73;
import p.qc7;
import java.util.Iterator;
import p.r05;
import p.a73;
import com.spotify.playerlimited.player.models.OfflineProgress;
import java.lang.Boolean;
import p.ab2;
import p.rp;
import p.jg2;
import com.google.common.collect.c;
import p.dt5;
import java.util.Map;
import com.spotify.playerlimited.player.models.OfflineErrorCode;
import java.lang.Integer;
import java.lang.Float;
import p.m05;
import p.l05;
import p.k05;
import p.n05;
import java.lang.Class;
import p.a17;
import p.j33;
import p.hr6;
import java.lang.Throwable;
import p.jl;
import p.tv;
import p.ah4;
import com.spotify.litenavigation.deeplink.DeepLinkActivity;
import android.content.Intent;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.MediaMetadataCompat;
import p.u65;
import p.ox7;

public final class xl6 implements yf2	// class@002ca0 from classes.dex
{
    public final int a;

    public void xl6(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       OfflineProgress g;
       OfflineProgress e;
       aq6 uoaq6;
       String str = "1";
       boolean b = true;
       int i = 0;
       switch (this.a){
           case 0:
             return p0.b();
           case 1:
             return new u65(ox7.n(p0), ox7.s(p0));
           case 2:
             return p0.b();
           case 3:
             if (p0 != null && p0.a != null) {
                b = false;
             }
             return Boolean.valueOf(b);
             break;
           case 4:
             return p0.g;
           case 5:
             return r45.a(p0.a());
           case 6:
             if (p0.f == null || p0.g == null) {
                b = false;
             }
             return Boolean.valueOf(b);
             break;
           case 7:
             jl.q("Error fetching storage location", p0);
             return Boolean.TRUE;
           case 8:
             return p0.a(new j33(12), new j33(13));
           case 9:
             p0.getClass();
             return p0;
           case 10:
             return p0.a;
           case 12:
             return p0.b();
           case 13:
             return ab2.b(p0.m.j()).m(new rp(25)).d();
           case 14:
             if ((g = p0.g) != null && g.booleanValue()) {
                float f = ((g = p0.i) == null)? 0: g.floatValue();
                int i1 = ((e = p0.e) == null)? 0: e.intValue();
                if ((p0 = p0.c) != null) {
                   i = p0.intValue();
                }
                p0 = new m05(i1, f, i);
             }else {
                p0 = new l05();
             }
             return p0;
             break;
           case 15:
             return Integer.valueOf(p0.a);
           case 16:
             return Boolean.valueOf(str.equals(p0.get("offline")));
           case 17:
             return p0.b();
           case 18:
             return p0.e(new q05(dt5.x));
           case 19:
             return p0.m;
           case 20:
             return Boolean.valueOf((p0.booleanValue() ^ b));
           case 21:
             return ab2.b(p0.n).m(new rp(26)).d();
           case 22:
             if ((p0 = p0.g) == null || !p0.booleanValue()) {
                b = false;
             }
             return Boolean.valueOf(b);
             break;
           case 23:
             d73 uod73 = new d73();
             p0 = p0.m.j().l();
             while (p0.hasNext()) {
                if ((uoaq6 = td7.d(p0.next().m.m)) != null) {
                   uod73.D0(uoaq6);
                }
             }
             return uod73.H0();
             break;
           case 24:
             return Observable.fromIterable(p0);
           case 25:
             return r45.d(p0);
           case 26:
             return p0.b();
           case 27:
             return p0.m;
           case 28:
             str = null;
             p0 = (p0.g.f() != null)? p0.g.f(): str;
             if (p0 != null) {
                ur a = p0.a;
             }
             return r45.a(td7.d(str));
             break;
           default:
             return Boolean.valueOf(str.equals(p0.get("audio-quality")));
       }
    }
}
