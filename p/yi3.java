package p.yi3;
import java.util.Iterator;
import p.zi3;
import java.lang.Object;
import java.util.List;
import java.lang.UnsupportedOperationException;

public final class yi3 implements Iterator	// class@002dc3 from classes.dex
{
    public int a;
    public final zi3 b;

    public void yi3(zi3 p0){
       this.b = p0;
       super();
       this.a = 0;
    }
    public final boolean hasNext(){
       yi3 tb = this.b;
       if (this.a >= tb.a.size() && !tb.b.hasNext()) {
          return false;
       }
       return true;
    }
    public final Object next(){
       yi3 tb = this.b;
       zi3 a = tb.a;
       if (this.a < tb.a.size()) {
          yi3 ta = this.a;
          this.a = ta + 1;
          return a.get(ta);
       }else {
          a.add(tb.b.next());
          return this.next();
       }
    }
    public final void remove(){
       throw new UnsupportedOperationException();
    }
}
