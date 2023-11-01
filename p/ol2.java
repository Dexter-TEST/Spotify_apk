package p.ol2;
import android.os.Handler$Callback;
import com.google.android.gms.common.api.Status;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import android.os.Looper;
import p.hl2;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ConcurrentHashMap;
import p.sk;
import p.nu7;
import p.oe7;
import android.content.pm.PackageManager;
import p.ye7;
import android.os.Build$VERSION;
import java.lang.Boolean;
import android.os.Message;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.Thread;
import p.we;
import p.fp0;
import p.ko1;
import java.lang.StringBuilder;
import android.app.PendingIntent;
import p.su7;
import java.util.Collection;
import java.lang.Class;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;
import android.os.Parcelable;
import p.fl2;
import p.ll2;
import p.se;
import p.az5;
import android.util.SparseIntArray;
import p.qt7;
import p.gt7;
import p.ku7;
import java.util.List;
import java.util.Arrays;
import p.rl2;
import p.a28;
import java.util.ArrayList;
import p.ml2;
import java.util.LinkedList;
import java.util.Iterator;
import p.lt7;
import p.yt7;
import p.q12;
import p.hd7;
import java.lang.RuntimeException;
import p.bl2;
import p.tp2;
import p.w51;
import java.util.HashMap;
import p.si4;
import java.util.Map;
import p.lk;
import p.b93;
import android.app.Application;
import p.vw;
import p.nt7;
import p.uw;
import java.util.concurrent.atomic.AtomicBoolean;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import p.ql2;
import java.lang.Exception;
import p.st7;
import java.util.Set;

public final class ol2 implements Handler$Callback	// class@002141 from classes.dex
{
    public long a;
    public boolean b;
    public gt7 c;
    public rl2 d;
    public final Context e;
    public final hl2 f;
    public final oe7 g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public su7 k;
    public final sk l;
    public final sk m;
    public final nu7 n;
    public boolean o;
    public static final Status p;
    public static final Status q;
    public static final Object r;
    public static ol2 s;

    static {
       ol2.p = new Status(4, "Sign-out occurred while this API call was in progress.");
       ol2.q = new Status(4, "The user must be signed in to make this API call.");
       ol2.r = new Object();
    }
    public void ol2(Context p0,Looper p1){
       super();
       this.a = 0x2710;
       this.b = false;
       int i = 1;
       this.h = new AtomicInteger(i);
       this.i = new AtomicInteger(false);
       this.j = new ConcurrentHashMap(5, 0x3f400000, i);
       this.k = null;
       this.l = new sk(false);
       this.m = new sk(false);
       this.o = i;
       this.e = p0;
       nu7 onu7 = new nu7(p1, this);
       this.n = onu7;
       this.f = hl2.c;
       this.g = new oe7();
       PackageManager packageManag = p0.getPackageManager();
       if (ye7.e == null) {
          int i1 = (Build$VERSION.SDK_INT >= 26)? 1: 0;
          if (!i1 || !packageManag.hasSystemFeature("android.hardware.type.automotive")) {
             i = false;
          }
          ye7.e = Boolean.valueOf(i);
       }
       if (ye7.e.booleanValue()) {
          this.o = false;
       }
       onu7.sendMessage(onu7.obtainMessage(6));
       return;
    }
    public static ol2 a(Context p0){
       Object r = ol2.r;
       _monitor_enter(r);
       if (ol2.s == null) {
          HandlerThread handlerThrea = new HandlerThread("GoogleApiHandler", 9);
          handlerThrea.start();
          ol2.s = new ol2(p0.getApplicationContext(), handlerThrea.getLooper());
       }
       _monitor_exit(r);
       return ol2.s;
    }
    public static Status d(we p0,fp0 p1){
       ko1 t = p0.b.t;
       String str = String.valueOf(p1);
       StringBuilder str1 = new StringBuilder((str.length() + (String.valueOf(t).length() + 63)))+"API: "+t;
       Status v6 = new Status(1, 17, str1+" is not available on this device. Connection failed with: "+str, p1.c, p1);
       return v6;
    }
    public final void b(su7 p0){
       Object r = ol2.r;
       _monitor_enter(r);
       if (this.k != p0) {
          this.k = p0;
          this.l.clear();
       }
       this.l.addAll(p0.w);
       _monitor_exit(r);
       return;
    }
    public final boolean c(fp0 p0,int p1){
       Intent intent;
       ol2 tf = this.f;
       tf.getClass();
       fp0 b = p0.b;
       boolean b1 = true;
       int i = (b != null && p0.c != null)? 1: 0;
       ol2 te = this.e;
       if (i) {
          p0 = p0.c;
       }else {
          String str = null;
          if ((intent = tf.a(b, te, str)) != null) {
             str = PendingIntent.getActivity(te, 0, intent, 0x8000000);
          }
       }
       if (p0 != null) {
          intent = new Intent(te, GoogleApiActivity.class);
          intent.putExtra("pending_intent", p0);
          intent.putExtra("failing_client_id", p1);
          intent.putExtra("notify_manager", b1);
          tf.i(te, b, PendingIntent.getActivity(te, 0, intent, 0x8000000));
       }else {
          b1 = false;
       }
       return b1;
    }
    public final void e(fp0 p0,int p1){
       if (!this.c(p0, p1)) {
          ol2 tn = this.n;
          tn.sendMessage(tn.obtainMessage(5, p1, 0, p0));
       }
       return;
    }
    public final ll2 f(fl2 p0){
       ll2 oll2;
       fl2 e = p0.e;
       ol2 tj = this.j;
       if ((oll2 = tj.get(e)) == null) {
          oll2 = new ll2(this, p0);
          tj.put(e, oll2);
       }
       if (oll2.b.b()) {
          this.m.add(e);
       }
       oll2.m();
       return oll2;
    }
    public final boolean g(){
       int i;
       if (this.b != null) {
          return false;
       }
       az5.H().getClass();
       if ((i = this.g.a.get(0xc1f7c30, -1)) != -1 && i) {
          return false;
       }
       return true;
    }
    public final boolean handleMessage(Message p0){
       ll2 oll2;
       ll2 oll21;
       fp0 b1;
       ll2 oll22;
       ol2 tm;
       ll2 oll23;
       ml2 b3;
       q12[] oq12Array;
       qt7 obj;
       ol2 tc;
       ol2 tn = this.n;
       ol2 tj = this.j;
       ol2 te = this.e;
       long l = 0x493e0;
       int i = 17;
       int b = false;
       int i1 = 0;
       switch (p0.what){
           case 1:
             if (p0.obj.booleanValue()) {
                l = 0x2710;
             }
             this.a = l;
             tn.removeMessages(12);
             Iterator iterator = tj.keySet().iterator();
             while (iterator.hasNext()) {
                tn.sendMessageDelayed(tn.obtainMessage(12, iterator.next()), this.a);
             }
          label_03e1 :
             return true;
             break;
           case 2:
             tp2.v(p0.obj);
             throw b;
           case 3:
             Iterator iterator1 = tj.values().iterator();
             while (iterator1.hasNext()) {
                oll2 = iterator1.next();
                w51.g(oll2.l.n);
                oll2.k = b;
                oll2.m();
             }
             break;
           case 4:
           case 8:
           case 13:
             p0 = p0.obj;
             if ((oll2 = tj.get(p0.c.e)) == null) {
                oll2 = this.f(p0.c);
             }
             st7 a = p0.a;
             if (oll2.b.b() && this.i.get() != p0.b) {
                a.b(ol2.p);
                oll2.f();
                goto label_03e1 ;
             }else {
                oll2.e(a);
                goto label_03e1 ;
             }
             break;
           case 5:
             Message arg1 = p0.arg1;
             p0 = p0.obj;
             Iterator iterator2 = tj.values().iterator();
             while (true) {
                if (iterator2.hasNext()) {
                   oll21 = iterator2.next();
                   if (oll21.g == arg1) {
                      b = oll21;
                   }
                }
                if (b != null) {
                   if ((b1 = p0.b) == 13) {
                      this.f.getClass();
                      String str = fp0.b(b1);
                      fp0 t = p0.t;
                      StringBuilder str1 = new StringBuilder((String.valueOf(t).length() + (String.valueOf(str).length() + 69)))+"Error resolution was canceled by the user, original error message: "+str;
                      b.b(new Status(i, str1+": "+t, i1));
                      goto label_03e1 ;
                   }else {
                      b.b(ol2.d(b.c, p0));
                      goto label_03e1 ;
                   }
                }else {
                   Exception uException = new Exception();
                   goto label_03e1 ;
                }
             }
             break;
           case 6:
             if (te.getApplicationContext() instanceof Application) {
                vw.b(te.getApplicationContext());
                vw v = vw.v;
                v.a(new nt7(this));
                vw b2 = v.b;
                v = v.a;
                if (!b2.get()) {
                   ActivityManager$RunningAppProcessInfo runningAppPr = new ActivityManager$RunningAppProcessInfo();
                   ActivityManager.getMyMemoryState(runningAppPr);
                   if (!b2.getAndSet(true) && runningAppPr.importance > 100) {
                      v.set(true);
                   }
                }
                if (!v.get()) {
                   this.a = l;
                   goto label_03e1 ;
                }else {
                   goto label_03e1 ;
                }
             }else {
                goto label_03e1 ;
             }
             break;
           case 7:
             this.f(p0.obj);
             goto label_03e1 ;
             break;
           case 9:
             if (tj.containsKey(p0.obj)) {
                oll22 = tj.get(p0.obj);
                w51.g(oll22.l.n);
                if (oll22.i != null) {
                   oll22.m();
                   goto label_03e1 ;
                }else {
                   goto label_03e1 ;
                }
             }else {
                goto label_03e1 ;
             }
             break;
           case 10:
             tm = this.m;
             tm.getClass();
             lk olk = new lk(tm);
             while (olk.hasNext()) {
                if ((oll23 = tj.remove(olk.next())) != null) {
                   oll23.f();
                }
             }
             tm.clear();
             goto label_03e1 ;
             break;
           case 11:
             if (tj.containsKey(p0.obj)) {
                oll22 = tj.get(p0.obj);
                oll2 = oll22.l;
                w51.g(oll2.n);
                if ((oll23 = oll22.i) != null) {
                   if (oll23 != null) {
                      oll23 = oll22.l;
                      ll2 c = oll22.c;
                      oll23.n.removeMessages(11, c);
                      oll23.n.removeMessages(9, c);
                      oll22.i = i1;
                   }
                   Status status = (oll2.f.d(oll2.e) == 18)? new Status(21, "Connection timed out waiting for Google Play services update to complete.", i1): new Status(22, "API failed to connect while resuming due to an unknown error.", i1);
                   oll22.b(status);
                   oll22.b.e("Timing out connection while resuming.");
                   goto label_03e1 ;
                }else {
                   goto label_03e1 ;
                }
             }else {
                goto label_03e1 ;
             }
             break;
           case 12:
             if (tj.containsKey(p0.obj)) {
                oll22 = tj.get(p0.obj);
                w51.g(oll22.l.n);
                oll2 = oll22.b;
                if (oll2.m() && !oll22.f.size()) {
                   oll23 = oll22.d;
                   if (!oll23.a.isEmpty() || !oll23.b.isEmpty()) {
                      i1 = 1;
                   }
                   if (i1) {
                      oll22.q();
                      goto label_03e1 ;
                   }else {
                      oll2.e("Timing out service connection.");
                      goto label_03e1 ;
                   }
                }else {
                   goto label_03e1 ;
                }
             }else {
                goto label_03e1 ;
             }
             break;
           case 14:
             tp2.v(p0.obj);
             throw b;
           case 15:
             p0 = p0.obj;
             if (tj.containsKey(p0.a)) {
                oll2 = tj.get(p0.a);
                if (!oll2.j.contains(p0) || oll2.i != null) {
                   goto label_03e1 ;
                }else if(!oll2.b.m()){
                   oll2.m();
                   goto label_03e1 ;
                }else {
                   oll2.p();
                   goto label_03e1 ;
                }
             }else {
                goto label_03e1 ;
             }
             break;
           case 16:
             p0 = p0.obj;
             if (tj.containsKey(p0.a)) {
                oll2 = tj.get(p0.a);
                if (oll2.j.remove(p0)) {
                   oll23 = oll2.l;
                   oll23.n.removeMessages(15, p0);
                   oll23.n.removeMessages(16, p0);
                   oll21 = oll2.a;
                   ArrayList uArrayList = new ArrayList(oll21.size());
                   Iterator iterator3 = oll21.iterator();
                   while (true) {
                      b3 = p0.b;
                      if (iterator3.hasNext()) {
                         lt7 olt7 = iterator3.next();
                         if (olt7 instanceof yt7 && (oq12Array = olt7.f(oll2)) != null) {
                            b = oq12Array.length;
                            int i2 = 0;
                            while (true) {
                               if (i2 < b) {
                                  if (ye7.x(oq12Array[i2], b3)) {
                                  label_0139 :
                                     b3 = (i2 >= 0)? 1: 0;
                                     if (b3) {
                                        uArrayList.add(olt7);
                                     }
                                  }else {
                                     i2 = i2 + 1;
                                  }
                               }else {
                                  i2 = -1;
                                  goto label_0139 ;
                               }
                            }
                         }
                      }else {
                         break ;
                      }
                   }
                   int i3 = uArrayList.size();
                   while (i1 < i3) {
                      obj = uArrayList.get(i1);
                      i1 = i1 + 1;
                      oll21.remove(obj);
                      obj.c(new hd7(b3));
                   }
                }else {
                   goto label_03e1 ;
                }
             }else {
                goto label_03e1 ;
             }
             break;
           case 17:
             if ((tm = this.c) != null) {
                if (tm.a > null || this.g()) {
                   if (this.d == null) {
                      this.d = new rl2(te);
                   }
                   this.d.e(tm);
                }
                this.c = b;
                goto label_03e1 ;
             }else {
                goto label_03e1 ;
             }
             break;
           case 18:
             p0 = p0.obj;
             obj = p0.a;
             qt7 b4 = p0.b;
             if (!(p0.c)) {
                ku7[] oku7Array = new ku7[true];
                oku7Array[i1] = obj;
                gt7 ogt7 = new gt7(b4, Arrays.asList(oku7Array));
                if (this.d == null) {
                   this.d = new rl2(te);
                }
                this.d.e(ogt7);
                goto label_03e1 ;
             }else if((tc = this.c) != null){
                gt7 b5 = tc.b;
                if (tc.a == b4 && (b5 == null && b5.size() >= p0.d)) {
                   te = this.c;
                   if (te.b == null) {
                      te.b = new ArrayList();
                   }
                   te.b.add(obj);
                }else {
                   tn.removeMessages(i);
                   if ((tc = this.c) != null) {
                      if (tc.a > null || this.g()) {
                         if (this.d == null) {
                            this.d = new rl2(te);
                         }
                         this.d.e(tc);
                      }
                      this.c = b;
                   }
                }
             }
             if (this.c == null) {
                ArrayList uArrayList1 = new ArrayList();
                uArrayList1.add(obj);
                this.c = new gt7(b4, uArrayList1);
                tn.sendMessageDelayed(tn.obtainMessage(i), p0.c);
                goto label_03e1 ;
             }else {
                goto label_03e1 ;
             }
             break;
           case 19:
             this.b = i1;
             goto label_03e1 ;
             break;
           default:
             return i1;
       }
    }
}
