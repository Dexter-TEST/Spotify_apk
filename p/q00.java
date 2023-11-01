package p.q00;
import io.reactivex.rxjava3.disposables.Disposable;
import p.bi5;
import io.reactivex.rxjava3.core.Observer;
import p.r00;
import java.lang.Object;
import p.yj;

public final class q00 implements Disposable, bi5	// class@002304 from classes.dex
{
    public final Observer a;
    public final r00 b;
    public boolean c;
    public boolean t;
    public yj v;
    public boolean w;
    public boolean x;
    public long y;

    public void q00(Observer p0,r00 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       q00 tv;
       object oobject;
       while (true) {
          if (this.x != null) {
             return;
          }
          _monitor_enter(this);
          if ((tv = this.v) == null) {
             break ;
          }else {
             this.v = null;
             _monitor_exit(this);
             yj a = tv.a;
             while (a != null) {
                for (int i = 0; i < 4 && (oobject = a[i]) != null; i = i + 1) {
                   this.test(oobject);
                }
                a = a[4];
             }
          }
       }
       this.t = false;
       _monitor_exit(this);
       return;
    }
    public void dispose(){
       if (this.x == null) {
          this.x = true;
          this.b.a(this);
       }
       return;
    }
    public boolean isDisposed(){
       return this.x;
    }
    public final boolean test(Object p0){
       if (this.x == null) {
          this.a.onNext(p0);
       }
       return false;
    }
}
