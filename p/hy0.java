package p.hy0;
import p.pv6;
import p.jy0;
import p.ly0;
import java.lang.String;
import java.lang.Object;
import p.nc4;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import p.wh0;
import p.bc6;
import p.k80;
import p.j07;
import p.vj;
import p.a28;
import p.vv7;
import java.util.List;
import java.util.Iterator;
import p.ru5;
import java.io.File;
import p.iy0;
import p.xu5;
import p.uv1;
import android.util.Log;
import p.wu5;
import java.lang.Thread;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import p.et0;
import p.i77;
import p.m07;

public final class hy0 implements pv6, jy0	// class@0018e4 from classes.dex
{
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object t;

    public void hy0(ly0 p0,String p1,String p2,boolean p3){
       this.t = p0;
       this.b = p1;
       this.c = p2;
       this.a = p3;
       super();
    }
    public void hy0(nc4 p0,LinkedList p1,boolean p2,ExecutorService p3){
       this.t = p0;
       this.b = p1;
       this.a = p2;
       this.c = p3;
       super();
    }
    public final void h(wh0 p0){
       k80 ok80 = k80.a(this.b);
       k80 ok801 = k80.a(this.c);
       p0.o(8, 2);
       p0.n(((wh0.d(4) + 1) + (wh0.a(3, ok801) + (wh0.a(2, ok80) + ((wh0.b(3) + wh0.d(1)) + 0)))));
       p0.j(1, 3);
       p0.i(2, ok80);
       p0.i(3, ok801);
       p0.o(4, 0);
       p0.l(this.a);
    }
    public final j07 i(Object p0){
       if (p0 == null) {
          p0 = vv7.t(null);
       }else {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             ru5 oru5 = iterator.next();
             if (oru5.b() == 1) {
                ly0.c(oru5.e(), p0.e);
             }
          }
          ly0.a(this.t.c.c);
          xu5 oxu5 = this.t.c.c.k.f(p0);
          hy0 tb = this.b;
          hy0 ta = this.a;
          iy0 b = this.t.c.b;
          _monitor_enter(oxu5);
          if (oxu5.g != null) {
             Log.isLoggable("FirebaseCrashlytics", 3);
             _monitor_exit(oxu5);
          }else {
             Thread thread = new Thread(new wu5(oxu5, tb, ta, b), "Crashlytics Report Uploader");
             oxu5.g = thread;
             thread.start();
             _monitor_exit(oxu5);
          }
          this.t.c.c.t.y(this.c, et0.c(p0));
          this.t.c.c.x.b(null);
          p0 = vv7.t(null);
       }
       return p0;
    }
}
