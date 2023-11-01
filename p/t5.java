package p.t5;
import java.lang.Runnable;
import java.lang.Object;
import p.ta6;
import p.sx7;
import p.r15;
import p.j07;
import p.f25;
import java.lang.Exception;
import p.w51;
import p.n25;
import p.ax7;
import p.ux7;
import android.os.Bundle;
import java.lang.Class;
import p.si4;
import p.wy7;
import p.xy7;
import java.lang.Boolean;
import p.ey7;
import java.lang.String;
import p.jd;
import java.util.concurrent.atomic.AtomicBoolean;
import p.yy7;
import p.zy7;
import java.lang.Throwable;
import p.dy7;
import p.jy7;
import p.i28;
import p.xx7;
import p.yx7;
import p.vz7;
import p.wz7;
import p.fz7;
import p.gz7;
import p.hz7;
import p.jz7;
import p.oz7;
import p.pz7;
import p.qz7;
import p.rz7;
import android.widget.EditText;
import p.fg0;
import p.l85;
import android.text.TextWatcher;
import android.widget.TextView;
import android.widget.AutoCompleteTextView;
import p.df1;
import p.ze1;
import p.ig0;
import p.a28;
import java.util.concurrent.Callable;
import java.lang.RuntimeException;
import p.qy7;
import p.pv6;
import java.lang.NullPointerException;
import p.o07;
import java.util.concurrent.Executor;
import p.q15;
import p.bu0;
import p.su7;
import p.ju7;
import p.fp0;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import android.app.Activity;
import com.google.android.gms.common.api.GoogleApiActivity;
import android.content.Intent;
import android.content.Context;
import android.os.Parcelable;
import p.ak3;
import p.hl2;
import android.widget.ProgressBar;
import android.util.AttributeSet;
import android.view.View;
import android.app.AlertDialog$Builder;
import p.tt7;
import java.lang.CharSequence;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog;
import android.content.DialogInterface$OnCancelListener;
import p.zk;
import android.content.IntentFilter;
import p.ot7;
import android.content.BroadcastReceiver;
import p.ql2;
import p.ol2;
import p.ut7;
import p.iu7;
import p.pu7;
import java.lang.StringBuilder;
import p.nl2;
import p.bl2;
import p.m4;
import android.os.IInterface;
import android.os.IBinder;
import p.i43;
import p.h43;
import java.util.concurrent.ConcurrentHashMap;
import p.ll2;
import p.se;
import java.util.Set;
import java.util.Collections;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import android.app.job.JobParameters;
import android.app.job.JobService;
import p.nq7;
import p.x0;
import p.q0;
import p.pc6;
import p.gc2;
import p.es3;
import p.jr7;
import p.fm3;
import androidx.work.WorkerParameters;
import p.pq7;
import p.oq7;
import java.util.UUID;
import p.ce7;
import p.am3;
import java.lang.IllegalStateException;
import p.iy6;
import p.uq7;
import p.wk5;
import p.qq7;
import p.ap5;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collection;
import p.fq7;
import p.e91;
import p.cn2;
import p.ur7;
import p.em3;
import java.util.concurrent.Future;
import androidx.work.Worker;
import p.x6;
import java.lang.reflect.Method;
import android.app.Application;
import p.w6;
import android.app.Application$ActivityLifecycleCallbacks;
import p.w5;
import p.e64;
import p.c64;
import p.r5;
import p.v64;
import p.bz7;

public final class t5 implements Runnable	// class@002707 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void t5(Object p0,int p1,Object p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public void t5(Object p0,Object p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    private void a(){
       this.c.run();
       ta6 t = this.b.t;
       _monitor_enter(t);
       this.b.b();
       _monitor_exit(t);
    }
    private final void b(){
       sx7 c = this.c.c;
       _monitor_enter(c);
       t5 tc = this.c;
       if (tc.t != null) {
          tc.t.a(this.b);
       }
       _monitor_exit(c);
       return;
    }
    private final void c(){
       sx7 c = this.c.c;
       _monitor_enter(c);
       t5 tc = this.c;
       if (tc.t != null) {
          Exception uException = this.b.d();
          w51.k(uException);
          tc.t.c(uException);
       }
       _monitor_exit(c);
       return;
    }
    private final void d(){
       sx7 c = this.c.c;
       _monitor_enter(c);
       t5 tc = this.c;
       if (tc.t != null) {
          tc.t.onSuccess(this.b.e());
       }
       _monitor_exit(c);
       return;
    }
    public final void run(){
       t5 tc;
       w5 c;
       e64 e;
       t5 tb;
       Object[] objArray1;
       em3 uoem3;
       jr7 ojr7;
       t5 obj;
       ll2 oll2;
       nl2 a;
       iu7 c2;
       Exception ot51;
       pu7 b1;
       ut7 d1;
       Intent intent;
       j07 oj07;
       kj b3;
       yy7 oyy7;
       Object[] objArray2;
       dy7 a2;
       t5 ot5 = null;
       int i = 0;
       int i1 = 1;
       switch (this.a){
           case 0:
             tc = this.c;
             if ((c = tc.c) != null && (e = c.e) != null) {
                e.k(c);
             }
             if ((c = tc.y) != null && c.getWindowToken() != null) {
                tb = this.b;
                if (!tb.b()) {
                   if (tb.f == null) {
                   label_070e :
                      if (i) {
                         tc.J = tb;
                      }
                   }else {
                      tb.d(i, i, i, i);
                   }
                }
                i = 1;
                goto label_070e ;
             }
             tc.L = ot5;
             return;
             break;
           case 2:
             this.b.a = this.c;
             return;
           case 3:
             this.b.unregisterActivityLifecycleCallbacks(this.c);
             return;
           case 4:
             try{
                Method d = x6.d;
                ot5 = this.c;
                tb = this.b;
                int i2 = 2;
                if (d != null) {
                   Object[] objArray = new Object[]{ot5,Boolean.FALSE,"AppCompat recreation"};
                   d.invoke(tb, objArray);
                }else {
                   objArray1 = new Object[i2];
                   objArray1[i] = ot5;
                   objArray1[i1] = Boolean.FALSE;
                   x6.e.invoke(tb, objArray1);
                }
             label_06c8 :
                return;
             }catch(java.lang.RuntimeException e0){
                if (e0.getClass() == RuntimeException.class && (e0.getMessage() != null && e0.getMessage().startsWith("Unable to stop"))) {
                   throw e0;
                }else {
                   goto label_06c8 ;
                }
             }
             break;
           case 5:
             this.c.getClass();
             throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo\(\)`");
           case 6:
             if (!this.c.G.a instanceof q0) {
                this.b.get();
                es3.c().getClass();
                tc = this.c;
                tc.G.k(tc.v.e());
             }
             return;
             break;
           case 7:
             tc = this.c;
             try{
                if ((uoem3 = tc.G.get()) == null) {
                   es3.c().a(ur7.I, tc.t.c+" returned a null result. Treating it as a failure.");
                }else {
                   uoem3.toString();
                   es3.c().getClass();
                   tc.x = uoem3;
                }
             }catch(java.util.concurrent.CancellationException e0){
                es3.c().getClass();
             }catch(java.lang.InterruptedException e1){
             }catch(java.util.concurrent.ExecutionException e1){
             }
             es3.c().b(ur7.I, this.b+" failed because it threw an exception/error", e1);
             break;
           case 8:
             ot5 = this.b;
             es3.c().getClass();
             jr7[] ojr7Array = new jr7[i1];
             ojr7Array[i] = ot5;
             this.c.a.f(ojr7Array);
             return;
           case 9:
             if ((ojr7 = this.c.a.F.c(this.b)) != null && ojr7.b()) {
                iy6 c1 = this.c.c;
                _monitor_enter(c1);
                this.c.w.put(ap5.o(ojr7), ojr7);
                this.c.x.add(ojr7);
                tc = this.c;
                tc.y.c(tc.x);
                _monitor_exit(c1);
             }
             return;
             break;
           case 10:
             this.a();
             return;
           case 11:
             String str = "Worker was marked important \(";
             if (!this.c.a.a instanceof q0) {
                if ((obj = this.b.get()) != null) {
                   es3.c().getClass();
                   tc = this.c;
                   nq7 onq7 = tc.v;
                   onq7.getClass();
                   pc6 opc6 = new pc6();
                   oq7 v9 = new oq7(onq7, opc6, tc.t.b.a, obj, tc.b);
                   onq7.a.j(v9);
                   tc.a.k(opc6);
                }else {
                   throw new IllegalStateException(str+this.c.c.c+"\) but did not provide ForegroundInfo");
                }
             }
             return;
             break;
           case 12:
             this.b.jobFinished(this.c, i);
             return;
           case 13:
             try{
                tc = this.c;
                tb = tc;
                if ((oll2 = tb.f.j.get(tb.b)) != null) {
                   obj = this.b;
                   if (obj.b == null) {
                      i = 1;
                   }
                   if (i) {
                      tb.e = i1;
                      if (!tb.a.b()) {
                         a = tc.a;
                         nl2 a1 = tc.a;
                         bl2 x = (a1.b())? a1.x: Collections.emptySet();
                         a.h(ot5, x);
                      }
                   }else {
                      oll2.d(obj, ot5);
                   }
                }
             }catch(java.lang.SecurityException e0){
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e0);
                tb.a.e("Failed to get service from broker.");
                oll2.d(new fp0(10), ot5);
             }
             return;
             break;
           case 14:
             tc = this.c;
             tb = this.b;
             tc.getClass();
             iu7 b = tb.b;
             obj = (b.b == null)? 1: 0;
             if (obj) {
                c2 = tb.c;
                w51.k(c2);
                pu7 c3 = c2.c;
                if (c3.b == null) {
                   i = 1;
                }
                if (!i) {
                   StringBuilder i3 = new StringBuilder((String.valueOf(c3).length() + 48));
                   ot51 = new Exception();
                   tc.g.b(c3);
                   tc.f.d();
                label_042b :
                   return;
                }else {
                   ut7 g = tc.g;
                   if ((b1 = c2.b) != null) {
                      ot5 = b1.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                      if (ot5 instanceof i43) {
                      }else {
                         ot5 = new h43(b1);
                      }
                   }
                   g.getClass();
                   if (ot5 != null && (d1 = tc.d) != null) {
                      g.c = ot5;
                      g.d = d1;
                      g.c();
                   }else {
                      ot51 = new Exception();
                      g.b(new fp0(4));
                   }
                }
             }else {
                tc.g.b(b);
             }
             tc.f.d();
             goto label_042b ;
             break;
           case 15:
             if (this.c.b != null) {
                ju7 b2 = this.b.b;
                c2 = (b2.b != null && b2.c != null)? 1: 0;
                if (c2) {
                   ot5 = this.c;
                   fp0 c4 = b2.c;
                   w51.k(c4);
                   intent = new Intent(ot5.a(), GoogleApiActivity.class);
                   intent.putExtra("pending_intent", c4);
                   intent.putExtra("failing_client_id", this.b.a);
                   intent.putExtra("notify_manager", i);
                   ot5.a.startActivityForResult(intent, i1);
                }else if((tb = this.c) != null){
                   ot5 = this.c;
                   t5 tc1 = this.c;
                   ot5.v.h(ot5.a(), tc1.a, b2.b, tc1);
                }else if(b2.b == 18){
                   Activity uActivity = this.c.a();
                   ProgressBar progressBar = new ProgressBar(uActivity, ot5, 0x101007a);
                   progressBar.setIndeterminate(i1);
                   progressBar.setVisibility(i);
                   AlertDialog$Builder i4 = new AlertDialog$Builder(uActivity);
                   i4.setView(progressBar);
                   i4.setMessage(tt7.e(uActivity, 18));
                   i4.setPositiveButton("", ot5);
                   AlertDialog uAlertDialog = i4.create();
                   hl2.g(uActivity, uAlertDialog, "GooglePlayServicesUpdatingDialog", this.c);
                   tc = this.c;
                   Context applicationC = tc.a().getApplicationContext();
                   zk ozk = new zk(this, uAlertDialog);
                   tc.v.getClass();
                   IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                   intentFilter.addDataScheme("package");
                   ot7 oot7 = new ot7(ozk);
                   applicationC.registerReceiver(oot7, intentFilter);
                   oot7.a = applicationC;
                   if (!ql2.a(applicationC)) {
                      ozk.h();
                      oot7.a();
                   }
                }else {
                   this.c.x.e(b2, this.b.a);
                }
             }
             return;
             break;
           case 16:
             if (this.b.d != null) {
                this.c.t.i();
             }else {
                try{
                   this.c.t.k(this.c.c.j(this.b));
                }catch(p.k06 e0){
                   if (e0.getCause() instanceof Exception) {
                      this.c.t.j(e0.getCause());
                   }else {
                      this.c.t.j(e0);
                   }
                }catch(java.lang.Exception e0){
                   this.c.t.j(e0);
                }
             }
             return;
             break;
           case 17:
             tc = this.c;
             try{
                if ((oj07 = tc.t.j(this.b)) == null) {
                   tc.c(new NullPointerException("Continuation returned null"));
                }else {
                   b3 = o07.b;
                   oj07.c(b3, tc);
                   oj07.b(b3, tc);
                   oj07.a(b3, tc);
                }
             }catch(p.k06 e1){
                if (e1.getCause() instanceof Exception) {
                   tc.c.j(e1.getCause());
                }else {
                   tc.c.j(e1);
                }
             }catch(java.lang.Exception e1){
                tc.c.j(e1);
             }
             return;
             break;
           case 18:
             this.b();
             return;
           case 19:
             this.c();
             return;
           case 20:
             this.d();
             return;
           case 21:
             tc = this.c;
             try{
                if ((oj07 = tc.t.i(this.b.e())) == null) {
                   tc.c(new NullPointerException("Continuation returned null"));
                }else {
                   b3 = o07.b;
                   oj07.c(b3, tc);
                   oj07.b(b3, tc);
                   oj07.a(b3, tc);
                }
             }catch(p.k06 e1){
                if (e1.getCause() instanceof Exception) {
                   tc.c(e1.getCause());
                }else {
                   tc.c(e1);
                }
             }catch(java.util.concurrent.CancellationException e0){
                e0.a();
             }catch(java.lang.Exception e1){
                tc.c(e1);
             }
             return;
             break;
           case 22:
             tc = this.b;
             try{
                tc.k(this.c.call());
             }catch(java.lang.Exception e1){
                tc.j(e1);
             }
             return;
             break;
           case 23:
             this.b.removeTextChangedListener(this.c.b.e);
             return;
           case 24:
             boolean b4 = this.b.isPopupShowing();
             ot5 = this.c;
             ot5.b.f(b4);
             ot5.b.j = b4;
             return;
           case 25:
             this.b.removeTextChangedListener(this.c.b.e);
             return;
           case 26:
             this.b.removeTextChangedListener(this.c.b.e);
             return;
           case 27:
             tc = this.b;
             ax7 g1 = tc.g;
             g1.getClass();
             if (g1.c(new si4(g1, this.c)).booleanValue()) {
                ax7 h = tc.h;
                objArray1 = new Object[i];
                jd k = ey7.k;
                k.a("Run extractor loop", objArray1);
                ey7 j = h.j;
                if (!j.compareAndSet(i, i1)) {
                   Object[] objArray4 = new Object[i];
                   k.f("runLoop already looping; return", objArray4);
                }
                try{
                   while (true) {
                      oyy7 = h.i.a();
                      break ;
                   }
                }catch(p.dy7 e7){
                   objArray2 = new Object[i1];
                   objArray2[i] = e7.getMessage();
                   k.c("Error while getting next extraction task: %s", objArray2);
                   if ((a2 = e7.a) >= null) {
                      h.h.c().a(a2);
                      h.a(a2, e7);
                   }
                   oyy7 = ot5;
                }
                if (oyy7 != null) {
                   try{
                      if (oyy7 instanceof xx7) {
                         h.b.a(oyy7);
                      }else if(oyy7 instanceof vz7){
                         h.c.a(oyy7);
                      }else if(oyy7 instanceof fz7){
                         h.d.a(oyy7);
                      }else if(oyy7 instanceof hz7){
                         h.e.a(oyy7);
                      }else if(oyy7 instanceof oz7){
                         h.f.a(oyy7);
                      }else if(oyy7 instanceof qz7){
                         h.g.a(oyy7);
                      }else {
                         objArray2 = new Object[i1];
                         objArray2[i] = oyy7.getClass().getName();
                         k.c("Unknown task type: %s", objArray2);
                      }
                   }catch(java.lang.Exception e8){
                      Object[] objArray3 = new Object[i1];
                      objArray3[i] = e8.getMessage();
                      k.c("Error during extraction task: %s", objArray3);
                      h.h.c().a(oyy7.a);
                      h.a(oyy7.a, e8);
                   }
                }else {
                   j.set(i);
                }
             }
             return;
             break;
           case 28:
             this.b.d();
             return;
           default:
             tc = this.b;
             tc.b.a(tc.c, this.c);
             return;
       }
    }
}
