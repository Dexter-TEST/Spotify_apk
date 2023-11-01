package p.qx6;
import p.qg2;
import p.vv;
import java.lang.Object;
import p.pt1;
import java.lang.Class;
import p.ad6;
import p.rh1;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import p.vv7;
import p.xt;
import p.co5;
import p.qt1;
import p.jj5;
import p.qh1;
import com.spotify.webapi.service.models.ShowSimple;
import p.nt1;
import p.ph1;
import com.spotify.webapi.service.models.Playlist;
import p.bt1;
import p.eo5;
import p.nh1;
import java.util.Map;
import p.r45;
import p.aq6;
import p.yp6;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MetadataItem;
import com.spotify.metadata.proto.Metadata$Episode;
import com.spotify.metadata.proto.Metadata$Show;
import p.i80;
import p.p94;
import p.bh1;
import java.lang.String;
import p.ct1;
import java.util.Collection;
import com.google.common.collect.d;
import p.ap5;
import p.mc6;
import java.lang.NullPointerException;
import java.util.Iterator;
import p.fh1;
import p.zg1;
import p.mt1;
import java.lang.Boolean;
import p.oi;
import p.jt1;
import p.oh1;
import p.ks0;
import p.lt1;
import p.ft1;
import p.jt;
import p.at1;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.jl;
import p.xs1;
import java.io.IOException;
import com.spotify.base.java.logging.Logger;
import p.bs2;
import p.dt1;
import p.ut;
import p.kt1;
import p.tg1;
import p.us1;
import p.mh1;
import com.spotify.webapi.service.models.Episode;

public final class qx6 implements qg2	// class@002435 from classes.dex
{
    public final int a;
    public final vv b;

    public void qx6(vv p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       ad6 str1;
       Object[] objArray;
       ad6 uoad6;
       vv ovv;
       Object[] objArray1;
       xt oxt;
       vv c;
       mc6 omc6;
       eo5[] uoeo5Array1;
       HashSet hashSet1;
       Episode show;
       String str = "Unexpected error executing ";
       int i = 0;
       int i1 = 1;
       qx6 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             str1 = new ad6(tb);
             p0 = p0.b;
             p0.getClass();
             str1.e = new jj5(p0);
             objArray = new Object[i1];
             objArray[i] = new tg1(p0.a, p0);
             return new xt(str1.b(), co5.B(vv7.p(objArray)));
           case 1:
             p0 = p0.a;
             tb.getClass();
             HashSet str2 = new HashSet(tb.d);
             str2.addAll(p0.a);
             uoad6 = new ad6(tb);
             uoad6.d = str2;
             ovv = uoad6.b();
             eo5[] uoeo5Array = new eo5[i];
             str2 = vv7.p(uoeo5Array);
             p0 = p0.b;
             if (!p0.isEmpty()) {
                HashSet hashSet = new HashSet(p0);
                hashSet.removeAll(ovv.d);
                hashSet.removeAll(ovv.c);
                if (!hashSet.isEmpty()) {
                   ovv = ovv.a(hashSet);
                   str2.add(new zg1(hashSet));
                }
             }
             if (ovv.d.containsAll(ovv.c) && ovv.e.c()) {
                p0 = new ad6(ovv);
                p0.e(tb.i);
                ovv = p0.b();
             }
             return new xt(ovv, co5.B(str2));
             break;
           case 2:
             xs1 a = p0.a;
             p0 = p0.b;
             if (p0 instanceof IOException) {
                objArray1 = new Object[]{a,tb.a};
                Logger.c(p0, "I/O exception executing %s during sync of %s", objArray1);
                p0 = new ad6(tb);
                p0.j = Boolean.TRUE;
                p0.e(i1);
                p0 = xt.d(p0.b());
             }else if(p0 instanceof bs2 && p0.a > 499){
                objArray1 = new Object[]{a,tb.a};
                Logger.c(p0, "HTTP exception executing %s during sync of %s", objArray1);
                p0 = oi.i(tb);
             }else {
                jl.f(str+a+" during sync of "+tb.a, p0);
                p0 = oi.i(tb);
             }
             return p0;
             break;
           case 3:
             jl.f(str+p0.a+" during insert of "+tb.a, p0.b);
             p0 = new ad6(tb);
             p0.k = Boolean.TRUE;
             p0.e(i1);
             return xt.d(p0.b());
           case 4:
             if (tb.j != null) {
                p0 = oi.h(tb);
                jt a1 = p0.a;
                a1.getClass();
                str1 = new ad6(a1);
                str1.j = Boolean.FALSE;
                str1.e(i);
                ovv = str1.b();
                oxt = new xt(ovv, co5.B(p0.b));
             }else {
                oxt = xt.e();
             }
             return oxt;
             break;
           case 5:
             p0 = (tb.d.containsAll(tb.c))? oi.i(tb): xt.e();
             return p0;
             break;
           case 6:
             tb.getClass();
             str1 = new ad6(tb);
             str1.i = Boolean.TRUE;
             objArray = new Object[i1];
             objArray[i] = new oh1(p0.a, p0.b);
             return new xt(str1.b(), co5.B(vv7.p(objArray)));
           case 7:
             tb.getClass();
             p0 = new ad6(tb);
             p0.i = Boolean.TRUE;
             p0 = p0.b();
             p0 = (tb.d.containsAll(tb.c))? oi.i(p0): xt.d(p0);
             return p0;
             break;
           case 8:
             p0 = p0.a;
             if (!tb.c.isEmpty()) {
                d uod = d.o(p0);
                ap5.g(uod, "set1");
                if ((c = tb.c) != null) {
                   omc6 = new mc6(uod, c);
                }else {
                   throw new NullPointerException("set2");
                }
             }else {
                omc6 = p0;
             }
             if (omc6.isEmpty()) {
                p0 = xt.e();
             }else {
                uoeo5Array1 = new eo5[i];
                hashSet1 = vv7.p(uoeo5Array1);
                c = tb.a;
                int i2 = (c.b == yp6.l0)? 1: 0;
                if (i2) {
                   Iterator iterator = p0.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (iterator.next().b == yp6.m0) {
                            continue ;
                         }
                      }else {
                         i = 1;
                      }
                      if (i) {
                         hashSet1.add(new fh1(c));
                      label_0161 :
                         p0 = new xt(tb.a(p0), co5.B(hashSet1));
                         break ;
                      }
                   }
                }
                hashSet1.add(new zg1(omc6));
                goto label_0161 ;
             }
             return p0;
             break;
           case 9:
             p0 = p0.a;
             uoeo5Array1 = new eo5[i1];
             uoeo5Array1[i] = new nh1(p0, tb.d);
             hashSet1 = vv7.p(uoeo5Array1);
             if (!tb.e.c()) {
                c = tb.a;
                if (c.b == yp6.m0 && ((p0 = p0.get(c)) != null && (p0.n() && (p0 = p94.b(yp6.l0, p0.i().o().j())) != null))) {
                   hashSet1.add(new bh1(p0, tb.b));
                }
             }
             return xt.a(hashSet1);
             break;
           case 10:
             p0 = p0.a;
             tb.getClass();
             uoad6 = new ad6(tb);
             p0.getClass();
             uoad6.f = new jj5(p0);
             objArray1 = new Object[i1];
             objArray1[i] = new ph1(p0, tb.d);
             return new xt(uoad6.b(), co5.B(vv7.p(objArray1)));
           case 11:
             p0 = p0.a;
             tb.getClass();
             uoad6 = new ad6(tb);
             p0.getClass();
             uoad6.g = new jj5(p0);
             objArray1 = new Object[i1];
             objArray1[i] = new qh1(p0, tb.d);
             return new xt(uoad6.b(), co5.B(vv7.p(objArray1)));
           case 12:
             tb.getClass();
             objArray1 = new Object[i1];
             objArray1[i] = new rh1(p0.a, tb.d);
             return new xt(new ad6(tb).b(), co5.B(vv7.p(objArray1)));
           default:
             p0 = p0.a;
             uoeo5Array1 = new eo5[i1];
             uoeo5Array1[i] = new mh1(p0, tb.d);
             hashSet1 = vv7.p(uoeo5Array1);
             if (!tb.e.c() && (tb.a.b == yp6.m0 && ((show = p0.show) != null && show.uri != null))) {
                hashSet1.add(new bh1(new aq6(yp6.l0, show.id, null), tb.b));
             }
             str1 = new ad6(tb);
             str1.h = new jj5(p0);
             return new xt(str1.b(), co5.B(hashSet1));
       }
    }
}
