package p.b08;
import java.lang.Object;
import android.content.Context;
import java.util.HashMap;
import p.nu7;
import android.os.Looper;
import p.e08;
import android.os.Handler$Callback;
import p.pp0;
import p.w51;
import java.lang.String;
import p.gy;
import p.cl2;
import p.i08;
import android.os.Message;
import android.os.Handler;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import android.content.ComponentName;
import android.os.IBinder;

public final class b08	// class@00102e from classes.dex
{
    public final HashMap a;
    public final Context b;
    public final nu7 c;
    public final pp0 d;
    public final long e;
    public final long f;
    public static final Object g;
    public static b08 h;

    static {
       b08.g = new Object();
    }
    public void b08(Context p0){
       super();
       this.a = new HashMap();
       this.b = p0.getApplicationContext();
       this.c = new nu7(p0.getMainLooper(), new e08(this));
       if (pp0.c == null) {
          p0 = pp0.b;
          _monitor_enter(p0);
          if (pp0.c == null) {
             pp0.c = new pp0();
          }
          _monitor_exit(p0);
       }
       pp0 c = pp0.c;
       w51.k(c);
       this.d = c;
       this.e = 5000;
       this.f = 0x493e0;
       return;
    }
    public final void a(String p0,String p1,int p2,gy p3,boolean p4){
       i08 oi08;
       String str;
       cl2 uocl2 = new cl2(p2, p0, p1, p4);
       b08 ta = this.a;
       _monitor_enter(ta);
       if ((oi08 = this.a.get(uocl2)) != null) {
          if (oi08.a.containsKey(p3)) {
             oi08.a.remove(p3);
             if (oi08.a.isEmpty()) {
                this.c.sendMessageDelayed(this.c.obtainMessage(0, uocl2), this.e);
             }
             _monitor_exit(ta);
             return;
          }else {
             str = String.valueOf(uocl2);
             throw new IllegalStateException(new StringBuilder((str.length() + 76))+"Trying to unbind a GmsServiceConnection  that was not bound before.  config="+str);
          }
       }else {
          str = String.valueOf(uocl2);
          throw new IllegalStateException(new StringBuilder((str.length() + 50))+"Nonexistent connection status for service config: "+str);
       }
    }
    public final boolean b(cl2 p0,gy p1,String p2){
       i08 oi08;
       i08 b;
       b08 ta = this.a;
       _monitor_enter(ta);
       if ((oi08 = this.a.get(p0)) == null) {
          oi08 = new i08(this, p0);
          oi08.a.put(p1, p1);
          oi08.a(p2);
          this.a.put(p0, oi08);
       }else {
          this.c.removeMessages(0, p0);
          if (!oi08.a.containsKey(p1)) {
             oi08.a.put(p1, p1);
             if ((b = oi08.b) != 1) {
                if (b == 2) {
                   oi08.a(p2);
                }
             }else {
                p1.onServiceConnected(oi08.f, oi08.d);
             }
          }else {
             String str = String.valueOf(p0);
             throw new IllegalStateException(new StringBuilder((str.length() + 81))+"Trying to bind a GmsServiceConnection that was already connected before.  config="+str);
          }
       }
       _monitor_exit(ta);
       return oi08.c;
    }
}
