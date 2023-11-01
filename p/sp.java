package p.sp;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;
import java.lang.Object;
import p.jn1;
import p.qn1;
import p.ow0;
import java.lang.Boolean;
import p.cl0;
import p.xp;
import p.pl0;

public final class sp implements yf2	// class@002678 from classes.dex
{
    public final int a;
    public final Completable b;

    public void sp(Completable p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       sp tb = this.b;
       switch (this.a){
           case 0:
           case 2:
           case 1:
             return tb.t(p0);
           case 3:
             if (!p0.booleanValue()) {
                tb = cl0.a;
             }
             return tb;
             break;
           case 4:
             return tb;
           case 5:
             return tb;
           default:
             return tb;
       }
    }
}
