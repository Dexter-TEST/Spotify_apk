package p.ii7;
import java.util.TimerTask;
import p.ji7;
import java.lang.Object;
import java.lang.ref.Reference;
import android.app.Activity;
import android.view.View;
import p.is7;
import java.lang.Class;
import java.lang.String;
import p.ai0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Boolean;
import p.co5;
import p.io2;
import java.util.concurrent.FutureTask;
import p.hi7;
import java.util.concurrent.Callable;
import java.lang.Runnable;
import android.os.Handler;
import java.util.concurrent.TimeUnit;
import java.lang.Throwable;
import android.util.Log;
import org.json.JSONObject;
import org.json.JSONArray;
import p.gi7;
import java.util.concurrent.Executor;
import p.sz1;
import p.ij;

public final class ii7 extends TimerTask	// class@0019a0 from classes.dex
{
    public final ji7 a;

    public void ii7(ji7 p0){
       this.a = p0;
       super();
    }
    public final void run(){
       JSONObject e3;
       ii7 ta = this.a;
       try{
          Activity uActivity = ta.b.get();
          View view = is7.q(uActivity);
          if (uActivity == null || view == null) {
             return;
          }
          String simpleName = uActivity.getClass().getSimpleName();
          if (!ai0.f.get()) {
             return;
          }
          String str = "";
          if (co5.c(null, Boolean.TRUE)) {
             io2.u("CaptureViewHierarchy", str);
             return;
          }else {
             FutureTask uFutureTask = new FutureTask(new hi7(view));
             ji7 a = ta.a;
             try{
                a.post(uFutureTask);
                str = uFutureTask.get(1, TimeUnit.SECONDS);
             }catch(java.lang.Exception e3){
                Log.e(ji7.e, "Failed to take screenshot.", e3);
             }
             try{
                e3 = new JSONObject();
                e3.put("screenname", simpleName);
                e3.put("screenshot", str);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(gi7.c(view));
                e3.put("view", jSONArray);
             }catch(org.json.JSONException e0){
                Log.e(ji7.e, "Failed to create JSONObject");
             }catch(java.lang.Exception e0){
                Log.e(ji7.e, "UI Component tree indexing failure!", e0);
             }
             return;
          }
       }catch(java.lang.Exception e0){
       }
    }
}
