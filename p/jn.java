package p.jn;
import java.util.concurrent.Executor;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;

public final class jn implements Executor	// class@001b12 from classes.dex
{
    public final Handler a;

    public void jn(){
       super();
       this.a = new Handler(Looper.getMainLooper());
    }
    public final void execute(Runnable p0){
       this.a.post(p0);
    }
}
