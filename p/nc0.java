package p.nc0;
import java.lang.Runnable;
import java.lang.Object;
import p.tx;
import android.content.Context;
import p.ev0;
import p.y37;
import java.lang.Class;
import java.lang.String;
import p.co5;
import p.c81;
import p.fw;
import p.zk;
import p.dt;
import p.r87;
import p.y84;
import java.util.logging.Logger;
import java.lang.IllegalArgumentException;
import java.lang.Exception;
import p.vx7;
import p.ce7;
import p.u16;
import p.yx6;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.content.Intent;
import p.es3;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import p.n55;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import android.content.BroadcastReceiver$PendingResult;
import p.oc0;
import p.vf;
import p.pc0;
import p.e64;
import android.view.MenuItem;
import p.c74;
import java.util.concurrent.atomic.AtomicBoolean;
import p.fn0;
import p.ml0;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import p.iw1;
import p.kl0;
import io.reactivex.rxjava3.core.CompletableSource;

public final class nc0 implements Runnable	// class@001faa from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object t;
    public final Object v;

    public void nc0(Object p0,Object p1,Object p2,Object p3,int p4){
       this.a = p4;
       this.v = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       super();
    }
    public void nc0(Object p0,Object p1,Object p2,Object p3,int p4,int p5){
       this.a = p4;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       super();
    }
    public final void run(){
       r87 or87;
       ml0 v;
       c74 uoc74 = null;
       boolean b = true;
       nc0 tv = this.v;
       nc0 tt = this.t;
       boolean b1 = false;
       nc0 tc = this.c;
       nc0 tb = this.b;
       switch (this.a){
           case 0:
             if (tb != null) {
                tv.b.R = b;
                tb.b.c(b1);
                tv.b.R = b1;
             }
             if (tc.isEnabled() && tc.hasSubMenu()) {
                tt.q(tc, uoc74, 4);
             }
             return;
             break;
           case 1:
             es3.c().getClass();
             n55.a(tc, ConstraintProxy$BatteryNotLowProxy.class, tb.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", b1));
             n55.a(tc, ConstraintProxy$BatteryChargingProxy.class, tb.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", b1));
             n55.a(tc, ConstraintProxy$StorageNotLowProxy.class, tb.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", b1));
             n55.a(tc, ConstraintProxy$NetworkStateProxy.class, tb.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", b1));
             tt.finish();
             return;
           case 2:
             Logger f = c81.f;
             try{
                if ((or87 = tb.c.a(tc.a)) == null) {
                   Object[] objArray = new Object[b];
                   objArray[b1] = tc.a;
                   String str = String.format("Transport backend \'%s\' is not registered", objArray);
                   f.warning(str);
                   tt.f(new IllegalArgumentException(str));
                }else {
                   tb.e.y(new ce7(tb, tc, or87.a(tv)));
                   tt.f(uoc74);
                }
             }catch(java.lang.Exception e0){
                f.warning("Error scheduling event "+e0.getMessage());
                tt.f(e0);
             }
             return;
             break;
           case 3:
             tb.getClass();
             co5.o(tc, "context");
             co5.o(tt, "coreLibraryType");
             co5.o(tv, "timeKeeper");
             tb.c(tc, tt, tv, b1);
             return;
           default:
             if (tb.compareAndSet(b1, b)) {
                tc.e();
                if ((v = tv.v) == null) {
                   tt.onError(new TimeoutException(iw1.e(tv.b, tv.c)));
                }else {
                   v.subscribe(new kl0(this));
                }
             }
             return;
       }
    }
}
