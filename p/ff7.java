package p.ff7;
import java.lang.Thread;
import java.lang.String;
import java.lang.Runnable;
import android.os.Process;
import p.pn;
import p.ir2;

public final class ff7 extends Thread	// class@0015bb from classes.dex
{
    public final int a;

    public void ff7(){
       this.a = 1;
       super("Okio Watchdog");
       this.setDaemon(1);
    }
    public void ff7(Runnable p0){
       this.a = 0;
       super(p0);
    }
    public final void run(){
       pn opn;
       switch (this.a){
           case 0:
           default:
             try{
                while (true) {
                   _monitor_enter(pn.class);
                   if ((opn = ir2.g()) == pn.j) {
                      break ;
                   }else {
                      _monitor_exit(pn.class);
                      if (opn != null) {
                         opn.k();
                      }
                   }
                }
                pn.j = null;
                _monitor_exit(pn.class);
                return;
             }catch(java.lang.InterruptedException e0){
             }
       }
       Process.setThreadPriority(10);
       super.run();
       return;
    }
}
