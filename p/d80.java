package p.d80;
import java.util.Iterator;
import java.lang.Object;
import p.c80;
import p.i80;
import java.lang.Byte;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

public abstract class d80 implements Iterator	// class@0012f6 from classes.dex
{

    public void d80(){
       super();
    }
    public final Object next(){
       c80 a;
       c80 uoc80 = this;
       if ((a = uoc80.a) >= uoc80.b) {
          throw new NoSuchElementException();
       }
       uoc80.a = a + 1;
       return Byte.valueOf(uoc80.c.k(a));
    }
    public final void remove(){
       throw new UnsupportedOperationException();
    }
}
