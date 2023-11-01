package p.d91;
import p.eq7;
import p.pr7;
import java.lang.String;
import p.es3;
import android.content.Context;
import p.ey6;
import p.xq6;
import java.lang.Object;
import p.uq7;
import p.ce7;
import p.ta6;
import java.util.concurrent.Executor;
import p.fq7;
import p.zq7;
import p.qq7;
import java.lang.Class;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p.rj0;
import p.yx5;
import java.lang.Runnable;
import p.wk5;
import p.rr7;
import android.os.PowerManager$WakeLock;
import java.util.Objects;
import java.util.ArrayList;
import p.c91;
import java.util.List;
import java.util.Iterator;
import p.jr7;
import p.ap5;
import java.lang.StringBuilder;
import p.en6;
import p.vl7;
import p.lr7;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.Collection;

public final class d91 implements eq7, pr7	// class@001300 from classes.dex
{
    public PowerManager$WakeLock A;
    public boolean B;
    public final xq6 C;
    public final Context a;
    public final int b;
    public final qq7 c;
    public final ey6 t;
    public final fq7 v;
    public final Object w;
    public int x;
    public final ta6 y;
    public final Executor z;

    static {
       es3.d("DelayMetCommandHandler");
    }
    public void d91(Context p0,int p1,ey6 p2,xq6 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.t = p2;
       this.c = p3.a;
       this.C = p3;
       ey6 b = p2.b;
       this.y = b.a;
       this.z = b.c;
       this.v = new fq7(p2.v.J, this);
       this.B = false;
       this.x = 0;
       this.w = new Object();
    }
    public static void a(d91 p0){
       d91 c = p0.c;
       int i = 2;
       if (p0.x < i) {
          p0.x = i;
          es3.c().getClass();
          d91 a = p0.a;
          Intent intent = new Intent(a, SystemAlarmService.class);
          intent.setAction("ACTION_STOP_WORK");
          rj0.e(intent, c);
          d91 t = p0.t;
          d91 b = p0.b;
          p0 = p0.z;
          p0.execute(new yx5(t, intent, b, 8));
          if (t.t.f(c.a)) {
             es3.c().getClass();
             intent = new Intent(a, SystemAlarmService.class);
             intent.setAction("ACTION_SCHEDULE_WORK");
             rj0.e(intent, c);
             p0.execute(new yx5(t, intent, b, 8));
          }else {
             es3.c().getClass();
          }
       }else {
          es3.c().getClass();
       }
       return;
    }
    public final void b(){
       d91 tA;
       d91 tw = this.w;
       _monitor_enter(tw);
       this.v.d();
       this.t.c.a(this.c);
       if ((tA = this.A) != null && tA.isHeld()) {
          Objects.toString(this.A);
          Objects.toString(this.c);
          es3.c().getClass();
          this.A.release();
       }
       _monitor_exit(tw);
       return;
    }
    public final void c(ArrayList p0){
       this.y.execute(new c91(this, 0));
    }
    public final void d(List p0){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          if (ap5.o(iterator.next()).equals(this.c)) {
             this.y.execute(new c91(this, 2));
             break ;
          }
       }
       return;
    }
    public final void e(){
       jr7 ojr7;
       qq7 a = this.c.a;
       this.A = vl7.a(this.a, en6.o(en6.s(a, " \("), this.b, "\)"));
       Objects.toString(this.A);
       es3.c().getClass();
       this.A.acquire();
       if ((ojr7 = this.t.v.C.y().l(a)) == null) {
          this.y.execute(new c91(this, 1));
          return;
       }else {
          boolean b = ojr7.b();
          this.B = b;
          if (!b) {
             es3.c().getClass();
             this.d(Collections.singletonList(ojr7));
          }else {
             this.v.c(Collections.singletonList(ojr7));
          }
          return;
       }
    }
    public final void f(boolean p0){
       Intent intent;
       d91 tc = this.c;
       Objects.toString(tc);
       es3.c().getClass();
       this.b();
       SystemAlarmService systemAlarmS = SystemAlarmService.class;
       d91 tb = this.b;
       d91 tt = this.t;
       d91 tz = this.z;
       d91 ta = this.a;
       if (p0) {
          intent = new Intent(ta, systemAlarmS);
          intent.setAction("ACTION_SCHEDULE_WORK");
          rj0.e(intent, tc);
          tz.execute(new yx5(tt, intent, tb, 8));
       }
       if (this.B != null) {
          intent = new Intent(ta, systemAlarmS);
          intent.setAction("ACTION_CONSTRAINTS_CHANGED");
          tz.execute(new yx5(tt, intent, tb, 8));
       }
       return;
    }
}
