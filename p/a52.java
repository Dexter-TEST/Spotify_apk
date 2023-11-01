package p.a52;
import android.content.BroadcastReceiver;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import android.content.Intent;
import p.b52;
import java.util.Collection;
import p.pk;
import p.ok;
import java.util.Iterator;
import java.lang.Object;

public final class a52 extends BroadcastReceiver	// class@000f16 from classes.dex
{
    public final Context a;
    public static final AtomicReference b;

    static {
       a52.b = new AtomicReference();
    }
    public void a52(Context p0){
       super();
       this.a = p0;
    }
    public final void onReceive(Context p0,Intent p1){
       p0 = b52.i;
       _monitor_enter(p0);
       Iterator iterator = b52.j.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       _monitor_exit(p0);
       this.a.unregisterReceiver(this);
       return;
    }
}
