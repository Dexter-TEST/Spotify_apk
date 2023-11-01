package p.v15;
import p.yf2;
import p.y15;
import java.lang.Object;
import com.google.common.collect.c;
import java.lang.Class;
import p.s53;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Completable;
import java.util.Set;
import p.mx6;
import p.jk0;

public final class v15 implements yf2	// class@002962 from classes.dex
{
    public final int a;
    public final y15 b;

    public void v15(y15 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       v15 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             p0 = tb.a;
             p0.getClass();
             return new jk0(p0, 5, new mx6(18, p0));
       }
       tb.getClass();
       return Single.fromCallable(new s53(10, p0)).flatMapCompletable(new v15(tb, 1));
    }
}
