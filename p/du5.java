package p.du5;
import android.content.ServiceConnection;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;
import android.content.ComponentName;
import java.lang.String;
import p.co5;
import android.os.IBinder;

public final class du5 implements ServiceConnection	// class@0013bc from classes.dex
{
    public final CountDownLatch a;
    public IBinder b;

    public void du5(){
       super();
       this.a = new CountDownLatch(1);
    }
    public final void onNullBinding(ComponentName p0){
       co5.o(p0, "name");
       this.a.countDown();
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       co5.o(p0, "name");
       co5.o(p1, "serviceBinder");
       this.b = p1;
       this.a.countDown();
    }
    public final void onServiceDisconnected(ComponentName p0){
       co5.o(p0, "name");
    }
}
