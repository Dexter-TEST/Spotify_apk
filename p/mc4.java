package p.mc4;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Integer;

public final class mc4 implements ThreadFactory	// class@001e6a from classes.dex
{
    public final int a;
    public final AtomicInteger b;

    public void mc4(int p0){
       this.a = p0;
       if (p0 != 1) {
          super();
          this.b = new AtomicInteger(1);
          return;
       }else {
          super();
          this.b = new AtomicInteger(1);
          return;
       }
    }
    public final Thread newThread(Runnable p0){
       mc4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             Object[] objArray = new Object[]{Integer.valueOf(tb.getAndIncrement())};
             return new Thread(p0, String.format("firebase-installations-executor-%d", objArray));
       }
       return new Thread(p0, "ModernAsyncTask #"+tb.getAndIncrement());
    }
}
