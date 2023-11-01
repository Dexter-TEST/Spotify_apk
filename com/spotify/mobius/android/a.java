package com.spotify.mobius.android.a;
import p.xz3;
import java.lang.Object;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.LinkedList;
import java.util.Collection;
import p.ja3;
import java.lang.Runnable;
import p.er7;
import p.ek3;
import p.ib;
import p.vj3;
import p.uj3;
import com.spotify.mobius.android.MutableLiveQueue$LifecycleObserverHelper;
import p.dk3;

public final class a	// class@000a79 from classes.dex
{
    public final Object a;
    public final er7 b;
    public final ArrayBlockingQueue c;
    public xz4 d;
    public xz4 e;
    public boolean f;

    public void a(xz3 p0){
       super();
       this.a = new Object();
       this.d = null;
       this.e = null;
       this.f = true;
       this.b = p0;
       this.c = new ArrayBlockingQueue(100);
    }
    public final void a(){
       a ta = this.a;
       _monitor_enter(ta);
       this.d = null;
       this.e = null;
       this.f = true;
       this.c.clear();
       _monitor_exit(ta);
    }
    public final void b(){
       LinkedList linkedList = new LinkedList();
       a ta = this.a;
       _monitor_enter(ta);
       if (this.f == null && (this.e != null && !this.c.isEmpty())) {
          this.c.drainTo(linkedList);
          _monitor_exit(ta);
          this.b.post(new ja3(this, 17, linkedList));
          return;
       }else {
          _monitor_exit(ta);
          return;
       }
    }
    public final void c(ek3 p0,ib p1){
       if (p0.getLifecycle().b() == uj3.a) {
       }else {
          a ta = this.a;
          _monitor_enter(ta);
          this.d = p1;
          this.e = null;
          this.f = true;
          p0.getLifecycle().a(new MutableLiveQueue$LifecycleObserverHelper(this));
          _monitor_exit(ta);
       }
       return;
    }
}
