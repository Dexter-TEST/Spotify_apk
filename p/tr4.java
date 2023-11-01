package p.tr4;
import java.lang.Runnable;
import p.ur4;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public final class tr4 implements Runnable	// class@0027c9 from classes.dex
{
    public final Throwable a;
    public final ur4 b;

    public void tr4(ur4 p0,Throwable p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public final void run(){
       tr4 tb = this.b;
       tb.a.onError(this.a);
       tb.t.dispose();
    }
}
