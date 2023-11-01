package p.yw1;
import p.zw;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import android.util.Log;
import java.util.List;
import java.util.Locale;
import java.lang.Object;

public final class yw1 extends zw	// class@002e3b from classes.dex
{
    public final String a;
    public final ExecutorService b;
    public final long c;
    public final TimeUnit t;

    public void yw1(String p0,ExecutorService p1,TimeUnit p2){
       this.a = p0;
       this.b = p1;
       this.c = 2;
       this.t = p2;
       super();
    }
    public final void a(){
       String str = "FirebaseCrashlytics";
       yw1 tb = this.b;
       int i = 3;
       try{
          boolean b = Log.isLoggable(str, i);
          tb.shutdown();
          if (!tb.awaitTermination(this.c, this.t)) {
             Log.isLoggable(str, i);
             tb.shutdownNow();
          }
       }catch(java.lang.InterruptedException e0){
          Object[] objArray = new Object[]{this.a};
          String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", objArray);
          Log.isLoggable(e0, i);
          tb.shutdownNow();
       }
       return;
    }
}
