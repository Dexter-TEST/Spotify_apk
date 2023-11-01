package p.p93;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.q93;
import p.cd1;
import java.lang.Object;
import p.rq4;
import java.lang.Class;
import java.lang.Throwable;
import p.rn;
import p.ro1;
import p.yh6;
import p.on5;
import p.vn5;
import p.gq6;
import p.fq6;

public final class p93 extends AtomicReference implements Observer, Disposable	// class@002218 from classes.dex
{
    public final q93 a;
    public final int b;
    public yh6 c;
    public boolean t;
    public int v;

    public void p93(q93 p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       p93 ta = this.a;
       ta.getClass();
       this.t = true;
       ta.b();
    }
    public final void onError(Throwable p0){
       p93 ta = this.a;
       if (ta.w.a(p0)) {
          if (ta.v == ro1.a) {
             ta.z.dispose();
          }
          this.t = true;
          ta.b();
       }
       return;
    }
    public final void onNext(Object p0){
       p93 ta = this.a;
       if (this.v == null) {
          ta.getClass();
          this.c.offer(p0);
          ta.b();
       }else {
          ta.b();
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       int i1;
       if (cd1.e(this, p0)) {
          if (p0 instanceof on5) {
             int i = p0.b(3);
             boolean b = true;
             if (i == b) {
                this.v = i;
                this.c = p0;
                this.t = b;
                p93 ta = this.a;
                ta.getClass();
                this.t = b;
                ta.b();
                return;
             }else if(i == 2){
                this.v = i;
                this.c = p0;
                return;
             }
          }
          gq6 ogq6 = ((i1 = - this.b) < 0)? new gq6((- i1)): new fq6(i1);
          this.c = ogq6;
       }
       return;
    }
}
