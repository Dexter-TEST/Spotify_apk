package p.qe3;
import p.fr7;
import android.content.Context;
import p.wv1;
import p.fv;
import java.lang.Object;
import p.fw;
import android.content.ComponentName;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.lang.Class;
import java.lang.String;
import android.app.job.JobScheduler;
import java.util.zip.Adler32;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;
import p.kk5;
import p.nk5;
import java.util.List;
import java.util.Iterator;
import android.app.job.JobInfo;
import android.os.PersistableBundle;
import android.os.BaseBundle;
import p.ye7;
import p.u16;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import java.lang.Long;
import android.app.job.JobInfo$Builder;
import java.util.Map;
import p.gv;
import p.l36;
import java.util.Set;
import android.util.Base64;
import java.lang.Integer;

public final class qe3 implements fr7	// class@002385 from classes.dex
{
    public final Context a;
    public final wv1 b;
    public final fv c;

    public void qe3(Context p0,wv1 p1,fv p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(fw p0,int p1){
       fw b;
       fw a1;
       long l;
       JobInfo$Builder uBuilder;
       qe3 c1;
       PersistableBundle persistableB;
       qe3 oqe3 = this;
       fw uofw = p0;
       int i = p1;
       qe3 a = oqe3.a;
       ComponentName uComponentNa = new ComponentName(a, JobInfoSchedulerService.class);
       JobScheduler systemServic = a.getSystemService("jobscheduler");
       Adler32 uAdler32 = new Adler32();
       uAdler32.update(a.getPackageName().getBytes(Charset.forName("UTF-8")));
       uAdler32.update(uofw.a.getBytes(Charset.forName("UTF-8")));
       fw c = uofw.c;
       uAdler32.update(ByteBuffer.allocate(4).putInt(nk5.a(c)).array());
       if ((b = uofw.b) != null) {
          uAdler32.update(b);
       }
       int i1 = (int)uAdler32.getValue();
       Iterator iterator = systemServic.getAllPendingJobs().iterator();
       while (true) {
          int i2 = 0;
          int i3 = 1;
          String str = "attemptNumber";
          if (iterator.hasNext()) {
             JobInfo jobInfo = iterator.next();
             int intx = jobInfo.getExtras().getInt(str);
             if (jobInfo.getId() == i1) {
                if (intx >= i) {
                   iterator = 1;
                label_0087 :
                   if (iterator) {
                      ye7.r("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", uofw);
                      return;
                   }else {
                      String[] stringArray = new String[]{a1,String.valueOf(nk5.a(c))};
                      a1 = uofw.a;
                      Cursor uCursor = oqe3.b.b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", stringArray);
                      Long longx = (uCursor.moveToNext())? Long.valueOf(uCursor.getLong(i2)): Long.valueOf(0);
                      uCursor.close();
                      l = longx.longValue();
                      uBuilder = new JobInfo$Builder(i1, uComponentNa);
                      c1 = oqe3.c;
                      uBuilder.setMinimumLatency(c1.a(c, l, i));
                      gv c2 = c1.b.get(c).c;
                      if (c2.contains(l36.a)) {
                         uBuilder.setRequiredNetworkType(2);
                      }else {
                         uBuilder.setRequiredNetworkType(1);
                      }
                      if (c2.contains(l36.c)) {
                         uBuilder.setRequiresCharging(true);
                      }
                      if (c2.contains(l36.b)) {
                         uBuilder.setRequiresDeviceIdle(true);
                      }
                      persistableB = new PersistableBundle();
                      persistableB.putInt(str, i);
                      persistableB.putString("backendName", a1);
                      persistableB.putInt("priority", nk5.a(c));
                      int i4 = 0;
                      if (b != null) {
                         persistableB.putString("extras", Base64.encodeToString(b, i4));
                         break ;
                      }
                      break ;
                   }
                }
             }
          }
          uBuilder = 0;
          goto label_0087 ;
       }
       uBuilder.setExtras(persistableB);
       Object[] objArray = new Object[]{uofw,Integer.valueOf(i1),Long.valueOf(c1.a(c, l, i)),Long.valueOf(l),Integer.valueOf(p1)};
       ye7.C("JobInfoScheduler");
       String.format("Scheduling upload for context %s with jobId=%d in %dms\(Backend next call timestamp %d\). Attempt %d", objArray);
       systemServic.schedule(uBuilder.build());
       return;
    }
}
