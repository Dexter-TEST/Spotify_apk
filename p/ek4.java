package p.ek4;
import android.os.Handler$Callback;
import android.content.ServiceConnection;
import android.content.Context;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import android.os.HandlerThread;
import java.lang.String;
import java.lang.Thread;
import android.os.Handler;
import android.os.Looper;
import p.dk4;
import android.util.Log;
import java.util.Objects;
import java.util.ArrayDeque;
import android.content.Intent;
import android.content.ComponentName;
import p.fk4;
import p.bk4;
import p.f53;
import android.os.Message;
import p.ck4;
import p.e53;
import android.os.IInterface;
import android.os.IBinder;
import p.d53;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import p.gk4;
import java.util.Set;
import android.content.pm.PackageManager;
import java.util.List;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.Map$Entry;
import java.util.Collection;

public final class ek4 implements Handler$Callback, ServiceConnection	// class@0014a4 from classes.dex
{
    public final Context a;
    public final Handler b;
    public final HashMap c;
    public HashSet d;

    public void ek4(Context p0){
       super();
       this.c = new HashMap();
       this.d = new HashSet();
       this.a = p0;
       HandlerThread handlerThrea = new HandlerThread("NotificationManagerCompat");
       handlerThrea.start();
       this.b = new Handler(handlerThrea.getLooper(), this);
    }
    public final void a(dk4 p0){
       boolean i;
       fk4 uofk4;
       String str = "NotifManCompat";
       dk4 a = p0.a;
       dk4 d = p0.d;
       if (Log.isLoggable(str, 3)) {
          Objects.toString(a);
          d.size();
       }
       if (d.isEmpty()) {
          return;
       }else if(p0.b != null){
          i = 1;
       }else {
          ek4 ta = this.a;
          i = ta.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(a), this, 33);
          p0.b = i;
          if (i) {
             p0.e = 0;
          }else {
             Objects.toString(a);
             ta.unbindService(this);
          }
          i = p0.b;
       }
       if (i != null && p0.c != null) {
          try{
             while ((uofk4 = d.peek()) != null) {
                if (Log.isLoggable(str, 3)) {
                   uofk4.toString();
                }
                uofk4.a(p0.c);
                d.remove();
             }
          }catch(android.os.DeadObjectException e0){
             if (Log.isLoggable(e0, 3)) {
                Objects.toString(a);
             }
          }catch(android.os.RemoteException e0){
             Objects.toString(a);
          }
          if (!d.isEmpty()) {
             this.b(p0);
          }
          return;
       }else {
          this.b(p0);
          return;
       }
    }
    public final void b(dk4 p0){
       ek4 tb = this.b;
       int i = 3;
       dk4 a = p0.a;
       if (tb.hasMessages(i, a)) {
          return;
       }
       int i1 = p0.e + 1;
       p0.e = i1;
       if (i1 > 6) {
          p0 = p0.d;
          p0.size();
          Objects.toString(a);
          p0.clear();
          return;
       }else {
          Log.isLoggable("NotifManCompat", i);
          tb.sendMessageDelayed(tb.obtainMessage(i, a), (long)((1 << (i1 - 1)) * 1000));
          return;
       }
    }
    public final boolean handleMessage(Message p0){
       dk4 uodk4;
       dk4 uodk41;
       ComponentName uComponentNa;
       Iterator iterator;
       Message what = p0.what;
       f53 uof53 = null;
       int i = 3;
       if (what != null) {
          if (what != true) {
             if (what != 2) {
                if (what != i) {
                   return false;
                }else if((uodk4 = this.c.get(p0.obj)) != null){
                   this.a(uodk4);
                }
                return true;
             }else if((uodk4 = this.c.get(p0.obj)) != null){
                if (uodk4.b != null) {
                   this.a.unbindService(this);
                   uodk4.b = false;
                }
                uodk4.c = uof53;
             }
             return true;
          }else {
             p0 = p0.obj;
             ck4 b = p0.b;
             if ((uodk41 = this.c.get(p0.a)) != null) {
                if (b != null) {
                   if ((uof53 = b.queryLocalInterface("android.support.v4.app.INotificationSideChannel")) != null && uof53 instanceof f53) {
                   }else {
                      uof53 = new d53(b);
                   }
                }
                uodk41.c = uof53;
                uodk41.e = 0;
                this.a(uodk41);
             }
             return true;
          }
       }else {
          p0 = p0.obj;
          String str = Settings$Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
          Iterator c = gk4.c;
          _monitor_enter(c);
          if (str != null && !str.equals(gk4.d)) {
             String[] stringArray = str.split(":", -1);
             HashSet hashSet = new HashSet(stringArray.length);
             int len = stringArray.length;
             int i1 = 0;
             while (i1 < len) {
                if ((uComponentNa = ComponentName.unflattenFromString(stringArray[i1])) != null) {
                   hashSet.add(uComponentNa.getPackageName());
                }
                i1 = i1 + 1;
             }
             gk4.e = hashSet;
             gk4.d = str;
          }
          HashSet e = gk4.e;
          _monitor_exit(c);
          if (!e.equals(this.d)) {
             this.d = e;
             HashSet hashSet1 = new HashSet();
             c = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), false).iterator();
             while (c.hasNext()) {
                ResolveInfo resolveInfo = c.next();
                if (!e.contains(resolveInfo.serviceInfo.packageName)) {
                   continue ;
                }else {
                   ResolveInfo serviceInfo = resolveInfo.serviceInfo;
                   ComponentName uComponentNa1 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                   if (resolveInfo.serviceInfo.permission != null) {
                      uComponentNa1.toString();
                   }else {
                      hashSet1.add(uComponentNa1);
                   }
                }
             }
             iterator = hashSet1.iterator();
             while (iterator.hasNext()) {
                ComponentName uComponentNa2 = iterator.next();
                if (!this.c.containsKey(uComponentNa2)) {
                   if (Log.isLoggable("NotifManCompat", i)) {
                      Objects.toString(uComponentNa2);
                   }
                   this.c.put(uComponentNa2, new dk4(uComponentNa2));
                }
             }
             iterator = this.c.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                if (!hashSet1.contains(uEntry.getKey())) {
                   if (Log.isLoggable("NotifManCompat", i)) {
                      Objects.toString(uEntry.getKey());
                   }
                   dk4 value = uEntry.getValue();
                   if (value.b != null) {
                      this.a.unbindService(this);
                      value.b = false;
                   }
                   value.c = uof53;
                   iterator.remove();
                }
             }
          }
          iterator = this.c.values().iterator();
          while (iterator.hasNext()) {
             dk4 uodk42 = iterator.next();
             uodk42.d.add(p0);
             this.a(uodk42);
          }
          return true;
       }
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       if (Log.isLoggable("NotifManCompat", 3)) {
          Objects.toString(p0);
       }
       this.b.obtainMessage(1, new ck4(p0, p1)).sendToTarget();
       return;
    }
    public final void onServiceDisconnected(ComponentName p0){
       if (Log.isLoggable("NotifManCompat", 3)) {
          Objects.toString(p0);
       }
       this.b.obtainMessage(2, p0).sendToTarget();
       return;
    }
}
