package p.ux7;
import p.jd;
import android.content.IntentFilter;
import android.content.Context;
import java.lang.Object;
import java.util.HashSet;
import android.content.Intent;
import p.fg;
import android.content.BroadcastReceiver;
import java.util.Collection;
import java.util.Iterator;
import p.tp2;

public abstract class ux7	// class@002940 from classes.dex
{
    public final jd a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d;
    public fg e;
    public boolean f;

    public void ux7(jd p0,IntentFilter p1,Context p2){
       Context applicationC;
       super();
       this.d = new HashSet();
       this.e = null;
       this.f = false;
       this.a = p0;
       this.b = p1;
       if ((applicationC = p2.getApplicationContext()) != null) {
          p2 = applicationC;
       }
       this.c = p2;
       return;
    }
    public abstract void a(Context p0,Intent p1);
    public final void b(){
       ux7 te;
       if (this.f != null || (!this.d.isEmpty() && this.e == null)) {
          fg uofg = new fg(this);
          this.e = uofg;
          this.c.registerReceiver(uofg, this.b);
       }
       if (this.f == null && (this.d.isEmpty() && (te = this.e) != null)) {
          this.c.unregisterReceiver(te);
          this.e = null;
       }
       return;
    }
    public synchronized final void c(boolean p0){
       this.f = p0;
       this.b();
    }
    public synchronized final void d(){
       Iterator iterator = new HashSet(this.d).iterator();
       if (!iterator.hasNext()) {
          return;
       }
       tp2.v(iterator.next());
       throw null;
    }
}
