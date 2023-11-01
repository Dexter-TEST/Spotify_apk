package p.l52;
import java.util.Iterator;
import p.ch3;
import p.m52;
import java.lang.Object;
import p.la6;
import p.zf2;
import p.co5;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class l52 implements Iterator, ch3	// class@001ce6 from classes.dex
{
    public final Iterator a;
    public Iterator b;
    public final m52 c;

    public void l52(m52 p0){
       this.c = p0;
       super();
       this.a = p0.a.iterator();
    }
    public final boolean a(){
       l52 tb = ((tb = this.b) != null && !tb.hasNext())? 1: 0;
       if (tb) {
          this.b = null;
       }
       while (this.b == null) {
          tb = this.a;
          if (!tb.hasNext()) {
             return false;
          }
          l52 tc = this.c;
          Iterator iterator = tc.c.invoke(tc.b.invoke(tb.next()));
       }
       return true;
    }
    public final boolean hasNext(){
       return this.a();
    }
    public final Object next(){
       if (!this.a()) {
          throw new NoSuchElementException();
       }
       l52 tb = this.b;
       co5.i(tb);
       return tb.next();
    }
    public final void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
