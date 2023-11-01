package p.kl1;
import java.util.ListIterator;
import p.ch3;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.util.NoSuchElementException;

public final class kl1 implements ListIterator, ch3	// class@001c34 from classes.dex
{
    public static final kl1 a;

    static {
       kl1.a = new kl1();
    }
    public void kl1(){
       super();
    }
    public final void add(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean hasNext(){
       return false;
    }
    public final boolean hasPrevious(){
       return false;
    }
    public final Object next(){
       throw new NoSuchElementException();
    }
    public final int nextIndex(){
       return 0;
    }
    public final Object previous(){
       throw new NoSuchElementException();
    }
    public final int previousIndex(){
       return -1;
    }
    public final void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final void set(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
