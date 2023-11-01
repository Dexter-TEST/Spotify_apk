package p.ha4;
import android.view.ViewTreeObserver$OnGlobalFocusChangeListener;
import p.b3;
import java.util.HashMap;
import android.app.Activity;
import java.lang.Object;
import java.util.LinkedHashSet;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import android.view.View;
import p.ij;
import java.lang.Thread;
import java.lang.Runnable;

public final class ha4 implements ViewTreeObserver$OnGlobalFocusChangeListener	// class@001812 from classes.dex
{
    public final LinkedHashSet a;
    public final Handler b;
    public final WeakReference c;
    public final AtomicBoolean t;
    public static final b3 v;
    public static final HashMap w;

    static {
       ha4.v = new b3(11, 0);
       ha4.w = new HashMap();
    }
    public void ha4(Activity p0){
       super();
       this.a = new LinkedHashSet();
       this.b = new Handler(Looper.getMainLooper());
       this.c = new WeakReference(p0);
       this.t = new AtomicBoolean(false);
    }
    public final void a(View p0){
       ij oij = new ij(p0, 18, this);
       if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
          oij.run();
       }else {
          this.b.post(oij);
       }
       return;
    }
    public final void onGlobalFocusChanged(View p0,View p1){
       if (p0 != null) {
          this.a(p0);
       }
       if (p1 != null) {
          this.a(p1);
       }
       return;
    }
}
