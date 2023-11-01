package p.qy6;
import p.k36;
import java.lang.String;
import p.es3;
import android.content.Context;
import p.uq7;
import java.lang.Object;
import android.app.job.JobScheduler;
import p.py6;
import java.util.Locale;
import java.lang.Integer;
import java.lang.Throwable;
import java.util.ArrayList;
import java.util.Iterator;
import android.app.job.JobInfo;
import p.qq7;
import java.util.List;
import android.content.ComponentName;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.lang.Class;
import android.os.PersistableBundle;
import android.os.BaseBundle;
import p.oy6;
import androidx.work.impl.WorkDatabase;
import p.xy5;
import p.uy;
import p.uw6;
import p.sw6;
import p.jr7;
import p.uv1;
import p.lr7;
import p.rq7;
import p.ap5;
import p.my6;
import p.bo0;
import p.t53;
import java.util.concurrent.Callable;
import p.co5;
import java.lang.Number;
import android.os.Build$VERSION;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;

public final class qy6 implements k36	// class@00243e from classes.dex
{
    public final Context a;
    public final JobScheduler b;
    public final uq7 c;
    public final py6 t;
    public static final String v;

    static {
       qy6.v = es3.d("SystemJobScheduler");
    }
    public void qy6(Context p0,uq7 p1){
       super();
       this.a = p0;
       this.c = p1;
       this.b = p0.getSystemService("jobscheduler");
       this.t = new py6(p0);
    }
    public static void b(JobScheduler p0,int p1){
       p0.cancel(p1);
       return;
    }
    public static ArrayList c(Context p0,JobScheduler p1,String p2){
       ArrayList uArrayList;
       qq7 oqq7;
       if ((uArrayList = qy6.d(p0, p1)) == null) {
          return null;
       }
       ArrayList uArrayList1 = new ArrayList(2);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          JobInfo jobInfo = iterator.next();
          if ((oqq7 = qy6.g(jobInfo)) != null && p2.equals(oqq7.a)) {
             uArrayList1.add(Integer.valueOf(jobInfo.getId()));
          }
       }
       return uArrayList1;
    }
    public static ArrayList d(Context p0,JobScheduler p1){
       ArrayList uArrayList = null;
       List allPendingJo = p1.getAllPendingJobs();
       if (allPendingJo == null) {
          return uArrayList;
       }
       uArrayList = new ArrayList(allPendingJo.size());
       ComponentName uComponentNa = new ComponentName(p0, SystemJobService.class);
       Iterator iterator = allPendingJo.iterator();
       while (iterator.hasNext()) {
          JobInfo jobInfo = iterator.next();
          if (uComponentNa.equals(jobInfo.getService())) {
             uArrayList.add(jobInfo);
          }
       }
       return uArrayList;
    }
    public static qq7 g(JobInfo p0){
       PersistableBundle extras;
       try{
          if ((extras = p0.getExtras()) != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
             return new qq7(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
          }
          return null;
       }catch(java.lang.NullPointerException e0){
       }
    }
    public final void a(String p0){
       ArrayList uArrayList;
       qy6 tb = this.b;
       if ((uArrayList = qy6.c(this.a, tb, p0)) != null && !uArrayList.isEmpty()) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             qy6.b(tb, iterator.next().intValue());
          }
          oy6 ooy6 = this.c.C.v();
          ooy6.b.b();
          uw6 ouw6 = ooy6.v.c();
          if (p0 == null) {
             ouw6.z(1);
          }else {
             ouw6.s(1, p0);
          }
          ooy6.b.c();
          ouw6.u();
          ooy6.b.r();
          ooy6.b.m();
          ooy6.v.f(ouw6);
       }
       return;
    }
    public final boolean e(){
       return true;
    }
    public final void f(jr7[] p0){
       jr7 ojr7;
       my6 omy6;
       my6 c1;
       ArrayList uArrayList;
       int i1;
       int i2;
       qy6 tc = this.c;
       uq7 c = tc.C;
       uv1 ouv1 = new uv1(c);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          c.c();
          if ((ojr7 = c.y().l(oobject.a)) == null) {
             es3.c().getClass();
             c.r();
          }else if(ojr7.b != rq7.a){
             es3.c().getClass();
             c.r();
          }else {
             qq7 oqq7 = ap5.o(oobject);
             if ((omy6 = c.v().n(oqq7)) != null) {
                c1 = omy6.c;
             }else {
                tc.B.getClass();
                Object obj1 = ouv1.b.p(new t53(ouv1, tc.B.g));
                co5.l(obj1, "workDatabase.runInTransa…            id\n        }\)");
                c1 = obj1.intValue();
             }
             if (omy6 == null) {
                tc.C.v().p(new my6(oqq7.a, oqq7.b, c1));
             }
             this.h(oobject, c1);
             if (Build$VERSION.SDK_INT == 23 && (uArrayList = qy6.c(this.a, this.b, oobject.a)) != null) {
                if ((i1 = uArrayList.indexOf(Integer.valueOf(c1))) >= 0) {
                   uArrayList.remove(i1);
                }
                if (!uArrayList.isEmpty()) {
                   i2 = uArrayList.get(0).intValue();
                }else {
                   tc.B.getClass();
                   Object obj = ouv1.b.p(new t53(ouv1, tc.B.g));
                   co5.l(obj, "workDatabase.runInTransa…            id\n        }\)");
                   i2 = obj.intValue();
                }
                this.h(oobject, i2);
             }
             c.r();
          }
          c.m();
       }
       return;
    }
    public final void h(jr7 p0,int p1){
       int i;
       qy6 tb = this.b;
       JobInfo jobInfo = this.t.a(p0, p1);
       es3.c().getClass();
       try{
          i = 0;
          if (!tb.schedule(jobInfo)) {
             es3.c().getClass();
             if (p0.q != null && p0.r == 1) {
                p0.q = i;
                Object[] objArray1 = new Object[1];
                objArray1[i] = p0.a;
                String.format("Scheduling a non-expedited job \(work ID %s\)", objArray1);
                es3.c().getClass();
                this.h(p0, p1);
             }
          }
          return;
       }catch(java.lang.IllegalStateException e8){
          ArrayList uArrayList = ((uArrayList = qy6.d(this.a, tb)) != null)? uArrayList.size(): 0;
          Locale default = Locale.getDefault();
          Object[] objArray = new Object[3];
          objArray[i] = Integer.valueOf(uArrayList);
          qy6 tc = this.c;
          objArray[1] = Integer.valueOf(tc.C.y().i().size());
          bo0 h = tc.B.h;
          if (Build$VERSION.SDK_INT == 23) {
             h = h / 2;
          }
          objArray[2] = Integer.valueOf(h);
          String str = String.format(default, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArray);
          es3.c().a(qy6.v, str);
          tc.B.getClass();
          throw new IllegalStateException(str, e8);
       }
    }
}
