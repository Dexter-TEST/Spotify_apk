package p.ki3;
import p.yf2;
import com.spotify.litenavigation.launcher.LauncherActivity;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import p.mi3;
import p.eq3;
import io.reactivex.rxjava3.core.Single;
import p.xl6;
import io.reactivex.rxjava3.core.Completable;
import p.li3;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.rk0;

public final class ki3 implements yf2	// class@001c1b from classes.dex
{
    public final int a;
    public final LauncherActivity b;

    public void ki3(LauncherActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       ki3 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             p0 = (p0.booleanValue())? tb.S.v.b().map(new xl6(6)).onErrorReturn(new xl6(7)).flatMapCompletable(new ki3(tb, 1)): Completable.i(new li3(tb, 0)).p(id.a());
             break;
           default:
             tb.getClass();
             p0 = (p0.booleanValue())? Completable.i(new li3(tb, 1)).p(id.a()): Completable.i(new li3(tb, 2)).p(id.a());
             return p0;
       }
       return p0;
    }
}
