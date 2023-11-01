package p.rj0;
import p.nw1;
import java.lang.String;
import p.es3;
import android.content.Context;
import p.n91;
import java.lang.Object;
import java.util.HashMap;
import android.content.Intent;
import p.qq7;
import p.d91;
import p.xq6;
import p.ey6;
import java.util.Objects;
import java.lang.Class;
import p.br0;
import p.uq7;
import p.lr7;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import p.lq0;
import java.util.Iterator;
import p.jr7;
import p.zq0;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import android.content.ComponentName;
import java.util.Collection;
import p.fq7;
import java.lang.System;
import p.ap5;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p.ce7;
import java.util.concurrent.Executor;
import p.yx5;
import java.lang.Runnable;
import android.os.Bundle;
import android.os.BaseBundle;
import java.lang.StringBuilder;
import p.xy5;
import p.rq7;
import p.c8;
import java.util.List;
import p.ns6;
import p.oy6;
import p.my6;
import p.uy;
import p.uw6;
import p.sw6;

public final class rj0 implements nw1	// class@0024f8 from classes.dex
{
    public final Context a;
    public final HashMap b;
    public final Object c;
    public final n91 t;
    public static final String v;

    static {
       rj0.v = es3.d("CommandHandler");
    }
    public void rj0(Context p0,n91 p1){
       super();
       this.a = p0;
       this.t = p1;
       this.b = new HashMap();
       this.c = new Object();
    }
    public static qq7 d(Intent p0){
       return new qq7(p0.getStringExtra("KEY_WORKSPEC_ID"), p0.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }
    public static void e(Intent p0,qq7 p1){
       p0.putExtra("KEY_WORKSPEC_ID", p1.a);
       p0.putExtra("KEY_WORKSPEC_GENERATION", p1.b);
    }
    public final boolean a(){
       rj0 tc = this.c;
       _monitor_enter(tc);
       boolean b = (!this.b.isEmpty())? true: false;
       _monitor_exit(tc);
       return b;
    }
    public final void b(qq7 p0,boolean p1){
       rj0 tc = this.c;
       _monitor_enter(tc);
       d91 uod91 = this.b.remove(p0);
       this.t.h(p0);
       if (uod91 != null) {
          uod91.f(p1);
       }
       _monitor_exit(tc);
       return;
    }
    public final void c(Intent p0,int p1,ey6 p2){
       jr7 ojr7;
       qq7 oqq7;
       jr7 ojr71;
       ArrayList uArrayList2;
       xq6 oxq6;
       my6 omy6;
       qq7 a3;
       String action = p0.getAction();
       int i = 8;
       int i1 = 1;
       boolean b = false;
       if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
          Objects.toString(p0);
          es3.c().getClass();
          br0 uobr0 = new br0(this.a, p1, p2);
          ArrayList uArrayList = p2.v.C.y().i();
          Iterator iterator = uArrayList.iterator();
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          int i5 = 0;
          while (iterator.hasNext()) {
             jr7 j = iterator.next().j;
             i2 = i2 | j.d;
             i3 = i3 | j.b;
             i4 = i4 | j.e;
             int i6 = (j.a != i1)? 1: 0;
             i5 = i5 | i6;
             if (i2 && (i3 && (i4 && i5))) {
                break ;
             }
          }
          Intent iterator1 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
          br0 a = uobr0.a;
          iterator1.setComponent(new ComponentName(a, ConstraintProxyUpdateReceiver.class));
          iterator1.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", i2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", i3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", i4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", i5);
          a.sendBroadcast(iterator1);
          br0 c = uobr0.c;
          c.c(uArrayList);
          ArrayList uArrayList1 = new ArrayList(uArrayList.size());
          long l = System.currentTimeMillis();
          Iterator iterator2 = uArrayList.iterator();
          while (iterator2.hasNext()) {
             ojr7 = iterator2.next();
             jr7 a1 = ojr7.a;
             if ((l - ojr7.a()) >= 0 && (!ojr7.b() && !c.a(a1))) {
                uArrayList1.add(ojr7);
             }
          }
          iterator2 = uArrayList1.iterator();
          while (iterator2.hasNext()) {
             ojr7 = iterator2.next();
             Intent intent = new Intent(a, SystemAlarmService.class);
             intent.setAction("ACTION_DELAY_MET");
             rj0.e(intent, ap5.o(ojr7));
             es3.c().getClass();
             p2.b.c.execute(new yx5(p2, intent, uobr0.b, i));
          }
          c.d();
       }else if("ACTION_RESCHEDULE".equals(action)){
          Objects.toString(p0);
          es3.c().getClass();
          p2.v.A();
       }else {
          Bundle extras = p0.getExtras();
          String[] stringArray = new String[]{"KEY_WORKSPEC_ID"};
          xq6 a2 = (extras != null && (!extras.isEmpty() && extras.get(stringArray[b]) != null))? 1: 0;
          if (!extras) {
             es3.c().a(rj0.v, "Invalid request for "+action+" , requires KEY_WORKSPEC_ID .");
          }else if("ACTION_SCHEDULE_WORK".equals(action)){
             oqq7 = rj0.d(p0);
             oqq7.toString();
             es3.c().getClass();
             uq7 c1 = p2.v.C;
             c1.c();
             if ((ojr71 = c1.y().l(oqq7.a)) == null) {
                oqq7.toString();
                es3.c().getClass();
             }else if(ojr71.b.a()){
                oqq7.toString();
                es3.c().getClass();
             }else {
                long l1 = ojr71.a();
                rj0 ta = this.a;
                if (!ojr71.b()) {
                   oqq7.toString();
                   es3.c().getClass();
                   c8.b(ta, c1, oqq7, l1);
                }else {
                   oqq7.toString();
                   es3.c().getClass();
                   c8.b(ta, c1, oqq7, l1);
                   oqq7 = new Intent(ta, SystemAlarmService.class);
                   oqq7.setAction("ACTION_CONSTRAINTS_CHANGED");
                   p2.b.c.execute(new yx5(p2, oqq7, p1, i));
                }
                c1.r();
             }
             c1.m();
          }else if("ACTION_DELAY_MET".equals(action)){
             rj0 tc = this.c;
             _monitor_enter(tc);
             oqq7 = rj0.d(p0);
             oqq7.toString();
             es3.c().getClass();
             if (!this.b.containsKey(oqq7)) {
                d91 uod91 = new d91(this.a, p1, p2, this.t.i(oqq7));
                this.b.put(oqq7, uod91);
                uod91.e();
             }else {
                oqq7.toString();
                es3.c().getClass();
             }
             _monitor_exit(tc);
          }else if("ACTION_STOP_WORK".equals(action)){
             Bundle extras1 = p0.getExtras();
             String str = extras1.getString("KEY_WORKSPEC_ID");
             action = "KEY_WORKSPEC_GENERATION";
             rj0 tt = this.t;
             if (extras1.containsKey(action)) {
                uArrayList2 = new ArrayList(i1);
                if ((oxq6 = tt.h(new qq7(str, extras1.getInt(action)))) != null) {
                   uArrayList2.add(oxq6);
                }
             }else {
                uArrayList2 = tt.g(str);
             }
             Iterator iterator3 = uArrayList2.iterator();
             while (iterator3.hasNext()) {
                xq6 oxq61 = iterator3.next();
                es3.c().getClass();
                ey6 v = p2.v;
                v.D.j(new ns6(v, oxq61, b));
                a2 = oxq61.a;
                oy6 ooy6 = p2.v.C.v();
                if ((omy6 = ooy6.n(a2)) != null) {
                   c8.a(this.a, a2, omy6.c);
                   a2.toString();
                   es3.c().getClass();
                   ooy6.b.b();
                   uw6 ouw6 = ooy6.t.c();
                   if ((a3 = a2.a) == null) {
                      ouw6.z(i1);
                   }else {
                      ouw6.s(i1, a3);
                   }
                   ouw6.P(2, (long)a2.b);
                   ooy6.b.c();
                   ouw6.u();
                   ooy6.b.r();
                   ooy6.b.m();
                   ooy6.t.f(ouw6);
                }
                p2.b(oxq61.a, b);
             }
          }else if("ACTION_EXECUTION_COMPLETED".equals(action)){
             p0.toString();
             es3.c().getClass();
             this.b(rj0.d(p0), p0.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE"));
          }else {
             p0.toString();
             es3.c().getClass();
          }
       }
       return;
    }
}
