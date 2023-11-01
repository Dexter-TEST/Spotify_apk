package p.fy0;
import p.ly0;
import java.lang.Object;
import p.vc6;
import java.lang.Thread;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import android.util.Log;
import java.util.Date;
import p.gy0;
import java.util.concurrent.Callable;
import p.a28;
import p.wx0;
import p.if7;

public final class fy0	// class@00165d from classes.dex
{
    public final ly0 a;

    public void fy0(ly0 p0){
       this.a = p0;
       super();
    }
    public final void a(vc6 p0,Thread p1,Throwable p2){
       fy0 ta = this.a;
       _monitor_enter(ta);
       Objects.toString(p2);
       p1.getName();
       Log.isLoggable("FirebaseCrashlytics", 3);
       gy0 v8 = new gy0(ta, new Date(), p2, p1, p0);
       a28 uoa28 = ta.f.b(v8);
       try{
          if7.a(uoa28);
          _monitor_exit(ta);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
