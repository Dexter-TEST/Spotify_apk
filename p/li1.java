package p.li1;
import p.yf2;
import p.qf7;
import java.lang.Object;
import p.ei1;
import p.tf6;
import java.lang.Class;
import java.lang.String;
import p.co5;
import io.reactivex.rxjava3.core.Single;
import p.rh6;
import p.d16;
import p.v05;
import p.ir0;
import p.mi1;
import p.a05;
import p.x75;

public final class li1 implements yf2	// class@001d5a from classes.dex
{
    public final int a;
    public final qf7 b;

    public void li1(qf7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       qf7 a1;
       li1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             x75 a2 = p0.a;
             a1 = tb.a;
             a1.getClass();
             co5.o(a2, "password");
             return a1.a.d(a1.c, a2).map(new d16(a2, 10)).doOnError(new v05(21)).onErrorReturn(new mi1(1, p0)).map(new a05(21));
       }
       ei1 a = p0.a;
       a1 = tb.a;
       a1.getClass();
       co5.o(a, "email");
       return a1.a.f(a1.c, a).map(new d16(a, 11)).doOnError(new v05(20)).onErrorReturn(new mi1(0, p0)).map(new a05(20));
    }
}
