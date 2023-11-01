package p.s81;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;
import p.l94;
import p.yf2;
import p.hv3;
import java.lang.Class;
import p.dv3;
import p.ga4;
import p.vc5;
import p.ew0;
import p.sn1;
import p.e61;
import p.qf6;
import p.kg6;
import java.util.Map;
import java.util.Collections;
import p.oc5;
import p.t35;
import p.up0;
import com.spotify.liteplayer.player.npv.NowPlayingActivity;
import p.lk4;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fn0;
import p.qk4;
import android.widget.SeekBar;
import java.lang.String;
import p.co5;
import p.a96;
import com.spotify.legacyglue.icons.SpotifyIconView;
import android.view.View;
import p.kz6;
import p.ry7;
import p.mk4;
import p.nk4;
import com.spotify.litecomponents.nowplayingwidgets.RepeatButton;
import com.spotify.litecomponents.nowplayingwidgets.ShuffleButton;
import android.widget.TextView;
import p.jw0;
import android.widget.ImageView;
import p.r96;
import p.s96;
import p.fj7;
import p.b5;
import p.vk4;
import p.vs3;
import p.t67;
import p.mx6;
import io.reactivex.rxjava3.core.Completable;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.e16;
import p.it0;
import p.g94;
import com.spotify.connectivity.sessionstate.DeferUntilConnected;
import com.spotify.connectivity.connectiontype.DeferUntilConnected;
import p.li5;

public final class s81 implements ObservableTransformer	// class@0025d8 from classes.dex
{
    public final int a;
    public final Object b;

    public void s81(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final ObservableSource apply(Observable p0){
       s81 os81 = this;
       Observable observable = p0;
       int i = 3;
       int i1 = 1;
       int i2 = 29;
       s81 b = os81.b;
       switch (os81.a){
           case 0:
             return DeferUntilConnected.b(b, observable);
           case 1:
             return DeferUntilConnected.a(b, observable);
           case 2:
             return observable.flatMap(new e16(28, b));
           case 3:
             return observable.switchMapSingle(new mx6(0, b));
           case 4:
             return observable.switchMap(new e16(29, b));
           case 5:
             return observable.flatMapCompletable(new mx6(6, b)).s();
           case 6:
             b.getClass();
             vk4 a = b.a;
             a.c(p0.distinctUntilChanged().subscribe(new vs3(24, b)));
             ObservableSource[] observableSo = new ObservableSource[i];
             observableSo[0] = ry7.e(b.A.x).map(new jw0(17));
             observableSo[i1] = ry7.e(b.A.w).map(new jw0(18));
             observableSo[2] = ry7.e(b.A.v).map(new jw0(19));
             return Observable.mergeArray(observableSo).doOnDispose(new fj7(a, i1));
           case 7:
             b.getClass();
             NowPlayingActivity q = b.Q;
             q.c(p0.distinctUntilChanged().subscribe(new lk4(b, 0)));
             qk4 a1 = b.j0.A;
             co5.q(a1, "$this$changeEvents");
             observable = new a96(a1).share();
             ObservableSource[] observableSo1 = new ObservableSource[21];
             observableSo1[0] = ry7.e(b.j0.h).map(new mk4(0));
             observableSo1[i1] = ry7.e(b.j0.i).map(new mk4(i1));
             observableSo1[2] = ry7.e(b.j0.g).map(new mk4(2));
             observableSo1[i] = ry7.e(b.j0.k).map(new nk4(b, 0));
             observableSo1[4] = ry7.e(b.j0.j).map(new nk4(b, i1));
             observableSo1[5] = ry7.e(b.j0.e).map(new mk4(i));
             observableSo1[6] = ry7.e(b.j0.f).map(new mk4(4));
             observableSo1[7] = ry7.e(b.j0.l).map(new mk4(5));
             observableSo1[8] = ry7.e(b.j0.m).map(new mk4(6));
             observableSo1[9] = ry7.e(b.j0.p).map(new jw0(20));
             observableSo1[10] = ry7.e(b.j0.q).map(new jw0(21));
             observableSo1[11] = ry7.e(b.j0.v).map(new jw0(22));
             observableSo1[12] = ry7.e(b.j0.u).map(new jw0(23));
             observableSo1[13] = ry7.e(b.j0.t).map(new jw0(24));
             observableSo1[14] = ry7.e(b.j0.c).map(new jw0(25));
             observableSo1[15] = ry7.e(b.j0.d).map(new jw0(26));
             observableSo1[16] = ry7.e(b.j0.w).map(new jw0(27));
             observableSo1[17] = observable.ofType(r96.class).map(new jw0(28));
             observableSo1[18] = observable.ofType(s96.class).map(new jw0(29));
             observableSo1[19] = b.R;
             observableSo1[20] = b.S;
             return Observable.mergeArray(observableSo1).doOnDispose(new fj7(q, 2));
           case 8:
             return observable.flatMapMaybe(new up0(i2, b));
           case 9:
             return observable.flatMapSingle(new vc5(i1, b)).onErrorReturnItem(new oc5(kg6.b, Collections.emptyMap()));
           case 10:
             return observable.switchMap(new vc5(7, b));
           case 11:
             return observable.switchMap(new sn1(b, 2));
           case 12:
             return observable.switchMap(new vc5(6, b));
           case 13:
             b.getClass();
             return observable.switchMapSingle(new dv3(b, 0));
           case 14:
             return observable.delay(10, TimeUnit.MINUTES, b).map(new l94(20));
           default:
             return observable.flatMap(new vc5(17, b));
       }
    }
}
