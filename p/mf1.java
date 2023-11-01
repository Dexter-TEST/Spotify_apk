package p.mf1;
import p.yf2;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import p.tp2;
import p.yg2;
import p.rm;
import java.lang.Class;
import java.util.Set;
import p.mo;
import java.lang.Boolean;
import java.lang.Integer;
import p.ro;
import java.lang.Iterable;
import p.ab2;
import p.vr1;
import p.dt5;
import p.ug2;
import p.gr7;
import android.content.Context;
import p.r45;
import java.util.List;
import p.a43;
import p.ty0;
import java.util.ArrayList;
import p.ju2;
import p.p12;
import p.aq6;
import p.yp6;
import p.iu2;
import p.c03;
import p.fu2;
import p.su2;
import android.content.res.Resources;
import p.gu2;
import p.i13;
import p.sp6;
import java.lang.Enum;
import p.tt2;
import p.au2;
import p.h13;
import p.k23;
import p.dv0;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import p.xu;
import p.iw;
import p.te5;
import p.zu;
import p.hu2;
import p.z23;
import p.rg2;
import p.pg2;
import p.w00;
import p.a44;
import java.util.Objects;
import p.qp4;
import p.g62;
import p.gb2;
import p.co5;
import java.net.URL;
import java.lang.Exception;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.xs7;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.atomic.AtomicInteger;
import p.iy5;
import p.i70;
import p.p72;
import p.bi5;
import p.q9;
import p.bx5;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import p.a22;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import p.ge6;
import p.t37;
import com.google.protobuf.c;
import p.n22;
import p.jk0;
import p.pl0;
import io.reactivex.rxjava3.core.Single;
import p.b22;
import p.dm3;
import p.em3;
import p.d22;
import p.d77;
import p.iy3;
import p.qw3;
import p.cq2;
import p.vv7;
import p.lw3;
import p.nw3;
import p.bq2;
import p.iz3;
import p.en6;
import p.cd2;
import p.z46;
import p.jl7;
import p.t65;
import p.dx3;
import java.util.Map;
import android.telephony.TelephonyManager;
import android.content.res.Configuration;
import java.util.Locale;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.la0;
import java.util.Collection;
import java.lang.IllegalStateException;
import p.n05;
import p.k05;
import com.spotify.liteoffline.offline.OfflineNotificationWorker;
import p.u05;
import p.j74;
import p.ay6;
import p.gk4;
import android.app.PendingIntent;
import p.of5;
import p.lo;
import p.sj4;
import p.rj4;
import p.uj4;
import android.app.Notification;
import p.jc7;
import com.spotify.base.java.logging.Logger;
import p.bm3;
import p.l05;
import android.app.NotificationManager;
import p.wu;
import java.util.concurrent.TimeUnit;
import p.o82;
import p.zg0;
import p.r82;
import p.i72;
import p.c92;
import p.p82;
import p.o11;
import p.so5;
import p.u44;
import p.to5;
import p.b5;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;
import io.reactivex.rxjava3.core.Observable;
import p.ba5;
import p.jc2;
import p.nc2;
import p.a82;
import java.lang.Throwable;
import p.of1;
import p.nf1;

public final class mf1 implements yf2	// class@001e82 from classes.dex
{
    public final int a;
    public final Object b;

    public void mf1(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object a(Object[] p0){
       String str2;
       mf1 omf1 = this;
       int i = p0;
       int i1 = 8;
       int i2 = 7;
       int ro i3 = 6;
       String str = null;
       int i4 = 5;
       int i5 = 4;
       int i6 = 3;
       int i7 = 1;
       mf1 b = omf1.b;
       int i8 = 2;
       int i9 = 0;
       switch (omf1.a){
           case 14:
             break;
           case 15:
             if (i.length == i6) {
                return b.c(i[0], i[1], i[i8]);
             }else {
                throw new IllegalArgumentException("Array of size 3 expected but got "+i.length);
             }
             break;
           case 16:
             if (i.length == i5) {
                return b.e(i[0], i[1], i[i8], i[i6]);
             }else {
                throw new IllegalArgumentException("Array of size 4 expected but got "+i.length);
             }
             break;
           case 17:
             if (i.length != i4) {
                throw new IllegalArgumentException("Array of size 5 expected but got "+i.length);
             }
             object oobject = i[i9];
             object oobject1 = i[i7];
             object oobject2 = i[i8];
             object oobject3 = i[i6];
             object oobject4 = i[i5];
             b.getClass();
             a43 uoa43 = ty0.B().j("lite-favorites");
             ArrayList uArrayList = new ArrayList((oobject3.size() + i8));
             String str1 = (oobject4.intValue() == 0x7f0a05ca)? oobject.getString(R.string.sort_creator): oobject.getString(R.string.sort_alphabetical);
             uArrayList.add(p12.f(oobject4.intValue(), str1));
             uArrayList.add(p12.e(R.string.button_create_playlist, R.drawable.plus_square, oobject, "spotify:internal:create-playlist"));
             str = (oobject1.c())? new aq6(yp6.y0, str, oobject1.b()).toString(): new aq6(yp6.y0, str, str).toString();
             gz2 b1 = c03.b;
             Object[] objArray = new Object[i7];
             objArray[0] = Integer.valueOf(oobject2.size());
             Object[] objArray1 = new Object[]{Integer.valueOf(oobject2.size())};
             uArrayList.add(ty0.k().o("lite-favorites-playlists-composite_row0").k(b1).s(ty0.z().d(oobject.getString(R.string.favorite_songs_entity_title)).a(oobject.getResources().getQuantityString(R.plurals.favorite_songs_description, oobject2.size(), objArray)).b(oobject.getResources().getQuantityString(R.plurals.favorite_songs_description, oobject2.size(), objArray1))).p(ty0.o().c(ty0.n().g("https://misc.scdn.co/lite/favorites-mix.png").e(sp6.Z))).e("click", p12.h(str)).c(h13.b(str)).g());
             if (oobject4.intValue() == 0x7f0a05ca) {
                Collections.sort(oobject3, new dv0(10));
             }else {
                Collections.sort(oobject3, new dv0(11));
             }
             Iterator iterator = oobject3.iterator();
             while (iterator.hasNext()) {
                xu oxu = iterator.next();
                xu b2 = oxu.b;
                iw b3 = (te5.a(oxu.b.c))? b2.b: b2.c;
                if (oobject1.c() && oobject1.b().equals(b2.b)) {
                   str2 = oobject.getString(R.string.playlist_item_by_you);
                }else {
                   Object[] objArray2 = new Object[]{b3};
                   str2 = oobject.getString(R.string.playlist_item_by, objArray2);
                }
                xu a = oxu.a;
                zu b4 = a.b;
                uArrayList.add(ty0.k().o(a.b).k(b1).s(ty0.z().d(a.c).a(str2).b(str2)).q(p12.g(sp6.Z, oxu.c)).c(h13.b(b4)).e("click", p12.h(b4)).g());
             }
             return uoa43.a(uArrayList).g();
             break;
           case 18:
             if (i.length != i3) {
                throw new IllegalArgumentException("Array of size 6 expected but got "+i.length);
             }
             tp2.v(b);
             throw str;
             break;
           case 19:
             if (i.length != i2) {
                throw new IllegalArgumentException("Array of size 7 expected but got "+i.length);
             }
             b.getClass();
             i3 = new ro(ab2.b(i[i9]).g(new vr1(i4, i[i7])), i[i8].booleanValue(), i[i6].intValue(), i[i5].booleanValue(), i[i4].booleanValue(), i[i3].booleanValue());
             return i3;
             break;
           case 20:
             if (i.length != i1) {
                throw new IllegalArgumentException("Array of size 8 expected but got "+i.length);
             }
             tp2.v(b);
             throw str;
             break;
           default:
             if (i.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got "+i.length);
             }
             tp2.v(b);
             throw str;
       }
       if (i.length == i8) {
          return b.apply(i[0], i[1]);
       }else {
          throw new IllegalArgumentException("Array of size 2 expected but got "+i.length);
       }
    }
    public final Object apply(Object p0){
       j74 oj74;
       rj4 value;
       of5 a;
       String str3;
       int i3;
       int i4;
       Object[] objArray1;
       Object[] objArray2;
       String str = "The zipper returned a null value";
       int i = 1;
       String str1 = null;
       int i1 = 0;
       mf1 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return Completable.i(new nf1(tb, i));
           case 1:
             return Flowable.o(new t65(tb.a, p0));
           case 2:
             return new r82(new a82(new jc2(tb, p0, i)), new mf1(i, p0), i);
           case 3:
             p0 = tb.b;
             o11 t = tb.t;
             p0.getClass();
             co5.o(t, "report");
             return Completable.i(new to5(p0, t)).p(s36.c).t(Boolean.TRUE).onErrorReturnItem(Boolean.FALSE).toObservable();
           case 4:
             c92 uoc92 = (p0.m != null)? new c92(new r82(Flowable.n(32, TimeUnit.MILLISECONDS), new q9(p0, i, tb), i1).g()): Flowable.o(p0.k);
             return uoc92;
             break;
           case 5:
             p0.getClass();
             if (p0 instanceof k05) {
                tb.getClass();
                p0 = p0.a;
                if ((oj74 = u05.a.get(p0)) != null) {
                   value = tb.z.getValue();
                   co5.l(value, "<get-pendingIntent>\(...\)");
                   OfflineNotificationWorker y = tb.y;
                   lo.b(y.a, "channel_id_offline", 2, R.string.offline_notification_channel, 0x7f12026c, false);
                   a = y.a;
                   String str2 = a.getString(oj74.a);
                   str3 = a.getString(oj74.b);
                   of5 c = y.c;
                   c.g = value;
                   c.e(str2);
                   c.d(str3);
                   value = new rj4();
                   value.c = sj4.c(str3);
                   value.b = sj4.c(str2);
                   c.g(value);
                   tb.A.getValue().a(R.id.offline_error_notification, c.b());
                   str1 = jc7.a;
                }
                if (str1 == null) {
                   Object[] objArray = new Object[i1];
                   Logger.b("Unhandled error event "+p0.name(), objArray);
                }
                p0 = new bm3();
             }else if(p0 instanceof l05){
                tb.A.getValue().b.cancel(str1, R.id.offline_notification);
                p0 = em3.a();
             }else {
                p0 = new bm3();
             }
             return p0;
             break;
           case 6:
             co5.o(p0, "callingCodeMap");
             co5.o(tb, "context");
             la0 systemServic = tb.getSystemService("phone");
             co5.j(systemServic, "null cannot be cast to non-null type android.telephony.TelephonyManager");
             str3 = systemServic.getSimCountryIso();
             str = tb.getResources().getConfiguration().locale.getCountry();
             co5.l(str, "localeCountryCode");
             if ((i ^ p0.isEmpty())) {
                if (!TextUtils.isEmpty(str3)) {
                   if (str3 != null) {
                      Locale uS = Locale.US;
                      co5.l(uS, "US");
                      str1 = str3.toUpperCase(uS);
                      co5.l(str1, "this as java.lang.String\).toUpperCase\(locale\)");
                   }
                   if ((systemServic = p0.get(str1)) == null) {
                   label_025b :
                      if ((systemServic = p0.get(str)) == null) {
                         systemServic = p0.values().iterator().next();
                      }
                   }
                }else {
                   goto label_025b ;
                }
                return systemServic;
             }else {
                throw new IllegalStateException(str1);
             }
             break;
           case 7:
             return new t65(Integer.valueOf(tb.getFirstVisibleItemIndex()), Integer.valueOf(tb.getLastVisibleItemIndex()));
           case 8:
             co5.o(p0, "trackProgress");
             iz3 a1 = tb.a;
             int i2 = (a1.b == i)? 0: vv7.v(p0.a, a1.a);
             if (i3 = en6.A(p0.b)) {
                if (i3 != i && i3 != 2) {
                   throw new cd2(10);
                }
             }else {
                i = false;
             }
             return new z46(i2, i);
             break;
           case 9:
             iy3 a2 = tb.a;
             str = (a2.b != i)? 1: 0;
             cq2 a3 = cq2.a;
             if (str) {
                p0 = p0.a;
                qw3 a4 = a2.a;
                if ((i4 = vv7.v(p0, a4)) != -1) {
                   lw3 olw3 = a4.get(i4);
                   if (a2.b != 3) {
                      i = 0;
                   }
                   if (i) {
                      Iterator iterator = olw3.c.iterator();
                      while (iterator.hasNext()) {
                         nw3 onw3 = iterator.next();
                         if (onw3.a <= p0) {
                            i1 = i1 + onw3.b;
                         }
                      }
                   }else {
                      i1 = olw3.b.length();
                   }
                   a3 = new bq2(i4, i1);
                }
             }
             return a3;
             break;
           case 10:
             tb.name();
             objArray1 = new Object[i1];
             t37.a().getClass();
             ge6.a(objArray1);
             return em3.a();
           case 11:
             bx5 b = p0.b;
             a22 a5 = a22.a;
             if (p0.a()) {
                if (b == null || b.h() != i) {
                   i = 0;
                }
                if (i && b.f() != null) {
                   b.toString();
                   objArray2 = new Object[i1];
                   t37.a().getClass();
                   ge6.a(objArray2);
                   p0 = b.f();
                   co5.l(p0, "body.configuration");
                   p0 = tb.a(p0);
                   if (b.h() && b.f().isInitialized()) {
                      a5 = a22.c;
                   }
                   p0 = p0.t(a5);
                label_0146 :
                   return p0;
                }
             }
             p0 = Single.just(a5);
             goto label_0146 ;
             break;
           case 12:
             AtomicInteger uAtomicInteg = new AtomicInteger(i1);
             p0.getClass();
             p0 = new q9(uAtomicInteg, 4, tb);
             return new p72(p0, new iy5(uAtomicInteg, tb), i).i(p0, Flowable.a, Flowable.a);
           case 13:
             co5.l(p0, "it");
             tb.getClass();
             URL uRL = new URL(p0);
             if (!co5.c(uRL.getHost(), "spclient.wg.spotify.com") || !co5.c(uRL.getProtocol(), "https")) {
                i = 0;
             }
             p0 = (!i)? Completable.h(new Exception("Invalid redirect url: ".concat(p0))): tb.b.a(p0);
             return p0;
             break;
           case 14:
             return this.a(p0);
           case 15:
             return this.a(p0);
           case 16:
             return this.a(p0);
           case 17:
             return this.a(p0);
           case 18:
             return this.a(p0);
           case 19:
             return this.a(p0);
           case 20:
             return this.a(p0);
           case 21:
             return this.a(p0);
           case 22:
             return tb.cast(p0);
           case 23:
             Collections.sort(p0, tb);
             return p0;
           case 24:
             objArray1 = new Object[i];
             objArray1[i1] = p0;
             return tb.v.apply(objArray1);
           case 25:
             objArray1 = new Object[i];
             objArray1[i1] = p0;
             p0 = tb.c.apply(objArray1);
             Objects.requireNonNull(p0, "The combiner returned a null value");
             return p0;
           case 26:
             objArray2 = new Object[i];
             objArray2[i1] = p0;
             p0 = tb.c.apply(objArray2);
             Objects.requireNonNull(p0, str);
             return p0;
           default:
             objArray2 = new Object[i];
             objArray2[i1] = p0;
             p0 = tb.c.apply(objArray2);
             Objects.requireNonNull(p0, str);
             return p0;
       }
    }
}
