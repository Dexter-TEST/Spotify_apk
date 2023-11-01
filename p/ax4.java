package p.ax4;
import io.reactivex.rxjava3.core.Observer;
import p.bx4;
import java.lang.Object;
import p.gq6;
import p.zw4;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fk;

public final class ax4 implements Observer	// class@00100f from classes.dex
{
    public final int a;
    public final gq6 b;
    public final int c;
    public boolean t;
    public Throwable v;
    public final AtomicInteger w;

    public void ax4(bx4 p0,int p1,int p2){
       this.a = 1;
       super();
       this.w = p0;
       this.c = p1;
       this.b = new gq6(p2);
    }
    public void ax4(zw4 p0,int p1,int p2){
       this.a = 0;
       super();
       this.w = p0;
       this.c = p1;
       this.b = new gq6(p2);
    }
    public final void onComplete(){
       switch (this.a){
           case 0:
           default:
             this.t = true;
             this.w.a();
             return;
       }
       this.t = true;
       this.w.a();
       return;
    }
    public final void onError(Throwable p0){
       switch (this.a){
           case 0:
           default:
             this.v = p0;
             this.t = true;
             this.w.a();
             return;
       }
       this.v = p0;
       this.t = true;
       this.w.a();
       return;
    }
    public final void onNext(Object p0){
       ax4 tw = this.w;
       ax4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.offer(p0);
             tw.a();
             return;
       }
       tb.offer(p0);
       tw.a();
       return;
    }
    public final void onSubscribe(Disposable p0){
       ax4 tw = this.w;
       ax4 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tw.c.a(tc, p0);
             return;
       }
       tw.c.a(tc, p0);
       return;
    }
}
