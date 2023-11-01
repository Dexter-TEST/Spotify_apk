package p.xn3;
import p.yf2;
import p.bo3;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.util.ArrayList;
import java.util.Iterator;
import p.r05;
import java.lang.String;
import p.aq6;
import p.td7;
import p.yp6;
import java.util.Collections;
import p.vn3;
import p.sn3;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.jm3;
import p.vf;
import java.lang.Iterable;
import io.reactivex.rxjava3.core.Observable;
import p.mx6;
import java.util.Objects;
import p.kx6;
import p.cm7;
import p.k12;
import p.xy;
import p.u00;
import io.reactivex.rxjava3.core.Single;
import p.yn3;
import p.h12;
import p.jk0;
import p.tu6;
import p.bm;
import p.bi5;
import p.ao3;
import p.mp;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Maybe;
import p.k34;
import io.reactivex.rxjava3.core.MaybeSource;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import p.a44;
import p.if4;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import p.zp3;

public final class xn3 implements yf2	// class@002caf from classes.dex
{
    public final int a;
    public final bo3 b;

    public void xn3(bo3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       bo3 a;
       bo3 a1;
       aq6 uoaq6;
       int i = 1;
       int i1 = 12;
       int i2 = 8;
       int i3 = 5;
       int i4 = 6;
       xn3 tb = this.b;
       switch (this.a){
           case 0:
             a = tb.a;
             Objects.requireNonNull(a);
             return tb.e.a().flatMapCompletable(new yn3(a, 4)).n(new bm(23));
           case 1:
             p0 = tb.d;
             a = tb.a;
             Objects.requireNonNull(a);
             return tu6.z(p0.j(), new kx6(p0, i3)).flatMapCompletable(new yn3(a, 2)).n(new bm(20));
           case 2:
             if4 11 = new if4(tb.d.c().map(new k12(i3)), new k12(11), new k12(i1), new xn3(tb, i2), 1);
             a = tb.a;
             Objects.requireNonNull(a);
             return Single.create(11).flatMapCompletable(new yn3(a, i3)).n(new bm(24));
           case 3:
             p0 = tb.d;
             a = tb.a;
             Objects.requireNonNull(a);
             return tu6.z(p0.s(), new kx6(p0, i4)).flatMapCompletable(new yn3(a, 3)).n(new bm(21));
           case 4:
             p0 = tb.f;
             Objects.requireNonNull(p0);
             p0 = Single.fromCallable(new ao3(p0, 0)).filter(new bm(25));
             p0.getClass();
             k34 ok34 = new k34(p0, new k12(i2), i);
             p0 = Single.error(new IllegalStateException("Current username is empty"));
             Objects.requireNonNull(p0, "other is null");
             a44 i5 = new a44(ok34, 0, p0);
             p0 = i5.map(new k12(4));
             a = tb.b;
             Objects.requireNonNull(a);
             a = tb.a;
             Objects.requireNonNull(a);
             return p0.flatMap(new mx6(i1, a)).flatMapCompletable(new yn3(a, 0)).n(new bm(18));
           case 5:
             p0 = tb.d;
             a1 = tb.a;
             Objects.requireNonNull(a1);
             return tu6.z(p0.q(), new kx6(p0, 4)).flatMapCompletable(new yn3(a1, i)).n(new bm(19));
           case 6:
             return tb.a();
           case 7:
             tb.getClass();
             ArrayList uArrayList = new ArrayList(p0.size());
             p0 = p0.iterator();
             while (p0.hasNext()) {
                if ((uoaq6 = td7.d(p0.next().m)) != null && uoaq6.b == yp6.m0) {
                   uArrayList.add(uoaq6.t);
                }
             }
             a1 = tb.a;
             if (uArrayList.isEmpty()) {
                a1.getClass();
                p0 = Completable.i(new sn3(a1, Collections.emptyList(), i3));
             }else {
                bo3 d = tb.d;
                Objects.requireNonNull(d);
                Objects.requireNonNull(a1);
                p0 = Observable.fromIterable(new jm3(50, uArrayList)).map(new mx6(13, new vf(String.valueOf(',')))).flatMapSingle(new kx6(d, 7)).map(new k12(7)).collectInto(new ArrayList(uArrayList.size()), new xy()).flatMapCompletable(new yn3(a1, i4));
             }
             return p0;
             break;
           default:
             return tb.d.a(p0).map(new k12(i4));
       }
    }
}
