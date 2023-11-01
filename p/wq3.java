package p.wq3;
import java.lang.Object;
import android.content.Context;
import java.util.HashMap;
import java.util.ArrayList;
import p.x44;
import android.os.Looper;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import p.vq3;
import java.lang.String;
import android.content.Intent;
import android.content.ContentResolver;
import android.net.Uri;
import java.util.Set;
import java.util.Objects;
import java.lang.Integer;
import p.fh5;
import android.os.Handler;

public final class wq3	// class@002b87 from classes.dex
{
    public final Context a;
    public final HashMap b;
    public final HashMap c;
    public final ArrayList d;
    public final x44 e;
    public static final Object f;
    public static wq3 g;

    static {
       wq3.f = new Object();
    }
    public void wq3(Context p0){
       super();
       this.b = new HashMap();
       this.c = new HashMap();
       this.d = new ArrayList();
       this.a = p0;
       this.e = new x44(this, p0.getMainLooper(), 4);
    }
    public static wq3 a(Context p0){
       Object f = wq3.f;
       _monitor_enter(f);
       if (wq3.g == null) {
          wq3.g = new wq3(p0.getApplicationContext());
       }
       _monitor_exit(f);
       return wq3.g;
    }
    public final void b(BroadcastReceiver p0,IntentFilter p1){
       ArrayList uArrayList;
       ArrayList uArrayList1;
       wq3 tb = this.b;
       _monitor_enter(tb);
       vq3 ovq3 = new vq3(p0, p1);
       if ((uArrayList = this.b.get(p0)) == null) {
          uArrayList = new ArrayList(1);
          this.b.put(p0, uArrayList);
       }
       uArrayList.add(ovq3);
       for (int i = 0; i < p1.countActions(); i++) {
          String action = p1.getAction(i);
          if ((uArrayList1 = this.c.get(action)) == null) {
             uArrayList1 = new ArrayList(1);
             this.c.put(action, uArrayList1);
          }
          uArrayList1.add(ovq3);
       }
       _monitor_exit(tb);
       return;
    }
    public final void c(Intent p0){
       Object obj;
       int i3;
       Object obj2;
       String str1;
       String str2;
       ArrayList uArrayList;
       int i5;
       wq3 owq3 = this;
       Intent intent = p0;
       wq3 b = owq3.b;
       _monitor_enter(b);
       String action = p0.getAction();
       String str = intent.resolveTypeIfNeeded(owq3.a.getContentResolver());
       Uri data = p0.getData();
       String scheme = p0.getScheme();
       Set categories = p0.getCategories();
       int i = ((p0.getFlags() & 0x08))? 1: 0;
       if (i) {
          p0.toString();
       }
       if ((obj = owq3.c.get(p0.getAction())) != null) {
          if (i) {
             obj.toString();
          }
          int i1 = 0;
          int i2 = 0;
          while (i2 < obj.size()) {
             Object obj1 = obj.get(i2);
             if (i) {
                Objects.toString(obj1.a);
             }
             if (obj1.c != null) {
                i3 = i2;
                obj2 = obj;
                str1 = action;
                str2 = str;
                uArrayList = i1;
             }else {
                Object obj3 = obj1;
                i3 = i2;
                str1 = action;
                uArrayList = i1;
                obj2 = obj;
                str2 = str;
                boolean b1 = true;
                if ((i5 = obj1.a.match(action, str, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                   if (i) {
                      Integer.toHexString(i5);
                   }
                   i1 = (!uArrayList)? new ArrayList(): uArrayList;
                   i1.add(obj3);
                   obj3.c = b1;
                label_009f :
                   i2 = i3 + 1;
                   action = str1;
                   obj = obj2;
                   str = str2;
                   int i4 = 1;
                }
             }
             i1 = uArrayList;
             goto label_009f ;
          }
          if ((uArrayList = i1) != null) {
             for (i5 = 0; i5 < uArrayList.size(); i5 = i5 + 1) {
                uArrayList.get(i5).c = false;
             }
             owq3.d.add(new fh5(intent, 1, uArrayList));
             if (!owq3.e.hasMessages(1)) {
                owq3.e.sendEmptyMessage(1);
             }
             _monitor_exit(b);
             return;
          }
       }
       _monitor_exit(b);
       return;
    }
    public final void d(BroadcastReceiver p0){
       ArrayList uArrayList;
       ArrayList uArrayList1;
       wq3 tb = this.b;
       _monitor_enter(tb);
       if ((uArrayList = this.b.remove(p0)) == null) {
          _monitor_exit(tb);
          return;
       }else {
          int i = uArrayList.size() - 1;
          while (i >= 0) {
             vq3 ovq3 = uArrayList.get(i);
             ovq3.d = true;
             int i1 = 0;
             while (i1 < ovq3.a.countActions()) {
                String action = ovq3.a.getAction(i1);
                if ((uArrayList1 = this.c.get(action)) != null) {
                   int i2 = uArrayList1.size() - 1;
                   while (i2 >= 0) {
                      vq3 ovq31 = uArrayList1.get(i2);
                      if (ovq31.b == p0) {
                         ovq31.d = true;
                         uArrayList1.remove(i2);
                      }
                      i2 = i2 - 1;
                   }
                   if (uArrayList1.size() <= 0) {
                      this.c.remove(action);
                   }
                }
                i1 = i1 + 1;
             }
             i = i - 1;
          }
          _monitor_exit(tb);
          return;
       }
    }
}
