package p.sk4;
import p.yf2;
import p.tk4;
import java.lang.Object;
import p.sh1;
import java.lang.Class;
import p.p54;
import io.reactivex.rxjava3.core.Completable;
import p.jk0;
import p.kh1;
import p.xh1;
import p.jh1;

public final class sk4 implements yf2	// class@002647 from classes.dex
{
    public final int a;
    public final tk4 b;

    public void sk4(tk4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       sk4 tb = this.b;
       switch (this.a){
           case 0:
             return tb.a.o().m();
           case 1:
             return tb.a.l().m();
           case 2:
             tb.getClass();
             return tb.a.n(p0.m).m();
           default:
             return tb.a.i().m();
       }
    }
}
