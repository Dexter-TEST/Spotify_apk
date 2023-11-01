package p.on1;
import p.yf2;
import p.qn1;
import io.reactivex.rxjava3.core.Completable;
import java.lang.Object;
import p.jn1;
import p.co3;
import p.tn6;
import io.reactivex.rxjava3.core.Observable;
import p.ko1;
import io.reactivex.rxjava3.core.Maybe;
import p.ab0;
import java.lang.Class;
import p.c34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.bi5;
import p.jk0;
import java.lang.Boolean;
import p.ok0;

public final class on1 implements yf2	// class@002152 from classes.dex
{
    public final int a;
    public final qn1 b;
    public final Completable c;

    public void on1(qn1 p0,Completable p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object apply(Object p0){
       on1 tc = this.c;
       on1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             p0 = tb.v;
             return p0.a.s(p0.i, Boolean.TRUE).c(tc);
       }
       p0 = tb.v;
       p0 = p0.a.r(p0.i).firstElement();
       p0.getClass();
       c34 uoc34 = new c34(p0, new ab0(18), 0);
       return new jk0(uoc34, 5, new on1(tb, tc, 1));
    }
}
