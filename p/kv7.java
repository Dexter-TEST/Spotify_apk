package p.kv7;
import p.dm5;
import java.lang.String;
import android.content.Context;
import p.lv7;
import java.util.Set;
import p.ht7;
import java.util.Iterator;
import p.ol2;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Message;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.UnsupportedOperationException;

public abstract class kv7	// class@001c91 from classes.dex
{
    public static final dm5 a;

    static {
       String[] stringArray = new String[0];
       kv7.a = new dm5("GoogleSignInCommon", stringArray);
    }
    public static void a(Context p0){
       ol2 s;
       lv7.a(p0).b();
       Iterator iterator = ht7.a().iterator();
       if (!iterator.hasNext()) {
          Object r = ol2.r;
          _monitor_enter(r);
          if ((s = ol2.s) != null) {
             s.i.incrementAndGet();
             s = s.n;
             s.sendMessageAtFrontOfQueue(s.obtainMessage(10));
          }
          _monitor_exit(r);
          return;
       }else {
          iterator.next().getClass();
          throw new UnsupportedOperationException();
       }
    }
}
