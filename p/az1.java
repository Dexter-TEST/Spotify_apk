package p.az1;
import p.yf2;
import p.bz1;
import java.lang.Object;
import p.ty1;
import java.lang.Class;
import p.c;
import p.vp;
import java.lang.String;
import io.reactivex.rxjava3.core.Single;
import p.jh6;
import p.xy1;
import p.ja3;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.TimeUnit;
import p.ml0;
import p.jk0;
import p.fz1;
import io.reactivex.rxjava3.core.Observable;
import java.util.Objects;
import p.f37;

public final class az1 implements yf2	// class@00101e from classes.dex
{
    public final int a;
    public final bz1 b;

    public void az1(bz1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       az1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             Observable observable = Observable.just(new fz1());
             Objects.requireNonNull(observable, "next is null");
             return new f37(Completable.j(new ja3(tb, 22, p0)).q(3000, TimeUnit.MILLISECONDS).m(), 3, observable);
       }
       tb.getClass();
       p0 = p0.H;
       return tb.a.d(p0.a, p0.b).map(new jh6(8)).onErrorReturn(new jh6(9));
    }
}
