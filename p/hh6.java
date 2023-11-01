package p.hh6;
import p.yf2;
import p.s01;
import java.lang.Object;
import p.dg6;
import p.ja3;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.TimeUnit;
import p.ml0;
import p.jk0;
import p.ug6;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import java.util.Objects;
import p.f37;
import p.cg6;

public final class hh6 implements yf2	// class@001853 from classes.dex
{
    public final int a;
    public final s01 b;

    public void hh6(s01 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       Observable observable;
       String str = "next is null";
       hh6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             observable = Observable.just(new ug6());
             Objects.requireNonNull(observable, str);
             return new f37(Completable.j(new ja3(tb, 20, p0)).q(3000, TimeUnit.MILLISECONDS).m(), 3, observable);
       }
       observable = Observable.just(new ug6());
       Objects.requireNonNull(observable, str);
       return new f37(Completable.j(new ja3(tb, 21, p0)).q(3000, TimeUnit.MILLISECONDS).m(), 3, observable);
    }
}
