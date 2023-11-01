package p.z02;
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
import p.vp;
import p.r45;
import p.wn3;
import p.vn3;
import p.g12;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.zy5;
import p.e12;
import p.xy5;
import java.util.concurrent.Callable;
import p.v72;
import p.h16;
import p.la2;
import io.reactivex.rxjava3.core.Flowable;
import p.u82;
import p.k12;
import p.r82;
import p.bo3;
import p.zn3;
import p.b5;
import io.reactivex.rxjava3.core.ObservableSource;
import p.fh5;
import p.eh5;
import p.gr7;
import p.ug2;

public class z02 extends l12	// class@002e5f from classes.dex
{
    public tv4 A;
    public final t00 B;
    public static final int C;

    public void z02(){
       super();
       this.B = t00.a();
    }
    public final vk7 b(){
       return wk7.z;
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
       this.x.c(new rk0(b.n.s(b.a, Integer.valueOf(p0)).p(s36.c), id.a(), 1).subscribe());
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       p12 b = this.v.B;
       zo0 ozo0 = ox7.C(b.n.r(b.a)).compose(new s02(1)).replay(1);
       ozo0.getClass();
       this.A = new tv4(ozo0);
    }
    public final void onStart(){
       z02 tB = this.B;
       this.A.subscribe(tB);
       Observable observable = tB.switchMap(new mx6(9, this));
       zk b = this.y.b;
       Objects.requireNonNull(b);
       this.x.c(observable.observeOn(id.a()).distinctUntilChanged().subscribe(new r02(b, 1)));
       super.onStart();
    }
    public final Observable u(){
       l12 tv = this.v;
       tv.getClass();
       p12 v = tv.v;
       g12 og12 = v.a.b.w();
       og12.getClass();
       String[] stringArray = new String[]{"favorite_tracks"};
       e12 uoe12 = new e12(og12, zy5.x(0, "SELECT uri\nFROM favorite_tracks"), 0);
       Scheduler c = s36.c;
       wn3 b = v.b;
       b.getClass();
       fh5 uofh5 = v.a.b.y();
       uofh5.getClass();
       String[] stringArray1 = new String[]{"images","playlists","favorite_playlists","users"};
       eh5 uoeh5 = new eh5(uofh5, zy5.x(0, "SELECT \n    playlists.uri,\n    playlists.name,\n    playlists.user_uri,\n    playlists.created,\n    playlists.tag,\n    users.uri AS u_uri,\n    users.username AS u_username,\n    users.display_name AS u_display_name\nFROM playlists INNER JOIN favorite_playlists ON playlists.uri = favorite_playlists.uri\n               INNER JOIN users ON playlists.user_uri = users.uri\nORDER BY playlists.name COLLATE LOCALIZED ASC"), 0);
       b.getClass();
       return Observable.combineLatest(Observable.just(this.requireContext()), Observable.just(tv.t.a()), Observable.merge(new r82(h16.a(og12.a, 0, stringArray, uoe12).v(c).y(c), new k12(3), 0).x(), Completable.i(new zn3(b, 2)).s()).distinctUntilChanged(), Observable.merge(h16.a(uofh5.b, true, stringArray1, uoeh5).v(c).y(c).x(), Completable.i(new zn3(b, 5)).s()).distinctUntilChanged(), Observable.just(Integer.valueOf(this.B.c().intValue())), new gr7(28)).distinctUntilChanged().compose(tv.z).compose(tv.x).compose(tv.w).compose(tv.y).compose(tv.A);
    }
}
