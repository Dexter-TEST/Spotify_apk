package p.ot7;
import android.content.BroadcastReceiver;
import p.zk;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;

public final class ot7 extends BroadcastReceiver	// class@00218b from classes.dex
{
    public Context a;
    public final zk b;

    public void ot7(zk p0){
       super();
       this.b = p0;
    }
    public synchronized final void a(){
       ot7 ta;
       if ((ta = this.a) != null) {
          ta.unregisterReceiver(this);
       }
       this.a = null;
       return;
    }
    public final void onReceive(Context p0,Intent p1){
       Uri data;
       String schemeSpecif = ((data = p1.getData()) != null)? data.getSchemeSpecificPart(): null;
       if ("com.google.android.gms".equals(schemeSpecif)) {
          this.b.h();
          this.a();
       }
       return;
    }
}
