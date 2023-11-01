package p.tc7;
import p.cj3;
import java.util.RandomAccess;
import java.util.AbstractList;
import p.i80;
import java.lang.UnsupportedOperationException;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Iterator;
import p.sc7;
import java.util.ListIterator;
import p.rc7;

public final class tc7 extends AbstractList implements cj3, RandomAccess	// class@002746 from classes.dex
{
    public final cj3 a;

    public void tc7(cj3 p0){
       super();
       this.a = p0;
    }
    public final void e(i80 p0){
       throw new UnsupportedOperationException();
    }
    public final Object get(int p0){
       return this.a.get(p0);
    }
    public final cj3 h(){
       return this;
    }
    public final Object i(int p0){
       return this.a.i(p0);
    }
    public final Iterator iterator(){
       return new sc7(this);
    }
    public final List j(){
       return this.a.j();
    }
    public final ListIterator listIterator(int p0){
       return new rc7(this, p0);
    }
    public final int size(){
       return this.a.size();
    }
}
