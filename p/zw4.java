package p.zw4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.ObservableSource;
import p.y00;
import p.ax4;
import p.fk;
import p.gq6;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Boolean;
import p.co5;

public final class zw4 extends AtomicInteger implements Disposable	// class@002f7c from classes.dex
{
    public final Observer a;
    public final y00 b;
    public final fk c;
    public final ObservableSource t;
    public final ObservableSource v;
    public final ax4[] w;
    public boolean x;
    public Object y;
    public Object z;

    public void zw4(Observer p0,int p1,ObservableSource p2,ObservableSource p3,y00 p4){
       super();
       this.a = p0;
       this.t = p2;
       this.v = p3;
       this.b = p4;
       ax4[] uoax4Array = new ax4[]{new ax4(this, 0, p1),new ax4(this, 1, p1)};
       this.w = uoax4Array;
       this.c = new fk();
    }
    public final void a(){
       ax4 t;
       ax4 v;
       ax4 v1;
       zw4 tz;
       if (this.getAndIncrement()) {
          return;
       }
       zw4 tw = this.w;
       object oobject = tw[0];
       ax4 b = oobject.b;
       object oobject1 = tw[1];
       ax4 b1 = oobject1.b;
       int i = 1;
       while (true) {
          if (this.x != null) {
             b.clear();
             b1.clear();
             return;
          }else if((t = oobject.t) != null && (v = oobject.v) != null){
             this.x = true;
             b.clear();
             b1.clear();
             this.a.onError(v);
             return;
          }else if((v = oobject1.t) != null && (v1 = oobject1.v) != null){
             this.x = true;
             b.clear();
             b1.clear();
             this.a.onError(v1);
             return;
          }else if(this.y == null){
             this.y = b.poll();
          }
          v1 = (this.y == null)? 1: 0;
          if (this.z == null) {
             this.z = b1.poll();
          }
          int i1 = ((tz = this.z) == null)? 1: 0;
          if (t != null && (v != null && (v1 && i1))) {
             this.a.onNext(Boolean.TRUE);
             this.a.onComplete();
             return;
          }else if(t != null && (v != null && v1 != i1)){
             this.x = true;
             b.clear();
             b1.clear();
             this.a.onNext(Boolean.FALSE);
             this.a.onComplete();
             return;
          }else if(!v1 && !i1){
             if (!this.b.test(this.y, tz)) {
                this.x = true;
                b.clear();
                b1.clear();
                this.a.onNext(Boolean.FALSE);
                this.a.onComplete();
                return;
             }else {
                Object obj = null;
                this.y = obj;
                this.z = obj;
             }
          }
          if (!v1 && (!i1 || (i = - i))) {
          }else {
             break ;
          }
       }
       return;
    }
    public void dispose(){
       if (this.x == null) {
          boolean b = true;
          this.x = b;
          this.c.dispose();
          if (!this.getAndIncrement()) {
             zw4 tw = this.w;
             tw[0].b.clear();
             tw[b].b.clear();
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.x;
    }
    public void subscribe(){
       zw4 tw = this.w;
       this.t.subscribe(tw[0]);
       this.v.subscribe(tw[1]);
    }
}
