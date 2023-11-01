package p.e08;
import android.os.Handler$Callback;
import p.b08;
import java.lang.Object;
import android.os.Message;
import p.cl2;
import java.util.HashMap;
import p.i08;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.Throwable;
import android.util.Log;
import java.lang.Class;
import android.content.ComponentName;
import p.w51;
import android.os.Handler;
import android.content.Context;
import android.content.ServiceConnection;
import p.pp0;

public final class e08 implements Handler$Callback	// class@0013f5 from classes.dex
{
    public final b08 a;

    public void e08(b08 p0){
       this.a = p0;
       super();
    }
    public final boolean handleMessage(Message p0){
       b08 a;
       i08 oi08;
       i08 f;
       Message what = p0.what;
       boolean b = false;
       if (what != null) {
          if (what != true) {
             return b;
          }else {
             a = this.a.a;
             _monitor_enter(a);
             p0 = p0.obj;
             if ((oi08 = this.a.a.get(p0)) != null && oi08.b == 3) {
                String str = String.valueOf(p0);
                Log.e("GmsClientSupervisor", new StringBuilder((str.length() + 47))+"Timeout waiting for ServiceConnection callback "+str, new Exception());
                if ((f = oi08.f) == null) {
                   p0.getClass();
                   f = null;
                }
                if (f == null) {
                   cl2 b1 = p0.b;
                   w51.k(b1);
                   f = new ComponentName(b1, "unknown");
                }
                oi08.onServiceDisconnected(f);
             }
             _monitor_exit(a);
             return true;
          }
       }else {
          a = this.a.a;
          _monitor_enter(a);
          p0 = p0.obj;
          if ((f = this.a.a.get(p0)) != null && f.a.isEmpty()) {
             if (f.c != null) {
                i08 g = f.g;
                g.c.removeMessages(true, f.e);
                g.d.a(g.b, f);
                f.c = b;
                f.b = 2;
             }
             this.a.a.remove(p0);
          }
          _monitor_exit(a);
          return true;
       }
    }
}
