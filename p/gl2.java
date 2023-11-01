package p.gl2;
import p.nu7;
import p.hl2;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import p.ql2;
import java.lang.String;
import android.content.Intent;
import android.app.PendingIntent;

public final class gl2 extends nu7	// class@00172d from classes.dex
{
    public final Context a;
    public final hl2 b;

    public void gl2(hl2 p0,Context p1){
       this.b = p0;
       Looper mainLooper = (Looper.myLooper() == null)? Looper.getMainLooper(): Looper.myLooper();
       super(mainLooper);
       this.a = p1.getApplicationContext();
       return;
    }
    public final void handleMessage(Message p0){
       int i1;
       Intent intent;
       int i = 1;
       if (p0.what != i) {
       }else {
          gl2 tb = this.b;
          gl2 ta = this.a;
          if ((i1 = tb.d(ta)) != i && (i1 != 2 && (i1 != 3 && i1 != 9))) {
             i = 0;
          }
          if (i) {
             PendingIntent pendingInten = ((intent = tb.a(i1, ta, "n")) == null)? null: PendingIntent.getActivity(ta, 0, intent, 0x8000000);
             tb.i(ta, i1, pendingInten);
          }
       }
       return;
    }
}
