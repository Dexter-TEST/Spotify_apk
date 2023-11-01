package p.t02;
import p.l12;
import p.t00;
import p.vk7;
import p.wk7;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import p.p12;
import p.wp3;
import p.tn6;
import p.ok0;
import p.ko1;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;
import io.reactivex.rxjava3.core.Completable;
import p.id;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fn0;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import p.ox7;
import p.s02;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.zo0;
import java.lang.Class;
import p.tv4;
import io.reactivex.rxjava3.core.Observer;
import p.mx6;
import p.yf2;
import p.zk;
import com.spotify.hubs.liteintegration.HubsView;
import java.util.Objects;
import p.r02;
import p.ir0;
import android.content.Context;
import p.wn3;
import p.vn3;
import p.j8;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.zy5;
import p.xy5;
import p.i8;
import java.util.concurrent.Callable;
import p.v72;
import p.h16;
import p.la2;
import io.reactivex.rxjava3.core.Flowable;
import p.u82;
import p.bo3;
import p.zn3;
import p.b5;
import io.reactivex.rxjava3.core.ObservableSource;
import p.gr7;
import p.pg2;

public class t02 extends l12	// class@0026d3 from classes.dex
{
    public tv4 A;
    public final t00 B;
    public static final int C;

    public void t02(){
       super();
       this.B = t00.a();
    }
    public final vk7 b(){
       return wk7.x;
    }
    public final HashMap j(){
       HashMap hashMap = new HashMap();
       hashMap.put(Integer.valueOf(R.id.sort_alphabetical), this.getString(R.string.sort_alphabetical));
       hashMap.put(Integer.valueOf(R.id.sort_creator), this.getString(R.string.sort_creator));
       return hashMap;
    }
    public final void o(int p0){
       this.B.onNext(Integer.valueOf(p0));
       p12 b = this.v.B;
       this.x.c(new rk0(b.o.s(b.a, Integer.valueOf(p0)).p(s36.c), id.a(), 1).subscribe());
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       p12 b = this.v.B;
       zo0 ozo0 = ox7.C(b.o.r(b.a)).compose(new s02(0)).replay(1);
       ozo0.getClass();
       this.A = new tv4(ozo0);
    }
    public final void onStart(){
       t02 tB = this.B;
       this.A.subscribe(tB);
       Observable observable = tB.switchMap(new mx6(8, this));
       zk b = this.y.b;
       Objects.requireNonNull(b);
       this.x.c(observable.observeOn(id.a()).distinctUntilChanged().subscribe(new r02(b, 0)));
       super.onStart();
    }
    public final Observable u(){
       l12 tv = this.v;
       tv.getClass();
       p12 v = tv.v;
       j8 oj8 = v.a.b.t();
       oj8.getClass();
       String[] stringArray = new String[]{"images","album_artists","artists","albums","favorite_albums"};
       i8 oi8 = new i8(oj8, zy5.x(0, "SELECT \n    albums.uri,\n    albums.name,\n    albums.created,\n    albums.tag\nFROM albums INNER JOIN favorite_albums ON albums.uri = favorite_albums.uri\nORDER BY albums.name COLLATE LOCALIZED ASC"), 0);
       Scheduler c = s36.c;
       wn3 b = v.b;
       b.getClass();
       return Observable.combineLatest(Observable.just(this.requireContext()), Observable.merge(h16.a(oj8.b, true, stringArray, oi8).v(c).y(c).x(), Completable.i(new zn3(b, 0)).s()).distinctUntilChanged(), Observable.just(Integer.valueOf(this.B.c().intValue())), new gr7(29)).compose(tv.z).compose(tv.x).compose(tv.w).compose(tv.y).compose(tv.A);
    }
}
