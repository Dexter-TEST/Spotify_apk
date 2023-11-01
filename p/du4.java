package p.du4;
import p.yf2;
import java.lang.Object;
import io.reactivex.rxjava3.core.ObservableSource;
import p.kz6;
import java.lang.String;
import java.util.Objects;
import java.lang.Iterable;
import p.vv4;
import p.jh2;
import io.reactivex.rxjava3.core.Observable;

public final class du4 implements yf2	// class@0013bb from classes.dex
{
    public final int a;
    public final yf2 b;

    public void du4(yf2 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource a(Object p0){
       du4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             Object obj = tb.apply(p0);
             Objects.requireNonNull(obj, "The itemDelay returned a null ObservableSource");
             vv4 ovv4 = new vv4(obj, 1, 2);
             return ovv4.map(new jh2(p0)).defaultIfEmpty(p0);
       }
       p0 = tb.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null Iterable");
       return new kz6(8, p0);
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
           default:
             return this.a(p0);
       }
       return this.a(p0);
    }
}
