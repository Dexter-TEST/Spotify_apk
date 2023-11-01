package p.wi4;
import p.ti4;
import android.content.Context;
import p.we6;
import p.zg0;
import java.lang.Object;
import java.lang.String;
import android.app.usage.NetworkStatsManager;
import p.yi4;
import java.lang.Class;
import android.app.usage.NetworkStats$Bucket;
import android.app.usage.NetworkStats;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Observable;
import p.up0;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.mx6;
import p.yf2;
import p.wp3;
import p.tn6;
import p.ko1;
import p.bm;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import io.reactivex.rxjava3.core.Completable;
import p.tk0;

public final class wi4 implements ti4	// class@002b42 from classes.dex
{
    public final NetworkStatsManager a;
    public final we6 b;
    public final zg0 c;

    public void wi4(Context p0,we6 p1,zg0 p2){
       super();
       this.a = p0.getSystemService("netstats");
       this.b = p1;
       this.c = p2;
    }
    public static yi4 c(wi4 p0,long p1,long p2){
       p0.getClass();
       NetworkStats$Bucket uBucket = new NetworkStats$Bucket();
       NetworkStats networkStats = p0.a.querySummary(0, null, p1, p2);
       p1 = 0;
       long l = p1;
       while (networkStats.hasNextBucket()) {
          networkStats.getNextBucket(uBucket);
          p1 = p1 + uBucket.getRxBytes();
          l = l + uBucket.getTxBytes();
       }
       networkStats.close();
       yi4 oyi4 = new yi4();
       oyi4.c = p2;
       oyi4.a = p1;
       oyi4.b = l;
       return oyi4;
    }
    public final Observable a(){
       return Observable.create(new up0(3, this)).subscribeOn(s36.c).switchMap(new mx6(26, this));
    }
    public final Observable b(){
       wi4 tb = this.b;
       return Observable.combineLatest(tb.c.r(tb.a), this.a(), new bm(9)).distinctUntilChanged();
    }
    public final Completable clear(){
       return tk0.a;
    }
}
