package p.u63;
import p.er7;
import java.lang.Object;
import java.lang.Runnable;

public final class u63 implements er7	// class@00284f from classes.dex
{
    public boolean a;

    public void u63(){
       super();
    }
    public synchronized final void dispose(){
       this.a = true;
    }
    public synchronized final void post(Runnable p0){
       if (this.a != null) {
          return;
       }
       p0.run();
       return;
    }
}
