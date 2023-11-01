package p.sr4;
import java.lang.Runnable;
import p.ur4;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public final class sr4 implements Runnable	// class@002685 from classes.dex
{
    public final ur4 a;

    public void sr4(ur4 p0){
       this.a = p0;
       super();
    }
    public final void run(){
       sr4 ta = this.a;
       ta.a.onComplete();
       ta.t.dispose();
    }
}
