package p.ll1;
import java.util.List;
import java.io.Serializable;
import java.util.RandomAccess;
import p.ch3;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.util.Collection;
import java.lang.Void;
import p.co5;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.util.Iterator;
import p.kl1;
import java.util.ListIterator;
import p.tp2;
import p.io2;

public final class ll1 implements List, Serializable, RandomAccess, ch3	// class@001d75 from classes.dex
{
    public static final ll1 a;

    static {
       ll1.a = new ll1();
    }
    public void ll1(){
       super();
    }
    private final Object readResolve(){
       return ll1.a;
    }
    public final void add(int p0,Object p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean add(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean addAll(int p0,Collection p1){
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
       boolean b = (p0 instanceof List && p0.isEmpty())? true: false;
       return b;
    }
    public final Object get(int p0){
       throw new IndexOutOfBoundsException("Empty list doesn\'t contain element at index "+p0+'.');
    }
    public final int hashCode(){
       return 1;
    }
    public final int indexOf(Object p0){
       if (!p0 instanceof Void) {
          return -1;
       }
       co5.o(p0, "element");
       return -1;
    }
    public final boolean isEmpty(){
       return true;
    }
    public final Iterator iterator(){
       return kl1.a;
    }
    public final int lastIndexOf(Object p0){
       if (!p0 instanceof Void) {
          return -1;
       }
       co5.o(p0, "element");
       return -1;
    }
    public final ListIterator listIterator(){
       return kl1.a;
    }
    public final ListIterator listIterator(int p0){
       if (!p0) {
          return kl1.a;
       }
       throw new IndexOutOfBoundsException(tp2.k("Index: ", p0));
    }
    public final Object remove(int p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public final Object set(int p0,Object p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final int size(){
       return 0;
    }
    public final List subList(int p0,int p1){
       if (!p0 && !p1) {
          return this;
       }
       throw new IndexOutOfBoundsException("fromIndex: "+p0+", toIndex: "+p1);
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
