package p.fv3;
import p.yf2;
import p.gv3;
import java.lang.Object;
import p.lt3;
import java.util.Objects;
import p.jg1;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.TimeUnit;
import p.ml0;
import p.l94;
import p.jk0;
import p.w24;
import p.nt3;
import p.ja3;
import p.wt3;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import p.f37;

public final class fv3 implements yf2	// class@001645 from classes.dex
{
    public final int a;
    public final gv3 b;

    public void fv3(gv3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       long l = 3000;
       fv3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             Observable observable = Observable.just(new wt3());
             Objects.requireNonNull(observable, "next is null");
             return new f37(Completable.j(new ja3(tb, 14, p0)).q(l, TimeUnit.MILLISECONDS).m(), 3, observable);
       }
       Objects.requireNonNull(tb);
       return new w24(2, new jk0(Completable.j(new jg1(5, tb)).q(l, TimeUnit.MILLISECONDS), 4, new l94(13)));
    }
}
