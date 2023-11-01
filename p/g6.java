package p.g6;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.Intent;
import p.xj0;
import android.os.Build$VERSION;
import p.x6;
import java.lang.reflect.Field;
import android.app.Application;
import p.w6;
import android.app.Application$ActivityLifecycleCallbacks;
import p.t5;
import android.os.Handler;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.reflect.Method;
import p.ej4;
import p.wg4;
import p.v07;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;

public final class g6 implements Runnable	// class@0016af from classes.dex
{
    public final int a;
    public final Activity b;

    public void g6(Activity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       int i3;
       Object obj1;
       Intent intent;
       ComponentName component;
       g6 tb = this.b;
       switch (this.a){
           case 0:
             if (!tb.isFinishing()) {
                int sDK_INT = Build$VERSION.SDK_INT;
                int i = 1;
                if (sDK_INT >= 28) {
                   tb.recreate();
                }else {
                   int i1 = 27;
                   int i2 = 26;
                   Boolean obj = (sDK_INT != i2 && sDK_INT != i1)? 0: 1;
                   Method f = x6.f;
                   if (i3 && (f == null || (x6.e == null && (x6.d == null || ((obj = x6.c.get(tb)) == null || (obj1 = x6.b.get(tb)) == null))))) {
                      i = 0;
                   }else {
                      Application application = tb.getApplication();
                      w6 ow6 = new w6(tb);
                      application.registerActivityLifecycleCallbacks(ow6);
                      Handler g = x6.g;
                      g.post(new t5(ow6, obj, 2));
                      Object[] objArray = (sDK_INT != i2 && sDK_INT != i1)? 0: 1;
                      if (sDK_INT) {
                         objArray = new Object[9];
                         objArray[0] = obj;
                         objArray[i] = null;
                         objArray[2] = null;
                         objArray[3] = Integer.valueOf(0);
                         obj = Boolean.FALSE;
                         objArray[4] = obj;
                         objArray[5] = null;
                         objArray[6] = null;
                         objArray[7] = obj;
                         objArray[8] = obj;
                         f.invoke(obj1, objArray);
                      }else {
                         tb.recreate();
                      }
                      g.post(new t5(application, ow6, 3));
                   }
                }
                if (!i) {
                   tb.recreate();
                }
             }
             return;
             break;
           case 1:
           default:
             if ((intent = ej4.N(tb)) != null) {
                if (!tb.isTaskRoot() && !wg4.c(tb, intent)) {
                   wg4.b(tb, intent);
                }else {
                   v07 ov07 = new v07(tb);
                   if ((component = intent.getComponent()) == null) {
                      component = intent.resolveActivity(ov07.c.getPackageManager());
                   }
                   if (component != null) {
                      ov07.a(component);
                   }
                   ov07.b.add(intent);
                   ov07.b();
                }
             }else if((intent = ej4.N(tb)) != null){
                wg4.b(tb, intent);
             }else {
                throw new IllegalArgumentException("Activity "+tb.getClass().getSimpleName()+" does not have a parent activity name specified. \(Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?\)");
             }
             return;
       }
       tb.startActivity(xj0.z0(tb, "spotify.intent.action.AUDIO_SETTINGS"));
       return;
    }
}
