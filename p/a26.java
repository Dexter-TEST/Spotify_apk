package p.a26;
import java.lang.Iterable;
import java.lang.Object;
import java.util.WeakHashMap;
import p.w16;
import java.util.Set;
import java.util.Iterator;
import p.z16;
import p.y16;
import java.util.Map$Entry;
import p.v16;
import java.lang.Boolean;
import java.lang.String;
import java.lang.StringBuilder;

public class a26 implements Iterable	// class@000eff from classes.dex
{
    public w16 a;
    public w16 b;
    public final WeakHashMap c;
    public int t;

    public void a26(){
       super();
       this.c = new WeakHashMap();
       this.t = 0;
    }
    public w16 a(Object p0){
       a26 ta = this.a;
       while (ta != null && !ta.a.equals(p0)) {
          ta = ta.c;
       }
       return ta;
    }
    public Object b(Object p0,Object p1){
       w16 ow16;
       if ((ow16 = this.a(p0)) != null) {
          return ow16.b;
       }
       ow16 = new w16(p0, p1);
       this.t = this.t + 1;
       if ((p0 = this.b) == null) {
          this.a = ow16;
          this.b = ow16;
       }else {
          p0.c = ow16;
          ow16.t = p0;
          this.b = ow16;
       }
       return null;
    }
    public Object c(Object p0){
       w16 t;
       w16 c;
       if ((p0 = this.a(p0)) == null) {
          return null;
       }
       this.t = this.t - 1;
       a26 tc = this.c;
       if (!tc.isEmpty()) {
          Iterator iterator = tc.keySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
       }
       if ((t = p0.t) != null) {
          t.c = p0.c;
       }else {
          this.a = p0.c;
       }
       if ((c = p0.c) != null) {
          c.t = t;
       }else {
          this.b = t;
       }
       p0.c = null;
       p0.t = null;
       return p0.b;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof a26) {
          return false;
       }
       if (this.t != p0.t) {
          return false;
       }
       Iterator iterator = this.iterator();
       p0 = p0.iterator();
       while (true) {
          Iterator iterator1 = iterator;
          if (iterator1.hasNext()) {
             Iterator iterator2 = p0;
             if (iterator2.hasNext()) {
                Map$Entry uEntry = iterator1.next();
                Object obj = iterator2.next();
                if (uEntry == null && (obj != null || (uEntry != null && !uEntry.equals(obj)))) {
                   return false;
                }
                continue ;
             }
          }
          if (iterator1.hasNext() || p0.hasNext()) {
             b = false;
             break ;
          }
          break ;
       }
       return b;
    }
    public final int hashCode(){
       Iterator iterator = this.iterator();
       int i = 0;
       while (true) {
          Iterator iterator1 = iterator;
          if (iterator1.hasNext()) {
             i = i + iterator1.next().hashCode();
          }else {
             break ;
          }
       }
       return i;
    }
    public final Iterator iterator(){
       v16 ov16 = new v16(this.a, this.b, 0);
       this.c.put(ov16, Boolean.FALSE);
       return ov16;
    }
    public final String toString(){
       String str = "[";
       Iterator iterator = this.iterator();
       while (true) {
          Iterator iterator1 = iterator;
          if (iterator1.hasNext()) {
             str = str.append(iterator1.next().toString());
             if (iterator1.hasNext()) {
                str = str.append(", ");
             }
          }else {
             break ;
          }
       }
       return str+"]";
    }
}
