package p.cs4;
import p.xz;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import p.ir0;
import java.lang.Throwable;
import p.bi5;
import p.yh6;

public final class cs4 extends xz	// class@00126a from classes.dex
{
    public final int w;
    public final Object x;

    public void cs4(Observer p0,Object p1,int p2){
       this.w = p2;
       this.x = p1;
    }
    public final int b(int p0){
       switch (this.w){
           case 0:
           default:
             return this.c(p0);
       }
       return this.c(p0);
    }
    public final void onNext(Object p0){
       cs4 tx = this.x;
       xz ta = this.a;
       switch (this.w){
           case 0:
             ta.onNext(p0);
             if (this.v == null) {
                tx.accept(p0);
             }
             break;
           default:
             if (this.v == null) {
                if (tx.test(p0)) {
                   ta.onNext(p0);
                }
             }else {
                ta.onNext(null);
             }
             return;
       }
       return;
    }
    public final Object poll(){
       Object obj;
       cs4 tx = this.x;
       switch (this.w){
           case 0:
             break;
           default:
             do {
             } while ((obj = this.c.poll()) != null && !tx.test(obj));
             return obj;
       }
       if ((obj = this.c.poll()) != null) {
          tx.accept(obj);
       }
       return obj;
    }
}
