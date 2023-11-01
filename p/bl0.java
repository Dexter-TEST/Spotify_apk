package p.bl0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.rn;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.iw1;

public final class bl0 implements Disposable	// class@0010e5 from classes.dex
{
    public final rn a;

    public void bl0(rn p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.a.b();
    }
    public boolean isDisposed(){
       boolean b = (this.a.get() == iw1.a)? true: false;
       return b;
    }
}
