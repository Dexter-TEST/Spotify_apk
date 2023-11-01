package p.p83;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.String;
import p.co5;
import p.fs3;
import p.ns3;
import p.t6;
import p.mj7;
import p.bc;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import p.ai0;
import p.di0;
import p.b3;
import java.lang.Integer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Future;
import java.lang.System;
import android.content.Context;
import p.ej4;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Boolean;
import java.lang.Thread;
import android.os.Looper;
import java.util.Set;
import java.util.HashSet;
import p.ji7;
import java.lang.ref.Reference;
import java.util.Timer;
import java.lang.Throwable;
import android.util.Log;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import p.r6;
import p.ny1;
import p.sz1;
import java.lang.ref.WeakReference;
import p.am0;
import android.os.Handler;
import p.f22;
import p.h22;
import android.hardware.Sensor;
import p.zh0;
import p.ki7;
import p.is7;
import p.t94;
import java.util.Collection;
import p.ha4;
import p.sv6;
import p.w83;
import p.s6;
import p.q83;
import p.aj;

public final class p83 implements Application$ActivityLifecycleCallbacks	// class@00220f from classes.dex
{
    public final int a;

    public void p83(int p0){
       this.a = p0;
       super();
    }
    public final void onActivityCreated(Activity p0,Bundle p1){
       String str = "activity";
       switch (this.a){
           case 0:
           default:
             co5.o(p0, str);
             mj7.j(ns3.t, t6.a, "onActivityCreated");
             t6.b.execute(new bc(9));
             return;
       }
       co5.o(p0, str);
       return;
    }
    public final void onActivityDestroyed(Activity p0){
       String str = "activity";
       switch (this.a){
           case 0:
           default:
             co5.o(p0, str);
             mj7.j(ns3.t, t6.a, "onActivityDestroyed");
             di0.f.p().e.remove(Integer.valueOf(p0.hashCode()));
             return;
       }
       co5.o(p0, str);
       return;
    }
    public final void onActivityPaused(Activity p0){
       ScheduledFuture c;
       ji7 c1;
       SensorManager b;
       ji7 c2;
       String str = "activity";
       switch (this.a){
           case 0:
           default:
             co5.o(p0, str);
             mj7.j(ns3.t, t6.a, "onActivityPaused");
             AtomicInteger e = t6.e;
             if (e.decrementAndGet() < 0) {
                e.set(0);
             }
             String d = t6.d;
             _monitor_enter(d);
             if (t6.c != null && (c = t6.c) != null) {
                c.cancel(0);
             }
             c = null;
             t6.c = c;
             _monitor_exit(d);
             long l = System.currentTimeMillis();
             d = ej4.v(p0);
             if (ai0.e.get()) {
                di0 uodi0 = di0.f.p();
                if (!co5.c(c, Boolean.TRUE)) {
                   if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                      uodi0.b.remove(p0);
                      uodi0.c.clear();
                      uodi0.e.put(Integer.valueOf(p0.hashCode()), uodi0.d.clone());
                      uodi0.d.clear();
                   }else {
                      throw new ny1("Can\'t remove activity from CodelessMatcher on non-UI thread");
                   }
                }
                try{
                   if ((c1 = ai0.c) != null && c1.b.get() != null) {
                      if ((c2 = c1.c) != null) {
                         c2.cancel();
                      }
                      c1.c = c;
                   }
                }catch(java.lang.Exception e9){
                   Log.e(ji7.e, "Error unscheduling indexing job", e9);
                }
                if ((b = ai0.b) != null) {
                   b.unregisterListener(ai0.a);
                }
             }
             t6.b.execute(new r6(0, l, d));
             return;
       }
       co5.o(p0, str);
       return;
    }
    public final void onActivityResumed(Activity p0){
       ScheduledFuture c;
       long l;
       f22 uof22;
       SensorManager systemServic;
       HashSet hashSet;
       String str = "activity";
       switch (this.a){
           case 0:
             try{
                co5.o(p0, str);
                sz1.c().execute(new bc(5));
                return;
             }catch(java.lang.Exception e0){
             }
             break;
           default:
             co5.o(p0, str);
             mj7.j(ns3.t, t6.a, "onActivityResumed");
             t6.k = new WeakReference(p0);
             t6.e.incrementAndGet();
             String d = t6.d;
             _monitor_enter(d);
             int i = 0;
             if (t6.c != null && (c = t6.c) != null) {
                c.cancel(i);
             }
             c = null;
             t6.c = c;
             _monitor_exit(d);
             l = System.currentTimeMillis();
             t6.i = l;
             d = ej4.v(p0);
             if (ai0.e.get()) {
                di0 uodi0 = di0.f.p();
                Boolean tRUE = Boolean.TRUE;
                if (!co5.c(c, tRUE)) {
                   if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                      uodi0.b.add(p0);
                      uodi0.d.clear();
                      if ((hashSet = uodi0.e.get(Integer.valueOf(p0.hashCode()))) != null) {
                         uodi0.d = hashSet;
                      }
                      if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                         uodi0.a();
                      }else {
                         uodi0.a.post(new am0(11, uodi0));
                      }
                   }else {
                      throw new ny1("Can\'t add activity to CodelessMatcher on non-UI thread");
                   }
                }
                Context applicationC = p0.getApplicationContext();
                String str1 = sz1.b();
                if ((uof22 = h22.b(str1)) != null) {
                   Boolean uBoolean = Boolean.valueOf(uof22.g);
                }
                if (co5.c(c, tRUE) && (systemServic = applicationC.getSystemService("sensor")) != null) {
                   ai0.b = systemServic;
                   ji7 oji7 = new ji7(p0);
                   ai0.c = oji7;
                   ki7 a = ai0.a;
                   a.a = new zh0(uof22, i, str1);
                   systemServic.registerListener(a, systemServic.getDefaultSensor(1), 2);
                   if (uof22 != null && uof22.g != null) {
                      oji7.a();
                   }
                }
             }
             try{
                if (is7.A && !new HashSet(t94.d).isEmpty()) {
                   ha4.v.v(p0);
                }
             }catch(java.lang.Exception e0){
             }
       }
       sv6.b(p0);
       w83.a();
       t6.b.execute(new s6(l, e0, p0.getApplicationContext()));
       return;
    }
    public final void onActivitySaveInstanceState(Activity p0,Bundle p1){
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "activity");
             co5.o(p1, "outState");
             mj7.j(ns3.t, t6.a, "onActivitySaveInstanceState");
             return;
       }
       co5.o(p0, "activity");
       co5.o(p1, "outState");
       return;
    }
    public final void onActivityStarted(Activity p0){
       String str = "activity";
       switch (this.a){
           case 0:
           default:
             co5.o(p0, str);
             t6.j = t6.j + 1;
             mj7.j(ns3.t, t6.a, "onActivityStarted");
             return;
       }
       co5.o(p0, str);
       return;
    }
    public final void onActivityStopped(Activity p0){
       String str = "activity";
       switch (this.a){
           case 0:
             break;
           default:
             co5.o(p0, str);
             mj7.j(ns3.t, t6.a, "onActivityStopped");
             aj.b.u();
             t6.j = t6.j - 1;
             return;
       }
       try{
          co5.o(p0, str);
          if (co5.c(q83.c, Boolean.TRUE) && co5.c(p0.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
             sz1.c().execute(new bc(6));
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
