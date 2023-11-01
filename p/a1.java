package p.a1;
import p.yf2;
import p.c1;
import java.lang.Object;
import java.lang.String;
import io.reactivex.rxjava3.core.Completable;
import p.ja3;
import java.lang.Runnable;
import p.ok0;
import p.jk0;
import p.vu2;
import p.zg0;
import p.mq5;
import p.w51;
import p.tk0;
import p.pl0;
import p.av2;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Throwable;
import java.lang.Class;
import p.am0;

public final class a1 implements yf2	// class@000ef8 from classes.dex
{
    public final int a;
    public final c1 b;

    public void a1(c1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       mq5 omq5;
       a1 tb = this.b;
       switch (this.a){
           case 0:
             return tb.w(tb.C, p0.a);
           case 1:
             tk0 a = ((omq5 = w51.s(tb.t, p0)) == null)? tk0.a: tb.v(omq5).m();
             return a.t(p0);
             break;
           case 2:
             return new jk0(tb.u(tb.B, p0).c(Completable.j(new ja3(tb, 5, p0))), 4, new a1(tb, 3));
           default:
             tb.getClass();
             return Completable.j(new am0(27, tb));
       }
    }
}
