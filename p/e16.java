package p.e16;
import p.yf2;
import java.lang.Object;
import p.g94;
import p.zg1;
import p.h94;
import java.util.Collection;
import io.reactivex.rxjava3.core.Observable;
import p.ns4;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.pp;
import p.fh1;
import java.lang.Throwable;
import p.xs1;
import p.eo5;
import p.qh1;
import p.at1;
import p.rh1;
import p.nh1;
import p.oh1;
import p.eh1;
import p.yg1;
import p.ph1;
import p.mh1;
import p.ch1;
import com.spotify.lite.metadata.MetadataOfflineSyncBackgroundWork$MigrationWorker;
import java.lang.Boolean;
import java.lang.Class;
import p.dm3;
import p.em3;
import io.reactivex.rxjava3.core.Single;
import p.n94;
import p.ew0;
import java.util.Objects;
import p.hb4;
import p.c16;
import p.v05;
import p.rl0;
import p.zv6;
import p.ir0;
import p.co3;
import p.tn6;
import p.ok0;
import p.ko1;
import io.reactivex.rxjava3.core.Completable;
import p.jk0;
import p.pl0;
import p.bm3;
import java.util.List;
import p.tk0;
import com.google.common.collect.c;
import java.lang.String;
import p.w51;
import java.util.Iterator;
import p.r05;
import p.aq6;
import p.td7;
import io.reactivex.rxjava3.core.Flowable;
import p.ga4;
import p.l82;
import p.bm;
import p.bi5;
import p.do5;
import java.util.Arrays;
import p.ys5;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MultiResponse;
import p.ap5;
import p.k73;
import p.m73;
import p.bc3;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MetadataItem;
import p.dt5;
import java.lang.IllegalArgumentException;
import java.lang.Enum;
import p.s53;
import java.util.concurrent.Callable;
import p.ag0;
import p.d94;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MultiRequest;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.co5;
import p.s74;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.l94;
import com.spotify.lite.metadata.MetadataCleanUpBackgroundWork$CleanUpWorker;
import java.lang.Long;
import p.ic;
import java.lang.System;
import p.g56;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.j56;
import p.zy5;
import p.nc4;
import p.h16;
import p.up0;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import p.rp3;
import p.fx6;
import java.util.concurrent.TimeUnit;
import p.mx6;
import p.b94;
import io.reactivex.rxjava3.core.SingleSource;
import p.pg2;
import p.a94;
import com.spotify.lite.app.LiteApplication;
import p.qp3;
import p.b5;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;
import p.ew5;
import p.sa1;
import p.oa1;
import p.fn0;
import p.g16;
import p.u67;
import p.b43;
import p.a43;
import p.d73;
import p.iu2;
import p.ty0;
import p.bu2;
import java.io.Serializable;
import p.k23;
import p.a73;
import java.lang.Iterable;
import p.z23;
import p.pu;
import p.ks0;
import p.so3;
import p.i77;
import p.r45;
import p.p54;
import p.a44;
import p.zh0;
import p.w00;
import java.lang.Runnable;
import p.mi0;
import io.reactivex.rxjava3.core.ObservableSource;
import p.cl5;
import com.spotify.connectivity.platformconnectiontype.InternetMonitorImpl;
import com.spotify.connectivity.connectiontype.InternetState;
import p.m72;
import p.u65;
import java.lang.Integer;
import p.f72;
import p.d82;
import java.lang.Math;
import p.zf2;
import com.spotify.clientfoundations.cosmos.cosmos.Response;
import com.spotify.clientfoundations.esperanto.esperantocosmos.CosmosTransport;
import p.vp;
import p.sa5;
import p.pa5;
import p.at3;
import p.xp;
import p.xs3;
import p.l01;
import io.reactivex.rxjava3.core.Maybe;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.ih1;

public final class e16 implements yf2	// class@0013fd from classes.dex
{
    public final int a;
    public final Object b;

    public void e16(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object apply(Object p0){
       e16 b;
       u65 obj;
       u65 a;
       long l;
       f72 uof72;
       Observable observable;
       LiteApplication f;
       jk0 ojk0;
       Single single;
       Iterator iterator2;
       tk0 a2;
       aq6 uoaq6;
       e16 uoe16 = this;
       int i = 3;
       int i1 = 19;
       int i2 = 4;
       int i3 = 14;
       int i4 = 8;
       int i5 = 2;
       int i6 = 15;
       int i7 = 1;
       int i8 = 0;
       switch (uoe16.a){
           case 0:
             return uoe16.b;
           case 1:
             b = uoe16.b;
             obj = p0;
             b.getClass();
             obj.getClass();
             pl0 opl0 = (obj instanceof pa5)? b.b.a(new at3(obj.a)).ignoreElement().c(b.d).t(obj): Single.just(obj);
             return opl0;
             break;
           case 2:
             return CosmosTransport.a(uoe16.b, p0);
           case 3:
             b = uoe16.b;
             obj = p0;
             b.getClass();
             a = obj.a;
             a.getClass();
             obj = obj.b;
             obj.getClass();
             l = (long)obj.intValue();
             a.getMessage();
             if (!(l - (long)b.b)) {
                uof72 = Flowable.h(a);
             }else {
                TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
                Scheduler b1 = s36.b;
                Objects.requireNonNull(mILLISECONDS, "unit is null");
                Objects.requireNonNull(b1, "scheduler is null");
                uof72 = new d82(Math.max(0, (b.c * l)), mILLISECONDS, b1);
             }
             return uof72;
             break;
           case 4:
             b = uoe16.b;
             obj = p0;
             b.getClass();
             a = obj.a;
             a.getClass();
             obj = obj.b;
             obj.getClass();
             l = (long)obj.intValue();
             if (!(l - (long)b.b)) {
                observable = Observable.error(a);
             }else {
                a.getMessage();
                observable = Observable.timer((b.c * l), TimeUnit.MILLISECONDS);
             }
             return observable;
             break;
           case 5:
             return InternetMonitorImpl.b(uoe16.b, p0);
           case 6:
             return cl5.c(uoe16.b, p0);
           case 7:
             return Completable.j(uoe16.b).m();
           case 8:
             b = uoe16.b;
             pu opu = p0;
             b.getClass();
             a44 uoa44 = (opu.b.c())? b.b.j(opu).d(b.b()): Single.zip(b.e, b.f, new zh0(b, i8, opu)).flatMap(new pp(i6));
             return uoa44;
             break;
           case 9:
             b = uoe16.b;
             b.getClass();
             i77 oi77 = new i77(b);
             oi77.a = r45.a(null);
             oi77.b = r45.a(p0);
             return oi77.k();
           case 10:
             b = uoe16.b;
             b43 uob43 = p0;
             b.getClass();
             d73 uod73 = new d73();
             uod73.D0(ty0.k().o("padding").j("lite:padding", bu2.t.a).b("height", b.a).g());
             uod73.G0(uob43.m());
             return uob43.a().e(uod73.I0()).g();
           case 11:
             b = uoe16.b;
             Boolean uBoolean = p0;
             b.getClass();
             if (uBoolean.booleanValue()) {
                f = b.F;
                f.getClass();
                ojk0 = Completable.i(new qp3(f, i8)).p(s36.c).c(Completable.i(new qp3(f, i7)));
             }else {
                f = b.F;
                ojk0 = f.a.c().p(s36.c).c(Completable.i(new qp3(f, i5)));
             }
             LiteApplication h = b.H;
             h.getClass();
             if (uBoolean.booleanValue()) {
                h.a.a();
             }else {
                sa1 a1 = h.a;
                _monitor_enter(a1);
                a1.d.dispose();
                _monitor_exit(a1);
             }
             return ojk0.c(Completable.i(new g16(h, 11, uBoolean)));
             break;
           case 12:
             b = uoe16.b;
             Long longx = p0;
             b.A.getClass();
             long l1 = System.currentTimeMillis();
             longx.longValue();
             if (((l1 - longx.longValue()) - 0x5265c00) >= 0) {
                b.A.getClass();
                g56 og56 = b.x.z();
                g56 og561 = og56;
                og561.getClass();
                TimeUnit hOURS = TimeUnit.HOURS;
                Objects.requireNonNull(hOURS);
                single = Single.zip(Single.create(new up0(i8, new nc4(og561, i4, zy5.x(i8, "SELECT COUNT\(*\) FROM track_rows")))), b.z.a().map(new fx6(i3)), b.z.a().map(new fx6(i6)).map(new mx6(i2, hOURS)), new b94(og56, System.currentTimeMillis())).flatMap(new pp(i1)).flatMap(new a94(i8, l1, b));
             }else {
                single = Single.just(em3.a());
             }
             return single;
             break;
           case 13:
             b = uoe16.b;
             List list = p0;
             b.getClass();
             if (list.isEmpty()) {
                single = Single.error(new IllegalArgumentException("Page is empty"));
             }else if((i2 = list.get(i8).b.ordinal()) != i7 && (i2 != i && (i2 != 5 && (i2 != 51 && i2 != 52)))){
                single = Single.fromCallable(new s53(i, list));
             }else {
                h94 b2 = b.b;
                d94 uod94 = MetadataCosmos$MultiRequest.g();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   uod94.c(iterator.next().toString());
                }
                MetadataCosmos$MultiRequest multiRequest = uod94.build();
                b2.getClass();
                co5.o(multiRequest, "request");
                single = b2.callSingle("spotify.metadata_esperanto.proto.ClassicMetadataService", "MultigetEntity", multiRequest);
                single = single.map(new l94(26));
                co5.l(single, "callSingle\(\"spotify.meta…     }\n                }\)");
                single = single.map(new e16(i3, list));
             }
             return single;
             break;
           case 14:
             b = uoe16.b;
             MetadataCosmos$MultiResponse multiRespons = p0;
             if (b.size() == multiRespons.f()) {
                i8 = true;
             }
             ap5.e(i8);
             k73 ok73 = m73.a();
             Iterator iterator1 = b.iterator();
             iterator2 = multiRespons.g().iterator();
             while (iterator1.hasNext() && iterator2.hasNext()) {
                ok73.d(iterator1.next(), iterator2.next());
             }
             return ok73.b(i7);
             break;
           case 15:
             b = uoe16.b;
             List list1 = p0;
             b.getClass();
             if (list1.isEmpty()) {
                a2 = tk0.a;
             }else {
                w51.h(i2, "initialCapacity");
                Object[] objArray = new Object[i2];
                iterator2 = list1.iterator();
                i2 = 0;
                while (iterator2.hasNext()) {
                   if ((uoaq6 = td7.d(iterator2.next().m)) != null) {
                      jk0 ojk01 = new l82(b.b.a(uoaq6)).n(new bm(i4));
                      i5 = i2 + 1;
                      if (objArray.length < i5) {
                         objArray = Arrays.copyOf(objArray, do5.t(objArray.length, i5));
                      }
                      objArray[i2] = ojk01;
                      i2 = i5;
                   }
                }
                ys5 oys5 = c.m(i2, objArray);
                Objects.requireNonNull(oys5, "sources is null");
                a2 = new ok0(i8, oys5);
             }
             return a2;
             break;
           case 16:
             b = uoe16.b;
             b.getClass();
             if (p0.booleanValue()) {
                single = Single.just(em3.a());
             }else {
                MetadataOfflineSyncBackgroundWork$MigrationWorker x = b.x;
                Observable observable1 = x.a.e();
                Objects.requireNonNull(observable1);
                c16 uoc16 = new c16(x, i, observable1);
                MetadataOfflineSyncBackgroundWork$MigrationWorker y = b.y;
                single = new rl0(new hb4(i7, observable1), uoc16, new v05(i5)).c(y.f.s(y.i, Boolean.TRUE)).t(em3.a()).onErrorReturnItem(new bm3());
             }
             return single;
             break;
           case 17:
             return new xs1(uoe16.b, p0);
           case 18:
             return new at1(uoe16.b, p0);
           case 19:
             return new xs1(uoe16.b, p0);
           case 20:
             return new at1(uoe16.b, p0);
           case 21:
             return new xs1(uoe16.b, p0);
           case 22:
             return new xs1(uoe16.b, p0);
           case 23:
             return new at1(uoe16.b, p0);
           case 24:
             return new at1(uoe16.b, p0);
           case 25:
             return new at1(uoe16.b, p0);
           case 26:
             return new at1(uoe16.b, p0);
           case 27:
             return new xs1(uoe16.b, p0);
           case 28:
             zg1 ozg1 = p0;
             return uoe16.b.a(ozg1.D).compose(new ns4(i8)).map(new pp(27)).onErrorReturn(new e16(i1, ozg1));
           default:
             return uoe16.b.getInternetState().map(new pp(29)).distinctUntilChanged().filter(new bm(10)).map(new fx6(i8));
       }
    }
}
