package p.i11;
import java.lang.Runnable;
import androidx.work.impl.foreground.SystemForegroundService;
import android.app.Notification;
import java.lang.Object;
import android.os.Build$VERSION;
import android.app.Service;
import p.ly6;
import p.ky6;

public final class i11 implements Runnable	// class@001901 from classes.dex
{
    public final int a;
    public final int b;
    public final Parcelable c;
    public final Object t;

    public void i11(SystemForegroundService p0,int p1,Notification p2,int p3){
       this.t = p0;
       this.a = p1;
       this.c = p2;
       this.b = p3;
       super();
    }
    public final void run(){
       int sDK_INT = Build$VERSION.SDK_INT;
       i11 tt = this.t;
       i11 tb = this.b;
       i11 tc = this.c;
       i11 ta = this.a;
       if (sDK_INT >= 31) {
          ly6.a(tt, ta, tc, tb);
       }else if(sDK_INT >= 29){
          ky6.a(tt, ta, tc, tb);
       }else {
          tt.startForeground(ta, tc);
       }
       return;
    }
}
