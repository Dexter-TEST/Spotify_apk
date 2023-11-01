package p.zj0;
import java.util.AbstractSet;
import p.dk0;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import p.io2;
import java.util.Iterator;
import p.yj0;
import java.util.Objects;
import p.w51;

public final class zj0 extends AbstractSet	// class@002f07 from classes.dex
{
    public final int a;
    public final dk0 b;

    public void zj0(dk0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void clear(){
       zj0 tb = this.b;
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
       Map map;
       boolean b;
       int i;
       zj0 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             return tb.containsKey(p0);
       }
       if ((map = tb.a()) != null) {
          b = map.entrySet().contains(p0);
       }else if(p0 instanceof Map$Entry && ((i = tb.b(p0.getKey())) != -1 && io2.j(tb.l(i), p0.getValue()))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public final Iterator iterator(){
       Map map;
       Iterator iterator;
       yj0 oyj0;
       zj0 tb = this.b;
       switch (this.a){
           case 0:
             iterator = ((map = tb.a()) != null)? map.entrySet().iterator(): new yj0(tb, 1);
             break;
           default:
             iterator = ((map = tb.a()) != null)? map.keySet().iterator(): new yj0(tb, 0);
             return iterator;
       }
       return iterator;
    }
    public final boolean remove(Object p0){
       Map map;
       int i1;
       boolean b = false;
       zj0 tb = this.b;
       switch (this.a){
           case 0:
             if ((map = tb.a()) != null) {
                b = map.entrySet().remove(p0);
             }else if(p0 instanceof Map$Entry && !tb.f()){
                int i = (1 << (tb.v & 0x1f)) - 1;
                dk0 a = tb.a;
                Objects.requireNonNull(a);
                if ((i1 = w51.M(p0.getKey(), p0.getValue(), i, a, tb.h(), tb.i(), tb.j())) != -1) {
                   tb.e(i1, i);
                   tb.w = tb.w - 1;
                   tb.v = tb.v + 32;
                   b = true;
                }
             }
             break;
           default:
             if ((map = tb.a()) != null) {
                b = map.keySet().remove(p0);
             }else if(tb.g(p0) != dk0.A){
                b = true;
             }
             return b;
       }
       return b;
    }
    public final int size(){
       zj0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.size();
       }
       return tb.size();
    }
}
