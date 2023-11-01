package p.ch5;
import p.cz;
import android.content.Context;
import p.km3;
import java.lang.Object;
import java.lang.String;
import p.xu;
import java.util.List;
import p.lt;
import p.xm0;
import p.zu;
import p.vt;
import java.util.LinkedList;
import java.util.Objects;
import p.ao3;
import p.mp;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import p.ab0;
import p.bi5;
import io.reactivex.rxjava3.core.Maybe;
import p.l94;
import java.lang.Class;
import p.k34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.yf2;
import p.s36;
import p.t34;
import io.reactivex.rxjava3.core.Scheduler;
import p.p20;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.iw;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.r70;
import java.lang.StringBuilder;
import p.ju2;
import java.util.ArrayList;
import java.util.Iterator;
import p.aw;
import p.r45;
import p.c03;
import p.zv;
import p.su2;
import p.ty0;
import p.aq6;
import p.yp6;
import p.iu2;
import p.fu2;
import java.io.Serializable;
import p.gu2;
import p.i13;
import p.sp6;
import java.lang.Enum;
import p.g23;
import p.hu2;
import p.fz2;
import p.au2;
import p.do5;
import p.l03;
import p.h13;
import p.k23;
import p.zs;
import p.tt2;
import p.vv7;
import p.jl6;
import java.util.Collection;

public final class ch5 extends cz	// class@00120a from classes.dex
{
    public final km3 c;

    public void ch5(Context p0,km3 p1){
       super(p0, false);
       this.c = p1;
    }
    public final String c(Object p0){
       p0 = ((p0 = xm0.c(p0.c)) == null)? null: p0.a;
       return p0;
    }
    public final String d(Context p0,String p1){
       return p0.getString(R.string.component_shuffled_track_playlist_description);
    }
    public final String e(Context p0,Object p1){
       return p1.a.c;
    }
    public final List f(Context p0,vt p1,Object p2,List p3){
       iu2 oiu2;
       int i;
       int i1;
       LinkedList linkedList = new LinkedList();
       km3 a = this.c.a;
       Objects.requireNonNull(a);
       Maybe maybe = Single.fromCallable(new ao3(a, 3)).filter(new ab0(25));
       maybe.getClass();
       k34 ok34 = new k34(maybe, new l94(14), 1);
       Scheduler c = s36.c;
       Objects.requireNonNull(c, "scheduler is null");
       t34 ot34 = new t34(ok34, c, 1);
       p20 c1 = new p20();
       ot34.subscribe(c1);
       if (TextUtils.equals(p2.b.b, c1.a())) {
          linkedList.add(r70.c(R.string.entity_button_edit, p0, "spotify:internal:edit-playlist:"+p1.a));
       }
       ArrayList uArrayList = new ArrayList(p3.size());
       p2 = p3.iterator();
       while (p2.hasNext()) {
          aw uoaw = p2.next();
          gz2 b = c03.b;
          String str = "explicit";
          String str1 = "uri";
          aw b1 = uoaw.b;
          if (uoaw.d().c()) {
             if (uoaw.a.startsWith("spotify:local:")) {
                zv ozv = uoaw.d().b();
                su2 osu2 = ty0.z().d(ozv.d);
                osu2 = (p1.a.b == yp6.b)? osu2.a(ozv.i): osu2.a(ozv.k);
                oiu2 = ty0.k().o(b1).k(b).f(str1, ozv.b).s(osu2).q(ty0.o().c(ty0.n().e(sp6.o0)).a());
                au2 a1 = (i = ozv.f ^ 1)? fz2.a: fz2.b;
                oiu2 = oiu2.c(a1).c(do5.n0(sp6.G));
                if ((ozv = ozv.e) == null) {
                   str = null;
                }
                uArrayList.add(oiu2.b("label", str).c(l03.a(xm0.e(p1, ozv))).c(h13.c(b1)).g());
             }else {
                uArrayList.add(xm0.h(p1, uoaw.d().b(), b1));
             }
          }else if(uoaw.c().c()){
             zs ozs = uoaw.c().b();
             if (ozs.i != null) {
                zs b2 = ozs.b;
                oiu2 = ty0.k().o(b1).k(b).f(str1, b2).s(ty0.z().d(ozs.d).a(ozs.f)).q(ty0.o().c(ty0.n().e(sp6.b0)).a());
                au2 a2 = (i1 = ozs.i ^ 1)? fz2.a: fz2.b;
                oiu2 = oiu2.c(a2).c(do5.n0(sp6.G)).e("rightAccessoryClick", vv7.C(b2)).e("click", vv7.C(b2));
                if ((ozs = ozs.j) == null) {
                   str = null;
                }
                uArrayList.add(oiu2.b("label", str).c(l03.a(xm0.e(p1, ozs))).c(h13.c(b1)).g());
             }
          }else {
             uArrayList.add(jl6.a(b1, "skeleton:trackRow"));
          }
       }
       linkedList.addAll(uArrayList);
       return linkedList;
    }
}
