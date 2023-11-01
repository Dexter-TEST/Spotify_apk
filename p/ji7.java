package p.ji7;
import java.lang.String;
import java.lang.Class;
import android.app.Activity;
import java.lang.Object;
import p.co5;
import java.lang.ref.WeakReference;
import android.os.Handler;
import android.os.Looper;
import p.ii7;
import java.util.concurrent.Executor;
import p.sz1;
import p.ij;
import java.lang.Runnable;
import java.lang.Throwable;
import android.util.Log;

public final class ji7	// class@001ae4 from classes.dex
{
    public final Handler a;
    public final WeakReference b;
    public Timer c;
    public String d;
    public static final String e;

    static {
       String canonicalNam;
       if ((canonicalNam = ji7.class.getCanonicalName()) == null) {
          canonicalNam = "";
       }
       ji7.e = canonicalNam;
    }
    public void ji7(Activity p0){
       co5.o(p0, "activity");
       super();
       this.b = new WeakReference(p0);
       this.d = null;
       this.a = new Handler(Looper.getMainLooper());
    }
    public final void a(){
       try{
          ii7 oii7 = new ii7(this);
          sz1.c().execute(new ij(this, 21, oii7));
       }catch(java.util.concurrent.RejectedExecutionException e0){
          Log.e(ji7.e, "Error scheduling indexing job", e0);
       }
       return;
    }
}
