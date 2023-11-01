package p.st6;
import p.yf2;
import com.spotify.litesettings.settings.StorageSettingsActivity;
import java.lang.Object;
import p.ut6;
import p.p54;
import io.reactivex.rxjava3.core.Completable;
import p.jk0;
import p.eq3;
import io.reactivex.rxjava3.core.Single;
import p.cq3;
import io.reactivex.rxjava3.core.Observable;
import p.ox7;
import p.tt6;
import io.reactivex.rxjava3.core.Flowable;
import p.ew0;
import p.jg1;
import java.lang.Runnable;
import p.ok0;

public final class st6 implements yf2	// class@002699 from classes.dex
{
    public final int a;
    public final StorageSettingsActivity b;

    public void st6(StorageSettingsActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       int i = 1;
       st6 tb = this.b;
       switch (this.a){
           case 0:
             p0 = tb.T;
             return p0.t.c().repeatWhen(new tt6(p0, i)).x();
           case 1:
             p0 = tb.T;
             ut6 v = p0.v;
             ut6 t = p0.t;
             return ox7.B(p0.y.c(v.q().m().c(t.b().map(new cq3(t, 2)).flatMapCompletable(new cq3(t, i))).c(v.b())));
           default:
             p0 = tb.T;
             return p0.w.b().c(p0.v.b()).c(Completable.j(new jg1(3, p0))).c(p0.y);
       }
    }
}
