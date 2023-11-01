package p.y42;
import p.uw;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.b52;
import java.util.ArrayList;
import java.util.Collection;
import p.pk;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.CopyOnWriteArrayList;
import p.tp2;

public final class y42 implements uw	// class@002d46 from classes.dex
{
    public static final AtomicReference a;

    static {
       y42.a = new AtomicReference();
    }
    public void y42(){
       super();
    }
    public final void a(boolean p0){
       Iterator iterator1;
       Object i = b52.i;
       _monitor_enter(i);
       Iterator iterator = new ArrayList(b52.j.values()).iterator();
       while (true) {
          if (iterator.hasNext()) {
             b52 uob52 = iterator.next();
             if (uob52.e.get()) {
                iterator1 = uob52.h.iterator();
                if (!iterator1.hasNext()) {
                   continue ;
                }else {
                   break ;
                }
             }
          }else {
             _monitor_exit(i);
             return;
          }
       }
       tp2.v(iterator1.next());
       throw null;
    }
}
