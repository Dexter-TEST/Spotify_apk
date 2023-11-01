package p.g72;
import p.wz;
import p.zn0;
import p.yf2;
import p.y00;
import java.lang.Object;
import p.iv6;
import java.lang.Throwable;
import p.co5;
import p.kv6;
import p.yh6;

public final class g72 extends wz	// class@0016b2 from classes.dex
{
    public final yf2 w;
    public final y00 x;
    public Object y;
    public boolean z;

    public void g72(zn0 p0,yf2 p1,y00 p2){
       super(p0);
       this.w = p1;
       this.x = p2;
    }
    public final int b(int p0){
       return this.d(p0);
    }
    public final boolean c(Object p0){
       if (this.t != null) {
          return false;
       }
       wz ta = this.a;
       if (this.v != null) {
          return ta.c(p0);
       }
       Object obj = this.w.apply(p0);
       if (this.z != null) {
          this.y = obj;
          if (this.x.test(this.y, obj)) {
             return false;
          }
       }else {
          this.z = true;
          this.y = obj;
       }
       ta.onNext(p0);
       return true;
    }
    public final void onNext(Object p0){
       if (!this.c(p0)) {
          this.b.a(1);
       }
       return;
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
             if (this.v != true) {
                this.b.a(1);
             }
          }
       }
       this.y = obj1;
       return obj;
    }
}
