package p.as4;
import p.xz;
import io.reactivex.rxjava3.core.Observer;
import p.yf2;
import java.util.Collection;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import p.yh6;

public final class as4 extends xz	// class@000fe3 from classes.dex
{
    public final Collection w;
    public final yf2 x;

    public void as4(Observer p0,yf2 p1,Collection p2){
       super(p0);
       this.x = p1;
       this.w = p2;
    }
    public final int b(int p0){
       return this.c(p0);
    }
    public final void clear(){
       this.w.clear();
       super.clear();
    }
    public final void onComplete(){
       if (this.t == null) {
          this.t = true;
          this.w.clear();
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.t != null) {
          RxJavaPlugins.c(p0);
       }else {
          this.t = true;
          this.w.clear();
          this.a.onError(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.t != null) {
          return;
       }
       xz ta = this.a;
       if (this.v == null) {
          Object obj = this.x.apply(p0);
          Objects.requireNonNull(obj, "The keySelector returned a null key");
          if (this.w.add(obj)) {
             ta.onNext(p0);
          }
       }else {
          ta.onNext(null);
       }
       return;
    }
    public final Object poll(){
       Object obj;
       while ((obj = this.c.poll()) == null) {
          Object obj1 = this.x.apply(obj);
          Objects.requireNonNull(obj1, "The keySelector returned a null key");
          if (this.w.add(obj1) || (obj = this.c.poll()) == null) {
             break ;
          }else {
          }
       }
       return obj;
    }
}
