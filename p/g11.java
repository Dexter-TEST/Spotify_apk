package p.g11;
import p.n11;
import java.util.concurrent.locks.ReentrantLock;
import android.content.ComponentName;
import p.lq5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.q43;
import p.o43;
import p.mj7;

public final class g11 extends n11	// class@00167a from classes.dex
{
    public static lq5 b;
    public static o11 c;
    public static final ReentrantLock d;

    static {
       g11.d = new ReentrantLock();
    }
    public void g11(){
       super();
    }
    public final void a(ComponentName p0,lq5 p1){
       try{
          co5.o(p0, "name");
          p1.b.n();
          g11.b = p1;
          mj7.m();
          return;
       }catch(android.os.RemoteException e0){
       }
    }
    public final void onServiceDisconnected(ComponentName p0){
       co5.o(p0, "componentName");
    }
}
