package p.vn2;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import android.os.Handler;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.disposables.Disposable;
import p.jl1;
import p.wn2;
import android.os.Message;
import p.r3;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Object;

public final class vn2 extends Scheduler$Worker	// class@002a2a from classes.dex
{
    public final Handler a;
    public final boolean b;
    public boolean c;

    public void vn2(Handler p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Disposable b(Runnable p0,long p1,TimeUnit p2){
       if (p0 == null) {
          throw new NullPointerException("run == null");
       }
       if (p2 == null) {
          throw new NullPointerException("unit == null");
       }
       jl1 a = jl1.a;
       if (this.c != null) {
          return a;
       }
       vn2 ta = this.a;
       wn2 own2 = new wn2(ta, p0);
       Message message = Message.obtain(ta, own2);
       message.obj = this;
       if (this.b != null) {
          r3.e(message);
       }
       this.a.sendMessageDelayed(message, p2.toMillis(p1));
       if (this.c != null) {
          this.a.removeCallbacks(own2);
          return a;
       }else {
          return own2;
       }
    }
    public void dispose(){
       this.c = true;
       this.a.removeCallbacksAndMessages(this);
    }
    public boolean isDisposed(){
       return this.c;
    }
}
