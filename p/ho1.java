package p.ho1;
import p.ez;
import p.qo5;
import p.at;
import java.lang.String;
import android.content.Context;
import p.zg0;
import p.uf1;
import p.vt;
import java.lang.Object;
import p.r45;
import p.au2;
import p.xs;
import p.aq6;
import p.zs;
import p.ox7;
import p.a43;
import java.util.Calendar;
import p.p94;
import p.lv;
import java.lang.Boolean;
import p.st2;
import p.ty0;
import p.n13;
import p.tt2;
import p.ju2;
import p.r70;
import p.pe0;
import p.w51;
import p.m74;
import java.lang.CharSequence;
import java.nio.charset.Charset;
import p.fo2;
import p.vv7;
import p.sp6;
import java.util.List;
import p.xm0;
import p.iu2;
import p.su2;
import android.content.res.Resources;
import com.spotify.hubs.liteintegration.util.PodcastUtil;
import java.io.Serializable;
import java.lang.Integer;
import p.k23;
import p.c03;
import p.fu2;
import p.do5;

public final class ho1 extends ez	// class@00188d from classes.dex
{
    public final Context a;
    public final zg0 b;
    public final uf1 c;
    public static final at d;

    static {
       qo5 oqo5 = at.a();
       oqo5.d("");
       oqo5.i(0);
       oqo5.f(0);
       ho1.d = oqo5.c();
    }
    public void ho1(Context p0,zg0 p1,uf1 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final au2 a(vt p0,Object p1,r45 p2){
       return ox7.d(p0.a, p1.a, false);
    }
    public final a43 b(vt p0,Object p1,r45 p2,a43 p3){
       lv olv;
       ju2 oju2;
       zs h;
       xs a = p1.a;
       ho1 tb = this.b;
       Calendar uCalendar = p94.f(tb, a.g);
       zs f = ((olv = r45.a(p1.c).f()) == null)? a.f: olv.c;
       Boolean fALSE = Boolean.FALSE;
       int i = 0;
       int i1 = 0x7f12012a;
       ho1 ta = this.a;
       zs c = a.c;
       if (p0.f.e(fALSE).booleanValue() && a.j != null) {
          oju2 = r70.a(ta.getString(i1), ty0.j().d("disallowedExplicitContentClick").b());
       }else {
          h = a.b;
          oju2 = r70.a(ta.getString(i1), vv7.F(c, h, p0.g.e(fALSE).booleanValue(), p94.b.b().K(h, pe0.a).B().toString().substring(i, 20)));
       }
       at uoat = r45.a(p1.b).e(ho1.d);
       ju2[] oju2Array = new ju2[]{oju2};
       a43 uoa43 = p3.i(xm0.b(a.d, f, sp6.b0, p1.d, oju2Array));
       p1 = new ju2[4];
       p1[0] = r70.a;
       iu2 oiu2 = ty0.k().o("0").j("podcast:metadataEpisode", "row");
       su2 osu2 = ty0.z().d(f);
       String str = (uCalendar == null)? null: PodcastUtil.formatReleaseDate(ta.getResources(), tb, uCalendar.getTimeInMillis());
       h = a.h;
       at b = uoat.b;
       p1[1] = oiu2.s(osu2.a(str).b(PodcastUtil.formatListeningProgressStatus(this.c, ta.getResources(), h, uoat.c, b))).f("episode-fully-played", Boolean.valueOf(uoat.c)).f("episode-listening-progress", Integer.valueOf(b)).f("episode-duration", Integer.valueOf(h)).g();
       p1[2] = ty0.k().o("1").j("podcast:description", "row").s(ty0.z().b(a.e)).g();
       p1[3] = ty0.k().o("2").k(c03.c).s(ty0.z().d(ta.getString(R.string.podcast_see_all))).l(do5.n0(sp6.G)).e("click", vv7.C(c)).g();
       return uoa43.f(p1);
    }
}
