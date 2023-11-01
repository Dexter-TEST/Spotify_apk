package p.k92;
import java.lang.Runnable;
import p.ir0;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import p.tv4;
import p.zo0;
import p.m92;
import p.yo0;

public final class k92 extends AtomicReference implements Runnable, ir0	// class@001bcb from classes.dex
{
    public final int a;
    public long b;
    public boolean c;
    public boolean t;
    public final Object v;

    public void k92(int p0,Object p1){
       this.a = p0;
       this.v = p1;
    }
    private void b(Disposable p0){
       cd1.c(this, p0);
       k92 tv = this.v;
       _monitor_enter(tv);
       if (this.t != null) {
          this.v.a.b();
       }
       _monitor_exit(tv);
       return;
    }
    public final void a(Disposable p0){
       k92 ok92;
       switch (this.a){
           case 0:
             cd1.c(this, p0);
             ok92 = this.v;
             _monitor_enter(ok92);
             if (this.t != null) {
                this.v.b.z();
             }
             break;
           default:
             this.b(p0);
             return;
       }
       _monitor_exit(ok92);
       return;
    }
    public final void accept(Object p0){
       switch (this.a){
           case 0:
           default:
             this.a(p0);
             return;
       }
       this.a(p0);
       return;
    }
    public final void run(){
       k92 tv = this.v;
       switch (this.a){
           case 0:
           default:
             tv.b(this);
             return;
       }
       tv.A(this);
       return;
    }
}
