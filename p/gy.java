package p.gy;
import android.content.ServiceConnection;
import p.bl2;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.String;
import android.os.IInterface;
import p.u43;
import java.lang.Class;
import p.jy;
import android.os.Message;
import android.os.Handler;

public final class gy implements ServiceConnection	// class@0017a7 from classes.dex
{
    public final int a;
    public final bl2 b;

    public void gy(bl2 p0,int p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       IInterface iInterface;
       if (p1 == null) {
          bl2.p(this.b);
          return;
       }else {
          bl2 g = this.b.g;
          _monitor_enter(g);
          gy tb = this.b;
          if ((iInterface = p1.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker")) != null && iInterface instanceof u43) {
          }else {
             iInterface = new u43(p1);
          }
          tb.h = iInterface;
          _monitor_exit(g);
          gy tb1 = this.b;
          tb1.getClass();
          jy ojy = new jy(tb1, 0);
          g = tb1.e;
          g.sendMessage(g.obtainMessage(7, this.a, -1, ojy));
          return;
       }
    }
    public final void onServiceDisconnected(ComponentName p0){
       bl2 g = this.b.g;
       _monitor_enter(g);
       gy tb = this.b;
       tb.h = null;
       _monitor_exit(g);
       g = tb.e;
       g.sendMessage(g.obtainMessage(6, this.a, 1));
    }
}
