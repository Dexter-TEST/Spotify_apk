package p.eh0;
import p.fh0;
import java.lang.reflect.Method;
import java.lang.Object;
import java.io.Closeable;
import java.lang.Throwable;
import p.dh0;
import java.util.logging.Level;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.logging.Logger;

public final class eh0 implements fh0	// class@001485 from classes.dex
{
    public final Method a;

    public void eh0(Method p0){
       super();
       this.a = p0;
    }
    public final void b(Closeable p0,Throwable p1,Throwable p2){
       if (p1 == p2) {
          return;
       }
       Object[] objArray = new Object[]{p2};
       this.a.invoke(p1, objArray);
       return;
    }
}
