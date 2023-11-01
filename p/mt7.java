package p.mt7;
import java.util.concurrent.Executor;
import java.lang.Object;
import p.nu7;
import android.os.Looper;
import android.os.Handler;
import java.lang.Runnable;

public final class mt7 implements Executor	// class@001f03 from classes.dex
{
    public final int a;
    public final Handler b;

    public void mt7(int p0){
       this.a = p0;
       if (p0 != 2) {
          if (p0 != 3) {
             super();
             this.b = new nu7(Looper.getMainLooper());
             return;
          }else {
             super();
             this.b = new Handler(Looper.getMainLooper());
             return;
          }
       }else {
          super();
          this.b = new Handler(Looper.getMainLooper());
          return;
       }
    }
    public void mt7(nu7 p0){
       this.a = 0;
       super();
       this.b = p0;
    }
    public final void execute(Runnable p0){
       mt7 tb = this.b;
       switch (this.a){
           case 0:
             tb.post(p0);
             return;
           case 1:
             tb.post(p0);
             return;
           case 2:
             tb.post(p0);
             return;
           default:
             tb.post(p0);
             return;
       }
    }
}
