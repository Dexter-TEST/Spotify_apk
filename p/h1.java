package p.h1;
import java.util.List;
import p.h0;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.util.Collection;
import p.co5;
import java.util.Iterator;
import p.ko6;
import java.util.ListIterator;
import p.f1;
import p.g1;

public abstract class h1 extends h0 implements List	// class@0017c4 from classes.dex
{

    public void h1(){
       super();
    }
    public final void add(int p0,Object p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean addAll(int p0,Collection p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof List) {
          return false;
       }
       co5.o(p0, "other");
       if (this.size() == p0.size()) {
          p0 = p0.iterator();
          Iterator iterator = this.iterator();
          while (iterator.hasNext()) {
             if (co5.c(iterator.next(), p0.next())) {
             }
          }
          return b;
       }
       b = false;
    }
    public abstract Object get(int p0);
    public final int hashCode(){
       Iterator iterator = this.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          i = i * 31;
          int i1 = (obj != null)? obj.hashCode(): 0;
          i = i + i1;
       }
       return i;
    }
    public int indexOf(Object p0){
       Iterator iterator = this.iterator();
       int i = 0;
       while (true) {
          if (iterator.hasNext()) {
             if (co5.c(iterator.next(), p0)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             break ;
          }
       }
       return i;
    }
    public final Iterator iterator(){
       return new ko6(2, this);
    }
    public int lastIndexOf(Object p0){
       int i;
       ListIterator listIterator = this.listIterator(this.size());
       while (true) {
          if (listIterator.hasPrevious()) {
             if (co5.c(listIterator.previous(), p0)) {
                i = listIterator.nextIndex();
                break ;
             }
          }else {
             i = -1;
             break ;
          }
       }
       return i;
    }
    public final ListIterator listIterator(){
       return new f1(this, 0);
    }
    public final ListIterator listIterator(int p0){
       return new f1(this, p0);
    }
    public final Object remove(int p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final Object set(int p0,Object p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final List subList(int p0,int p1){
       return new g1(this, p0, p1);
    }
}
