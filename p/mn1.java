package p.mn1;
import p.yf2;
import p.gr0;
import p.qn1;
import java.lang.Object;
import p.ef5;
import p.in1;
import p.an5;
import p.ff5;
import p.hn1;
import p.cf5;
import p.gn1;
import p.cn1;
import p.aq6;
import io.reactivex.rxjava3.core.Completable;
import p.bo1;
import p.jk0;
import p.dn1;
import java.lang.Throwable;
import java.lang.Class;
import p.oo3;
import java.lang.Runnable;
import p.ok0;

public final class mn1 implements yf2, gr0	// class@001ec9 from classes.dex
{
    public final int a;
    public final qn1 b;

    public void mn1(qn1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       mn1 tb = this.b;
       switch (this.a){
           case 0:
             tb.A.onNext(new hn1());
             return;
           case 1:
             tb.A.onNext(new in1());
             return;
           default:
             tb.A.onNext(new gn1());
             return;
       }
    }
    public Object apply(Object p0){
       boolean b = false;
       mn1 tb = this.b;
       switch (this.a){
           case 0:
             return tb.C.e(p0.a, true).m();
           case 1:
             return new jk0(tb.C.e(p0.a, b), 4, new mn1(tb, 2));
           default:
             p0 = tb.D;
             p0.getClass();
             return Completable.j(new oo3(b, p0, b));
       }
    }
}
