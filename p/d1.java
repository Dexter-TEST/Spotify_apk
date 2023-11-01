package p.d1;
import java.util.ListIterator;
import p.qc7;
import p.ap5;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public abstract class d1 extends qc7 implements ListIterator	// class@0012c0 from classes.dex
{
    public final int a;
    public int b;

    public void d1(int p0,int p1){
       super();
       ap5.h(p1, p0);
       this.a = p0;
       this.b = p1;
    }
    public final void a(Object p0){
       throw new UnsupportedOperationException();
    }
    public final void add(Object p0){
       this.a(p0);
       throw null;
    }
    public abstract Object b(int p0);
    public final void c(Object p0){
       throw new UnsupportedOperationException();
    }
    public final boolean hasNext(){
       boolean b = (this.b < this.a)? true: false;
       return b;
    }
    public final boolean hasPrevious(){
       boolean b = (this.b > null)? true: false;
       return b;
    }
    public final Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       d1 tb = this.b;
       this.b = tb + 1;
       return this.b(tb);
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
       return this.b(i);
    }
    public final int previousIndex(){
       return (this.b - 1);
    }
    public final void set(Object p0){
       this.c(p0);
       throw null;
    }
}
