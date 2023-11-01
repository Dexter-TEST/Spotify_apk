package p.s00;
import io.reactivex.rxjava3.disposables.Disposable;
import p.xj;
import io.reactivex.rxjava3.core.Observer;
import p.t00;
import java.lang.Object;
import p.kb3;
import p.ak4;

public final class s00 implements Disposable, xj	// class@00258f from classes.dex
{
    public final Observer a;
    public final t00 b;
    public boolean c;
    public boolean t;
    public kb3 v;
    public boolean w;
    public boolean x;
    public long y;

    public void s00(Observer p0,t00 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       s00 tv;
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
             tv.e(this);
          }
       }
       this.t = false;
       _monitor_exit(this);
       return;
    }
    public final void b(long p0,Object p1){
       s00 tv;
       if (this.x != null) {
          return;
       }
       if (this.w == null) {
          _monitor_enter(this);
          if (this.x != null) {
             _monitor_exit(this);
             return;
          }else if(!(this.y - p0)){
             _monitor_exit(this);
             return;
          }else if(this.t != null){
             if ((tv = this.v) == null) {
                tv = new kb3(0);
                this.v = tv;
             }
             tv.b(p1);
             _monitor_exit(this);
             return;
          }else {
             this.c = true;
             _monitor_exit(this);
             this.w = true;
          }
       }
       this.test(p1);
       return;
    }
    public void dispose(){
       if (this.x == null) {
          this.x = true;
          this.b.d(this);
       }
       return;
    }
    public boolean isDisposed(){
       return this.x;
    }
    public final boolean test(Object p0){
       boolean b = (this.x == null && !ak4.a(this.a, p0))? false: true;
       return b;
    }
}
