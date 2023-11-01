package p.tv4;
import io.reactivex.rxjava3.core.Observable;
import p.zo0;
import java.util.concurrent.TimeUnit;
import p.k92;
import java.lang.Class;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import io.reactivex.rxjava3.core.Observer;
import p.sv4;
import p.ir0;

public final class tv4 extends Observable	// class@0027ed from classes.dex
{
    public final zo0 a;
    public final int b;
    public k92 c;

    public void tv4(zo0 p0){
       super();
       this.a = p0;
       this.b = 1;
    }
    public final void a(k92 p0){
       _monitor_enter(this);
       if (this.c == p0) {
          p0.getClass();
          long l = p0.b - 1;
          if (!((p0.b = l))) {
             this.c = null;
             this.a.b();
          }
       }
       _monitor_exit(this);
       return;
    }
    public final void b(k92 p0){
       _monitor_enter(this);
       if (!(p0.b) && p0 == this.c) {
          this.c = null;
          cd1.a(p0);
          if (p0.get() == null) {
             p0.t = true;
          }else {
             this.a.b();
          }
       }
       _monitor_exit(this);
       return;
    }
    public final void subscribeActual(Observer p0){
       _monitor_enter(this);
       tv4 tc = this.c;
       int i = 1;
       if (tc == null) {
          tc = new k92(i, this);
          this.c = tc;
       }
       k92 b = tc.b;
       long l = b + 1;
       tc.b = l;
       if (tc.c == null && !(l - (long)this.b)) {
          tc.c = i;
       }else {
          i = 0;
       }
       _monitor_exit(this);
       this.a.subscribe(new sv4(p0, this, tc));
       if (i) {
          this.a.a(tc);
       }
       return;
    }
}
