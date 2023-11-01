package p.fy6;
import p.k36;
import java.lang.String;
import p.es3;
import android.content.Context;
import java.lang.Object;
import p.rj0;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.lang.Class;
import android.content.ComponentName;
import p.jr7;
import p.qq7;
import p.ap5;

public final class fy6 implements k36	// class@001663 from classes.dex
{
    public final Context a;

    static {
       es3.d("SystemAlarmScheduler");
    }
    public void fy6(Context p0){
       super();
       this.a = p0.getApplicationContext();
    }
    public final void a(String p0){
       fy6 ta = this.a;
       Intent intent = new Intent(ta, SystemAlarmService.class);
       intent.setAction("ACTION_STOP_WORK");
       intent.putExtra("KEY_WORKSPEC_ID", p0);
       ta.startService(intent);
    }
    public final boolean e(){
       return true;
    }
    public final void f(jr7[] p0){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          es3.c().getClass();
          fy6 ta = this.a;
          Intent intent = new Intent(ta, SystemAlarmService.class);
          intent.setAction("ACTION_SCHEDULE_WORK");
          rj0.e(intent, ap5.o(oobject));
          ta.startService(intent);
       }
       return;
    }
}
