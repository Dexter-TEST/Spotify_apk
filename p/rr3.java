package p.rr3;
import p.pr3;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.System;
import android.os.SystemClock;
import p.vr3;
import p.fr0;
import java.util.Iterator;

public final class rr3	// class@002542 from classes.dex
{
    public final pr3 a;
    public final Object b;

    public void rr3(pr3 p0){
       super();
       this.b = new Object();
       this.a = p0;
    }
    public final void a(char p0,String p1,String p2,Throwable p3){
       rr3 tb = this.b;
       _monitor_enter(tb);
       vr3 ovr3 = this.a.a(SystemClock.elapsedRealtime());
       ovr3.a = p0;
       ovr3.b = p1;
       ovr3.c = p2;
       ovr3.d = p3;
       ovr3.e = System.currentTimeMillis();
       _monitor_exit(tb);
    }
    public final void b(fr0 p0){
       rr3 tb = this.b;
       _monitor_enter(tb);
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          p0.accept(iterator.next().toString());
       }
       _monitor_exit(tb);
       return;
    }
}
