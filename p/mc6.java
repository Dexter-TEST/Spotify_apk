package p.mc6;
import p.nc6;
import java.util.Set;
import java.lang.Object;
import java.util.Collection;
import java.util.Iterator;
import p.sd3;

public final class mc6 extends nc6	// class@001e6c from classes.dex
{
    public final Set b;
    public final Set c;

    public void mc6(Set p0,Set p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final boolean contains(Object p0){
       boolean b = (this.b.contains(p0) && !this.c.contains(p0))? true: false;
       return b;
    }
    public final boolean isEmpty(){
       return this.c.containsAll(this.b);
    }
    public final Iterator iterator(){
       return new sd3(this);
    }
    public final int size(){
       Iterator iterator = this.b.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          if (!this.c.contains(iterator.next())) {
             i = i + 1;
          }
       }
       return i;
    }
}
