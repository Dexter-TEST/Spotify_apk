package p.ct6;
import p.yf2;
import com.spotify.liteappstorage.files.StorageLocationMovingService;
import java.lang.Object;
import p.tv;
import p.ud4;
import java.lang.Class;
import p.jr3;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Completable;
import p.jk0;
import p.wt;
import android.app.Notification;
import p.r8;

public final class ct6 implements yf2	// class@001275 from classes.dex
{
    public final int a;
    public final StorageLocationMovingService b;

    public void ct6(StorageLocationMovingService p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       StorageLocationMovingService c;
       ct6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             c = tb.x;
             wt c3 = p0.c;
             wt b = p0.b;
             if (!(b)) {
                p0 = c.b(100);
             }else {
                c.getClass();
                p0 = c.b((int)((c3 * 100) / b));
             }
             return p0;
       }
       c = tb.c;
       c.getClass();
       Scheduler c1 = s36.c;
       StorageLocationMovingService c2 = tb.c;
       c2.getClass();
       return Single.fromCallable(new jr3(c, 2, p0.i)).subscribeOn(c1).ignoreElement().c(Single.fromCallable(new jr3(c2, 2, p0.j)).subscribeOn(c1).ignoreElement());
    }
}
