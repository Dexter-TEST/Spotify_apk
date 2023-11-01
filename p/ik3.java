package p.ik3;
import java.lang.Runnable;
import p.b91;
import p.zw0;
import p.f71;
import p.gr3;
import java.lang.Object;
import p.xw0;
import p.xe7;
import p.il1;
import java.lang.Throwable;
import p.is7;

public final class ik3 extends zw0 implements Runnable, b91	// class@0019ae from classes.dex
{
    public final zw0 c;
    private int runningWorkers;
    public final int t;
    public final gr3 v;
    public final Object w;

    public void ik3(zw0 p0,int p1){
       super();
       this.c = p0;
       this.t = p1;
       if (p0 instanceof b91) {
       }else {
          p0 = null;
       }
       if (p0 == null) {
          int a = f71.a;
       }
       this.v = new gr3();
       this.w = new Object();
       return;
    }
    public final void g0(xw0 p0,Runnable p1){
       this.v.a(p1);
       int i = 1;
       int i1 = (this.runningWorkers >= this.t)? 1: 0;
       if (!i1) {
          ik3 tw = this.w;
          _monitor_enter(tw);
          if (this.runningWorkers >= this.t) {
             _monitor_exit(tw);
             i = 0;
          }else {
             this.runningWorkers = this.runningWorkers + i;
             _monitor_exit(tw);
          }
          if (i) {
             this.c.g0(this, this);
          }
       }
       return;
    }
    public final zw0 i0(int p0){
       p0 = 1;
       xe7.i(p0);
       if (p0 >= this.t) {
          return this;
       }
       return super.i0(p0);
    }
    public final void run(){
       int i;
       Runnable runnable;
       while (true) {
          i = 0;
          break ;
       }
       do {
          if ((runnable = this.v.d()) != null) {
             runnable.run();
          }else {
             ik3 tw = this.w;
             _monitor_enter(tw);
             int i1 = this.runningWorkers - 1;
             this.runningWorkers = i1;
             if (!this.v.c()) {
                _monitor_exit(tw);
                return;
             }else {
                i1 = this.runningWorkers + 1;
                this.runningWorkers = i1;
                _monitor_exit(tw);
             }
          }
       } while ((i = i + 1) >= 16 && this.c.h0());
       this.c.g0(this, this);
       return;
    }
}
