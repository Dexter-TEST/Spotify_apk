package p.np3;
import android.content.Context;
import java.lang.Object;
import com.spotify.lite.database.room.RecentSearchRoomDatabase;
import java.lang.Class;
import java.lang.String;
import p.vy5;
import p.b17;
import p.xy5;
import p.rk0;
import java.util.Objects;
import p.ha5;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observable;
import p.nq5;
import p.zy5;
import p.nc4;
import java.util.concurrent.Callable;
import p.v72;
import p.h16;
import p.la2;
import io.reactivex.rxjava3.core.Flowable;
import p.u82;
import p.mq5;
import java.lang.NullPointerException;
import java.lang.Exception;
import p.g16;

public final class np3	// class@002022 from classes.dex
{
    public final RecentSearchRoomDatabase a;

    public void np3(Context p0){
       super();
       this.a = b17.i(p0.getApplicationContext(), RecentSearchRoomDatabase.class, "recent-searches.db").b();
    }
    public final rk0 a(){
       np3 ta = this.a;
       Objects.requireNonNull(ta);
       return Completable.i(new ha5(6, ta)).p(s36.c);
    }
    public final Observable b(){
       nq5 onq5 = this.a.t();
       onq5.getClass();
       zy5 ozy5 = zy5.x(1, "SELECT * FROM recent_search ORDER BY timestamp DESC LIMIT ?");
       ozy5.P(1, (long)20);
       String[] stringArray = new String[]{"recent_search"};
       nc4 onc4 = new nc4(onq5, 7, ozy5);
       Scheduler c = s36.c;
       return h16.a(onq5.a, false, stringArray, onc4).v(c).y(c).x();
    }
    public final Completable c(mq5 p0){
       if (p0 == null) {
          return Completable.h(new NullPointerException());
       }
       return Completable.i(new g16(this, 3, p0)).p(s36.c);
    }
}
