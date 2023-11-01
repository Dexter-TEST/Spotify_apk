package p.m1;
import p.nc6;
import p.i1;
import java.util.Map;
import java.lang.Class;
import java.lang.Object;
import java.util.Iterator;
import p.w51;
import java.util.Collection;
import java.util.Set;
import p.k1;

public final class m1 extends nc6	// class@001e0b from classes.dex
{
    public final Map b;
    public final i1 c;

    public void m1(i1 p0,Map p1){
       this.c = p0;
       super(0);
       p1.getClass();
       this.b = p1;
    }
    public final boolean a(Object p0){
       return this.b.containsKey(p0);
    }
    public final boolean b(){
       return this.b.isEmpty();
    }
    public final int c(){
       return this.b.size();
    }
    public final void clear(){
       w51.n(this.iterator());
    }
    public final boolean contains(Object p0){
       return this.a(p0);
    }
    public final boolean containsAll(Collection p0){
       return this.b.keySet().containsAll(p0);
    }
    public final boolean equals(Object p0){
       boolean b = (this != p0 && !this.b.keySet().equals(p0))? false: true;
       return b;
    }
    public final int hashCode(){
       return this.b.keySet().hashCode();
    }
    public final boolean isEmpty(){
       return this.b();
    }
    public final Iterator iterator(){
       return new k1(this, this.b.entrySet().iterator());
    }
    public final boolean remove(Object p0){
       int i;
       p0 = this.b.remove(p0);
       boolean b = false;
       if (p0 != null) {
          i = p0.size();
          p0.clear();
          p0 = this.c;
          p0.t = p0.t - i;
       }else {
          i = 0;
       }
       if (i > 0) {
          b = true;
       }
       return b;
    }
    public final int size(){
       return this.c();
    }
}
