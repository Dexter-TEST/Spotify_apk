package p.tq0;
import android.content.Context;
import p.ce7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.LinkedHashSet;
import p.eq0;
import java.util.AbstractCollection;
import java.lang.Iterable;
import java.util.List;
import p.dj0;
import java.util.concurrent.Executor;
import p.ij;
import java.lang.Runnable;

public abstract class tq0	// class@0027bc from classes.dex
{
    public final ce7 a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public void tq0(Context p0,ce7 p1){
       super();
       this.a = p1;
       p0 = p0.getApplicationContext();
       co5.l(p0, "context.applicationContext");
       this.b = p0;
       this.c = new Object();
       this.d = new LinkedHashSet();
    }
    public abstract Object a();
    public final void b(eq0 p0){
       co5.o(p0, "listener");
       tq0 tc = this.c;
       _monitor_enter(tc);
       if (this.d.remove(p0) && this.d.isEmpty()) {
          this.e();
       }
       _monitor_exit(tc);
       return;
    }
    public final void c(Object p0){
       tq0 te;
       tq0 tc = this.c;
       _monitor_enter(tc);
       if ((te = this.e) != null && co5.c(te, p0)) {
          _monitor_exit(tc);
          return;
       }else {
          this.e = p0;
          this.a.c.execute(new ij(dj0.B0(this.d), 8, this));
          _monitor_exit(tc);
          return;
       }
    }
    public abstract void d();
    public abstract void e();
}
