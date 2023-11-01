package p.lx6;
import p.yf2;
import p.fa4;
import java.lang.Object;
import p.oh1;
import java.lang.Class;
import p.wm7;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.gx6;
import p.pl0;
import p.e16;
import io.reactivex.rxjava3.core.Single;
import p.tg1;
import p.z94;
import p.aq6;
import p.ks0;
import java.util.concurrent.Callable;
import p.hx6;
import io.reactivex.rxjava3.core.Observable;
import p.rh1;
import p.ca4;
import java.util.List;
import java.util.Collection;
import p.fx6;
import p.nh1;
import java.util.Map;
import com.google.common.collect.d;
import com.google.common.collect.g;
import java.util.AbstractCollection;
import p.ut;
import p.al5;
import io.reactivex.rxjava3.core.Maybe;
import p.pp;
import p.k34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.ws3;
import p.z24;
import p.a44;
import p.qh1;
import p.aa4;
import com.spotify.webapi.service.models.ShowSimple;
import p.mh1;
import p.y94;
import p.ph1;
import p.ba4;
import com.spotify.webapi.service.models.Playlist;

public final class lx6 implements yf2	// class@001de3 from classes.dex
{
    public final int a;
    public final fa4 b;

    public void lx6(fa4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       Single obj = null;
       int i = 1;
       int i1 = 26;
       int i2 = 0;
       lx6 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return Single.fromCallable(new y94(tb, p0.D, p0.E, i2)).map(new pp(i1)).onErrorReturn(new e16(18, p0));
           case 1:
             tb.getClass();
             return Single.fromCallable(new aa4(tb, p0.D, p0.E, i2)).map(new fx6(6)).onErrorReturn(new e16(i1, p0));
           case 2:
             nh1 d = p0.D;
             tb.getClass();
             nh1 e = p0.E;
             if (d.isEmpty()) {
                obj = Single.just(fa4.a(e, g.A));
             }else {
                Maybe maybe = tb.b.c.distinctUntilChanged().firstElement();
                maybe.getClass();
                k34 ok34 = new k34(maybe, new pp(22), i);
                a44 uoa44 = new a44(new z24(ok34, 2, new ws3(tb, d, e, 4)), i, obj);
             }
             return obj.map(new fx6(4)).onErrorReturn(new e16(24, p0));
             break;
           case 3:
             tb.getClass();
             return Single.fromCallable(new ca4(tb, p0.D, p0.E, i2)).map(new fx6(5)).onErrorReturn(new e16(25, p0));
           case 4:
             tb.getClass();
             return Single.fromCallable(new z94(tb, p0.D, p0.E, i2)).flatMapObservable(new hx6(p0, i2)).onErrorReturn(new hx6(p0, i));
           case 5:
             tb.getClass();
             return new pl0(Completable.i(new wm7(tb, p0.D, p0.E, i)), new gx6(), obj, i2).onErrorReturn(new e16(23, p0));
           default:
             tb.getClass();
             return Single.fromCallable(new ba4(tb, p0.D, p0.E, i2)).map(new pp(28)).onErrorReturn(new e16(20, p0));
       }
    }
}
