package p.ou5;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.Observer;
import p.qu5;

public final class ou5 extends AtomicInteger implements Disposable	// class@002192 from classes.dex
{
    public final Observer a;
    public final qu5 b;
    public mu5 c;
    public boolean t;

    public void ou5(Observer p0,qu5 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       if (this.t == null) {
          this.t = true;
          this.b.a(this);
       }
       return;
    }
    public boolean isDisposed(){
       return this.t;
    }
}
