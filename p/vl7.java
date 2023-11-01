package p.vl7;
import java.lang.String;
import p.es3;
import java.lang.Object;
import p.co5;
import android.content.Context;
import android.os.PowerManager$WakeLock;
import android.os.PowerManager;
import p.wl7;
import java.util.WeakHashMap;

public abstract class vl7	// class@002a1d from classes.dex
{
    public static final int a;

    static {
       co5.l(es3.d("WakeLocks"), "tagWithPrefix\(\"WakeLocks\"\)");
    }
    public static final PowerManager$WakeLock a(Context p0,String p1){
       co5.o(p0, "context");
       co5.o(p1, "tag");
       p0 = p0.getApplicationContext().getSystemService("power");
       co5.j(p0, "null cannot be cast to non-null type android.os.PowerManager");
       p1 = "WorkManager: ".concat(p1);
       PowerManager$WakeLock wakeLock = p0.newWakeLock(1, p1);
       wl7 a = wl7.a;
       _monitor_enter(a);
       p1 = wl7.b.put(wakeLock, p1);
       _monitor_exit(a);
       co5.l(wakeLock, "wakeLock");
       return wakeLock;
    }
}
