package p.ec6;
import java.io.Serializable;
import p.y1;
import p.a14;
import java.lang.Object;
import p.xa6;
import java.util.Collection;
import java.io.NotSerializableException;
import java.lang.String;
import p.co5;
import java.util.AbstractSet;
import java.util.Iterator;
import java.lang.Class;
import p.x04;

public final class ec6 extends y1 implements Serializable	// class@001460 from classes.dex
{
    public final a14 a;

    public void ec6(){
       super(new a14());
    }
    public void ec6(a14 p0){
       super();
       this.a = p0;
    }
    private final Object writeReplace(){
       if (this.a.C != null) {
          return new xa6(1, this);
       }
       throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }
    public final int a(){
       return this.a.y;
    }
    public final boolean add(Object p0){
       boolean b = (this.a.a(p0) >= 0)? true: false;
       return b;
    }
    public final boolean addAll(Collection p0){
       co5.o(p0, "elements");
       this.a.b();
       return super.addAll(p0);
    }
    public final void clear(){
       this.a.clear();
    }
    public final boolean contains(Object p0){
       return this.a.containsKey(p0);
    }
    public final boolean isEmpty(){
       return this.a.isEmpty();
    }
    public final Iterator iterator(){
       ec6 ta = this.a;
       ta.getClass();
       return new x04(ta, 1);
    }
    public final boolean remove(Object p0){
       boolean i;
       ec6 ta = this.a;
       ta.b();
       if ((i = ta.f(p0)) < 0) {
          i = -1;
       }else {
          ta.i(i);
       }
       i = (i >= 0)? true: false;
       return i;
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
}
