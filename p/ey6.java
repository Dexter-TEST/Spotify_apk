package p.ey6;
import p.nw1;
import java.lang.String;
import p.es3;
import android.content.Context;
import java.lang.Object;
import p.n91;
import p.rj0;
import p.uq7;
import p.rr7;
import p.bo0;
import p.vf;
import p.wk5;
import java.util.ArrayList;
import android.os.Looper;
import java.lang.Thread;
import java.lang.IllegalStateException;
import android.content.Intent;
import java.util.Objects;
import java.lang.Class;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.qq7;
import p.ce7;
import java.util.concurrent.Executor;
import p.yx5;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.lang.Runnable;
import java.util.Iterator;
import android.os.PowerManager$WakeLock;
import p.vl7;
import p.cy6;

public final class ey6 implements nw1	// class@001522 from classes.dex
{
    public final Context a;
    public final ce7 b;
    public final rr7 c;
    public final wk5 t;
    public final uq7 v;
    public final rj0 w;
    public final ArrayList x;
    public Intent y;
    public dy6 z;
    public static final String A;

    static {
       ey6.A = es3.d("SystemAlarmDispatcher");
    }
    public void ey6(Context p0){
       super();
       Context applicationC = p0.getApplicationContext();
       this.a = applicationC;
       this.w = new rj0(applicationC, new n91(2, null));
       uq7 ouq7 = uq7.y(p0);
       this.v = ouq7;
       this.c = new rr7(ouq7.B.e);
       uq7 f = ouq7.F;
       this.t = f;
       this.b = ouq7.D;
       f.a(this);
       this.x = new ArrayList();
       this.y = null;
    }
    public static void c(){
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          return;
       }
       throw new IllegalStateException("Needs to be invoked on the main thread.");
    }
    public final void a(Intent p0,int p1){
       Objects.toString(p0);
       es3.c().getClass();
       ey6.c();
       String action = p0.getAction();
       if (TextUtils.isEmpty(action)) {
          es3.c().getClass();
          return;
       }else if("ACTION_CONSTRAINTS_CHANGED".equals(action) && this.d()){
          return;
       }else {
          p0.putExtra("KEY_START_ID", p1);
          ey6 tx = this.x;
          _monitor_enter(tx);
          this.x.add(p0);
          if (!((this.x.isEmpty() ^ 0x01))) {
             this.e();
          }
          _monitor_exit(tx);
          return;
       }
    }
    public final void b(qq7 p0,boolean p1){
       Intent intent = new Intent(this.a, SystemAlarmService.class);
       intent.setAction("ACTION_EXECUTION_COMPLETED");
       intent.putExtra("KEY_NEEDS_RESCHEDULE", p1);
       rj0.e(intent, p0);
       this.b.c.execute(new yx5(this, intent, 0, 8));
    }
    public final boolean d(){
       String str = "ACTION_CONSTRAINTS_CHANGED";
       ey6.c();
       ey6 tx = this.x;
       _monitor_enter(tx);
       Iterator iterator = this.x.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (str.equals(iterator.next().getAction())) {
                break ;
             }
          }else {
             _monitor_exit(tx);
             return false;
          }
       }
       _monitor_exit(tx);
       return true;
    }
    public final void e(){
       ey6.c();
       PowerManager$WakeLock wakeLock = vl7.a(this.a, "ProcessCommand");
       wakeLock.acquire();
       this.v.D.j(new cy6(this, 0));
       wakeLock.release();
    }
}
