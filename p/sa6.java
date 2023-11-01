package p.sa6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class sa6 implements Disposable	// class@0025f0 from classes.dex
{
    public final AtomicReference a;

    public void sa6(){
       super();
       this.a = new AtomicReference();
    }
    public void dispose(){
       cd1.a(this.a);
    }
    public boolean isDisposed(){
       return cd1.b(this.a.get());
    }
}
