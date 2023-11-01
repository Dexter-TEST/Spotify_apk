package p.go0;
import p.xs6;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.String;
import p.xo5;
import p.ge6;
import p.t37;
import java.lang.Class;
import p.qc;
import p.co5;
import p.mm2;
import java.lang.Long;

public final class go0	// class@001746 from classes.dex
{
    public final xs6 a;
    public xo5 b;
    public final AtomicBoolean c;
    public Long d;

    public void go0(xs6 p0){
       super();
       this.a = p0;
       this.c = new AtomicBoolean(false);
    }
    public synchronized final xo5 a(String p0){
       go0 tb;
       if (!this.c.get()) {
          Object[] objArray = new Object[0];
          t37.a().getClass();
          ge6.i(objArray);
       }
       if ((tb = this.b) == null) {
          tb = co5.D(this.a.b(), this.a.d.b());
          this.b = tb;
          this.d = Long.valueOf(tb.a.d);
       }
       return tb;
    }
    public synchronized final void b(){
       this.b = null;
       this.d = null;
    }
}
