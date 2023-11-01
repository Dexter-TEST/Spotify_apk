package p.gj7;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import p.b3;
import java.util.HashMap;
import android.app.Activity;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p.am0;
import java.lang.Thread;
import java.lang.Runnable;

public final class gj7 implements ViewTreeObserver$OnGlobalLayoutListener	// class@001720 from classes.dex
{
    public final WeakReference a;
    public final Handler b;
    public final AtomicBoolean c;
    public static final b3 t;
    public static final HashMap v;

    static {
       gj7.t = new b3(29, 0);
       gj7.v = new HashMap();
    }
    public void gj7(Activity p0){
       super();
       this.a = new WeakReference(p0);
       this.b = new Handler(Looper.getMainLooper());
       this.c = new AtomicBoolean(false);
    }
    public final void a(){
       am0 uoam0 = new am0(12, this);
       if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
          uoam0.run();
       }else {
          this.b.post(uoam0);
       }
       return;
    }
    public final void onGlobalLayout(){
       this.a();
    }
}
