package p.k44;
import android.os.IBinder$DeathRecipient;
import java.lang.Object;
import p.h44;
import android.os.Bundle;
import android.os.Message;
import android.os.Handler;
import p.i44;
import android.os.Looper;

public abstract class k44 implements IBinder$DeathRecipient	// class@001ba4 from classes.dex
{
    public final h44 a;
    public i44 b;
    public l44 c;

    public void k44(){
       super();
       this.a = new h44(this);
    }
    public final void a(int p0,Object p1,Bundle p2){
       k44 tb;
       if ((tb = this.b) != null) {
          Message message = tb.obtainMessage(p0, p1);
          message.setData(p2);
          message.sendToTarget();
       }
       return;
    }
    public final void b(Handler p0){
       k44 tb;
       if (p0 == null) {
          if ((tb = this.b) != null) {
             tb.a = false;
             tb.removeCallbacksAndMessages(null);
             this.b = null;
          }
       }else {
          i44 oi44 = new i44(this, p0.getLooper());
          this.b = oi44;
          oi44.a = true;
       }
       return;
    }
    public final void binderDied(){
       this.a(8, null, null);
    }
}
