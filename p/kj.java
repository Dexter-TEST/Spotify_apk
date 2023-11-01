package p.kj;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Thread;

public final class kj implements Executor	// class@001c29 from classes.dex
{
    public final int a;

    public void kj(int p0){
       this.a = p0;
       super();
    }
    public final void execute(Runnable p0){
       switch (this.a){
           case 0:
             new Thread(p0).start();
             return;
           case 1:
             p0.run();
             return;
           case 2:
             p0.run();
             return;
           default:
             p0.run();
             return;
       }
    }
}
