package p.lq0;
import android.content.BroadcastReceiver;
import java.lang.String;
import p.es3;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import p.rj0;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import android.content.ComponentName;

public abstract class lq0 extends BroadcastReceiver	// class@001d9f from classes.dex
{
    public static final int a;

    static {
       es3.d("ConstraintProxy");
    }
    public void lq0(){
       super();
    }
    public final void onReceive(Context p0,Intent p1){
       Objects.toString(p1);
       es3.c().getClass();
       p1 = new Intent(p0, SystemAlarmService.class);
       p1.setAction("ACTION_CONSTRAINTS_CHANGED");
       p0.startService(p1);
    }
}
