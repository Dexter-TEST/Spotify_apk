package p.c43;
import p.yf2;
import p.e43;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import p.bs2;
import io.reactivex.rxjava3.core.Observable;
import p.bx5;
import p.cx5;
import java.lang.String;
import p.mp2;
import java.lang.Boolean;
import p.d43;
import io.reactivex.rxjava3.core.Single;

public final class c43 implements yf2	// class@001193 from classes.dex
{
    public final int a;
    public final e43 b;

    public void c43(e43 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       bs2 b;
       int i = 0;
       c43 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.getClass();
             return tb.h.map(new d43(tb, p0, i)).toObservable();
       }
       tb.getClass();
       if ((v0 = p0 instanceof bs2) && 502 == p0.a) {
          p0 = Observable.just(tb.d);
       }else if(v0 && ((b = p0.b) != null && Boolean.valueOf(b.a.w.a("X-Rejected-Offline-Mode")).booleanValue())){
          i = 1;
       }
       if (i) {
          p0 = Observable.just(tb.e);
       }else {
          p0 = tb.a.flatMapObservable(new d43(tb, p0, 1));
       }
       return p0;
    }
}
