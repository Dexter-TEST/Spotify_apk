package p.xm0;
import p.qo5;
import p.at;
import java.lang.String;
import java.util.List;
import p.vf;
import p.xe3;
import java.lang.Iterable;
import p.ab2;
import p.pq5;
import p.jg2;
import p.sp6;
import p.ju2;
import p.iu2;
import p.ty0;
import p.ry2;
import p.fu2;
import p.i13;
import java.lang.Enum;
import p.lt;
import p.ez2;
import p.au2;
import p.gu2;
import p.s23;
import p.j13;
import p.g23;
import p.hu2;
import p.su2;
import java.lang.Object;
import java.util.Arrays;
import p.hi5;
import p.ci5;
import com.google.common.collect.c;
import p.k23;
import p.ry7;
import p.mb2;
import p.ys5;
import p.vt;
import p.tt2;
import p.st2;
import p.n13;
import p.aq6;
import java.lang.Boolean;
import p.r45;
import p.vv7;
import android.content.Context;
import java.lang.Math;
import p.w51;
import p.yp6;
import p.bw;
import p.zv;
import p.zt2;
import p.a23;
import java.lang.Class;
import p.do5;
import java.util.AbstractCollection;
import java.util.Collections;
import com.google.common.collect.b;
import p.qx2;
import p.co5;
import java.lang.StringBuilder;
import p.c03;
import java.io.Serializable;
import p.fz2;
import p.l03;
import p.h13;
import java.util.ArrayList;
import java.util.Iterator;
import p.jl6;
import p.ox7;

public abstract class xm0	// class@002ca3 from classes.dex
{
    public static final at a;

    static {
       qo5 oqo5 = at.a();
       oqo5.d("");
       oqo5.i(0);
       oqo5.f(0);
       xm0.a = oqo5.c();
    }
    public static String a(List p0){
       return new xe3(new vf(", "), new vf(", ")).r(ab2.b(p0).m(new pq5(4)));
    }
    public static ju2 b(String p0,String p1,sp6 p2,List p3,ju2[] p4){
       lt olt;
       iu2 oiu2 = ty0.k().o("header").k(ry2.v);
       i13 oi13 = ty0.n().e(p2);
       if ((olt = xm0.c(p3)) != null) {
          oi13 = oi13.g(olt.a);
       }
       if (p2 == sp6.z) {
          oi13 = oi13.b(ez2.c.a);
       }
       return oiu2.q(ty0.o().d(oi13.c()).a()).s(ty0.z().d(p0).a(p1)).h(ab2.b(Arrays.asList(p4)).a(hi5.a).d()).g();
    }
    public static lt c(List p0){
       if (p0.isEmpty()) {
          return null;
       }
       if (p0.size() <= 2) {
          return p0.get(0);
       }
       ys5 oys5 = ab2.b(p0).l(ry7.D);
       return oys5.get((oys5.t / 2));
    }
    public static tt2 d(vt p0,boolean p1,String p2){
       n13 on13 = (xm0.e(p0, p1))? ty0.j().d("disallowedExplicitContentClick").b(): vv7.F(p0.a.toString(), null, p0.g.e(Boolean.FALSE).booleanValue(), p2);
       return on13;
    }
    public static boolean e(vt p0,boolean p1){
       boolean b = (p0.f.e(Boolean.FALSE).booleanValue() && p1)? true: false;
       return b;
    }
    public static List f(Context p0,aq6 p1,List p2){
       int i = Math.min(p2.size(), 30);
       w51.h(4, "initialCapacity");
       Object[] objArray = new Object[4];
       int i1 = 0;
       int i2 = (p1.b != yp6.b)? 1: 0;
       int i3 = 0;
       while (i1 < i) {
          bw uobw = p2.get(i1);
          if (uobw.c().c()) {
             zv ozv = uobw.c().b();
             if (ozv.f != null) {
                zt2 ozt2 = ty0.b().r("trackName", ozv.d);
                if (i2) {
                   ozt2 = ozt2.r("artistName", ozv.k);
                }
                a23 uoa23 = ozt2.d();
                uoa23.getClass();
                int i4 = i3 + 1;
                if (objArray.length < i4) {
                   objArray = Arrays.copyOf(objArray, do5.t(objArray.length, i4));
                }
                objArray[i3] = uoa23;
                i3 = i4;
             }
          }
          i1 = i1 + 1;
       }
       return xm0.g(p0, p1, c.m(i3, objArray));
    }
    public static List g(Context p0,aq6 p1,ys5 p2){
       if (p2.isEmpty()) {
          return Collections.emptyList();
       }
       au2[] uoau2Array = new au2[false];
       zt2 ozt2 = ty0.b().l(4, "maxLines").b("showArtists", true).b("shuffle", false).r("ellipsis", p0.getString(R.string.entity_track_cloud_ellipsis)).f("tracks", p2.toArray(uoau2Array));
       iu2 oiu2 = ty0.k().o("trackcloud").k(qx2.b);
       oiu2.getClass();
       co5.o(ozt2, "custom");
       iu2 oiu21 = oiu2.l(ozt2.d());
       return c.r(oiu21.e("click", vv7.C("spotify:internal:tracks-list:"+p1)).g());
    }
    public static ju2 h(vt p0,zv p1,String p2){
       su2 osu2 = ty0.z().d(p1.d);
       osu2 = (p0.a.b == yp6.b)? osu2.a(p1.i): osu2.a(p1.k);
       zv b = p1.b;
       iu2 oiu2 = ty0.k().o(p2).k(c03.b).f("uri", b).s(osu2).q(ty0.o().c(ty0.n().e(sp6.o0)).a());
       au2 a = ((p1.f ^ 0x01))? fz2.a: fz2.b;
       oiu2 = oiu2.c(a).c(do5.n0(sp6.G)).e("rightAccessoryClick", vv7.C(b)).e("click", vv7.C(b));
       String str = ((p1 = p1.e) != null)? "explicit": null;
       return oiu2.b("label", str).c(l03.a(xm0.e(p0, p1))).c(h13.c(p2)).g();
    }
    public static ArrayList i(vt p0,List p1){
       ArrayList uArrayList = new ArrayList(p1.size());
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          bw uobw = iterator.next();
          bw b = uobw.b;
          if (uobw.c().c()) {
             uArrayList.add(xm0.h(p0, uobw.c().b(), b));
          }else {
             uArrayList.add(jl6.a(b, "skeleton:trackRow"));
          }
       }
       return uArrayList;
    }
    public static ju2 j(vt p0,zv p1,String p2,boolean p3){
       su2 osu2 = ty0.z().d(p1.d);
       osu2 = (p0.a.b == yp6.b)? osu2.a(p1.i): osu2.a(p1.k);
       p1 = p1.e;
       iu2 oiu2 = ty0.k().o(p2).k(c03.b).f("uri", p1.b).s(osu2).e("rightAccessoryClick", ty0.j().d("contextmenu").c(ox7.L(p0, p1, p3)).b()).e("click", xm0.d(p0, p1, p2));
       String str = (p1 != null)? "explicit": null;
       return oiu2.b("label", str).c(l03.a(xm0.e(p0, p1))).c(h13.c(p2)).g();
    }
    public static ArrayList k(vt p0,List p1){
       ArrayList uArrayList = new ArrayList(p1.size());
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          bw uobw = iterator.next();
          bw b = uobw.b;
          if (uobw.c().c()) {
             zv ozv = uobw.c().b();
             if (ozv.f != null) {
                uArrayList.add(xm0.j(p0, ozv, b, false));
             }
          }else {
             uArrayList.add(jl6.a(b, "skeleton:trackRow"));
          }
       }
       return uArrayList;
    }
}
