package p.iv5;
import java.lang.Thread;
import java.lang.Runnable;
import java.lang.String;
import android.os.Process;

public final class iv5 extends Thread	// class@001a11 from classes.dex
{
    public final int a;

    public void iv5(Runnable p0,String p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public final void run(){
       Process.setThreadPriority(this.a);
       super.run();
    }
}
