package p.gl4;
import p.yf2;
import androidx.fragment.app.k;
import java.lang.Object;
import p.tl4;
import p.il4;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.jk0;
import p.sl4;
import p.hl4;

public final class gl4 implements yf2	// class@00172f from classes.dex
{
    public final int a;
    public final k b;

    public void gl4(k p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       gl4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return Completable.j(new hl4(tb, 0)).m();
       }
       return Completable.j(new il4(tb, p0, 0)).m();
    }
}
