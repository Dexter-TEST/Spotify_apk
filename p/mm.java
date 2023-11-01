package p.mm;
import p.xl;
import p.v55;
import p.x55;
import p.cm;
import java.lang.String;
import io.reactivex.rxjava3.core.Observable;
import android.content.Context;
import androidx.fragment.app.Fragment;
import p.mp3;
import p.lq5;
import com.spotify.lite.database.room.RecentPlayRoomDatabase;
import java.lang.Class;
import java.lang.Object;
import p.zy5;
import p.xy5;
import p.nc4;
import java.util.concurrent.Callable;
import p.v72;
import p.h16;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.la2;
import io.reactivex.rxjava3.core.Flowable;
import p.u82;
import p.bm;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import p.yl;
import p.yf2;
import io.reactivex.rxjava3.core.ObservableTransformer;

public class mm extends xl	// class@001ec7 from classes.dex
{

    public void mm(){
       super();
    }
    public final v55 h(){
       return x55.z;
    }
    public final Observable u(cm p0,String p1){
       lq5 olq5 = p0.z.a.t();
       olq5.getClass();
       zy5 ozy5 = zy5.x(1, "SELECT * FROM recent_play ORDER BY timestamp DESC LIMIT ?");
       ozy5.P(1, (long)50);
       String[] stringArray = new String[]{"recent_play"};
       nc4 onc4 = new nc4(olq5, 6, ozy5);
       Scheduler c = s36.c;
       return Observable.combineLatest(h16.a(olq5.b, false, stringArray, onc4).v(c).y(c).x(), p0.v, new bm(13)).map(new yl(p0, this.requireContext(), false)).compose(p0.y);
    }
}
