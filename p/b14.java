package p.b14;
import p.y1;
import p.a14;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.Map$Entry;
import java.lang.UnsupportedOperationException;
import java.util.Collection;
import java.lang.Class;
import java.util.AbstractCollection;
import java.util.Iterator;
import p.x04;
import java.util.AbstractSet;

public final class b14 extends y1	// class@001034 from classes.dex
{
    public final int a;
    public final a14 b;

    public void b14(a14 p0,int p1){
       this.a = p1;
       if (p1 != 1) {
          co5.o(p0, "backing");
          super();
          this.b = p0;
          return;
       }else {
          co5.o(p0, "backing");
          super();
          this.b = p0;
          return;
       }
    }
    public final int a(){
       b14 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.y;
       }
       return tb.y;
    }
    public final boolean add(Object p0){
       switch (this.a){
           case 0:
           default:
             throw new UnsupportedOperationException();
       }
       co5.o(p0, "element");
       throw new UnsupportedOperationException();
    }
    public final boolean addAll(Collection p0){
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "elements");
             throw new UnsupportedOperationException();
       }
       co5.o(p0, "elements");
       throw new UnsupportedOperationException();
    }
    public final boolean b(Object p0){
       if (!p0 instanceof Map$Entry) {
          return false;
       }
       co5.o(p0, "element");
       return this.b.d(p0);
    }
    public final boolean c(Object p0){
       int i;
       boolean b = false;
       if (!p0 instanceof Map$Entry) {
          return b;
       }
       co5.o(p0, "element");
       b14 tb = this.b;
       tb.getClass();
       tb.b();
       if ((i = tb.f(p0.getKey())) >= 0) {
          a14 b1 = tb.b;
          co5.i(b1);
          if (co5.c(b1[i], p0.getValue())) {
             tb.i(i);
             b = true;
          }
       }
       return b;
    }
    public final void clear(){
       b14 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.clear();
             return;
       }
       tb.clear();
       return;
    }
    public final boolean contains(Object p0){
       switch (this.a){
           case 0:
           default:
             return this.b.containsKey(p0);
       }
       return this.b(p0);
    }
    public final boolean containsAll(Collection p0){
       switch (this.a){
           case 0:
           default:
             return super.containsAll(p0);
       }
       co5.o(p0, "elements");
       return this.b.c(p0);
    }
    public final boolean isEmpty(){
       b14 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.isEmpty();
       }
       return tb.isEmpty();
    }
    public final Iterator iterator(){
       b14 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             return new x04(tb, 1);
       }
       tb.getClass();
       return new x04(tb, 0);
    }
    public final boolean remove(Object p0){
       boolean i;
       switch (this.a){
           case 0:
           default:
             b14 tb = this.b;
             tb.b();
             if ((i = tb.f(p0)) < 0) {
                i = -1;
             }else {
                tb.i(i);
             }
             i = (i >= 0)? true: false;
             return i;
       }
       return this.c(p0);
    }
    public final boolean removeAll(Collection p0){
       b14 tb = this.b;
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "elements");
             tb.b();
             return super.removeAll(p0);
       }
       co5.o(p0, "elements");
       tb.b();
       return super.removeAll(p0);
    }
    public final boolean retainAll(Collection p0){
       b14 tb = this.b;
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "elements");
             tb.b();
             return super.retainAll(p0);
       }
       co5.o(p0, "elements");
       tb.b();
       return super.retainAll(p0);
    }
}
