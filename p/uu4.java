package p.uu4;
import p.xz;
import io.reactivex.rxjava3.core.Observer;
import p.yf2;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import p.zo4;
import java.lang.Throwable;
import p.yh6;

public final class uu4 extends xz	// class@002922 from classes.dex
{
    public final int w;
    public final yf2 x;

    public void uu4(Observer p0,yf2 p1,int p2){
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
       uu4 tx = this.x;
       xz ta = this.a;
       switch (this.w){
           case 0:
             if (this.t == null) {
                if (this.v != null) {
                   ta.onNext(null);
                }else {
                   p0 = tx.apply(p0);
                   Objects.requireNonNull(p0, "The mapper returned a null Optional");
                   if (zo4.A(p0)) {
                      ta.onNext(zo4.i(p0));
                   }
                }
             }
             break;
           default:
             if (this.t == null) {
                if (this.v != null) {
                   ta.onNext(null);
                }else {
                   p0 = tx.apply(p0);
                   Objects.requireNonNull(p0, "The mapper function returned a null value.");
                   ta.onNext(p0);
                }
             }
             return;
       }
       return;
    }
    public final Object poll(){
       Object obj1;
       Object obj = null;
       uu4 tx = this.x;
       switch (this.w){
           case 0:
             while ((obj1 = this.c.poll()) != null) {
                obj1 = tx.apply(obj1);
                Objects.requireNonNull(obj1, "The mapper returned a null Optional");
                if (zo4.A(obj1)) {
                   obj = zo4.i(obj1);
                   break ;
                }
             }
             break;
           default:
             if ((obj1 = this.c.poll()) != null) {
                obj = tx.apply(obj1);
                Objects.requireNonNull(obj, "The mapper function returned a null value.");
             }
             return obj;
       }
       return obj;
    }
}
