package p.c8;
import java.lang.String;
import p.es3;
import android.content.Context;
import p.qq7;
import java.lang.Object;
import android.app.AlarmManager;
import p.rj0;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.lang.Class;
import android.os.Build$VERSION;
import android.app.PendingIntent;
import androidx.work.impl.WorkDatabase;
import p.oy6;
import p.my6;
import p.uv1;
import p.s53;
import java.util.concurrent.Callable;
import p.xy5;
import p.co5;
import java.lang.Number;
import p.b8;

public abstract class c8	// class@0011bc from classes.dex
{
    public static final int a;

    static {
       es3.d("Alarms");
    }
    public static void a(Context p0,qq7 p1,int p2){
       PendingIntent service;
       AlarmManager systemServic = p0.getSystemService("alarm");
       Intent intent = new Intent(p0, SystemAlarmService.class);
       intent.setAction("ACTION_DELAY_MET");
       rj0.e(intent, p1);
       int i = (Build$VERSION.SDK_INT >= 23)? 0x24000000: 0x20000000;
       if ((service = PendingIntent.getService(p0, p2, intent, i)) != null && systemServic != null) {
          p1.toString();
          es3.c().getClass();
          systemServic.cancel(service);
       }
       return;
    }
    public static void b(Context p0,WorkDatabase p1,qq7 p2,long p3){
       my6 omy6;
       oy6 ooy6 = p1.v();
       if ((omy6 = ooy6.n(p2)) != null) {
          my6 c = omy6.c;
          c8.a(p0, p2, c);
          c8.c(p0, p2, c, p3);
       }else {
          uv1 omy61 = new uv1(p1);
          p1 = omy61.b.p(new s53(0, omy61));
          co5.l(p1, "workDatabase.runInTransa…ANAGER_ID_KEY\)\n        }\)");
          int i = p1.intValue();
          ooy6.p(new my6(p2.a, p2.b, i));
          c8.c(p0, p2, i, p3);
       }
       return;
    }
    public static void c(Context p0,qq7 p1,int p2,long p3){
       AlarmManager systemServic = p0.getSystemService("alarm");
       int i = (Build$VERSION.SDK_INT >= 23)? 0xc000000: 0x8000000;
       Intent intent = new Intent(p0, SystemAlarmService.class);
       intent.setAction("ACTION_DELAY_MET");
       rj0.e(intent, p1);
       PendingIntent service = PendingIntent.getService(p0, p2, intent, i);
       if (systemServic != null) {
          b8.a(systemServic, 0, p3, service);
       }
       return;
    }
}
