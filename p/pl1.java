package p.pl1;
import java.util.Set;
import java.io.Serializable;
import p.ch3;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.util.Collection;
import java.lang.Void;
import p.co5;
import java.util.Iterator;
import p.kl1;
import p.io2;

public final class pl1 implements Set, Serializable, ch3	// class@002282 from classes.dex
{
    public static final pl1 a;

    static {
       pl1.a = new pl1();
    }
    public void pl1(){
       super();
    }
    private final Object readResolve(){
       return pl1.a;
    }
    public final boolean add(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean addAll(Collection p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final void clear(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean contains(Object p0){
       if (!p0 instanceof Void) {
          return false;
       }
       co5.o(p0, "element");
       return false;
    }
    public final boolean containsAll(Collection p0){
       co5.o(p0, "elements");
       return p0.isEmpty();
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof Set && p0.isEmpty())? true: false;
       return b;
    }
    public final int hashCode(){
       return 0;
    }
    public final boolean isEmpty(){
       return true;
    }
    public final Iterator iterator(){
       return kl1.a;
    }
    public final boolean remove(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean removeAll(Collection p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean retainAll(Collection p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final int size(){
       return 0;
    }
    public final Object[] toArray(){
       return io2.w(this);
    }
    public final Object[] toArray(Object[] p0){
       co5.o(p0, "array");
       return io2.x(this, p0);
    }
    public final String toString(){
       return "[]";
    }
}
