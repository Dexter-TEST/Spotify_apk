package p.sf;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Throwable;
import p.od4;
import p.xz6;
import java.util.HashMap;
import p.o11;
import java.util.concurrent.atomic.AtomicBoolean;
import p.co5;
import java.lang.IllegalStateException;
import java.lang.String;

public final class sf implements Thread$UncaughtExceptionHandler	// class@00261e from classes.dex
{
    public final Object a;

    public void sf(Object p0){
       this.a = p0;
       super();
    }
    public final void uncaughtException(Thread p0,Throwable p1){
       sf ta = this.a;
       od4 e = ta.e;
       od4 b = ta.b;
       if (e == null || b == null) {
          throw new IllegalStateException("Could not handle exception during sync");
       }
       b.a();
       b.c.put("moving-state", "cancelled");
       b.b();
       e.w.compareAndSet(true, false);
       od4 f = ta.f;
       co5.i(f);
       f.uncaughtException(p0, p1);
       return;
    }
}
