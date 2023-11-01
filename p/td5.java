package p.td5;
import java.lang.Thread;
import java.lang.ref.ReferenceQueue;
import p.qc4;
import java.lang.String;
import android.os.Process;
import java.lang.ref.Reference;
import p.v4;
import android.os.Message;
import android.os.Handler;
import p.iz7;
import java.lang.Object;
import java.lang.Runnable;

public final class td5 extends Thread	// class@00274d from classes.dex
{
    public final ReferenceQueue a;
    public final Handler b;

    public void td5(ReferenceQueue p0,qc4 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.setDaemon(true);
       this.setName("Picasso-refQueue");
    }
    public final void run(){
       Message message;
       td5 tb = this.b;
       Process.setThreadPriority(10);
       try{
          while (true) {
             v4 ov4 = this.a.remove(1000);
             message = tb.obtainMessage();
             if (ov4 != null) {
                message.what = 3;
                message.obj = ov4.a;
                tb.sendMessage(message);
             }else {
                break ;
             }
          }
          message.recycle();
       }catch(java.lang.InterruptedException e0){
          return;
       }catch(java.lang.Exception e1){
          tb.post(new iz7(this, e1, 18));
       }
    }
}
