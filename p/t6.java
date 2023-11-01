package p.t6;
import java.lang.String;
import java.lang.Class;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.UUID;
import p.ac6;
import android.app.Application;
import p.v12;
import p.t12;
import p.gr7;
import p.u12;
import p.s12;
import p.e22;
import p.p83;
import android.app.Application$ActivityLifecycleCallbacks;

public abstract class t6	// class@002710 from classes.dex
{
    public static final String a;
    public static final ScheduledExecutorService b;
    public static ScheduledFuture c;
    public static final Object d;
    public static final AtomicInteger e;
    public static ac6 f;
    public static final AtomicBoolean g;
    public static String h;
    public static long i;
    public static int j;
    public static WeakReference k;

    static {
       String canonicalNam;
       if ((canonicalNam = t6.class.getCanonicalName()) == null) {
          canonicalNam = "com.facebook.appevents.internal.ActivityLifecycleTracker";
       }
       t6.a = canonicalNam;
       t6.b = Executors.newSingleThreadScheduledExecutor();
       t6.d = new Object();
       t6.e = new AtomicInteger(0);
       t6.g = new AtomicBoolean(0);
    }
    public static final UUID a(){
       ac6 f;
       UUID uUID = null;
       if (t6.f != null && (f = t6.f) != null) {
          uUID = f.c;
       }
       return uUID;
    }
    public static final void b(Application p0,String p1){
       if (!t6.g.compareAndSet(false, true)) {
          return;
       }
       e22.c(new u12(new gr7(14), t12.v));
       t6.h = p1;
       p0.registerActivityLifecycleCallbacks(new p83(true));
       return;
    }
}
