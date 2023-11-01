package p.cl5;
import p.mi0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.jc;
import java.lang.String;
import java.util.Map;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import p.bl5;
import p.ir0;
import p.t81;
import p.yf2;
import com.spotify.connectivity.productstateesperanto.LoggedInProductStateClient;
import io.reactivex.rxjava3.core.Scheduler;
import p.e16;
import java.lang.Object;
import p.zo0;
import java.lang.Class;
import p.tv4;

public abstract class cl5	// class@00122e from classes.dex
{

    public static void a(mi0 p0,Disposable p1){
       p0.b("product_state_processing");
    }
    public static void b(mi0 p0,Map p1){
       p0.a("product_state_processing");
    }
    public static ObservableSource c(mi0 p0,Observable p1){
       return p1.take(1).singleOrError().doOnSubscribe(new bl5(p0, 0)).doOnSuccess(new bl5(p0, 1)).flatMapObservable(new t81(p1, 1));
    }
    public static Observable d(LoggedInProductStateClient p0,Scheduler p1,mi0 p2){
       zo0 ozo0 = p0.get().observeOn(p1).publish(new e16(6, p2)).replay(1);
       ozo0.getClass();
       return new tv4(ozo0);
    }
}
