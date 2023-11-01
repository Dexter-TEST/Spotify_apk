package p.i73;
import java.util.List;
import java.util.RandomAccess;
import java.lang.Object;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public final class i73 implements List, RandomAccess	// class@00193b from classes.dex
{
    public final List a;

    public void i73(List p0){
       super();
       this.a = Collections.unmodifiableList(p0);
    }
    public final void add(int p0,Object p1){
       this.a.add(p0, p1);
    }
    public final boolean add(Object p0){
       return this.a.add(p0);
    }
    public final boolean addAll(int p0,Collection p1){
       return this.a.addAll(p0, p1);
    }
    public final boolean addAll(Collection p0){
       return this.a.addAll(p0);
    }
    public final void clear(){
       this.a.clear();
    }
    public final boolean contains(Object p0){
       return this.a.contains(p0);
    }
    public final boolean containsAll(Collection p0){
       return this.a.containsAll(p0);
    }
    public final boolean equals(Object p0){
       return this.a.equals(p0);
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
       return this.a.isEmpty();
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
       return this.a.remove(p0);
    }
    public final boolean remove(Object p0){
       return this.a.remove(p0);
    }
    public final boolean removeAll(Collection p0){
       return this.a.removeAll(p0);
    }
    public final boolean retainAll(Collection p0){
       return this.a.retainAll(p0);
    }
    public final Object set(int p0,Object p1){
       return this.a.set(p0, p1);
    }
    public final int size(){
       return this.a.size();
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
}
