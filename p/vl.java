package p.vl;
import p.yf2;
import p.xl;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import p.i77;
import p.rv;
import java.lang.String;
import p.cm;
import io.reactivex.rxjava3.core.Completable;
import p.zg5;
import p.ja3;
import java.lang.Runnable;
import p.ok0;
import p.jk0;
import p.cv2;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Throwable;

public final class vl implements yf2	// class@002a1e from classes.dex
{
    public final int a;
    public final xl b;

    public void vl(xl p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       vl tb = this.b;
       switch (this.a){
           case 0:
             return tb.u(tb.A, tb.D);
           case 1:
             xl a = tb.A;
             a.getClass();
             return new jk0(tb.A.x.a(tb.D, p0).c(Completable.j(new ja3(a, 10, p0))).c(tb.y), 4, new vl(tb, 3));
           case 2:
             tb.getClass();
             int i = (p0.booleanValue())? 0x7f120055: 0x7f120056;
             return rv.a(i).l();
             break;
           default:
             return tb.z;
       }
    }
}
