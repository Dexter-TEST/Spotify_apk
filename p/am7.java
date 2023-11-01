package p.am7;
import p.ir0;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.lang.Object;
import java.lang.Throwable;
import p.hi6;

public final class am7 implements ir0	// class@000fb2 from classes.dex
{
    public final int a;
    public final SingleEmitter b;

    public void am7(SingleEmitter p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       am7 tb = this.b;
       switch (this.a){
           case 0:
       }
       tb.onError(p0);
       return;
    }
}
