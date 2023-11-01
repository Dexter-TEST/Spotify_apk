package p.mx6;
import p.yf2;
import java.lang.Object;
import java.util.Map;
import p.c05;
import p.h05;
import p.wi4;
import p.zg0;
import java.util.Calendar;
import p.mi;
import p.ic;
import java.lang.Class;
import java.util.TimeZone;
import java.lang.System;
import p.ui4;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Observable;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.dp3;
import p.zh4;
import p.g16;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.rk0;
import p.qi4;
import p.pi4;
import p.yi4;
import p.np0;
import p.qr;
import java.util.concurrent.TimeUnit;
import p.mi3;
import java.lang.Long;
import p.jk0;
import p.km3;
import com.spotify.litenavigation.deeplink.DeepLinkActivity;
import java.lang.Throwable;
import p.px1;
import p.ap3;
import p.xl6;
import io.reactivex.rxjava3.core.Single;
import java.lang.RuntimeException;
import java.lang.String;
import p.cj5;
import p.av2;
import p.tq2;
import p.vi7;
import p.b90;
import p.d90;
import p.gj5;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.p45;
import java.lang.Boolean;
import p.q45;
import p.va1;
import p.ox7;
import java.util.Set;
import p.tn6;
import p.y15;
import p.ja3;
import java.lang.Runnable;
import p.ma3;
import p.ot;
import p.pl0;
import p.py0;
import p.r45;
import p.rn6;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.wn6;
import p.v75;
import p.uq2;
import p.b43;
import p.au2;
import com.google.common.collect.c;
import p.ys5;
import p.w15;
import java.util.Objects;
import p.v15;
import p.a44;
import p.qq2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import p.co3;
import p.ko1;
import p.sq2;
import p.vf;
import java.util.List;
import java.lang.Iterable;
import p.bn6;
import p.l12;
import p.cv2;
import p.i12;
import p.ju2;
import p.a43;
import p.iu2;
import p.ty0;
import p.ry2;
import p.fu2;
import p.gu2;
import p.sp6;
import p.su2;
import p.k23;
import p.z23;
import p.z02;
import java.lang.Integer;
import p.t02;
import p.yd1;
import p.th1;
import p.pe6;
import p.ir0;
import p.kn7;
import p.eo7;
import p.rp3;
import p.s53;
import p.op3;
import p.z40;
import p.ti3;
import p.jp;
import p.tm3;
import p.sm3;
import p.v40;
import p.co5;
import p.ld;
import p.md;
import p.eo5;
import p.ds7;
import p.cy5;
import p.ps2;
import p.nm5;
import p.qu0;
import java.util.ArrayList;
import java.util.Iterator;
import p.v06;
import p.dj0;
import p.u90;
import p.o40;
import p.l30;
import com.spotify.bootstrap.v1.proto.Bootstrap$BootstrapRequest;
import com.spotify.bootstrap.v1.proto.Bootstrap$TrialsFacadeRequestV1;
import p.sg0;
import java.util.TreeMap;
import p.oh5;
import java.util.Collection;
import com.spotify.base.java.logging.Logger;
import p.kg0;
import p.nh5;
import java.util.Map$Entry;
import com.spotify.rcs.resolver.grpc.v0.proto.h;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Context$ContextEntry;
import com.google.protobuf.c;
import com.google.protobuf.b;
import com.spotify.ucs.v0.proto.b;
import com.spotify.ucs.v0.proto.Ucs$UcsRequest;
import com.spotify.ucs.v0.proto.c;
import com.spotify.ucs.v0.proto.Ucs$UcsRequest$CallerInfo;
import p.zv5;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$ResolveRequest;
import p.xv5;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Fetch;
import com.spotify.rcs.resolver.grpc.v0.proto.g;
import com.spotify.rcs.resolver.grpc.v0.proto.Resolve$Context;
import com.spotify.ucs.v0.proto.a;
import com.spotify.ucs.v0.proto.Ucs$UcsRequest$AccountAttributesRequest;
import p.u40;
import p.s40;
import p.u00;
import p.l40;
import p.t40;
import p.al5;
import io.reactivex.rxjava3.core.Flowable;
import p.j82;
import p.it0;
import p.bh1;
import p.aq6;
import p.ex6;
import p.uf;
import io.reactivex.rxjava3.core.SingleTransformer;

public final class mx6 implements yf2	// class@001f26 from classes.dex
{
    public final int a;
    public final Object b;

    public void mx6(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object apply(Object p0){
       v40 obj;
       v06 ov06;
       c uoc1;
       mx6 tb;
       ui4 p0;
       int i = 5;
       int i1 = 1;
       int i2 = 0;
       switch (this.a){
           case 0:
             return this.b.a(p0.D.toString(), p0.E).flatMap(new ex6(p0, i2)).compose(new uf()).onErrorReturn(new ex6(p0, i1));
           case 1:
             p0 = this.b.a;
             p0.getClass();
             return new j82(p0, 2);
           case 2:
             jp ojp = this.b.a.get();
             ojp.getClass();
             sm3 osm3 = new sm3(ojp, i2);
             p0.getClass();
             v40 f = p0.f;
             co5.o(f, "timeKeeper");
             md omd = f.a("bootstrap");
             omd.h = "bootstrap-service-android";
             eo5.b = omd;
             omd.g("bootstrap-feature");
             if ((omd = eo5.b) != null) {
                omd.g("prepare-bootstrap");
             }
             ds7 uods7 = new ds7();
             v40 b = p0.b;
             uods7.d(b.c);
             uods7.d = osm3;
             uods7.b(new nm5());
             cy5 e = b.e;
             co5.l(e, "retrofit.callAdapterFactories\(\)");
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = e.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj instanceof v06) {
                   uArrayList.add(obj);
                }
             }
             if ((ov06 = dj0.l0(uArrayList)) == null) {
                ov06 = v06.b();
             }
             uods7.a(ov06);
             Single obj1 = uods7.e().b(o40.class);
             co5.l(obj1, "bootstrapRetrofitBuilder…trapEndpoint::class.java\)");
             md b1 = eo5.b;
             String str = "create-bootstrap-request";
             if (b1 != null) {
                b1.g(str);
             }
             l30 ol30 = Bootstrap$BootstrapRequest.h();
             ol30.c(Bootstrap$TrialsFacadeRequestV1.f());
             obj = p0.a;
             boolean b2 = v40.h.contains(obj.a);
             sg0 d = obj.d;
             Set set = d.b().keySet();
             if (!set instanceof Collection || !set.isEmpty()) {
                Iterator iterator2 = set.iterator();
                while (true) {
                   if (iterator2.hasNext()) {
                      if (co5.c(iterator2.next(), "/remote-config/rc-client-version")) {
                         iterator2 = 0;
                         break ;
                      }
                   }
                }
                sg0 b3 = obj.b;
                if (set) {
                   Object[] objArray = new Object[i2];
                   Logger.i("This integration was setup without RemoteConfig ClientVersion as an Identifier. Please fix!", objArray);
                   d.a(new kg0(b3));
                }
                TreeMap treeMap = d.b();
                ArrayList uArrayList1 = new ArrayList(treeMap.size());
                Iterator iterator1 = treeMap.entrySet().iterator();
                while (iterator1.hasNext()) {
                   Map$Entry uEntry = iterator1.next();
                   h oh = Resolve$Context$ContextEntry.h();
                   oh.c(uEntry.getKey());
                   oh.d(uEntry.getValue());
                   uArrayList1.add(oh.build());
                }
                b uob = Ucs$UcsRequest.i();
                c uoc = Ucs$UcsRequest$CallerInfo.i();
                uoc.e(obj.a);
                uoc.d(b3);
                uoc.c();
                uob.d(uoc);
                zv5 ozv5 = Resolve$ResolveRequest.i();
                ozv5.e(obj.c);
                xv5 oxv5 = Resolve$Fetch.g();
                oxv5.c();
                ozv5.d(oxv5);
                g og = Resolve$Context.g();
                og.c(uArrayList1);
                ozv5.c(og);
                uob.e(ozv5);
                if (b2) {
                   uob.c(Ucs$UcsRequest$AccountAttributesRequest.f());
                }
                ol30.d(uob);
                uoc1 = ol30.build();
                if ((b1 = eo5.b) != null) {
                   b1.c(str);
                }
                co5.l(uoc1, "newBuilder\(\)\n           …apRequest\(\)\n            }");
                obj1 = obj1.a(uoc1).doOnSubscribe(new u40(p0)).doOnEvent(new s40(p0, i1)).map(l40.a);
                co5.l(obj1, "private fun prepareBoots…ootstrapDataParser\)\n    }");
                p0 = obj1.map(new t40(p0)).doOnEvent(new s40(p0, i2));
                if ((omd = eo5.b) != null) {
                   omd.c("prepare-bootstrap");
                }
                co5.l(p0, "bootstrapDataSingle");
                return p0;
             }
             set = 1;
             break;
           case 3:
             p0 = this.b.b;
             Objects.requireNonNull(p0);
             return Single.fromCallable(new s53(i, p0));
           case 4:
             return Long.valueOf(this.b.toMillis((long)p0.intValue()));
           case 5:
             tb = this.b;
             return new eo7(tb.M, tb.N, p0);
           case 6:
             return Completable.i(new g16(this.b, 7, p0));
           case 7:
             tb = this.b;
             return tb.v.a(tb.getContext(), p0.F, "lite/favorites/downloaded-episodes", "spotify:favorites:downloaded-episodes");
           case 8:
             return this.b.u();
           case 9:
             return this.b.u();
           case 10:
             tb = this.b;
             tb.getClass();
             uoc1 = (p0.j().isEmpty() && (p0.m().isEmpty() && p0.e() == null))? 1: 0;
             if (uoc1) {
                ju2[] oju2Array = new ju2[i1];
                gu2 ogu2 = ty0.o();
                ogu2.getClass();
                i12 a = tb.a;
                oju2Array[i2] = ty0.k().k(ry2.t).p(ogu2.b("HEART")).s(ty0.z().d(a.getString(R.string.favorites_empty_title)).b(a.getString(R.string.favorites_empty_description))).g();
                p0 = p0.a().k(oju2Array).g();
             }
             return p0;
             break;
           case 11:
             return this.b.u();
           case 12:
             return this.b.c(p0);
           case 13:
             return this.b.r(p0);
           case 14:
             tb = this.b;
             qq2 t = tb.t;
             uq2 w = t.w;
             return w.b.r(w.i).distinctUntilChanged().flatMap(new sq2(t, p0.a, tb.requireContext())).compose(t.A).compose(t.z);
           case 15:
             tb = this.b;
             tb.getClass();
             String[] stringArray = p0.b().j("on-demand");
             uq2 y = tb.y;
             y.getClass();
             ys5 v = (stringArray == null)? ys5.v: c.p(stringArray);
             w15 a1 = y.a;
             Objects.requireNonNull(a1);
             return Single.just(v).flatMapCompletable(new v15(a1, i2)).d(Single.just(p0));
             break;
           case 16:
             tb = this.b;
             tb.getClass();
             String str1 = null;
             p0 = (p0.c())? p0.b(): str1;
             rn6 e1 = py0.e;
             py0 c = tb.c;
             String str2 = c.g(e1, str1);
             rn6 f1 = py0.f;
             if (!TextUtils.isEmpty(p0) && TextUtils.equals(str2, p0)) {
                str1 = c.g(f1, str1);
                if (!TextUtils.isEmpty(str1)) {
                   p0 = Observable.just(str1);
                label_01ca :
                   return p0;
                }
             }
             wn6 own6 = c.edit();
             own6.d(f1);
             own6.c(e1, p0);
             own6.e();
             p0 = tb.a.a().toObservable();
             goto label_01ca ;
             break;
           case 17:
             tb = this.b;
             tb.getClass();
             return Completable.j(new ja3(tb, i2, p0)).p(s36.c).t(p0);
           case 18:
             return Completable.j(new ja3(p0, i1, this.b));
           case 19:
             return ox7.C(this.b.c.v.a().toObservable());
           case 20:
             cj5 v1 = this.b.v;
             v1.getClass();
             return d90.a(new tq2(v1, p0.a, i1)).compose(v1.v);
           case 21:
             tb = this.b;
             tb.getClass();
             if (p0 instanceof px1) {
                return tb.R.c.map(new xl6(i)).subscribeOn(s36.c).timeout(5, TimeUnit.SECONDS);
             }else {
                throw new RuntimeException("Failed to load enabled/ login state");
             }
             break;
           case 22:
             return this.b.t.c(i2);
           case 23:
             tb = this.b;
             tb.getClass();
             p0 = (p0.b != null && p0.a == null)? Observable.timer(300, TimeUnit.MILLISECONDS, tb.w): Observable.empty();
             return p0;
             break;
           case 24:
             tb = this.b;
             if (tb.f == null) {
                pi4 opi4 = new pi4();
                tb.f = opi4;
                pi4 e2 = p0.e;
                opi4.a = e2.a;
                opi4.b = e2.b;
                opi4.c = e2.c;
                opi4.d = p0.d;
                opi4.e = e2;
             }
             zh4 ozh4 = new zh4();
             qi4 f2 = tb.f;
             ozh4.a = p0.a - f2.a;
             ozh4.b = p0.b - f2.b;
             ozh4.c = p0.c;
             ozh4.d = f2.d;
             tb.f = p0;
             return ozh4;
             break;
           case 25:
             tb = this.b;
             tb.getClass();
             return Completable.i(new g16(tb, i1, p0)).p(s36.c);
           case 26:
             mx6 omx6 = this.b;
             p0 = omx6.c;
             p0.getClass();
             p0 = Calendar.getInstance(TimeZone.getDefault());
             p0.setTimeInMillis(System.currentTimeMillis());
             mi.L(p0);
             long timeInMillis = p0.getTimeInMillis();
             p0 = new ui4(omx6, timeInMillis, mi.M(p0).getTimeInMillis());
             return Observable.fromCallable(p0).subscribeOn(s36.c);
           default:
             return this.b.get(p0);
       }
    }
}
