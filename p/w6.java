package p.w6;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;
import java.lang.Object;
import android.os.Bundle;
import p.x6;
import java.lang.reflect.Field;
import p.t5;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.String;
import java.lang.Throwable;
import android.util.Log;

public final class w6 implements Application$ActivityLifecycleCallbacks	// class@002ada from classes.dex
{
    public Object a;
    public Activity b;
    public final int c;
    public boolean t;
    public boolean v;
    public boolean w;

    public void w6(Activity p0){
       super();
       this.t = false;
       this.v = false;
       this.w = false;
       this.b = p0;
       this.c = p0.hashCode();
    }
    public final void onActivityCreated(Activity p0,Bundle p1){
    }
    public final void onActivityDestroyed(Activity p0){
       if (this.b == p0) {
          this.b = null;
          this.v = true;
       }
       return;
    }
    public final void onActivityPaused(Activity p0){
       Object obj;
       int i;
       if (this.v != null && (this.w == null && this.t == null)) {
          if ((obj = x6.c.get(p0)) == this.a && p0.hashCode() == this.c) {
             x6.g.postAtFrontOfQueue(new t5(x6.b.get(p0), obj, 4));
             i = 1;
          }else {
             i = 0;
          }
          if (i) {
             this.w = true;
             this.a = null;
          }
       }
       return;
    }
    public final void onActivityResumed(Activity p0){
    }
    public final void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public final void onActivityStarted(Activity p0){
       if (this.b == p0) {
          this.t = true;
       }
       return;
    }
    public final void onActivityStopped(Activity p0){
    }
}
