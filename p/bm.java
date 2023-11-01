package p.bm;
import p.yf2;
import p.g10;
import p.bi5;
import p.w00;
import p.xo0;
import p.kd7;
import p.j93;
import p.xk5;
import java.lang.Object;
import com.spotify.litenetwork.webapi.model.RecommendedGenres;
import java.util.List;
import com.spotify.litenetwork.webapi.model.RecommendedGenre;
import p.ir6;
import java.lang.Class;
import p.ar6;
import p.cr6;
import java.lang.Boolean;
import p.sv;
import p.i77;
import java.lang.Integer;
import p.tj;
import p.u65;
import p.mo;
import p.ce0;
import p.ae0;
import p.l51;
import p.ng1;
import p.t7;
import p.ow0;
import java.util.Map;
import java.util.HashMap;
import p.m73;
import java.lang.Long;
import p.yi4;
import p.r45;
import p.b43;
import java.util.Iterator;
import p.r05;
import com.google.common.collect.c;
import java.lang.String;
import p.w51;
import p.ju2;
import p.tt2;
import p.au2;
import p.o05;
import p.c03;
import p.fu2;
import p.iu2;
import java.io.Serializable;
import p.k23;
import p.do5;
import java.util.Arrays;
import p.a43;
import p.ys5;
import p.z23;
import p.tv;
import p.eq3;
import java.lang.Iterable;
import p.ab2;
import p.vr1;
import p.jg2;
import p.dg5;
import p.f13;
import com.spotify.connectivity.connectiontype.OfflineState$State;
import com.spotify.connectivity.connectiontype.ConnectionState;
import com.spotify.connectivity.platformconnectiontype.ConnectionStateObservable;
import java.lang.Throwable;
import p.jt;
import p.nh6;
import p.jg6;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.gw;
import p.a97;
import p.f;
import java.util.Collections;
import p.st;
import p.lt3;
import p.vt;
import p.as;
import p.ai1;
import p.yh1;
import p.aq6;
import p.xg1;
import p.vg1;
import p.wg1;
import p.ah1;
import p.dh1;
import p.nd5;
import p.xj0;
import p.sb5;
import p.ra0;
import p.xa5;
import p.sa0;
import p.i;
import p.ad6;
import p.nu;
import p.cb5;
import p.iv;
import com.google.common.collect.d;
import p.d73;
import p.u56;
import p.a73;
import p.d66;
import p.lr;
import p.v56;
import p.e66;
import p.j;
import p.ry7;
import p.wn7;
import p.mn7;
import p.sn7;
import p.br6;
import p.qn7;
import p.vv;
import p.oi;
import p.d;
import p.pv;
import p.ht;
import p.sy1;
import p.hr0;
import p.ap0;
import p.ib4;
import com.spotify.signup.signup.facebook.FacebookLoginActivity;
import p.xt;
import p.e;
import p.di2;
import p.eb3;
import p.ws;
import p.ji1;
import p.oi1;
import p.ni1;
import p.hu;
import p.c85;
import p.d85;
import p.t10;
import p.p10;
import p.s10;
import p.o97;
import p.r97;
import p.xc5;
import p.s97;
import p.bv;
import p.ek5;
import p.fk5;
import p.du3;
import p.nu3;
import p.wt1;
import p.j94;
import p.b;
import p.za0;
import p.cb0;
import p.g;
import p.q35;
import p.u35;
import p.b76;
import p.z76;
import p.kl4;
import p.c76;
import p.tm;
import p.cu;
import p.mn4;
import p.ml4;
import p.qg2;
import p.zt;
import p.vt1;
import p.wk4;
import p.j33;
import p.no7;
import p.to7;
import p.ut1;
import p.qx6;
import p.iz1;
import p.jz1;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import p.cv2;
import p.av2;
import p.bo3;
import android.database.sqlite.SQLiteException;
import p.wu2;
import p.vu2;
import p.jl;
import java.io.IOException;
import com.spotify.connectivity.connectiontype.ConnectionType;
import p.iz6;
import com.spotify.lite.appmain.MainActivity;
import p.mz6;
import p.lz6;
import android.support.v4.media.session.PlaybackStateCompat;
import com.spotify.connectivity.sessionstate.SessionState;
import com.spotify.connectivity.connectiontype.DeferUntilConnected;

public final class bm implements yf2, g10, bi5, w00, xo0, kd7, j93, xk5	// class@0010f6 from classes.dex
{
    public final int a;

    public void bm(int p0){
       this.a = p0;
       super();
    }
    public Object apply(Object p0){
       return p0.a.get(this.a);
    }
    public Object apply(Object p0,Object p1){
       HashMap hashMap;
       tt2 ott2;
       int i = 4;
       int i1 = 1;
       int i2 = 0;
       switch (this.a){
           case 0:
             return new u65(p0, p1);
           case 1:
             return new u65(p0, p1);
           case 2:
             return ConnectionStateObservable.a(p0, p1.booleanValue());
           case 3:
             return p1;
           case 4:
             return p1.a(new f13(p0, i2), new f13(p0, i1));
           case 5:
             return ab2.b(p0).m(new vr1(i, p1)).d();
           case 6:
             return Long.valueOf((p1.longValue() + p0.longValue()));
           case 7:
             hashMap = new HashMap(p1.size());
             p1 = p1.iterator();
             while (p1.hasNext()) {
                r05 or05 = p1.next();
                hashMap.put(or05.m, or05.n);
             }
             w51.h(i, "initialCapacity");
             p1 = new Object[i];
             Iterator iterator = p0.m().iterator();
             while (iterator.hasNext()) {
                ju2 oju2 = iterator.next();
                if ((ott2 = oju2.m().get("click")) != null) {
                   o05 z = o05.z;
                   o05 oo05 = r45.a(hashMap.get(ott2.b().q("uri"))).e(z);
                   if (c03.b.a.equals(oju2.q().c()) && oo05 != z) {
                      oju2 = oju2.a().j("entity:favoritesRow", oju2.q().d()).b("availability", oo05).g();
                   }
                }
                oju2.getClass();
                int i3 = i2 + 1;
                if (p1.length < i3) {
                   p1 = Arrays.copyOf(p1, do5.t(p1.length, i3));
                }
                p1[i2] = oju2;
                i2 = i3;
             }
             return p0.a().e(c.m(i2, p1)).g();
             break;
           case 8:
             return new u65(p0, p1);
           case 9:
             if ((p0.longValue() - (p1.a + p1.b)) >= 0) {
                i1 = false;
             }
             return Boolean.valueOf(i1);
             break;
           case 10:
             if ((p0.longValue() - (p1.a + p1.b)) >= 0) {
                i1 = false;
             }
             return Boolean.valueOf(i1);
             break;
           case 11:
             hashMap = new HashMap((p1.size() + p0.size()));
             hashMap.putAll(p0);
             hashMap.putAll(p1);
             return m73.b(hashMap);
           case 12:
             if (p0.intValue() == 200 || p1.intValue() == 200) {
                p0 = p1;
             }
             return p0;
             break;
           case 13:
             return p0;
           case 14:
             return p0;
           case 15:
             if (!p0.booleanValue() && !p1.booleanValue()) {
                i1 = false;
             }
             p0 = Boolean.valueOf(i1);
             break;
           case 16:
             if (!p0.booleanValue() && !p1.booleanValue()) {
                i1 = false;
             }
             return Boolean.valueOf(i1);
             break;
           case 17:
             return new u65(p0, p1);
           case 18:
             if (p0.booleanValue()) {
                p0 = ae0.t;
             }else if(p1.booleanValue()){
                p0 = ae0.v;
             }else {
                p0 = ae0.c;
             }
             return p0;
             break;
           case 19:
             return new u65(p0, p1);
           case 20:
             return Integer.valueOf((p1.intValue() + p0.intValue()));
           case 21:
             p0.getClass();
             i77 oi77 = new i77(p0);
             if (p0.a == null && !p1.booleanValue()) {
                i1 = false;
             }
             oi77.a = Boolean.valueOf(i1);
             return oi77.m();
             break;
           case 22:
             if (!p0.booleanValue() && p1.a == null) {
                i1 = false;
             }
             return Boolean.valueOf(i1);
             break;
           default:
             p1.getClass();
             if (!p1 instanceof ar6) {
                p0.getClass();
                if (!p0 instanceof ar6 || !p1 instanceof cr6) {
                label_0020 :
                   return p0;
                }
             }
             p0 = p1;
             goto label_0020 ;
       }
    }
    public jt c(Object p0){
       HashSet hashSet;
       d73 uod73;
       lr d;
       iv c;
       i oi;
       jt ojt;
       Object[] objArray1;
       int i = 2;
       int i1 = 1;
       int i2 = 0;
       switch (this.a){
           case 0:
             return oi.h(p0);
           case 1:
             ry7[] ory7Array = new ry7[i2];
             hashSet = vv7.p(ory7Array);
             if (p0.w != null) {
                hashSet.add(new wn7());
             }
             if (p0.t != null) {
                hashSet.add(new mn7());
             }
             if (p0.x != null) {
                hashSet.add(new sn7());
             }
             j a = p0.a;
             a.getClass();
             if (a instanceof br6) {
                hashSet.add(new qn7());
             }
             return new jt(p0, hashSet);
             break;
           case 2:
             uod73 = new d73();
             uod73.D0(new v56());
             if ((d = p0.d) != null && p0.b == null) {
                uod73.D0(new e66(d));
             }
             return new jt(p0, uod73.H0());
             break;
           case 3:
             uod73 = new d73();
             uod73.D0(new u56());
             if ((c = p0.c) != null && p0.b == null) {
                uod73.D0(new d66(c, i2));
             }
             return new jt(p0, uod73.H0());
             break;
           case 4:
             xj0[] oxj0Array = new xj0[i];
             oxj0Array[i2] = new sb5();
             oxj0Array[i1] = new xa5(new ra0());
             hashSet = vv7.p(oxj0Array);
             oi = p0;
             if (oi.A == null) {
                oi.getClass();
                p0 = new ad6(oi);
                p0.j = Boolean.TRUE;
                p0 = p0.a();
                hashSet.add(new cb5());
             }
             return new jt(p0, hashSet);
             break;
           case 5:
             p0.getClass();
             as uoas = new as(p0);
             uoas.k = Boolean.FALSE;
             Object[] objArray = new Object[7];
             objArray[0] = new ai1();
             p0 = p0.a;
             objArray[1] = new yh1(p0);
             objArray[2] = new xg1(p0);
             objArray[3] = new vg1(p0);
             objArray[4] = new wg1(p0);
             ah1 i3 = new ah1(p0);
             objArray[5] = i3;
             objArray[6] = new dh1();
             return new jt(uoas.b(), vv7.p(objArray));
           case 6:
             if (p0.w != null) {
                ojt = new jt(p0, Collections.emptySet());
             }else {
                i77 oi77 = new i77(p0);
                oi77.f = Boolean.TRUE;
                objArray1 = new Object[i1];
                objArray1[i2] = new lt3();
                ojt = new jt(oi77.j(), vv7.p(objArray1));
             }
             return ojt;
             break;
           case 7:
             objArray1 = new Object[i1];
             objArray1[i2] = new a97(p0.b, p0.d);
             return new jt(p0, vv7.p(objArray1));
           case 8:
             objArray1 = new Object[i1];
             objArray1[i2] = new jg6();
             return new jt(p0, vv7.p(objArray1));
           default:
             if (p0.a != null) {
                ojt = new jt(p0, Collections.emptySet());
             }else {
                pv opv = new pv(p0);
                opv.a = Boolean.TRUE;
                objArray1 = new Object[i1];
                objArray1[i2] = new sy1();
                ojt = new jt(opv.a(), vv7.p(objArray1));
             }
             return ojt;
       }
    }
    public ap0 d(hr0 p0){
       switch (this.a){
           case 0:
           default:
             return new ib4(2);
       }
       return new ib4(0);
    }
    public xt e(Object p0,Object p1){
       t10 ot10;
       int i = 28;
       int ml4 i1 = 27;
       int i2 = 26;
       int i3 = 25;
       int i4 = 11;
       int i5 = 8;
       int i6 = 7;
       int i7 = 6;
       int i8 = 5;
       int i9 = 4;
       int i10 = 3;
       kl4 int i11 = 2;
       int i12 = 1;
       int i13 = 0;
       switch (this.a){
           case 0:
             vv ovv = p0;
             return p1.a(new qx6(ovv, i13), new qx6(ovv, i8), new qx6(ovv, i7), new qx6(ovv, i6), new qx6(ovv, i5), new qx6(ovv, 9), new qx6(ovv, 10), new qx6(ovv, i4), new qx6(ovv, 12), new qx6(ovv, 13), new qx6(ovv, i12), new qx6(ovv, i11), new qx6(ovv, i10), new qx6(ovv, 4));
           case 1:
             j oj = p0;
             return p1.a(new to7(oj, i13), new to7(oj, i10), new to7(oj, i9), new to7(oj, i8), new to7(oj, i7), new to7(oj, i6), new to7(oj, i5), new to7(oj, 9), new to7(oj, 10), new to7(oj, i4), new j33(i4), new to7(oj, i11));
           case 2:
             zt ozt = p0;
             wk4 owk4 = new wk4(ozt, i13);
             wk4 owk41 = new wk4(ozt, i12);
             wk4 owk42 = new wk4(ozt, i11);
             wk4 owk43 = new wk4(ozt, i10);
             wk4 owk44 = new wk4(ozt, i9);
             return p1.a(owk4, owk41, owk42, owk43, owk44, new j33(14));
           case 3:
             cu uocu = p0;
             ml4 oml4 = i1;
             i1 = new ml4(uocu, i13);
             kl4 okl4 = i1;
             i11 = new kl4(20);
             ml4 oml41 = i11;
             i1 = new ml4(uocu, 18);
             ml4 oml42 = i1;
             i1 = new ml4(uocu, 21);
             kl4 okl41 = i1;
             i11 = new kl4(21);
             ml4 oml43 = i11;
             i1 = new ml4(uocu, 22);
             ml4 oml44 = i1;
             i1 = new ml4(uocu, 23);
             ml4 oml45 = i1;
             i1 = new ml4(uocu, 24);
             ml4 oml46 = i1;
             i1 = new ml4(uocu, i3);
             kl4 okl42 = i1;
             i11 = new kl4(22);
             ml4 oml47 = i11;
             i1 = new ml4(uocu, i12);
             ml4 oml48 = i1;
             i1 = new ml4(uocu, i11);
             kl4 okl43 = i1;
             i11 = new kl4(17);
             ml4 oml49 = i11;
             i1 = new ml4(uocu, i10);
             kl4 okl44 = i1;
             i11 = new kl4(18);
             ml4 oml410 = i11;
             i1 = new ml4(uocu, i9);
             kl4 okl45 = i1;
             i11 = new kl4(19);
             ml4 oml411 = i11;
             i1 = new ml4(uocu, i8);
             ml4 oml412 = i1;
             i1 = new ml4(uocu, i7);
             ml4 oml413 = i1;
             i1 = new ml4(uocu, i6);
             ml4 oml414 = i1;
             i1 = new ml4(uocu, i5);
             ml4 oml415 = i1;
             i1 = new ml4(uocu, 9);
             ml4 oml416 = i1;
             i1 = new ml4(uocu, 10);
             ml4 oml417 = i1;
             i1 = new ml4(uocu, i4);
             ml4 oml418 = i1;
             i1 = new ml4(uocu, 12);
             ml4 oml419 = i1;
             i1 = new ml4(uocu, 13);
             ml4 oml420 = i1;
             i1 = new ml4(uocu, 14);
             ml4 oml421 = i1;
             i1 = new ml4(uocu, 15);
             ml4 oml422 = i1;
             i1 = new ml4(uocu, 16);
             ml4 oml423 = i1;
             i1 = new ml4(uocu, 17);
             ml4 oml424 = i1;
             i1 = new ml4(uocu, 19);
             ml4 oml425 = i1;
             i1 = new ml4(uocu, 20);
             return p1.a(oml4, okl4, oml41, oml42, okl41, oml43, oml44, oml45, oml46, okl42, oml47, oml48, okl43, oml49, okl44, oml410, okl45, oml411, oml412, oml413, oml414, oml415, oml416, oml417, oml418, oml419, oml420, oml421, oml422, oml423, oml424, oml425);
           case 4:
             lr olr = p0;
             tm otm = new tm(olr, i13);
             tm otm1 = new tm(olr, i12);
             tm otm2 = new tm(olr, i11);
             tm otm3 = new tm(olr, i10);
             tm otm4 = new tm(olr, i9);
             tm otm5 = new tm(olr, i8);
             tm otm6 = new tm(olr, i7);
             tm otm7 = new tm(olr, i6);
             tm otm8 = new tm(olr, i5);
             return p1.a(otm, otm1, otm2, otm3, otm4, otm5, otm6, otm7, otm8, new kl4(23));
           case 5:
             iv oiv = p0;
             return p1.a(new z76(oiv, i13), new kl4(24), new z76(oiv, i11), new kl4(i3), new kl4(i2), new z76(oiv, i10), new z76(oiv, i9), new z76(oiv, i8), new kl4(i1), new kl4(i), new z76(oiv, i12));
           case 6:
             ot10 = p0;
             return p1.a(new s10(ot10, i13), new s10(ot10, i12), new s10(ot10, i11));
           case 7:
             return eb3.K(p0, p1);
           case 8:
             g og = p0;
             return p1.a(new u35(og, i13), new u35(og, i11), new u35(og, i10), new u35(og, i9), new u35(og, i8), new xc5(14), new xc5(15), new xc5(16), new u35(og, i7), new xc5(17), new xc5(13), new u35(og, i12));
           case 9:
             b uob = p0;
             cb0 uocb0 = new cb0(uob, i13);
             cb0 uocb01 = new cb0(uob, i12);
             cb0 uocb02 = new cb0(uob, i11);
             cb0 uocb03 = new cb0(uob, i10);
             return p1.a(uocb0, uocb01, uocb02, uocb03, new xc5(i4), new xc5(12));
           case 10:
             vt ovt = p0;
             j94 oj94 = new j94(ovt, i13);
             j94 oj941 = new j94(ovt, i12);
             j94 oj942 = new j94(ovt, i11);
             j94 oj943 = new j94(ovt, i10);
             j94 oj944 = new j94(ovt, i9);
             j94 oj945 = new j94(ovt, i8);
             j94 oj946 = new j94(ovt, i7);
             j94 oj947 = new j94(ovt, i6);
             j94 oj948 = new j94(ovt, i5);
             return p1.a(oj94, oj941, oj942, oj943, oj944, oj945, oj946, oj947, oj948, new xc5(i3));
           case 11:
             f uof = p0;
             nu3 onu3 = new nu3(uof, i13);
             nu3 onu31 = new nu3(uof, i12);
             nu3 onu32 = new nu3(uof, i11);
             nu3 onu33 = new nu3(uof, i10);
             nu3 onu34 = new nu3(uof, i9);
             nu3 onu35 = new nu3(uof, i8);
             nu3 onu36 = new nu3(uof, i7);
             nu3 onu37 = new nu3(uof, i6);
             nu3 onu38 = new nu3(uof, i5);
             return p1.a(onu3, onu31, onu32, onu33, onu34, onu35, onu36, onu37, onu38, new xc5(i1), new xc5(i2));
           case 12:
             bv uobv = p0;
             return p1.a(new fk5(uobv, i13), new fk5(uobv, i12), new fk5(uobv, i11), new fk5(uobv, i10), new fk5(uobv, i9), new fk5(uobv, i8), new fk5(uobv, i7));
           case 13:
             gw ogw = p0;
             r97 or97 = new r97(ogw, i13);
             r97 i14 = new r97(ogw, i12);
             r97 or971 = new r97(ogw, i11);
             return p1.a(or97, new xc5(i), i14, or971, new xc5(29), new s97(i13));
           case 14:
             ot10 = p0;
             return p1.a(new s10(ot10, i13), new s10(ot10, i12), new s10(ot10, i11));
           case 15:
             hu ohu = p0;
             return p1.a(new d85(ohu, i13), new d85(ohu, i12), new d85(ohu, i11));
           case 16:
             ws ows = p0;
             return p1.a(new ni1(ows, i13), new ni1(ows, i12), new ni1(ows, i11));
           case 17:
             return eb3.K(p0, p1);
           default:
             d uod = p0;
             return p1.a(new jz1(uod, i13), new s97(i6), new s97(i5), new jz1(uod, i12), new jz1(uod, i11), new jz1(uod, i10));
       }
    }
    public Object get(){
       switch (this.a){
           case 0:
             return new SchedulerWorkRunner(s36.c);
           case 1:
             return new SchedulerWorkRunner(s36.b);
           case 2:
             return new SchedulerWorkRunner(s36.c);
           default:
             return new SchedulerWorkRunner(s36.b);
       }
    }
    public Object h(RecyclerView p0){
       return LayoutInflater.from(p0.getContext()).inflate(this.a, p0, false);
    }
    public boolean test(Object p0){
       int i = 0;
       int i1 = 1;
       switch (this.a){
           case 0:
             return DeferUntilConnected.d(p0);
           case 1:
             return p0.connected();
           case 2:
             return p0.booleanValue();
           case 3:
             return p0.a(new j33(i), new j33(i1), new j33(2), new j33(3), new j33(4), new j33(5), new j33(6)).booleanValue();
           case 4:
             return do5.K(p0);
           case 5:
             if (p0 instanceof mz6 || p0 instanceof lz6) {
                i = true;
             }
             return i;
             break;
           case 6:
             return p0 instanceof IOException;
           case 7:
             return p0 instanceof IOException;
           case 8:
             return p0 instanceof IOException;
           case 9:
             return p0.l;
           case 10:
             return (p0.isOffline() ^ i1);
           case 11:
             if (!p0 instanceof IOException) {
                jl.f("Error during bootstrap", p0);
             }
             return i1;
             break;
           case 12:
             return p0.booleanValue();
           case 13:
             jl.f("Install referrer error", p0);
             return i1;
           case 14:
             p0.getClass();
             return p0 instanceof vu2;
           case 15:
             p0.getClass();
             return p0 instanceof av2;
           case 16:
             p0.getClass();
             return p0 instanceof vu2;
           case 17:
             p0.getClass();
             return p0 instanceof wu2;
           case 18:
             return (p0 instanceof SQLiteException ^ i1);
           case 19:
             return (p0 instanceof SQLiteException ^ i1);
           case 20:
             return (p0 instanceof SQLiteException ^ i1);
           case 21:
             return (p0 instanceof SQLiteException ^ i1);
           case 22:
             return (p0 instanceof SQLiteException ^ i1);
           case 23:
             return (p0 instanceof SQLiteException ^ i1);
           case 24:
             return (p0 instanceof SQLiteException ^ i1);
           case 25:
             return p0.c();
           case 26:
             if (p0.c != null) {
                i = true;
             }
             return i;
             break;
           case 27:
             p0.getClass();
             return p0 instanceof av2;
           default:
             p0.getClass();
             return p0 instanceof vu2;
       }
    }
}
