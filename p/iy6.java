package p.iy6;
import p.eq7;
import p.nw1;
import java.lang.String;
import p.es3;
import android.content.Context;
import java.lang.Object;
import p.uq7;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.HashMap;
import p.fq7;
import p.zq7;
import p.wk5;
import p.qq7;
import p.gc2;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;
import java.lang.Class;
import android.os.Parcelable;
import p.jr7;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.i11;
import android.app.Notification;
import java.lang.Runnable;
import android.os.Handler;
import p.zj7;
import java.util.ArrayList;
import p.ap5;
import p.ns6;
import p.xq6;
import p.ce7;
import java.util.List;
import p.yx5;
import android.os.Build$VERSION;

public final class iy6 implements eq7, nw1	// class@001a2d from classes.dex
{
    public final uq7 a;
    public final ce7 b;
    public final Object c;
    public qq7 t;
    public final LinkedHashMap v;
    public final HashMap w;
    public final HashSet x;
    public final fq7 y;
    public hy6 z;
    public static final String A;

    static {
       iy6.A = es3.d("SystemFgDispatcher");
    }
    public void iy6(Context p0){
       super();
       this.c = new Object();
       uq7 ouq7 = uq7.y(p0);
       this.a = ouq7;
       this.b = ouq7.D;
       this.t = null;
       this.v = new LinkedHashMap();
       this.x = new HashSet();
       this.w = new HashMap();
       this.y = new fq7(ouq7.J, this);
       ouq7.F.a(this);
    }
    public static Intent a(Context p0,qq7 p1,gc2 p2){
       Intent intent = new Intent(p0, SystemForegroundService.class);
       intent.setAction("ACTION_NOTIFY");
       intent.putExtra("KEY_NOTIFICATION_ID", p2.a);
       intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", p2.b);
       intent.putExtra("KEY_NOTIFICATION", p2.c);
       intent.putExtra("KEY_WORKSPEC_ID", p1.a);
       intent.putExtra("KEY_GENERATION", p1.b);
       return intent;
    }
    public static Intent e(Context p0,qq7 p1,gc2 p2){
       Intent intent = new Intent(p0, SystemForegroundService.class);
       intent.setAction("ACTION_START_FOREGROUND");
       intent.putExtra("KEY_WORKSPEC_ID", p1.a);
       intent.putExtra("KEY_GENERATION", p1.b);
       intent.putExtra("KEY_NOTIFICATION_ID", p2.a);
       intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", p2.b);
       intent.putExtra("KEY_NOTIFICATION", p2.c);
       return intent;
    }
    public final void b(qq7 p0,boolean p1){
       jr7 ojr7;
       iy6 tc = this.c;
       _monitor_enter(tc);
       boolean b = ((ojr7 = this.w.remove(p0)) != null)? this.x.remove(ojr7): false;
       if (b) {
          this.y.c(this.x);
       }
       _monitor_exit(tc);
       gc2 ogc2 = this.v.remove(p0);
       if (p0.equals(this.t) && this.v.size() > 0) {
          Iterator iterator = this.v.entrySet().iterator();
          Map$Entry uEntry = iterator.next();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
          }
          this.t = uEntry.getKey();
          if (this.z != null) {
             gc2 value = uEntry.getValue();
             iy6 tz = this.z;
             tz.b.post(new i11(tz, value.a, value.c, value.b));
             tz = this.z;
             tz.b.post(new zj7(value.a, 1, tz));
          }
       }
       iy6 tz1 = this.z;
       if (ogc2 != null && tz1 != null) {
          p0.toString();
          es3.c().getClass();
          tz1.b.post(new zj7(ogc2.a, 1, tz1));
       }
       return;
    }
    public final void c(ArrayList p0){
       if (!p0.isEmpty()) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             jr7 ojr7 = iterator.next();
             es3.c().getClass();
             iy6 ta = this.a;
             ta.D.j(new ns6(ta, new xq6(ap5.o(ojr7)), true));
          }
       }
       return;
    }
    public final void d(List p0){
    }
    public final void f(Intent p0){
       gc2 ogc2;
       int i = 0;
       int intExtra = p0.getIntExtra("KEY_NOTIFICATION_ID", i);
       int intExtra1 = p0.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", i);
       qq7 oqq7 = new qq7(p0.getStringExtra("KEY_WORKSPEC_ID"), p0.getIntExtra("KEY_GENERATION", i));
       Notification parcelableEx = p0.getParcelableExtra("KEY_NOTIFICATION");
       es3.c().getClass();
       if (parcelableEx != null && this.z != null) {
          iy6 tv = this.v;
          tv.put(oqq7, new gc2(intExtra, intExtra1, parcelableEx));
          if (this.t == null) {
             this.t = oqq7;
             iy6 tz = this.z;
             tz.b.post(new i11(tz, intExtra, parcelableEx, intExtra1));
          }else {
             iy6 tz1 = this.z;
             tz1.b.post(new yx5(tz1, intExtra, parcelableEx, 9));
             if (intExtra1 && Build$VERSION.SDK_INT >= 29) {
                Iterator iterator = tv.entrySet().iterator();
                while (iterator.hasNext()) {
                   i = i | iterator.next().getValue().b;
                }
                if ((ogc2 = tv.get(this.t)) != null) {
                   iy6 tz2 = this.z;
                   tz2.b.post(new i11(tz2, ogc2.a, ogc2.c, i));
                }
             }
          }
       }
       return;
    }
}
