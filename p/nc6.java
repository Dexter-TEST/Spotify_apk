package p.nc6;
import java.util.AbstractSet;
import java.lang.Object;
import java.util.AbstractCollection;
import java.lang.UnsupportedOperationException;
import java.util.Collection;
import java.lang.Class;
import java.util.Set;
import java.util.Iterator;

public abstract class nc6 extends AbstractSet	// class@001fb0 from classes.dex
{
    public final int a;

    public void nc6(){
       this.a = 1;
       super(1);
    }
    public void nc6(int p0){
       this.a = p0;
       super();
    }
    public final boolean add(Object p0){
       switch (this.a){
           case 1:
           default:
             return super.add(p0);
       }
       throw new UnsupportedOperationException();
    }
    public final boolean addAll(Collection p0){
       switch (this.a){
           case 1:
           default:
             return super.addAll(p0);
       }
       throw new UnsupportedOperationException();
    }
    public void clear(){
       switch (this.a){
           case 1:
           default:
             super.clear();
             return;
       }
       throw new UnsupportedOperationException();
    }
    public boolean remove(Object p0){
       switch (this.a){
           case 1:
           default:
             return super.remove(p0);
       }
       throw new UnsupportedOperationException();
    }
    public boolean removeAll(Collection p0){
       switch (this.a){
           case 0:
             break;
           default:
             throw new UnsupportedOperationException();
       }
       p0.getClass();
       boolean b = false;
       if (p0 instanceof Set && p0.size() > this.size()) {
          Iterator iterator = this.iterator();
          while (iterator.hasNext()) {
             if (p0.contains(iterator.next())) {
                iterator.remove();
                b = true;
             }
          }
       }else {
          Iterator iterator1 = p0.iterator();
          while (iterator1.hasNext()) {
             b = b | this.remove(iterator1.next());
          }
       }
       return b;
    }
    public boolean retainAll(Collection p0){
       switch (this.a){
           case 0:
           default:
             throw new UnsupportedOperationException();
       }
       p0.getClass();
       return super.retainAll(p0);
    }
}
