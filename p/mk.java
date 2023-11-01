package p.mk;
import java.util.Set;
import p.pk;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.util.Collection;
import p.wh6;
import java.lang.Class;
import java.util.Iterator;
import p.lk;

public final class mk implements Set	// class@001eb6 from classes.dex
{
    public final pk a;

    public void mk(pk p0){
       this.a = p0;
       super();
    }
    public final boolean add(Object p0){
       throw new UnsupportedOperationException();
    }
    public final boolean addAll(Collection p0){
       throw new UnsupportedOperationException();
    }
    public final void clear(){
       this.a.clear();
    }
    public final boolean contains(Object p0){
       return this.a.containsKey(p0);
    }
    public final boolean containsAll(Collection p0){
       boolean b;
       mk ta = this.a;
       ta.getClass();
       Iterator iterator = p0.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (!ta.containsKey(iterator.next())) {
                b = false;
                break ;
             }
          }else {
             b = true;
             break ;
          }
       }
       return b;
    }
    public final boolean equals(Object p0){
       boolean b;
       try{
          b = true;
          if (this == p0) {
          }else if(p0 instanceof Set){
             if (this.size() != p0.size() || !this.containsAll(p0)) {
             }
          }else {
          }
       }catch(java.lang.NullPointerException e0){
          b = false;
       }catch(java.lang.ClassCastException e0){
       }
       return b;
    }
    public final int hashCode(){
       Object obj;
       mk ta = this.a;
       int i1 = 0;
       for (int i = ta.c - 1; i >= 0; i = i - 1) {
          int i2 = ((obj = ta.h(i)) == null)? 0: obj.hashCode();
          i1 = i1 + i2;
       }
       return i1;
    }
    public final boolean isEmpty(){
       return this.a.isEmpty();
    }
    public final Iterator iterator(){
       return new lk(this.a, 0);
    }
    public final boolean remove(Object p0){
       int i;
       mk ta = this.a;
       if ((i = ta.e(p0)) < 0) {
          return false;
       }
       ta.i(i);
       return true;
    }
    public final boolean removeAll(Collection p0){
       mk ta = this.a;
       wh6 c = ta.c;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ta.remove(iterator.next());
       }
       boolean b = (c != ta.c)? true: false;
       return b;
    }
    public final boolean retainAll(Collection p0){
       return this.a.k(p0);
    }
    public final int size(){
       return this.a.c;
    }
    public final Object[] toArray(){
       mk ta = this.a;
       wh6 c = ta.c;
       Object[] objArray = new Object[c];
       for (int i = 0; i < c; i = i + 1) {
          objArray[i] = ta.h(i);
       }
       return objArray;
    }
    public final Object[] toArray(Object[] p0){
       return this.a.l(0, p0);
    }
}
