package p.gf6;
import p.ez;
import android.content.Context;
import p.zg0;
import p.uf1;
import p.vt;
import java.lang.Object;
import p.r45;
import p.au2;
import p.jv;
import java.lang.String;
import p.aq6;
import p.zt2;
import p.ty0;
import p.a23;
import p.a43;
import p.lv;
import p.sp6;
import p.ju2;
import java.util.List;
import p.xm0;
import p.te5;
import p.iu2;
import p.su2;
import p.k23;
import p.ys5;
import java.util.ArrayList;
import java.util.Iterator;
import p.bt;
import p.zs;
import p.at;
import java.util.Calendar;
import p.p94;
import android.content.res.Resources;
import com.spotify.hubs.liteintegration.util.PodcastUtil;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import p.tt2;
import p.vv7;
import p.st2;
import p.n13;
import p.ox7;
import p.l03;
import p.h13;
import p.jl6;

public final class gf6 extends ez	// class@0016fb from classes.dex
{
    public final Context a;
    public final zg0 b;
    public final uf1 c;

    public void gf6(Context p0,zg0 p1,uf1 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final au2 a(vt p0,Object p1,r45 p2){
       String str = p0.a.toString();
       return ty0.b().r("context_uri", str).r("share_uri", str).d();
    }
    public final a43 b(vt p0,Object p1,r45 p2,a43 p3){
       Iterator iterator1;
       gf6 ogf61;
       String str1;
       ArrayList uArrayList1;
       gf6 ogf6 = this;
       vt ovt = p0;
       jv ojv = p1;
       jv a = ojv.a;
       int i = 0;
       ju2[] oju2Array = new ju2[i];
       a43 uoa43 = p3.i(xm0.b(a.c, a.e, sp6.b0, ojv.b, oju2Array));
       lv d = a.d;
       String str = "row";
       if (!te5.a(d)) {
          ju2[] oju2Array1 = new ju2[]{ty0.k().o("description").j("podcast:description", str).s(ty0.z().b(d)).g()};
          uoa43 = uoa43.b(oju2Array1);
       }
       List list = p2.e(ys5.v);
       if (!list.isEmpty()) {
          gf6 b = ogf6.b;
          gf6 c = ogf6.c;
          ArrayList uArrayList = new ArrayList(list.size());
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             bt uobt = iterator.next();
             bt b1 = uobt.b;
             if (r45.a(uobt.d).c()) {
                Object obj = r45.a(uobt.d).b();
                at uoat = r45.a(uobt.e).e(xm0.a);
                at c1 = uoat.c;
                at b2 = uoat.b;
                if (obj.i != null) {
                   Calendar uCalendar = p94.f(b, obj.g);
                   iu2 oiu2 = ty0.k().o(b1).j("podcast:card", str);
                   su2 osu2 = ty0.z().d(obj.d).a(obj.e);
                   Resources resources = ogf6.a.getResources();
                   zs h = obj.h;
                   int i1 = (uCalendar == null)? 0: uCalendar.getTimeInMillis();
                   at uoat1 = b2;
                   iterator1 = iterator;
                   tt2 obj1 = obj;
                   at uoat2 = c1;
                   ogf61 = b;
                   uobt = b1;
                   str1 = str;
                   uArrayList1 = uArrayList;
                   zs b3 = obj1.b;
                   zs j = obj1.j;
                   obj1 = vv7.C(b3);
                   iu2 oiu21 = oiu2.s(osu2.c(PodcastUtil.formatDateAndListeningProgressStatus(b, c, resources, h, i1, uoat2, uoat1))).f("uri", b3).f("episode-fully-played", Boolean.valueOf(uoat2)).f("episode-listening-progress", Integer.valueOf(uoat1)).f("episode-duration", Integer.valueOf(obj1.h)).e("playClick", xm0.d(ovt, j, uobt)).e("pauseClick", vv7.R(p0).a().a("action", "PAUSE").b()).e("contextMenuClick", ty0.j().d("contextmenu").c(ox7.d(ovt.a, obj1, false)).b()).e("click", obj1);
                   String str2 = (j != null)? "explicit": null;
                   uArrayList1.add(oiu21.b("label", str2).c(l03.a(xm0.e(ovt, j))).c(h13.c(uobt)).g());
                }else {
                   iterator1 = iterator;
                   ogf61 = b;
                   str1 = str;
                   uArrayList1 = uArrayList;
                   b2 = 0;
                }
             }else {
                iterator1 = iterator;
                ogf61 = b;
                str1 = str;
                uArrayList1 = uArrayList;
                uArrayList1.add(jl6.a(b1, "skeleton:"));
             }
             ogf6 = this;
             iterator = iterator1;
             uArrayList = uArrayList1;
             b = ogf61;
             str = str1;
          }
          uoa43 = uoa43.a(uArrayList);
       }else if(p0.a()){
          uoa43 = uoa43.a(jl6.c);
       }
       return uoa43;
    }
}
