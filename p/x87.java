package p.x87;
import p.yf2;
import p.y87;
import java.lang.Object;
import java.lang.Boolean;
import p.co3;
import p.tn6;
import io.reactivex.rxjava3.core.Observable;
import p.ko1;
import io.reactivex.rxjava3.core.Completable;
import java.util.Objects;
import p.ha5;
import p.b5;
import p.ok0;
import java.lang.Class;
import p.g16;

public final class x87 implements yf2	// class@002c2e from classes.dex
{
    public final int a;
    public final y87 b;

    public void x87(y87 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       x87 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.getClass();
             return Completable.i(new g16(tb, 21, p0));
       }
       if (p0.booleanValue()) {
          p0 = tb.c;
          p0 = p0.d.r(p0.i).switchMapCompletable(new x87(tb, 1));
       }else {
          p0 = tb.a;
          Objects.requireNonNull(p0);
          p0 = Completable.i(new ha5(27, p0));
       }
       return p0;
    }
}
