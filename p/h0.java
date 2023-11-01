package p.h0;
import java.util.Collection;
import p.ch3;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.util.Iterator;
import java.lang.Iterable;
import p.co5;
import p.io2;
import p.cc1;
import p.zf2;
import p.dj0;

public abstract class h0 implements Collection, ch3	// class@0017ba from classes.dex
{

    public void h0(){
       super();
    }
    public abstract int a();
    public final boolean add(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean addAll(Collection p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final void clear(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (this.isEmpty()) {
       }else {
          Iterator iterator = this.iterator();
          while (iterator.hasNext()) {
             if (co5.c(iterator.next(), p0)) {
                b = true;
                break ;
             }
          }
       }
       return b;
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
    public boolean isEmpty(){
       boolean b = (!this.a())? true: false;
       return b;
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
       return this.a();
    }
    public final Object[] toArray(){
       return io2.w(this);
    }
    public final Object[] toArray(Object[] p0){
       co5.o(p0, "array");
       return io2.x(this, p0);
    }
    public final String toString(){
       return dj0.q0(this, ", ", "[", "]", new cc1(7, this), 24);
    }
}
