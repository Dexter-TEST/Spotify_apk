package p.nm6;
import android.os.Handler$Callback;
import p.qm6;
import java.lang.Object;
import android.os.Message;
import p.om6;

public final class nm6 implements Handler$Callback	// class@00200a from classes.dex
{
    public final qm6 a;

    public void nm6(qm6 p0){
       this.a = p0;
       super();
    }
    public final boolean handleMessage(Message p0){
       if (p0.what != null) {
          return false;
       }
       nm6 ta = this.a;
       p0 = p0.obj;
       qm6 a = ta.a;
       _monitor_enter(a);
       if (ta.c == p0 || ta.d == p0) {
          ta.a(p0, 2);
       }
       _monitor_exit(a);
       return true;
    }
}
