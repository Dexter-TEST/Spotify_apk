package p.im0;
import java.util.concurrent.Executor;
import android.view.ViewTreeObserver$OnDrawListener;
import java.lang.Runnable;
import androidx.fragment.app.k;
import java.lang.Object;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.app.Activity;
import android.os.Looper;
import p.am0;
import androidx.activity.a;
import p.vf2;

public final class im0 implements Executor, ViewTreeObserver$OnDrawListener, Runnable	// class@0019bd from classes.dex
{
    public final long a;
    public Runnable b;
    public boolean c;
    public final a t;

    public void im0(k p0){
       this.t = p0;
       super();
       this.a = SystemClock.uptimeMillis() + 0x2710;
       this.c = false;
    }
    public final void a(View p0){
       if (this.c == null) {
          this.c = true;
          p0.getViewTreeObserver().addOnDrawListener(this);
       }
       return;
    }
    public final void execute(Runnable p0){
       this.b = p0;
       View decorView = this.t.getWindow().getDecorView();
       if (this.c != null) {
          if (Looper.myLooper() == Looper.getMainLooper()) {
             decorView.invalidate();
          }else {
             decorView.postInvalidate();
          }
       }else {
          decorView.postOnAnimation(new am0(1, this));
       }
       return;
    }
    public final void onDraw(){
       im0 tb;
       if ((tb = this.b) != null) {
          tb.run();
          this.b = null;
          a z = this.t.z;
          vf2 g = z.g;
          _monitor_enter(g);
          _monitor_exit(g);
          if (z.c != null) {
             this.c = false;
             this.t.getWindow().getDecorView().post(this);
          }
       }else if((SystemClock.uptimeMillis() - this.a) > 0){
          this.c = false;
          this.t.getWindow().getDecorView().post(this);
       }
       return;
    }
    public final void run(){
       this.t.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
