package p.b12;
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
import p.p12;
import p.wn3;
import p.vn3;
import p.kf6;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import java.lang.Class;
import p.zy5;
import p.xy5;
import p.jf6;
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

public class b12 extends l12	// class@001032 from classes.dex
{

    public void b12(){
       super();
    }
    public final vk7 b(){
       return wk7.A;
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
       p12 v = tv.v;
       kf6 okf6 = v.a.b.A();
       okf6.getClass();
       String[] stringArray = new String[]{"images","shows","favorite_shows"};
       jf6 ojf6 = new jf6(okf6, zy5.x(0, "SELECT \n    shows.uri,\n    shows.name,\n    shows.description,\n    shows.publisher,\n    shows.created,\n    shows.explicit,\n    shows.tag\nFROM shows INNER JOIN favorite_shows ON shows.uri = favorite_shows.uri\nORDER BY shows.name COLLATE LOCALIZED ASC"), 0);
       Scheduler c = s36.c;
       wn3 b = v.b;
       b.getClass();
       return Observable.combineLatest(Observable.merge(h16.a(okf6.b, true, stringArray, ojf6).v(c).y(c).x(), Completable.i(new zn3(b, 3)).s()).distinctUntilChanged(), v.a(), new up0(2, this.requireContext())).compose(tv.z).compose(tv.x).compose(tv.w).compose(tv.A);
    }
}
