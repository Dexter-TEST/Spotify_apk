package p.ud3;
import java.util.Iterator;
import java.lang.Object;
import java.util.NoSuchElementException;

public final class ud3 implements Iterator	// class@00288c from classes.dex
{
    public int a;
    public final int b;
    public final Iterator c;

    public void ud3(int p0,Iterator p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final boolean hasNext(){
       boolean b = (this.a < this.b && this.c.hasNext())? true: false;
       return b;
    }
    public final Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       this.a = this.a + 1;
       return this.c.next();
    }
    public final void remove(){
       this.c.remove();
    }
}
