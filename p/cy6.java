package p.cy6;
import java.lang.Runnable;
import p.ey6;
import java.lang.Object;
import java.lang.Class;
import p.es3;
import java.lang.String;
import java.util.Objects;
import java.util.ArrayList;
import android.content.Intent;
import java.lang.IllegalStateException;
import p.ce7;
import p.ta6;
import p.rj0;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.lang.StringBuilder;
import android.content.Context;
import android.os.PowerManager$WakeLock;
import p.vl7;
import java.util.concurrent.Executor;
import java.lang.Throwable;

public final class cy6 implements Runnable	// class@0012a2 from classes.dex
{
    public final int a;
    public final ey6 b;

    public void cy6(ey6 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    private void a(){
       ey6 z;
       cy6 tb = this.b;
       tb.getClass();
       es3.c().getClass();
       ey6.c();
       ey6 x = tb.x;
       _monitor_enter(x);
       if (tb.y != null) {
          Objects.toString(tb.y);
          es3.c().getClass();
          if (tb.x.remove(0).equals(tb.y)) {
             tb.y = null;
          }else {
             throw new IllegalStateException("Dequeue-d command is not the first.");
          }
       }
       ce7 a = tb.b.a;
       if (!tb.w.a() && (tb.x.isEmpty() && !a.a())) {
          es3.c().getClass();
          if ((z = tb.z) != null) {
             z.b();
          }
       }else if(!tb.x.isEmpty()){
          tb.e();
       }
       _monitor_exit(x);
       return;
    }
    public final void run(){
       switch (this.a){
           case 0:
             ey6 x = this.b.x;
             _monitor_enter(x);
             cy6 tb = this.b;
             int i = 0;
             tb.y = tb.x.get(i);
             _monitor_exit(x);
             if ((x = this.b.y) != null) {
                int intExtra = this.b.y.getIntExtra("KEY_START_ID", i);
                Objects.toString(this.b.y);
                es3.c().getClass();
                PowerManager$WakeLock wakeLock = vl7.a(this.b.a, x.getAction()+" \("+intExtra+"\)");
                wakeLock.toString();
                es3.c().getClass();
                wakeLock.acquire();
                cy6 tb1 = this.b;
                tb1.w.c(tb1.y, intExtra, tb1);
                wakeLock.toString();
                es3.c().getClass();
                wakeLock.release();
                cy6 tb2 = this.b;
                ce7 c = tb2.b.c;
                tb1 = new cy6(tb2, 1);
                c.execute(tb1);
             }
             break;
           default:
             this.a();
             return;
       }
       return;
    }
}
