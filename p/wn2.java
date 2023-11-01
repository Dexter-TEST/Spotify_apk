package p.wn2;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import android.os.Handler;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class wn2 implements Runnable, Disposable	// class@002b6d from classes.dex
{
    public final Handler a;
    public final Runnable b;
    public boolean c;

    public void wn2(Handler p0,Runnable p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.a.removeCallbacks(this);
       this.c = true;
    }
    public boolean isDisposed(){
       return this.c;
    }
    public final void run(){
       this.b.run();
       return;
    }
}
