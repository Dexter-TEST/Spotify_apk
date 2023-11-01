package p.zk5;
import p.yf2;
import p.jq3;
import java.lang.Object;
import java.lang.String;
import p.ce7;
import com.spotify.lite.database.room.UserRoomDatabase;
import java.lang.Class;
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
import io.reactivex.rxjava3.core.Observable;
import p.je7;
import java.lang.IllegalArgumentException;
import java.lang.Exception;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.g16;
import p.b5;
import p.rk0;

public final class zk5 implements yf2	// class@002f15 from classes.dex
{
    public final int a;
    public final jq3 b;

    public void zk5(jq3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       ce7 uoce7;
       zy5 ozy5;
       zk5 tb = this.b;
       switch (this.a){
           case 0:
             uoce7 = tb.a.t();
             uoce7.getClass();
             int i = 1;
             ozy5 = zy5.x(i, "SELECT * FROM user WHERE id = ?");
             if (p0 == null) {
                ozy5.z(i);
             }else {
                ozy5.s(i, p0);
             }
             break;
           default:
             tb.getClass();
             p0 = (p0 == null)? Completable.h(new IllegalArgumentException()): Completable.i(new g16(tb, 5, p0)).p(s36.c);
             return p0;
       }
       String[] stringArray = new String[]{"user"};
       Scheduler c = s36.c;
       return h16.a(uoce7.a, false, stringArray, new nc4(uoce7, 9, ozy5)).v(c).y(c).x();
    }
}
