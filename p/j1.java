package p.j1;
import p.nc6;
import p.l1;
import java.util.AbstractMap;
import java.util.Collection;
import java.lang.Class;
import java.lang.Object;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import p.w51;
import java.util.Map$Entry;
import p.k1;
import java.util.Objects;
import p.i1;

public final class j1 extends nc6	// class@001a4c from classes.dex
{
    public final l1 b;

    public void j1(l1 p0){
       this.b = p0;
       super(0);
    }
    public final void a(){
       this.b.clear();
    }
    public final boolean b(){
       return this.b.isEmpty();
    }
    public final boolean c(Collection p0){
       boolean b;
       try{
          p0.getClass();
          b = super.removeAll(p0);
          return b;
       }catch(java.lang.UnsupportedOperationException e0){
          Iterator iterator = b.iterator();
          int i = 0;
       label_000d :
          if (!iterator.hasNext()) {
             return i;
          }
          i = i | this.remove(iterator.next());
          goto label_000d ;
       }
    }
    public final void clear(){
       this.a();
    }
    public final boolean contains(Object p0){
       boolean b;
       Set set = this.b.c.entrySet();
       try{
          set.getClass();
          b = set.contains(p0);
       }catch(java.lang.ClassCastException e0){
          b = false;
       }catch(java.lang.NullPointerException e0){
       }
       return b;
    }
    public final boolean d(Collection p0){
       boolean b;
       try{
          p0.getClass();
          b = super.retainAll(p0);
          return b;
       }catch(java.lang.UnsupportedOperationException e0){
          HashSet hashSet = new HashSet(w51.c(b.size()));
          Iterator iterator = b.iterator();
       label_0019 :
          if (!iterator.hasNext()) {
             return this.b.keySet().retainAll(hashSet);
          }
          Object obj = iterator.next();
          if (this.contains(obj) && obj instanceof Map$Entry) {
             hashSet.add(obj.getKey());
             goto label_0019 ;
          }else {
             goto label_0019 ;
          }
       }
    }
    public final int g(){
       return this.b.size();
    }
    public final boolean isEmpty(){
       return this.b();
    }
    public final Iterator iterator(){
       return new k1(this.b);
    }
    public final boolean remove(Object p0){
       if (!this.contains(p0)) {
          return false;
       }
       Objects.requireNonNull(p0);
       l1 t = this.b.t;
       p0 = p0.getKey();
       i1 c = t.c;
       try{
          c.getClass();
          p0 = c.remove(p0);
       }catch(java.lang.ClassCastException e0){
          p0 = null;
       }catch(java.lang.NullPointerException e0){
       }
       if (p0 != null) {
          p0.clear();
          e0.t = e0.t - p0.size();
       }
       return true;
    }
    public final boolean removeAll(Collection p0){
       return this.c(p0);
    }
    public final boolean retainAll(Collection p0){
       return this.d(p0);
    }
    public final int size(){
       return this.g();
    }
}
