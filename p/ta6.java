package p.ta6;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.lang.Object;
import java.util.ArrayDeque;
import java.lang.Runnable;
import p.t5;

public final class ta6 implements Executor	// class@002733 from classes.dex
{
    public final ArrayDeque a;
    public final Executor b;
    public Runnable c;
    public final Object t;

    public void ta6(ExecutorService p0){
       super();
       this.b = p0;
       this.a = new ArrayDeque();
       this.t = new Object();
    }
    public final boolean a(){
       ta6 tt = this.t;
       _monitor_enter(tt);
       boolean b = (!this.a.isEmpty())? true: false;
       _monitor_exit(tt);
       return b;
    }
    public final void b(){
       Runnable runnable = this.a.poll();
       this.c = runnable;
       if (runnable != null) {
          this.b.execute(runnable);
       }
       return;
    }
    public final void execute(Runnable p0){
       ta6 tt = this.t;
       _monitor_enter(tt);
       this.a.add(new t5(this, p0, 10));
       if (this.c == null) {
          this.b();
       }
       _monitor_exit(tt);
       return;
    }
}
