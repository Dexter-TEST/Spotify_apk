package p.ep3;
import p.ir0;
import p.t00;
import java.lang.Object;
import p.r45;
import java.lang.Throwable;
import java.lang.Boolean;
import java.util.Map;
import p.wu;

public final class ep3 implements ir0	// class@0014d0 from classes.dex
{
    public final int a;
    public final t00 b;

    public void ep3(t00 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       ep3 tb = this.b;
       switch (this.a){
           case 0:
             tb.onNext(p0);
             return;
           case 1:
             tb.onNext(p0);
             return;
           case 2:
             tb.onNext(p0);
             return;
           case 3:
             tb.onNext(p0);
             return;
           case 4:
             tb.onError(p0);
             return;
           case 5:
             tb.onNext(p0);
             return;
           case 6:
             tb.onError(p0);
             return;
           case 7:
             tb.onNext(p0);
             return;
           default:
             tb.onNext(p0);
             return;
       }
    }
}
