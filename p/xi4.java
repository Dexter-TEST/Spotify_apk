package p.xi4;
import p.ti4;
import p.we6;
import p.qi4;
import p.dp3;
import p.zg0;
import java.lang.Object;
import p.si4;
import com.spotify.lite.database.room.NetworkRoomDatabase;
import java.lang.Class;
import java.lang.String;
import p.zy5;
import p.xy5;
import p.ri4;
import java.util.concurrent.Callable;
import p.v72;
import p.h16;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.la2;
import io.reactivex.rxjava3.core.Flowable;
import p.u82;
import io.reactivex.rxjava3.core.Observable;
import p.up0;
import io.reactivex.rxjava3.core.ObservableSource;
import p.pg2;
import p.rp;
import p.bi5;
import p.rm;
import p.y00;
import p.mx6;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;
import p.yi4;
import p.ic;
import java.util.TimeZone;
import java.util.Calendar;
import java.lang.System;
import p.mi;
import com.spotify.connectivity.connectiontype.ConnectionType;
import p.wp3;
import p.tn6;
import p.ko1;
import p.bm;
import p.w00;
import java.util.Objects;
import p.ha5;
import p.b5;
import p.ok0;
import p.rk0;

public final class xi4 implements ti4	// class@002c83 from classes.dex
{
    public final we6 a;
    public final dp3 b;
    public final zg0 c;
    public final Observable d;

    public void xi4(we6 p0,qi4 p1,dp3 p2,zg0 p3){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p3;
       qi4 b = p1.b;
       si4 osi4 = b.a.t();
       osi4.getClass();
       String[] stringArray = new String[]{"network_bucket"};
       Scheduler c = s36.c;
       this.d = Observable.combineLatest(p1.c, p1.e, h16.a(osi4.a, 0, stringArray, new ri4(osi4, zy5.x(0, "SELECT SUM\(rx\) AS rx, SUM\(tx\) AS tx, last_row.timestamp\nFROM network_bucket\nINNER JOIN \(\n        SELECT timestamp\n        FROM network_bucket\n        ORDER BY timestamp DESC\n        LIMIT 1\n    \) AS last_row"), 0)).v(c).y(c).x().take(1), new up0(8, p1)).filter(new rp(9)).distinctUntilChanged(new rm(3)).map(new mx6(24, p1)).filter(new rp(10)).flatMapCompletable(new mx6(25, b)).s().share();
    }
    public final Observable a(){
       xi4 tc = this.c;
       tc.getClass();
       Calendar instance = Calendar.getInstance(TimeZone.getDefault());
       instance.setTimeInMillis(System.currentTimeMillis());
       mi.L(instance);
       long timeInMillis = mi.M(tc).getTimeInMillis();
       si4 osi4 = this.b.a.t();
       osi4.getClass();
       zy5 ozy5 = zy5.x(5, "SELECT SUM\(rx\) AS rx, SUM\(tx\) AS tx, ? AS timestamp\nFROM network_bucket\nWHERE timestamp BETWEEN ? AND ? AND\n      connection_type BETWEEN ? AND ?");
       ozy5.P(1, timeInMillis);
       ozy5.P(2, instance.getTimeInMillis());
       ozy5.P(3, timeInMillis);
       ozy5.P(4, (long)ConnectionType.CONNECTION_TYPE_GPRS.getNativeConstant());
       ozy5.P(5, (long)ConnectionType.CONNECTION_TYPE_4G.getNativeConstant());
       String[] stringArray = new String[]{"network_bucket"};
       ri4 ori4 = new ri4(osi4, ozy5, 1);
       Scheduler c = s36.c;
       return Observable.merge(this.d.cast(yi4.class), h16.a(osi4.a, false, stringArray, ori4).v(c).y(c).x());
    }
    public final Observable b(){
       xi4 ta = this.a;
       return Observable.combineLatest(ta.c.r(ta.a), this.a(), new bm(10)).distinctUntilChanged();
    }
    public final Completable clear(){
       dp3 a = this.b.a;
       Objects.requireNonNull(a);
       return Completable.i(new ha5(4, a)).p(s36.c);
    }
}
