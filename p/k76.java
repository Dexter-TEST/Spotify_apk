package p.k76;
import p.yf2;
import p.w86;
import java.lang.Object;
import p.d66;
import java.lang.Class;
import p.g96;
import p.al5;
import p.t00;
import p.sv;
import java.util.HashMap;
import android.content.Context;
import java.lang.String;
import p.ox7;
import p.lv1;
import p.fm;
import java.io.Serializable;
import p.b90;
import io.reactivex.rxjava3.core.Observable;
import p.d90;
import p.c16;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.d16;
import p.u56;
import p.np3;
import p.z56;
import p.g16;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.s56;
import p.rk0;
import p.b66;
import p.mq5;
import p.y56;
import p.b76;
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
import java.lang.Enum;
import p.sp6;
import p.gu2;
import p.i13;
import p.yp6;
import p.ez2;
import p.au2;
import p.g23;
import p.c03;
import p.do5;
import java.lang.Boolean;
import p.st2;
import p.hu2;
import p.a43;
import p.ys5;
import p.z23;
import p.q66;
import p.b43;

public final class k76 implements yf2	// class@001bbe from classes.dex
{
    public final int a;
    public final w86 b;

    public void k76(w86 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       String str1;
       mq5 c2;
       b43 uob431;
       g23 og23;
       int i3;
       int i = 9;
       int i1 = 5;
       k76 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return Completable.i(new g16(tb, 17, p0));
           case 1:
             tb.getClass();
             return Completable.i(new g16(tb, 19, p0));
           case 2:
             tb.getClass();
             return tb.v.c(p0.H);
           case 3:
             return tb.v.a();
           case 4:
             tb.getClass();
             return Completable.i(new g16(tb, 18, p0));
           case 5:
             return tb.v.b().map(new k76(tb, 7));
           case 6:
             tb.getClass();
             d66 h = p0.H;
             d66 i2 = p0.I;
             p0 = tb.t;
             g96 c = p0.c;
             sv osv = c.c.c();
             osv.getClass();
             HashMap hashMap = new HashMap(i1);
             hashMap.put("platform", "android");
             hashMap.put("locale", ox7.k(p0.a));
             hashMap.put("catalogue", osv.d);
             hashMap.put("country", osv.c);
             sv osv1 = c.c.c();
             osv1.getClass();
             if (osv1.f != null) {
                hashMap.put("entityVersion", "6");
             }
             String str = lv1.l(h);
             fm c1 = new fm(p0, str, hashMap, i2, 1);
             return d90.a(c).map(new c16(14, p0, h)).compose(p0.d).map(new d16(str, 8)).onErrorReturn(new d16(h, i));
             break;
           default:
             tb.getClass();
             b43 uob43 = null;
             if (!p0.isEmpty()) {
                d73 uod73 = new d73();
                uod73.D0(ty0.k().k(x03.b).o("recent-searches-header").s(ty0.z().d(tb.w)).g());
                p0 = p0.iterator();
                while (true) {
                   str1 = "click";
                   if (p0.hasNext()) {
                      mq5 omq5 = p0.next();
                      if ((c2 = omq5.c) == null) {
                         continue ;
                      }else {
                         aq6 uoaq6 = td7.d(c2);
                         mq5 d = omq5.d;
                         if (uoaq6 == null) {
                         label_016f :
                            uob431 = uob43;
                         }else if((i3 = uoaq6.b.ordinal()) != 1){
                            if (i3 != 3) {
                               if (i3 != i1) {
                                  if (i3 != 16) {
                                     if (i3 != i && i3 != 10) {
                                        goto label_016f ;
                                     }else {
                                        uob431 = sp6.Z;
                                     }
                                  }else {
                                     uob431 = sp6.p0;
                                  }
                               }else {
                                  uob431 = sp6.o0;
                               }
                            }else {
                               uob431 = sp6.x;
                            }
                         }else {
                            uob431 = sp6.z;
                         }
                         if (d == null && uob431 == null) {
                            og23 = uob43;
                         }else {
                            gu2 ogu2 = ty0.o();
                            i13 oi13 = ty0.n().g(d);
                            b43 uob432 = (uoaq6 == null)? uob43: uoaq6.b;
                            ez2 a = (uob432 != null && (uob432 == yp6.b && uob432 != yp6.G))? ez2.c.a: uob43;
                            og23 = ogu2.c(oi13.d(a).e(uob431)).a();
                         }
                         String str2 = "uri";
                         uod73.D0(ty0.k().o(String.valueOf(omq5.a)).k(c03.b).s(ty0.z().d(omq5.e).a(omq5.f)).b("label", omq5.g).c(do5.n0(sp6.q0)).b("recentSearch:omit", Boolean.TRUE).d(str1, ty0.j().d("navigate").a(str2, c2)).d("rightAccessoryClick", ty0.j().d("delete").a(str2, omq5.c)).q(og23).g());
                      }
                   }else {
                      break ;
                   }
                }
                uod73.D0(ty0.k().k(c03.v).s(ty0.z().d(tb.x)).d(str1, ty0.j().d("deleteAll")).g());
                uob43 = ty0.B().j("recent-searches-page").e(uod73.I0()).g();
             }
             return new q66(uob43);
       }
    }
}
