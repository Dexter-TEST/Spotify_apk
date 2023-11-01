package p.uq7;
import p.uw5;
import java.lang.String;
import p.es3;
import java.lang.Object;
import android.content.Context;
import p.bo0;
import p.ce7;
import android.content.res.Resources;
import p.ta6;
import p.co5;
import androidx.work.impl.WorkDatabase;
import p.vy5;
import java.lang.Class;
import p.b17;
import p.iq7;
import p.dg0;
import java.util.ArrayList;
import p.ka4;
import p.oa4;
import p.sv5;
import p.pa4;
import p.qa4;
import p.ra4;
import p.sa4;
import p.ta4;
import p.la4;
import p.ma4;
import p.na4;
import p.xy5;
import p.zq7;
import p.k36;
import p.t36;
import android.os.Build$VERSION;
import p.qy6;
import androidx.work.impl.background.systemjob.SystemJobService;
import p.n55;
import java.lang.reflect.Constructor;
import p.fy6;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p.cn2;
import java.util.List;
import java.util.Arrays;
import p.wk5;
import p.u44;
import p.tq7;
import java.lang.IllegalStateException;
import p.fc2;
import java.lang.Runnable;
import android.app.job.JobScheduler;
import java.util.Iterator;
import android.app.job.JobInfo;
import p.lr7;
import p.uy;
import p.uw6;
import p.xq6;
import p.nq5;
import p.ka0;
import p.j45;
import p.hq7;
import p.nx1;
import java.lang.IllegalArgumentException;
import android.content.BroadcastReceiver$PendingResult;

public final class uq7 extends uw5	// class@002902 from classes.dex
{
    public Context A;
    public bo0 B;
    public WorkDatabase C;
    public ce7 D;
    public List E;
    public wk5 F;
    public u44 G;
    public boolean H;
    public BroadcastReceiver$PendingResult I;
    public final zq7 J;
    public static uq7 K;
    public static uq7 L;
    public static final Object M;

    static {
       es3.d("WorkManagerImpl");
       uq7.K = null;
       uq7.L = null;
       uq7.M = new Object();
    }
    public void uq7(Context p0,bo0 p1,ce7 p2){
       vy5 ovy5;
       qy6 oqy6;
       uq7 ouq7 = this;
       bo0 uobo0 = p1;
       ce7 uoce7 = p2;
       Context applicationC = p0.getApplicationContext();
       ce7 a = uoce7.a;
       co5.o(applicationC, "context");
       co5.o(a, "queryExecutor");
       WorkDatabase workDatabase = WorkDatabase.class;
       String str = null;
       boolean b = true;
       if (p0.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
          ovy5 = new vy5(applicationC, workDatabase, str);
          ovy5.j = b;
       }else {
          ovy5 = b17.i(applicationC, workDatabase, "androidx.work.workdb");
          ovy5.i = new iq7(applicationC);
       }
       ovy5.g = a;
       ovy5.d.add(dg0.a);
       ka4[] oka4Array = new ka4[b];
       oka4Array[0] = oa4.c;
       ovy5.a(oka4Array);
       oka4Array = new ka4[b];
       oka4Array[0] = new sv5(applicationC, 2, 3);
       ovy5.a(oka4Array);
       oka4Array = new ka4[b];
       oka4Array[0] = pa4.c;
       ovy5.a(oka4Array);
       oka4Array = new ka4[b];
       oka4Array[0] = qa4.c;
       ovy5.a(oka4Array);
       oka4Array = new ka4[b];
       oka4Array[0] = new sv5(applicationC, 5, 6);
       ovy5.a(oka4Array);
       oka4Array = new ka4[b];
       oka4Array[0] = ra4.c;
       ovy5.a(oka4Array);
       oka4Array = new ka4[b];
       oka4Array[0] = sa4.c;
       ovy5.a(oka4Array);
       oka4Array = new ka4[b];
       oka4Array[0] = ta4.c;
       ovy5.a(oka4Array);
       oka4Array = new ka4[b];
       oka4Array[0] = new sv5(applicationC);
       ovy5.a(oka4Array);
       oka4Array = new ka4[b];
       oka4Array[0] = new sv5(applicationC, 10, 11);
       ovy5.a(oka4Array);
       ka4[] oka4Array1 = new ka4[b];
       oka4Array1[0] = la4.c;
       ovy5.a(oka4Array1);
       oka4Array1 = new ka4[b];
       oka4Array1[0] = ma4.c;
       ovy5.a(oka4Array1);
       oka4Array1 = new ka4[b];
       oka4Array1[0] = na4.c;
       ovy5.a(oka4Array1);
       ovy5.l = false;
       ovy5.m = b;
       xy5 oxy5 = ovy5.b();
       super();
       Context applicationC1 = p0.getApplicationContext();
       k36[] b1 = es3.b;
       _monitor_enter(b1);
       es3.c = new es3(uobo0.f);
       _monitor_exit(b1);
       zq7 ozq7 = new zq7(applicationC1, uoce7);
       ouq7.J = ozq7;
       b1 = new k36[2];
       if (Build$VERSION.SDK_INT >= 23) {
          oqy6 = new qy6(applicationC1, this);
          n55.a(applicationC1, SystemJobService.class, b);
          es3.c().getClass();
       }else {
          Class[] uClassArray = new Class[b];
          uClassArray[0] = Context.class;
          Object[] objArray = new Object[b];
          objArray[0] = applicationC1;
          es3.c().getClass();
          k36 ok36 = Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(uClassArray).newInstance(objArray);
          if (ok36 == null) {
             oqy6 = new fy6(applicationC1);
             n55.a(applicationC1, SystemAlarmService.class, b);
             es3.c().getClass();
          }else {
             oqy6 = ok36;
          }
       }
       b1[0] = oqy6;
       b1[b] = new cn2(applicationC1, uobo0, ozq7, this);
       List list = Arrays.asList(b1);
       wk5 v13 = new wk5(p0, p1, p2, oxy5, list);
       applicationC1 = p0.getApplicationContext();
       ouq7.A = applicationC1;
       ouq7.B = uobo0;
       ouq7.D = uoce7;
       ouq7.C = oxy5;
       ouq7.E = list;
       ouq7.F = v13;
       ouq7.G = new u44(10, oxy5);
       ouq7.H = false;
       if (Build$VERSION.SDK_INT >= 24 && tq7.a(applicationC1)) {
          throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
       }else {
          ouq7.D.j(new fc2(applicationC1, this));
          return;
       }
    }
    public static uq7 x(){
       uq7 k;
       Object m = uq7.M;
       _monitor_enter(m);
       if ((k = uq7.K) != null) {
          _monitor_exit(m);
          return k;
       }else {
          _monitor_exit(m);
          return uq7.L;
       }
    }
    public static uq7 y(Context p0){
       uq7 ouq7;
       Object m = uq7.M;
       _monitor_enter(m);
       if ((ouq7 = uq7.x()) != null) {
          _monitor_exit(m);
          return ouq7;
       }else {
          p0.getApplicationContext();
          throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
       }
    }
    public final void A(){
       JobScheduler systemServic;
       ArrayList uArrayList;
       if (Build$VERSION.SDK_INT >= 23) {
          uq7 tA = this.A;
          if ((systemServic = tA.getSystemService("jobscheduler")) != null && ((uArrayList = qy6.d(tA, systemServic)) != null && !uArrayList.isEmpty())) {
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                qy6.b(systemServic, iterator.next().getId());
             }
          }
       }
       lr7 olr7 = this.C.y();
       lr7 a = olr7.a;
       lr7 olr71 = a;
       olr71.b();
       olr7 = olr7.l;
       uw6 ouw6 = olr7.c();
       olr71.c();
       ouw6.u();
       a.r();
       olr71.m();
       olr7.f(ouw6);
       t36.a(this.B, this.C, this.E);
       return;
    }
    public final void B(xq6 p0,nq5 p1){
       ka0 v7 = new ka0(this, p0, p1, 6, 0);
       this.D.j(v7);
    }
    public final j45 v(List p0){
       if (!p0.isEmpty()) {
          return new hq7(this, null, nx1.b, p0).C();
       }
       throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
    public final j45 w(String p0,nx1 p1,List p2){
       return new hq7(this, p0, p1, p2).C();
    }
    public final void z(){
       uq7 tI;
       Object m = uq7.M;
       _monitor_enter(m);
       this.H = true;
       if ((tI = this.I) != null) {
          tI.finish();
          this.I = null;
       }
       _monitor_exit(m);
       return;
    }
}
