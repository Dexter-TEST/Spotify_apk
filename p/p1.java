package p.p1;
import java.util.ListIterator;
import p.k1;
import p.q1;
import p.o1;
import java.util.List;
import java.lang.Object;
import java.util.AbstractCollection;
import p.i1;

public final class p1 extends k1 implements ListIterator	// class@0021d5 from classes.dex
{
    public final q1 v;

    public void p1(q1 p0){
       this.v = p0;
       super(p0);
    }
    public void p1(q1 p0,int p1){
       this.v = p0;
       super(p0, p0.b.listIterator(p1));
    }
    public final void add(Object p0){
       p1 tv = this.v;
       this.b().add(p0);
       p0 = tv.w;
       p0.t = p0.t + 1;
       if (tv.isEmpty()) {
          tv.a();
       }
       return;
    }
    public final ListIterator b(){
       this.a();
       return this.b;
    }
    public final boolean hasPrevious(){
       return this.b().hasPrevious();
    }
    public final int nextIndex(){
       return this.b().nextIndex();
    }
    public final Object previous(){
       return this.b().previous();
    }
    public final int previousIndex(){
       return this.b().previousIndex();
    }
    public final void set(Object p0){
       this.b().set(p0);
    }
}
