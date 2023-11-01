package p.jj;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.ArrayDeque;
import java.lang.String;
import p.co5;
import java.lang.Runnable;
import p.ij;

public final class jj implements Executor	// class@001aee from classes.dex
{
    public final int a;
    public final Executor b;
    public Runnable c;
    public final Object t;
    public final ArrayDeque v;

    public void jj(Executor p0,int p1){
       this.a = p1;
       if (p1 != 1) {
          super();
          this.t = new Object();
          this.v = new ArrayDeque();
          this.b = p0;
          return;
       }else {
          co5.o(p0, "executor");
          super();
          this.b = p0;
          this.v = new ArrayDeque();
          this.t = new Object();
          return;
       }
    }
    private void a(Runnable p0){
       co5.o(p0, "command");
       jj tt = this.t;
       _monitor_enter(tt);
       this.v.offer(new ij(this, p0));
       if (this.c == null) {
          this.b();
       }
       _monitor_exit(tt);
       return;
    }
    private final void c(){
       jj tt = this.t;
       _monitor_enter(tt);
       Object obj = this.v.poll();
       Object obj1 = obj;
       this.c = obj1;
       if (obj != null) {
          this.b.execute(obj1);
       }
       _monitor_exit(tt);
       return;
    }
    public final void b(){
       jj tt;
       switch (this.a){
           case 0:
             tt = this.t;
             _monitor_enter(tt);
             Runnable runnable = this.v.poll();
             this.c = runnable;
             if (runnable != null) {
                this.b.execute(runnable);
             }
             break;
           default:
             this.c();
             return;
       }
       _monitor_exit(tt);
       return;
    }
    public final void execute(Runnable p0){
       jj tt;
       switch (this.a){
           case 0:
             tt = this.t;
             _monitor_enter(tt);
             this.v.add(new ij(this, 0, p0));
             if (this.c == null) {
                this.b();
             }
             break;
           default:
             this.a(p0);
             return;
       }
       _monitor_exit(tt);
       return;
    }
}
