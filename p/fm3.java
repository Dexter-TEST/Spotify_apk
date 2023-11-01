package p.fm3;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.pc6;
import java.lang.IllegalStateException;
import java.lang.Throwable;

public abstract class fm3	// class@0015f5 from classes.dex
{
    public final Context a;
    public final WorkerParameters b;
    public boolean c;
    public boolean t;

    public void fm3(Context p0,WorkerParameters p1){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("Application Context is null");
       }
       if (p1 == null) {
          throw new IllegalArgumentException("WorkerParameters is null");
       }
       this.a = p0;
       this.b = p1;
       return;
    }
    public pc6 a(){
       pc6 opc6 = new pc6();
       opc6.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync\(\)`"));
       return opc6;
    }
    public void b(){
    }
    public abstract pc6 e();
    public final void f(){
       this.c = true;
       this.b();
    }
}
