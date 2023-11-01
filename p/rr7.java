package p.rr7;
import java.lang.String;
import p.es3;
import p.vf;
import java.lang.Object;
import java.util.HashMap;
import p.qq7;
import p.qr7;
import java.util.Objects;
import java.lang.Class;

public final class rr7	// class@002546 from classes.dex
{
    public final vf a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;

    static {
       es3.d("WorkTimer");
    }
    public void rr7(vf p0){
       super();
       this.b = new HashMap();
       this.c = new HashMap();
       this.d = new Object();
       this.a = p0;
    }
    public final void a(qq7 p0){
       rr7 td = this.d;
       _monitor_enter(td);
       if (this.b.remove(p0) != null) {
          Objects.toString(p0);
          es3.c().getClass();
          this.c.remove(p0);
       }
       _monitor_exit(td);
       return;
    }
}
