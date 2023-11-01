package p.xn2;
import io.reactivex.rxjava3.core.Scheduler;
import android.os.Handler;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.vn2;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.disposables.Disposable;
import p.wn2;
import android.os.Message;
import p.r3;
import java.lang.NullPointerException;
import java.lang.String;

public final class xn2 extends Scheduler	// class@002cae from classes.dex
{
    public final Handler c;
    public final boolean d;

    public void xn2(Handler p0){
       super();
       this.c = p0;
       this.d = true;
    }
    public final Scheduler$Worker b(){
       return new vn2(this.c, this.d);
    }
    public final Disposable d(Runnable p0,long p1,TimeUnit p2){
       if (p0 == null) {
          throw new NullPointerException("run == null");
       }
       if (p2 == null) {
          throw new NullPointerException("unit == null");
       }
       xn2 tc = this.c;
       wn2 own2 = new wn2(tc, p0);
       Message message = Message.obtain(tc, own2);
       if (this.d != null) {
          r3.e(message);
       }
       tc.sendMessageDelayed(message, p2.toMillis(p1));
       return own2;
    }
}
