package p.ml4;
import p.qg2;
import p.cu;
import java.lang.Object;
import p.sm4;
import p.xl4;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.xt;
import p.an4;
import p.dm4;
import p.nm4;
import p.zl4;
import p.vm4;
import java.lang.Math;
import p.yl4;
import p.km4;
import p.r45;
import p.bu;
import p.c0;
import p.lm4;
import p.nq5;
import java.lang.Integer;
import p.au;
import p.jj5;
import p.cn4;
import p.em4;
import p.cm4;
import p.im4;
import java.lang.Class;
import java.lang.NullPointerException;
import java.lang.String;
import p.jm4;
import java.lang.Boolean;
import p.om4;
import android.support.v4.media.MediaMetadataCompat;
import p.ox7;
import p.xe7;
import p.ts0;
import p.rp;
import p.jg2;
import p.aq6;
import p.td7;
import java.util.Map;
import java.util.Collections;
import p.nw0;
import java.lang.Enum;
import android.os.BaseBundle;
import java.lang.Long;
import p.yp6;
import android.support.v4.media.MediaDescriptionCompat;
import p.ol4;
import android.graphics.Bitmap;
import p.co5;
import p.tm4;
import p.bn4;
import p.rm4;
import android.support.v4.media.session.PlaybackStateCompat;
import p.do5;
import android.os.Bundle;
import p.pl4;
import java.lang.Float;
import p.mm4;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.ql4;
import p.kn4;
import p.xj0;
import p.jn4;
import p.ln4;
import p.in4;
import p.hn4;
import p.gn4;
import p.en4;
import p.tl4;
import p.ym4;
import p.x55;
import p.am4;
import p.hm4;
import p.nl4;
import p.bm4;
import p.gm4;
import p.rl4;
import p.qm4;
import p.vl4;
import p.wl4;
import p.wm4;

public final class ml4 implements qg2	// class@001ebb from classes.dex
{
    public final int a;
    public final cu b;

    public void ml4(cu p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       xt oxt;
       Object[] objArray;
       x55 a;
       xt oxt1;
       bu uobu1;
       ts0 ots0;
       aq6 uoaq6;
       aq6 b3;
       boolean i = 10;
       boolean i1 = 2;
       int i2 = 1;
       ml4 tb = this.b;
       switch (this.a){
           case 0:
             p0 = new Object[i2];
             vl4 ovl4 = (tb.q != null)? new vl4(): new wl4();
             p0[0] = ovl4;
             return xt.a(vv7.p(p0));
             break;
           case 1:
             p0 = tb.d;
             if (tb.v == null && !TextUtils.isEmpty(p0)) {
                objArray = new Object[i2];
                objArray[0] = new rl4(p0);
                oxt = new xt(tb, co5.B(vv7.p(objArray)));
             }else {
                oxt = xt.e();
             }
             return oxt;
             break;
           case 2:
             p0 = tb.d;
             if (tb.v == null && !TextUtils.isEmpty(p0)) {
                objArray = new Object[i1];
                objArray[0] = new nl4(p0);
                objArray[i2] = new bm4();
                p0 = xt.a(vv7.p(objArray));
             }else {
                p0 = xt.e();
             }
             return p0;
             break;
           case 3:
             a = p0.a.a;
             cu d = tb.d;
             if (tb.v == null && !TextUtils.isEmpty(d)) {
                Object[] objArray1 = new Object[i2];
                objArray1[0] = new am4(d, a, p0.b);
                oxt = new xt(tb, co5.B(vv7.p(objArray1)));
             }else {
                oxt = xt.e();
             }
             return oxt;
             break;
           case 4:
             p0 = new Object[i2];
             p0[0] = new tl4(tb.d);
             return xt.a(vv7.p(p0));
           case 5:
             return xj0.u0(tb, tb.h);
           case 6:
             return xj0.u0(tb, tb.f);
           case 7:
             return xj0.u0(tb, tb.a);
           case 8:
             return xj0.u0(tb, tb.d);
           case 9:
             return xj0.u0(tb, tb.d);
           case 10:
             return xj0.u0(tb, tb.a);
           case 11:
             p0 = tb.i;
             if (TextUtils.isEmpty(p0)) {
                p0 = xt.e();
             }else {
                objArray = new Object[i2];
                objArray[0] = new ql4(p0);
                p0 = new xt(tb, co5.B(vv7.p(objArray)));
             }
             return p0;
             break;
           case 12:
             p0 = p0.a;
             tb.getClass();
             bu uobu = new bu(tb);
             i1 = (p0.a == 6)? true: false;
             uobu.t = Boolean.valueOf(i1);
             uobu.p = Boolean.FALSE;
             PlaybackStateCompat a1 = p0.a;
             i = (!do5.K(p0) && (a1 != 11 && (a1 != i && a1 != 9)))? false: true;
             uobu.q = Boolean.valueOf(i);
             uobu.x = Boolean.valueOf(do5.I(p0, 512));
             uobu.y = Boolean.valueOf(do5.I(p0, 256));
             uobu.z = Boolean.valueOf(do5.I(p0, 16));
             uobu.A = Boolean.valueOf(do5.I(p0, 32));
             long l = 0x40000;
             PlaybackStateCompat b = p0.B;
             i = (do5.I(p0, l) && b != null)? b.getBoolean("spotify.media.session.REPEAT_ALL_ALLOWED", 0): false;
             uobu.D = Boolean.valueOf(i);
             i = (do5.I(p0, l) && b != null)? b.getBoolean("spotify.media.session.REPEAT_ONE_ALLOWED", 0): false;
             uobu.E = Boolean.valueOf(i);
             uobu.C = Boolean.valueOf(do5.I(p0, 0x200000));
             uobu.F = Boolean.valueOf(do5.I(p0, 128));
             a = (a1 == null)? 1: 0;
             if (a) {
                objArray = new Object[i2];
                objArray[0] = new pl4();
                oxt1 = new xt(uobu.a(), co5.B(vv7.p(objArray)));
             }else {
                uobu.k = Long.valueOf(p0.b);
                uobu.l = Float.valueOf(p0.t);
                uobu.m = Long.valueOf(p0.y);
                oxt1 = xt.d(uobu.a());
             }
             return oxt1;
             break;
           case 13:
             tb.getClass();
             uobu1 = new bu(tb);
             if (p0.a == null) {
                i2 = false;
             }
             uobu1.r = Boolean.valueOf(i2);
             return xt.d(uobu1.a());
             break;
           case 14:
             tb.getClass();
             uobu1 = new bu(tb);
             if (p0.a == null) {
                i2 = false;
             }
             uobu1.s = Boolean.valueOf(i2);
             uobu1.H = Integer.valueOf(p0.a);
             return xt.d(uobu1.a());
             break;
           case 15:
             p0 = p0.a;
             tb.getClass();
             uobu1 = new bu(tb);
             uobu1.a = xe7.J(ox7.h(p0));
             uobu1.b = xe7.J(ox7.o(p0, "spotify.media.metadata.CONTEXT_NAME"));
             ts0 b1 = ts0.b;
             if ((ots0 = r45.a(ox7.o(p0, "spotify.media.metadata.TRACK_PROVIDER")).g(new rp(29)).e(b1)) != b1 || ((ots0 = r45.a(td7.d(ox7.s(p0))).g(new rp(28)).e(b1)) != b1 || ((ots0 = r45.a(ox7.o(p0, "spotify.media.metadata.PLAY_ORIGIN_FEATURE_ID")).g(new rp(27)).e(b1)) != b1 || (ots0 = r45.a(td7.d(ox7.h(p0))).g(new nw0(i2, Collections.emptyMap())).e(b1)) != b1))) {
                b1 = ots0;
             }
             switch (b1.ordinal()){
                 case '#':
                   b1 = ts0.K;
                   break;
                 case '$':
                   b1 = ts0.L;
                   break;
                 case '%':
                   b1 = ts0.M;
                   break;
                 case '&':
                   b1 = ts0.N;
                   break;
                 case 39:
                   b1 = ts0.O;
                   break;
                 case '(':
                   b1 = ts0.P;
                   break;
                 default:
             }
             uobu1.c = Integer.valueOf(b1.a);
             uobu1.u = Boolean.valueOf(ox7.v(p0));
             long l1 = 0;
             boolean b2 = (p0 == null || !(p0.a.getLong("spotify.media.metadata.SKIP_LIMIT_REACHED", l1) - l1))? false: true;
             uobu1.B = Boolean.valueOf(b2);
             uobu1.d = xe7.J(ox7.s(p0));
             uobu1.e = xe7.J(ox7.o(p0, "android.media.metadata.TITLE"));
             uobu1.f = xe7.J(ox7.o(p0, "spotify.media.metadata.ARTIST_URI"));
             uobu1.g = xe7.J(ox7.o(p0, "android.media.metadata.ARTIST"));
             uobu1.h = xe7.J(ox7.o(p0, "spotify.media.metadata.ALBUM_URI"));
             uobu1.i = xe7.J(ox7.o(p0, "spotify.media.metadata.CLICK_URI"));
             if (p0 != null) {
                l1 = p0.a.getLong("android.media.metadata.DURATION", l1);
             }
             uobu1.j = Long.valueOf(l1);
             HashSet hashSet = new HashSet(i2);
             b2 = ((uoaq6 = td7.d(ox7.s(p0))) != null && ((b3 = uoaq6.b) == yp6.J && b3 != yp6.I))? true: false;
             uobu1.v = Boolean.valueOf(b2);
             if (uoaq6 == null || uoaq6.b != yp6.m0) {
                i2 = false;
             }
             uobu1.w = Boolean.valueOf(i2);
             p0 = (p0 == null)? null: p0.b().v;
             if (p0 != null) {
                uobu1.n = new jj5(p0);
                hashSet.add(new ol4(p0));
             }
             return new xt(uobu1.a(), co5.B(hashSet));
             break;
           case 16:
             tb.getClass();
             uobu1 = new bu(tb);
             uobu1.G = Boolean.valueOf(p0.a);
             return xt.d(uobu1.a());
           case 17:
             tb.getClass();
             uobu1 = new bu(tb);
             if ((p0 = p0.a) != null) {
                uobu1.I = p0;
                return xt.d(uobu1.a());
             }else {
                throw new NullPointerException("Null audioQuality");
             }
             break;
           case 18:
             if (tb.A != null) {
                p0 = new Object[i2];
                p0[0] = new em4();
                p0 = xt.a(vv7.p(p0));
             }else if(tb.B != null){
                p0 = new Object[i2];
                p0[0] = new cm4();
                p0 = xt.a(vv7.p(p0));
             }else {
                p0 = xt.e();
             }
             return p0;
             break;
           case 19:
             if (tb.n.c() && p0.a.equals(tb.n.b())) {
                nq5 onq5 = new nq5(i);
                onq5.a = Integer.valueOf(p0.b);
                onq5.b = Integer.valueOf(p0.c);
                onq5.c = Integer.valueOf(p0.d);
                uobu1 = new bu(tb);
                uobu1.o = new jj5(onq5.a());
                p0 = xt.d(uobu1.a());
             }else {
                p0 = xt.e();
             }
             return p0;
             break;
           case 20:
             if (tb.n.c() && p0.a.equals(tb.n.b())) {
                p0 = new bu(tb);
                p0.o = c0.a;
                p0 = xt.d(p0.a());
             }else {
                p0 = xt.e();
             }
             return p0;
             break;
           case 21:
             objArray = new Object[i2];
             objArray[0] = new yl4(Math.min((p0.b + 15000), (int)tb.j));
             return xt.a(vv7.p(objArray));
           case 22:
             if (tb.F != null) {
                p0 = new Object[i2];
                p0[0] = new zl4((tb.u ^ i2));
                p0 = xt.a(vv7.p(p0));
             }else {
                p0 = xt.e();
             }
             return p0;
             break;
           case 23:
             p0 = new Object[i2];
             p0[0] = new dm4((tb.r ^ i2));
             return xt.a(vv7.p(p0));
           case 24:
             p0 = tb.H;
             cu e = tb.E;
             if (p0 != null) {
                if (p0 != i1 || e == null) {
                label_0057 :
                   p0 = new Object[i2];
                   p0[0] = new xl4(0);
                   p0 = xt.a(vv7.p(p0));
                }else {
                   p0 = new Object[i2];
                   p0[0] = new xl4(i2);
                   p0 = xt.a(vv7.p(p0));
                }
             }else if(tb.D != null){
                p0 = new Object[i2];
                p0[0] = new xl4(i1);
                p0 = xt.a(vv7.p(p0));
             }else if(e != null){
                p0 = new Object[i2];
                p0[0] = new xl4(i2);
                p0 = xt.a(vv7.p(p0));
             }else {
                goto label_0057 ;
             }
             return p0;
             break;
           default:
             tb.getClass();
             p0 = new bu(tb);
             p0.p = Boolean.TRUE;
             return xt.d(p0.a());
       }
    }
}
