package p.kd1;
import java.lang.Runnable;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.iv6;

public final class kd1 implements Runnable	// class@00027c from classes2.dex
{
    public final int a;
    public final Object b;

    public void kd1(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void run(){
       kd1 tb = this.b;
       switch (this.a){
           case 0:
             tb.onComplete();
             return;
           case 1:
             tb.onComplete();
             return;
           case 2:
             tb.onComplete();
             return;
           default:
             tb.onComplete();
             return;
       }
    }
}
