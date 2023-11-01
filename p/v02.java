package p.v02;
import p.l12;
import p.vk7;
import p.wk7;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import android.content.Context;
import java.lang.Class;
import p.p12;
import p.wn3;
import p.vn3;
import p.zk;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.zy5;
import p.xy5;
import p.yk;
import java.util.concurrent.Callable;
import p.v72;
import p.h16;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.la2;
import io.reactivex.rxjava3.core.Flowable;
import p.u82;
import p.bo3;
import p.zn3;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.up0;
import p.w00;
import io.reactivex.rxjava3.core.ObservableTransformer;

public class v02 extends l12	// class@002955 from classes.dex
{

    public void v02(){
       super();
    }
    public final vk7 b(){
       return wk7.y;
    }
    public final HashMap j(){
       HashMap hashMap = new HashMap();
       hashMap.put(Integer.valueOf(R.id.sort_alphabetical), this.getString(R.string.sort_alphabetical));
       hashMap.put(Integer.valueOf(R.id.sort_creator), this.getString(R.string.sort_creator));
       return hashMap;
    }
    public final void o(int p0){
    }
    public final Observable u(){
       l12 tv = this.v;
       tv.getClass();
       p12 v = tv.v;
       zk ozk = v.a.b.u();
       ozk.getClass();
       String[] stringArray = new String[]{"images","artists","favorite_artists"};
       yk oyk = new yk(ozk, zy5.x(0, "SELECT \n    artists.uri,\n    artists.name,\n    artists.created,\n    artists.tag\nFROM artists INNER JOIN favorite_artists ON artists.uri = favorite_artists.uri\nORDER BY artists.name COLLATE LOCALIZED ASC"), 0);
       Scheduler c = s36.c;
       wn3 b = v.b;
       b.getClass();
       return Observable.combineLatest(Observable.just(this.requireContext()), Observable.merge(h16.a(ozk.a, true, stringArray, oyk).v(c).y(c).x(), Completable.i(new zn3(b, true)).s()).distinctUntilChanged(), new up0(true, tv)).compose(tv.z).compose(tv.x).compose(tv.w).compose(tv.A);
    }
}
