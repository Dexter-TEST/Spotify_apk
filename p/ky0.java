package p.ky0;
import java.lang.Runnable;
import android.content.Context;
import p.cc6;
import p.xu5;
import java.lang.Object;
import p.xj0;
import java.lang.String;
import android.util.Log;
import p.ru5;

public final class ky0 implements Runnable	// class@001ca4 from classes.dex
{
    public final Context a;
    public final ru5 b;
    public final xu5 c;
    public final boolean t;

    public void ky0(Context p0,cc6 p1,xu5 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = true;
    }
    public final void run(){
       if (!xj0.j(this.a)) {
          return;
       }
       boolean b = Log.isLoggable("FirebaseCrashlytics", 3);
       this.c.a(this.b, this.t);
       return;
    }
}
