package p.un;
import android.content.ServiceConnection;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.LinkedBlockingDeque;
import android.os.IBinder;
import java.lang.String;
import p.co5;
import java.lang.IllegalStateException;
import android.content.ComponentName;

public final class un implements ServiceConnection	// class@0028e8 from classes.dex
{
    public final AtomicBoolean a;
    public final LinkedBlockingDeque b;

    public void un(){
       super();
       this.a = new AtomicBoolean(false);
       this.b = new LinkedBlockingDeque();
    }
    public final IBinder a(){
       boolean b = true;
       if (!((this.a.compareAndSet(b, b) ^ b))) {
          throw new IllegalStateException("Binder already consumed".toString());
       }
       Object obj = this.b.take();
       co5.l(obj, "queue.take\(\)");
       return obj;
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       try{
          if (p1 != null) {
             this.b.put(p1);
          }
          return;
       }catch(java.lang.InterruptedException e0){
       }
    }
    public final void onServiceDisconnected(ComponentName p0){
    }
}
