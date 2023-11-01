package p.zw;
import java.lang.Runnable;
import java.lang.Object;
import android.os.Process;

public abstract class zw implements Runnable	// class@002f80 from classes.dex
{

    public void zw(){
       super();
    }
    public abstract void a();
    public final void run(){
       Process.setThreadPriority(10);
       this.a();
    }
}
