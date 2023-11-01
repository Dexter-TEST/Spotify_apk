package p.f1;
import java.util.ListIterator;
import p.ko6;
import p.h1;
import java.lang.Object;
import p.h0;
import p.fv1;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.util.NoSuchElementException;

public final class f1 extends ko6 implements ListIterator	// class@001540 from classes.dex
{
    public final h1 t;

    public void f1(h1 p0,int p1){
       this.t = p0;
       super(2, p0);
       fv1.o(p1, p0.a());
       this.b = p1;
    }
    public final void add(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean hasPrevious(){
       boolean b = (this.b > null)? true: false;
       return b;
    }
    public final int nextIndex(){
       return this.b;
    }
    public final Object previous(){
       if (!this.hasPrevious()) {
          throw new NoSuchElementException();
       }
       int i = this.b - 1;
       this.b = i;
       return this.t.get(i);
    }
    public final int previousIndex(){
       return (this.b - 1);
    }
    public final void set(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
