package p.lx4;
import io.reactivex.rxjava3.core.Observer;
import p.ab6;
import p.fk;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;

public final class lx4 implements Observer	// class@001de1 from classes.dex
{
    public final Observer a;
    public final fk b;
    public Disposable c;
    public boolean t;
    public boolean v;

    public void lx4(ab6 p0,fk p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onComplete(){
       this.b.dispose();
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.b.dispose();
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       if (this.v != null) {
          this.a.onNext(p0);
       }else if(this.t != null){
          this.v = true;
          this.a.onNext(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.b.a(0, p0);
       }
       return;
    }
}
