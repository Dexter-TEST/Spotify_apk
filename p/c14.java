package p.c14;
import java.util.Collection;
import p.dh3;
import java.util.AbstractCollection;
import p.a14;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.UnsupportedOperationException;
import java.util.Iterator;
import java.lang.Class;
import p.x04;

public final class c14 extends AbstractCollection implements Collection, dh3	// class@001178 from classes.dex
{
    public final a14 a;

    public void c14(a14 p0){
       co5.o(p0, "backing");
       super();
       this.a = p0;
    }
    public final boolean add(Object p0){
       throw new UnsupportedOperationException();
    }
    public final boolean addAll(Collection p0){
       co5.o(p0, "elements");
       throw new UnsupportedOperationException();
    }
    public final void clear(){
       this.a.clear();
    }
    public final boolean contains(Object p0){
       return this.a.containsValue(p0);
    }
    public final boolean isEmpty(){
       return this.a.isEmpty();
    }
    public final Iterator iterator(){
       c14 ta = this.a;
       ta.getClass();
       return new x04(ta, 2);
    }
    public final boolean remove(Object p0){
       int i1;
       boolean b1;
       c14 ta = this.a;
       ta.b();
       a14 w = ta.w;
       while (true) {
          int i = -1;
          if ((i1 = w + i) >= 0) {
             if (ta.c[i1] >= 0) {
                a14 b = ta.b;
                co5.i(b);
                if (co5.c(b[i1], p0)) {
                   i = i1;
                   break ;
                }
             }
          }else if(i < 0){
             b1 = false;
          }else {
             ta.i(i);
             b1 = true;
          }
          return b1;
       }
    }
    public final boolean removeAll(Collection p0){
       co5.o(p0, "elements");
       this.a.b();
       return super.removeAll(p0);
    }
    public final boolean retainAll(Collection p0){
       co5.o(p0, "elements");
       this.a.b();
       return super.retainAll(p0);
    }
    public final int size(){
       return this.a.y;
    }
}
