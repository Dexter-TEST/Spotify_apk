package p.rl5;
import android.view.Choreographer$FrameCallback;
import java.lang.Object;
import p.fj3;
import java.lang.Runnable;
import p.dz6;

public final class rl5 implements Choreographer$FrameCallback	// class@00250f from classes.dex
{
    public final int a;
    public final Object b;

    public void rl5(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void doFrame(long p0){
       switch (this.a){
           case 0:
           case 1:
             rl5 tb = this.b;
             _monitor_enter(tb);
             if (tb.k == 4) {
                tb.k = 5;
                tb.i(5);
             }
             _monitor_exit(tb);
             return;
             break;
           default:
             this.b.c.f();
             return;
       }
       this.b.run();
       return;
    }
}
