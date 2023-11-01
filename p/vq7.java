package p.vq7;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.lang.Runnable;
import p.ce7;
import android.os.Handler;
import p.em0;

public final class vq7 implements Executor	// class@002a48 from classes.dex
{
    public final int a;
    public final Object b;

    public void vq7(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void execute(Runnable p0){
       vq7 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.execute(new em0(11, p0));
             return;
       }
       tb.b.post(p0);
       return;
    }
}
