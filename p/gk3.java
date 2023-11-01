package p.gk3;
import p.ek3;
import android.app.Service;
import p.aw1;
import p.vj3;
import p.fk3;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.kj3;

public abstract class gk3 extends Service implements ek3	// class@001725 from classes.dex
{
    public final aw1 a;

    public void gk3(){
       super();
       this.a = new aw1(this);
    }
    public final vj3 getLifecycle(){
       return this.a.a;
    }
    public final IBinder onBind(Intent p0){
       co5.o(p0, "intent");
       this.a.i(kj3.ON_START);
       return null;
    }
    public void onCreate(){
       this.a.i(kj3.ON_CREATE);
       super.onCreate();
    }
    public void onDestroy(){
       gk3 ta = this.a;
       ta.i(kj3.ON_STOP);
       ta.i(kj3.ON_DESTROY);
       super.onDestroy();
    }
    public final void onStart(Intent p0,int p1){
       this.a.i(kj3.ON_START);
       super.onStart(p0, p1);
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       return super.onStartCommand(p0, p1, p2);
    }
}
