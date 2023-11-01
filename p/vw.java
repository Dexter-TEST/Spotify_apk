package p.vw;
import android.app.Application$ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.ArrayList;
import android.app.Application;
import android.content.ComponentCallbacks;
import p.uw;
import android.app.Activity;
import android.os.Bundle;
import android.content.res.Configuration;

public final class vw implements Application$ActivityLifecycleCallbacks, ComponentCallbacks2	// class@002a7f from classes.dex
{
    public final AtomicBoolean a;
    public final AtomicBoolean b;
    public final ArrayList c;
    public boolean t;
    public static final vw v;

    static {
       vw.v = new vw();
    }
    public void vw(){
       super();
       this.a = new AtomicBoolean();
       this.b = new AtomicBoolean();
       this.c = new ArrayList();
       this.t = false;
    }
    public static void b(Application p0){
       vw v = vw.v;
       _monitor_enter(v);
       if (v.t == null) {
          p0.registerActivityLifecycleCallbacks(v);
          p0.registerComponentCallbacks(v);
          v.t = true;
       }
       _monitor_exit(v);
       return;
    }
    public final void a(uw p0){
       vw v = vw.v;
       _monitor_enter(v);
       this.c.add(p0);
       _monitor_exit(v);
    }
    public final void c(boolean p0){
       vw v = vw.v;
       _monitor_enter(v);
       vw tc = this.c;
       int i = tc.size();
       int i1 = 0;
       while (i1 < i) {
          i1 = i1 + 1;
          tc.get(i1).a(p0);
       }
       _monitor_exit(v);
       return;
    }
    public final void onActivityCreated(Activity p0,Bundle p1){
       this.b.set(true);
       if (this.a.compareAndSet(true, false)) {
          this.c(false);
       }
       return;
    }
    public final void onActivityDestroyed(Activity p0){
    }
    public final void onActivityPaused(Activity p0){
    }
    public final void onActivityResumed(Activity p0){
       this.b.set(true);
       if (this.a.compareAndSet(true, false)) {
          this.c(false);
       }
       return;
    }
    public final void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public final void onActivityStarted(Activity p0){
    }
    public final void onActivityStopped(Activity p0){
    }
    public final void onConfigurationChanged(Configuration p0){
    }
    public final void onLowMemory(){
    }
    public final void onTrimMemory(int p0){
       if (p0 == 20 && this.a.compareAndSet(false, true)) {
          this.b.set(true);
          this.c(true);
       }
       return;
    }
}
