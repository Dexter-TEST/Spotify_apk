package p.b87;
import java.util.Iterator;
import p.ch3;
import p.c87;
import java.lang.Object;
import p.la6;
import p.zf2;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class b87 implements Iterator, ch3	// class@001077 from classes.dex
{
    public final Iterator a;
    public final c87 b;

    public void b87(c87 p0){
       this.b = p0;
       super();
       this.a = p0.a.iterator();
    }
    public final boolean hasNext(){
       return this.a.hasNext();
    }
    public final Object next(){
       return this.b.b.invoke(this.a.next());
    }
    public final void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
