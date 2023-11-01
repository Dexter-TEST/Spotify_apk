package p.gk4;
import java.lang.Object;
import java.util.HashSet;
import android.content.Context;
import java.lang.String;
import android.app.NotificationManager;
import android.app.Notification;
import android.os.Bundle;
import p.bk4;
import p.ek4;
import android.os.Message;
import android.os.Handler;

public final class gk4	// class@001726 from classes.dex
{
    public final Context a;
    public final NotificationManager b;
    public static final Object c;
    public static String d;
    public static HashSet e;
    public static final Object f;
    public static ek4 g;

    static {
       gk4.c = new Object();
       gk4.e = new HashSet();
       gk4.f = new Object();
    }
    public void gk4(Context p0){
       super();
       this.a = p0;
       this.b = p0.getSystemService("notification");
    }
    public final void a(int p0,Notification p1){
       Notification extras = ((extras = p1.extras) != null && extras.getBoolean("android.support.useSideChannel"))? 1: 0;
       gk4 tb = this.b;
       if (extras) {
          bk4 uobk4 = new bk4(this.a.getPackageName(), p0, p1);
          Object f = gk4.f;
          _monitor_enter(f);
          if (gk4.g == null) {
             gk4.g = new ek4(this.a.getApplicationContext());
          }
          gk4.g.b.obtainMessage(0, uobk4).sendToTarget();
          _monitor_exit(f);
          tb.cancel(null, p0);
       }else {
          tb.notify(null, p0, p1);
       }
       return;
    }
}
