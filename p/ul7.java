package p.ul7;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.ListIterator;
import java.lang.String;

public final class ul7 extends AtomicInteger implements List, RandomAccess	// class@0028d5 from classes.dex
{
    public final ArrayList a;

    public void ul7(){
       super();
       this.a = new ArrayList();
    }
    public final void add(int p0,Object p1){
       ul7 ta = this.a;
       ta.add(p0, p1);
       this.lazySet(ta.size());
    }
    public final boolean add(Object p0){
       ul7 ta = this.a;
       boolean b = ta.add(p0);
       this.lazySet(ta.size());
       return b;
    }
    public final boolean addAll(int p0,Collection p1){
       ul7 ta = this.a;
       this.lazySet(ta.size());
       return ta.addAll(p0, p1);
    }
    public final boolean addAll(Collection p0){
       ul7 ta = this.a;
       boolean b = ta.addAll(p0);
       this.lazySet(ta.size());
       return b;
    }
    public final void clear(){
       this.a.clear();
       this.lazySet(0);
    }
    public final boolean contains(Object p0){
       return this.a.contains(p0);
    }
    public final boolean containsAll(Collection p0){
       return this.a.containsAll(p0);
    }
    public final boolean equals(Object p0){
       ul7 ta = this.a;
       if (p0 instanceof ul7) {
          return ta.equals(p0.a);
       }
       return ta.equals(p0);
    }
    public final Object get(int p0){
       return this.a.get(p0);
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final int indexOf(Object p0){
       return this.a.indexOf(p0);
    }
    public final boolean isEmpty(){
       boolean b = (!this.get())? true: false;
       return b;
    }
    public final Iterator iterator(){
       return this.a.iterator();
    }
    public final int lastIndexOf(Object p0){
       return this.a.lastIndexOf(p0);
    }
    public final ListIterator listIterator(){
       return this.a.listIterator();
    }
    public final ListIterator listIterator(int p0){
       return this.a.listIterator(p0);
    }
    public final Object remove(int p0){
       ul7 ta = this.a;
       Object obj = ta.remove(p0);
       this.lazySet(ta.size());
       return obj;
    }
    public final boolean remove(Object p0){
       ul7 ta = this.a;
       boolean b = ta.remove(p0);
       this.lazySet(ta.size());
       return b;
    }
    public final boolean removeAll(Collection p0){
       ul7 ta = this.a;
       boolean b = ta.removeAll(p0);
       this.lazySet(ta.size());
       return b;
    }
    public final boolean retainAll(Collection p0){
       ul7 ta = this.a;
       boolean b = ta.retainAll(p0);
       this.lazySet(ta.size());
       return b;
    }
    public final Object set(int p0,Object p1){
       return this.a.set(p0, p1);
    }
    public final int size(){
       return this.get();
    }
    public final List subList(int p0,int p1){
       return this.a.subList(p0, p1);
    }
    public final Object[] toArray(){
       return this.a.toArray();
    }
    public final Object[] toArray(Object[] p0){
       return this.a.toArray(p0);
    }
    public final String toString(){
       return this.a.toString();
    }
}
