package p.h11;
import p.n11;
import android.content.Context;
import android.content.ComponentName;
import p.lq5;
import p.q43;
import p.o43;
import android.content.ServiceConnection;

public final class h11 extends n11	// class@0017bc from classes.dex
{
    public final Context b;

    public void h11(Context p0){
       this.b = p0;
       super();
    }
    public final void a(ComponentName p0,lq5 p1){
       try{
          p1.b.n();
          e0.b.unbindService(e0);
          return;
       }catch(android.os.RemoteException e0){
       }
    }
    public final void onServiceDisconnected(ComponentName p0){
    }
}
