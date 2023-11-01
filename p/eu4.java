package p.eu4;
import p.ir0;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.lang.Throwable;

public final class eu4 implements ir0	// class@0014fd from classes.dex
{
    public final int a;
    public final Observer b;

    public void eu4(Observer p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       eu4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.onNext(p0);
             return;
       }
       tb.onError(p0);
       return;
    }
}
