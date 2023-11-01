package p.hw7;
import p.bw7;
import java.lang.Object;
import p.ow7;
import java.lang.String;
import p.jd;
import android.content.ServiceConnection;
import android.content.Context;
import p.zd4;
import android.os.IBinder;
import android.os.IInterface;
import android.os.IBinder$DeathRecipient;

public final class hw7 extends bw7	// class@0018d9 from classes.dex
{
    public final int b;
    public final Object c;

    public void hw7(int p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void a(){
       hw7 tc = this.c;
       switch (this.b){
           case 0:
             break;
           default:
             zd4 b = tc.b;
             Object[] objArray1 = new Object[0];
             b.b.e("unlinkToDeath", objArray1);
             b.n.asBinder().unlinkToDeath(b.k, 0);
             b = tc.b;
             b.n = null;
             b.g = false;
             return;
       }
       if (tc.n != null) {
          Object[] objArray = new Object[0];
          tc.b.e("Unbind from service.", objArray);
          tc.a.unbindService(tc.m);
          tc.g = false;
          tc.n = null;
          tc.m = null;
       }
       tc.d();
       return;
    }
}
