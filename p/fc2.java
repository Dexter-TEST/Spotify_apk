package p.fc2;
import java.lang.Runnable;
import java.lang.String;
import p.es3;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import p.uq7;
import java.lang.Object;
import android.app.AlarmManager;
import android.os.Build$VERSION;
import android.content.Intent;
import android.content.ComponentName;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.lang.Class;
import android.app.PendingIntent;
import java.lang.System;
import p.qy6;
import android.app.job.JobScheduler;
import java.util.ArrayList;
import p.oy6;
import androidx.work.impl.WorkDatabase;
import p.zy5;
import p.xy5;
import android.database.Cursor;
import p.vv7;
import java.util.HashSet;
import java.util.Iterator;
import android.app.job.JobInfo;
import p.qq7;
import p.lr7;
import p.zq7;
import p.jr7;
import p.rq7;
import p.u44;
import p.li5;
import java.lang.Long;
import p.ki5;
import android.app.ActivityManager;
import java.util.List;
import p.s3;
import android.app.ApplicationExitInfo;
import p.bo0;
import p.t36;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.uk5;
import p.w51;
import java.lang.Thread;
import java.lang.Throwable;
import java.lang.IllegalStateException;

public final class fc2 implements Runnable	// class@00159d from classes.dex
{
    public final Context a;
    public final uq7 b;
    public final u44 c;
    public int t;
    public static final String v;
    public static final long w;

    static {
       fc2.v = es3.d("ForceStopRunnable");
       fc2.w = TimeUnit.DAYS.toMillis(3650);
    }
    public void fc2(Context p0,uq7 p1){
       super();
       this.a = p0.getApplicationContext();
       this.b = p1;
       this.c = p1.G;
       this.t = 0;
    }
    public static void b(Context p0){
       AlarmManager systemServic = p0.getSystemService("alarm");
       int i = (Build$VERSION.SDK_INT >= 31)? 0xa000000: 0x8000000;
       Intent intent = new Intent();
       intent.setComponent(new ComponentName(p0, ForceStopRunnable$BroadcastReceiver.class));
       intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
       PendingIntent broadcast = PendingIntent.getBroadcast(p0, -1, intent, i);
       long l = System.currentTimeMillis() + fc2.w;
       if (systemServic != null) {
          systemServic.setExact(0, l, broadcast);
       }
       return;
    }
    public final void a(){
       ArrayList uArrayList1;
       qq7 oqq7;
       Iterator iterator1;
       uq7 c1;
       lr7 olr7;
       int i3;
       List list;
       fc2 uofc2 = this;
       String str = "last_force_stop_ms";
       fc2 c = uofc2.c;
       fc2 a = uofc2.a;
       int i = 1;
       fc2 b = uofc2.b;
       int i1 = 0;
       if (Build$VERSION.SDK_INT >= 23) {
          JobScheduler systemServic = a.getSystemService("jobscheduler");
          ArrayList uArrayList = qy6.d(a, systemServic);
          oy6 ooy6 = b.C.v();
          ooy6.getClass();
          zy5 ozy5 = zy5.x(i1, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
          ooy6.b.b();
          Cursor uCursor = vv7.J(ooy6.b, ozy5, i1);
          uArrayList1 = new ArrayList(uCursor.getCount());
          while (uCursor.moveToNext()) {
             String str1 = (uCursor.isNull(i1))? null: uCursor.getString(i1);
             uArrayList1.add(str1);
          }
          uCursor.close();
          ozy5.y();
          int i2 = (uArrayList != null)? uArrayList.size(): 0;
          HashSet hashSet = new HashSet(i2);
          if (uArrayList != null && !uArrayList.isEmpty()) {
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                JobInfo jobInfo = iterator.next();
                if ((oqq7 = qy6.g(jobInfo)) != null) {
                   hashSet.add(oqq7.a);
                }else {
                   qy6.b(systemServic, jobInfo.getId());
                }
             }
          }
          iterator1 = uArrayList1.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                if (!hashSet.contains(iterator1.next())) {
                   es3.c().getClass();
                   iterator1 = 1;
                }
             }else {
                iterator1 = 0;
             }
             if (iterator1) {
                c1 = b.C;
                c1.c();
                olr7 = c1.y();
                Iterator iterator2 = uArrayList1.iterator();
                while (iterator2.hasNext()) {
                   olr7.q(iterator2.next(), -1);
                }
                c1.r();
                c1.m();
             }
          }
       }else {
          iterator1 = 0;
       }
       c1 = b.C;
       olr7 = c1.y();
       zq7 ozq7 = c1.x();
       c1.c();
       uArrayList1 = olr7.h();
       if (i3 = uArrayList1.isEmpty() ^ i) {
          Iterator iterator3 = uArrayList1.iterator();
          while (iterator3.hasNext()) {
             jr7 ojr7 = iterator3.next();
             olr7.u(rq7.a, ojr7.a);
             olr7.q(ojr7.a, -1);
             i1 = 0;
          }
       }
       ozq7.k();
       c1.r();
       c1.m();
       iterator1 = (!i3 && !iterator1)? 0: 1;
       String str2 = "reschedule_needed";
       Long longx = ((longx = b.G.b.u().e(str2)) != null && !(longx.longValue() - 1))? 1: 0;
       long l = 0;
       if (longx) {
          es3.c().getClass();
          b.A();
          uq7 g = b.G;
          g.getClass();
          g.b.u().g(new ki5(str2, Long.valueOf(l)));
       }else if((i = Build$VERSION.SDK_INT) >= 31){
          i1 = 0x22000000;
       label_018d :
          Intent intent = new Intent();
          intent.setComponent(new ComponentName(a, ForceStopRunnable$BroadcastReceiver.class));
          intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
          PendingIntent broadcast = PendingIntent.getBroadcast(a, -1, intent, i1);
          if (i >= 30) {
             if (broadcast != null) {
                broadcast.cancel();
             }
             if ((list = s3.i(a.getSystemService("activity"))) != null && !list.isEmpty()) {
                if ((longx = c.b.u().e(str)) != null) {
                   l = longx.longValue();
                }
                i = 0;
                while (true) {
                   if (i < list.size()) {
                      ApplicationExitInfo uApplication = list.get(i);
                      if (s3.b(uApplication) != 10 || (s3.c(uApplication) - l) < 0) {
                         i = i + 1;
                      }
                   }
                }
             }
          }else if(broadcast == null){
             fc2.b(a);
          }
          longx = 0;
          if (longx) {
             es3.c().getClass();
             b.A();
             c.getClass();
             c.b.u().g(new ki5(e0, Long.valueOf(System.currentTimeMillis())));
          }else if(iterator1){
             es3.c().getClass();
             t36.a(b.B, b.C, b.E);
          }
       }else {
          i1 = 0x20000000;
          goto label_018d ;
       }
       return;
    }
    public final void run(){
       String v = fc2.v;
       fc2 tb = this.b;
       uq7 b = tb.B;
       b.getClass();
       fc2 ta = this.a;
       if (TextUtils.isEmpty(null)) {
          es3.c().getClass();
          b = 1;
       }else {
          boolean b1 = uk5.a(ta, b);
          es3.c().getClass();
       }
       if (!b) {
          tb.z();
          return;
       }
       try{
       label_002d :
          w51.F(ta);
          es3 uoes3 = es3.c();
          try{
             uoes3.getClass();
             this.a();
             tb.z();
             return;
          }catch(android.database.sqlite.SQLiteCantOpenDatabaseException e2){
          }catch(android.database.sqlite.SQLiteDiskIOException e2){
          }catch(android.database.sqlite.SQLiteDatabaseCorruptException e2){
          }catch(android.database.sqlite.SQLiteDatabaseLockedException e2){
          }catch(android.database.sqlite.SQLiteTableLockedException e2){
          }catch(android.database.sqlite.SQLiteConstraintException e2){
          }catch(android.database.sqlite.SQLiteAccessPermException e2){
          }
          int i = this.t + v4;
          this.t = i;
          if (i < 3) {
             es3.c().getClass();
             long l = (long)this.t;
             try{
                l = l * 300;
                Thread.sleep(l);
                goto label_002d ;
             }catch(java.lang.InterruptedException e0){
             }
          }else {
             es3.c().b(v, "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store.", e2);
             tb.B.getClass();
             throw new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store.", e2);
          }
       }catch(android.database.sqlite.SQLiteException e2){
          es3.c().a(v, "Unexpected SQLite exception during migrations");
          tb.B.getClass();
          throw new IllegalStateException("Unexpected SQLite exception during migrations", e2);
       }
    }
}
