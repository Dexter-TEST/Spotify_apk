package p.r6;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.t6;
import p.ac6;
import java.lang.Long;
import java.util.concurrent.atomic.AtomicInteger;
import p.ej4;
import android.content.Context;
import p.sz1;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.SharedPreferences$Editor;
import p.h22;
import p.f22;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import p.ow;
import p.dc3;
import android.os.Bundle;
import java.lang.CharSequence;
import p.me7;
import java.lang.Class;
import java.lang.Double;
import java.util.UUID;
import p.bj;

public final class r6 implements Runnable	// class@00248a from classes.dex
{
    public final int a;
    public final long b;
    public final String c;

    public void r6(int p0,long p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    private final void a(){
       r6 tb = this.b;
       r6 tc = this.c;
       co5.o(tc, "$activityName");
       if (t6.f == null) {
          t6.f = new ac6(Long.valueOf(tb), null);
       }
       if (t6.e.get() <= 0) {
          ej4.e0(tc, t6.f, t6.h);
          SharedPreferences$Editor uEditor = PreferenceManager.getDefaultSharedPreferences(sz1.a()).edit();
          uEditor.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
          uEditor.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
          uEditor.remove("com.facebook.appevents.SessionInfo.interruptionCount");
          uEditor.remove("com.facebook.appevents.SessionInfo.sessionId");
          uEditor.apply();
          uEditor = PreferenceManager.getDefaultSharedPreferences(sz1.a()).edit();
          uEditor.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
          uEditor.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
          uEditor.apply();
          t6.f = null;
       }
       Object d = t6.d;
       _monitor_enter(d);
       t6.c = null;
       _monitor_exit(d);
       return;
    }
    public final void run(){
       ac6 f;
       f22 d;
       f22 uof22;
       int i;
       ac6 f1;
       switch (this.a){
           case 0:
             r6 tb = this.b;
             r6 tc = this.c;
             co5.o(tc, "$activityName");
             if (t6.f == null) {
                t6.f = new ac6(Long.valueOf(tb), null);
             }
             if ((f = t6.f) != null) {
                f.b = Long.valueOf(tb);
             }
             if (t6.e.get() <= 0) {
                r6 or6 = new r6(1, tb, tc);
                d = t6.d;
                _monitor_enter(d);
                ScheduledExecutorService b = t6.b;
                i = ((uof22 = h22.b(sz1.b())) == null)? 60: uof22.b;
                t6.c = b.schedule(or6, (long)i, TimeUnit.SECONDS);
                _monitor_exit(d);
             }
             long i1 = t6.i;
             i = 0;
             long l = ((i1 - i) > 0)? (tb - i1) / (long)1000: i;
             Context uContext = sz1.a();
             if ((d = h22.f(sz1.b(), false)) != null && (d.d != null && (l - i) > 0)) {
                dc3 uodc3 = new dc3(uContext);
                Bundle uBundle = new Bundle(1);
                uBundle.putCharSequence("fb_aa_time_spent_view_name", tc);
                double d1 = (double)l;
                if (me7.a()) {
                   dc3 a = uodc3.a;
                   a.getClass();
                   a.a("fb_aa_time_spent_on_view", Double.valueOf(d1), uBundle, false, t6.a());
                }
             }
             if ((f1 = t6.f) != null) {
                f1.a();
             }
             break;
           default:
             this.a();
             return;
       }
       return;
    }
}
