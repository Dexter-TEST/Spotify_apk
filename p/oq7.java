package p.oq7;
import java.lang.Runnable;
import p.pq7;
import p.pc6;
import java.util.UUID;
import p.gc2;
import android.content.Context;
import java.lang.Object;
import p.x0;
import p.q0;
import java.lang.String;
import p.jr7;
import p.lr7;
import p.rq7;
import p.wk5;
import p.qq7;
import p.ap5;
import android.content.Intent;
import p.iy6;
import android.content.ComponentName;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import p.cp5;
import p.tp2;

public final class oq7 implements Runnable	// class@002171 from classes.dex
{
    public final int a;
    public final Context b;
    public final Object c;
    public final Object t;
    public final Object v;
    public final Object w;

    public void oq7(pq7 p0,pc6 p1,UUID p2,gc2 p3,Context p4){
       this.a = 0;
       this.w = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.b = p4;
       super();
    }
    public final void run(){
       jr7 ojr7;
       Object obj = null;
       switch (this.a){
           case 0:
             break;
           default:
             oq7 tv = this.v;
             try{
                this.w.c(this.b, this.c, this.t);
                tp2.v(tv);
                throw obj;
             }catch(java.lang.UnsatisfiedLinkError e0){
                tp2.v(e0);
                throw obj;
             }catch(p.ab4 e0){
                tp2.v(e0);
                throw obj;
             }
       }
       if (!this.c.a instanceof q0) {
          String str = this.t.toString();
          if ((ojr7 = this.w.c.l(str)) != null && !ojr7.b.a()) {
             this.w.b.h(str, this.v);
             this.b.startService(iy6.a(this.b, ap5.o(ojr7), this.v));
          }else {
             throw new IllegalStateException("Calls to setForegroundAsync\(\) must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
          }
       }
       this.c.i(obj);
       return;
    }
}
