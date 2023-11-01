package p.am6;
import java.util.Iterator;
import java.lang.Object;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

public final class am6 implements Iterator	// class@000fb1 from classes.dex
{

    public void am6(){
       super();
    }
    public final boolean hasNext(){
       return false;
    }
    public final Object next(){
       throw new NoSuchElementException();
    }
    public final void remove(){
       throw new UnsupportedOperationException();
    }
}
