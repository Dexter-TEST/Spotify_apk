package p.ok;
import java.util.Collection;
import p.pk;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import p.wh6;
import java.util.Iterator;
import p.lk;

public final class ok implements Collection	// class@00213e from classes.dex
{
    public final pk a;

    public void ok(pk p0){
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
       boolean b = (this.a.g(p0) >= 0)? true: false;
       return b;
    }
    public final boolean containsAll(Collection p0){
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (!this.contains(iterator.next())) {
             break ;
          }
       }
       return false;
    }
    public final boolean isEmpty(){
       return this.a.isEmpty();
    }
    public final Iterator iterator(){
       return new lk(this.a, 1);
    }
    public final boolean remove(Object p0){
       int i;
       ok ta = this.a;
       if ((i = ta.g(p0)) < 0) {
          return false;
       }
       ta.i(i);
       return true;
    }
    public final boolean removeAll(Collection p0){
       ok ta = this.a;
       wh6 c = ta.c;
       int i = 0;
       boolean b = false;
       while (i < c) {
          if (p0.contains(ta.j(i))) {
             ta.i(i);
             i = i - 1;
             c = c - 1;
             b = true;
          }
          i = i + 1;
       }
       return b;
    }
    public final boolean retainAll(Collection p0){
       ok ta = this.a;
       wh6 c = ta.c;
       int i = 0;
       boolean b = false;
       while (i < c) {
          if (!p0.contains(ta.j(i))) {
             ta.i(i);
             i = i - 1;
             c = c - 1;
             b = true;
          }
          i = i + 1;
       }
       return b;
    }
    public final int size(){
       return this.a.c;
    }
    public final Object[] toArray(){
       ok ta = this.a;
       wh6 c = ta.c;
       Object[] objArray = new Object[c];
       for (int i = 0; i < c; i = i + 1) {
          objArray[i] = ta.j(i);
       }
       return objArray;
    }
    public final Object[] toArray(Object[] p0){
       return this.a.l(1, p0);
    }
}
