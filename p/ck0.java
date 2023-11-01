package p.ck0;
import java.util.AbstractCollection;
import java.util.Map;
import java.lang.Class;
import java.lang.Object;
import p.dk0;
import java.util.Iterator;
import java.util.Collection;
import p.yj0;
import java.util.Set;
import p.p14;
import java.util.Map$Entry;
import p.io2;
import java.util.HashSet;

public final class ck0 extends AbstractCollection	// class@001220 from classes.dex
{
    public final int a;
    public final Map b;

    public void ck0(Map p0){
       this.a = 1;
       super();
       p0.getClass();
       this.b = p0;
    }
    public void ck0(dk0 p0){
       this.a = 0;
       this.b = p0;
       super();
    }
    public final void clear(){
       ck0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.clear();
             return;
       }
       tb.clear();
       return;
    }
    public final boolean contains(Object p0){
       switch (this.a){
           case 1:
           default:
             return super.contains(p0);
       }
       return this.b.containsValue(p0);
    }
    public final boolean isEmpty(){
       switch (this.a){
           case 1:
           default:
             return super.isEmpty();
       }
       return this.b.isEmpty();
    }
    public final Iterator iterator(){
       Map map;
       ck0 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             return new p14(1, tb.entrySet().iterator());
       }
       Iterator iterator = ((map = tb.a()) != null)? map.values().iterator(): new yj0(tb, 2);
       return iterator;
    }
    public final boolean remove(Object p0){
       boolean b;
       switch (this.a){
           case 1:
             try{
                b = super.remove(p0);
             }catch(java.lang.UnsupportedOperationException e0){
                ck0 tb = this.b;
                Iterator iterator = tb.entrySet().iterator();
             label_0019 :
                if (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   if (io2.j(b, uEntry.getValue())) {
                      tb.remove(uEntry.getKey());
                      b = true;
                   }else {
                      goto label_0019 ;
                   }
                }else {
                   b = false;
                }
             }
             return b;
             break;
       }
       return super.remove(p0);
    }
    public final boolean removeAll(Collection p0){
       boolean b;
       switch (this.a){
           case 1:
             try{
                p0.getClass();
                b = super.removeAll(p0);
             }catch(java.lang.UnsupportedOperationException e0){
                HashSet hashSet = new HashSet();
                ck0 tb = this.b;
                Iterator iterator = tb.entrySet().iterator();
             label_0021 :
                if (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   if (b.contains(uEntry.getValue())) {
                      hashSet.add(uEntry.getKey());
                      goto label_0021 ;
                   }else {
                      goto label_0021 ;
                   }
                }else {
                   b = tb.keySet().removeAll(hashSet);
                }
             }
             return b;
             break;
       }
       return super.removeAll(p0);
    }
    public final boolean retainAll(Collection p0){
       boolean b;
       switch (this.a){
           case 1:
             try{
                p0.getClass();
                b = super.retainAll(p0);
             }catch(java.lang.UnsupportedOperationException e0){
                HashSet hashSet = new HashSet();
                ck0 tb = this.b;
                Iterator iterator = tb.entrySet().iterator();
             label_0021 :
                if (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   if (b.contains(uEntry.getValue())) {
                      hashSet.add(uEntry.getKey());
                      goto label_0021 ;
                   }else {
                      goto label_0021 ;
                   }
                }else {
                   b = tb.keySet().retainAll(hashSet);
                }
             }
             return b;
             break;
       }
       return super.retainAll(p0);
    }
    public final int size(){
       ck0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.size();
       }
       return tb.size();
    }
}
