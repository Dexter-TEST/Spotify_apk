package p.ek;
import java.util.Collection;
import p.ch3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.UnsupportedOperationException;
import p.uk;
import java.util.Iterator;
import java.lang.Iterable;
import p.ko6;
import p.xe7;
import java.lang.Class;
import java.util.Arrays;
import p.io2;

public final class ek implements Collection, ch3	// class@0014a8 from classes.dex
{
    public final Object[] a;
    public final boolean b;

    public void ek(Object[] p0,boolean p1){
       co5.o(p0, "values");
       super();
       this.a = p0;
       this.b = p1;
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
       return uk.i0(this.a, p0);
    }
    public final boolean containsAll(Collection p0){
       co5.o(p0, "elements");
       boolean b = true;
       if (p0.isEmpty()) {
       }else {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (!this.contains(iterator.next())) {
                b = false;
                break ;
             }
          }
       }
       return b;
    }
    public final boolean isEmpty(){
       boolean b = (!this.a.length)? true: false;
       return b;
    }
    public final Iterator iterator(){
       return xe7.D(this.a);
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
       return this.a.length;
    }
    public final Object[] toArray(){
       ek ta = this.a;
       co5.o(ta, "<this>");
       if (this.b == null || !co5.c(ta.getClass(), Object[].class)) {
          ta = Arrays.copyOf(ta, ta.length, Object[].class);
          co5.l(ta, "copyOf\(this, this.size, Array<Any?>::class.java\)");
       }
       return ta;
    }
    public final Object[] toArray(Object[] p0){
       co5.o(p0, "array");
       return io2.x(this, p0);
    }
}
