package p.dt4;
import io.reactivex.rxjava3.core.Observable;
import p.yf2;
import io.reactivex.rxjava3.core.Observer;
import p.jl1;
import p.zv6;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.stream.Stream;
import p.kz6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Throwable;
import p.kg4;
import p.ct4;
import p.uu4;

public final class dt4 extends Observable	// class@0013b2 from classes.dex
{
    public final int a;
    public final Observable b;
    public final yf2 c;

    public void dt4(Observable p0,yf2 p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       Object obj;
       Object obj1;
       dt4 tc = this.c;
       dt4 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.subscribe(new uu4(p0, tc, 0));
             return;
       }
       jl1 a = jl1.a;
       if (tb instanceof zv6) {
          if ((obj = tb.get()) != null) {
             obj1 = tc.apply(obj);
             Objects.requireNonNull(obj1, "The mapper returned a null Stream");
          }else {
             obj1 = null;
          }
          if (obj1 != null) {
             kz6.a(p0, obj1);
          }else {
             p0.onSubscribe(a);
             p0.onComplete();
          }
       }else {
          tb.subscribe(new ct4(p0, tc));
       }
       return;
    }
}
