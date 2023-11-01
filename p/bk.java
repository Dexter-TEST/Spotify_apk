package p.bk;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.lang.Runnable;
import p.ck;

public final class bk implements Executor	// class@0010e4 from classes.dex
{
    public final int a;

    public void bk(int p0){
       this.a = p0;
       super();
    }
    public final void execute(Runnable p0){
       switch (this.a){
           case 1:
             ck.o0().n0(p0);
             return;
           case 2:
             p0.run();
             return;
           case 3:
             p0.run();
             return;
           case 4:
             p0.run();
             return;
           default:
             p0.run();
             return;
       }
    }
}
