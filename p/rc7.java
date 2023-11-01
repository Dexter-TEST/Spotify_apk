package p.rc7;
import java.util.ListIterator;
import p.tc7;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.UnsupportedOperationException;

public final class rc7 implements ListIterator	// class@0024c0 from classes.dex
{
    public final ListIterator a;

    public void rc7(tc7 p0,int p1){
       super();
       this.a = p0.a.listIterator(p1);
    }
    public final void add(Object p0){
       throw new UnsupportedOperationException();
    }
    public final boolean hasNext(){
       return this.a.hasNext();
    }
    public final boolean hasPrevious(){
       return this.a.hasPrevious();
    }
    public final Object next(){
       return this.a.next();
    }
    public final int nextIndex(){
       return this.a.nextIndex();
    }
    public final Object previous(){
       return this.a.previous();
    }
    public final int previousIndex(){
       return this.a.previousIndex();
    }
    public final void remove(){
       throw new UnsupportedOperationException();
    }
    public final void set(Object p0){
       throw new UnsupportedOperationException();
    }
}
