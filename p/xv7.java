package p.xv7;
import java.lang.Object;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Boolean;

public final class xv7	// class@002cf9 from classes.dex
{
    public final HashMap a;
    public final AtomicBoolean b;

    public void xv7(){
       super();
       this.a = new HashMap();
       this.b = new AtomicBoolean(false);
    }
    public synchronized final boolean a(){
       if (!this.b.get()) {
          this.b();
       }
       Object obj = this.a.get("assetOnlyUpdates");
       if (!obj instanceof Boolean) {
          return false;
       }else {
          return obj.booleanValue();
       }
    }
    public synchronized final void b(){
       this.a.put("assetOnlyUpdates", Boolean.FALSE);
    }
}
