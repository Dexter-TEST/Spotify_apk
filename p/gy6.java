package p.gy6;
import android.content.ComponentCallbacks2;
import p.ei4;
import p.wp5;
import android.content.Context;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import android.net.ConnectivityManager;
import p.n6;
import java.lang.String;
import p.bq5;
import p.i70;
import p.fi4;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import java.lang.ref.Reference;
import p.ui3;
import p.aq5;
import p.dv6;
import p.xl7;
import p.jc7;

public final class gy6 implements ComponentCallbacks2, ei4	// class@0017a5 from classes.dex
{
    public final Context a;
    public final WeakReference b;
    public final fi4 c;
    public boolean t;
    public final AtomicBoolean v;

    public void gy6(wp5 p0,Context p1,boolean p2){
       ConnectivityManager uConnectivit;
       i70 oi70;
       super();
       this.a = p1;
       this.b = new WeakReference(p0);
       if (p2) {
          p0.getClass();
          if ((uConnectivit = n6.e(p1, ConnectivityManager.class)) != null) {
             int i = (!n6.a(p1, "android.permission.ACCESS_NETWORK_STATE"))? 1: 0;
             if (i) {
                try{
                   oi70 = new bq5(uConnectivit, this);
                }catch(java.lang.Exception e0){
                   oi70 = new i70();
                }
             }
          }
          oi70 = new i70();
       }else {
          oi70 = new i70();
       }
       this.c = oi70;
       this.t = oi70.l();
       this.v = new AtomicBoolean(false);
       return;
    }
    public final void a(){
       if (this.v.getAndSet(true)) {
          return;
       }
       this.a.unregisterComponentCallbacks(this);
       this.c.shutdown();
       return;
    }
    public final void onConfigurationChanged(Configuration p0){
       if (this.b.get() == null) {
          this.a();
       }
       return;
    }
    public final void onLowMemory(){
       this.onTrimMemory(80);
    }
    public final void onTrimMemory(int p0){
       wp5 owp5;
       aq5 value;
       jc7 a;
       if ((owp5 = this.b.get()) != null) {
          if ((owp5 = owp5.b) != null && (value = owp5.getValue()) != null) {
             value.a.a(p0);
             value.b.a(p0);
          }
          a = jc7.a;
       }else {
          a = null;
       }
       if (a == null) {
          this.a();
       }
       return;
    }
}
