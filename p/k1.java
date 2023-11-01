package p.k1;
import java.util.Iterator;
import p.l1;
import java.lang.Object;
import java.util.Set;
import java.util.Map;
import p.m1;
import p.o1;
import java.util.List;
import java.util.ListIterator;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map$Entry;
import java.lang.Class;
import java.util.RandomAccess;
import p.n1;
import p.i1;
import p.q1;
import p.b73;
import java.lang.String;
import p.ap5;

public class k1 implements Iterator	// class@001b8d from classes.dex
{
    public final int a;
    public final Iterator b;
    public Object c;
    public final Object t;

    public void k1(l1 p0){
       this.a = 0;
       this.t = p0;
       super();
       this.b = p0.c.entrySet().iterator();
    }
    public void k1(m1 p0,Iterator p1){
       this.a = 1;
       this.t = p0;
       this.b = p1;
       super();
    }
    public void k1(o1 p0){
       this.a = 2;
       this.t = p0;
       super();
       p0 = p0.b;
       this.c = p0;
       ListIterator listIterator = (p0 instanceof List)? p0.listIterator(): p0.iterator();
       this.b = listIterator;
       return;
    }
    public void k1(o1 p0,ListIterator p1){
       this.a = 2;
       this.t = p0;
       super();
       this.c = p0.b;
       this.b = p1;
    }
    public final void a(){
       k1 tt = this.t;
       tt.b();
       if (tt.b == this.c) {
          return;
       }
       throw new ConcurrentModificationException();
    }
    public final boolean hasNext(){
       k1 tb = this.b;
       switch (this.a){
           case 0:
             return tb.hasNext();
           case 1:
             return tb.hasNext();
           default:
             this.a();
             return tb.hasNext();
       }
    }
    public final Object next(){
       Map$Entry uEntry;
       k1 tb = this.b;
       switch (this.a){
           case 0:
             uEntry = tb.next();
             this.c = uEntry.getValue();
             tb = this.t;
             tb.getClass();
             Object key = uEntry.getKey();
             Collection value = uEntry.getValue();
             l1 t = tb.t;
             t.getClass();
             n1 on1 = (value instanceof RandomAccess)? new n1(t, key, value, null): new q1(t, key, value, null);
             return new b73(key, on1);
             break;
           case 1:
           default:
             this.a();
             return tb.next();
       }
       uEntry = tb.next();
       this.c = uEntry;
       return uEntry.getKey();
    }
    public final void remove(){
       boolean b = false;
       String str = "no calls to next\(\) since the last call to remove\(\)";
       k1 tt = this.t;
       k1 tb = this.b;
       switch (this.a){
           case 0:
             if (this.c != null) {
                b = true;
             }
             break;
           case 1:
             if (this.c != null) {
                b = true;
             }
             ap5.j(str, b);
             Collection value = this.c.getValue();
             tb.remove();
             m1 c = tt.c;
             c.t = c.t - value.size();
             value.clear();
             this.c = null;
             return;
             break;
           default:
             tb.remove();
             o1 v = tt.v;
             v.t = v.t - 1;
             tt.c();
             return;
       }
       ap5.j(str, b);
       tb.remove();
       l1 t = tt.t;
       t.t = t.t - this.c.size();
       this.c.clear();
       this.c = null;
       return;
    }
}
