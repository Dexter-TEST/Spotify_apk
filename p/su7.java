package p.su7;
import android.content.DialogInterface$OnCancelListener;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import p.ak3;
import p.ol2;
import p.hl2;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.nu7;
import android.os.Looper;
import p.sk;
import android.content.Intent;
import p.ju7;
import android.app.Activity;
import android.content.Context;
import p.fp0;
import java.lang.String;
import android.app.PendingIntent;
import android.os.Message;
import android.os.Handler;
import android.os.Bundle;
import android.os.BaseBundle;
import android.os.Parcelable;
import java.lang.Class;
import android.content.DialogInterface;

public final class su7 extends LifecycleCallback implements DialogInterface$OnCancelListener	// class@0026a2 from classes.dex
{
    public boolean b;
    public final AtomicReference c;
    public final nu7 t;
    public final hl2 v;
    public final sk w;
    public final ol2 x;

    public void su7(ak3 p0,ol2 p1){
       super(p0);
       this.c = new AtomicReference(null);
       this.t = new nu7(Looper.getMainLooper());
       this.v = hl2.c;
       this.w = new sk(0);
       this.x = p1;
       p0.k(this);
    }
    public final void b(int p0,int p1,Intent p2){
       su7 tc = this.c;
       ju7 oju7 = tc.get();
       int i = 0;
       if (p0 != 1) {
          if (p0 != 2) {
          label_0056 :
             su7 tx = this.x;
             if (i) {
                tc.set(null);
                ol2 n = tx.n;
                n.sendMessage(n.obtainMessage(3));
             }else if(oju7 != null){
                tx.e(oju7.b, oju7.a);
             }
          }else if(!(p0 = this.v.d(this.a()))){
             i = 1;
          }
          if (oju7 != null) {
             int i1 = 18;
             if (oju7.b.b != i1 || p0 != i1) {
             }
          }
       }else if(p1 == -1){
          i = 1;
          goto label_0056 ;
       }else if(!p1){
          if (oju7 != null) {
             p0 = 13;
             if (p2 != null) {
                p0 = p2.getIntExtra("<<ResolutionFailureErrorDetail>>", p0);
             }
             ju7 oju71 = new ju7(new fp0(1, p0, null, oju7.b.toString()), oju7.a);
             tc.set(oju71);
             oju7 = oju71;
             goto label_0056 ;
          }
       }else {
          goto label_0056 ;
       }
       return;
    }
    public final void c(Bundle p0){
       if (p0 != null) {
          su7 tc = this.c;
          ju7 oju7 = (p0.getBoolean("resolving_error", false))? new ju7(new fp0(p0.getInt("failed_status"), p0.getParcelable("failed_resolution")), p0.getInt("failed_client_id", -1)): null;
          tc.set(oju7);
       }
       return;
    }
    public final void d(){
       if (!this.w.isEmpty()) {
          this.x.b(this);
       }
       return;
    }
    public final void e(Bundle p0){
       ju7 oju7;
       if ((oju7 = this.c.get()) != null) {
          p0.putBoolean("resolving_error", true);
          p0.putInt("failed_client_id", oju7.a);
          oju7 = oju7.b;
          p0.putInt("failed_status", oju7.b);
          p0.putParcelable("failed_resolution", oju7.c);
       }
       return;
    }
    public final void f(){
       this.b = true;
       if (!this.w.isEmpty()) {
          this.x.b(this);
       }
       return;
    }
    public final void g(){
       this.b = false;
       su7 tx = this.x;
       tx.getClass();
       Object r = ol2.r;
       _monitor_enter(r);
       if (tx.k == this) {
          tx.k = null;
          tx.l.clear();
       }
       _monitor_exit(r);
       return;
    }
    public final void h(DialogInterface p0){
       ju7 oju7;
       fp0 uofp0 = new fp0(13, null);
       su7 tc = this.c;
       int i = ((oju7 = tc.get()) == null)? -1: oju7.a;
       su7 tx = this.x;
       tx.e(uofp0, i);
       tc.set(null);
       ol2 n = tx.n;
       n.sendMessage(n.obtainMessage(3));
       return;
    }
    public final void onCancel(DialogInterface p0){
       this.h(p0);
    }
}
