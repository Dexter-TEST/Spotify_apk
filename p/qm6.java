package p.qm6;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import p.nm6;
import android.os.Handler$Callback;
import p.om6;
import java.lang.ref.Reference;
import p.mz;
import p.rz;
import android.os.Message;

public final class qm6	// class@0023d0 from classes.dex
{
    public final Object a;
    public final Handler b;
    public om6 c;
    public om6 d;
    public static qm6 e;

    public void qm6(){
       super();
       this.a = new Object();
       this.b = new Handler(Looper.getMainLooper(), new nm6(this));
    }
    public static qm6 b(){
       if (qm6.e == null) {
          qm6.e = new qm6();
       }
       return qm6.e;
    }
    public final boolean a(om6 p0,int p1){
       mz omz;
       if ((omz = p0.a.get()) == null) {
          return 0;
       }
       this.b.removeCallbacksAndMessages(p0);
       Handler o = rz.o;
       o.sendMessage(o.obtainMessage(1, p1, 0, omz.a));
       return 1;
    }
    public final boolean c(mz p0){
       qm6 tc = this.c;
       boolean b = false;
       if (tc != null) {
          int i = (p0 != null && tc.a.get() == p0)? 1: 0;
          if (i) {
             b = true;
          }
       }
       return b;
    }
    public final void d(mz p0){
       qm6 ta = this.a;
       _monitor_enter(ta);
       if (this.c(p0)) {
          qm6 tc = this.c;
          if (tc.c == null) {
             tc.c = true;
             this.b.removeCallbacksAndMessages(tc);
          }
       }
       _monitor_exit(ta);
       return;
    }
    public final void e(mz p0){
       qm6 ta = this.a;
       _monitor_enter(ta);
       if (this.c(p0)) {
          qm6 tc = this.c;
          if (tc.c != null) {
             tc.c = false;
             this.f(tc);
          }
       }
       _monitor_exit(ta);
       return;
    }
    public final void f(om6 p0){
       om6 b;
       if ((b = p0.b) == -2) {
          return;
       }
       if (b <= null) {
          b = (b == -1)? 1500: 2750;
       }
       qm6 tb = this.b;
       tb.removeCallbacksAndMessages(p0);
       tb.sendMessageDelayed(Message.obtain(tb, 0, p0), (long)b);
       return;
    }
    public final void g(){
       qm6 td;
       mz omz;
       if ((td = this.d) != null) {
          this.c = td;
          om6 oom6 = null;
          this.d = oom6;
          if ((omz = td.a.get()) != null) {
             Handler o = rz.o;
             o.sendMessage(o.obtainMessage(0, omz.a));
          }else {
             this.c = oom6;
          }
       }
       return;
    }
}
