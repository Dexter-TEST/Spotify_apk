package p.gh0;
import java.io.Closeable;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import p.eh0;
import p.fv1;
import p.fh0;
import java.lang.Object;
import java.util.ArrayDeque;
import p.s37;
import java.lang.AssertionError;

public final class gh0 implements Closeable	// class@001707 from classes.dex
{
    public final fh0 a;
    public final ArrayDeque b;
    public Throwable c;
    public static final fh0 t;

    static {
       Class[] uClassArray = new Class[]{Throwable.class};
       eh0 uoeh0 = new eh0(Throwable.class.getMethod("addSuppressed", uClassArray));
       if (uoeh0 == null) {
          uoeh0 = fv1.c;
       }
       gh0.t = uoeh0;
    }
    public void gh0(fh0 p0){
       super();
       this.b = new ArrayDeque(4);
       p0.getClass();
       this.a = p0;
    }
    public final void close(){
       gh0 tc = this.c;
       while (true) {
          gh0 tb = this.b;
          if (!tb.isEmpty()) {
             tb.removeFirst().close();
          }else if(this.c == null && tc != null){
             s37.a(tc);
             throw new AssertionError(tc);
          }else {
             return;
          }
       }
    }
}
