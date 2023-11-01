package p.z42;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import java.lang.Runnable;

public final class z42 implements Executor	// class@002e84 from classes.dex
{
    public static final Handler a;

    static {
       z42.a = new Handler(Looper.getMainLooper());
    }
    public void z42(){
       super();
    }
    public final void execute(Runnable p0){
       z42.a.post(p0);
    }
}
