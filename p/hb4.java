package p.hb4;
import p.zv6;
import java.lang.Object;
import p.p54;
import java.lang.Class;
import android.os.Looper;
import java.lang.String;
import p.jl;
import java.util.concurrent.atomic.AtomicInteger;
import p.v44;
import p.or7;
import android.content.Context;
import p.a54;
import android.os.Handler;
import p.z44;
import android.content.Intent;
import p.xj0;
import p.vv7;
import android.app.PendingIntent;
import p.ow0;
import p.oo;
import com.spotify.playback.playbacknative.AudioDriver$AudioDriverListener;
import com.spotify.playback.playbacknative.AudioDriver;
import p.gv0;
import p.oe7;
import io.reactivex.rxjava3.core.Observable;
import p.c16;
import p.yf2;
import p.fv0;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fn0;
import p.rp;
import p.bi5;
import p.hw0;
import p.fw0;
import p.jw0;
import p.t81;
import io.reactivex.rxjava3.core.ObservableSource;
import p.xl6;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.wp3;
import p.tn6;
import p.ko1;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import p.rm;
import p.pg2;
import io.reactivex.rxjava3.core.Completable;
import p.r44;
import p.bo;
import p.eo;
import p.uw5;
import p.mk4;
import p.ft6;
import android.content.IntentFilter;
import p.t60;
import p.xe7;
import p.ir2;
import p.co5;
import p.up0;
import p.y06;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import p.o54;
import p.b5;
import java.util.Objects;
import p.ep3;
import p.t00;
import android.graphics.Bitmap;
import p.x65;
import p.z65;
import io.reactivex.rxjava3.core.Single;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import p.ti3;
import p.rf5;
import p.l94;

public final class hb4 implements zv6	// class@00181b from classes.dex
{
    public final int a;
    public final Object b;

    public void hb4(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object get(){
       p54 a;
       hb4 ohb4 = this;
       hb4 b = ohb4.b;
       switch (ohb4.a){
           case 0:
             return MobileDataDisabledMonitor.b(b);
           case 1:
             return b.subscribe();
           case 2:
             return Single.just(new x65(b).a());
           case 3:
             b.getClass();
             if (Looper.myLooper() == null) {
                jl.d("Cannot bind on a thread without a Looper");
             }
             if (b.g.getAndIncrement() <= 0) {
                v44 ov44 = new v44(b);
                a = b.a;
                or7 oor7 = new or7(a, a.getClass().getSimpleName());
                oor7.a.e(ov44, new Handler());
                oor7.a.d(PendingIntent.getActivity(a, 0, xj0.z0(a, "spotify.intent.action.NOW_PLAYING"), vv7.d(0)));
                hb4 ohb41 = b;
                ow0 t = ohb41.t;
                AudioDriver.addListener(t.c);
                AudioDriver.addListener(t.b);
                t = ohb41.m;
                t.i = oor7;
                t.b.c(t.f.distinctUntilChanged().switchMap(new c16(t, 8, new oe7(t.a, 11))).subscribe(new fv0(t, 0)));
                ow0 y = ohb41.y;
                ow0 w = ohb41.w;
                w.c(y.filter(new rp(23)).subscribe(new hw0(ohb41, 2)));
                Observable observable = y.switchMap(new fw0(ohb41, 1));
                w.c(Observable.merge(observable, ohb41.x.map(new jw0(7)).distinctUntilChanged().switchMap(new fw0(ohb41, 12)).switchMap(new t81(observable, 4))).subscribe(new fv0(t, 1)));
                w.c(observable.map(new xl6(28)).distinctUntilChanged().switchMap(new fw0(ohb41, 2)).observeOn(id.a()).subscribe(new fv0(t, 2)));
                t = ohb41.q;
                observable = t.a();
                w.c(Observable.combineLatest(observable, t.f.r(t.a), ohb41.p.getConnectionTypeObservable(), new rm(5)).distinctUntilChanged().switchMapCompletable(new fw0(ohb41, 3)).subscribe());
                or7 b1 = oor7.b;
                bo uobo = new bo(b.e, b1);
                p54 h = b.h;
                h.c(uw5.r(b1).map(new mk4(19)).distinctUntilChanged().observeOn(id.a()).subscribe(new ft6(b, 5, uobo)));
                Observable observable1 = xe7.v(a, new IntentFilter("android.media.AUDIO_BECOMING_NOISY")).filter(ir2.a0).map(ir2.E);
                co5.l(observable1, "from\(context, IntentFilt…            .map { true }");
                h.c(observable1.flatMapCompletable(new up0(6, b)).subscribe());
                p54 i = b.i;
                Objects.requireNonNull(i);
                h.c(Observable.create(new y06(b1, 1)).subscribeOn(id.a()).map(new mk4(20)).doFinally(new o54(b, 0)).subscribe(new ep3(i, 7)));
                observable1 = uw5.r(b1);
                p54 j = b.j;
                Objects.requireNonNull(j);
                h.c(observable1.map(new mk4(21)).doFinally(new o54(b, 1)).subscribe(new ep3(j, 8)));
                b.f = uobo;
                oor7.n(1);
                b.c = ov44;
                b.b = oor7;
             }
             return b;
             break;
           default:
             return b.get().i.hide().map(new l94(25)).distinctUntilChanged();
       }
    }
}
