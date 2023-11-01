package p.f73;
import com.google.common.collect.c;
import java.lang.Object;
import p.ap5;
import java.util.List;
import java.util.Iterator;
import p.e73;
import com.google.common.collect.b;
import java.util.ListIterator;
import java.util.AbstractCollection;

public final class f73 extends c	// class@001572 from classes.dex
{
    public final c c;

    public void f73(c p0){
       super();
       this.c = p0;
    }
    public final boolean contains(Object p0){
       return this.c.contains(p0);
    }
    public final Object get(int p0){
       ap5.f(p0, this.size());
       return this.c.get(((this.size() - 1) - p0));
    }
    public final int indexOf(Object p0){
       int i = this.c.lastIndexOf(p0);
       int i1 = -1;
       if (i >= 0) {
          i1 = (this.size() + i1) - i;
       }
       return i1;
    }
    public final Iterator iterator(){
       return this.q(0);
    }
    public final boolean k(){
       return this.c.k();
    }
    public final int lastIndexOf(Object p0){
       int i = this.c.indexOf(p0);
       int i1 = -1;
       if (i >= 0) {
          i1 = (this.size() + i1) - i;
       }
       return i1;
    }
    public final ListIterator listIterator(){
       return this.q(0);
    }
    public final ListIterator listIterator(int p0){
       return this.q(p0);
    }
    public final int size(){
       return this.c.size();
    }
    public final List subList(int p0,int p1){
       return this.u(p0, p1);
    }
    public final c t(){
       return this.c;
    }
    public final c u(int p0,int p1){
       ap5.i(p0, p1, this.size());
       return this.c.u((this.size() - p1), (this.size() - p0)).t();
    }
}
