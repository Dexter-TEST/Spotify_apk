package p.i55;
import java.util.function.Function;
import java.lang.Object;
import p.oe;
import java.lang.String;
import io.reactivex.rxjava3.core.Observable;

public final class i55 implements Function	// class@00192b from classes.dex
{
    public final int a;

    public void i55(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
           default:
             return Observable.just(p0);
       }
       return p0.b();
    }
}
