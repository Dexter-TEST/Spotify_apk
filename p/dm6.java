package p.dm6;
import java.util.Iterator;
import p.zl6;
import java.lang.Object;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.Map$Entry;
import java.lang.IllegalStateException;
import java.lang.String;

public final class dm6 implements Iterator	// class@001377 from classes.dex
{
    public int a;
    public boolean b;
    public Iterator c;
    public final zl6 t;

    public void dm6(zl6 p0){
       this.t = p0;
       super();
       this.a = -1;
    }
    public final Iterator a(){
       if (this.c == null) {
          this.c = this.t.c.entrySet().iterator();
       }
       return this.c;
    }
    public final boolean hasNext(){
       int i = 1;
       dm6 tt = this.t;
       if (((this.a + i)) >= tt.b.size() && (tt.c.isEmpty() && this.a().hasNext())) {
          i = false;
       }
       return i;
    }
    public final Object next(){
       this.b = true;
       int i = this.a + true;
       this.a = i;
       dm6 tt = this.t;
       Map$Entry uEntry = (i < tt.b.size())? tt.b.get(this.a): this.a().next();
       return uEntry;
    }
    public final void remove(){
       if (this.b == null) {
          throw new IllegalStateException("remove\(\) was called before next\(\)");
       }
       this.b = false;
       dm6 tt = this.t;
       tt.b();
       if (this.a < tt.b.size()) {
          dm6 ta = this.a;
          this.a = ta - 1;
          tt.o(ta);
       }else {
          this.a().remove();
       }
       return;
    }
}
