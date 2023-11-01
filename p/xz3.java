package p.xz3;
import p.er7;
import android.os.Looper;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import android.os.Handler;
import java.lang.Runnable;

public final class xz3 implements er7	// class@002d19 from classes.dex
{
    public final Handler a;
    public boolean b;
    public final ReentrantLock c;

    public void xz3(){
       super();
       this.c = new ReentrantLock();
       this.a = new Handler(Looper.getMainLooper());
    }
    public final void dispose(){
       xz3 tc = this.c;
       tc.lock();
       this.a.removeCallbacksAndMessages(null);
       this.b = true;
       tc.unlock();
    }
    public final void post(Runnable p0){
       xz3 tc = this.c;
       tc.lock();
       if (this.b != null) {
       }else {
          this.a.post(p0);
       }
       tc.unlock();
       return;
    }
}
