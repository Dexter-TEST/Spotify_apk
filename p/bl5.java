package p.bl5;
import p.ir0;
import p.mi0;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cl5;
import java.util.Map;

public final class bl5 implements ir0	// class@0010ea from classes.dex
{
    public final int a;
    public final mi0 b;

    public void bl5(mi0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       bl5 tb = this.b;
       switch (this.a){
           case 0:
           default:
             cl5.b(tb, p0);
             return;
       }
       cl5.a(tb, p0);
       return;
    }
}
