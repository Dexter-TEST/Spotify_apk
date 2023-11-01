package p.x44;
import android.os.Handler;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import android.os.Looper;
import android.os.Message;
import p.wq3;
import java.util.ArrayList;
import p.fh5;
import p.vq3;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;
import p.wd5;
import p.iz7;
import java.lang.Runnable;
import p.lc1;
import java.util.Set;
import java.util.Collection;
import java.util.WeakHashMap;
import java.util.Iterator;
import p.a5;
import java.util.List;
import java.util.LinkedHashMap;
import p.e20;
import java.lang.String;
import p.cv5;
import java.lang.StringBuilder;
import p.lf7;
import java.lang.Class;
import android.net.NetworkInfo;
import p.zd5;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import android.net.ConnectivityManager;
import p.mv5;
import p.gi4;
import p.ii4;
import android.graphics.Bitmap;
import p.iw3;
import android.util.LruCache;
import p.hw3;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.util.Map;
import p.co5;
import p.cj2;
import android.os.Bundle;
import android.os.BaseBundle;
import android.content.ServiceConnection;
import java.lang.RuntimeException;
import p.tp2;
import android.content.DialogInterface$OnClickListener;
import java.lang.ref.Reference;
import p.i54;
import p.z44;
import p.a54;
import p.k54;
import p.xr6;
import java.lang.Long;

public final class x44 extends Handler	// class@002c07 from classes.dex
{
    public final int a;
    public final Object b;

    public void x44(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void x44(DialogInterface p0){
       this.a = 2;
       super();
       this.b = new WeakReference(p0);
    }
    public void x44(Looper p0,Object p1,int p2){
       this.a = p2;
       super(p0);
       this.b = p1;
    }
    public void x44(Object p0,Looper p1,int p2){
       this.a = p2;
       this.b = p0;
       super(p1);
    }
    private void a(Message p0){
       wq3 b;
       int i;
       fh5[] uofh5Array;
       int i1;
       object oobject;
       int i2;
       int i3;
       vq3 ovq3;
       if (p0.what != 1) {
          super.handleMessage(p0);
       }else {
          x44 tb = this.b;
       }
       return;
    }
    public final void handleMessage(Message p0){
       Message what;
       x44 tb2;
       a5 i3;
       e20 uoe20;
       a5 uoa5;
       int allocationBy;
       e20 e1;
       a5 obj;
       e20 c;
       lc1 obj1;
       lc1 i4;
       int type;
       Iterator iterator2;
       e20 c1;
       long l1;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       k54 ok54 = null;
       switch (this.a){
           case 0:
             if (p0.what == 1) {
                z44 a = this.b.a;
                _monitor_enter(a);
                a54 uoa54 = this.b.d.get();
                x44 tb = this.b;
                z44 e = tb.e;
                _monitor_exit(a);
                if (uoa54 != null && (tb == uoa54.h() && e != null)) {
                   uoa54.b(p0.obj);
                   this.b.a(uoa54, e);
                   uoa54.b(ok54);
                }
             }
             return;
             break;
           case 1:
             this.b.getClass();
             return;
           case 2:
             if ((what = p0.what) != -3 && (what != -2 && what != -1)) {
                if (what == 1) {
                   p0.obj.dismiss();
                }
             }else {
                p0.obj.onClick(this.b.get(), p0.what);
             }
             return;
             break;
           case 3:
             what = p0.what;
             x44 tb1 = this.b;
             if (what != 1) {
                if (what != i2) {
                   if (what != i1) {
                      throw new RuntimeException("Unknown message "+p0);
                   }else {
                      tp2.v(tb1);
                      throw ok54;
                   }
                }else {
                   tp2.v(tb1);
                   throw ok54;
                }
             }else {
                tp2.v(tb1);
                throw ok54;
             }
             break;
           case 4:
             this.a(p0);
             return;
           case 5:
             try{
                co5.o(p0, "message");
                tb2 = this.b;
                tb2.getClass();
                if (p0.what == tb2.g) {
                   Bundle data = p0.getData();
                   if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                      tb2.a(ok54);
                   }else {
                      tb2.a(data);
                   }
                   tb2.a.unbindService(tb2);
                }
                return;
             }catch(java.lang.IllegalArgumentException e0){
             }
             break;
           case 6:
             String str = "canceled";
             switch (p0.what){
                 case 1:
                   this.b.d(p0.obj, true);
                   break;
                 case 2:
                   p0 = p0.obj;
                   tb2 = this.b;
                   tb2.getClass();
                   i3 = p0.i;
                   if ((uoe20 = tb2.d.get(i3)) != null) {
                      uoe20.d(p0);
                      if (uoe20.b()) {
                         tb2.d.remove(i3);
                         if (p0.a.l != null) {
                            lf7.e("Dispatcher", str, p0.b.b());
                         }
                      }
                   }
                   if (tb2.g.contains(p0.j)) {
                      tb2.f.remove(p0.d());
                      if (p0.a.l != null) {
                         lf7.f("Dispatcher", str, p0.b.b(), "because paused request got canceled");
                      }
                   }
                   if ((uoa5 = tb2.e.remove(p0.d())) != null && uoa5.a.l != null) {
                      lf7.f("Dispatcher", str, uoa5.b.b(), "from replaying");
                   }
                   break;
                 case 4:
                   p0 = p0.obj;
                   tb2 = this.b;
                   tb2.getClass();
                   i3 = (!((p0.y & i2)))? 1: 0;
                   if (i3) {
                      lc1 j = tb2.j;
                      uoe20 = p0.w;
                      e20 d = p0.D;
                      j.getClass();
                      if (uoe20 != null && d != null) {
                         if ((allocationBy = d.getAllocationByteCount()) >= 0) {
                            iw3 a1 = j.a;
                            if (allocationBy > j.a.maxSize()) {
                               a1.remove(uoe20);
                            }else {
                               a1.put(uoe20, new hw3(d, allocationBy));
                            }
                         }else {
                            throw new IllegalStateException("Negative size: "+d);
                         }
                      }else {
                         throw new NullPointerException("key == null || bitmap == null");
                      }
                   }
                   tb2.d.remove(p0.w);
                   tb2.a(p0);
                   if (p0.b.l != null) {
                      lf7.f("Dispatcher", "batched", lf7.c(p0), "for completion");
                   }
                   break;
                 case 5:
                   p0 = p0.obj;
                   tb2 = this.b;
                   tb2.getClass();
                   e1 = ((e1 = p0.E) != null && e1.isCancelled())? 1: 0;
                   if (!e1) {
                      if (tb2.b.isShutdown()) {
                         tb2.c(p0, false);
                      }else if(tb2.m != null){
                         ok54 = tb2.a.getSystemService("connectivity").getActiveNetworkInfo();
                      }
                      uoe20 = ((e1 = p0.I) > null)? 1: 0;
                      if (!uoe20) {
                         e1 = 0;
                      }else {
                         p0.I = e1 - 1;
                         i = p0.A.f(ok54);
                      }
                      if (e1) {
                         if (p0.b.l != null) {
                            lf7.e("Dispatcher", "retrying", lf7.c(p0));
                         }
                         if (p0.G instanceof gi4) {
                            p0.z = p0.z | 0x01;
                         }
                         p0.E = tb2.b.submit(p0);
                      }else if(tb2.m != null){
                         e1 = p0.A;
                         e1.getClass();
                         if (e1 instanceof ii4) {
                            i = true;
                         label_02d4 :
                            tb2.c(p0, i);
                            if (i) {
                               if ((e1 = p0.B) != null && (obj = e1.d()) != null) {
                                  e1.k = true;
                                  tb2.e.put(obj, e1);
                               }
                               if ((c = p0.C) != null) {
                                  i = c.size();
                                  i1 = 0;
                                  while (i1 < i) {
                                     a5 uoa51 = c.get(i1);
                                     if ((obj1 = uoa51.d()) != null) {
                                        uoa51.k = true;
                                        tb2.e.put(obj1, uoa51);
                                     }
                                     i1 = i1 + 1;
                                  }
                               }
                            }
                         }
                      }
                      i = false;
                      goto label_02d4 ;
                   }
                   break;
                 case 6:
                   this.b.c(p0.obj, false);
                   break;
                 case 7:
                   x44 tb3 = this.b;
                   tb3.getClass();
                   ArrayList uArrayList = new ArrayList(tb3.l);
                   tb3.l.clear();
                   i4 = tb3.i;
                   i4.sendMessage(i4.obtainMessage(8, uArrayList));
                   if (!uArrayList.isEmpty() && uArrayList.get(0).b.l != null) {
                      StringBuilder str1 = "";
                      Iterator iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         e1 = iterator.next();
                         if (str1.length() > 0) {
                            str1 = str1.append(", ");
                         }
                         str1 = str1.append(lf7.c(e1));
                      }
                      lf7.e("Dispatcher", "delivered", str1);
                   }
                   break;
                 case 9:
                   p0 = p0.obj;
                   tb2 = this.b;
                   obj1 = tb2.b;
                   if (obj1 instanceof zd5) {
                      if (p0 != null) {
                         obj1.getClass();
                         if (p0.isConnectedOrConnecting()) {
                            if (type = p0.getType()) {
                               if (type != 1 && (type != 6 && type != 9)) {
                                  obj1.a(i1);
                               }else {
                                  obj1.a(i);
                               }
                            }else {
                               i = p0.getSubtype();
                               switch (i){
                                   case 1:
                                   case 2:
                                     obj1.a(1);
                                     break;
                                   case 3:
                                   case 5:
                                   case 6:
                                   case 4:
                                     obj1.a(i2);
                                     break;
                                   default:
                                     switch (i){
                                         case 12:
                                         case 13:
                                         case 15:
                                         case 14:
                                           obj1.a(i1);
                                           break;
                                         default:
                                           obj1.a(i1);
                                     }
                               }
                            }
                         }
                      }
                      obj1.a(i1);
                   }
                   if (p0 != null && (p0.isConnected() && !tb2.e.isEmpty())) {
                      Iterator iterator1 = tb2.e.values().iterator();
                      while (iterator1.hasNext()) {
                         i3 = iterator1.next();
                         iterator1.remove();
                         if (i3.a.l != null) {
                            lf7.e("Dispatcher", "replaying", i3.b.b());
                         }
                         tb2.d(i3, false);
                      }
                   }
                   break;
                 case 10:
                   this.b.getClass();
                   break;
                 case 11:
                   p0 = p0.obj;
                   tb2 = this.b;
                   if (tb2.g.add(p0)) {
                      iterator2 = tb2.d.values().iterator();
                      while (iterator2.hasNext()) {
                         uoe20 = iterator2.next();
                         wd5 l = uoe20.b.l;
                         e20 b = uoe20.B;
                         int i5 = ((c1 = uoe20.C) != null && !c1.isEmpty())? 1: 0;
                         if (b == null && !i5) {
                         }else if(b != null && b.j.equals(p0)){
                            uoe20.d(b);
                            tb2.f.put(b.d(), b);
                            if (l != null) {
                               lf7.f("Dispatcher", "paused", b.b.b(), "because tag \'".append(p0).append("\' was paused").toString());
                            }
                         }
                         if (i5) {
                            allocationBy = c1.size() - 1;
                            while (allocationBy >= 0) {
                               a5 uoa52 = c1.get(allocationBy);
                               if (uoa52.j.equals(p0)) {
                                  uoe20.d(uoa52);
                                  tb2.f.put(uoa52.d(), uoa52);
                                  if (l != null) {
                                     lf7.f("Dispatcher", "paused", uoa52.b.b(), "because tag \'".append(p0).append("\' was paused").toString());
                                  }
                               }
                               allocationBy = allocationBy - 1;
                            }
                         }
                         if (uoe20.b()) {
                            iterator2.remove();
                            if (l != null) {
                               lf7.f("Dispatcher", str, lf7.c(uoe20), "all actions paused");
                            }
                         }
                      }
                   }
                   break;
                 case 12:
                   p0 = p0.obj;
                   tb2 = this.b;
                   if (tb2.g.remove(p0)) {
                      iterator2 = tb2.f.values().iterator();
                      while (iterator2.hasNext()) {
                         obj = iterator2.next();
                         if (obj.j.equals(p0)) {
                            if (ok54 == null) {
                               ok54 = new ArrayList();
                            }
                            ok54.add(obj);
                            iterator2.remove();
                         }
                      }
                      if (ok54 != null) {
                         i4 = tb2.i;
                         i4.sendMessage(i4.obtainMessage(13, ok54));
                      }
                   }
                   break;
                 default:
                   wd5.m.post(new iz7(this, p0, 17));
             }
             return;
             break;
           default:
             what = p0.what;
             x44 tb4 = this.b;
             if (what != null) {
                if (what != 1) {
                   if (what != i2) {
                      if (what != i1) {
                         if (what != i) {
                            wd5.m.post(new iz7(this, p0, 19));
                         }else {
                            tb4.k = tb4.k + 1;
                            l1 = p0.obj.longValue() + tb4.e;
                            tb4.e = l1;
                            tb4.h = l1 / (long)tb4.k;
                         }
                      }else {
                         tb4.m = tb4.m + 1;
                         l1 = tb4.g + (long)p0.arg1;
                         tb4.g = l1;
                         tb4.j = l1 / (long)tb4.l;
                      }
                   }else {
                      int i6 = tb4.l + 1;
                      tb4.l = i6;
                      l1 = tb4.f + (long)p0.arg1;
                      tb4.f = l1;
                      tb4.i = l1 / (long)i6;
                   }
                }else {
                   tb4.d = tb4.d + 1;
                }
             }else {
                tb4.c = tb4.c + 1;
             }
             return;
       }
    }
}
