package p.wk5;
import p.nw1;
import p.ic2;
import java.lang.String;
import p.es3;
import android.content.Context;
import p.bo0;
import p.ce7;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import p.ur7;
import p.x0;
import p.q0;
import p.fm3;
import java.util.Objects;
import java.lang.Class;
import p.qq7;
import p.jr7;
import p.ap5;
import java.util.Iterator;
import p.gc2;
import android.os.PowerManager$WakeLock;
import p.vl7;
import android.content.Intent;
import p.iy6;
import p.n6;
import p.xq6;
import p.nq5;
import p.y94;
import java.util.concurrent.Callable;
import p.xy5;
import java.util.concurrent.Executor;
import p.vk5;
import java.lang.Runnable;
import java.util.Set;
import p.tr7;
import p.ka0;
import p.ta6;
import androidx.work.impl.foreground.SystemForegroundService;
import android.content.ComponentName;
import java.lang.Throwable;

public final class wk5 implements nw1, ic2	// class@002b55 from classes.dex
{
    public final HashSet A;
    public final ArrayList B;
    public final Object C;
    public PowerManager$WakeLock a;
    public final Context b;
    public final bo0 c;
    public final ce7 t;
    public final WorkDatabase v;
    public final HashMap w;
    public final HashMap x;
    public final HashMap y;
    public final List z;
    public static final String D;

    static {
       wk5.D = es3.d("Processor");
    }
    public void wk5(Context p0,bo0 p1,ce7 p2,WorkDatabase p3,List p4){
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.x = new HashMap();
       this.w = new HashMap();
       this.z = p4;
       this.A = new HashSet();
       this.B = new ArrayList();
       this.a = null;
       this.C = new Object();
       this.y = new HashMap();
    }
    public static boolean d(ur7 p0){
       if (p0 != null) {
          p0.H = true;
          p0.h();
          p0.G.cancel(true);
          if (p0.v != null && p0.G.a instanceof q0) {
             p0.v.f();
          }else {
             Objects.toString(p0.t);
             es3.c().getClass();
          }
          es3.c().getClass();
          return true;
       }else {
          es3.c().getClass();
          return false;
       }
    }
    public final void a(nw1 p0){
       wk5 tC = this.C;
       _monitor_enter(tC);
       this.B.add(p0);
       _monitor_exit(tC);
    }
    public final void b(qq7 p0,boolean p1){
       ur7 our7;
       wk5 tC = this.C;
       _monitor_enter(tC);
       if ((our7 = this.x.get(p0.a)) != null && p0.equals(ap5.o(our7.t))) {
          this.x.remove(p0.a);
       }
       es3.c().getClass();
       Iterator iterator = this.B.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1);
       }
       _monitor_exit(tC);
       return;
    }
    public final jr7 c(String p0){
       ur7 our7;
       wk5 tC = this.C;
       _monitor_enter(tC);
       if ((our7 = this.w.get(p0)) == null) {
          our7 = this.x.get(p0);
       }
       if (our7 != null) {
          _monitor_exit(tC);
          return our7.t;
       }else {
          _monitor_exit(tC);
          return null;
       }
    }
    public final boolean e(String p0){
       wk5 tC = this.C;
       _monitor_enter(tC);
       _monitor_exit(tC);
       return this.A.contains(p0);
    }
    public final boolean f(String p0){
       wk5 tC = this.C;
       _monitor_enter(tC);
       boolean b = (!this.x.containsKey(p0) && !this.w.containsKey(p0))? false: true;
       _monitor_exit(tC);
       return b;
    }
    public final void g(nw1 p0){
       wk5 tC = this.C;
       _monitor_enter(tC);
       this.B.remove(p0);
       _monitor_exit(tC);
    }
    public final void h(String p0,gc2 p1){
       ur7 our7;
       wk5 tC = this.C;
       _monitor_enter(tC);
       es3.c().getClass();
       if ((our7 = this.x.remove(p0)) != null) {
          if (this.a == null) {
             PowerManager$WakeLock wakeLock = vl7.a(this.b, "ProcessorForegroundLck");
             this.a = wakeLock;
             wakeLock.acquire();
          }
          this.w.put(p0, our7);
          n6.g(this.b, iy6.e(this.b, ap5.o(our7.t), p1));
       }
       _monitor_exit(tC);
       return;
    }
    public final boolean i(xq6 p0,nq5 p1){
       xq6 a = p0.a;
       qq7 a1 = a.a;
       ArrayList uArrayList = new ArrayList();
       ur7 obj = this.v.p(new y94(this, uArrayList, a1, 2));
       boolean b = false;
       if (obj == null) {
          a.toString();
          es3.c().getClass();
          this.t.c.execute(new vk5(this, a, b, b));
          return b;
       }else {
          wk5 tC = this.C;
          _monitor_enter(tC);
          if (this.f(a1)) {
             Set set = this.y.get(a1);
             if (set.iterator().next().a.b == a.b) {
                set.add(p0);
                a.toString();
                es3.c().getClass();
             }else {
                this.t.c.execute(new vk5(this, a, b, b));
             }
             _monitor_exit(tC);
             return b;
          }else if(obj.t != a.b){
             this.t.c.execute(new vk5(this, a, b, b));
             _monitor_exit(tC);
             return b;
          }else {
             tr7 v11 = new tr7(this.b, this.c, this.t, this, this.v, obj, uArrayList);
             v11.y = this.z;
             if (p1 != null) {
                v11.A = p1;
             }
             ur7 our7 = new ur7(v11);
             obj = our7.F;
             ka0 uArrayList1 = new ka0(this, p0.a, obj, 5, 0);
             obj.a(uArrayList, this.t.c);
             this.x.put(a1, our7);
             HashSet hashSet = new HashSet();
             hashSet.add(p0);
             this.y.put(a1, hashSet);
             _monitor_exit(tC);
             this.t.a.execute(our7);
             a.toString();
             es3.c().getClass();
             return true;
          }
       }
    }
    public final void j(String p0){
       wk5 tC = this.C;
       _monitor_enter(tC);
       this.w.remove(p0);
       this.k();
       _monitor_exit(tC);
    }
    public final void k(){
       wk5 ta;
       wk5 tC = this.C;
       _monitor_enter(tC);
       if (!((this.w.isEmpty() ^ 0x01))) {
          Intent intent = new Intent(this.b, SystemForegroundService.class);
          intent.setAction("ACTION_STOP_FOREGROUND");
          this.b.startService(intent);
          if ((ta = this.a) != null) {
             ta.release();
             this.a = null;
          }
       }
       _monitor_exit(tC);
       return;
    }
    public final void l(xq6 p0){
       ur7 our7;
       qq7 a = p0.a.a;
       wk5 tC = this.C;
       _monitor_enter(tC);
       es3.c().getClass();
       if ((our7 = this.w.remove(a)) != null) {
          this.y.remove(a);
       }
       _monitor_exit(tC);
       wk5.d(our7);
       return;
    }
}
