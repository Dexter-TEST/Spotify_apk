package p.ow7;
import java.util.HashMap;
import android.content.Context;
import p.jd;
import java.lang.String;
import android.content.Intent;
import p.kw7;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashSet;
import p.dw7;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.ref.WeakReference;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.Thread;
import android.os.Looper;
import p.bw7;
import p.l08;
import p.vx5;
import java.lang.Class;
import p.n07;
import p.vj1;
import p.l18;
import p.zw7;
import p.mt7;
import p.fw7;
import java.lang.Runnable;
import p.hw7;
import java.util.Iterator;
import android.os.RemoteException;
import java.lang.Exception;

public final class ow7	// class@0021a6 from classes.dex
{
    public final Context a;
    public final jd b;
    public final String c;
    public final ArrayList d;
    public final HashSet e;
    public final Object f;
    public boolean g;
    public final Intent h;
    public final kw7 i;
    public final WeakReference j;
    public final dw7 k;
    public final AtomicInteger l;
    public zd4 m;
    public IInterface n;
    public static final HashMap o;

    static {
       ow7.o = new HashMap();
    }
    public void ow7(Context p0,jd p1,String p2,Intent p3,kw7 p4){
       super();
       this.d = new ArrayList();
       this.e = new HashSet();
       this.f = new Object();
       this.k = new dw7(this);
       this.l = new AtomicInteger(0);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.h = p3;
       this.i = p4;
       this.j = new WeakReference(null);
    }
    public final Handler a(){
       HashMap o = ow7.o;
       _monitor_enter(o);
       if (!o.containsKey(this.c)) {
          HandlerThread handlerThrea = new HandlerThread(this.c, 10);
          handlerThrea.start();
          o.put(this.c, new Handler(handlerThrea.getLooper()));
       }
       _monitor_exit(o);
       return o.get(this.c);
    }
    public final void b(bw7 p0,l08 p1){
       ow7 tf = this.f;
       _monitor_enter(tf);
       this.e.add(p1);
       l08 a = p1.a;
       a.getClass();
       a.c.b(new zw7(n07.a, new vx5(this, 5, p1)));
       a.g();
       _monitor_exit(tf);
       ow7 tf1 = this.f;
       _monitor_enter(tf1);
       if (this.l.getAndIncrement() > 0) {
          Object[] objArray = new Object[0];
          this.b.a("Already connected to the service.", objArray);
       }
       _monitor_exit(tf1);
       this.a().post(new fw7(this, p0.a, p0, 1));
       return;
    }
    public final void c(l08 p0){
       ow7 tf = this.f;
       _monitor_enter(tf);
       this.e.remove(p0);
       _monitor_exit(tf);
       ow7 tf1 = this.f;
       _monitor_enter(tf1);
       int i = 0;
       if (this.l.get() > 0 && this.l.decrementAndGet() > 0) {
          Object[] objArray = new Object[i];
          this.b.e("Leaving the connection open for other ongoing calls.", objArray);
          _monitor_exit(tf1);
          return;
       }else {
          _monitor_exit(tf1);
          this.a().post(new hw7(i, this));
          return;
       }
    }
    public final void d(){
       ow7 tf = this.f;
       _monitor_enter(tf);
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
       }
       this.e.clear();
       _monitor_exit(tf);
       return;
    }
}
