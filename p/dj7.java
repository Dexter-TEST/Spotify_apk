package p.dj7;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.Iterator;
import p.vi7;
import java.util.HashMap;
import java.util.Set;
import java.io.Closeable;

public final class dj7	// class@00135d from classes.dex
{
    public final LinkedHashMap a;

    public void dj7(){
       super();
       this.a = new LinkedHashMap();
    }
    public final void a(){
       vi7 a;
       Iterator iterator1;
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          vi7 ovi7 = iterator.next();
          ovi7.c = true;
          if ((a = ovi7.a) != null) {
             _monitor_enter(a);
             iterator1 = ovi7.a.values().iterator();
             while (iterator1.hasNext()) {
                vi7.a(iterator1.next());
             }
             _monitor_exit(a);
          }
          if ((a = ovi7.b) != null) {
             _monitor_enter(a);
             iterator1 = ovi7.b.iterator();
             while (iterator1.hasNext()) {
                vi7.a(iterator1.next());
             }
             _monitor_exit(a);
          }
          ovi7.b();
       }
       this.a.clear();
       return;
    }
}
