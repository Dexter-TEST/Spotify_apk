package p.z77;
import java.util.Iterator;
import java.lang.Object;
import java.lang.Class;

public abstract class z77 implements Iterator	// class@002ea4 from classes.dex
{
    public final Iterator a;

    public void z77(Iterator p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public abstract Object a(Object p0);
    public final boolean hasNext(){
       return this.a.hasNext();
    }
    public final Object next(){
       return this.a(this.a.next());
    }
    public final void remove(){
       this.a.remove();
    }
}
