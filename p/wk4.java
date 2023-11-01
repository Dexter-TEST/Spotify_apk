package p.wk4;
import p.qg2;
import p.zt;
import java.lang.Object;
import p.it1;
import java.lang.Class;
import p.yt;
import android.support.v4.media.session.PlaybackStateCompat;
import p.do5;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import java.lang.Float;
import p.xt;
import p.ys1;
import p.sh1;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.rt1;
import p.xh1;
import p.wh1;
import p.ht1;
import p.jh1;
import p.kh1;
import p.zs1;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.String;
import p.ox7;
import p.xe7;
import android.os.BaseBundle;

public final class wk4 implements qg2	// class@002b54 from classes.dex
{
    public final int a;
    public final zt b;

    public void wk4(zt p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       jh1 ojh1;
       PlaybackStateCompat a;
       PlaybackStateCompat a1;
       wk4 tb = this.b;
       int i = 0;
       switch (this.a){
           case 0:
             p0 = new Object[1];
             ojh1 = (tb.j != null)? new jh1(): new kh1();
             break;
           case 1:
             if (tb.p != null) {
                p0 = new Object[]{new xh1()};
                p0 = xt.a(vv7.p(p0));
             }else if(tb.q != null){
                p0 = new Object[]{new wh1()};
                p0 = xt.a(vv7.p(p0));
             }else {
                p0 = xt.e();
             }
             return p0;
             break;
           case 2:
             if (tb.o != null) {
                p0 = new Object[]{new sh1((tb.h ^ 1))};
                p0 = xt.a(vv7.p(p0));
             }else {
                p0 = xt.e();
             }
             return p0;
             break;
           case 3:
             p0 = p0.a;
             tb.getClass();
             yt oyt = new yt(tb);
             boolean b = (!do5.K(p0) && ((a = p0.a) != 11 && (a != 10 && a != 9)))? false: true;
             int i1 = (p0.a == 7)? 1: 0;
             oyt.j = Boolean.valueOf(b);
             boolean b1 = ((a1 = p0.a) == 6)? true: false;
             oyt.k = Boolean.valueOf(b1);
             switch (a1){
                 case 8:
                 case 10:
                 case 11:
                 case 9:
                   b1 = true;
                   break;
                 default:
                   b1 = false;
             }
             boolean b2 = (tb.l != null && (tb.j == null && !b1))? true: false;
             oyt.l = Boolean.valueOf(b1);
             oyt.m = Boolean.valueOf(b2);
             b = (tb.m != null && !b)? true: false;
             oyt.m = Boolean.valueOf(b);
             oyt.n = Boolean.valueOf(do5.I(p0, 512));
             oyt.o = Boolean.valueOf(do5.I(p0, 128));
             oyt.p = Boolean.valueOf(do5.I(p0, 32));
             b = (a1 == null)? 1: 0;
             if (!b && (!i1 && TextUtils.isEmpty(tb.a))) {
                i = true;
             }
             oyt.i = Boolean.valueOf(i);
             oyt.e = Long.valueOf(p0.b);
             oyt.g = Float.valueOf(p0.t);
             oyt.f = Long.valueOf(p0.y);
             return xt.d(oyt.a());
             break;
           default:
             p0 = p0.a;
             tb.getClass();
             yt oyt1 = new yt(tb);
             oyt1.a = xe7.J(ox7.s(p0));
             oyt1.b = xe7.J(ox7.o(p0, "android.media.metadata.TITLE"));
             oyt1.c = xe7.J(ox7.o(p0, "android.media.metadata.ARTIST"));
             long l = (p0 == null)? 0: p0.a.getLong("android.media.metadata.DURATION", 0);
             oyt1.d = Long.valueOf(l);
             oyt1.h = Boolean.valueOf(ox7.v(p0));
             if (p0 != null && (p0.a.getLong("spotify.media.metadata.SKIP_LIMIT_REACHED", 0))) {
                i = true;
             }
             oyt1.q = Boolean.valueOf(i);
             return xt.d(oyt1.a());
       }
       p0[i] = ojh1;
       return xt.a(vv7.p(p0));
    }
}
