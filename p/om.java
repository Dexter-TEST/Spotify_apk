package p.om;
import p.yf2;
import p.wm;
import java.lang.Object;
import p.v56;
import io.reactivex.rxjava3.core.Observable;
import p.np3;
import p.a66;
import java.lang.Class;
import p.g16;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.f66;
import p.ja3;
import java.lang.Runnable;
import p.x56;
import p.t56;
import p.rk0;
import p.r45;
import p.e66;
import java.lang.String;
import p.ox7;
import p.od;
import p.co5;
import android.content.res.Resources;
import android.content.Context;
import android.content.res.Configuration;
import p.br3;
import p.is7;
import java.util.Locale;
import p.dt5;
import p.m73;
import p.pe0;
import java.nio.charset.Charset;
import p.zl;
import p.vi7;
import java.io.Serializable;
import p.b90;
import p.d90;
import p.vm;
import p.q56;
import p.zg5;
import p.h66;
import p.pl0;
import io.reactivex.rxjava3.core.Single;
import p.c66;
import p.mq5;
import p.jk0;
import p.c76;
import java.util.List;
import com.google.common.collect.c;
import p.d73;
import p.iu2;
import p.ty0;
import p.x03;
import p.fu2;
import p.su2;
import p.k23;
import p.a73;
import java.util.Iterator;
import p.aq6;
import p.td7;
import p.yp6;
import java.lang.Enum;
import p.sp6;
import p.gu2;
import p.i13;
import p.ez2;
import p.au2;
import p.g23;
import p.c03;
import p.hu2;
import java.lang.Boolean;
import p.st2;
import p.do5;
import p.a43;
import p.ys5;
import p.z23;
import p.r66;
import p.b43;

public final class om implements yf2	// class@002150 from classes.dex
{
    public final int a;
    public final wm b;

    public void om(wm p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       od t;
       String str2;
       aq6 uoaq6;
       int i;
       b43 uob431;
       g23 og23;
       String str = "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication";
       om tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return Completable.i(new g16(tb, 13, p0));
           case 1:
             tb.getClass();
             return tb.x.c(p0.m).m();
           case 2:
             tb.getClass();
             p0 = p0.n;
             return tb.w.a(p0.m, p0).t(new h66(p0, true)).onErrorReturnItem(new h66(p0, false));
           case 3:
             tb.getClass();
             t = tb.t;
             co5.j(t, str);
             return d90.a(new zl(tb, ox7.c(p0.m, pe0.b), m73.i("locale", ox7.j(), "catalogue", "free", "country", is7.p(t.getResources().getConfiguration()).c(false).getCountry()), 3)).map(new vm(p0, false)).onErrorReturn(new vm(p0, true));
           case 4:
             tb.getClass();
             return Completable.j(new ja3(tb, 7, p0));
           case 5:
             return tb.x.a();
           case 6:
             tb.getClass();
             return Completable.j(new ja3(tb, 8, p0));
           case 7:
             tb.getClass();
             return Completable.j(new ja3(tb, 9, p0));
           case 8:
             tb.getClass();
             return Completable.i(new g16(tb, 14, p0));
           case 9:
             return tb.x.b().map(new om(tb, 10));
           default:
             t = tb.t;
             co5.j(t, str);
             String str1 = t.getString(R.string.assisted_curation_search_recent_searches);
             od t1 = tb.t;
             co5.j(t1, str);
             str = t1.getString(R.string.assisted_curation_search_delete_recent_searches);
             b43 uob43 = null;
             if (!p0.isEmpty()) {
                d73 uod73 = new d73();
                uod73.D0(ty0.k().k(x03.b).o("recent-searches-header").s(ty0.z().d(str1)).g());
                p0 = p0.iterator();
                while (true) {
                   str2 = "click";
                   if (p0.hasNext()) {
                      mq5 omq5 = p0.next();
                      if ((uoaq6 = td7.d(omq5.c)) != null) {
                         yp6 w = yp6.w;
                         if ((uoaq6 = uoaq6.b) != w && (uoaq6 != yp6.t && uoaq6 != yp6.b)) {
                            continue ;
                         }else {
                            mq5 d = omq5.d;
                            if ((i = uoaq6.ordinal()) != 1) {
                               if (i != 3) {
                                  uob431 = (i != 5)? uob43: sp6.o0;
                               }else {
                                  uob431 = sp6.x;
                               }
                            }else {
                               uob431 = sp6.z;
                            }
                            w = (uoaq6 == w)? 1: 0;
                            if (d == null && uob431 == null) {
                               og23 = uob43;
                            }else {
                               gu2 ogu2 = ty0.o();
                               i13 oi13 = ty0.n().g(d);
                               ez2 a = (uoaq6 == yp6.b)? ez2.c.a: uob43;
                               og23 = ogu2.c(oi13.d(a).e(uob431)).a();
                            }
                            iu2 oiu2 = ty0.k().o(String.valueOf(omq5.a)).k(c03.b).q(og23).s(ty0.z().d(omq5.e).a(omq5.f)).b("label", omq5.g).b("recentSearch:omit", Boolean.TRUE);
                            st2 ost2 = ty0.j();
                            String str3 = (w)? "addToPlaylist": "navigate";
                            iu2 oiu21 = oiu2.d(str2, ost2.d(str3).a("uri", omq5.c));
                            if (w) {
                               oiu21 = oiu21.c(do5.n0(sp6.a0));
                            }
                            uod73.D0(oiu21.g());
                         }
                      }
                   }else {
                      break ;
                   }
                }
                uod73.D0(ty0.k().k(c03.v).s(ty0.z().d(str)).d(str2, ty0.j().d("deleteAll")).g());
                uob43 = ty0.B().j("recent-searches-page").e(uod73.I0()).g();
             }
             return new r66(uob43);
       }
    }
}
