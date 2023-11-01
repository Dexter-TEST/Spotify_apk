package p.kx4;
import io.reactivex.rxjava3.core.Observer;
import p.fk;
import p.lx4;
import p.ab6;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;

public final class kx4 implements Observer	// class@001c9f from classes.dex
{
    public final fk a;
    public final lx4 b;
    public final ab6 c;
    public Disposable t;

    public void kx4(fk p0,lx4 p1,ab6 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onComplete(){
       this.b.t = true;
    }
    public final void onError(Throwable p0){
       this.a.dispose();
       this.c.onError(p0);
    }
    public final void onNext(Object p0){
       this.t.dispose();
       p0.t = true;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          this.a.a(1, p0);
       }
       return;
    }
}
