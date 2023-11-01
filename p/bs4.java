package p.bs4;
import p.xz;
import io.reactivex.rxjava3.core.Observer;
import p.yf2;
import p.y00;
import java.lang.Object;
import java.lang.Throwable;
import p.yh6;

public final class bs4 extends xz	// class@001127 from classes.dex
{
    public final yf2 w;
    public final y00 x;
    public Object y;
    public boolean z;

    public void bs4(Observer p0,yf2 p1,y00 p2){
       super(p0);
       this.w = p1;
       this.x = p2;
    }
    public final int b(int p0){
       return this.c(p0);
    }
    public final void onNext(Object p0){
       if (this.t != null) {
          return;
       }
       xz ta = this.a;
       if (this.v != null) {
          ta.onNext(p0);
          return;
       }else {
          Object obj = this.w.apply(p0);
          if (this.z != null) {
             this.y = obj;
             if (this.x.test(this.y, obj)) {
                return;
             }
          }else {
             this.z = true;
             this.y = obj;
          }
          ta.onNext(p0);
          return;
       }
    }
    public final Object poll(){
       Object obj;
       Object obj1;
       while (true) {
          if ((obj = this.c.poll()) == null) {
             return null;
          }
          obj1 = this.w.apply(obj);
          if (this.z == null) {
             this.z = true;
             this.y = obj1;
             return obj;
          }else if(!this.x.test(this.y, obj1)){
             break ;
          }else {
             this.y = obj1;
          }
       }
       this.y = obj1;
       return obj;
    }
}
