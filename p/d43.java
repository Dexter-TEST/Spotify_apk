package p.d43;
import p.yf2;
import p.e43;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import com.spotify.connectivity.connectiontype.InternetState;

public final class d43 implements yf2	// class@0012d6 from classes.dex
{
    public final int a;
    public final e43 b;
    public final Throwable c;

    public void d43(e43 p0,Throwable p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object apply(Object p0){
       d43 tc = this.c;
       d43 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             e43.c(p0, tc, false);
             break;
           case 1:
             tb.getClass();
             p0 = (p0.booleanValue())? Observable.just(tb.c): tb.h.map(new d43(tb, tc, 2)).toObservable();
             return p0;
             break;
           default:
             tb.getClass();
             e43.c(p0, tc, true);
       }
       return tb.f;
    }
}
