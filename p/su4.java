package p.su4;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleObserver;
import p.ru4;
import io.reactivex.rxjava3.core.Observer;
import p.ex4;

public final class su4 extends Single	// class@0026a0 from classes.dex
{
    public final int a;
    public final ObservableSource b;
    public final Object c;

    public void su4(ObservableSource p0,Object p1,int p2){
       this.a = p2;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribeActual(SingleObserver p0){
       su4 tb = this.b;
       su4 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tb.subscribe(new ex4(p0, tc));
             return;
       }
       tb.subscribe(new ru4(p0, tc));
       return;
    }
}
