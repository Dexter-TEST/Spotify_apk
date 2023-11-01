package p.lc1;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import p.qc4;
import p.ae1;
import p.iw3;
import p.xr6;
import java.lang.Object;
import p.jc1;
import java.lang.Thread;
import android.os.Looper;
import android.os.HandlerThread;
import p.lf7;
import android.os.Message;
import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.LinkedHashSet;
import p.x44;
import java.util.ArrayList;
import android.content.ContentResolver;
import java.lang.String;
import android.provider.Settings$Global;
import p.fg;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import p.e20;
import java.util.concurrent.Future;
import android.graphics.Bitmap;
import p.wd5;
import java.util.Map;
import p.a5;
import java.util.Set;
import p.cv5;
import java.lang.StringBuilder;
import p.en6;
import java.lang.Runnable;

public final class lc1	// class@001d25 from classes.dex
{
    public final Context a;
    public final ExecutorService b;
    public final ae1 c;
    public final LinkedHashMap d;
    public final WeakHashMap e;
    public final WeakHashMap f;
    public final LinkedHashSet g;
    public final x44 h;
    public final Handler i;
    public final iw3 j;
    public final xr6 k;
    public final ArrayList l;
    public final boolean m;

    public void lc1(Context p0,ExecutorService p1,qc4 p2,ae1 p3,iw3 p4,xr6 p5){
       super();
       jc1 ojc1 = new jc1();
       ojc1.start();
       qc4 oqc4 = new qc4(ojc1.getLooper(), 2);
       oqc4.sendMessageDelayed(oqc4.obtainMessage(), 1000);
       this.a = p0;
       this.b = p1;
       this.d = new LinkedHashMap();
       this.e = new WeakHashMap();
       this.f = new WeakHashMap();
       this.g = new LinkedHashSet();
       this.h = new x44(ojc1.getLooper(), this, 6);
       this.c = p3;
       this.i = p2;
       this.j = p4;
       this.k = p5;
       this.l = new ArrayList(4);
       ContentResolver contentResol = p0.getContentResolver();
       boolean b = true;
       try{
          int i = 0;
          int intx = Settings$Global.getInt(contentResol, "airplane_mode_on", i);
       }catch(java.lang.NullPointerException e0){
       }catch(java.lang.SecurityException e0){
       }
       if (p0.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE")) {
          b = false;
       }
       this.m = b;
       fg uofg = new fg(this);
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
       fg b1 = uofg.b;
       if (b1.m != null) {
          intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
       }
       b1.a.registerReceiver(uofg, intentFilter);
       return;
    }
    public final void a(e20 p0){
       e20 e = ((e = p0.E) != null && e.isCancelled())? 1: 0;
       if (e) {
          return;
       }else if((e = p0.D) != null){
          e.prepareToDraw();
       }
       this.l.add(p0);
       lc1 th = this.h;
       if (!th.hasMessages(7)) {
          th.sendEmptyMessageDelayed(7, 200);
       }
       return;
    }
    public final void b(e20 p0){
       lc1 th = this.h;
       th.sendMessage(th.obtainMessage(4, p0));
    }
    public final void c(e20 p0,boolean p1){
       if (p0.b.l != null) {
          String str = lf7.c(p0);
          String str1 = (p1)? " \(will replay\)": "";
          lf7.f("Dispatcher", "batched", str, "for error".concat(str1));
       }
       this.d.remove(p0.w);
       this.a(p0);
       return;
    }
    public final void d(a5 p0,boolean p1){
       e20 uoe20;
       e20 c;
       String str = "Dispatcher";
       if (this.g.contains(p0.j)) {
          this.f.put(p0.d(), p0);
          if (p0.a.l != null) {
             lf7.f(str, "paused", p0.b.b(), "because tag \'"+p0.j+"\' is paused");
          }
          return;
       }else if((uoe20 = this.d.get(p0.i)) != null){
          wd5 l = uoe20.b.l;
          a5 b = p0.b;
          if (uoe20.B == null) {
             uoe20.B = p0;
             if (l != null) {
                if ((c = uoe20.C) != null && !c.isEmpty()) {
                   lf7.f("Hunter", "joined", b.b(), lf7.d(uoe20, "to "));
                }else {
                   lf7.f("Hunter", "joined", b.b(), "to empty hunter");
                }
             }
          }else if(uoe20.C == null){
             uoe20.C = new ArrayList(3);
          }
          uoe20.C.add(p0);
          if (l != null) {
             lf7.f("Hunter", "joined", b.b(), lf7.d(uoe20, "to "));
          }
          cv5 s = p0.b.s;
          if (en6.A(s) > en6.A(uoe20.J)) {
             uoe20.J = s;
          }
          return;
       }else if(this.b.isShutdown()){
          if (p0.a.l != null) {
             lf7.f(str, "ignored", p0.b.b(), "because shut down");
          }
          return;
       }else {
          uoe20 = e20.e(p0.a, this, this.j, this.k, p0);
          uoe20.E = this.b.submit(uoe20);
          this.d.put(p0.i, uoe20);
          if (p1) {
             this.e.remove(p0.d());
          }
          if (p0.a.l != null) {
             lf7.e(str, "enqueued", p0.b.b());
          }
          return;
       }
    }
}
